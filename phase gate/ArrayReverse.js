function twoArrayReverse(numbers) {
        for(let index = 0; index < numbers.length; index++){
          for(let row = 0; row < numbers[index].length; row++){
            for(let column = row + 1; column < numbers[index].length; column++){
              let numberstemp = numbers[index][row]; 
                numbers[index][row] = numbers[index][column];
                numbers[index][column]  = numberstemp;
          }
      }
  }
  return numbers;
  }
   let input = [
            [1, 2, 3],
            [4, 5, 6],
            [7, 8, 9]
        ];
            
 console.log(twoArrayReverse(input));
            

    


