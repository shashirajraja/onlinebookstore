
pipeline {
   
    agent any
   
    stages{
        stage('checkout-->clone'){
            steps{
                git branch: 'feature-2026.02.09', url: 'https://github.com/github-siva/onlinebookstore.git'
            }
        }
       
        stage('Build'){
            steps{
            bat 'mvn install'
        }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
       
        stage('Generated the Artifacts'){
            steps{
                archiveArtifacts artifacts: 'target/*.war', followSymlinks: false
            }
        }
         stage('deploy'){
            steps{
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'tomcat_credentials', path: '', url: 'http://localhost:8080/')], contextPath: 'tomcat_integrating- book store_pipeline', war: 'target/*.war'
            }
        }
    }
}
 
