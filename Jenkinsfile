pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                dir('microservice1'){
                git branch: 'main', url: 'https://github.com/M4skirosk4/Microservice1.git'

                }

            }
        }
        stage('Build') {
                steps {
                    script {
                         echo 'Building the project...'
                        sh 'mvn clean package -DskipTests=true -f pom.xml'
                            }
                        }
                }
        stage('Resolve Dependencies') {
            steps {
                script {
                    echo 'Resolving dependencies...'
                    sh 'mvn dependency:resolve'
                }
            }
        }
        stage('Test') {
                steps {
                    script {
                        echo 'Running tests...'
                        sh 'mvn test -e'
                            }
                    }
                }
        }
}
