import greenfoot.*; 
public class Boss extends Actor
{
    private int speed=4;
    private int direction=1;
    private boolean change;
    public static int lose2=0;
    public void act(){
        if(getRotation()!=0){
            setRotation(180);
        }
        if(getY()>=30 && !change){
            direction=-1;
        } 
        else{
            change=true;
        }
        if(getY()<=getWorld().getHeight()-30 && change){
            direction=1;
        }
        else{
            change=false;
        }
        setLocation(getX(),getY()+(speed*direction));
        shootSoldier();
        
        int x=Greenfoot.getRandomNumber(50);
        if(x==25){
            BossAttack bossattack=new BossAttack(2);
            getWorld().addObject(bossattack,getX()-10,getY());
        }
    }
    public void increaseSpeed(){
        speed++;
    }
    private void shootSoldier(){
        Soldier soldier=(Soldier)getOneIntersectingObject(Soldier.class);
        if(soldier!=null){
            FinalLevel finalevel=(FinalLevel)getWorld();
            finalevel.removeObject(soldier);
            finalevel.addObject(new Soldier(),50,300);
            finalevel.lifes.decrease();
            if(finalevel.lifes.returnCont()==0){
                lose2++;
                Greenfoot.setWorld(new RecordsLevel());
                //GameOver gameover=new GameOver();
                //getWorld().addObject(gameover,((getWorld().getWidth()/2)+50),((getWorld().getHeight()/2)+150));
            }
        }
    }
}
