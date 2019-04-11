#!/usr/bin/groovy

class Shell implements Serializable {
  def steps
  Shell(steps) {this.steps = steps}
  def cmmddd() {
    steps.sh "maven -version"
  }
}
