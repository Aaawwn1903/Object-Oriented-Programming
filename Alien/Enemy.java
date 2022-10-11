import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{public int speed = 3;
    public Enemy()
    {
        setRotation(180);
        
    }
    public void act()
    {
        move(speed);
    }
    public void edge (){
        if (isAtEdge())
            setLocation(0,getY());
    }
    public Enemy(int speed)
    {
        setRotation(180);
        this.speed = speed;
    }
    
}
