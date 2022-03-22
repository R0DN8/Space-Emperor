import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse CombatBox.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CombatBox extends Textbox
{
    /**
     * Act - tut, was auch immer CombatBox tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            CombatInterface combatinterface = new CombatInterface();
            getWorld().addObject(new CombatInterface(), 250, 250);
        }
    }    
}