pipeline{
    agent any
    stages{
        stage('clean'){
            steps{
                bat 'gradlew clean'
            }
        }
        stage('Debug'){
            steps{
                bat 'gradlew assembleDebug'
            }
        }
    }
}