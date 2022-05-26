import greenfoot.*; 
public class Mine extends Item
{
    public void act()
    {
        Actor Soldier=getOneObjectAtOffset(0,0,Soldier.class);
        if(Soldier!=null){
            Level2 world=(Level2)getWorld();
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
