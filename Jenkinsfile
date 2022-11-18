pipeline {  
	agent {
			docker {
				label 'linux'
				image 'maven'
			} 
		} 

	options {
		disableConcurrentBuilds()
		disableResume()
		timestamps()
		parallelsAlwaysFailFast()
	}
        stages {  
       	    stage("build") { 

				when { 
					anyOf{
						branch "feature/*"
						branch "master"
					}
					
				}
           	    steps {  
					sh "mvn clean install"
              	    }  
         	    }
       	    stage("test") { 
				when { 
					anyOf{
						branch "feature/*"
						branch "master"
					}
					
				}
           	    steps {  
					sh "mvn test"
					junit 'arget/test-reports/*.xml'
              	    }  
         	    }  
        }
	post {
       always { 
            cleanWs()
        }
	}
}
