#!/usr/bin/groovy


def call() {
 sh '''
     echo "testing junit plugin"
     '''
 junit 'target/surefire-reports/*.xml'
    

}
