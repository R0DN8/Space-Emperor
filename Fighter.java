import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Fighter.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Fighter extends Spaceship
{
    public static int speed;
    public static double damage = 100;
    /*
    //stlots der Truppen/Figghter im mothership
    public static boolean[] mothershipSlots = {true, true, false, false, false, false};
    
    //werte der einzelnen Truppen im mothership
    public static int[] mothershipValues = new int[6];
    */
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