#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}
  def cmmddd() {
    steps.sh "df -h"
    steps.sh "mvn -version"
    steps.sh "mvn -B -DskipTests clean package"
    def mvn(args) {
    steps.sh "${steps.tool 'jenkins-mvn'}/bin/mvn -o ${args}"
  }
    
  }
}
