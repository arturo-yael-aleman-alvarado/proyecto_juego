import greenfoot.*;  
public class History extends World
{
    public History()
    {    
        super(600, 400, 1); 
        NPC2 npc2 = new NPC2();
        addObject(npc2,62,80);
        NPC3 npc3 = new NPC3();
        addObject(npc3,400,304);
Greenfoot.playSound("sounds/history.mp3");
        getBackground().drawImage(new GreenfootImage("Press Enter ", 24, new Color(250,0,0), null), 470, 300);
        getBackground().drawImage(new GreenfootImage("To Continue", 24, new Color(250,0,0), null), 470, 320);
        getBackground().drawImage(new GreenfootImage("¡Cuidado soldado eres el ultimo de tu peloton! ", 24, new Color(0,0,250), null), 150, 30);
        getBackground().drawImage(new GreenfootImage("Las cosas no estan tan ´ISI´,  dejame guiarte", 24, new Color(0,0,250), null), 150, 50);
        getBackground().drawImage(new GreenfootImage("por este camino. ", 24, new Color(0,0,250), null), 150, 70);
        getBackground().drawImage(new GreenfootImage("Primero debes atravesar el campo verde", 24, new Color(0,0,250), null), 150, 90);
        getBackground().drawImage(new GreenfootImage("¡Pero cuidado con las granadas!,  si te toca una ", 24, new Color(0,0,250), null), 150, 110);
        getBackground().drawImage(new GreenfootImage("bueno ya sabemos que pasa, ¡Voy primero!", 24, new Color(0,0,250), null), 150, 130);
        getBackground().drawImage(new GreenfootImage("Si señor nosotros acabamos con", 24, new Color(128,128,128), null), 10, 250);
        getBackground().drawImage(new GreenfootImage("ese cabo suelto, solo es uno", 24, new Color(128,128,128), null), 10, 270);
        getBackground().drawImage(new GreenfootImage("Que tan complicado sera ...", 24, new Color(128,128,128), null), 10, 290);
    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new Level1());
        }
     }
}
