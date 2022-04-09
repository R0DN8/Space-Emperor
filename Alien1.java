import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Alien1.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Alien1 extends AlienPlanet
{
    //combat system:
    public static double defensivePower1 = 1000;
    public static double defensiveSigma1 = defensivePower1*0.2;

    double lowerBoundDef1 = defensivePower1-defensiveSigma1;
    double upperBoundDef1 = defensivePower1+defensiveSigma1;

    public static double trueOffensivePower1;
    public static double trueDefensivePower1;

    public static double shield = 1000;
    
    GifImage gifAlien1 = new GifImage("Alienplanet1.gif");
    public Alien1(int x, int y){
        super(x, y);
    }
    /**
     * Act - tut, was auch immer Alien1 tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
        setImage(gifAlien1.getCurrentImage());
    }    
    public void startCombat(){
        HomePlanet.trueOffensivePower = 
        (int )(Math.random() * ((HomePlanet.upperBoundAtk)-(HomePlanet.lowerBoundAtk))) + (HomePlanet.lowerBoundAtk);

        trueDefensivePower1 = 
        (int )(Math.random() * ((upperBoundDef1)-(lowerBoundDef1))) + (lowerBoundDef1);

        if(HomePlanet.trueOffensivePower>trueDefensivePower1){
            shield = shield - Fighter.damage;
        }
        else{
            //getWorld().removeObject();
        }
    }
}