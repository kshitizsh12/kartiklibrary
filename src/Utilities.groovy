#!/usr/bin/groovy

class Utilities implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "${steps.tool 'jenkins-mvn'}/bin/mvn -o ${args}"
  }
}
