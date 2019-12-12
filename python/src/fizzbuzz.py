class FizzBuzz:

    def convert(self, input):
        output = ""
        if input % 3 == 0:
            output += "Fizz"
        if input % 5 == 0:
            output += "Buzz"

        return output if len(output) else str(input) 
