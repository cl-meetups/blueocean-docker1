pipeline {
  agent {
    docker {
      image 'maven:3.5-jdk-8-alpine'
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
    stage('') {
      steps {
        sh 'docker version'
      }
    }
  }
}