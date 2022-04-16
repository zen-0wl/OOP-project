import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Menu extends Window
{
    GreenfootSound music = new GreenfootSound ("Forest.wav");
    
    public void started()
    {
        music.setVolume(35);
        music.play();
    }
    
    public void stopped()
    {
        music.stop();
    }
    
    public Menu()
    {
    }
}
