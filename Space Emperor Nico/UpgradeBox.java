import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)
/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse UpgradeBox.
 * 
 * @author (Justin, Laurenz) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class UpgradeBox extends Textbox
{
    /**
     * Act - tut, was auch immer UpgradeBox tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */

    int creditCost = 10000;
    int steelCost = 5000;
    double increase = 1.1;
    public static int getCredits() {
        return HomePlanet.credits;
    }

    public void act(){
        
    }
    
    public void upgrade(){
        //erhöht passives Einkomen pro runde um 10%
        if(Greenfoot.mouseClicked(this) && HomePlanet.credits>=creditCost && 
        HomePlanet.steel>= steelCost){
            HomePlanet.passiveIncome = HomePlanet.passiveIncome *  increase;
        }    
    }
}
