package main

import (
    "testing"
)

func TestFizzBuzz_5(t *testing.T) {
    ans := fizzbuzz(5)
    if ans != "Buzz" {
        t.Errorf("fizzbuzz(5) = %s; want 'Buzz'", ans)
    }
}

func TestFizzBuzz_6(t *testing.T) {
    ans := fizzbuzz(6)
    if ans != "Fizz" {
        t.Errorf("fizzbuzz(6) = %s; want 'Fizz'", ans)
    }
}

func TestFizzBuzz_10(t *testing.T) {
    ans := fizzbuzz(10)
    if ans != "Buzz" {
        t.Errorf("fizzbuzz(10) = %s; want 'Buzz'", ans)
    }
}

func TestFizzBuzz_15(t *testing.T) {
    ans := fizzbuzz(15)
    if ans != "FizzBuzz" {
        t.Errorf("fizzbuzz(15) = %s; want 'FizzBuzz'", ans)
    }
}

func TestFizzBuzz_1(t *testing.T) {
    ans := fizzbuzz(1)
    if ans != "1" {
        t.Errorf("fizzbuzz(1) = %s; want '1'", ans)
    }
}