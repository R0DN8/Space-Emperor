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

    int creditCost = 1000;
    int steelCost = 500;
    double i = 1.1; //i für increase
    int upgradeTime = 3;
    int remainingTime;
    boolean upgrading = false; //Indikator, der anzeigt, ob das Upgrade läuft oder nicht
    public void upgrade(){
        /*if(Greenfoot.mouseClicked(this) && HomePlanet.credits>=creditCost && HomePlanet.steel>= steelCost){
        remainingTime = upgradeTime;
        upgrading = true;
        HomePlanet.credits = HomePlanet.credits - creditCost;
        HomePlanet.steel = HomePlanet.steel - steelCost;
        }    
        else{
        GreenfootImage Fehlertext = new GreenfootImage("zu wenige Ressourcen!", 5 , Color.RED, null);
        getBackround().drawImage(Fehlertext, x, y);
        }*/

    }

    public boolean getUpgradingStatus(){ //kontroll-Command für den Upgrade Status
        if(upgrading == true){
            return true;
        } 
        else{
            return false;
        }
    }

    public static double getpassiveIncome(){ //kontroll-Command für das passive Einkommen
        return HomePlanet.passiveIncome;
    }

    public static int getCredits() { //kontroll-Command für die credits
        return HomePlanet.credits;
    }

    public void act(){
        if(Greenfoot.mouseClicked(this)&& HomePlanet.credits >= creditCost && HomePlanet.steel >= steelCost && upgrading == false){
            remainingTime = upgradeTime;
            upgrading = true;
            HomePlanet.credits = HomePlanet.credits - creditCost;
            HomePlanet.steel = HomePlanet.steel - steelCost;
        }    
        else{
            /*
            if(Greenfoot.mouseClicked(this) && upgrading == false){
            GreenfootImage Fehlertext = new GreenfootImage("zu wenige Ressourcen!", 5 , Color.RED, null);
            getBackround().drawImage(Fehlertext, x, y);
            }
             */
        }

        if(upgrading == true){
            remainingTime = remainingTime - 1;
            if(remainingTime == 0){
                HomePlanet.passiveIncome = HomePlanet.passiveIncome * i;
            }
        }
    }
}
