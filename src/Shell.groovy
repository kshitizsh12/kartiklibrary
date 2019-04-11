#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}
  def cmmddd() {
    steps.sh "df -h"
    steps.sh "mvn -version"
    steps.sh "mvn clean package"
    
  }
}
