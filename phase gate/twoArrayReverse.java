
  public class twoArrayReverse{ 
    public static int[][] reverse(int [][] array){
      for (int row = 0; row < array.length; row++){
        for (int index = 0; index < array[row].length; index++){
          for ( int column = index +1; column < array[row].length; column++){
              int arrayswap = array[row][index]; 
               array[row][index]= array[row][column];
                array[row][column]  = arrayswap;
          }
      }
  }
  return array;
  }
    public static void main(String[] args){
      int [][] array = { 
                         {1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}
                        };
          int [][] result = reverse(array);               
          for(int index = 0; index < array.length; index++){
            for(int count = 0; count < array.length; count++){
              System.out.print(result[index][count] + " ");
            }
            System.out.println();
        }
    }
}

