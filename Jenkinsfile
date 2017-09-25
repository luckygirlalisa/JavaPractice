pipeline {
    environment {
        JAVA_HOME = '/Library/Java/JavaVirtualMachines/jdk1.8.0_74.jdk/Contents/Home'
        MVN_HOME='~/Documents/softwares/apache-maven-3.3.3/bin'
    }
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Running script in build stage.'
                sh 'printenv'
                sh 'echo $PATH'
                withEnv(['PATH = $MVN_HOME:$PATH']) {
                    sh 'mvn --version'
                }
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