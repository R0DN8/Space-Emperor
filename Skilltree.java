import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)
import java.util.*;
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
    private List<UpgradeBox> upgradeBoxes = new ArrayList<>();
    private boolean isOpen = false;

    public Skilltree(){
        //Stats in "%" wird später in ihre true value geändert
        strength = 100; //true value:
        defense = 100; //true value:
        productionSpeed = 100; //true value:
        collectionSpeed = 100; //true value:
        shipSpeed = 100; //true value:
        createUpgradeBoxes();
    }

    private void createUpgradeBoxes()
    {
        upgradeBoxes.add(new UpgradeBox(90, 250));
        upgradeBoxes.add(new UpgradeBox(90, 490));
        upgradeBoxes.add(new UpgradeBox(90, 730));
        upgradeBoxes.add(new UpgradeBox(400, 180));
        upgradeBoxes.add(new UpgradeBox(400, 320));
        upgradeBoxes.add(new UpgradeBox(400, 800));
        upgradeBoxes.add(new UpgradeBox(400, 660));

    }

    public void spawnSkilltree(){
        /*not sure if this is outdated :/

        if (Greenfoot.mouseClicked(this)) {
        Textbox textbox = new Textbox();
        getWorld().addObject(new Textbox(), 200, 200);
        getWorld().addObject(new Textbox(), 200, 300);
        getWorld().addObject(new Textbox(), 200, 400);
        }*/
    }

    public void addObject(Actor object,int x, int y){
        addObject(new Textbox(),x, y);
    }

    
    public void act(){
        if (Greenfoot.mouseClicked(this)) {

            if(isOpen) {
                for(int i = 0; i < upgradeBoxes.size(); i++) {
                    getWorld().removeObject(upgradeBoxes.get(i));
                }
            }else {
                for(int i = 0; i < upgradeBoxes.size(); i++) {
                    UpgradeBox box = upgradeBoxes.get(i);
                    getWorld().addObject(box, box.getX(), box.getY());
                    
                    
                }
            }
            
            isOpen = !isOpen;
            /*UpgradeBox textbox = new UpgradeBox();
            //first column
            getWorld().addObject(new UpgradeBox(), 90, 250);
            getWorld().addObject(new UpgradeBox(), 90, 490);
            getWorld().addObject(new UpgradeBox(), 90, 730);
            //second column
            getWorld().addObject(new UpgradeBox(), 400, 180);
            getWorld().addObject(new UpgradeBox(), 400, 320);

            getWorld().addObject(new UpgradeBox(), 400, 800);
            getWorld().addObject(new UpgradeBox(), 400, 660);

            /*
            GreenfootImage strich = new GreenfootImage (1090; 875);
            strich.setColor(Color.YELLOW); //or: strich.setColor(new Color (200,200,255))
            strich.drawLine(0,0,100,100);
            setImage(strich); 
             */

            
            /* von Laurenz 9.03:
             * //second column
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
             */

        }
    }   
}