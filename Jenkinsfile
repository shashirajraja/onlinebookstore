pipeline {  
	agent {
		label "jenkins-slave"
		} 

        stages {  
			container('maven') { 
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
}
