import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Heimatplanet: Child von abstrakter Klasse Planet
 * 
 * IN ENGLISH PLEASE!!
 * 
 * @author Tin, Angelina (Nils, Nico) 
 * @version 03.02.2022
 */
public class HomePlanet extends Planet
{
    int fleetSize;
    int credits;
    int steel;
    int electricalParts;
    int xCoord;
    int yCoord;
    
    // Konstruktor
    public HomePlanet(int x, int y){
        super(x, y);
        fleetSize = 0;
        credits = 100000;
        steel = 5;
        electricalParts = 5;
    }

    /**
     * Act - tut, was auch immer Planet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
    }    
}