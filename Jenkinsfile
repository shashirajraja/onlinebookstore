pipeline {  
	agent {
		label "jenkins-agent"
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