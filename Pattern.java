//Filip Milicevic
// 11/5
// This program will create 5 different kinds of patterns using different kinds of loops (for and while).

public class Pattern{
   
    //precondition: rows > 0
   //postcondition: Prints a left-aligned triangle of stars where each row has odd amount of stars
   public static void stars(int rows){
    String stars = "*";
    while (rows > 0) {
        System.out.println(stars);
        stars += "**";
        rows--;
   }
}
//Precondition: rows > 0
//Postcondition: Prints a sort of triangle of numbers where each row i contains the number i repeated i times
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
   //Precondition: start >= 1 and start as odd int
   //Postcondition: Prints a pattern of odd numbers in decreasing order, each row contianing the num repeted that many times.
    public static void odds(int start){
        while(start >= 1){
            int j = 1;
            while (j <= start){
                System.out.print(start);
                    j++;
            }
        
        start -= 2;
        System.out.println("");
    }
   }
   //precondition: maxE >= 1
   //postcondition: prints a pattern of alternation E and O characters in a  sideways pyramid shape increasing to the maxE and going back down to 1
   public static void eo (int maxE) {
    boolean isOdd;
    if (maxE % 2 == 0) {
        isOdd = false;
    } else {
        isOdd = true;
    }

    for (int i = 1; i <= maxE; i++) {
        for (int j = 0; j < i; j++ ){
            if (isOdd) {
                System.out.print("E");
            } else{
                System.out.print("O");
            }
        }
        System.out.println();
        isOdd = !isOdd;
    }
    for (int i = maxE - 1; i >= 1; i--){
        for (int j = 0; j < i; j++){
            if (isOdd){
            System.out.print("E");
            } else {
                System.out.print("O");
            }
        }
        System.out.println();
        isOdd = !isOdd;
    }

   }
// precondition: rows > 0 
// postcondtion: prints centered (pointing down) pyramid where row i has num i repeated times leading spaces to form pyramid shape
   public static void pyramid (int rows){
    int i = 1;
    while ( i <= rows) {
        int s = 0;
        while (s < i - 1) {
            System.out.print(" ");
            s++;
        }
        int numCount = 2 * (rows - i) + 1;
        int j = 1; 
        while (j <=numCount) {
            System.out.print(i);
            j++;
        }
        System.out.println();
        i++;
    }
   }

    
public static void main (String [] args){
   stars(7);
   System.out.println();
  triangle(9);
   System.out.println();
    odds(9);
     System.out.println();
    eo(5);
    System.out.println();
    eo(6);
    System.out.println();
    pyramid(5);
    }
}    