pipeline {  
    agent none  
        stages {  
       	    stage("build") {  
				when { 
					branch: "feature/\\d+",
					}
           	    steps {  
					sh "mvn clean build"
              	    }  
         	    }
       	    stage("test") {  
				when { 
					branch: "feature/\\d+",
					}
           	    steps {  
					sh "mvn test"
              	    }  
         	    }  
        }
}
