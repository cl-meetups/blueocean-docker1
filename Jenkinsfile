pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
    }
    
  }
  stages {
    stage('Preparacao') {
      steps {
        sh 'mvn -version'
      }
    }
    stage('Compilar') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Chat') {
      steps {
        hubotSend(room: 'Jenkins', message: 'Terminei a Job', url: 'http://localhost:3001/')
      }
    }
  }
}