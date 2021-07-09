pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
        error("Build failed because of this and that..")
            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {
            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn test'
                }
            }
        }

        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven_3_6_3') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}