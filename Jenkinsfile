pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    sh 'cd advisor && ./mvnw clean package'
                    sh 'cd student && ./mvnw clean package'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'cd advisor && ./mvnw test'
                    sh 'cd student && ./mvnw test'
                }
            }
        }

    }
}