pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Running script in build stage.'
                echo $PATH
            }
        }
        stage('Functional Test') {
            steps {
                echo 'Another stage: different level of test'
            }
        }
    }
}