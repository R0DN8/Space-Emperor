import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Alien2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Alien3 extends AlienPlanet
{
    Space mySpace = (Space)getWorld();
    //combat system:

    public static boolean win;

    public static double defensivePower3 = 1000;
    public static double defensiveSigma3 = defensivePower3*0.1;

    double lowerBoundDef3 = defensivePower3-defensiveSigma3;
    double upperBoundDef3 = defensivePower3+(3*defensiveSigma3); //intervall von 900-1300

    public static double trueOffensivePower3;
    public static double trueDefensivePower3;

    public static double shield = 1000;

    Text victory = new Text();
    Text lose = new Text();

    GifImage gifAlien3 = new GifImage("Alienplanet3.gif");
    public Alien3(int x, int y){
        super(x, y);
    }

    /**
     * Act - tut, was auch immer Alien3 tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        setImage(gifAlien3.getCurrentImage());

        getWorld().addObject(victory, 500, 500);//diese Sachen werden in CombatBox nicht geladen, wodurch kein Text erscheint --> muss noch gefixt werden
        getWorld().addObject(lose, 500, 500);
        if (Greenfoot.mouseClicked(this)){
            /*
            mySpace.addObject(NilsSeinInterface(), 250, 250);*/
            startCombat();
        }

        if (Greenfoot.mouseClicked(this)){
            testShowBox3();
        }
    }

    public void startCombat(){
        HomePlanet.trueOffensivePower = 
        (int )(Math.random() * ((HomePlanet.upperBoundAtk)-(HomePlanet.lowerBoundAtk))) + (HomePlanet.lowerBoundAtk);

        trueDefensivePower3 = 
        (int )(Math.random() * ((upperBoundDef3)-(lowerBoundDef3))) + (lowerBoundDef3);

        if(HomePlanet.trueOffensivePower>trueDefensivePower3){
            shield = shield - Fighter.damage;
            HomePlanet.fleetSize = HomePlanet.fleetSize + 1000;

            win = true;
            String win ="victory";
            victory.setText(win, 100, 50, 20);
        }

        else{

            /*getWorld().removeObjects(getWorld().getObjects(Fighter.class));
            getWorld().removeObject(fighter);*/

            win = false;
            String lose ="defeat";
            victory.setText(lose, 100, 50, 20);
        }
    } 
} 