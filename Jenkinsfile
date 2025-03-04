pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/M4skirosk4/Microservice1.git'
            }
        }

        stage('Build Backend') {
            steps {
                script {
                    // Construcción del backend Java (suponiendo Maven)
                    sh 'mvn clean install'
                }
            }
        }

        stage('Run Tests') {
                    steps {
                        script {
                            // Construcción del backend Java (suponiendo Maven)
                            sh 'mvn test'
                        }
                    }
                }
    }
    post {
        always {
            // Limpieza y acciones post-ejecución
            echo 'Proceso finalizado.'
        }
    }
}