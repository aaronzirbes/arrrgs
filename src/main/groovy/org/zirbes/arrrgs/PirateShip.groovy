package org.zirbes.arrrgs

class PirateShip {

    static void main(String[] argv) {
        println "Arrrrg, I found the following arrrgs!"
        argv.each{ arg ->
            println " * ${arg}"
        }
        println "Shiver me timbers, that'll be all."
    }
}
