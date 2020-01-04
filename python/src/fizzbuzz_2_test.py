from src.fizzbuzz import FizzBuzz

def test_6_returns_Fizz():
    assert FizzBuzz().convert(6) == "Fizz"

def test_10_returns_Buzz():
    assert FizzBuzz().convert(10) == "Buzz"

def test_15_returns_Fizz():
    assert FizzBuzz().convert(15) == "FizzBuzz"

def test_30_returns_Buzz():
    assert FizzBuzz().convert(30) == "FizzBuzz"