import pytest 
from src.fizzbuzz import FizzBuzz

def test_2_returns_1():
    assert FizzBuzz().convert(1) == "1"

def test_2_returns_2():
    assert FizzBuzz().convert(2) == "2"

def test_3_returns_Fizz():
    assert FizzBuzz().convert(3) == "Fizz"

def test_5_returns_Buzz():
    assert FizzBuzz().convert(5) == "Buzz"

def test_6_returns_Fizz():
    assert FizzBuzz().convert(6) == "Fizz"

def test_10_returns_Buzz():
    assert FizzBuzz().convert(10) == "Buzz"

def test_15_returns_Fizz():
    assert FizzBuzz().convert(15) == "FizzBuzz"

def test_30_returns_Buzz():
    assert FizzBuzz().convert(30) == "FizzBuzz"