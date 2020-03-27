pipeline {
	agent any

	environment {
		KEYSTORE = credentials('geco-repo-key')
	}
	
	stages {
		stage('Build') {
			steps {
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
				sh 'mvn -Dkeystore=$KEYSTORE package'
			}
		}
	}
}
