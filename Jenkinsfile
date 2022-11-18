pipeline {  
    agent none  
        stages {  
       	    stage("build") {  
				when { 
					branch "feature/.*"
					}
           	    steps {  
					sh "mvn clean build"
              	    }  
         	    }
       	    stage("test") {
				agent {
					docker {
						label 'linux'
						image 'maven:3-amazoncorretto-19'
					} 
				}  
				when { 
					branch "feature/*"
					}
           	    steps {  
					sh "mvn test"
              	    }  
         	    }  
        }
}
