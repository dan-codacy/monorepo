package main

import (
	"strconv"
)

func fizzbuzz(i int) (string) {
	s := ""       
	if i % 3 == 0 {
		s += "Fizz"
	}
	if i % 5 == 0 {
		s += "Buzz"
	}
	if s != "" {
		return s
	} else {
		return strconv.Itoa(i)
	}
}
