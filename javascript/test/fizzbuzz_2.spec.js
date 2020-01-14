var assert = require('assert'),
fizzbuzz = require('../src/fizzbuzz')

describe('FizzBuzz - Second Half', function() {

    it('should return Buzz when the input is 5', function() {
      assert.equal(fizzbuzz(5), "Buzz");
    });

    it('should return Buzz when the input is 10', function() {
      assert.equal(fizzbuzz(10), "Buzz");
    });

    it('should return FizzBuzz when the input is 15', function() {
      assert.equal(fizzbuzz(15), "FizzBuzz");
    });

    it('should return FizzBuzz when the input is 30', function() {
      assert.equal(fizzbuzz(30), "FizzBuzz");
    });
});