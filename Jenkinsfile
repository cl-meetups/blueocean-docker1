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
    stage('ChatOps') {
      steps {
        hubotSend(room: 'jenkins', message: 'Terminei a Job', url: 'http://localhost:3001/')
        hubotApprove(room: 'jenkins', url: 'http://localhost:3001', message: 'Deseja confirmar?')
      }
    }
  }
}