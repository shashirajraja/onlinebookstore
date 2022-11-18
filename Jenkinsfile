pipeline {  
    agent none  

	options {
		disableConcurrentBuilds()
		disableResume()
		timestamps()
		parallelsAlwaysFailFast()
	}
        stages {  
       	    stage("build") { 
			agent {
					docker {
						label 'linux'
						image 'maven'
					} 
				} 
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
				agent {
					docker {
						label 'linux'
						image 'maven'
					} 
				}  
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
		cleanup()
	}
}
