pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Running script in build stage.'
                sh 'echo $PATH'
                sh '/Users/zfxiao/Documents/softwares/apache-maven-3.3.3/bin/mvn --version'
            }
        }
        stage('Functional Test') {
            steps {
                echo 'Another stage: different level of test'
                sh 'whoami'
                sh 'pwd'
            }
        }
    }
}