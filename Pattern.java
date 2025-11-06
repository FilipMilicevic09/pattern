//Filip Milicevic
// 11/5
//brief description

public class Pattern{
   //precondition
   //postcondition

   public static void stars(int rows){
    String stars = "*";
    while (rows > 0) {
        System.out.println(stars);
        stars += "**";
        rows--;
   }
}
   public static void triangle (int rows) {
    int i = 1;
    while (i<= rows) {
        int count = 1;
        while (count <= i) {
            System.out.print(i);
            count++;
        }
        System.out.println();
        i++;
    }

   }
   

    
    public static void main (String [] args){
    stars(7);
    triangle(9);
    }
}    