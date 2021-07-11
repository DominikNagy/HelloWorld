pipeline {
    agent any

    stages {
        stage ('Clean package Stage') {
            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn clean package'
                }
            }
        }
//         stage ('Kill process on 7000 Stage') {
//             steps {
//                 sh 'kill -9 $(lsof -t -i:7000)'
//             }
//         }
        stage ('Run new version Stage') {
            steps {
                sh 'tmux new -s test'
                sh 'java -jar Documents/Dev/HelloWorld/target/helloWorld-*-shaded.jar'
            }
        }
    }
}