#!/usr/bin/env groovy

def add = { a,b -> a+b }
assert add(1, 2) == 3
assert add("a", "b") == "ab"

def greeting = {"hello $it"}
assert greeting("world") == "hello world"

def ncopies = {int n, String str -> str*n}
def twice = ncopies.curry(2)    // curry 参数绑定
assert twice("bla") == ncopies(2, "bla")

// memorize 结果缓存
fib = { long n -> n < 2 ? n : fib(n-1)+fib(n-2) }.memoize()
assert fib(15) == 610

// 组合
def plus2  = { it + 2 }
def times3 = { it * 3 }
def times3plus2 = plus2 << times3
assert times3plus2(3) == 11
assert times3plus2(4) == plus2(times3(4))