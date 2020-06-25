class FizzBuzz:

    def convert(self, input):
        output = ""
        if input % 3 == 0:
            output += "Fizz"
        if input % 5 == 0:
            output += "Buzz"

        return output if len(output) else str(input)
    
    def a_function(self, gotcha=[]):
        print(gotcha)
        gotcha.append('Really? Who thought this was a good idea?')
    
    def bad_func(self):
        for i in range(20):
            self.a_function()


