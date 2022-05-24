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
    private Soldier soldier;
    private int directionShot=2;
    private boolean shot=false;
    
    public Soldier(){
        images = new GreenfootImage[3];
        images[0] = new GreenfootImage("mov.png");
        images[1] = new GreenfootImage("mov2.png");
        images[2] = new GreenfootImage("mov1.png");
    }
    public void act(){
        runSoldier();
        
        moveSoldier();
        
        setShot(directionShot);
    }
    public void setShot(int direction){
        if(shot && Greenfoot.isKeyDown("x")){
           Shoot s=new Shoot(direction);
           getWorld().addObject(s,getX(),getY()); 
           shot=false;
        }   
        if(!shot && !Greenfoot.isKeyDown("x")){
            shot=true;
        }
    }
    private void moveSoldier(){
        if(Greenfoot.isKeyDown("up")){
            setDirection(UP);
            directionShot=2;
        }
        if(Greenfoot.isKeyDown("down")){
            setDirection(DOWN);
            directionShot=2;
        }
        if(Greenfoot.isKeyDown("left")){
            setDirection(LEFT);
            directionShot=2;
        }
        if(Greenfoot.isKeyDown("right")){
            setDirection(RIGHT);
            directionShot=2;
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