import greenfoot.*; 
public class GameOver extends Visualizers
{
    private GreenfootImage image;
    private String message;
    public GameOver()
    {
        //Greenfoot.playSound("sounds/Death.mp3");
        image=new GreenfootImage(400,300);
        image.setColor(new Color(250,100,0,255));
        image.setFont(new Font("Verdana",true,true,34));
        image.drawString("Game Over :(",0,30);
        setImage(image);
        Greenfoot.stop();
    }
    public void act()
    {
        
    }
}
