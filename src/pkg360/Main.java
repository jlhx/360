package pkg360;

import com.google.gson.Gson;
import java.awt.Color;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.swing.DefaultListModel;

public class Main {
    public static void main(String[] args) {
        guiFrame fr = new guiFrame();
        fr.setVisible(true);
        
        /*
        InputTest t = new InputTest();
        t.main();
        */
    }
    public static boolean startTimer() {
        // Start timer
        int delay = 1000;   // delay for 5 sec.
        int period = 1000;  // repeat every sec.
        
        Transfer t = Transfer.getInstance();
        if( t.timer != null ) {
            t.timer.cancel();
        }
        t.timer = new Timer();
        

        t.timer.scheduleAtFixedRate(new TimerTask() {
            UserData d = UserData.getInstance();
            Transfer t = Transfer.getInstance();
            @Override
            public void run() {
                if( !t.isPaused ) {
                    t.timerContain.setText(""+(++d.uBoard_.time));
                    System.out.println(d.uBoard_.time);
                }
                //if( d.uBoard_.bScore != null ) {
                //    cancel();
                //}
            }
        }, delay, period);
        //
        return false;
    }
    public static boolean cancelTimer() {
        Transfer t = Transfer.getInstance();
        if( t.timer != null ) {
            t.timer.cancel();
        }
        return false;
    }
    public static UserPW[] expand( UserPW[] array, int size) {
        UserPW[] temp = new UserPW[size];
        if( array != null ) {
            System.arraycopy(array, 0, temp, 0, array.length);
            for(int j = array.length; j < size; j++)
                temp[j] = null;
        }
        return temp;
    }
    public static Score[] expand( Score[] array, int size) {
        Score[] temp = new Score[size];
        if( array != null ) {
            System.arraycopy(array, 0, temp, 0, array.length);
            for(int j = array.length; j < size; j++)
                temp[j] = null;
        }
        return temp;
    }
    public static UserData[] expand( UserData[] array, int size) {
        UserData[] temp = new UserData[size];
        if( array != null ) {
            System.arraycopy(array, 0, temp, 0, array.length);
            for(int j = array.length; j < size; j++)
                temp[j] = null;
        }
        return temp;
    }
    public static void save() {
        //TODO add 2player save
        SaveData s = SaveData.getInstance();
        UserData d = UserData.getInstance();
        Transfer t = Transfer.getInstance();
        Gson gsonSave = new Gson();
        if( !t.isSaved ) {
            try {
                if( d.uHints != null ) {
                    if( s.userSaves == null ) {
                        s.userSaves = Main.expand(s.userSaves, 1);
                    }
                    else {
                        s.userSaves = Main.expand(s.userSaves, s.userSaves.length+1);
                    }
                    if(d.uSaveName == null) {
                        System.out.print("uSaveName is null");
                        int count = 0;
                        for (int i = 0; i < s.userSaves.length; i++) {
                            if( s.userSaves[i].uName.compareTo(d.uName) == 0 ) {
                                count++;
                            }
                        }
                        d.uSaveName = "save"+(count+1);
                    }
                    s.userSaves[s.userSaves.length-1] = d;
                    PrintWriter out = new PrintWriter(
                        new FileWriter("saves.txt"));
                    String tmp = gsonSave.toJson(s.userSaves);
                    out.print(tmp);
                    out.close();
                }
                else{
                    System.out.println("no game selected, not going to save");
                }
            }
            catch( Exception e ) {
                System.out.println("Exceptione is ="+e.getMessage());
            }
        }
    }
    public static void setup() {
        UserData d = UserData.getInstance();
        SaveData s = SaveData.getInstance();
        Transfer t = Transfer.getInstance();
        InputTest it = new InputTest();
        it.main();
        Vector<Hint> v = it.getHints();
        if( v != null ) {
            d.uHints = (Hint[])it.getHints().toArray(new Hint[it.getHints().size()]);
        }
        else {
            System.out.println("getHints is returning null");
        }
        d.uBoardSize = it.getBoardSize();
        d.uBoard_.time = 0;        
        d.uSaveName = "";

        int count = 0;
        System.out.println(s.userSaves);
        if( s.userSaves != null ) {
            for (int i = 0; i < s.userSaves.length; i++) {
                if( s.userSaves[i].uName == d.uName ) {
                    count++;
                }
            }
        }
        d.uSaveName = "save"+(count + 1);

        Arrays.sort(d.uHints);
        int i=0;
        count = 0;
        while( i < d.uHints.length ) {
            if( d.uHints[i].number == 0 ) {
                count++;
                d.uHints[i].number = (count);
            }
            if( i < d.uHints.length - 1 ) {
                if( d.uHints[i+1].startX == d.uHints[i].startX &&
                    d.uHints[i+1].startY == d.uHints[i].startY) {
                        d.uHints[i+1].number = (count);
                }
            }
            //System.out.println(d.uHints[i].hint+" "+d.uHints[i].number);
            i++;
        }
        DefaultListModel listHorizontal = new DefaultListModel();
        DefaultListModel listVertical = new DefaultListModel();
        for (int j = 0; j < d.uHints.length; j++) {
            d.uBoard_.b [d.uHints[j].startY][d.uHints[j].startX].numVal = d.uHints[j].number;
            t.num       [d.uHints[j].startY][d.uHints[j].startX].setText(""+d.uHints[j].number);
            t.contain   [d.uHints[j].startY][d.uHints[j].startX].setBackground(new Color(255,255,255));
            if( d.uHints[j].ori == Hint.Orientation.ACROSS ) {
                for (int k = 0; k < d.uHints[j].length; k++) {
                    t.contain[d.uHints[j].startY][k+d.uHints[j].startX].setBackground(new Color(255,255,255));
                }
                listHorizontal.addElement(d.uHints[j].hint);
            }
            else {
                for (int k = 0; k < d.uHints[j].length; k++) {
                    t.contain[k+d.uHints[j].startY][d.uHints[j].startX].setBackground(new Color(255,255,255));
                }
                listVertical.addElement(d.uHints[j].hint);
            }
        }
        t.horizontalContain.setModel(listHorizontal);
        t.verticalContain.setModel(listVertical);
    }
}
