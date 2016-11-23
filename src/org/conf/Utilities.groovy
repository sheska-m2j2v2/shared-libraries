package org.foo
class Utilities {
  static def gbuild(script, args) {
    script.sh "${script.tool 'gradle32'}/bin/gradle ${args}"
  }
}
