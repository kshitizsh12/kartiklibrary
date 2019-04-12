#!/usr/bin/groovy

import scr.Shell.*

def call() {
 def h= new Shell(this)
 sh '''
     h.mvn 'test'
    '''
 junit 'target/surefire-reports/*.xml'
   
}
