pipeline {
  agent {
    node {
      label 'agent1'
    }

  }
  stages {
    stage('git_checkout') {
      steps {
        git(url: 'https://github.com/jayaprakashdeav/onlinebookstore.git', branch: 'J2EE')
      }
    }

    stage('build') {
      steps {
        sh '''export JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64"
echo $JAVA_HOME
/usr/bin/mvn clean package'''
      }
    }

  }
}