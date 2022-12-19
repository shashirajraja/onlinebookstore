pipeline{
    
    agent any 
    
    stages {
        
        stage('Git Checkout'){
            
            steps{
                
                script{
                 git credentialsId: 'github', url: 'https://github.com/ANILPHUGARE1/onlinebookstore.git'   
                    
                }
            }
        }
        stage('UNIT testing'){
            
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
                    
                    sh 'mvn clean '
                }
            }
        }
        stage('Maven package'){
            
            steps{
                
                script{
                    
                    sh 'mvn clean package'
                }
            }
        }
        stage('Docker Image Build'){
            
            steps{
                
                script{
                    sh 'docker image build -t $JOB_NAME:v1.$BUILD_ID . '
                    sh 'docker image tag $JOB_NAME:v1.$BUILD_ID anilphugare1/$JOB_NAME:v1.$BUILD_ID'
                    sh 'docker image tag $JOB_NAME:v1.$BUILD_ID anilphugare1/$JOB_NAME:latest'
                }
            }
        }
    }
}
