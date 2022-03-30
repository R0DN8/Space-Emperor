import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse NextRound.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class NextRound extends Actor
{
    /**
     * Act - tut, was auch immer NextRound tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    int roundCounter = 0;
    Text t = new Text();
    
    public void act() 
    {
        Space mySpace = (Space)getWorld();
        mySpace.showMessage("Next Round", 50, 800, 500); 
        
          

        if(Greenfoot.mouseClicked(this)){
            if(roundCounter == 0){
                //Text t = new Text();
                mySpace.addObject(t, 500, 500); 
                roundCounter = 1;
            }
            else {
                //Text t = (Text)getOneObjectAtOffset(-826, -600, Text.class);
                t.setText("funktionierender Text yay", 800, 500, 20);
                
                roundCounter++;
                
                
            }
        }    
    }    
}