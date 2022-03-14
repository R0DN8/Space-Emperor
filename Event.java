import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Event here.
 * 
 * @author Luca, Jason
 * @version 09.03.2022
 */
public class Event extends Actor
{

    private static final int firstRound = 5; //First round in which first planned event can occour
    private static final int lastRound = 10; //Last round in which last planned event can occour
    private static final int numEvents = 3;


    private HashMap<Integer, EventType> eventrounds;
    

    public Event(){
        Random roundRandom = new Random(firstRound, lastRound);
        Random eventRandom = new Random(0, 3);
        eventrounds = new Hashmap<>();
        
        for(int i = 0; i < numEvents; i++){
            
        }
        
    }
    
    

    public void act()
    {
        // Add your action code here.
    }
    
    
    
    public enum EventType{
        nothing,
        asteroid,
        disease,
        solarstorm
    }
}
