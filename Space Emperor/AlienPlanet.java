import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse AlienPlanet.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AlienPlanet extends Planet
{
    int fleetSize;
    int xCoord;
    int yCoord;
    int credits;
    public static int travelTime; //in Runden
    
    public AlienPlanet(int x, int y){
        super(x, y);
        fleetSize = 0;
        credits = 0;
    }
    
    /**
     * Act - tut, was auch immer AlienPlanet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            CombatBox combatbox = new CombatBox();
        }
    }    
}