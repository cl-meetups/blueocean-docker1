pipeline {
  agent {
    dockerfile {
      filename 'Dockerfile'
    }  
  }
  parameters {
    choice(name: 'door_choice',
      choices: 'one\ntwo\nthree\nfour',
      description: 'What door do you choose?')
    booleanParam(name: 'CAN_DANCE',
      defaultValue: true,
      description: 'Checkbox parameter')
    string(name: 'sTrAnGePaRaM',
      defaultValue: 'Dance!',
      description: 'Do the funky chicken!')
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
