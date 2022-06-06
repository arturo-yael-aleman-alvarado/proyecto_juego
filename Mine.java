import greenfoot.*; 
public class Mine extends Item
{
    public static int lose3=0;
    public void act()
    {
        Actor Soldier=getOneObjectAtOffset(0,0,Soldier.class);
        if(Soldier!=null){
            Level2 level2=(Level2)getWorld();
            getWorld().removeObject(Soldier);
            level2.lifes.decrease();
            getWorld().addObject(new Soldier(),50,340);
            if(level2.lifes.returnCont()==0){
                lose3++;
                Greenfoot.setWorld(new RecordsLevel());
                //GameOver gameover=new GameOver();
                //getWorld().addObject(gameover,((getWorld().getWidth()/2)+50),((getWorld().getHeight()/2)+150));
            }
        }
    }
}
