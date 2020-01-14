package fizzbuzz;

public class FizzBuzz {

    public String fizzbuzz(int input){
        String output = "";
        if( input % 3 == 0 ) output += "Fizz";
        if( input % 5 == 0 ) output += "Buzz";

        return output.length() > 0 ? output : Integer.toString(input);
    }

}
