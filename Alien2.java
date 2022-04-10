import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Alien2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Alien2 extends AlienPlanet
{
    Space mySpace = (Space)getWorld();
    //combat system:
    public static boolean win;

    public static double defensivePower2 = 1000;
    public static double defensiveSigma2 = defensivePower2*0.1;

    double lowerBoundDef2 = defensivePower2-(1.5*defensiveSigma2);
    double upperBoundDef2 = defensivePower2+(2*defensiveSigma2); // intervall von 850-1200

    public static double trueOffensivePower2;
    public static double trueDefensivePower2;

    public static double shield = 1000;

    Text victory = new Text();
    Text lose = new Text();

    GifImage gifAlien2 = new GifImage("Alienplanet2.gif");
    public Alien2(int x, int y){
        super(x, y);
    }

    /**
     * Act - tut, was auch immer Alien2 tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        setImage(gifAlien2.getCurrentImage());


        getWorld().addObject(victory, 500, 500);//diese Sachen werden in CombatBox nicht geladen, wodurch kein Text erscheint --> muss noch gefixt werden
        getWorld().addObject(lose, 500, 500);
        if (Greenfoot.mouseClicked(this)){
            /*
            mySpace.addObject(NilsSeinInterface(), 250, 250);*/
            startCombat();
        }

        if (Greenfoot.mouseClicked(this)){
            testShowBox2();
        }
    }    

    public void startCombat(){
        HomePlanet.trueOffensivePower = 
        (int )(Math.random() * ((HomePlanet.upperBoundAtk)-(HomePlanet.lowerBoundAtk))) + (HomePlanet.lowerBoundAtk);

        trueDefensivePower2 = 
        (int )(Math.random() * ((upperBoundDef2)-(lowerBoundDef2))) + (lowerBoundDef2);

        if(HomePlanet.trueOffensivePower>trueDefensivePower2){
            shield = shield - Fighter.damage;
            HomePlanet.fleetSize = HomePlanet.fleetSize + 1000;

            win = true;            
            String win ="victory";
            victory.setText(win, 100, 50, 20);
        }

        else{

            /*getWorld().removeObjects(getWorld().getObjects(Fighter.class));
            getWorld().removeObject(fighter);*/

            win= false;
            String lose ="defeat";
            victory.setText(lose, 100, 50, 20);
        }
    }  
}