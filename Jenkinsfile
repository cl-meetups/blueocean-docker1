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
  }
}