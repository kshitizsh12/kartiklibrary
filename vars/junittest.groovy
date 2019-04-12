#!/usr/bin/groovy


def call() {
 def h= new Shell(this)
 sh '''
     h.mvn 'test'
    '''
 junit 'target/surefire-reports/*.xml'
   
}
