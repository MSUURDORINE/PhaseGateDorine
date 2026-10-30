public class ParkingSlotFunction{
    
    static int[] slots = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
    public static boolean isEmpty(int slot){
        int index = slot - 1;
        if(slots[index] == 0){
            return True;
        }else{
            return False;
        }
    }
    
    public static void parkAtNextSpace(){
        for(int index = 0; index < slots.length; index++){
            if(slots[index] == 0){
                slots[index] = 1;
                break;
            }
        }
    }
    
    public static void parkAtSlot(int slot){
        int index = slot - 1;
        if(slots[index] == 0){
            slots[index] = 1;
        }else{
            System.out.println("Slot already taken");
        }
    }
    
    public static void leaveSlot(int slot){
        int index = slot -1;
        if(slots[index] == 1){
            slots[index] = 0;
        }else{
            System.out.println("slots is empty");
            
        }
    }
  public static void displayStatus(){
    int index = slots -1;
    if (slots[index] == 0){
        slots[index] = 0;
    }else{
        System.out.println()
    }
  }  
    
}
