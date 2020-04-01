pipeline {
	agent {label 'master'}
	stages {
		stage('Arduino') {
			steps {
				echo 'Vamos a compilar Arduino'
				dir('PracticaArduino/ArduinoProject') {
					sh 'make -f Makefile-Linux.mk' 
					}
		            	}
		}
		stage('Android') {
			steps {
				echo 'Vamos a compilar Android'
				dir('PracticaAndroid') {
					sh './gradlew tasks'
					sh './gradlew check'
				}
			}
		}
		stage('Maven') {
			steps {
			echo 'Vamos a compilar Simple maven'
			dir('simple') {
				sh 'mvn verify'
				sh 'mvn site'
				}
			}
		}
	}
}
