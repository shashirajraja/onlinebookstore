package com.bittercode.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private Long phone;
    private String address;
    private List<UserRole> roles;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

//    public static User retrieveFromHttpServletRequest(HttpServletRequest req) {
//        User user = new User();
//        String pWord = req.getParameter(UsersDBConstants.COLUMN_PASSWORD);
//        String fName = req.getParameter(UsersDBConstants.COLUMN_FIRSTNAME);
//        String lName = req.getParameter(UsersDBConstants.COLUMN_LASTNAME);
//        String addr = req.getParameter(UsersDBConstants.COLUMN_ADDRESS);
//        String phNo = req.getParameter(UsersDBConstants.COLUMN_PHONE);
//        String mailId = req.getParameter(UsersDBConstants.COLUMN_MAILID);
//        user.setEmailId(mailId);
//        user.setFirstName(fName);
//        user.setLastName(lName);
//        user.setPassword(pWord);
//        user.setPhone(Long.parseLong(phNo));
//        user.setAddress(addr);
//        return user;
//    }
}
