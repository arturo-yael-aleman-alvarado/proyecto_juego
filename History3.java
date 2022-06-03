import greenfoot.*;  
public class History3 extends World
{
    public History3()
    {    
        super(600, 400, 1); 
        Greenfoot.playSound("C:/Users/lenovo/OneDrive/Escritorio/Jueguito/TheLastManStanding/sounds/history.mp3");
        getBackground().drawImage(new GreenfootImage("Press Enter ", 24, new Color(250,0,0), null), 20, 300);
        getBackground().drawImage(new GreenfootImage("To Continue", 24, new Color(250,0,0), null), 20, 320);
        getBackground().drawImage(new GreenfootImage("Oooh Nooo!!! ", 24, new Color(0,0,250), null), 150, 30);
        getBackground().drawImage(new GreenfootImage("Eh sido capturado ", 24, new Color(0,0,250), null), 150, 50);
        getBackground().drawImage(new GreenfootImage("muchacho. Huye!!!", 24, new Color(0,0,250), null), 150, 70);
        getBackground().drawImage(new GreenfootImage("Que diria el gran ", 24, new Color(0,0,250), null), 150, 90);
        getBackground().drawImage(new GreenfootImage("Big O, si me viera", 24, new Color(0,0,250), null), 150, 110);
        getBackground().drawImage(new GreenfootImage("¿Que haces muchacho?", 24, new Color(0,0,250), null), 150, 130);
        getBackground().drawImage(new GreenfootImage("No lo lograras!!!", 24, new Color(0,0,250), null), 150, 150);
        getBackground().drawImage(new GreenfootImage("JAJAJJAJAJJAJAJAJA", 24, new Color(128,128,128), null), 150, 250);
        getBackground().drawImage(new GreenfootImage("Traigan a nuestro ", 24, new Color(128,128,128), null), 150, 270);
        getBackground().drawImage(new GreenfootImage("amiguito, haber si", 24, new Color(128,128,128), null), 150, 290);
        getBackground().drawImage(new GreenfootImage("esto es de tu talla.", 24, new Color(128,128,128), null), 150, 310);
        getBackground().drawImage(new GreenfootImage("Contra el!!! ...", 24, new Color(128,128,128), null), 150, 330);
        prepare();
    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new FinalLevel());
        }
    }
    private void prepare()
    {
        NPC6 nPC6 = new NPC6();
        addObject(nPC6,86,95);
        NPC3 nPC3 = new NPC3();
        addObject(nPC3,66,288);
        NPC5 nPC5 = new NPC5();
        addObject(nPC5,206,104);
        nPC3.setLocation(552,272);
        NPC5 nPC52 = new NPC5();
        addObject(nPC52,333,77);
        NPC5 nPC53 = new NPC5();
        addObject(nPC53,465,105);
        nPC5.setLocation(289,86);
        nPC5.setLocation(266,124);
        nPC53.setLocation(556,92);
        nPC5.setLocation(334,164);
        nPC53.setLocation(198,188);
        nPC5.setLocation(565,81);
        nPC52.setLocation(497,130);
        nPC53.setLocation(323,181);
        nPC5.setLocation(440,93);
        nPC53.setLocation(495,136);
    }
}
