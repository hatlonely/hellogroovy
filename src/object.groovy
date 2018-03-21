#!/usr/bin/env groovy

class Person {

    String name
    Integer age

    Person(String name, Integer age) {
        this.name = name
        this.age = age
    }

    def increaseAge(Integer years) {
        this.age += years
    }
}

person = new Person("hatlonely", 26)
person.age = 26
person.increaseAge(4)
println(person.name + " "+ person.age)

interface Named {
    String name()
}
trait Greetable implements Named {
    String greeting() { "Hello, ${name()}!" }
}
class Person2 implements Greetable {
    String name() { 'Bob' }
}

def p = new Person2()
assert p.greeting() == 'Hello, Bob!'
assert p instanceof Named
assert p instanceof Greetable