pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    credentialsId: 'github_token',
                    url: 'https://github.com/sanggyunbak2856/spring-petclinic.git'
            }
        }
    }
}
