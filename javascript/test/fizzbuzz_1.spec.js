var assert = require('assert'),
fizzbuzz = require('../src/fizzbuzz')

describe('FizzBuzz - First Half', function() {
    it('should return 1 when the input is 1', function() {
      assert.equal(fizzbuzz(1), "1");
    });

    it('should return 2 when the input is 2', function() {
      assert.equal(fizzbuzz(2), "2");
    });

    it('should return "Fizz" when the input is 3', function() {
      assert.equal(fizzbuzz(3), "Fizz");
    });

    it('should return "Fizz" when the input is 6', function() {
      assert.equal(fizzbuzz(6), "Fizz");
    });

    
});