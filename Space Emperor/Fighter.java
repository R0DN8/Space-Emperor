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
    
    //stlots der Truppen/Figghter im mothership
    public static boolean slot1 = true;
    public static boolean slot2 = true;
    public static boolean slot3 = false;
    public static boolean slot4 = false;
    public static boolean slot5 = false;
    public static boolean slot6 = false;
    
    //werte der einzelnen Truppen im mothership
    public static int value1;
    public static int value2;
    public static int value3;
    public static int value4;
    public static int value5;
    public static int value6;
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
    
    public void startCombat(){
        //int random = (int )(Math.random() * 6 + 1);
        if(slot1 == true){
            int value1 = (int )(Math.random() * 6 + 1);
        }
    }
}