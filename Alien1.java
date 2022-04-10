import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Alien1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Alien1 extends AlienPlanet
{
    Space mySpace = (Space)getWorld();

    static boolean arrived = false;
    public static boolean win;
    //combat system:
    public static double defensivePower1 = 1000;
    public static double defensiveSigma1 = defensivePower1*0.2;

    double lowerBoundDef1 = defensivePower1-defensiveSigma1;
    double upperBoundDef1 = defensivePower1+defensiveSigma1; //Intervall von 800-1200

    public static double trueOffensivePower1;
    public static double trueDefensivePower1;

    public static double shield = 1000;

    int travelTime = 3;

    GifImage gifAlien1 = new GifImage("Alienplanet1.gif");

    Text victory = new Text();
    Text lose = new Text();

    public Alien1(int x, int y){
        super(x, y);
    }

    /**
     * Act - tut, was auch immer Alien1 tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        setImage(gifAlien1.getCurrentImage());

        Space mySpace = (Space)getWorld();
        mySpace.addObject(victory, 1500, 1500);//diese Sachen werden in CombatBox nicht geladen, wodurch kein Text erscheint --> muss noch gefixt werden
        mySpace.addObject(lose, 1500, 1500);

        if (Greenfoot.mouseClicked(this)){
            testShowBox1();
        }
        
    }    

    /*public void checkCounter(){
    int arrivalRound = NextRound.roundCounter + travelTime;
    int currentRound = NextRound.roundCounter;
    if(arrivalRound == NextRound.roundCounter){
    arrived = true;
    }
    }*/

    public void startCombat(){
        /*int currentRound = NextRound.roundCounter; //momentane Runde
        int arrivalRound = currentRound + travelTime; //Runde in der das Schiff ankommt
        mySpace.getHomeplanet().fleetSize = mySpace.getHomeplanet().fleetSize - 1000;

        if(arrived == true){ 

        }*/

        HomePlanet.trueOffensivePower = 
        (int )(Math.random() * ((HomePlanet.upperBoundAtk)-(HomePlanet.lowerBoundAtk))) + (HomePlanet.lowerBoundAtk);

        trueDefensivePower1 = 
        (int )(Math.random() * ((upperBoundDef1)-(lowerBoundDef1))) + (lowerBoundDef1);

        if(HomePlanet.trueOffensivePower>trueDefensivePower1){
            shield = shield - Fighter.damage;
            HomePlanet.fleetSize = HomePlanet.fleetSize + 1000;
            
            win=true;
            String win ="victory";
            victory.setText(win, 500, 500, 20);
        }

        else{

            /*getWorld().removeObjects(getWorld().getObjects(Fighter.class));
            getWorld().removeObject(fighter);*/
            
            win=false;
            String lose ="defeat";
            victory.setText(lose, 500, 500, 20);
        }
    }
}