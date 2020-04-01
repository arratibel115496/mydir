pipeline {
	agent {label 'master'}
    stages {
        stage('Build') {
            steps {
		echo 'Vamos a compilar Arduino'
		dir('PracticaArduino/Arduino') {
			sh 'make -f Makefile-Linux.mk' 
		}
		echo 'Vamos a compilar Simple maven'
		dir('simple') {
			sh 'mvn verify'
			sh 'mvn site'
		}
		echo 'Vamos a compilar Android'
		dir('PracticaAndroid') {
			sh './gradlew tasks'
			sh './gradlew check'
		}
            }
        }
    }
}
