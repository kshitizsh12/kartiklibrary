#!/usr/bin/groovy

def call(String buildResult){
 if ( buildResult == "SUCCESS" ) {
  mail to: '',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
    
  }
  else if( buildResult == "FAILURE" ) { 
    mail to: '',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
  }
  else if( buildResult == "UNSTABLE" ) { 
   mail to: 'devops@acme.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
    
  }
  else {
    mail to: '',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input",
    body: "Please go to ${BUILD_URL} and verify the build"
  }

}
