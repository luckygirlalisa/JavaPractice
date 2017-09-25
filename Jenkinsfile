pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Running script in build stage.'
                sh 'echo $PATH'
            }
        }
        stage('Functional Test') {
            steps {
                echo 'Another stage: different level of test'
                sh 'which mvn'
                sh 'whoami'
                sh 'pwd'
            }
        }
    }
}