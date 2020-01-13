package main

import (
    "testing"
)

func TestFizzBuzz_1(t *testing.T) {
    ans := fizzbuzz(1)
    if ans != "1" {
        t.Errorf("fizzbuzz(1) = %s; want '1'", ans)
    }
}

func TestFizzBuzz_2(t *testing.T) {
    ans := fizzbuzz(2)
    if ans != "2" {
        t.Errorf("fizzbuzz(2) = %s; want '2'", ans)
    }
}

func TestFizzBuzz_3(t *testing.T) {
    ans := fizzbuzz(3)
    if ans != "Fizz" {
        t.Errorf("fizzbuzz(3) = %s; want 'Fizz'", ans)
    }
}

func TestFizzBuzz_4(t *testing.T) {
    ans := fizzbuzz(4)
    if ans != "4" {
        t.Errorf("fizzbuzz(4) = %s; want '4'", ans)
    }
}