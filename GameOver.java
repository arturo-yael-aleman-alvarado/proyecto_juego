import greenfoot.*; 
public class GameOver extends Visualizers
{
    GreenfootImage imagen;
    String mensaje;
    
    public GameOver()
    {
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana",true,true,34));
        imagen.drawString("Game Over :(",0,30);
        setImage(imagen);
        Greenfoot.stop();
    }
    public void act()
    {
        
    }
}
