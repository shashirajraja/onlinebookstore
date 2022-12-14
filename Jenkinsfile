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

}
}