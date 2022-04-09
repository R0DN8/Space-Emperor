import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Ergänzen Sie hier eine Beschreibung für die Klasse Alien2.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Alien2 extends AlienPlanet
{
    //combat system:
    public static double defensivePower2 = 1000;
    public static double defensiveSigma2 = defensivePower2*0.2;

    double lowerBoundDef2 = defensivePower2-defensiveSigma2;
    double upperBoundDef2 = defensivePower2+defensiveSigma2;

    public static double trueOffensivePower2;
    public static double trueDefensivePower2;

    public static double shield = 1000;
    
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
        // Ergänzen Sie Ihren Quelltext hier...
        setImage(gifAlien2.getCurrentImage());
    }    
    public void startCombat(){
        HomePlanet.trueOffensivePower = 
        (int )(Math.random() * ((HomePlanet.upperBoundAtk)-(HomePlanet.lowerBoundAtk))) + (HomePlanet.lowerBoundAtk);

        trueDefensivePower2 = 
        (int )(Math.random() * ((upperBoundDef2)-(lowerBoundDef2))) + (lowerBoundDef2);

        if(HomePlanet.trueOffensivePower>trueDefensivePower2){
            shield = shield - Fighter.damage;
        }
        else{
            //getWorld().removeObject();
        }
    }  
}