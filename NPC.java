import greenfoot.*;  
public class NPC extends Item
{
    public void act()
    {
        Actor Soldier=getOneObjectAtOffset(0,0,Soldier.class);
        if(Soldier!=null){
            Greenfoot.setWorld(new History2());
        }
    }
}
