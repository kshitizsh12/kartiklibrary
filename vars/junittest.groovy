#!/usr/bin/groovy


def call() {
 sh '''
     echo "testing junit plugin"
     mvn test
     '''
 junit 'target/surefire-reports/*.xml'
   
}
