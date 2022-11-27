pipeline {  
	agent {
		label "jenkins-slave"
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