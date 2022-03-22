import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot und MouseInfo)

/**
 * Spaceship is superclass of all Ships
 * 
 * @author (Luca, Jason) Tin
 * @version 03.02.2022
 */
public abstract class Spaceship extends Actor
{

    
    private int velocity; //in x/y pro runde z.B. 10 pro runde
    
    private int moveDeltaX, moveDeltaY;
    private int roundForMoveNeeded;
    private int currentMoveRound;
   
    

    /**
     * Spaceship appears on positio
     */
    public Spaceship(int x, int y, int velocity){
        this.setLocation(x, y);
        this.velocity = velocity;
    }

    /**
     * Spaceship appears on position of Planet
     */
    public Spaceship(Planet planet, int velocity){
        this(planet.getX(), planet.getY(), velocity);
    }
    
    public abstract void onFinish();
    public abstract String getName();

    /**
     * Moves Ship after every round
     */
    public void act() 
    {
    if(currentMoveRound < roundForMoveNeeded) {
           this.setLocation(this.getX() + moveDeltaX, this.getY() + moveDeltaY);
           this.currentMoveRound++;
           
        }else {
            onFinish();
        }
        
    } 
    
    /**
     * Spaceship moves in some rounds (based on velocity) to the given endposition
    */
    public void setEndPosition(int x, int y){
        
        if((roundForMoveNeeded = roundNeededForMove(x, y)) == 0)
            roundForMoveNeeded = 1;
           
        currentMoveRound = 0;
        moveDeltaX = (x - this.getX()) / roundForMoveNeeded;
        moveDeltaY = (y - this.getY()) / roundForMoveNeeded;
    }
    
    /**
     * Removes actor from Space-Map
     */
    private void removeActor() {
         getWorld().removeObject(this);
    }
    
    /**
     * Returns needed number of rounds for move to Position
     */
    public int roundNeededForMove(int x, int y){
        int deltaX = this.getX() - x;
        int deltaY = this.getY() - y;
        double length = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return (int) Math.round(length / velocity);
    }
    
    
}