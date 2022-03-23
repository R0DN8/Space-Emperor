import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.Random;

/**
 * Write a description of class Enemy here.
 * 
 * TODO: -Aktionen nach Wahrscheinlichkeit starten 
 * und Angriff erst ab bestimmter Runde.
 * -Upgrade: Truppenanzahl erhöhen oder nach Skilltree???
 * -Nichts tun implementieren
 * -Pro runde maximal einer angreifen
 * 
 * 
 * @author Jason, Luca
 * @version 23.03.2022
 */
public class Enemy extends Actor
{
    
    private int numActions = 1;
    private Planet planet;
    
    
    public Enemy(Planet planet){
        this.planet = planet;
    }
    
    
    public void act()
    {
        Random random = new Random();
        Actions[] allActions = Actions.values();
        //Execute random actions
        for(int i = 0; i < numActions; i++){
            int act = random.nextInt(allActions.length);
            execute(allActions[act]);
        }
    }
    
    private void execute(Actions action){
        switch(action){
            case ATTACK:
                executeAttack();
                break;
            case UPGRADE:
                executeUpgrade();
                break;
        }
    }
    
    public void executeAttack(){
        ArrayList<Planet> planets = (ArrayList<Planet>) getWorld().getObjects(Planet.class);
        
        planets.remove(planet);
        int target = new Random().nextInt(planets.size());
        
        //TODO wait for fightsystem
    }
    
    public void executeUpgrade(){
        
    }
    
    public enum Actions{
        ATTACK,
        UPGRADE
    }
}
