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

    }

    public void addObject(Actor object,int x, int y){
        addObject(new Textbox(),x, y);
    }

    public void act(){
        if (Greenfoot.mouseClicked(this)) {
            UpgradeBox textbox = new UpgradeBox();
            //first column
            getWorld().addObject(new UpgradeBox(), 90, 250);
            getWorld().addObject(new UpgradeBox(), 90, 490);
            getWorld().addObject(new UpgradeBox(), 90, 730);
            //second column
            getWorld().addObject(new UpgradeBox(), 400, 180);
            getWorld().addObject(new UpgradeBox(), 400, 320);
            getWorld().addObject(new UpgradeBox(), 400, 800);
            getWorld().addObject(new UpgradeBox(), 400, 660);
            getWorld().addObject(new UpgradeBox(), 400, 490);
            //third collumn
            

            GreenfootImage strich = new GreenfootImage (2000, 1200);
            strich.setColor(new Color (255,255,255));
            //first row
            strich.drawLine(165,250,325,180);
            strich.drawLine(165,250,325,320);
            //secoond row
            strich.drawLine(165,490,325,490);
            //third row
            strich.drawLine(165,730,325,660);
            strich.drawLine(165,730,325,800);
            
            setImage(strich);
        }
    }   
}