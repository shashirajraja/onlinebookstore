pipeline {  
	agent {
		label "jenkins-slave"
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
					echo "welcome"
              	    }  
         	}
        	
	}
}
