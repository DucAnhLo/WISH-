 
import java.util.*;
/**
 * An planet is part of a STAR resort.Each planet has a name,  a luxury rating
 * and a capacity which represents the maximum number of people(permits) who can be on the  
 * planet at any one time. Each planet must maintain a list of all people (permits)
 * currently on the planet. These lists are updated whenever permits enter or leave 
 * an planet,so that it is always possible to say how many people (permits) are on the planet 
 * and who they are.
 * 
 * @author (Duc Anh Lo) 
 * @version (09.04.22)
 */

public class Planet 
{
    int planetReferenceNumber;
    String planetName;
    int planetRating;
    int planetCapacity;
    ArrayList<Permit> permitList;
    
    public Planet(int refNumber, String name, int pRating, int capacity)
    {
        planetReferenceNumber = refNumber;
        planetName = name;
        planetRating = pRating;
        planetCapacity = capacity;
        permitList = new ArrayList<Permit>();
    }
    
    public int getPlanetID()
    {
        return planetReferenceNumber;
    }
    
    public String getPlanetName()
    {
        return planetName;
    }
    
    public int getPlanetRating()
    {
        return planetRating;
    }
    
    public void enter(Permit p)
    {
        permitList.add(p);
    }
    
    public void leave(int permitID)
    {
        Permit temp = findPermitOnPlanet(permitID);
        if (temp != null)
        {
            permitList.remove(temp);
        }
    }
    
    
    
    public boolean isFull()
    {
        if (permitList.size() >= planetCapacity)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public String toString()
    {
        return "Planet Reference Number: " + planetReferenceNumber + ", " + "\nPlanet Rating: " + planetRating  + ", " + "\nPlanet Capacity: " + planetCapacity
        + ", " + "\nPermit on Planet: " + permitList; 
    }
    
    public String getPermitList()
    {
        String ss = "";
        if (permitList.size() >0)
        {
            for(Permit temp: permitList)
            {
                ss = ss + "\n" + temp.toString();
            }
            return ss;
        }
        return ss + "\n ";
    }
    
    public Permit findPermitOnPlanet(int permitID)
    {
        for(int i=0; i<permitList.size(); i++)
        {
            Permit temp = permitList.get(i);
            if (temp.getID() == permitID)
            {
                return temp;
            }
        }
        return null; // not found
    }
    
    public boolean permitPresence(int permitID)
    {
        for(int i =0; i <permitList.size();i++)
        {
            Permit temp = permitList.get(i);
            if(temp.getID() == permitID)
            {
                return true;
            }
        }
        return false;
    }
    
}
