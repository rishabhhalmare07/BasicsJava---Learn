public class arrayIdentify {
    
   public static void main(String[] args) {
          int number[] = {5, 10, 15, 20, 25};

          for(int i=0; i<number.length; i++){
               for(int j=number.length /2; j<number.length;j++){
                   System.out.println("Values of i = "+ number[i] + " and " + "Values of j = " + number[j]);
                  if(number[i]>number[j]){
                      System.out.println("The number is greater " + number[i]);
                  }
                  else{
                       System.out.println("j greater " + number[j]);
                   }   
                  
              }
          }

   }
 
}
