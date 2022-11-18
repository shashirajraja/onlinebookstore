pipeline {  
    agent none  
        stages {  
       	    stage("build") {  
				when { 
					branch "feature/*"
					}
           	    steps {  
					sh "mvn clean build"
              	    }  
         	    }
       	    stage("test") {  
				when { 
					branch "feature/*"
					}
           	    steps {  
					sh "mvn test"
              	    }  
         	    }  
        }
}
