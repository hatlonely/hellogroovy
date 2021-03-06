#!/usr/bin/env groovy

assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].contains(3)
assert 3 in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].indexOf(6) == 6
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].get(6) == 6
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9][6] == 6
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9][6, 8] == [6, 8]
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9][6..8] == [6, 7, 8]
assert [[2, 3],[4, 5, 6]].combinations() == [[2, 4], [3, 4], [2, 5], [3, 5], [2, 6], [3, 6]]
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].each { ++it } == [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
assert [0, 1, 2, 3, 4, 5, 6, 7, 8, 9].collect { ++it } == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

assert ["a": 1, "b": 2, "c": 3]["b"] == 2
assert "a" in ["a": 1, "b": 2, "c": 3]

["a": 1, "b": 2, "c": 3].each {
    println(it.key + " => " + it.value)
}

def items = [4, 5]
def list = [1, 2, 3, *items, 6]
assert list == [1, 2, 3, 4, 5, 6]

def m1 = [c: 3, d: 4]
def map = [a: 1, b: 2, *:m1]
assert map == [a: 1, b: 2, c: 3, d: 4]