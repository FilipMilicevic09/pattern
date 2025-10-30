//name
// date
//brief description

public class Pattern{
   //precondition
   //postcondition

   public static void stars (int rows){
    String stars = "*";
    while (rows > 0) {
        System.out.println(stars);
        stars += "**";
        rows--;
   }
}
    
    public static void main (String [] args){
    stars(5);
    }
}    