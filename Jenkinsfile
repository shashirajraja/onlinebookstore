pipeline {  
    agent none  
        stages {  
       	    stage("build") {  
				when { 
					branch pattern: "feature/\\d+",
					comparator: "REGEXP"
					}
           	    steps {  
					sh "mvn clean build"
              	    }  
         	    }
       	    stage("test") {  
				when { 
					branch pattern: "feature/\\d+",
					comparator: "REGEXP"
					}
           	    steps {  
					sh "mvn test"
              	    }  
         	    }  
        }
}
