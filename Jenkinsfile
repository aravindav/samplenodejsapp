pipeline {
    agent any

    environment {
        TF_VAR_region = 'us-east-1'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/aravindav/samplenodejsapp.git'
            }
        }

        stage('Terraform Init') {
            steps {
                sh 'terraform init'
            }
        }

        stage('Terraform Plan') {
            steps {
                sh 'terraform plan'
            }
        }

        stage('Terraform Apply') {
            steps {
                input "Approve deployment?"
                sh 'terraform apply -auto-approve'
            }
        }
    }
}
