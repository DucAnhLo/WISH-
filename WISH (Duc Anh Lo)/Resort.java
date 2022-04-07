 

import java.util.*;

/**This class implements the WISH interface
 *
 * @author 
 * @version 
 **/
public class Resort implements WISH
{


    /** constructor
     */
    public Resort(String loc) 
    {
           
    }
    
    /**
     * Returns all of the details of all planets including the permits
     * currently on each planet, on "No permits"
     * @return all of the details of all planets including location 
     * and all permits currently on each planet, or "No permits" 
     */
    public String toString()
    {
       
        return "";
    }
    
    /**Returns a String with details of a permit
     * @param permitId - id number of the permit
     * @return the details of the permit as a String, or "No such permit"
     */
    public String getPermitDetails(int permitId)
    {
        return "";
    }

    
    /** Given the name of a planet, returns the planet id number
     * or -1 if planet does not exist
     * @param name of planet
     * @return id number of planet
     */
    public int getPlanetNumber(String ww)
    {
        
        return -1;
    }
    
    /**Returns a String representation of all the permits on all planets
     * @return a String representation of all permits on all planets
     **/
    public String getAllPermitsOnEachPlanet()
    {
        
        return "";
    } 
 
    
    /**Returns the name of the planet which contains the specified permit or null
     * @param tr - the specified permit
     * @return the name of the Planet which contains the permit, or null
     **/
    public String getPermitLocation(int tr)
    {
        
        return null;
    }
    
               
    /**Returns a String representation of all the permits on specified planet
     * @return a String representation of all permits on specified planet
     **/
    public String getAllPermitsOnOnePlanet(String planet)
    {
        
        return null;
    } 

    
     /**Returns true if a Permit is allowed to move using the shuttle, false otherwise
      * A move can be made if:  
      * the rating of the permit  >= the rating of the destination planet
      * AND the destination planet is not full
      * AND the permit has sufficient credits
      * AND the permit is currently on the source planet
      * AND the permit id is for a permit on the system
      * AND the shuttle code is the code for a shuttle on the system
      * @param pId is the id of the permit requesting the move
      * @param shtlCode is the code of the shuttle journey by which the permit wants to pPermitel
      * @return true if the permit is allowed on the shuttle journey, false otherwise 
      **/
    public boolean canTravel(int pId, String shtlCode)
    {   //other checks optional
        
         return false;

    }     

    /**Returns the result of a permit requesting to move by Shuttle.
     * A move will be successful if:  
     * the luxury rating of the permit  >= the luxury rating of the destination planet
     * AND the destination planet is not full
     * AND the permit has sufficient credits
     * AND the permit is currently on the source planet
     * AND the permit id is for a permit on the system
     * AND the shuttle code is the code for a shuttle on the system
     * If the shuttle journey can be made, the permit information is removed from the source
     * planet, added to the destination planet and a suitable message returned.
     * If shuttle journey cannot be made, the state of the system remains unchanged
     * and a message specifying the reason is returned.
     * @param ppId is the id of the permit requesting the move
     * @param shtlCode is the code of the shuttle journey by which the permit wants to pPermitel
     * @return a String giving the result of the request 
     **/
    public String travel(int ppId, String shtlCode )
    {   //other checks optional
        
        return null;
    } 
         
    // These methods are for Task 6 only and not required for the Demonstration 
    // If you choose to implement them, uncomment the following code
    

    /** Allows a permit to top up their credits.This method is not concerned with 
     *  the cost of a credit as currency and prices may vary between resorts.
     *  @param id the id of the permit toping up their credits
     *  @param creds the number of credits purchased to be added to permits information
     */
    public void topUpCredits(int id, int creds)
    {
        
    }
   
    //***************private methods**************
    private void loadPlanets()
    {
        
    }
    
    private void setUpShuttles()
    {
        
    }
    
    private void loadPermits()
    {
        
     
    }
 
    /** Returns the permit with the permit id specified by the parameter
     * @return the permit with the specified name
     **/
    public Permit getPermit(int id)
    {
        
        return null;
    }
    
    
    /** Returns the planet with the name specified by the parameter
     * @return the planet with the specified name
     **/
    private Planet getPlanet(String planetName)
    {
        
        return null;
    }
    
    /** Returns the planet with the name specified by the parameter
     * @return the planet with the specified name
     **/
    private Shuttle getShuttle(String shut)
    {
        return null;
    }
}