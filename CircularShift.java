/**
   Problem 1.2.6 in Algorithms book, ch. 1.2
*/

public class CircularShift
{
   public static void main(String[] args)
   {
      String x = "ACTGACG";
      String y = "TGACGAC";
      
      if(circShift(x, y))
         System.out.println("Strings are circular shifts of each other");
      else
         System.out.println("Strings are NOT circular shifts of each other");
   }   
   
   public static boolean circShift(String x, String y)
   {  
      //if statement compares the lenght of the strings and then
      //compares string y to string x while it is combined, ex. 'ACTGACG' + 'ACTGACG'
      if( x.length() == y.length() && ((x + x).indexOf(y) != -1))
         return true;
      else
         return false;
   }   
}