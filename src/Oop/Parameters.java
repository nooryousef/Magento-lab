package Oop;
import java.security.SecureRandom;
import java.util.Random;


public class Parameters {
	static String myURL = "https://magento.softwaretestingboard.com";
	static String[] Arrynames = { "noor", "roaa", "heba", "huda", "dana", "hanaa", "aya" };
    static String[] Arrylastnames = { "Ahmad", "yousef", "amr",  "moath", "mohammad", "obada" };
    static Random random = new Random();
   static  int randomFirstIndex = random.nextInt(Arrynames.length);
    static int randomLastIndex = random.nextInt(Arrylastnames.length);
        static String randomFirstName = Arrynames[randomFirstIndex];
        static String randomLastName = Arrylastnames[randomLastIndex];
        
        static String myMail = randomFirstName +randomLastName +"@gmail.com" ;
        static String passWord=generatePassword(8);
        static String confiRm= passWord ;
   
   private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";

        		
       public static String generatePassword(int length) {
          StringBuilder password = new StringBuilder();
            SecureRandom random = new SecureRandom();

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(CHARACTERS.length());
                char randomChar = CHARACTERS.charAt(randomIndex);
                password.append(randomChar);
            }

            return password.toString();
        }
    }
         
        
    
        
        
	
	

 

 




 



   
