import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndGame extends World
{
    public EndGame()
    {    
        super(1000, 500, 1); 
        drawScreen(Color.BLACK, Color.RED, "GAME OVER");
    }
    
    public EndGame(Color bgColor, Color textColor, String message)
    {    
        super(1000, 500, 1); 
        drawScreen(bgColor, textColor, message);
    }
    
    public void drawScreen(Color bgColor, Color textColor, String message)
    {    
        GreenfootImage bg = new GreenfootImage(getWidth(), getHeight());
        bg.setColor(bgColor);
        bg.fillRect(0, 0, getWidth(), getHeight());
        setBackground(bg);
        Font f = new Font("SansSerif", 60);
        bg.setFont(f);
        bg.setColor(textColor);
        bg.drawString(message, getWidth() / 2 - message.length() * 20, getHeight() / 2);
    }
}

