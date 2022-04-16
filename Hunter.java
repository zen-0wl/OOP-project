import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hunter extends Actor
{
    SimpleTimer shotTimer = new SimpleTimer();
    int shot_interval = 250;
    int move_val = 5;
    
    public void act()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + move_val, getY());  
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - move_val, getY()); 
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - move_val);  
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + move_val); 
        }
    
        // This is where hunter shoots
        if (Greenfoot.isKeyDown("space") && shotTimer.millisElapsed() > shot_interval)
        {
            getWorld().addObject(new Arrows(), getX(), getY()); 
            shotTimer.mark();
            Greenfoot.playSound("Arrow Whooshes.wav");
        }
    }
}
