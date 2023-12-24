pipeline {  
    agent any  
        stages {  
       	    stage("git_checkout") {  
           	    steps {  
              	    echo "cloning repository" 
              	    echo "repo cloned successfully"  
              	    }  
         	    } 
             stage('Build stage') {
            steps {
                echo 'This is a build stage'
			
			}
		}
        stage('Push stage') {
            steps {
                echo 'This is push stage'
              
			}
		}
        stage('Deploy stage') {
            steps {
                echo 'This is deploy stage'
             
        }
}
        }
}
