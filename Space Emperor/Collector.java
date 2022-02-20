import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Sammler.
 * 
 * @author Luca, Jason
 * @version 09.02.2022
 */
public class Collector extends Spaceship
{
    private int mineSpeed;
    
    public Collector(Planet planet, int speed, int mineSpeed) {
        super(planet, speed);
        this.mineSpeed = mineSpeed;
    }
    
    public Collector(int x, int y, int speed, int mineSpeed) {
        super(x, y, speed);
        this.mineSpeed = mineSpeed;
    }
    
   

    public void act() 
    {
        super.act();
    }    
  
    public void onFinish() {
        
    }
    
    
    
     public String getName() {
        return "Collector";
    }

}