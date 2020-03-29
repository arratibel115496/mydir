pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
		sh 'mvn compile'
                sh 'mvn test'
		sh 'mvn validate'
		sh 'mvn verify'
            }       
        }
        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
