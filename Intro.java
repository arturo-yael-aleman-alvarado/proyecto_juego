import greenfoot.*;  
public class Intro extends World
{
    public Intro(){
        super(600, 400, 1); 
        Soldier soldier = new Soldier();
        addObject(soldier,50,202);
     
        getBackground().drawImage(new GreenfootImage("The Last Man Standing", 64, new Color(0,255,0), null), 30, 40);
        getBackground().drawImage(new GreenfootImage("       Up", 28, new Color(255,255,255), null), 350, 180);
        getBackground().drawImage(new GreenfootImage("Left  +  Right - To Move", 28, new Color(255,255,255), null), 350, 210);
        getBackground().drawImage(new GreenfootImage("     Down", 28, new Color(255,255,255), null), 350, 240);
        getBackground().drawImage(new GreenfootImage("X - To Shoot", 28, new Color(255,255,255), null), 400, 140);
        getBackground().drawImage(new GreenfootImage("Press Enter To Start", 48, new Color(250,0,0), null), 120, 300);
        getBackground().drawImage(new GreenfootImage("MADE BY FOREIGN KEY", 15, new Color(255,255,255), null), 250, 380);
        //Greenfoot.playSound("C:/Users/lenovo/OneDrive/Escritorio/Jueguito/TheLastManStanding/sounds/Sountrack.mp3");

    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new History());
            Greenfoot.playSound("sounds/Sountrack.mp3");
        }
    }
}
