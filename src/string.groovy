#!/usr/bin/env groovy

assert "hello world".contains("hello")
assert "hello world".startsWith("hello")
assert "hello world".endsWith("world")
assert "0123456789".indexOf("678") == 6
assert "0123456789".charAt(6) == "6"
assert "0123456789".length() == 10
assert "0123456789".substring(5) == "56789"
assert "0123456789".substring(5, 8) == "567"
assert "01234567890123456789".replace("0", "@") == "@123456789@123456789"
assert "01234567890123456789".replaceAll("0", "@") == "@123456789@123456789"
assert "  hatlonely  ".trim() == "hatlonely"

assert "0123456789"[6] == "6"
assert "0123456789"[6..8] == "678"
assert "0123456789"[2, 3, 7] == "237"
assert "0123456789"[1, 3..<6, 8] == "13458"
assert "0123456789" == "0123456789"
assert "0123456789".is("0123456789")
assert !""
assert !null
assert ![]
assert !0

assert "123456" as Integer == 123456
assert 123456 as String == "123456"
