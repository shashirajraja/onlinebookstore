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
							artifactId: 'maven-dependency-plugin',
							 classifier: '',
							  file: 'target/webapp-runner.jar',
							   type: '.jar'
						]
					], 
					credentialsId: 'nexuscredential',
					groupId: 'onlinebookstore',
					nexusUrl: '54.226.124.96:8081',
					nexusVersion: 'nexus3',
					protocol: 'http',
					repository: 'demoapp-release',
					version: '0.0.1'
                    }
                   }
                    
                }
            }
            
            
                    
                
 }
}