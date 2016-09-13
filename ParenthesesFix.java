import java.util.Stack;
import java.util.Scanner;
/**
   Excersise 1.3.9 from Algorithms 4th Edition
*/
public class ParenthesesFix
{
   public static void main(String[] args)
   {
      String input;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter the equation here: ");
      input = keyboard.nextLine();
      
      Stack<String> numbers = new Stack<>(); //To hold the numbers
      Stack<Character> operator = new Stack<>();//To hold the operators
      
      for( int i = 0; i < input.length(); i++)
      {
         //Numbers 0 - 9
         if(input.charAt(i) == '0' ||
            input.charAt(i) == '1' ||
            input.charAt(i) == '2' ||
            input.charAt(i) == '3' ||
            input.charAt(i) == '4' ||
            input.charAt(i) == '5' ||
            input.charAt(i) == '6' ||
            input.charAt(i) == '7' ||
            input.charAt(i) == '8' ||
            input.charAt(i) == '9' )
         {
               String nums = ""; 
               nums += input.charAt(i);
               numbers.push(nums);
         }
         //Operator checks
         else if( input.charAt(i) == '-' ||
                  input.charAt(i) == '+' ||
                  input.charAt(i) == '/' ||
                  input.charAt(i) == '*' )
         {         
               operator.push(input.charAt(i));
         }
         //Parenthesis check
         else if(input.charAt(i) == ')')
         {
               String numTwo = numbers.pop();
               String numOne = numbers.pop();
               char optr = operator.pop();
                  
               //Building the new equation             
               String equation = "(" + numOne +  optr + numTwo + ")";
                  
               //Pushing the entire equation onto the
               //numbers stack          
               numbers.push(equation);
               
               /** 
                  To peek, to see how the steps work out.
                  String peek = numbers.peek();
                  System.out.println(peek);
               */              
         }           
      }//for
      
      System.out.println("Corrected Parentheses");
      System.out.println(numbers.pop());
      
   }//main
}//class