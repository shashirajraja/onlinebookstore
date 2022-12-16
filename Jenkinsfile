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
		stage('Uploader War/Jar in Nexus '){
            
            steps{
                
                script{
                  nexusArtifactUploader artifacts: 
				[
					[
						artifactId: 'onlinebookstore', 
						classifier: '', file: 'target/onlinebookstore.war', 
						type: 'war'
					]
				], 
				credentialsId: 'Nexus_Credential', 
				groupId: 'onlinebookstore', 
				nexusUrl: '18.208.224.9:8081', 
				nexusVersion: 'nexus3', 
				protocol: 'http', 
				repository: 'demoapp-release', 
				version: '${readPomVersion.version}'  
					
                    }
                   
			 }
                    
                
        }
		stage("Docker Image Build"){
			steps{
				script{
			
				sh "docker image build -t $JOB_NAME:V1.$BUILD_ID"
				sh "docker image tag $JOB_NAME:V1.$BUILD_ID anilphugare1/$JOB_NAME:V1.$BUILD_ID"
				sh "docker image tag $JOB_NAME:V1.$BUILD_ID anilphugare1/$JOB_NAME:V1.$latest"
				}
			}
		}
			
			
	
			
		
		
            
            
                    
                
}
}