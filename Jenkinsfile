pipeline {
  agent {
    kubernetes {
      yaml '''
        apiVersion: v1
        kind: Pod
        metadata:
          labels:
            agent: maven-agent
        spec:
          containers:
          - name: maven
            image: maven:alpine
            command:
            - cat
            tty: true
          - name: busybox
            image: busybox
            command:
            - cat
            tty: true
        '''
    }
  }
  stages {

    stage('Maven Build') {
      steps {
        container('maven') {
          sh 'mvn clean install'
        }
      }
    }

    stage('Maven Test') {
      steps {
        container('maven') {
          sh 'mvn clean test'
        }
      }
    }

  }
}