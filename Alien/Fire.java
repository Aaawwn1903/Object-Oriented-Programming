import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    int moving = 8;
    public void act()
    {
        move(moving);
        removeFromWorld();
    }
    
    public void removeFromWorld()
    {
        /*Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null)
        {
             getWorld().removeObject(enemy);
             getWorld().removeObject(this);
        }
        else if(isAtEdge())
        {
            getWorld().removeObject(this);
        }*/
        
        if (isTouching(Enemy.class)){
            Greenfoot.playSound("baah.mp3");
            getWorld().addObject(new Boom(), getX(), getY());
            removeTouching(Enemy.class);
            getWorld().removeObject(this);       
        }else if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
