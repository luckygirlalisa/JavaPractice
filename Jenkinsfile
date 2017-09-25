pipeline {
    node {
        echo "hello jenkinsfile"
    }

    agent {  }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}