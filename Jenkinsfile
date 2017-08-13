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
  }
}