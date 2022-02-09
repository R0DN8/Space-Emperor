import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Fighter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fighter extends Spaceship
{
    public Fighter(Position position, int velocity) {
        super(position, velocity);
    }
    
    public Fighter(Planet planet, int velocity) {
        super(planet, velocity);
    }
    
    
    public void act() 
    {
      super.act();  
    }  
    
    public void onFinish(){
        
    }
    
    public String getName(){
        return "Fighter";
    }
}