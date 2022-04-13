 
/**
 * A shuttle provides a one-way connection between two planets. It
 * has a Shuttle code and information about both the source and
 * the destination planet
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuttle
{
    private String journeyCode;
    private Planet fromPlanet;
    private Planet toPlanet;
    
    public Shuttle (String journeyId, Planet frPlanet, Planet tPlanet)
    {
        journeyId = journeyCode;
        frPlanet = fromPlanet;
        tPlanet = toPlanet;
    }
    
    public boolean permitCheck(Permit pc)
    {
        int visitorCredits = pc.getCredits();
        if (visitorCredits >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    
    //public void movingPermit(Permit p, Planet pl)
    //{   
        //int pRating = p.getCredits();
        //int plRating = pl.getPlanetCredits();
        //boolean plIsFull = pl.isFull();
        //if(pRating >= plRating && plIsFull == false && permitCheck == true)
        //{
            
        //}
    //}
    
    
    public String toString()
    {
        return "\nShuttle Journey Code : " + journeyCode +"\nFrom : " +
             fromPlanet.getPlanetName() + "  "+ "\nTo : " + toPlanet.getPlanetName();
    }
    
    
    
    
}
