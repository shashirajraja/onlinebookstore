pipeline {  
    agent any
        parameters {
            choice choices: ['master', 'dev', 'qa'], description: 'select environment', name: 'branchname'
        }
        stages {  
       	    stage("git_checkout") {  
           	    steps {  
                    git branch: "${params.branchname}", url: 'https://github.com/Saksham-UnrealCreations/bookstore.git'
              	    echo "cloning repository to jenkins" 
              	    echo "repo cloned successfully"  
              	    }
         	    }
        }       
}
