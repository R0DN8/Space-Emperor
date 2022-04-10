import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse AlienPlanet.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class AlienPlanet extends Planet
{
    int fleetSize;
    int xCoord;
    int yCoord;
    int credits;
    public static int travelTime; //in Runden
    public static boolean isOpen = false;
    Text enemyInfo = new Text();
    CombatBox combatbox1 = new CombatBox();
    CombatBox combatbox2 = new CombatBox();
    CombatBox combatbox3 = new CombatBox();
    
    //Enemy
    private Enemy enemy;
    public AlienPlanet(int x, int y){
        super(x, y);
        enemy = new Enemy(this);
        fleetSize = 0;
        credits = 0;
    }

    /**
     * Act - tut, was auch immer AlienPlanet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        
    }    

    public void testShowBox1()
    {
        if(isOpen == false){
            getWorld().addObject(enemyInfo, 1040, 300);
            getWorld().addObject(combatbox1, 990, 290);

            String enemyInfoString = "Alienplanet Stats: "
                + "\nWinning chance:  " 
                +  fleetSize
                + "\nTraveltime: "
                + "Justin hier muss dein Travel Time" 
            ;
            enemyInfo.setText(enemyInfoString, 500, 300, 20);
            
            
            isOpen = true;
        }else{
            getWorld().removeObject(enemyInfo);
            getWorld().removeObject(combatbox1);
            isOpen = false;
        }
    }
    
    public void testShowBox2()
    {
        if(isOpen == false){
            getWorld().addObject(enemyInfo, 1040, 300);
            getWorld().addObject(combatbox2, 990, 290);

            String enemyInfoString = "Alienplanet Stats: "
                + "\nWinning chance:  " 
                +  fleetSize
                + "\nTraveltime: "
                + "Justin hier muss dein Travel Time" 
            ;
            enemyInfo.setText(enemyInfoString, 500, 300, 20);
            
            
            isOpen = true;
        }else{
            getWorld().removeObject(enemyInfo);
            getWorld().removeObject(combatbox2);
            isOpen = false;
        }
    }
    
    public void testShowBox3()
    {
        if(isOpen == false){
            getWorld().addObject(enemyInfo, 1040, 300);
            getWorld().addObject(combatbox3, 990, 290);

            String enemyInfoString = "Alienplanet Stats: "
                + "\nWinning chance:  " 
                +  fleetSize
                + "\nTraveltime: "
                + "Justin hier muss dein Travel Time" 
            ;
            enemyInfo.setText(enemyInfoString, 500, 300, 20);
            
            
            isOpen = true;
        }else{
            getWorld().removeObject(enemyInfo);
            getWorld().removeObject(combatbox3);
            isOpen = false;
        }
    }
}