import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AsteroidEvent here.
 * 
 * @author Jason
 * @version 16.03.2022
 */
public class AsteroidEvent extends Event
{
    GifImage gifImage = new GifImage("Asteroidrain.gif");
    public void startEvent(Planet target){
        setImage(gifImage.getCurrentImage());
    }
}
