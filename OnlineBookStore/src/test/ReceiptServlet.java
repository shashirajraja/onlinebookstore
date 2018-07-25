package test;
import test.DBConnection;
import java.sql.*;
import java.io.*;
import javax.servlet.*;
public class ReceiptServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("select * from book6");
		ResultSet rs = ps.executeQuery();
		int i=0;
		RequestDispatcher rd = req.getRequestDispatcher("ViewBooks.html");
		rd.include(req, res);
		pw.println("<div class=\"tab\">You Successfully Paid for Following Books</div>");
		pw.println("<div class=\"tab\">\r\n" + 
				"		<table>\r\n" + 
				"			<tr>\r\n" + 
				"				\r\n" + 
				"				<th>Book Code</th>\r\n" + 
				"				<th>Book Name</th>\r\n" + 
				"				<th>Book Author</th>\r\n" + 
				"				<th>Book Price</th>\r\n" + 
				"				<th>Quantity</th><br/>\r\n" + 
				"			</tr>");
		double total=0.0;
		while(rs.next())
		{
			int bPrice =rs.getInt("bprice");
			String bCode=rs.getString("bcode");
			String bName = rs.getString("bname");
			String bAuthor = rs.getString("bauthor");
			int bQty = rs.getInt("bqty");
			i=i+1;
			
			String qt = "qty"+Integer.toString(i);
			int quantity = Integer.parseInt(req.getParameter(qt));
			try {
			String check1 = "checked"+Integer.toString(i);
			String getChecked = req.getParameter(check1);
			if(bQty<quantity)
			{
				pw.println("</table><div class=\"tab\">Please Select the Qty less than Available Books Quantity</div>");
				break;
			}

			if(getChecked.equals("pay"))
			{
				pw.println("<tr><td>"+bCode+"</td>");
				pw.println("<td>"+bName+"</td>");
				pw.println("<td>"+bAuthor+"</td>");
				pw.println("<td>"+bPrice+"</td>");
				pw.println("<td>"+quantity+"</td></tr>");
				total = total + bPrice * quantity;
				bQty = bQty - quantity;
				PreparedStatement ps1 = con.prepareStatement("update book6 set bqty=? where bcode=?");
				ps1.setInt(1, bQty);
				ps1.setString(2,bCode);
				ps1.executeQuery();
			}
			}catch(Exception e) {}
		}
		pw.println("</table><br/><div class='tab'>Total Paid Amount: "+total+"</div>");
		String fPay = req.getParameter("f_pay");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
