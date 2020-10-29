pipeline {
	agent {
		docker {
			image 'maven:3.6.3-openjdk-11'
			alwaysPull true
			args env.DOCKER_ARGS
		}
	}

	environment {
		KEYSTORE = credentials('geco-repo-key')
		UPDATE_SITE_URL = "sftp://repo@repo.se.internal/var/www/html/geco"
	}

	stages {
		stage('Cleanup') {
			steps {
				sh 'git clean -xffd -e "ws-repo/**"'
			}
		}
		stage('Build') {
			steps {
				sh 'mvn --batch-mode -Dmaven.repo.local=/opt/project/maven compile'
			}
		}
		stage('Test') {
			steps {
				sh 'mvn --batch-mode -Dmaven.repo.local=/opt/project/maven test'
			}
		}
		stage('Check') {
			steps {
				sh 'mvn --batch-mode -Dmaven.repo.local=/opt/project/maven package checkstyle:checkstyle -Dworkspace=' + env.WORKSPACE // pmd:pmd spotbugs:spotbugs
			}
			post {
				always {
					recordIssues enabledForFailure: true, tools: [mavenConsole(), java(), javaDoc()]
					recordIssues enabledForFailure: true, tool: checkStyle()
//					recordIssues enabledForFailure: true, tool: spotBugs()
//					recordIssues enabledForFailure: true, tool: pmdParser()
				}
			}
		}
		stage('Update Repository') {
			when {
				branch 'master'
			}
			steps {
				sh 'mvn --settings settings.xml --batch-mode -Dmaven.repo.local=/opt/project/maven -Dkeystore=${KEYSTORE} package'
			}
		}
	}
}
