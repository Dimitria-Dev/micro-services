pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    sh 'cd advisor'
                    sh 'cd student'
                }
            }
        }
//         stage('Test') {
//             steps {
//                 script {
//                     sh 'cd advisor && ./mvnw test'
//                     sh 'cd student && ./mvnw test'
//                 }
//             }
//         }
    }
}