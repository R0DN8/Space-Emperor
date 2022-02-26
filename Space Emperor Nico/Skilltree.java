import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Skilltree.
 * 
 * @author (Laurenz, Justin) Tin
 * @version 03.02.2022
 * 
 * IN ENGLISH PLEASE!!
 * 
 * Attribute, welche im Skilltree verbessert werden können
 * 
 * Später: Visualisierung des Skilltrees
 */
public class Skilltree extends Actor
{
    int strength;//Raumschiffstärke -> mehr Schaden
    int defense;//Verteidigung des eigenen Planeten (evtl. Haltbarkeit der Schiffe/später Schild)
    int productionSpeed;//erhöht Produktion auf eigenem Planeten pro Runde
    int collectionSpeed;//erhöht Materialaufnahme der Schiffe pro "fahrt"
    int shipSpeed;//Geschwindigkeit der Schiffe

    /**
     * Act - tut, was auch immer Skilltree tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */

    public Skilltree(){
        //Stats in "%" wird später in ihre true value geändert
        strength = 100; //true value:
        defense = 100; //true value:
        productionSpeed = 100; //true value:
        collectionSpeed = 100; //true value:
        shipSpeed = 100; //true value:

    }

    public void spawnSkilltree(){
        if (Greenfoot.mouseClicked(this)) {
            Textbox textbox = new Textbox();
            getWorld().addObject(new Textbox(), 200, 200);
            getWorld().addObject(new Textbox(), 200, 300);
            getWorld().addObject(new Textbox(), 200, 400);
        }
    }
    
    public void addObject(Actor object,int x, int y){
        addObject(new Textbox(),x, y);
    }
    
    public void act(){
        
    }    
}