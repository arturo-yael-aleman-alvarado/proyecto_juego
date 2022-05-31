import greenfoot.*; 
public class History2 extends World
{
    public History2()
    {    
        super(600, 400, 1); 
        NPC4 npc4 = new NPC4();
        addObject(npc4,90,80);
        NPC5 npc5 = new NPC5();
        addObject(npc5,400,304);
        Greenfoot.playSound("C:/Users/lenovo/OneDrive/Escritorio/Jueguito/TheLastManStanding/sounds/history.mp3");
        getBackground().drawImage(new GreenfootImage("Press Enter ", 24, new Color(250,0,0), null), 470, 300);
        getBackground().drawImage(new GreenfootImage("To Continue", 24, new Color(250,0,0), null), 470, 320);
        getBackground().drawImage(new GreenfootImage("Lo logramos, ese camino tenia una complejidad ", 24, new Color(0,0,250), null), 150, 30);
        getBackground().drawImage(new GreenfootImage("2^n, solo el gran Big O podria pasarlo si ningun", 24, new Color(0,0,250), null), 150, 50);
        getBackground().drawImage(new GreenfootImage("rasguño.", 24, new Color(0,0,250), null), 150, 70);
        getBackground().drawImage(new GreenfootImage("Pero estamos vivos, pero, ¿por cuanto tiempo?, ", 24, new Color(0,0,250), null), 150, 90);
        getBackground().drawImage(new GreenfootImage("bueno sigamos debemos, pasar por la playa ", 24, new Color(0,0,250), null), 150, 110);
        getBackground().drawImage(new GreenfootImage("pero ojo esta infestada de minas, yo reconocere", 24, new Color(0,0,250), null), 150, 130);
        getBackground().drawImage(new GreenfootImage("el camino, muchacho estamos haciendo commit.", 24, new Color(0,0,250), null), 150, 150);
        getBackground().drawImage(new GreenfootImage("¡¿Como escapo?!", 24, new Color(128,128,128), null), 10, 250);
        getBackground().drawImage(new GreenfootImage("Debemos llamar a nuestro ", 24, new Color(128,128,128), null), 10, 270);
        getBackground().drawImage(new GreenfootImage("mejor armamento!!!", 24, new Color(128,128,128), null), 10, 290);
        getBackground().drawImage(new GreenfootImage("Almenos las minas los ", 24, new Color(128,128,128), null), 10, 310);
        getBackground().drawImage(new GreenfootImage("distrairan un poco ...", 24, new Color(128,128,128), null), 10, 330);
    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Level2());
        }
     }
}
