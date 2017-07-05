#!/usr/bin/groovy
#/src/nl/flusso/Utilities.groovy
package nl.flusso

import java.io.Serializable

class Utilities implements Serializable {
  def steps

  Utilities(steps) {this.steps = steps}

  def sayHello(String name) {
    steps.sh "echo $name"
  }
}
