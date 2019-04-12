#!/usr/bin/groovy

import scr.Shell.*

def call(){
    def h= new Shell(this)
    h.mvn 'clean'
    
 }
