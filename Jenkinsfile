// Jenkins Pipeline for Online Bookstore Deployment
// This pipeline builds, packages, and deploys the Java bookstore application to Tomcat

pipeline {
    agent { label 'ubuntu' }
    
    environment {
        // Set Maven heap memory limit for build optimization
        MAVEN_OPTS = '-Xmx1024m'
        // TOMCAT_HOME can be updated if Tomcat is installed in a different location
        TOMCAT_HOME = '/opt/tomcat8'
        TOMCAT_WEBAPPS = "${TOMCAT_HOME}/webapps"
    }
    
    stages {
        // Stage 1: Clone repository from version control
        stage('Checkout') {
            steps {
                echo '========== Checking out source code =========='
                checkout scm
            }
        }
        
        // Stage 2: Build project using Maven
        stage('Build') {
            steps {
                echo '========== Building project with Maven =========='
                sh 'mvn -B clean package'
                script {
                    // Read artifact finalName from pom.xml so WAR name is always correct
                    env.ARTIFACT_NAME = sh(script: 'mvn -B -q -DforceStdout help:evaluate -Dexpression=project.build.finalName', returnStdout: true).trim()
                    env.WAR_FILE = "${env.ARTIFACT_NAME}.war"
                }
            }
        }
        
        // Stage 3: Prepare WAR artifact for deployment
        stage('Prepare Artifact') {
            steps {
                echo '========== Preparing deployment artifacts =========='
                sh '''
                    mkdir -p output
                    # Copy WAR file from Maven target directory (named according to pom.xml finalName)
                    if [ -f target/${WAR_FILE} ]; then
                        cp target/${WAR_FILE} output/${WAR_FILE}
                        echo "Successfully prepared ${WAR_FILE}"
                        ls -lh output/
                    else
                        echo "ERROR: WAR file not found at target/${WAR_FILE}"
                        exit 1
                    fi
                '''
            }
        }
        
        // Stage 4: Deploy WAR to Tomcat application server
        stage('Deploy to Tomcat') {
            steps {
                echo '========== Deploying to Tomcat =========='
                sh '''
                    # Verify Tomcat installation
                    if [ ! -d ${TOMCAT_HOME}/bin ]; then
                        echo "ERROR: Tomcat not found at ${TOMCAT_HOME}"
                        exit 1
                    fi
                    
                    # Check if sudo is available (for privilege escalation if needed)
                    if command -v sudo >/dev/null 2>&1; then
                        echo "Using sudo for Tomcat operations"
                        # Gracefully stop Tomcat
                        sudo ${TOMCAT_HOME}/bin/shutdown.sh || true
                        sleep 2
                        
                        # Remove old deployments
                        sudo rm -f ${TOMCAT_WEBAPPS}/*.war
                        sudo rm -rf ${TOMCAT_WEBAPPS}/${ARTIFACT_NAME}
                        
                        # Deploy new WAR file
                        sudo cp output/${WAR_FILE} ${TOMCAT_WEBAPPS}/
                        echo "Deployed ${WAR_FILE} to ${TOMCAT_WEBAPPS}"
                        
                        # Start Tomcat
                        sudo ${TOMCAT_HOME}/bin/startup.sh
                        sleep 3
                        echo "Tomcat started successfully"
                    else
                        echo "Running without sudo"
                        # Stop Tomcat (no sudo required)
                        ${TOMCAT_HOME}/bin/shutdown.sh || true
                        sleep 2
                        
                        # Remove old deployments
                        rm -f ${TOMCAT_WEBAPPS}/*.war
                        rm -rf ${TOMCAT_WEBAPPS}/${ARTIFACT_NAME}
                        
                        # Deploy new WAR file
                        cp output/${WAR_FILE} ${TOMCAT_WEBAPPS}/
                        echo "Deployed ${WAR_FILE} to ${TOMCAT_WEBAPPS}"
                        
                        # Start Tomcat
                        ${TOMCAT_HOME}/bin/startup.sh
                        sleep 3
                        echo "Tomcat started successfully"
                    fi
                '''
            }
        }
    }
    
    // Post-build actions
    post {
        // Archive WAR file regardless of build status
        always {
            echo '========== Archiving artifacts =========='
            archiveArtifacts artifacts: 'output/*.war', fingerprint: true, allowEmptyArchive: false
        }
        
        // Success notification
        success {
            echo '========== Deployment successful =========='
            echo "Application available at: http://localhost:8080/${ARTIFACT_NAME}"
        }
        
        // Failure notification
        failure {
            echo '========== Deployment failed =========='
            echo 'Please check the logs above for details'
        }
    }
}
