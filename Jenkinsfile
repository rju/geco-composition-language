pipeline {
	agent any
	
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
           stage {
               sh 'mvn package'
           }
        }
    }
}