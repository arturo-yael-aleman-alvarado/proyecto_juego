import greenfoot.*; 
public class Granate extends Item
{
    public static int lose1=0;
    public void act()
    {
        move(2);
        World world=getWorld();
        if(getX()>=world.getWidth()-5||getX()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        if(getY()>=world.getHeight()-5||getY()<=5){
            turn(180);
            if(Greenfoot.getRandomNumber(100)<90){
                turn(Greenfoot.getRandomNumber(90-45));
            }
        }
        
        Actor Soldier=getOneObjectAtOffset(0,0,Soldier.class);
        if(Soldier!=null){
            Level1 level1=(Level1)getWorld();
            getWorld().removeObject(Soldier);
            level1.lifes.decrease();
            getWorld().addObject(new Soldier(),50,300);
            if(level1.lifes.returnCont()==0){
                lose1++;
                Greenfoot.setWorld(new RecordsLevel());;
                //GameOver gameover=new GameOver();
                //getWorld().addObject(gameover,((getWorld().getWidth()/2)+50),((getWorld().getHeight()/2)+150));
            }
        }
    }
}

