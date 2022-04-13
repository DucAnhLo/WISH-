
                            
/**
 * A Permit has an id number, name, a luxury rating and number of credits.
 * 
 * @author (Duc Anh Lo) 
 * @version (a version number or a date)
 */
public class Permit 
{
    int permitId;
    String guestName;
    int luxuryRating;
    int numberOfCredits;
 public Permit(int id, String name, int rating,int credits)
 {
     permitId = id;
     guestName = name;
     luxuryRating = rating;
     numberOfCredits = credits;
 }
 
 //Accessors to return the permit ID,The Luxury Rating and Number of Credits
 /**
 * Return Permit ID
 * @author (Duc Anh Lo) 
 * *
 */
 public int getID()
 {
     return permitId;
 }
 
 /**
 * Return Luxury Rating
 * @author (Duc Anh Lo) 
 * *
 */
 public int getRating()
 {
     return luxuryRating;
 }
 
 /**
 * Return Number of Credits
 * @author (Duc Anh Lo) 
 * *
 */
 public int getCredits()
 {
     return numberOfCredits;
 }
 
 //Method of add or deduct credits when user top up or using credits.
 /**
 * Increse Number of Credits when user Top Up credits
 * @author (Duc Anh Lo) 
 * *
 */
 public int addCredits(int topupCredits)
 {
     return numberOfCredits = numberOfCredits + topupCredits;
 }
 
 /**
 * Decrese Number of Credits when user using it 
 * @author (Duc Anh Lo) 
 * *
 */
 public int deductCredits(int deductCredits)
 {
     return numberOfCredits = numberOfCredits - deductCredits;
 }

 
 /**
 * Check if the permit has enough credits for a shuttle journey
 * @author (Duc Anh Lo)
 * @version 08.04.22
 * *
 */
 public boolean validCredits()
 {
     if (numberOfCredits >= 3)
     {
         return true;
     }
     else 
     {
         return false;
     }
 }
 

 /**
 * Display all relevant information about the Permit
 * @author (Duc Anh Lo) 
 * *
 */
public String toString()
 {
     String s;
        s = "Permit ID: " + permitId + " " + "Guest Name:" + guestName + " " + "Rating: " 
                               + luxuryRating + " " + "Credits: " + numberOfCredits; 
        return s;
 }

 
}



