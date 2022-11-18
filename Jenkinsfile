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
              	    }  
         	    }  
        	}

       	    stage("Build Image") { 
				when { 
					anyOf{
						branch "master"
						branch "feature/*"
					}
					
				}
				agent {
					label 'linux'
				}
           	    steps {  
					sh "docker build -t onlinebookstore .
              	    }  
         	    }  
        	}
	post {
       always { 
            cleanWs()
        }
	}
}
