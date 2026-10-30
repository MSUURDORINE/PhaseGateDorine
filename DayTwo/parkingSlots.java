import java.util.Scanner;
  public class ParkingSlots{
  
    public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);
       
        
        int mainMenuChoice = 0;

        while (mainMenuChoice != 5) {
            String mainMenu = """
============MINI PARKING SYSTEM ==============
            
1:  Park at next available space
2:  Park at given slot
3:  Leave slot
4:  Display parking status
5:  Exit      

      """;     
            System.out.println(mainMenu);
            System.out.println("Enter your choice: ");
            mainMenuChoice = input.nextInt();


            switch(mainMenuChoice) {
                case 1 :
                    int nextSlot = MiniParkingFunctions.parkNext();
                    
                    if (nextSlot != -1) {
                    System.out.println("Car parked in slot "+nextSlot);
                    } 
                    else {
                        System.out.println("Parking lot is full.");
                    }
                    MiniParkingFunctions.displayStatus();
                    break;
 
                case 2 :
                    System.out.print("Enter slot number (1-20): ");
                    int slot = input.nextInt();

                    if (MiniParkingFunctions.chooseSlot(slot)) {
                        System.out.println("Car parked in slot " + slot);
                    } 
                    else {
                        System.out.println("Car could not be parked in slot "+ slot);
                    }

                    MiniParkingFunctions.displayStatus();
                    break;

                case 3 :
                    System.out.print("Enter slot number to leave (1-20): ");                   
                    int leaveSlot = input.nextInt();

                    if(MiniParkingFunctions.leaveSlot(leaveSlot)) {
                        System.out.println("Car removed from successfully");
                    } 
                    else {
                        System.out.println("Car could not be removed from slot");
                    }

                    MiniParkingFunctions.displayStatus();
                    break;

                case 4 :
                    MiniParkingFunctions.displayStatus();
                    break;

                case 5 :
                    System.out.println("Thank you. Goodbye.");
                    break;

                default : 
                    System.out.println("Invalid choice. Please choose 1-5.");
                    break; 
      
        
      
    
    }
  }
