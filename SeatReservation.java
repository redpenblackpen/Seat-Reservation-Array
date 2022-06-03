import java.util.Scanner;
public class SeatReservation {
    public static void main(String args[]) {
        
     Scanner input = new Scanner(System.in);
     
     
      
      String[][]  seatReservation = {
          
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"},
                                  {"*", "*", "*", "*", "*"}
                   
                                  };
                                  
        String[][]  seatReserved = {
          
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"},
                                  {"x", "x", "x", "x", "x"}
                   
                                  };                          
                                  
                                  
                                     
      System.out.println("Bus seat reservation:");
       
      System.out.println("      Col 1   Col 2   Col 3   Col 4");
      System.out.println("Row 1   " + seatReservation[1][1] + "       " + seatReservation[1][2] + "       " + seatReservation[1][3] + "       "  + seatReservation[1][4]);
      System.out.println("Row 2   " + seatReservation[2][1] + "       " + seatReservation[2][2] + "       " + seatReservation[2][3] + "       "  + seatReservation[2][4]);
      System.out.println("Row 3   " + seatReservation[3][1] + "       " + seatReservation[3][2] + "       " + seatReservation[3][3] + "       "  + seatReservation[3][4]);
      System.out.println("Row 4   " + seatReservation[4][1] + "       " + seatReservation[4][2] + "       " + seatReservation[4][3] + "       "  + seatReservation[4][4]);
      System.out.println("Row 5   " + seatReservation[5][1] + "       " + seatReservation[5][2] + "       " + seatReservation[5][3] + "       "  + seatReservation[5][4]);
      System.out.println("Row 6   " + seatReservation[6][1] + "       " + seatReservation[6][2] + "       " + seatReservation[6][3] + "       "  + seatReservation[6][4]);
      System.out.println("Row 7   " + seatReservation[7][1] + "       " + seatReservation[7][2] + "       " + seatReservation[7][3] + "       "  + seatReservation[7][4]);
      System.out.println("Row 8   " + seatReservation[8][1] + "       " + seatReservation[8][2] + "       " + seatReservation[8][3] + "       "  + seatReservation[8][4]);
      System.out.println("Row 9   " + seatReservation[9][1] + "       " + seatReservation[9][2] + "       " + seatReservation[9][3] + "       "  + seatReservation[9][4]);
      System.out.println("Row 10  " + seatReservation[9][1] + "       " + seatReservation[10][2] + "       " + seatReservation[10][3] + "       "  + seatReservation[10][4]);
      
      System.out.println();
      
      int row, col, i;
      
      for(i = 0; i < 10; i++){
          
      System.out.println("Enter row and column number to reserve seperated by space(Enter a negative number to exit)");
      System.out.print("Enter row: ");
      row = input.nextInt();
      System.out.print("Enter column: ");
      col = input.nextInt();
     
      if(row > 0 && col > 0){
       
      seatReservation[row][col] = seatReserved[row][col];
      
      System.out.println();
      
      System.out.println("Bus seat reservation:");
       
      System.out.println("      Col 1   Col 2   Col 3   Col 4");
      System.out.println("Row 1   " + seatReservation[1][1] + "       " + seatReservation[1][2] + "       " + seatReservation[1][3] + "       "  + seatReservation[1][4]);
      System.out.println("Row 2   " + seatReservation[2][1] + "       " + seatReservation[2][2] + "       " + seatReservation[2][3] + "       "  + seatReservation[2][4]);
      System.out.println("Row 3   " + seatReservation[3][1] + "       " + seatReservation[3][2] + "       " + seatReservation[3][3] + "       "  + seatReservation[3][4]);
      System.out.println("Row 4   " + seatReservation[4][1] + "       " + seatReservation[4][2] + "       " + seatReservation[4][3] + "       "  + seatReservation[4][4]);
      System.out.println("Row 5   " + seatReservation[5][1] + "       " + seatReservation[5][2] + "       " + seatReservation[5][3] + "       "  + seatReservation[5][4]);
      System.out.println("Row 6   " + seatReservation[6][1] + "       " + seatReservation[6][2] + "       " + seatReservation[6][3] + "       "  + seatReservation[6][4]);
      System.out.println("Row 7   " + seatReservation[7][1] + "       " + seatReservation[7][2] + "       " + seatReservation[7][3] + "       "  + seatReservation[7][4]);
      System.out.println("Row 8   " + seatReservation[8][1] + "       " + seatReservation[8][2] + "       " + seatReservation[8][3] + "       "  + seatReservation[8][4]);
      System.out.println("Row 9   " + seatReservation[9][1] + "       " + seatReservation[9][2] + "       " + seatReservation[9][3] + "       "  + seatReservation[9][4]);
      System.out.println("Row 10  " + seatReservation[10][1] + "       " + seatReservation[10][2] + "       " + seatReservation[10][3] + "       "  + seatReservation[10][4]);
          
      }
      
      else if(row < 0  && col < 0){
          
           System.out.print("Program exit!");
           break;
      }
      
    }
  }
}