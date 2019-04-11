#!/usr/bin/groovy

class Batt implements Serializable {
  def steps
  Batt(steps) {this.steps = steps}
  def cmmddd() {
    steps.bat "java -version"
    
  }
}
