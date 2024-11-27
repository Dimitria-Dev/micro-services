pipeline {
    agent any

    stages {
        stage('Checkout') {
            checkout scm
        }
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