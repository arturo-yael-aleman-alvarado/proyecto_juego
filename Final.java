import greenfoot.*; 
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Final extends World
{
    RecordsManager recordsManager = new RecordsManager("score.txt",10);
    public Final()
    {    
        super(600, 400, 1); 
        prepare();
        getBackground().drawImage(new GreenfootImage("Your Win", 100, new Color(0,255,0), null), 150, 5);
        getBackground().drawImage(new GreenfootImage("Go To Records -> ", 30, new Color(0,0,255), null), 20, 375);
        getBackground().drawImage(new GreenfootImage("Press Enter", 30, new Color(0,0,255), null),220, 375);
        /*
        List<GameRecord> records = recordsManager.getRecords();
        
        int i = 0;
        for (GameRecord record: records)
        {
            Counter score = new Counter();
            
            score.setValue(record.getScore());
            addObject(score, 450,100+i);
            this.showText(record.getPlayerName(), 350, 100+i);
            
            i+=80;
            
        }
        */
    }
    public void act(){
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new RecordsLevel());
        }
    }
    private void prepare()
    {
        noviaF noviaF = new noviaF();
        addObject(noviaF,220,197);
        soldadoF soldadoF = new soldadoF();
        addObject(soldadoF,513,324);
        soldadoF soldadoF2 = new soldadoF();
        addObject(soldadoF2,556,227);
        soldadoF soldadoF3 = new soldadoF();
        addObject(soldadoF3,507,51);
        guerreroF2 guerreroF2 = new guerreroF2();
        addObject(guerreroF2,88,305);
        guerreroF1 guerreroF1 = new guerreroF1();
        addObject(guerreroF1,62,177);
        carF carF = new carF();
        addObject(carF,71,41);
        NPCF nPCF = new NPCF();
        addObject(nPCF,127,130);
        FinalSoldier finalSoldier = new FinalSoldier();
        addObject(finalSoldier,397,328);
        FinalSoldier finalSoldier2 = new FinalSoldier();
        addObject(finalSoldier2,433,234);
        FinalSoldier finalSoldier3 = new FinalSoldier();
        addObject(finalSoldier3,461,151);
        FinalSoldier finalSoldier4 = new FinalSoldier();
        addObject(finalSoldier4,395,52);
        FinalSoldier finalSoldier5 = new FinalSoldier();
        addObject(finalSoldier5,389,140);
        FinalSoldier finalSoldier6 = new FinalSoldier();
        addObject(finalSoldier6,388,232);
        FinalSoldier finalSoldier7 = new FinalSoldier();
        addObject(finalSoldier7,416,280);
        soldadoF soldadoF4 = new soldadoF();
        addObject(soldadoF4,569,105);
        soldierF soldierF = new soldierF();
        addObject(soldierF,195,331);
        finalSoldier4.setLocation(381,325);
        soldadoF3.setLocation(523,61);
        soldadoF3.setLocation(564,126);
        soldadoF.setLocation(565,325);
        soldadoF soldadoF5 = new soldadoF();
        addObject(soldadoF5,502,345);
        soldadoF3.setLocation(546,50);
    }
}
