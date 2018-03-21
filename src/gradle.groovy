#!/usr/bin/env groovy

class Dependency {
    void testCompile(Map map) {
        println("download dependency: " + map)
    }

    void compile(Map map) {
        println("download dependency: " + map)
    }
}

def dependencies(Closure cl) {
    def dependency = new Dependency()
    def code = cl.rehydrate(dependency, this, this)
    code()
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.11'
    compile group: 'com.fasterxml.jackson.core', name: 'jackson-core', version: '2.9.4'
    compile group: 'com.fasterxml.jackson.core', name: 'jackson-databind', version: '2.9.4'
    compile group: 'com.fasterxml.jackson.core', name: 'jackson-annotations', version: '2.9.4'
}