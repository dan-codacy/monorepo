package main

import (
	"strconv",
	"fmt"
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

func main() {
    username := "admin"
    var password = "f62e5bcda4fae4f82370da0c6f20697b8f8447ef"

    fmt.Println("Doing something with: ", username, password)
}
