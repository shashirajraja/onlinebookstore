pipeline {  
    agent any  
        stages {  
       	    stage("git_checkout") {  
           	    steps {  
              	    git 'https://github.com/ANILPHUGARE1/onlinebookstore.git'  
              	    }  
         	    } 
        
		stage('UNIT testing') {
            
        	steps{
                
                script{
                    
                    sh 'mvn test'
                }
            }
        }
		stage('Integration testing'){
            
            steps{
                
                script{
                    
                    sh 'mvn verify -DskipUnitTests'
                }
            }
        }
		stage('Maven build'){
            
            steps{
                
                script{
                    
                    sh 'mvn clean install'
                }
            }
        }
		
		stage("Docker Image Build"){
			agent any
			steps{
							
				script{
					sh 'docker image build -t $JOB_NAME:v1.$BUILD_ID .'
					
	
				}		
			}
		}
		
			
	                
}
}
