#!/usr/bin/groovy
import scr.Shell.*
def call(){

sh '''
  echo "integrated sonarQube"
   '''
    def h= new Shell(this)
  withSonarQubeEnv('sonarqube'){
                 h.mvn 'sonar:sonar'
                echo " sonarqube1 "
               }
  withSonarQubeEnv('sonarqube'){
                waitForQualityGate abortPipeline: true
                echo " quality gate pass response"
             }
  
   
}
