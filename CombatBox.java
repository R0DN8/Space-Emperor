import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse CombatBox.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class CombatBox extends Textbox
{
    
    Text victory = new Text();
    Text lose = new Text();
    /**
     * Act - tut, was auch immer CombatBox tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        Space mySpace = (Space)getWorld();
        mySpace.addObject(victory, 1500, 1500);
        mySpace.addObject(lose, 1500, 1500);
        
        CombatBox combatbox1 = new CombatBox();
        CombatBox combatbox2 = new CombatBox();
        CombatBox combatbox3 = new CombatBox();
        if(Greenfoot.mouseClicked(combatbox1)){
            mySpace.getAlien1().startCombat();
            if(Alien1.win == true){
                String win ="victory";
                victory.setText(win, 500, 500, 20);
            }
            else{
                if(Alien1.win == false){
                    String lose ="defeat";
                    victory.setText(lose, 500, 500, 20);
                }
            }
        }
        if(Greenfoot.mouseClicked(combatbox2)){
            mySpace.getAlien2().startCombat();
            if(Alien2.win == true){
                String win ="victory";
                victory.setText(win, 500, 500, 20);
            }
            else{
                if(Alien2.win == false){
                    String lose ="defeat";
                    victory.setText(lose, 500, 500, 20);
                }
            }
        }
        if(Greenfoot.mouseClicked(combatbox3)){
            mySpace.getAlien3().startCombat();
            if(Alien3.win == true){
                String win ="victory";
                victory.setText(win, 500, 500, 20);
            }
            else{
                if(Alien3.win == false){
                    String lose ="defeat";
                    victory.setText(lose, 500, 500, 20);
                }
            }
        }
    }    
}