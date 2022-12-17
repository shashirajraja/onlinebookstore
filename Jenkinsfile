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
    }
}
