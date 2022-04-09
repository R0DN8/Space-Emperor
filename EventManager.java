import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.util.Random;

/**
 * Write a description of class Event here.
 * 
 * @author Luca, Jason
 * @version 09.03.2022
 */
public class EventManager extends Actor
{


    private static final int firstRound = 5; //First round in which first planned event can occour
    private static final int lastRound = 10; //Last round in which last planned event can occour
    private static final int numEvents = 3; //Number of plannedEvents
    private static final double probatility = 5; //In percent. Range: 0 - 100;
    private Random probatilityRandom;

    private static EventManager staticEventManager;


    private HashMap<Integer, EventType> eventrounds;


    public EventManager(){
        staticEventManager = this;
        Random roundRandom = new Random();
        Random eventRandom = new Random();
        probatilityRandom = new Random();
        eventrounds = new HashMap<>();
        EventType[] eventTypes = EventType.values();

        //Fill with planned Events
        for(int i = 0; i < numEvents; i++){
            int type = eventRandom.nextInt(EventType.values().length);
            int round = roundRandom.nextInt((lastRound + firstRound) + 1) + lastRound;
            eventrounds.put(round, eventTypes[type]);
        }

        //Fill with randomEvents
        for(int i = firstRound; i < 200; i++){
            if(getProbatilityEvent() && eventrounds.get(i) == null){
                int type = eventRandom.nextInt(EventType.values().length);
                eventrounds.put(i, eventTypes[type]);
            }
        }
    }
    
    public void nextRound(){
        final EventType event = eventrounds.get(Space.getCurrentRound());
        if(event != null){
            if(event == EventType.asteroid){
                new AsteroidEvent().startEvent(null);
            } else if (event == EventType.disease){
                new DiseaseEvent().startEvent(null);
            } else if (event == EventType.solarstorm){
                new SolarstormEvent().startEvent(null);
            }
        }
    }


    /**
     * Returns true if randomevent should be added
     * @return
     */
    private boolean getProbatilityEvent(){
        int num = probatilityRandom.nextInt(100);
        return num < probatility;
    }

    /**
     * Returns true if one Event is planned
     * @param round
     * @return
     */
    public boolean isEvent(int round){
        return eventrounds.get(round) == null ? true : false;
    }


    public static EventManager getStaticEvent() {
        return staticEventManager;
    }




    public enum EventType{
        asteroid,
        disease,
        solarstorm
    }
}
