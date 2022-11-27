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
          - name: kaniko
            image: gcr.io/kaniko-project/executor:debug
            workingDir: /home/jenkins/agent
            command:
            - sleep
            args:
            - 99999
            volumeMounts:
            - name: docker-secret
              mountPath: /kaniko/.docker
          volumes:
          - name: docker-secret
            secret:
              secretName: docker-secret
        '''
    }
  }
  stages {

    stage('Maven Build') {
		when {
			anyOf {
				branch 'master'
				branch 'feature/*'
			}
		}
		steps {
		container('maven') {
			sh 'mvn clean install'
			}
		}
		}

    stage('Maven Test') {
		when {
			anyOf {
				branch 'master'
				branch 'feature/*'
			}
		}
		steps {
		container('maven') {
			sh 'mvn clean test'
			}
		}
    }

    stage('Docker Build') {
		when {
			anyOf {
				branch 'master'
			}
		}
		steps {
		container(name :'kaniko', shell: '/busybox/sh' ) {
			sh '''
				#!/busybox/sh
				/kaniko/executor  --destination mohamedhani/onlinebookstore  

				'''
			}
		}
    }

  }
}