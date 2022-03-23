import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * 
 * 
 * @author Jason, Luca
 * @version 09.03.2022
 */
public class Fighter extends Spaceship
{
    public Fighter(int x, int y, int velocity) {
        super(x, y, velocity);
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