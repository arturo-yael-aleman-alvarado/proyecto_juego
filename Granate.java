import greenfoot.*; 
public class Granate extends Item
{
    public void act()
    {
        move(2);
        World n=getWorld();
        if(getX()>=n.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY()>=n.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        Actor Soldier=getOneObjectAtOffset(0,0,Soldier.class);
        if(Soldier!=null){
            MyWorld world=(MyWorld)getWorld();
            getWorld().removeObject(Soldier);
            world.lifes.decrease();
            getWorld().addObject(new Soldier(),50,300);
            if(world.lifes.returnCont()==0){
                GameOver gm=new GameOver();
                getWorld().addObject(gm,((getWorld().getWidth()/2)+50),((getWorld().getHeight()/2)+150));
            }
        }
    }
}

