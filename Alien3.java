import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Alien3.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Alien3 extends AlienPlanet
{
    //combat system:
    public static double defensivePower3 = 1000;
    public static double defensiveSigma3 = defensivePower3*0.2;

    double lowerBoundDef3 = defensivePower3-defensiveSigma3;
    double upperBoundDef3 = defensivePower3+defensiveSigma3;

    public static double trueOffensivePower3;
    public static double trueDefensivePower3;

    public static double shield = 1000;
    
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
        // Ergänzen Sie Ihren Quelltext hier...
        setImage(gifAlien3.getCurrentImage());
    }
    public void startCombat(){
        HomePlanet.trueOffensivePower = 
        (int )(Math.random() * ((HomePlanet.upperBoundAtk)-(HomePlanet.lowerBoundAtk))) + (HomePlanet.lowerBoundAtk);

        trueDefensivePower3 = 
        (int )(Math.random() * ((upperBoundDef3)-(lowerBoundDef3))) + (lowerBoundDef3);

        if(HomePlanet.trueOffensivePower>trueDefensivePower3){
            shield = shield - Fighter.damage;
        }
        else{
            //getWorld().removeObject();
        }
    } 
}