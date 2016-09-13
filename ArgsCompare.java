/**
   Problem 1.1.3 in Algorithms Book ch. 1
*/
public class ArgsCompare
{
   public static void main(String[] args)
   {
      while(args.length == 3)
      {      
         if(args[0].equals(args[1]) && args[0].equals(args[2]))
         {
            System.out.print("equal");
         } 
         else
         {
            System.out.print("not equal");
         }
      }   
   }
}