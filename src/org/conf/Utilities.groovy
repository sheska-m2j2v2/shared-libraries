package org.foo
class Utilities {
  static def gbuild(script, args) {
    script.sh "${script.tool 'gradle27'}/bin/gradle ${args}"
  }
}
