import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Abstrakte Klasse Planet
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public abstract class Planet extends Actor
{
    int fleetSize;
    int xCoord;
    int yCoord;
    int credits;
    Position position;
    public Planet(int x, int y){
        position = new Position(x, y);
    }
    /**
     * Act - tut, was auch immer Planet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
    }
    public Position getPosition(){
        return position;
    }
}