import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Heimatplanet: Child von abstrakter Klasse Planet
 * 
 * IN ENGLISH PLEASE!!
 * 
 * @author Tin, Angelina (Nils, Nico) 
 * @version 03.02.2022
 */
public class HomePlanet extends Planet
{
    //ressourcen:
    public static int credits;
    public static int fleetSize;
    public static int steel;
    public static int electricalParts;

    //doubles zum upgraden:
    public static double passiveIncome = 1000;//x amount of credit per round
    public static double offensivePower = 1000;
    
    //Combat system 
    //abweichung (wie das Sigma bei Normalverteilung):
    public static double offensiveSigma = offensivePower*0.2;
    
    //obere/untere grenze des intervalls
    static double lowerBoundAtk = offensivePower-offensiveSigma;
    static double upperBoundAtk = offensivePower+offensiveSigma;
    
    public static double trueOffensivePower;
    public static double trueDefensivePower;
    
    //koordinaten:
    int xCoord;
    int yCoord;
    
    GifImage gifHomePlanet = new GifImage("homeplanet.gif");

    // Konstruktor
    public HomePlanet(int x, int y){
        super(x, y);
        fleetSize = 10000;
        HomePlanet.credits = 100000;
        HomePlanet.steel = 5000;
        electricalParts = 5;
    }

    public int getCredits(){
        return credits;
    }
    
    public double roundIncome(){
        //credits += passiveIncome;
        return credits+=passiveIncome;
    }

    /**
     * Act - tut, was auch immer Planet tun will. Diese Methode wird aufgerufen, 
     * sobald der 'Act' oder 'Run' Button in der Umgebung angeklickt werden. 
     */
    public void act() 
    {
        // Ergänzen Sie Ihren Quelltext hier...
        setImage(gifHomePlanet.getCurrentImage());
    }    
}