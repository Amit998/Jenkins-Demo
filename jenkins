pipeline{
    agent any
    tools{
        jdk 'JAVA_ADVANCE'
	maven 'MAVEN-HOME'
    }
	stages{
	    stage('version check') {
            steps {
                bat 'java -version'
		bat 'mvn -version'
        	}
        }
	stage('git clone') {
            steps {
                git 'https://git.nagarro.com/freshertraining2021/amitdutta.git'
        	}
        }
	stage('clean and install') {
            steps {
                bat 'mvn clean install -f springmvc/pom.xml'
        	}
        }
	
	stage('package') {
            steps {
                bat 'mvn package -f springmvc/pom.xml'
        	}
        }
	stage('Test Case') {
            steps {
                bat 'mvn test -f springmvc'
            }
        }

	stage('bug report') {
            steps {
                withSonarQubeEnv('SonarQubeSERVER'){
        		bat "mvn sonar:sonar -f springmvc/pom.xml"
        	    }
            }
        }
	
	
	stage ('Server'){
            steps {
               rtServer (
                 id: "Artifactory",
                 url: 'http://localhost:8082/artifactory',
                 username: 'admin',
                  password: 'Admin1234',
                  bypassProxy: true,
                   timeout: 300
                        )
            }
        }
        stage('Upload'){
            steps{
                rtUpload (
                 serverId:"artifactory-server" ,
                  spec: '''{
                   "files": [
                      {
                      "pattern": "*.war",
                      "target": "spring-mvc-test-libs-snapshot-local"
                      }
                            ]
                           }''',
                        )
            }
        }
        stage ('Publish build info') {
            steps {
                rtPublishBuildInfo (
                    serverId: "artifactory-server"
                )
            }
        }
		
    }
}






















