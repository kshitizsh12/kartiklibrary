#!/usr/bin/groovy

def call(){

sh '''
  echo "integrated sonarQube"
   '''
  withSonarQubeEnv('sonarqube'){
                 sh 'mvn sonar:sonar' 
                echo " sonarqube1 "
                waitForQualityGate abortPipeline: true
              
             }
  
   
}
