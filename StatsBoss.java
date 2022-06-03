import greenfoot.*; 
public class StatsBoss extends Visualizers
{
    private GreenfootImage image;
    private int cont,x,y,height,acum;
    private String message;
    
    public StatsBoss(int c, int x, int y, int height){
        cont=c;
        acum=c;
        image=new GreenfootImage(250,150);
        image.setColor(new Color(200,200,0,255));
        image.setFont(new Font("Verdana",true,true,24));
        this.x=x;
        this.y=y;
        this.height=height;
        draw();
    }
    public void draw(){
        image.clear();
        image.setColor(new Color(200,200,0,255));
        image.drawRect(x,y,acum,height);
        image.fillRect(x,y,cont,height);
        image.setColor(new Color(255,255,255,255));
        image.drawString(String.valueOf(cont),25,19);
        setImage(image);
    }
    public void increase(){
        cont++;
        draw();
    }
    public void decrease(){
        cont--;
        draw();
    }
    public int returnCont(){
        return cont;
    }
    public void act()
    {
        
    }
}
