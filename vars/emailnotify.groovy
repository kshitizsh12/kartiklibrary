#!/usr/bin/groovy

def call(String buildResult){
 if ( buildResult == "SUCCESS" ) {
  mail to: 'sharma.kshitiz12@gmail.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
    
  }
  else if( buildResult == "FAILURE" ) { 
    mail to: 'sharma.kshitiz12@gmail.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
  }
  else if( buildResult == "UNSTABLE" ) { 
   mail to: 'sharma.kshitiz12@gmail.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
    
  }
  else {
    mail to: 'sharma.kshitiz12@gmail.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
  }

}
