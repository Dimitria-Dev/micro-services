pipeline {
    agent any
     tools {
             // Install the Maven version configured as "M3" and add it to the path.
             maven "M3"
         }

    stages {
        stage('Build') {
            steps {
                script {
                    sh 'cd advisor && mvn clean package'
                    sh 'cd student && mvn clean package'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'cd advisor && mvn test'
                    sh 'cd student && mvn test'
                }
            }
        }
    }
}