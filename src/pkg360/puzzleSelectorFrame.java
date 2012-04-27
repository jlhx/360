package pkg360;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.DefaultListModel;
/**
 * @author Caleb Morris
 */
public class puzzleSelectorFrame extends javax.swing.JFrame {
    //TODO (put this somewhere specific) reset userdata on new puzzle select
    /**
     * Creates new form puzzleSelectorFrame
     */
    public puzzleSelectorFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonStartGame = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSelect = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        listDifficulty = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        listNumbPlayers = new javax.swing.JList();

        setTitle("Puzzle Selector");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Select One:");

        jLabel2.setText("Choose Difficulty:");

        jLabel3.setText("Number Of Players");

        buttonStartGame.setText("Start Game");
        buttonStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartGameActionPerformed(evt);
            }
        });

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        listSelect.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "New Game 1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listSelect);

        listDifficulty.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Easy", "Medium", "Hard" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listDifficulty);

        listNumbPlayers.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1 Player", "2 Player" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listNumbPlayers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonStartGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonStartGame)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartGameActionPerformed
        //TODO add another login spawn for 2-player
        //try {
        
        UserData d = UserData.getInstance();
        SaveData s = SaveData.getInstance();
        Transfer t = Transfer.getInstance();
        
        if( listSelect.getSelectedIndex() == 0 ) {
            if( listDifficulty.getSelectedIndex() != -1 &&
                    listNumbPlayers.getSelectedIndex() != -1 &&
                    listSelect.getSelectedIndex() != -1) {
                d.uDifficulty = listDifficulty.getSelectedIndex()+1;
                d.uNumPlayers = listNumbPlayers.getSelectedIndex()+1;
                d.uBoard_.bScore = new Score(0.0, -1);
                
                if( d.uNumPlayers == 2 ) {
                    t.scoreExtraContain.setVisible(true);
                    t.lp2l.setVisible(true);
                    t.textScorep1.setVisible(true);
                }
                
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
        else {
            if( listSelect.getSelectedIndex() != -1 ) {
                String lookfor = listSelect.getSelectedValue().toString();
                System.out.println(s.userSaves.length);
                System.out.println(s.userSaves[0].uSaveName);
                int i;
                for ( i = 0; i < s.userSaves.length; i++) {
                    if( s.userSaves[i].uSaveName != null ) {
                        if( lookfor.compareTo(s.userSaves[i].uSaveName) == 0 ) {
                            break;
                        }
                    }
                }
                d.uBoard_ =     s.userSaves[i].uBoard_;
                d.uBoardSize =  s.userSaves[i].uBoardSize;
                d.uSaveName =   lookfor;
                d.uHints =      s.userSaves[i].uHints;
                d.uDifficulty = s.userSaves[i].uDifficulty; // Easy, Medium, Hard: 1,2,3
                d.uNumPlayers = s.userSaves[i].uNumPlayers;

                for (int j = 0; j < 15; j++) {
                    for (int k = 0; k < 15; k++) {
                        if( d.uBoard_.b[j][k].letVal != '.' ) {
                            t.let[j][k].setText(Character.toString(d.uBoard_.b[j][k].letVal));
                        }
                        else {
                            t.let[j][k].setText("");
                        }
                        if( d.uBoard_.b[j][k].numVal != -1 ) {
                            t.num[j][k].setText(""+d.uBoard_.b[j][k].numVal);
                        }
                        else {
                            t.num[j][k].setText("");
                        }
                    }
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
        Main.startTimer();
        
        this.setVisible(false);
        //}
        //catch(Exception e) {
        //    System.out.println("Exceptione is ="+e.getMessage());
        //}
    }//GEN-LAST:event_buttonStartGameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UserData d = UserData.getInstance();
        SaveData s = SaveData.getInstance();
        Vector<UserData> v = new Vector<UserData>();
        //TODO low priority
        // Bug: user.b accessing user.cd saves
        if( s.userSaves != null ) {
            System.out.println("reading old saves");
            for (int i = 0; i < s.userSaves.length; i++) {
                if( s.userSaves[i].uName.compareTo(d.uName) == 0 ) {
                    System.out.println("currently in "+d.uName);
                    v.add(s.userSaves[i]);
                }
            }
        }
        DefaultListModel listM = new DefaultListModel();
        d.uSaveName = "New Game";
        v.add(0, d);
        for (int i = 0; i < v.size(); i++) {
            listM.addElement(v.elementAt(i).uSaveName);
        }
        listSelect.setModel(listM);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(puzzleSelectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(puzzleSelectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(puzzleSelectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(puzzleSelectorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new puzzleSelectorFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonStartGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList listDifficulty;
    private javax.swing.JList listNumbPlayers;
    private javax.swing.JList listSelect;
    // End of variables declaration//GEN-END:variables
}
