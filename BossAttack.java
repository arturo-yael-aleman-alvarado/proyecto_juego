import greenfoot.*; 
public class BossAttack extends Item
{
    private int direction;
    public BossAttack(int way){
        direction=way;
        if(way==1)
            turn(0);
        else
            turn(180);
    }
    public void act()
    {
        move(4);
        Soldier soldier=(Soldier)getOneObjectAtOffset(0,0,Soldier.class);
        if(soldier!=null){
            FinalLevel finalWorld=(FinalLevel)getWorld();
            getWorld().removeObject(soldier);
            finalWorld.lifes.decrease();
            getWorld().addObject(new Soldier(),50,300);
            if(finalWorld.lifes.returnCont()==0){
                GameOver gameover=new GameOver();
                getWorld().addObject(gameover,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
            }
            getWorld().removeObject(this);
        }
        else
        if((getX()>=getWorld().getWidth()-5||(getX()<=5))){
            getWorld().removeObject(this);
        }
        else
        if((getY()>=getWorld().getHeight()-5||(getY()<=5))){
            getWorld().removeObject(this);
        }
    }
}
