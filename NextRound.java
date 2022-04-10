import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse NextRound.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class NextRound extends Actor
{
    public static int roundCounter = 0;
    Text t = new Text();
    Text uiText = new Text();
    Text testRoundCounter = new Text();
    public void act() 
    {
        Space mySpace = (Space)getWorld();
        HomePlanet myHome = mySpace.getHomeplanet();
        
        mySpace.addObject(uiText, 1040, 120);
        mySpace.addObject(testRoundCounter, 950, 900);
        
        if(Greenfoot.mouseClicked(this)){
            if(roundCounter == 0){
                //Text t = new Text();
                //mySpace.addObject(t, 500, 500); 
                roundCounter = 1;
            }
            else {
                // Round Update
                myHome.roundIncome();
                
                // HomePlanet Stats Update
                String uiString = "Homeplanet Stats: \nCredits: "
                + (int) myHome.credits + " "
                + "\nFleetpower: "
                + myHome.fleetSize
                + "\nElectricalParts: "
                + myHome.electricalParts
                + "\nSteel: "
                + myHome.steel
                ;
                
                uiText.setText(uiString, 500, 300, 20);
                
                String testRound = "Round" + roundCounter;
                testRoundCounter.setText(testRound, 300, 100, 20);
                
                for(Spaceship ship : getWorld().getObjects(Spaceship.class)){
                    ship.move();
                }
                
                
                // hier schmeißt er ne NullPointerException,
                // wenn Next Round Button gedrückt wird:
                //EventManager.getStaticEvent().nextRound();
                roundCounter++;
            }
        }    
    }    
}