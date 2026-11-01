import java.util.Scanner;
  public class ParkingSlot{
  
    public static void main(String[] arg){
    
      Scanner input = new Scanner(System.in);
      
      int[][] parkingSlots int[1][20];
      for (index 0; index < parkingSlot.length; index++);
      
          
          String parkingSystemMenu """
 ==========MINI PARKING SLOT============         
1. Available space;
2. Remove  from a car slot
3. Display parking  status
4. Exit
      """;
  
        System.out.print("Enter your parking slot number: ");
        int parkingNumber = scanner.nextInt();
        
        int rowIndex = parkingNumber - 1;

        if (rowIndex >= 0 && rowIndex < 20) {
                  
            if (parkingSlot[rowIndex] == 'O') {
                parkingSlot[rowIndex] = '1';
                
                for(int row = 0; row < parkingSlot.length; row++) {
                    System.out.print(parkingSlot[row] + " ");
                    }
                    System.out.println();
                    break;
            } 
                else {
                    System.out.println("Sorry, space already occupied.");
                 
                }
        } 
            else { 
                System.out.println("Invalid space selection. Try again");
                theSpace = false;
            }
        }
    }
}
              
            
       
    
    
                
               
               
  

