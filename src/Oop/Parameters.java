package Oop;
import java.util.Random;

public class Parameters {
  static  String  myURL= "https://magento.softwaretestingboard.com" ;
 
  static String myString ;
 
  public static void main(String[] args) {
	  
      Parameters parameters = new Parameters(); // Create an instance of Parameters
      String myString = parameters.myString; // Access myString from Parameters

	  
      String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
      
      String randomItem = getRandomItemFromArray(stringArray);
      myString = randomItem; // Assign the random item to myString
      
      System.out.println( randomItem);
  }

  public static String getRandomItemFromArray(String[] array) {
      if (array == null || array.length == 0) {
          return ""; // Return an empty string if the array is null or empty
      }
      
      Random random = new Random();
      int randomIndex = random.nextInt(array.length);
      return array[randomIndex];
  }
}



 
 




 



   
