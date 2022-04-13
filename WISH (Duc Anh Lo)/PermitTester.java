
/**
 * PermitTester uses the Permit class
 * It shows different ways of doing the same thing:
 * - declaring an object, 
 * - creating it,
 * - calling its methods
 * 
 * @author Duc Anh Lo
 * @version 09.04.22
 */
public class PermitTester
{
    public static void main(String[] args)
    {
        Permit p1 = new Permit(1000, "Lynn", 5, 10);
        
        //Getting Permit ID
        int id = p1.getID();
        System.out.println(id);
        
        //Getting remaining credits
        int credit = p1.getCredits();
        System.out.println(credit);
        
        //Getting rating
        int rating = p1.getRating();
        System.out.println(rating);
        
        //Topup credits
        System.out.println("Remaining credits: " + p1.numberOfCredits);
        int topUp = p1.addCredits(2);
        System.out.println("Credits after Top Up: " + topUp);
        
        //Deduct credits
        System.out.println("Remaining credits: " + p1.numberOfCredits);
        int deduct = p1.deductCredits(1);
        System.out.println("Credits after using: " + deduct);
        
        
        //Check if credits is enough to make shuttle journey
        boolean validCre = p1.validCredits();
        System.out.println(validCre);
        
        //Display all relevant infomation
        String infor = p1.toString();
        System.out.println(infor);
        
    }
}
