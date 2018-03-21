#!/usr/bin/env groovy

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()
def object = jsonSlurper.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')
assert object instanceof Map
assert object.myList instanceof List
assert object.myList == [4, 8, 15, 16, 23, 42]

def json = JsonOutput.toJson([name: 'John Doe', age: 42])
assert json == '{"name":"John Doe","age":42}'

println(JsonOutput.prettyPrint(json))