pipeline{
    agent any
    stages {

    stage('build'){
    steps{
    echo "test1"
    sh 'ant -f build.xml -v'
    }
    }
    }
    post {
   	 always{
   		 archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
   	 }
    }
}
