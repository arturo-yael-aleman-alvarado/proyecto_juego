import greenfoot.*;
public class Soldier extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    private static final int MAX_COUNTER_MOVE = 10;
    
    private GreenfootImage []images;
    
    private int counterMove;
    private int currentImage;
    private SoldierHud soldierHud;
    
    public Soldier(SoldierHud soldierHud){
        images = new GreenfootImage[3];
        images[0] = new GreenfootImage("mov.png");
        images[1] = new GreenfootImage("mov2.png");
        images[2] = new GreenfootImage("mov1.png");
        this.soldierHud = soldierHud;
    }
    public void act()
    {
        runSoldier();
        
        moveSoldier();
    }
    private void moveSoldier(){
        if(Greenfoot.isKeyDown("up")){
            setDirection(UP);
        }
        if(Greenfoot.isKeyDown("down")){
            setDirection(DOWN);
        }
        if(Greenfoot.isKeyDown("left")){
            setDirection(LEFT);
        }
        if(Greenfoot.isKeyDown("right")){
            setDirection(RIGHT);
        }
    }
    public void setDirection(int direction){
        switch(direction){
            case UP:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX(),getY()-13);
                }
                else{
                    setLocation(getX(),getY()-1);
                }
            break;
            case DOWN:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX(),getY()+13);
                }
                else{
                    setLocation(getX(),getY()+1);
                }
            break;
            case LEFT:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()-13,getY());
                }
                else{
                    setLocation(getX()-1,getY());
                }
            break;
            case RIGHT:
                setRotation(0);
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()+13,getY());
                }
                else{
                    setLocation(getX()+1,getY());
                }
            break;
        }
    }
    private void runSoldier(){
        counterMove++;
        
        if(counterMove == MAX_COUNTER_MOVE){
            counterMove = 0;
            setImage(images[currentImage]);
            currentImage = (currentImage + 1)%images.length;
        }
    }
}