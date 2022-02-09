import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * (noch nicht) Abstrakte Klasse "Planet"
 * 
 * IN ENGLISH PLEASE!!
 * 
 * @author Tin, Angelina (Nils, Nico) 
 * @version 03.02.2022
 */
public class Planet extends Actor
{
    
    private Position position;
    private int fleetSize;
    private int credits;
    private int steel;
    private int electricalParts;
    // Konstruktor
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