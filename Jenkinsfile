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
    stage('Parametros') {
      steps {
        sh '''echo 'Hello World!'
echo "Trying: ${params.door_choice}"
echo "We can dance: ${params.CAN_DANCE}"
echo "The DJ says: ${params.sTrAnGePaRaM}"'''
      }
    }
  }
  parameters {
    choice(name: 'door_choice', choices: '''one
two
three
four''', description: 'What door do you choose?')
    booleanParam(name: 'CAN_DANCE', defaultValue: true, description: 'Checkbox parameter')
    string(name: 'sTrAnGePaRaM', defaultValue: 'Dance!', description: 'Do the funky chicken!')
  }
}