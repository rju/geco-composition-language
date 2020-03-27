pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn --version'
				sh 'mvn compile'
			}           
		}
		stage('Test') {
			steps {
				sh 'mvn test'
			}
		}
		stage('Update Repository') {
			steps {
				sh 'mvn package'
			}
		}
	}
}
