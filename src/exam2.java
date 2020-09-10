import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Timer;


//timer done
//disable all button after time ends
public class exam2 extends javax.swing.JFrame {
    
   Connection con=Myconnection.getConnection();
      PreparedStatement ps=null;
        ResultSet re;
        Timer timer1=new Timer();
        
        int lo=20;
    public exam2() {
        login_form lf=new login_form();
        
      
        initComponents();
       submit_final.setEnabled(false);
        // startTimer(10);
            TimerTask t1=new TimerTask()
            {
                public void run()
                {timer_label.setText(Integer.toString(lo));
                    lo--;
                    if(lo==-1){
                        timer1.cancel();
                        submit_final.setEnabled(true);
                        question_panel.setEnabled(false);
                        question_tab.setEnabled(false);
                        SAVE1.setEnabled(false);
                        SAVE2.setEnabled(false);
                        jButton4.setEnabled(false);
                        jButton5.setEnabled(false);
jButton6.setEnabled(false);
jButton7.setEnabled(false);
jButton8.setEnabled(false);
jButton9.setEnabled(false);
jButton10.setEnabled(false);
jButton11.setEnabled(false);
jButton12.setEnabled(false);
jButton13.setEnabled(false);
jButton14.setEnabled(false);
jButton15.setEnabled(false);
jButton16.setEnabled(false);
jButton17.setEnabled(false);
jButton18.setEnabled(false);
jButton19.setEnabled(false);
jButton20.setEnabled(false);
jButton21.setEnabled(false);
jButton22.setEnabled(false);
jButton23.setEnabled(false);
jButton24.setEnabled(false);
jButton25.setEnabled(false);
jButton26.setEnabled(false);
jButton27.setEnabled(false);
jButton28.setEnabled(false);
jButton29.setEnabled(false);
jButton30.setEnabled(false);
jButton31.setEnabled(false);
jButton32.setEnabled(false);
jButton33.setEnabled(false);
jButton34.setEnabled(false);
jButton35.setEnabled(false);
jButton36.setEnabled(false);
jButton37.setEnabled(false);
jButton38.setEnabled(false);
jButton39.setEnabled(false);
jButton40.setEnabled(false);
jButton41.setEnabled(false);
jButton42.setEnabled(false);
jButton43.setEnabled(false);
jButton44.setEnabled(false);
jButton45.setEnabled(false);
jButton46.setEnabled(false);
jButton47.setEnabled(false);
jButton48.setEnabled(false);
jButton49.setEnabled(false);
jButton50.setEnabled(false);
jButton51.setEnabled(false);
jButton52.setEnabled(false);
jButton53.setEnabled(false);
jButton54.setEnabled(false);
jButton55.setEnabled(false);
jButton56.setEnabled(false);
jButton57.setEnabled(false);
jButton58.setEnabled(false);
jButton59.setEnabled(false);
jButton60.setEnabled(false);
jButton61.setEnabled(false);
                        System.out.println("still working");
                        
                    }
                }
            };
            timer1.schedule(t1, 0, 1000);//1000ms=1sec
         this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        
        
   
    cq1_radio_group.add(cq1_radiobutton1);
        cq1_radio_group.add(cq1_radiobutton2);
        cq1_radio_group.add(cq1_radiobutton3);
        cq1_radio_group.add(cq1_radiobutton4); 
        
        cq2_radio_group.add(jRadioButton1);
         cq2_radio_group.add(jRadioButton2);
          cq2_radio_group.add(jRadioButton3);
           cq2_radio_group.add(jRadioButton4);
           
       buttonGroup1.add(jRadioButton77);
       buttonGroup1.add(jRadioButton78);
       buttonGroup1.add(jRadioButton79);
       buttonGroup1.add(jRadioButton80);
       
buttonGroup2.add(jRadioButton81);
buttonGroup2.add(jRadioButton82);
buttonGroup2.add(jRadioButton83);
buttonGroup2.add(jRadioButton84);

buttonGroup3.add(jRadioButton85);
buttonGroup3.add(jRadioButton86);
buttonGroup3.add(jRadioButton87);
buttonGroup3.add(jRadioButton88);

buttonGroup4.add(jRadioButton89);
buttonGroup4.add(jRadioButton90);
buttonGroup4.add(jRadioButton91);
buttonGroup4.add(jRadioButton92);

buttonGroup5.add(jRadioButton93);
buttonGroup5.add(jRadioButton94);
buttonGroup5.add(jRadioButton95);
buttonGroup5.add(jRadioButton96);

buttonGroup6.add(jRadioButton97);
buttonGroup6.add(jRadioButton98);
buttonGroup6.add(jRadioButton99);
buttonGroup6.add(jRadioButton100);

buttonGroup7.add(jRadioButton101);
buttonGroup7.add(jRadioButton102);
buttonGroup7.add(jRadioButton103);
buttonGroup7.add(jRadioButton104);

buttonGroup8.add(jRadioButton105);
buttonGroup8.add(jRadioButton106);
buttonGroup8.add(jRadioButton107);
buttonGroup8.add(jRadioButton108);

buttonGroup9.add(jRadioButton109);
buttonGroup9.add(jRadioButton110);
buttonGroup9.add(jRadioButton111);
buttonGroup9.add(jRadioButton112);

buttonGroup10.add(jRadioButton113);
buttonGroup10.add(jRadioButton114);
buttonGroup10.add(jRadioButton115);
buttonGroup10.add(jRadioButton116);

buttonGroup11.add(jRadioButton117);
buttonGroup11.add(jRadioButton118);
buttonGroup11.add(jRadioButton119);
buttonGroup11.add(jRadioButton120);

buttonGroup12.add(jRadioButton121);
buttonGroup12.add(jRadioButton122);
buttonGroup12.add(jRadioButton123);
buttonGroup12.add(jRadioButton124);

buttonGroup13.add(jRadioButton125);
buttonGroup13.add(jRadioButton126);
buttonGroup13.add(jRadioButton127);
buttonGroup13.add(jRadioButton128);


buttonGroup14.add(jRadioButton129);
buttonGroup14.add(jRadioButton130);
buttonGroup14.add(jRadioButton131);
buttonGroup14.add(jRadioButton132);

buttonGroup15.add(jRadioButton133);
buttonGroup15.add(jRadioButton134);
buttonGroup15.add(jRadioButton135);
buttonGroup15.add(jRadioButton136);

buttonGroup16.add(jRadioButton137);
buttonGroup16.add(jRadioButton138);
buttonGroup16.add(jRadioButton139);
buttonGroup16.add(jRadioButton140);

buttonGroup17.add(jRadioButton141);
buttonGroup17.add(jRadioButton142);
buttonGroup17.add(jRadioButton143);
buttonGroup17.add(jRadioButton144);

buttonGroup18.add(jRadioButton145);
buttonGroup18.add(jRadioButton146);
buttonGroup18.add(jRadioButton147);
buttonGroup18.add(jRadioButton148);

buttonGroup19.add(jRadioButton149);
buttonGroup19.add(jRadioButton150);
buttonGroup19.add(jRadioButton151);
buttonGroup19.add(jRadioButton152);

buttonGroup20.add(jRadioButton153);
buttonGroup20.add(jRadioButton154);
buttonGroup20.add(jRadioButton155);
buttonGroup20.add(jRadioButton156);
//c-buttongroup
           buttonGroup21.add(jRadioButton5);
            buttonGroup21.add(jRadioButton6);
             buttonGroup21.add(jRadioButton7);
              buttonGroup21.add(jRadioButton8);
              
               buttonGroup22.add(jRadioButton9);
                buttonGroup22.add(jRadioButton10);
                 buttonGroup22.add(jRadioButton11);
                  buttonGroup22.add(jRadioButton12);
                  
                   buttonGroup23.add(jRadioButton13);
            buttonGroup23.add(jRadioButton14);
             buttonGroup23.add(jRadioButton15);
              buttonGroup23.add(jRadioButton16);
              
               buttonGroup24.add(jRadioButton17);
            buttonGroup24.add(jRadioButton18);
             buttonGroup24.add(jRadioButton19);
              buttonGroup24.add(jRadioButton20);
              
               buttonGroup25.add(jRadioButton21);
            buttonGroup25.add(jRadioButton22);
             buttonGroup25.add(jRadioButton23);
              buttonGroup25.add(jRadioButton24);
              
               buttonGroup26.add(jRadioButton25);
            buttonGroup26.add(jRadioButton26);
             buttonGroup26.add(jRadioButton27);
              buttonGroup26.add(jRadioButton28);
              
               buttonGroup27.add(jRadioButton29);
            buttonGroup27.add(jRadioButton30);
             buttonGroup27.add(jRadioButton31);
              buttonGroup27.add(jRadioButton32);
              
               buttonGroup28.add(jRadioButton33);
            buttonGroup28.add(jRadioButton34);
             buttonGroup28.add(jRadioButton35);
              buttonGroup28.add(jRadioButton36);
              
               buttonGroup29.add(jRadioButton37);
            buttonGroup29.add(jRadioButton38);
             buttonGroup29.add(jRadioButton39);
              buttonGroup29.add(jRadioButton40);
              
               buttonGroup30.add(jRadioButton41);
            buttonGroup30.add(jRadioButton42);
             buttonGroup30.add(jRadioButton43);
              buttonGroup30.add(jRadioButton44);
              
               buttonGroup31.add(jRadioButton45);
            buttonGroup31.add(jRadioButton46);
             buttonGroup31.add(jRadioButton47);
              buttonGroup31.add(jRadioButton48);
              
               buttonGroup32.add(jRadioButton49);
            buttonGroup32.add(jRadioButton50);
             buttonGroup32.add(jRadioButton51);
              buttonGroup32.add(jRadioButton52);
              
               buttonGroup33.add(jRadioButton53);
            buttonGroup33.add(jRadioButton54);
             buttonGroup33.add(jRadioButton55);
              buttonGroup33.add(jRadioButton56);
              
               buttonGroup34.add(jRadioButton57);
            buttonGroup34.add(jRadioButton58);
             buttonGroup34.add(jRadioButton59);
              buttonGroup34.add(jRadioButton60);
              
               buttonGroup35.add(jRadioButton61);
            buttonGroup35.add(jRadioButton62);
             buttonGroup35.add(jRadioButton63);
              buttonGroup35.add(jRadioButton64);
              
               buttonGroup36.add(jRadioButton65);
            buttonGroup36.add(jRadioButton66);
             buttonGroup36.add(jRadioButton67);
              buttonGroup36.add(jRadioButton68);
              
               buttonGroup37.add(jRadioButton69);
            buttonGroup37.add(jRadioButton70);
             buttonGroup37.add(jRadioButton71);
              buttonGroup37.add(jRadioButton72);
              
               buttonGroup38.add(jRadioButton73);
            buttonGroup38.add(jRadioButton74);
             buttonGroup38.add(jRadioButton75);
              buttonGroup38.add(jRadioButton76);
              
              //c++buttongroup
              buttonGroup39.add( cq1_radiobutton5);
              buttonGroup39.add( cq1_radiobutton6);
              buttonGroup39.add( cq1_radiobutton7);
              buttonGroup39.add( cq1_radiobutton8);
              
               buttonGroup40.add( cq1_radiobutton9);
              buttonGroup40.add( cq1_radiobutton10);
              buttonGroup40.add( cq1_radiobutton11);
              buttonGroup40.add( cq1_radiobutton12);
              
              buttonGroup41.add( cq1_radiobutton13);
              buttonGroup41.add( cq1_radiobutton14);
              buttonGroup41.add( cq1_radiobutton15);
              buttonGroup41.add( cq1_radiobutton16);
              
              buttonGroup42.add( cq1_radiobutton17);
              buttonGroup42.add( cq1_radiobutton18);
              buttonGroup42.add( cq1_radiobutton19);
              buttonGroup42.add( cq1_radiobutton20);
              
              buttonGroup43.add( cq1_radiobutton21);
              buttonGroup43.add( cq1_radiobutton22);
              buttonGroup43.add( cq1_radiobutton23);
              buttonGroup43.add( cq1_radiobutton24);
              
              buttonGroup44.add( cq1_radiobutton25);
              buttonGroup44.add( cq1_radiobutton26);
              buttonGroup44.add( cq1_radiobutton27);
              buttonGroup44.add( cq1_radiobutton28);
              
              buttonGroup45.add( cq1_radiobutton29);
              buttonGroup45.add( cq1_radiobutton30);
              buttonGroup45.add( cq1_radiobutton31);
              buttonGroup45.add( cq1_radiobutton32);
              
              buttonGroup46.add( cq1_radiobutton33);
              buttonGroup46.add( cq1_radiobutton34);
              buttonGroup46.add( cq1_radiobutton35);
              buttonGroup46.add( cq1_radiobutton36);
              
              buttonGroup47.add( cq1_radiobutton37);
              buttonGroup47.add( cq1_radiobutton38);
              buttonGroup47.add( cq1_radiobutton39);
              buttonGroup47.add( cq1_radiobutton40);
              
              buttonGroup48.add( cq1_radiobutton41);
              buttonGroup48.add( cq1_radiobutton42);
              buttonGroup48.add( cq1_radiobutton43);
              buttonGroup48.add( cq1_radiobutton44);
              
              buttonGroup49.add( cq1_radiobutton45);
              buttonGroup49.add( cq1_radiobutton46);
              buttonGroup49.add( cq1_radiobutton47);
              buttonGroup49.add( cq1_radiobutton48);
              
              buttonGroup50.add( cq1_radiobutton49);
              buttonGroup50.add( cq1_radiobutton50);
              buttonGroup50.add( cq1_radiobutton51);
              buttonGroup50.add( cq1_radiobutton52);
              
              buttonGroup51.add( cq1_radiobutton53);
              buttonGroup51.add( cq1_radiobutton54);
              buttonGroup51.add( cq1_radiobutton55);
              buttonGroup51.add( cq1_radiobutton56);
              
              buttonGroup52.add( cq1_radiobutton57);
              buttonGroup52.add( cq1_radiobutton58);
              buttonGroup52.add( cq1_radiobutton59);
              buttonGroup52.add( cq1_radiobutton60);
              
              buttonGroup53.add( cq1_radiobutton61);
              buttonGroup53.add( cq1_radiobutton62);
              buttonGroup53.add( cq1_radiobutton63);
              buttonGroup53.add( cq1_radiobutton64);
              
              buttonGroup54.add( cq1_radiobutton65);
              buttonGroup54.add( cq1_radiobutton66);
              buttonGroup54.add( cq1_radiobutton67);
              buttonGroup54.add( cq1_radiobutton68);
              
              buttonGroup55.add( cq1_radiobutton69);
              buttonGroup55.add( cq1_radiobutton70);
              buttonGroup55.add( cq1_radiobutton71);
              buttonGroup55.add( cq1_radiobutton72);
              
              buttonGroup56.add( cq1_radiobutton73);
              buttonGroup56.add( cq1_radiobutton74);
              buttonGroup56.add( cq1_radiobutton75);
              buttonGroup56.add( cq1_radiobutton76);
              
              buttonGroup57.add( cq1_radiobutton77);
              buttonGroup57.add( cq1_radiobutton78);
              buttonGroup57.add( cq1_radiobutton79);
              buttonGroup57.add( cq1_radiobutton80);
              
              buttonGroup58.add( cq1_radiobutton81);
              buttonGroup58.add( cq1_radiobutton82);
              buttonGroup58.add( cq1_radiobutton83);
              buttonGroup58.add( cq1_radiobutton84);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cq1_radio_group = new javax.swing.ButtonGroup();
        cq2_radio_group = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        buttonGroup28 = new javax.swing.ButtonGroup();
        buttonGroup29 = new javax.swing.ButtonGroup();
        buttonGroup30 = new javax.swing.ButtonGroup();
        buttonGroup31 = new javax.swing.ButtonGroup();
        buttonGroup32 = new javax.swing.ButtonGroup();
        buttonGroup33 = new javax.swing.ButtonGroup();
        buttonGroup34 = new javax.swing.ButtonGroup();
        buttonGroup35 = new javax.swing.ButtonGroup();
        buttonGroup36 = new javax.swing.ButtonGroup();
        buttonGroup37 = new javax.swing.ButtonGroup();
        buttonGroup38 = new javax.swing.ButtonGroup();
        buttonGroup39 = new javax.swing.ButtonGroup();
        buttonGroup40 = new javax.swing.ButtonGroup();
        buttonGroup41 = new javax.swing.ButtonGroup();
        buttonGroup42 = new javax.swing.ButtonGroup();
        buttonGroup43 = new javax.swing.ButtonGroup();
        buttonGroup44 = new javax.swing.ButtonGroup();
        buttonGroup45 = new javax.swing.ButtonGroup();
        buttonGroup46 = new javax.swing.ButtonGroup();
        buttonGroup47 = new javax.swing.ButtonGroup();
        buttonGroup48 = new javax.swing.ButtonGroup();
        buttonGroup49 = new javax.swing.ButtonGroup();
        buttonGroup50 = new javax.swing.ButtonGroup();
        buttonGroup51 = new javax.swing.ButtonGroup();
        buttonGroup52 = new javax.swing.ButtonGroup();
        buttonGroup53 = new javax.swing.ButtonGroup();
        buttonGroup54 = new javax.swing.ButtonGroup();
        buttonGroup55 = new javax.swing.ButtonGroup();
        buttonGroup56 = new javax.swing.ButtonGroup();
        buttonGroup57 = new javax.swing.ButtonGroup();
        buttonGroup58 = new javax.swing.ButtonGroup();
        head_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timer_label = new javax.swing.JLabel();
        submit_final = new javax.swing.JButton();
        question_panel = new javax.swing.JPanel();
        cq1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cq1_radiobutton1 = new javax.swing.JRadioButton();
        cq1_radiobutton2 = new javax.swing.JRadioButton();
        cq1_radiobutton3 = new javax.swing.JRadioButton();
        cq1_radiobutton4 = new javax.swing.JRadioButton();
        SAVE1 = new javax.swing.JButton();
        cq2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        SAVE2 = new javax.swing.JButton();
        cq3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        cq4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        cq5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jButton6 = new javax.swing.JButton();
        cq6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        cq7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jButton8 = new javax.swing.JButton();
        cq8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jButton9 = new javax.swing.JButton();
        cq9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        cq10 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jButton11 = new javax.swing.JButton();
        cq11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        cq12 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jButton13 = new javax.swing.JButton();
        cq13 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();
        jButton14 = new javax.swing.JButton();
        cq14 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        jButton15 = new javax.swing.JButton();
        cq15 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        jButton16 = new javax.swing.JButton();
        cq16 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        jButton17 = new javax.swing.JButton();
        cq17 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        jButton18 = new javax.swing.JButton();
        cq18 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jRadioButton65 = new javax.swing.JRadioButton();
        jRadioButton66 = new javax.swing.JRadioButton();
        jRadioButton67 = new javax.swing.JRadioButton();
        jRadioButton68 = new javax.swing.JRadioButton();
        jButton19 = new javax.swing.JButton();
        cq19 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jRadioButton69 = new javax.swing.JRadioButton();
        jRadioButton70 = new javax.swing.JRadioButton();
        jRadioButton71 = new javax.swing.JRadioButton();
        jRadioButton72 = new javax.swing.JRadioButton();
        jButton20 = new javax.swing.JButton();
        cq20 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jRadioButton73 = new javax.swing.JRadioButton();
        jRadioButton74 = new javax.swing.JRadioButton();
        jRadioButton75 = new javax.swing.JRadioButton();
        jRadioButton76 = new javax.swing.JRadioButton();
        jButton21 = new javax.swing.JButton();
        jq1 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jRadioButton77 = new javax.swing.JRadioButton();
        jRadioButton78 = new javax.swing.JRadioButton();
        jRadioButton79 = new javax.swing.JRadioButton();
        jRadioButton80 = new javax.swing.JRadioButton();
        jButton22 = new javax.swing.JButton();
        jq2 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jRadioButton81 = new javax.swing.JRadioButton();
        jRadioButton82 = new javax.swing.JRadioButton();
        jRadioButton83 = new javax.swing.JRadioButton();
        jRadioButton84 = new javax.swing.JRadioButton();
        jButton23 = new javax.swing.JButton();
        jq3 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jRadioButton85 = new javax.swing.JRadioButton();
        jRadioButton86 = new javax.swing.JRadioButton();
        jRadioButton87 = new javax.swing.JRadioButton();
        jRadioButton88 = new javax.swing.JRadioButton();
        jButton24 = new javax.swing.JButton();
        jq4 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jRadioButton89 = new javax.swing.JRadioButton();
        jRadioButton90 = new javax.swing.JRadioButton();
        jRadioButton91 = new javax.swing.JRadioButton();
        jRadioButton92 = new javax.swing.JRadioButton();
        jButton25 = new javax.swing.JButton();
        jq5 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jRadioButton93 = new javax.swing.JRadioButton();
        jRadioButton94 = new javax.swing.JRadioButton();
        jRadioButton95 = new javax.swing.JRadioButton();
        jRadioButton96 = new javax.swing.JRadioButton();
        jButton26 = new javax.swing.JButton();
        jq6 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jRadioButton97 = new javax.swing.JRadioButton();
        jRadioButton98 = new javax.swing.JRadioButton();
        jRadioButton99 = new javax.swing.JRadioButton();
        jRadioButton100 = new javax.swing.JRadioButton();
        jButton27 = new javax.swing.JButton();
        jq7 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jRadioButton101 = new javax.swing.JRadioButton();
        jRadioButton102 = new javax.swing.JRadioButton();
        jRadioButton103 = new javax.swing.JRadioButton();
        jRadioButton104 = new javax.swing.JRadioButton();
        jButton28 = new javax.swing.JButton();
        jq8 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jRadioButton105 = new javax.swing.JRadioButton();
        jRadioButton106 = new javax.swing.JRadioButton();
        jRadioButton107 = new javax.swing.JRadioButton();
        jRadioButton108 = new javax.swing.JRadioButton();
        jButton29 = new javax.swing.JButton();
        jq9 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextArea29 = new javax.swing.JTextArea();
        jRadioButton109 = new javax.swing.JRadioButton();
        jRadioButton110 = new javax.swing.JRadioButton();
        jRadioButton111 = new javax.swing.JRadioButton();
        jRadioButton112 = new javax.swing.JRadioButton();
        jButton30 = new javax.swing.JButton();
        jq10 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextArea30 = new javax.swing.JTextArea();
        jRadioButton113 = new javax.swing.JRadioButton();
        jRadioButton114 = new javax.swing.JRadioButton();
        jRadioButton115 = new javax.swing.JRadioButton();
        jRadioButton116 = new javax.swing.JRadioButton();
        jButton31 = new javax.swing.JButton();
        jq11 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextArea31 = new javax.swing.JTextArea();
        jRadioButton117 = new javax.swing.JRadioButton();
        jRadioButton118 = new javax.swing.JRadioButton();
        jRadioButton119 = new javax.swing.JRadioButton();
        jRadioButton120 = new javax.swing.JRadioButton();
        jButton32 = new javax.swing.JButton();
        jq12 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextArea32 = new javax.swing.JTextArea();
        jRadioButton121 = new javax.swing.JRadioButton();
        jRadioButton122 = new javax.swing.JRadioButton();
        jRadioButton123 = new javax.swing.JRadioButton();
        jRadioButton124 = new javax.swing.JRadioButton();
        jButton33 = new javax.swing.JButton();
        jq13 = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextArea33 = new javax.swing.JTextArea();
        jRadioButton125 = new javax.swing.JRadioButton();
        jRadioButton126 = new javax.swing.JRadioButton();
        jRadioButton127 = new javax.swing.JRadioButton();
        jRadioButton128 = new javax.swing.JRadioButton();
        jButton34 = new javax.swing.JButton();
        jq14 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextArea34 = new javax.swing.JTextArea();
        jRadioButton129 = new javax.swing.JRadioButton();
        jRadioButton130 = new javax.swing.JRadioButton();
        jRadioButton131 = new javax.swing.JRadioButton();
        jRadioButton132 = new javax.swing.JRadioButton();
        jButton35 = new javax.swing.JButton();
        jq15 = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextArea35 = new javax.swing.JTextArea();
        jRadioButton133 = new javax.swing.JRadioButton();
        jRadioButton134 = new javax.swing.JRadioButton();
        jRadioButton135 = new javax.swing.JRadioButton();
        jRadioButton136 = new javax.swing.JRadioButton();
        jButton36 = new javax.swing.JButton();
        jq16 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea36 = new javax.swing.JTextArea();
        jRadioButton137 = new javax.swing.JRadioButton();
        jRadioButton138 = new javax.swing.JRadioButton();
        jRadioButton139 = new javax.swing.JRadioButton();
        jRadioButton140 = new javax.swing.JRadioButton();
        jButton37 = new javax.swing.JButton();
        jq17 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea37 = new javax.swing.JTextArea();
        jRadioButton141 = new javax.swing.JRadioButton();
        jRadioButton142 = new javax.swing.JRadioButton();
        jRadioButton143 = new javax.swing.JRadioButton();
        jRadioButton144 = new javax.swing.JRadioButton();
        jButton38 = new javax.swing.JButton();
        jq18 = new javax.swing.JPanel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea38 = new javax.swing.JTextArea();
        jRadioButton145 = new javax.swing.JRadioButton();
        jRadioButton146 = new javax.swing.JRadioButton();
        jRadioButton147 = new javax.swing.JRadioButton();
        jRadioButton148 = new javax.swing.JRadioButton();
        jButton39 = new javax.swing.JButton();
        jq19 = new javax.swing.JPanel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextArea39 = new javax.swing.JTextArea();
        jRadioButton149 = new javax.swing.JRadioButton();
        jRadioButton150 = new javax.swing.JRadioButton();
        jRadioButton151 = new javax.swing.JRadioButton();
        jRadioButton152 = new javax.swing.JRadioButton();
        jButton40 = new javax.swing.JButton();
        jq20 = new javax.swing.JPanel();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea40 = new javax.swing.JTextArea();
        jRadioButton153 = new javax.swing.JRadioButton();
        jRadioButton154 = new javax.swing.JRadioButton();
        jRadioButton155 = new javax.swing.JRadioButton();
        jRadioButton156 = new javax.swing.JRadioButton();
        jButton41 = new javax.swing.JButton();
        cppq1 = new javax.swing.JPanel();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea41 = new javax.swing.JTextArea();
        cq1_radiobutton5 = new javax.swing.JRadioButton();
        cq1_radiobutton6 = new javax.swing.JRadioButton();
        cq1_radiobutton7 = new javax.swing.JRadioButton();
        cq1_radiobutton8 = new javax.swing.JRadioButton();
        jButton42 = new javax.swing.JButton();
        cppq2 = new javax.swing.JPanel();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextArea42 = new javax.swing.JTextArea();
        cq1_radiobutton9 = new javax.swing.JRadioButton();
        cq1_radiobutton10 = new javax.swing.JRadioButton();
        cq1_radiobutton11 = new javax.swing.JRadioButton();
        cq1_radiobutton12 = new javax.swing.JRadioButton();
        jButton43 = new javax.swing.JButton();
        cppq3 = new javax.swing.JPanel();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextArea43 = new javax.swing.JTextArea();
        cq1_radiobutton13 = new javax.swing.JRadioButton();
        cq1_radiobutton14 = new javax.swing.JRadioButton();
        cq1_radiobutton15 = new javax.swing.JRadioButton();
        cq1_radiobutton16 = new javax.swing.JRadioButton();
        jButton44 = new javax.swing.JButton();
        cppq4 = new javax.swing.JPanel();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextArea44 = new javax.swing.JTextArea();
        cq1_radiobutton17 = new javax.swing.JRadioButton();
        cq1_radiobutton18 = new javax.swing.JRadioButton();
        cq1_radiobutton19 = new javax.swing.JRadioButton();
        cq1_radiobutton20 = new javax.swing.JRadioButton();
        jButton45 = new javax.swing.JButton();
        cppq5 = new javax.swing.JPanel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextArea45 = new javax.swing.JTextArea();
        cq1_radiobutton21 = new javax.swing.JRadioButton();
        cq1_radiobutton22 = new javax.swing.JRadioButton();
        cq1_radiobutton23 = new javax.swing.JRadioButton();
        cq1_radiobutton24 = new javax.swing.JRadioButton();
        jButton46 = new javax.swing.JButton();
        cppq6 = new javax.swing.JPanel();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea46 = new javax.swing.JTextArea();
        cq1_radiobutton25 = new javax.swing.JRadioButton();
        cq1_radiobutton26 = new javax.swing.JRadioButton();
        cq1_radiobutton27 = new javax.swing.JRadioButton();
        cq1_radiobutton28 = new javax.swing.JRadioButton();
        jButton47 = new javax.swing.JButton();
        cppq7 = new javax.swing.JPanel();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextArea47 = new javax.swing.JTextArea();
        cq1_radiobutton29 = new javax.swing.JRadioButton();
        cq1_radiobutton30 = new javax.swing.JRadioButton();
        cq1_radiobutton31 = new javax.swing.JRadioButton();
        cq1_radiobutton32 = new javax.swing.JRadioButton();
        jButton48 = new javax.swing.JButton();
        cppq8 = new javax.swing.JPanel();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextArea48 = new javax.swing.JTextArea();
        cq1_radiobutton33 = new javax.swing.JRadioButton();
        cq1_radiobutton34 = new javax.swing.JRadioButton();
        cq1_radiobutton35 = new javax.swing.JRadioButton();
        cq1_radiobutton36 = new javax.swing.JRadioButton();
        jButton49 = new javax.swing.JButton();
        cppq9 = new javax.swing.JPanel();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextArea49 = new javax.swing.JTextArea();
        cq1_radiobutton37 = new javax.swing.JRadioButton();
        cq1_radiobutton38 = new javax.swing.JRadioButton();
        cq1_radiobutton39 = new javax.swing.JRadioButton();
        cq1_radiobutton40 = new javax.swing.JRadioButton();
        jButton50 = new javax.swing.JButton();
        cppq10 = new javax.swing.JPanel();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextArea50 = new javax.swing.JTextArea();
        cq1_radiobutton41 = new javax.swing.JRadioButton();
        cq1_radiobutton42 = new javax.swing.JRadioButton();
        cq1_radiobutton43 = new javax.swing.JRadioButton();
        cq1_radiobutton44 = new javax.swing.JRadioButton();
        jButton51 = new javax.swing.JButton();
        cppq11 = new javax.swing.JPanel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextArea51 = new javax.swing.JTextArea();
        cq1_radiobutton45 = new javax.swing.JRadioButton();
        cq1_radiobutton46 = new javax.swing.JRadioButton();
        cq1_radiobutton47 = new javax.swing.JRadioButton();
        cq1_radiobutton48 = new javax.swing.JRadioButton();
        jButton52 = new javax.swing.JButton();
        cppq12 = new javax.swing.JPanel();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextArea52 = new javax.swing.JTextArea();
        cq1_radiobutton49 = new javax.swing.JRadioButton();
        cq1_radiobutton50 = new javax.swing.JRadioButton();
        cq1_radiobutton51 = new javax.swing.JRadioButton();
        cq1_radiobutton52 = new javax.swing.JRadioButton();
        jButton53 = new javax.swing.JButton();
        cppq13 = new javax.swing.JPanel();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextArea53 = new javax.swing.JTextArea();
        cq1_radiobutton53 = new javax.swing.JRadioButton();
        cq1_radiobutton54 = new javax.swing.JRadioButton();
        cq1_radiobutton55 = new javax.swing.JRadioButton();
        cq1_radiobutton56 = new javax.swing.JRadioButton();
        jButton54 = new javax.swing.JButton();
        cppq14 = new javax.swing.JPanel();
        jScrollPane54 = new javax.swing.JScrollPane();
        jTextArea54 = new javax.swing.JTextArea();
        cq1_radiobutton57 = new javax.swing.JRadioButton();
        cq1_radiobutton58 = new javax.swing.JRadioButton();
        cq1_radiobutton59 = new javax.swing.JRadioButton();
        cq1_radiobutton60 = new javax.swing.JRadioButton();
        jButton55 = new javax.swing.JButton();
        cppq15 = new javax.swing.JPanel();
        jScrollPane55 = new javax.swing.JScrollPane();
        jTextArea55 = new javax.swing.JTextArea();
        cq1_radiobutton61 = new javax.swing.JRadioButton();
        cq1_radiobutton62 = new javax.swing.JRadioButton();
        cq1_radiobutton63 = new javax.swing.JRadioButton();
        cq1_radiobutton64 = new javax.swing.JRadioButton();
        jButton56 = new javax.swing.JButton();
        cppq16 = new javax.swing.JPanel();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextArea56 = new javax.swing.JTextArea();
        cq1_radiobutton65 = new javax.swing.JRadioButton();
        cq1_radiobutton66 = new javax.swing.JRadioButton();
        cq1_radiobutton67 = new javax.swing.JRadioButton();
        cq1_radiobutton68 = new javax.swing.JRadioButton();
        jButton57 = new javax.swing.JButton();
        cppq17 = new javax.swing.JPanel();
        jScrollPane57 = new javax.swing.JScrollPane();
        jTextArea57 = new javax.swing.JTextArea();
        cq1_radiobutton69 = new javax.swing.JRadioButton();
        cq1_radiobutton70 = new javax.swing.JRadioButton();
        cq1_radiobutton71 = new javax.swing.JRadioButton();
        cq1_radiobutton72 = new javax.swing.JRadioButton();
        jButton58 = new javax.swing.JButton();
        cppq18 = new javax.swing.JPanel();
        jScrollPane58 = new javax.swing.JScrollPane();
        jTextArea58 = new javax.swing.JTextArea();
        cq1_radiobutton73 = new javax.swing.JRadioButton();
        cq1_radiobutton74 = new javax.swing.JRadioButton();
        cq1_radiobutton75 = new javax.swing.JRadioButton();
        cq1_radiobutton76 = new javax.swing.JRadioButton();
        jButton59 = new javax.swing.JButton();
        cppq19 = new javax.swing.JPanel();
        jScrollPane59 = new javax.swing.JScrollPane();
        jTextArea59 = new javax.swing.JTextArea();
        cq1_radiobutton77 = new javax.swing.JRadioButton();
        cq1_radiobutton78 = new javax.swing.JRadioButton();
        cq1_radiobutton79 = new javax.swing.JRadioButton();
        cq1_radiobutton80 = new javax.swing.JRadioButton();
        jButton60 = new javax.swing.JButton();
        cppq20 = new javax.swing.JPanel();
        jScrollPane60 = new javax.swing.JScrollPane();
        jTextArea60 = new javax.swing.JTextArea();
        cq1_radiobutton81 = new javax.swing.JRadioButton();
        cq1_radiobutton82 = new javax.swing.JRadioButton();
        cq1_radiobutton83 = new javax.swing.JRadioButton();
        cq1_radiobutton84 = new javax.swing.JRadioButton();
        jButton61 = new javax.swing.JButton();
        question_tab = new javax.swing.JTabbedPane();
        qt_C = new javax.swing.JPanel();
        cq_t1 = new javax.swing.JButton();
        cq_t2 = new javax.swing.JButton();
        cq_t3 = new javax.swing.JButton();
        cq_t4 = new javax.swing.JButton();
        cq_t5 = new javax.swing.JButton();
        cq_t6 = new javax.swing.JButton();
        cq_t7 = new javax.swing.JButton();
        cq_t8 = new javax.swing.JButton();
        cq_t9 = new javax.swing.JButton();
        cq_t10 = new javax.swing.JButton();
        cq_t11 = new javax.swing.JButton();
        cq_t12 = new javax.swing.JButton();
        cq_t13 = new javax.swing.JButton();
        cq_t14 = new javax.swing.JButton();
        cq_t15 = new javax.swing.JButton();
        cq_t16 = new javax.swing.JButton();
        cq_t17 = new javax.swing.JButton();
        cq_t18 = new javax.swing.JButton();
        cq_t19 = new javax.swing.JButton();
        cq_t20 = new javax.swing.JButton();
        qt_cpp = new javax.swing.JPanel();
        cpp_t1 = new javax.swing.JButton();
        cpp_t3 = new javax.swing.JButton();
        cpp_t2 = new javax.swing.JButton();
        cpp_t4 = new javax.swing.JButton();
        cpp_t5 = new javax.swing.JButton();
        cpp_t6 = new javax.swing.JButton();
        cpp_t7 = new javax.swing.JButton();
        cpp_t8 = new javax.swing.JButton();
        cpp_t9 = new javax.swing.JButton();
        cpp_t10 = new javax.swing.JButton();
        cpp_t11 = new javax.swing.JButton();
        cpp_t12 = new javax.swing.JButton();
        cpp_t13 = new javax.swing.JButton();
        cpp_t14 = new javax.swing.JButton();
        cpp_t15 = new javax.swing.JButton();
        cpp_t16 = new javax.swing.JButton();
        cpp_t17 = new javax.swing.JButton();
        cpp_t18 = new javax.swing.JButton();
        cpp_t19 = new javax.swing.JButton();
        cpp_t20 = new javax.swing.JButton();
        qt_java = new javax.swing.JPanel();
        cq_t21 = new javax.swing.JButton();
        cq_t22 = new javax.swing.JButton();
        cq_t23 = new javax.swing.JButton();
        cq_t24 = new javax.swing.JButton();
        cq_t25 = new javax.swing.JButton();
        cq_t26 = new javax.swing.JButton();
        cq_t27 = new javax.swing.JButton();
        cq_t28 = new javax.swing.JButton();
        cq_t29 = new javax.swing.JButton();
        cq_t30 = new javax.swing.JButton();
        cq_t31 = new javax.swing.JButton();
        cq_t32 = new javax.swing.JButton();
        cq_t33 = new javax.swing.JButton();
        cq_t34 = new javax.swing.JButton();
        cq_t35 = new javax.swing.JButton();
        cq_t36 = new javax.swing.JButton();
        cq_t37 = new javax.swing.JButton();
        cq_t38 = new javax.swing.JButton();
        cq_t39 = new javax.swing.JButton();
        cq_t40 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head_panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CYBERCYCLOID Online Exam");

        timer_label.setBackground(new java.awt.Color(0, 204, 204));
        timer_label.setForeground(new java.awt.Color(255, 255, 255));
        timer_label.setText("3:00:00");

        submit_final.setText("SUBMIT");
        submit_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_finalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout head_panelLayout = new javax.swing.GroupLayout(head_panel);
        head_panel.setLayout(head_panelLayout);
        head_panelLayout.setHorizontalGroup(
            head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_panelLayout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(timer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
            .addGroup(head_panelLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit_final)
                .addGap(98, 98, 98))
        );
        head_panelLayout.setVerticalGroup(
            head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(head_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submit_final))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timer_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(head_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 90));

        question_panel.setBackground(new java.awt.Color(255, 255, 255));
        question_panel.setLayout(new java.awt.CardLayout());

        cq1.setBackground(new java.awt.Color(255, 255, 255));
        cq1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(textarea("1", jTextArea1.getText()));
        jScrollPane1.setViewportView(jTextArea1);

        cq1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 115));

        cq1_radiobutton1.setText(radio1("1", cq1_radiobutton1.getText()));
        cq1.add(cq1_radiobutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 168, -1, -1));

        cq1_radiobutton2.setText(radio2("1", cq1_radiobutton2.getText()));
        cq1.add(cq1_radiobutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 168, -1, -1));

        cq1_radiobutton3.setText(radio3("1", cq1_radiobutton3.getText()));
        cq1.add(cq1_radiobutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 305, -1, -1));

        cq1_radiobutton4.setText(radio4("1", cq1_radiobutton4.getText()));
        cq1.add(cq1_radiobutton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 305, -1, -1));

        SAVE1.setText("Save and next");
        SAVE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE1ActionPerformed(evt);
            }
        });
        cq1.add(SAVE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 385, -1, 33));

        question_panel.add(cq1, "card2");

        cq2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText(textarea("2", jTextArea2.getText()));
        jScrollPane2.setViewportView(jTextArea2);

        jRadioButton1.setText(radio1("2", jRadioButton1.getText()));

        jRadioButton2.setText(radio2("2", jRadioButton2.getText()));

        jRadioButton3.setText(radio3("2", jRadioButton3.getText()));

        jRadioButton4.setText(radio4("2", jRadioButton4.getText()));

        SAVE2.setText("Save and next");
        SAVE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVE2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq2Layout = new javax.swing.GroupLayout(cq2);
        cq2.setLayout(cq2Layout);
        cq2Layout.setHorizontalGroup(
            cq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(cq2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                .addGroup(cq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton4))
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SAVE2)
                .addGap(106, 106, 106))
        );
        cq2Layout.setVerticalGroup(
            cq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(cq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGroup(cq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cq2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jRadioButton4)
                        .addGap(41, 41, 41)
                        .addComponent(SAVE2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(cq2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jRadioButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        question_panel.add(cq2, "card2");

        cq3.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText(textarea("3", jTextArea3.getText()));
        jScrollPane3.setViewportView(jTextArea3);

        jRadioButton5.setText(radio1("3", jRadioButton5.getText()));

        jRadioButton6.setText(radio2("3", jRadioButton6.getText()));

        jRadioButton7.setText(radio3("3", jRadioButton7.getText()));

        jRadioButton8.setText(radio4("3", jRadioButton8.getText()));

        jButton4.setText("Save and next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq3Layout = new javax.swing.GroupLayout(cq3);
        cq3.setLayout(cq3Layout);
        cq3Layout.setHorizontalGroup(
            cq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(cq3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton8))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(91, 91, 91))
        );
        cq3Layout.setVerticalGroup(
            cq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(cq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(cq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        question_panel.add(cq3, "card2");

        cq4.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText(textarea("4", jTextArea4.getText()));
        jScrollPane4.setViewportView(jTextArea4);

        jRadioButton9.setText(radio1("4", jRadioButton9.getText()));

        jRadioButton10.setText(radio2("4", jRadioButton10.getText()));

        jRadioButton11.setText(radio3("4", jRadioButton11.getText()));

        jRadioButton12.setText(radio4("4", jRadioButton12.getText()));

        jButton5.setText("Save and next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq4Layout = new javax.swing.GroupLayout(cq4);
        cq4.setLayout(cq4Layout);
        cq4Layout.setHorizontalGroup(
            cq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(cq4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton10)
                    .addComponent(jRadioButton12))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(84, 84, 84))
        );
        cq4Layout.setVerticalGroup(
            cq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(cq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(cq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        question_panel.add(cq4, "card2");

        cq5.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText(textarea("5", jTextArea5.getText()));
        jScrollPane5.setViewportView(jTextArea5);

        jRadioButton13.setText(radio1("5", jRadioButton13.getText()));

        jRadioButton14.setText(radio2("5", jRadioButton14.getText()));

        jRadioButton15.setText(radio3("5", jRadioButton15.getText()));

        jRadioButton16.setText(radio4("5", jRadioButton16.getText()));

        jButton6.setText("Save and next");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq5Layout = new javax.swing.GroupLayout(cq5);
        cq5.setLayout(cq5Layout);
        cq5Layout.setHorizontalGroup(
            cq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(cq5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton14)
                    .addComponent(jRadioButton16))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(107, 107, 107))
        );
        cq5Layout.setVerticalGroup(
            cq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq5Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(cq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(cq5, "card2");

        cq6.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText(textarea("6", jTextArea6.getText()));
        jScrollPane6.setViewportView(jTextArea6);

        jRadioButton17.setText(radio1("6", jRadioButton17.getText()));

        jRadioButton18.setText(radio2("6", jRadioButton18.getText()));

        jRadioButton19.setText(radio3("6", jRadioButton19.getText()));

        jRadioButton20.setText(radio4("6", jRadioButton20.getText()));

        jButton7.setText("Save and next");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq6Layout = new javax.swing.GroupLayout(cq6);
        cq6.setLayout(cq6Layout);
        cq6Layout.setHorizontalGroup(
            cq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
            .addGroup(cq6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton20))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(110, 110, 110))
        );
        cq6Layout.setVerticalGroup(
            cq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(cq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton19)
                    .addComponent(jRadioButton20))
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        question_panel.add(cq6, "card2");

        cq7.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText(textarea("7", jTextArea7.getText()));
        jScrollPane7.setViewportView(jTextArea7);

        jRadioButton21.setText(radio1("7", jRadioButton21.getText()));

        jRadioButton22.setText(radio2("7", jRadioButton22.getText()));

        jRadioButton23.setText(radio3("7", jRadioButton23.getText()));

        jRadioButton24.setText(radio4("7", jRadioButton24.getText()));

        jButton8.setText("Save and next");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq7Layout = new javax.swing.GroupLayout(cq7);
        cq7.setLayout(cq7Layout);
        cq7Layout.setHorizontalGroup(
            cq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7)
            .addGroup(cq7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton24))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(113, 113, 113))
        );
        cq7Layout.setVerticalGroup(
            cq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq7Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(cq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24))
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        question_panel.add(cq7, "card2");

        cq8.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText(textarea("8", jTextArea8.getText()));
        jScrollPane8.setViewportView(jTextArea8);

        jRadioButton25.setText(radio1("8", jRadioButton25.getText()));

        jRadioButton26.setText(radio2("8", jRadioButton26.getText()));

        jRadioButton27.setText(radio3("8", jRadioButton27.getText()));

        jRadioButton28.setText(radio4("8", jRadioButton28.getText()));

        jButton9.setText("Save and next");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq8Layout = new javax.swing.GroupLayout(cq8);
        cq8.setLayout(cq8Layout);
        cq8Layout.setHorizontalGroup(
            cq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8)
            .addGroup(cq8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addGroup(cq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(113, 113, 113))
        );
        cq8Layout.setVerticalGroup(
            cq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq8Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(cq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28))
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        question_panel.add(cq8, "card2");

        cq9.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText(textarea("9", jTextArea9.getText()));
        jScrollPane9.setViewportView(jTextArea9);

        jRadioButton29.setText(radio1("9", jRadioButton29.getText()));

        jRadioButton30.setText(radio2("9", jRadioButton30.getText()));

        jRadioButton31.setText(radio3("9", jRadioButton31.getText()));

        jRadioButton32.setText(radio4("9", jRadioButton32.getText()));

        jButton10.setText("Save and next");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq9Layout = new javax.swing.GroupLayout(cq9);
        cq9.setLayout(cq9Layout);
        cq9Layout.setHorizontalGroup(
            cq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9)
            .addGroup(cq9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton30)
                    .addComponent(jRadioButton32))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(97, 97, 97))
        );
        cq9Layout.setVerticalGroup(
            cq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq9Layout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton30))
                .addGap(133, 133, 133)
                .addGroup(cq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32))
                .addGap(29, 29, 29)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        question_panel.add(cq9, "card2");

        cq10.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText(textarea("10", jTextArea10.getText()));
        jScrollPane10.setViewportView(jTextArea10);

        jRadioButton33.setText(radio1("10", jRadioButton33.getText()));

        jRadioButton34.setText(radio2("10", jRadioButton34.getText()));

        jRadioButton35.setText(radio3("10", jRadioButton35.getText()));

        jRadioButton36.setText(radio4("10", jRadioButton36.getText()));
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });

        jButton11.setText("Save and next");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq10Layout = new javax.swing.GroupLayout(cq10);
        cq10.setLayout(cq10Layout);
        cq10Layout.setHorizontalGroup(
            cq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10)
            .addGroup(cq10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton34)
                    .addComponent(jRadioButton36))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(110, 110, 110))
        );
        cq10Layout.setVerticalGroup(
            cq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq10Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(cq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton35)
                    .addComponent(jRadioButton36))
                .addGap(26, 26, 26)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        question_panel.add(cq10, "card2");

        cq11.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText(textarea("11", jTextArea11.getText()));
        jScrollPane11.setViewportView(jTextArea11);

        jRadioButton37.setText(radio1("11", jRadioButton37.getText()));

        jRadioButton38.setText(radio2("11", jRadioButton38.getText()));

        jRadioButton39.setText(radio3("11", jRadioButton39.getText()));

        jRadioButton40.setText(radio4("11", jRadioButton40.getText()));

        jButton12.setText("Save and next");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq11Layout = new javax.swing.GroupLayout(cq11);
        cq11.setLayout(cq11Layout);
        cq11Layout.setHorizontalGroup(
            cq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11)
            .addGroup(cq11Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton40))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(113, 113, 113))
        );
        cq11Layout.setVerticalGroup(
            cq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq11Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(cq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton40))
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        question_panel.add(cq11, "card2");

        cq12.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText(textarea("12", jTextArea12.getText()));
        jScrollPane12.setViewportView(jTextArea12);

        jRadioButton41.setText(radio1("12", jRadioButton41.getText()));

        jRadioButton42.setText(radio2("12", jRadioButton42.getText()));

        jRadioButton43.setText(radio3("12", jRadioButton43.getText()));

        jRadioButton44.setText(radio4("12", jRadioButton44.getText()));

        jButton13.setText("Save and next");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq12Layout = new javax.swing.GroupLayout(cq12);
        cq12.setLayout(cq12Layout);
        cq12Layout.setHorizontalGroup(
            cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12)
            .addGroup(cq12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton42)
                    .addComponent(jRadioButton44))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(113, 113, 113))
        );
        cq12Layout.setVerticalGroup(
            cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq12Layout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton41)
                    .addComponent(jRadioButton42))
                .addGroup(cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cq12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton43)
                            .addComponent(jRadioButton44))
                        .addGap(122, 122, 122))
                    .addGroup(cq12Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))))
        );

        question_panel.add(cq12, "card2");

        cq13.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText(textarea("13", jTextArea13.getText()));
        jScrollPane13.setViewportView(jTextArea13);

        jRadioButton45.setText(radio1("13", jRadioButton45.getText()));

        jRadioButton46.setText(radio2("13", jRadioButton46.getText()));

        jRadioButton47.setText(radio1("13", jRadioButton47.getText()));

        jRadioButton48.setText(radio1("13", jRadioButton48.getText()));

        jButton14.setText("Save and next");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq13Layout = new javax.swing.GroupLayout(cq13);
        cq13.setLayout(cq13Layout);
        cq13Layout.setHorizontalGroup(
            cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
            .addGroup(cq13Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton45)
                    .addComponent(jRadioButton47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton46)
                    .addComponent(jRadioButton48))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(111, 111, 111))
        );
        cq13Layout.setVerticalGroup(
            cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq13Layout.createSequentialGroup()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton45)
                    .addComponent(jRadioButton46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addGroup(cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq13Layout.createSequentialGroup()
                        .addGroup(cq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton47)
                            .addComponent(jRadioButton48))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq13Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        question_panel.add(cq13, "card2");

        cq14.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setText(textarea("14", jTextArea14.getText()));
        jScrollPane14.setViewportView(jTextArea14);

        jRadioButton49.setText(radio1("14", jRadioButton49.getText()));

        jRadioButton50.setText(radio2("14", jRadioButton50.getText()));

        jRadioButton51.setText(radio3("14", jRadioButton51.getText()));

        jRadioButton52.setText(radio4("14", jRadioButton52.getText()));

        jButton15.setText("Save and next");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq14Layout = new javax.swing.GroupLayout(cq14);
        cq14.setLayout(cq14Layout);
        cq14Layout.setHorizontalGroup(
            cq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14)
            .addGroup(cq14Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton50)
                    .addComponent(jRadioButton52))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addGap(110, 110, 110))
        );
        cq14Layout.setVerticalGroup(
            cq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq14Layout.createSequentialGroup()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(cq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton51)
                    .addComponent(jRadioButton52))
                .addGap(37, 37, 37)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        question_panel.add(cq14, "card2");

        cq15.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jTextArea15.setText(textarea("15", jTextArea15.getText()));
        jScrollPane15.setViewportView(jTextArea15);

        jRadioButton53.setText(radio1("15", jRadioButton53.getText()));

        jRadioButton54.setText(radio2("15", jRadioButton54.getText()));

        jRadioButton55.setText(radio3("15", jRadioButton55.getText()));

        jRadioButton56.setText(radio4("15", jRadioButton56.getText()));
        jRadioButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton56ActionPerformed(evt);
            }
        });

        jButton16.setText("Save and next");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq15Layout = new javax.swing.GroupLayout(cq15);
        cq15.setLayout(cq15Layout);
        cq15Layout.setHorizontalGroup(
            cq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15)
            .addGroup(cq15Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton54)
                    .addComponent(jRadioButton56))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(118, 118, 118))
        );
        cq15Layout.setVerticalGroup(
            cq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq15Layout.createSequentialGroup()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton54))
                .addGap(126, 126, 126)
                .addGroup(cq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton55)
                    .addComponent(jRadioButton56))
                .addGap(43, 43, 43)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        question_panel.add(cq15, "card2");

        cq16.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea16.setColumns(20);
        jTextArea16.setRows(5);
        jTextArea16.setText(textarea("16", jTextArea16.getText()));
        jScrollPane16.setViewportView(jTextArea16);

        jRadioButton57.setText(radio1("16", jRadioButton57.getText()));

        jRadioButton58.setText(radio2("16", jRadioButton58.getText()));

        jRadioButton59.setText(radio3("16", jRadioButton59.getText()));

        jRadioButton60.setText(radio4("16", jRadioButton60.getText()));

        jButton17.setText("Save and next");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq16Layout = new javax.swing.GroupLayout(cq16);
        cq16.setLayout(cq16Layout);
        cq16Layout.setHorizontalGroup(
            cq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane16)
            .addGroup(cq16Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton57)
                    .addComponent(jRadioButton59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addGroup(cq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton60, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addGap(122, 122, 122))
        );
        cq16Layout.setVerticalGroup(
            cq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq16Layout.createSequentialGroup()
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton57)
                    .addComponent(jRadioButton58))
                .addGap(119, 119, 119)
                .addGroup(cq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton59)
                    .addComponent(jRadioButton60))
                .addGap(46, 46, 46)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        question_panel.add(cq16, "card2");

        cq17.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea17.setColumns(20);
        jTextArea17.setRows(5);
        jTextArea17.setText(textarea("17", jTextArea17.getText()));
        jScrollPane17.setViewportView(jTextArea17);

        jRadioButton61.setText(radio1("17", jRadioButton61.getText()));

        jRadioButton62.setText(radio2("17", jRadioButton62.getText()));

        jRadioButton63.setText(radio3("17", jRadioButton63.getText()));

        jRadioButton64.setText(radio4("17", jRadioButton64.getText()));

        jButton18.setText("Save and next");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq17Layout = new javax.swing.GroupLayout(cq17);
        cq17.setLayout(cq17Layout);
        cq17Layout.setHorizontalGroup(
            cq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane17)
            .addGroup(cq17Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(cq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton63)
                    .addComponent(jRadioButton61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addGroup(cq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton62)
                    .addComponent(jRadioButton64))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18)
                .addGap(92, 92, 92))
        );
        cq17Layout.setVerticalGroup(
            cq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq17Layout.createSequentialGroup()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton61)
                    .addComponent(jRadioButton62))
                .addGap(127, 127, 127)
                .addGroup(cq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton63)
                    .addComponent(jRadioButton64))
                .addGap(38, 38, 38)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        question_panel.add(cq17, "card2");

        cq18.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea18.setColumns(20);
        jTextArea18.setRows(5);
        jTextArea18.setText(textarea("18", jTextArea18.getText()));
        jScrollPane18.setViewportView(jTextArea18);

        jRadioButton65.setText(radio1("18", jRadioButton65.getText()));

        jRadioButton66.setText(radio1("18", jRadioButton66.getText()));

        jRadioButton67.setText(radio1("18", jRadioButton67.getText()));

        jRadioButton68.setText(radio1("18", jRadioButton68.getText()));

        jButton19.setText("Save and next");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq18Layout = new javax.swing.GroupLayout(cq18);
        cq18.setLayout(cq18Layout);
        cq18Layout.setHorizontalGroup(
            cq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane18)
            .addGroup(cq18Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton65)
                    .addComponent(jRadioButton67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton66)
                    .addComponent(jRadioButton68))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton19)
                .addGap(114, 114, 114))
        );
        cq18Layout.setVerticalGroup(
            cq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq18Layout.createSequentialGroup()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton65)
                    .addComponent(jRadioButton66))
                .addGap(122, 122, 122)
                .addGroup(cq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton67)
                    .addComponent(jRadioButton68))
                .addGap(34, 34, 34)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        question_panel.add(cq18, "card2");

        cq19.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea19.setColumns(20);
        jTextArea19.setRows(5);
        jTextArea19.setText(textarea("19", jTextArea19.getText()));
        jScrollPane19.setViewportView(jTextArea19);

        jRadioButton69.setText(radio1("19", jRadioButton69.getText()));

        jRadioButton70.setText(radio2("19", jRadioButton70.getText()));

        jRadioButton71.setText(radio3("19", jRadioButton71.getText()));

        jRadioButton72.setText(radio4("19", jRadioButton72.getText()));

        jButton20.setText("Save and next");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq19Layout = new javax.swing.GroupLayout(cq19);
        cq19.setLayout(cq19Layout);
        cq19Layout.setHorizontalGroup(
            cq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane19)
            .addGroup(cq19Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton69)
                    .addComponent(jRadioButton71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(cq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton70)
                    .addComponent(jRadioButton72))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton20)
                .addGap(111, 111, 111))
        );
        cq19Layout.setVerticalGroup(
            cq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq19Layout.createSequentialGroup()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton69)
                    .addComponent(jRadioButton70))
                .addGap(130, 130, 130)
                .addGroup(cq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton71)
                    .addComponent(jRadioButton72))
                .addGap(27, 27, 27)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        question_panel.add(cq19, "card2");

        cq20.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea20.setColumns(20);
        jTextArea20.setRows(5);
        jTextArea20.setText(textarea("20", jTextArea20.getText()));
        jScrollPane20.setViewportView(jTextArea20);

        jRadioButton73.setText(radio1("20", jRadioButton73.getText()));

        jRadioButton74.setText(radio2("20", jRadioButton74.getText()));

        jRadioButton75.setText(radio3("20", jRadioButton75.getText()));

        jRadioButton76.setText(radio4("20", jRadioButton76.getText()));

        jButton21.setText("Save and next");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cq20Layout = new javax.swing.GroupLayout(cq20);
        cq20.setLayout(cq20Layout);
        cq20Layout.setHorizontalGroup(
            cq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane20)
            .addGroup(cq20Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(cq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton75, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jRadioButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addGroup(cq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton76, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cq20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton21)
                .addGap(121, 121, 121))
        );
        cq20Layout.setVerticalGroup(
            cq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cq20Layout.createSequentialGroup()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(cq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton73)
                    .addComponent(jRadioButton74))
                .addGap(118, 118, 118)
                .addGroup(cq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton75)
                    .addComponent(jRadioButton76))
                .addGap(32, 32, 32)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        question_panel.add(cq20, "card2");

        jq1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea21.setColumns(20);
        jTextArea21.setRows(5);
        jTextArea21.setText(textarea("21", jTextArea21.getText()));
        jScrollPane21.setViewportView(jTextArea21);

        jRadioButton77.setText(radio1("21", jRadioButton77.getText()));

        jRadioButton78.setText(radio2("21", jRadioButton78.getText()));

        jRadioButton79.setText(radio3("21", jRadioButton79.getText()));

        jRadioButton80.setText(radio4("21", jRadioButton80.getText()));

        jButton22.setText("Save and next");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq1Layout = new javax.swing.GroupLayout(jq1);
        jq1.setLayout(jq1Layout);
        jq1Layout.setHorizontalGroup(
            jq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane21)
            .addGroup(jq1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton77)
                    .addComponent(jRadioButton79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton78)
                    .addComponent(jRadioButton80))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addGap(109, 109, 109))
        );
        jq1Layout.setVerticalGroup(
            jq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq1Layout.createSequentialGroup()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton77)
                    .addComponent(jRadioButton78))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton79)
                    .addComponent(jRadioButton80))
                .addGap(18, 18, 18)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq1, "card2");

        jq2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea22.setColumns(20);
        jTextArea22.setRows(5);
        jTextArea22.setText(textarea("22", jTextArea22.getText()));
        jScrollPane22.setViewportView(jTextArea22);

        jRadioButton81.setText(radio1("22", jRadioButton81.getText()));

        jRadioButton82.setText(radio2("22", jRadioButton82.getText()));

        jRadioButton83.setText(radio3("22", jRadioButton83.getText()));

        jRadioButton84.setText(radio4("22", jRadioButton84.getText()));

        jButton23.setText("Save and next");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq2Layout = new javax.swing.GroupLayout(jq2);
        jq2.setLayout(jq2Layout);
        jq2Layout.setHorizontalGroup(
            jq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane22)
            .addGroup(jq2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton81)
                    .addComponent(jRadioButton83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton82)
                    .addComponent(jRadioButton84))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton23)
                .addGap(112, 112, 112))
        );
        jq2Layout.setVerticalGroup(
            jq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq2Layout.createSequentialGroup()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton81)
                    .addComponent(jRadioButton82))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton83)
                    .addComponent(jRadioButton84))
                .addGap(18, 18, 18)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq2, "card2");

        jq3.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea23.setColumns(20);
        jTextArea23.setRows(5);
        jTextArea23.setText(textarea("23", jTextArea23.getText()));
        jScrollPane23.setViewportView(jTextArea23);

        jRadioButton85.setText(radio1("23", jRadioButton85.getText()));

        jRadioButton86.setText(radio2("23", jRadioButton86.getText()));

        jRadioButton87.setText(radio3("23", jRadioButton87.getText()));

        jRadioButton88.setText(radio4("23", jRadioButton88.getText()));

        jButton24.setText("Save and next");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq3Layout = new javax.swing.GroupLayout(jq3);
        jq3.setLayout(jq3Layout);
        jq3Layout.setHorizontalGroup(
            jq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane23)
            .addGroup(jq3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton85)
                    .addComponent(jRadioButton87))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton86)
                    .addComponent(jRadioButton88))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton24)
                .addGap(116, 116, 116))
        );
        jq3Layout.setVerticalGroup(
            jq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq3Layout.createSequentialGroup()
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton85)
                    .addComponent(jRadioButton86))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton87)
                    .addComponent(jRadioButton88))
                .addGap(18, 18, 18)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq3, "card2");

        jq4.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea24.setColumns(20);
        jTextArea24.setRows(5);
        jTextArea24.setText(textarea("24", jTextArea24.getText()));
        jScrollPane24.setViewportView(jTextArea24);

        jRadioButton89.setText(radio1("24", jRadioButton89.getText()));

        jRadioButton90.setText(radio2("24", jRadioButton90.getText()));

        jRadioButton91.setText(radio3("24", jRadioButton91.getText()));

        jRadioButton92.setText(radio4("24", jRadioButton92.getText()));

        jButton25.setText("Save and next");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq4Layout = new javax.swing.GroupLayout(jq4);
        jq4.setLayout(jq4Layout);
        jq4Layout.setHorizontalGroup(
            jq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane24)
            .addGroup(jq4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton89)
                    .addComponent(jRadioButton91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton90)
                    .addComponent(jRadioButton92))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(112, 112, 112))
        );
        jq4Layout.setVerticalGroup(
            jq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq4Layout.createSequentialGroup()
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton89)
                    .addComponent(jRadioButton90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton91)
                    .addComponent(jRadioButton92))
                .addGap(18, 18, 18)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq4, "card2");

        jq5.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea25.setColumns(20);
        jTextArea25.setRows(5);
        jTextArea25.setText(textarea("25", jTextArea25.getText()));
        jScrollPane25.setViewportView(jTextArea25);

        jRadioButton93.setText(radio1("24", jRadioButton93.getText()));

        jRadioButton94.setText(radio2("25", jRadioButton94.getText()));

        jRadioButton95.setText(radio3("25", jRadioButton95.getText()));

        jRadioButton96.setText(radio4("25", jRadioButton96.getText()));

        jButton26.setText("Save and next");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq5Layout = new javax.swing.GroupLayout(jq5);
        jq5.setLayout(jq5Layout);
        jq5Layout.setHorizontalGroup(
            jq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane25)
            .addGroup(jq5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton93)
                    .addComponent(jRadioButton95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton94)
                    .addComponent(jRadioButton96))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton26)
                .addGap(106, 106, 106))
        );
        jq5Layout.setVerticalGroup(
            jq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq5Layout.createSequentialGroup()
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton93)
                    .addComponent(jRadioButton94))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton95)
                    .addComponent(jRadioButton96))
                .addGap(18, 18, 18)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq5, "card2");

        jq6.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea26.setColumns(20);
        jTextArea26.setRows(5);
        jTextArea26.setText(textarea("26", jTextArea26.getText()));
        jScrollPane26.setViewportView(jTextArea26);

        jRadioButton97.setText(radio1("26", jRadioButton97.getText()));

        jRadioButton98.setText(radio2("26", jRadioButton98.getText()));

        jRadioButton99.setText(radio3("26", jRadioButton99.getText()));

        jRadioButton100.setText(radio4("26", jRadioButton100.getText()));

        jButton27.setText("Save and next");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq6Layout = new javax.swing.GroupLayout(jq6);
        jq6.setLayout(jq6Layout);
        jq6Layout.setHorizontalGroup(
            jq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane26)
            .addGroup(jq6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton97)
                    .addComponent(jRadioButton99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton98)
                    .addComponent(jRadioButton100))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(112, 112, 112))
        );
        jq6Layout.setVerticalGroup(
            jq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq6Layout.createSequentialGroup()
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton97)
                    .addComponent(jRadioButton98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton99)
                    .addComponent(jRadioButton100))
                .addGap(18, 18, 18)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq6, "card2");

        jq7.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea27.setColumns(20);
        jTextArea27.setRows(5);
        jTextArea27.setText(textarea("27", jTextArea27.getText()));
        jScrollPane27.setViewportView(jTextArea27);

        jRadioButton101.setText(radio1("27", jRadioButton101.getText()));

        jRadioButton102.setText(radio2("27", jRadioButton101.getText()));

        jRadioButton103.setText(radio3("27", jRadioButton103.getText()));

        jRadioButton104.setText(radio4("27", jRadioButton104.getText()));

        jButton28.setText("Save and next");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq7Layout = new javax.swing.GroupLayout(jq7);
        jq7.setLayout(jq7Layout);
        jq7Layout.setHorizontalGroup(
            jq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane27)
            .addGroup(jq7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton101)
                    .addComponent(jRadioButton103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton102)
                    .addComponent(jRadioButton104))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton28)
                .addGap(109, 109, 109))
        );
        jq7Layout.setVerticalGroup(
            jq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq7Layout.createSequentialGroup()
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton101)
                    .addComponent(jRadioButton102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton103)
                    .addComponent(jRadioButton104))
                .addGap(18, 18, 18)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq7, "card2");

        jq8.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea28.setColumns(20);
        jTextArea28.setRows(5);
        jTextArea28.setText(textarea("28", jTextArea28.getText()));
        jScrollPane28.setViewportView(jTextArea28);

        jRadioButton105.setText(radio1("28", jRadioButton105.getText()));

        jRadioButton106.setText(radio2("28", jRadioButton106.getText()));

        jRadioButton107.setText(radio3("28", jRadioButton107.getText()));

        jRadioButton108.setText(radio4("28", jRadioButton108.getText()));

        jButton29.setText("Save and next");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq8Layout = new javax.swing.GroupLayout(jq8);
        jq8.setLayout(jq8Layout);
        jq8Layout.setHorizontalGroup(
            jq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane28)
            .addGroup(jq8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton105)
                    .addComponent(jRadioButton107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton106)
                    .addComponent(jRadioButton108))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton29)
                .addGap(105, 105, 105))
        );
        jq8Layout.setVerticalGroup(
            jq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq8Layout.createSequentialGroup()
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton105)
                    .addComponent(jRadioButton106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton107)
                    .addComponent(jRadioButton108))
                .addGap(18, 18, 18)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq8, "card2");

        jq9.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea29.setColumns(20);
        jTextArea29.setRows(5);
        jTextArea29.setText(textarea("29", jTextArea29.getText()));
        jScrollPane29.setViewportView(jTextArea29);

        jRadioButton109.setText(radio1("29", jRadioButton109.getText()));

        jRadioButton110.setText(radio2("29", jRadioButton110.getText()));

        jRadioButton111.setText(radio3("29", jRadioButton111.getText()));

        jRadioButton112.setText(radio4("29", jRadioButton112.getText()));

        jButton30.setText("Save and next");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq9Layout = new javax.swing.GroupLayout(jq9);
        jq9.setLayout(jq9Layout);
        jq9Layout.setHorizontalGroup(
            jq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane29)
            .addGroup(jq9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton109)
                    .addComponent(jRadioButton111))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton110)
                    .addComponent(jRadioButton112))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton30)
                .addGap(109, 109, 109))
        );
        jq9Layout.setVerticalGroup(
            jq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq9Layout.createSequentialGroup()
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton109)
                    .addComponent(jRadioButton110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton111)
                    .addComponent(jRadioButton112))
                .addGap(18, 18, 18)
                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq9, "card2");

        jq10.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea30.setColumns(20);
        jTextArea30.setRows(5);
        jTextArea30.setText(textarea("30", jTextArea30.getText()));
        jScrollPane30.setViewportView(jTextArea30);

        jRadioButton113.setText(radio1("30", jRadioButton113.getText()));

        jRadioButton114.setText(radio2("30", jRadioButton114.getText()));

        jRadioButton115.setText(radio3("30", jRadioButton115.getText()));

        jRadioButton116.setText(radio4("30", jRadioButton116.getText()));

        jButton31.setText("Save and next");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq10Layout = new javax.swing.GroupLayout(jq10);
        jq10.setLayout(jq10Layout);
        jq10Layout.setHorizontalGroup(
            jq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane30)
            .addGroup(jq10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton113)
                    .addComponent(jRadioButton115))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton114)
                    .addComponent(jRadioButton116))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton31)
                .addGap(107, 107, 107))
        );
        jq10Layout.setVerticalGroup(
            jq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq10Layout.createSequentialGroup()
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton113)
                    .addComponent(jRadioButton114))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton115)
                    .addComponent(jRadioButton116))
                .addGap(18, 18, 18)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq10, "card2");

        jq11.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea31.setColumns(20);
        jTextArea31.setRows(5);
        jTextArea31.setText(textarea("31", jTextArea31.getText()));
        jScrollPane31.setViewportView(jTextArea31);

        jRadioButton117.setText(radio1("117", jRadioButton117.getText()));

        jRadioButton118.setText(radio2("31", jRadioButton118.getText()));

        jRadioButton119.setText(radio3("31", jRadioButton119.getText()));

        jRadioButton120.setText(radio4("31", jRadioButton120.getText()));

        jButton32.setText("Save and next");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq11Layout = new javax.swing.GroupLayout(jq11);
        jq11.setLayout(jq11Layout);
        jq11Layout.setHorizontalGroup(
            jq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane31)
            .addGroup(jq11Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton117)
                    .addComponent(jRadioButton119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton118)
                    .addComponent(jRadioButton120))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton32)
                .addGap(108, 108, 108))
        );
        jq11Layout.setVerticalGroup(
            jq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq11Layout.createSequentialGroup()
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton117)
                    .addComponent(jRadioButton118))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton119)
                    .addComponent(jRadioButton120))
                .addGap(18, 18, 18)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq11, "card2");

        jq12.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea32.setColumns(20);
        jTextArea32.setRows(5);
        jTextArea32.setText(textarea("32", jTextArea32.getText()));
        jScrollPane32.setViewportView(jTextArea32);

        jRadioButton121.setText(radio1("32", jRadioButton121.getText()));

        jRadioButton122.setText(radio2("32", jRadioButton122.getText()));

        jRadioButton123.setText(radio3("32", jRadioButton123.getText()));

        jRadioButton124.setText(radio4("32", jRadioButton124.getText()));

        jButton33.setText("Save and next");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq12Layout = new javax.swing.GroupLayout(jq12);
        jq12.setLayout(jq12Layout);
        jq12Layout.setHorizontalGroup(
            jq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane32)
            .addGroup(jq12Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton121)
                    .addComponent(jRadioButton123))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton122)
                    .addComponent(jRadioButton124))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton33)
                .addGap(110, 110, 110))
        );
        jq12Layout.setVerticalGroup(
            jq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq12Layout.createSequentialGroup()
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton121)
                    .addComponent(jRadioButton122))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton123)
                    .addComponent(jRadioButton124))
                .addGap(18, 18, 18)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq12, "card2");

        jq13.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea33.setColumns(20);
        jTextArea33.setRows(5);
        jTextArea33.setText(textarea("33", jTextArea33.getText()));
        jScrollPane33.setViewportView(jTextArea33);

        jRadioButton125.setText(radio1("33", jRadioButton125.getText()));

        jRadioButton126.setText(radio2("33", jRadioButton126.getText()));

        jRadioButton127.setText(radio3("33", jRadioButton127.getText()));
        jRadioButton127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton127ActionPerformed(evt);
            }
        });

        jRadioButton128.setText(radio4("33", jRadioButton128.getText()));

        jButton34.setText("Save and next");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq13Layout = new javax.swing.GroupLayout(jq13);
        jq13.setLayout(jq13Layout);
        jq13Layout.setHorizontalGroup(
            jq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane33)
            .addGroup(jq13Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton125)
                    .addComponent(jRadioButton127))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton126)
                    .addComponent(jRadioButton128))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton34)
                .addGap(110, 110, 110))
        );
        jq13Layout.setVerticalGroup(
            jq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq13Layout.createSequentialGroup()
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton125)
                    .addComponent(jRadioButton126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton127)
                    .addComponent(jRadioButton128))
                .addGap(18, 18, 18)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq13, "card2");

        jq14.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea34.setColumns(20);
        jTextArea34.setRows(5);
        jTextArea34.setText(textarea("34", jTextArea34.getText()));
        jScrollPane34.setViewportView(jTextArea34);

        jRadioButton129.setText(radio1("34", jRadioButton129.getText()));

        jRadioButton130.setText(radio2("34", jRadioButton130.getText()));

        jRadioButton131.setText(radio3("34", jRadioButton131.getText()));

        jRadioButton132.setText(radio4("34", jRadioButton132.getText()));

        jButton35.setText("Save and next");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq14Layout = new javax.swing.GroupLayout(jq14);
        jq14.setLayout(jq14Layout);
        jq14Layout.setHorizontalGroup(
            jq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane34)
            .addGroup(jq14Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton129)
                    .addComponent(jRadioButton131))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton130)
                    .addComponent(jRadioButton132))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton35)
                .addGap(106, 106, 106))
        );
        jq14Layout.setVerticalGroup(
            jq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq14Layout.createSequentialGroup()
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton129)
                    .addComponent(jRadioButton130))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton131)
                    .addComponent(jRadioButton132))
                .addGap(18, 18, 18)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq14, "card2");

        jq15.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea35.setColumns(20);
        jTextArea35.setRows(5);
        jTextArea35.setText(textarea("35", jTextArea35.getText()));
        jScrollPane35.setViewportView(jTextArea35);

        jRadioButton133.setText(radio1("35", jRadioButton133.getText()));

        jRadioButton134.setText(radio2("35", jRadioButton134.getText()));

        jRadioButton135.setText(radio3("35", jRadioButton135.getText()));

        jRadioButton136.setText(radio4("35", jRadioButton136.getText()));

        jButton36.setText("Save and next");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq15Layout = new javax.swing.GroupLayout(jq15);
        jq15.setLayout(jq15Layout);
        jq15Layout.setHorizontalGroup(
            jq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane35)
            .addGroup(jq15Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton133)
                    .addComponent(jRadioButton135))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton134)
                    .addComponent(jRadioButton136))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton36)
                .addGap(115, 115, 115))
        );
        jq15Layout.setVerticalGroup(
            jq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq15Layout.createSequentialGroup()
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton133)
                    .addComponent(jRadioButton134))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton135)
                    .addComponent(jRadioButton136))
                .addGap(18, 18, 18)
                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq15, "card2");

        jq16.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea36.setColumns(20);
        jTextArea36.setRows(5);
        jTextArea36.setText(textarea("36", jTextArea36.getText()));
        jScrollPane36.setViewportView(jTextArea36);

        jRadioButton137.setText(radio1("36", jRadioButton137.getText()));

        jRadioButton138.setText(radio2("36", jRadioButton138.getText()));

        jRadioButton139.setText(radio3("36", jRadioButton139.getText()));

        jRadioButton140.setText(radio4("36", jRadioButton140.getText()));

        jButton37.setText("Save and next");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq16Layout = new javax.swing.GroupLayout(jq16);
        jq16.setLayout(jq16Layout);
        jq16Layout.setHorizontalGroup(
            jq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane36)
            .addGroup(jq16Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton137)
                    .addComponent(jRadioButton139))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton138)
                    .addComponent(jRadioButton140))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton37)
                .addGap(110, 110, 110))
        );
        jq16Layout.setVerticalGroup(
            jq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq16Layout.createSequentialGroup()
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton137)
                    .addComponent(jRadioButton138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton139)
                    .addComponent(jRadioButton140))
                .addGap(18, 18, 18)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq16, "card2");

        jq17.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea37.setColumns(20);
        jTextArea37.setRows(5);
        jTextArea37.setText(textarea("37", jTextArea37.getText()));
        jScrollPane37.setViewportView(jTextArea37);

        jRadioButton141.setText(radio1("37", jRadioButton141.getText()));
        jRadioButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton141ActionPerformed(evt);
            }
        });

        jRadioButton142.setText(radio2("37", jRadioButton142.getText()));

        jRadioButton143.setText(radio3("37", jRadioButton143.getText()));

        jRadioButton144.setText(radio4("37", jRadioButton144.getText()));

        jButton38.setText("Save and next");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq17Layout = new javax.swing.GroupLayout(jq17);
        jq17.setLayout(jq17Layout);
        jq17Layout.setHorizontalGroup(
            jq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane37)
            .addGroup(jq17Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton141)
                    .addComponent(jRadioButton143))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton142)
                    .addComponent(jRadioButton144))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton38)
                .addGap(107, 107, 107))
        );
        jq17Layout.setVerticalGroup(
            jq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq17Layout.createSequentialGroup()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton141)
                    .addComponent(jRadioButton142))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton143)
                    .addComponent(jRadioButton144))
                .addGap(18, 18, 18)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq17, "card2");

        jq18.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea38.setColumns(20);
        jTextArea38.setRows(5);
        jTextArea38.setText(textarea("38", jTextArea38.getText()));
        jScrollPane38.setViewportView(jTextArea38);

        jRadioButton145.setText(radio1("38", jRadioButton145.getText()));

        jRadioButton146.setText(radio2("38", jRadioButton146.getText()));

        jRadioButton147.setText(radio3("38", jRadioButton147.getText()));

        jRadioButton148.setText(radio4("38", jRadioButton148.getText()));

        jButton39.setText("Save and next");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq18Layout = new javax.swing.GroupLayout(jq18);
        jq18.setLayout(jq18Layout);
        jq18Layout.setHorizontalGroup(
            jq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane38)
            .addGroup(jq18Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton145)
                    .addComponent(jRadioButton147))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton146)
                    .addComponent(jRadioButton148))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton39)
                .addGap(109, 109, 109))
        );
        jq18Layout.setVerticalGroup(
            jq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq18Layout.createSequentialGroup()
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton145)
                    .addComponent(jRadioButton146))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton147)
                    .addComponent(jRadioButton148))
                .addGap(18, 18, 18)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq18, "card2");

        jq19.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea39.setColumns(20);
        jTextArea39.setRows(5);
        jTextArea39.setText(textarea("39", jTextArea39.getText()));
        jScrollPane39.setViewportView(jTextArea39);

        jRadioButton149.setText(radio1("39", jRadioButton149.getText()));

        jRadioButton150.setText(radio2("39", jRadioButton150.getText()));

        jRadioButton151.setText(radio3("39", jRadioButton151.getText()));

        jRadioButton152.setText(radio4("39", jRadioButton152.getText()));

        jButton40.setText("Save and next");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq19Layout = new javax.swing.GroupLayout(jq19);
        jq19.setLayout(jq19Layout);
        jq19Layout.setHorizontalGroup(
            jq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane39)
            .addGroup(jq19Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton149)
                    .addComponent(jRadioButton151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton150)
                    .addComponent(jRadioButton152))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton40)
                .addGap(111, 111, 111))
        );
        jq19Layout.setVerticalGroup(
            jq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq19Layout.createSequentialGroup()
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton149)
                    .addComponent(jRadioButton150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton151)
                    .addComponent(jRadioButton152))
                .addGap(18, 18, 18)
                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq19, "card2");

        jq20.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea40.setColumns(20);
        jTextArea40.setRows(5);
        jTextArea40.setText(textarea("40", jTextArea40.getText()));
        jScrollPane40.setViewportView(jTextArea40);

        jRadioButton153.setText(radio1("40", jRadioButton153.getText()));

        jRadioButton154.setText(radio2("40", jRadioButton154.getText()));

        jRadioButton155.setText(radio3("40", jRadioButton155.getText()));

        jRadioButton156.setText(radio4("40", jRadioButton156.getText()));

        jButton41.setText("Save and next");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jq20Layout = new javax.swing.GroupLayout(jq20);
        jq20.setLayout(jq20Layout);
        jq20Layout.setHorizontalGroup(
            jq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane40)
            .addGroup(jq20Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton153)
                    .addComponent(jRadioButton155))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                .addGroup(jq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton154)
                    .addComponent(jRadioButton156))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jq20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton41)
                .addGap(116, 116, 116))
        );
        jq20Layout.setVerticalGroup(
            jq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jq20Layout.createSequentialGroup()
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton153)
                    .addComponent(jRadioButton154))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(jq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton155)
                    .addComponent(jRadioButton156))
                .addGap(18, 18, 18)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        question_panel.add(jq20, "card2");

        cppq1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea41.setEditable(false);
        jTextArea41.setColumns(20);
        jTextArea41.setRows(5);
        jTextArea41.setText(textarea("41", jTextArea41.getText()));
        jScrollPane41.setViewportView(jTextArea41);

        cq1_radiobutton5.setText(radio1("41", cq1_radiobutton5.getText()));

        cq1_radiobutton6.setText(radio2("41", cq1_radiobutton6.getText()));

        cq1_radiobutton7.setText(radio3("41", cq1_radiobutton7.getText()));

        cq1_radiobutton8.setText(radio4("41", cq1_radiobutton8.getText()));

        jButton42.setText("Save and next");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq1Layout = new javax.swing.GroupLayout(cppq1);
        cppq1.setLayout(cppq1Layout);
        cppq1Layout.setHorizontalGroup(
            cppq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane41)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton5)
                    .addComponent(cq1_radiobutton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton8)
                    .addComponent(cq1_radiobutton6))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton42)
                .addGap(71, 71, 71))
        );
        cppq1Layout.setVerticalGroup(
            cppq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq1Layout.createSequentialGroup()
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton5)
                    .addComponent(cq1_radiobutton6))
                .addGap(114, 114, 114)
                .addGroup(cppq1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton8)
                    .addComponent(cq1_radiobutton7))
                .addGap(18, 18, 18)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq1, "card2");

        cppq2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea42.setEditable(false);
        jTextArea42.setColumns(20);
        jTextArea42.setRows(5);
        jTextArea42.setText(textarea("42", jTextArea42.getText()));
        jScrollPane42.setViewportView(jTextArea42);

        cq1_radiobutton9.setText(radio1("42", cq1_radiobutton9.getText()));

        cq1_radiobutton10.setText(radio2("42", cq1_radiobutton10.getText()));

        cq1_radiobutton11.setText(radio3("42", cq1_radiobutton11.getText()));

        cq1_radiobutton12.setText(radio4("42", cq1_radiobutton12.getText()));

        jButton43.setText("Save and next");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq2Layout = new javax.swing.GroupLayout(cppq2);
        cppq2.setLayout(cppq2Layout);
        cppq2Layout.setHorizontalGroup(
            cppq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane42)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton9)
                    .addComponent(cq1_radiobutton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton12)
                    .addComponent(cq1_radiobutton10))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton43)
                .addGap(71, 71, 71))
        );
        cppq2Layout.setVerticalGroup(
            cppq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq2Layout.createSequentialGroup()
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton9)
                    .addComponent(cq1_radiobutton10))
                .addGap(114, 114, 114)
                .addGroup(cppq2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton12)
                    .addComponent(cq1_radiobutton11))
                .addGap(18, 18, 18)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq2, "card2");

        cppq3.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea43.setEditable(false);
        jTextArea43.setColumns(20);
        jTextArea43.setRows(5);
        jTextArea43.setText(textarea("43", jTextArea43.getText()));
        jScrollPane43.setViewportView(jTextArea43);

        cq1_radiobutton13.setText(radio1("43", cq1_radiobutton13.getText())
        );

        cq1_radiobutton14.setText(radio2("43", cq1_radiobutton14.getText()));

        cq1_radiobutton15.setText(radio3("43", cq1_radiobutton15.getText()));

        cq1_radiobutton16.setText(radio4("43", cq1_radiobutton16.getText()));

        jButton44.setText("Save and next");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq3Layout = new javax.swing.GroupLayout(cppq3);
        cppq3.setLayout(cppq3Layout);
        cppq3Layout.setHorizontalGroup(
            cppq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane43)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton13)
                    .addComponent(cq1_radiobutton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton16)
                    .addComponent(cq1_radiobutton14))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton44)
                .addGap(71, 71, 71))
        );
        cppq3Layout.setVerticalGroup(
            cppq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq3Layout.createSequentialGroup()
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton13)
                    .addComponent(cq1_radiobutton14))
                .addGap(114, 114, 114)
                .addGroup(cppq3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton16)
                    .addComponent(cq1_radiobutton15))
                .addGap(18, 18, 18)
                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq3, "card2");

        cppq4.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea44.setEditable(false);
        jTextArea44.setColumns(20);
        jTextArea44.setRows(5);
        jTextArea44.setText(textarea("44", jTextArea44.getText()));
        jScrollPane44.setViewportView(jTextArea44);

        cq1_radiobutton17.setText(radio1("44", cq1_radiobutton17.getText()));

        cq1_radiobutton18.setText(radio2("44", cq1_radiobutton18.getText()));

        cq1_radiobutton19.setText(radio3("44", cq1_radiobutton19.getText()));

        cq1_radiobutton20.setText(radio4("44", cq1_radiobutton20.getText())
        );

        jButton45.setText("Save and next");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq4Layout = new javax.swing.GroupLayout(cppq4);
        cppq4.setLayout(cppq4Layout);
        cppq4Layout.setHorizontalGroup(
            cppq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane44)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton17)
                    .addComponent(cq1_radiobutton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton20)
                    .addComponent(cq1_radiobutton18))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton45)
                .addGap(71, 71, 71))
        );
        cppq4Layout.setVerticalGroup(
            cppq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq4Layout.createSequentialGroup()
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton17)
                    .addComponent(cq1_radiobutton18))
                .addGap(114, 114, 114)
                .addGroup(cppq4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton20)
                    .addComponent(cq1_radiobutton19))
                .addGap(18, 18, 18)
                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq4, "card2");

        cppq5.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea45.setEditable(false);
        jTextArea45.setColumns(20);
        jTextArea45.setRows(5);
        jTextArea45.setText(textarea("45", jTextArea45.getText()));
        jScrollPane45.setViewportView(jTextArea45);

        cq1_radiobutton21.setText(radio1("45", cq1_radiobutton21.getText()));

        cq1_radiobutton22.setText(radio2("45", cq1_radiobutton22.getText()));

        cq1_radiobutton23.setText(radio3("45", cq1_radiobutton23.getText()));

        cq1_radiobutton24.setText(radio4("45", cq1_radiobutton24.getText()));
        cq1_radiobutton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq1_radiobutton24ActionPerformed(evt);
            }
        });

        jButton46.setText("Save and next");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq5Layout = new javax.swing.GroupLayout(cppq5);
        cppq5.setLayout(cppq5Layout);
        cppq5Layout.setHorizontalGroup(
            cppq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane45)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton21)
                    .addComponent(cq1_radiobutton23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addGroup(cppq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton24)
                    .addComponent(cq1_radiobutton22))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton46)
                .addGap(71, 71, 71))
        );
        cppq5Layout.setVerticalGroup(
            cppq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq5Layout.createSequentialGroup()
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton21)
                    .addComponent(cq1_radiobutton22))
                .addGap(114, 114, 114)
                .addGroup(cppq5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton24)
                    .addComponent(cq1_radiobutton23))
                .addGap(18, 18, 18)
                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq5, "card2");

        cppq6.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea46.setEditable(false);
        jTextArea46.setColumns(20);
        jTextArea46.setRows(5);
        jTextArea46.setText(textarea("46", jTextArea46.getText()));
        jScrollPane46.setViewportView(jTextArea46);

        cq1_radiobutton25.setText(radio1("46", cq1_radiobutton25.getText())
        );

        cq1_radiobutton26.setText(radio2("46", cq1_radiobutton26.getText())
        );

        cq1_radiobutton27.setText(radio3("46", cq1_radiobutton27.getText())
        );

        cq1_radiobutton28.setText(radio4("46", cq1_radiobutton28.getText())
        );

        jButton47.setText("Save and next");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq6Layout = new javax.swing.GroupLayout(cppq6);
        cppq6.setLayout(cppq6Layout);
        cppq6Layout.setHorizontalGroup(
            cppq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane46)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton25)
                    .addComponent(cq1_radiobutton27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton28)
                    .addComponent(cq1_radiobutton26))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton47)
                .addGap(71, 71, 71))
        );
        cppq6Layout.setVerticalGroup(
            cppq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq6Layout.createSequentialGroup()
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton25)
                    .addComponent(cq1_radiobutton26))
                .addGap(114, 114, 114)
                .addGroup(cppq6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton28)
                    .addComponent(cq1_radiobutton27))
                .addGap(18, 18, 18)
                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq6, "card2");

        cppq7.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea47.setEditable(false);
        jTextArea47.setColumns(20);
        jTextArea47.setRows(5);
        jTextArea47.setText(textarea("47", jTextArea47.getText())
        );
        jScrollPane47.setViewportView(jTextArea47);

        cq1_radiobutton29.setText(radio1("47", cq1_radiobutton29.getText())
        );

        cq1_radiobutton30.setText(radio2("47", cq1_radiobutton30.getText())
        );

        cq1_radiobutton31.setText(radio3("47", cq1_radiobutton31.getText())
        );

        cq1_radiobutton32.setText(radio4("47", cq1_radiobutton32.getText())
        );

        jButton48.setText("Save and next");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq7Layout = new javax.swing.GroupLayout(cppq7);
        cppq7.setLayout(cppq7Layout);
        cppq7Layout.setHorizontalGroup(
            cppq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane47)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton29)
                    .addComponent(cq1_radiobutton31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton32)
                    .addComponent(cq1_radiobutton30))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton48)
                .addGap(71, 71, 71))
        );
        cppq7Layout.setVerticalGroup(
            cppq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq7Layout.createSequentialGroup()
                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton29)
                    .addComponent(cq1_radiobutton30))
                .addGap(114, 114, 114)
                .addGroup(cppq7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton32)
                    .addComponent(cq1_radiobutton31))
                .addGap(18, 18, 18)
                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq7, "card2");

        cppq8.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea48.setEditable(false);
        jTextArea48.setColumns(20);
        jTextArea48.setRows(5);
        jTextArea48.setText(textarea("48", jTextArea48.getText())
        );
        jScrollPane48.setViewportView(jTextArea48);

        cq1_radiobutton33.setText(radio1("48", cq1_radiobutton33.getText())
        );

        cq1_radiobutton34.setText(radio2("48", cq1_radiobutton34.getText())
        );

        cq1_radiobutton35.setText(radio3("48", cq1_radiobutton35.getText())
        );

        cq1_radiobutton36.setText(radio4("48", cq1_radiobutton36.getText())
        );

        jButton49.setText("Save and next");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq8Layout = new javax.swing.GroupLayout(cppq8);
        cppq8.setLayout(cppq8Layout);
        cppq8Layout.setHorizontalGroup(
            cppq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane48)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq8Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton33)
                    .addComponent(cq1_radiobutton35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton36)
                    .addComponent(cq1_radiobutton34))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton49)
                .addGap(71, 71, 71))
        );
        cppq8Layout.setVerticalGroup(
            cppq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq8Layout.createSequentialGroup()
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton33)
                    .addComponent(cq1_radiobutton34))
                .addGap(114, 114, 114)
                .addGroup(cppq8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton36)
                    .addComponent(cq1_radiobutton35))
                .addGap(18, 18, 18)
                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq8, "card2");

        cppq9.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea49.setEditable(false);
        jTextArea49.setColumns(20);
        jTextArea49.setRows(5);
        jTextArea49.setText(textarea("49", jTextArea49.getText())
        );
        jScrollPane49.setViewportView(jTextArea49);

        cq1_radiobutton37.setText(radio1("49", cq1_radiobutton37.getText())
        );

        cq1_radiobutton38.setText(radio2("49", cq1_radiobutton38.getText())
        );

        cq1_radiobutton39.setText(radio3("49", cq1_radiobutton39.getText())
        );

        cq1_radiobutton40.setText(radio4("49", cq1_radiobutton40.getText())
        );

        jButton50.setText("Save and next");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq9Layout = new javax.swing.GroupLayout(cppq9);
        cppq9.setLayout(cppq9Layout);
        cppq9Layout.setHorizontalGroup(
            cppq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane49)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq9Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton37)
                    .addComponent(cq1_radiobutton39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addGroup(cppq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton40)
                    .addComponent(cq1_radiobutton38))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton50)
                .addGap(71, 71, 71))
        );
        cppq9Layout.setVerticalGroup(
            cppq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq9Layout.createSequentialGroup()
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton37)
                    .addComponent(cq1_radiobutton38))
                .addGap(114, 114, 114)
                .addGroup(cppq9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton40)
                    .addComponent(cq1_radiobutton39))
                .addGap(18, 18, 18)
                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq9, "card2");

        cppq10.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea50.setEditable(false);
        jTextArea50.setColumns(20);
        jTextArea50.setRows(5);
        jTextArea50.setText(textarea("50", jTextArea50.getText())
        );
        jScrollPane50.setViewportView(jTextArea50);

        cq1_radiobutton41.setText(radio1("50", cq1_radiobutton41.getText())
        );

        cq1_radiobutton42.setText(radio2("50", cq1_radiobutton42.getText())
        );

        cq1_radiobutton43.setText(radio3("50", cq1_radiobutton43.getText())
        );

        cq1_radiobutton44.setText(radio4("50", cq1_radiobutton44.getText())
        );

        jButton51.setText("Save and next");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq10Layout = new javax.swing.GroupLayout(cppq10);
        cppq10.setLayout(cppq10Layout);
        cppq10Layout.setHorizontalGroup(
            cppq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane50)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq10Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton41)
                    .addComponent(cq1_radiobutton43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton44)
                    .addComponent(cq1_radiobutton42))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton51)
                .addGap(71, 71, 71))
        );
        cppq10Layout.setVerticalGroup(
            cppq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq10Layout.createSequentialGroup()
                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton41)
                    .addComponent(cq1_radiobutton42))
                .addGap(114, 114, 114)
                .addGroup(cppq10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton44)
                    .addComponent(cq1_radiobutton43))
                .addGap(18, 18, 18)
                .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq10, "card2");

        cppq11.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea51.setEditable(false);
        jTextArea51.setColumns(20);
        jTextArea51.setRows(5);
        jTextArea51.setText(textarea("51", jTextArea51.getText())
        );
        jScrollPane51.setViewportView(jTextArea51);

        cq1_radiobutton45.setText(radio1("51", cq1_radiobutton45.getText())
        );

        cq1_radiobutton46.setText(radio2("51", cq1_radiobutton46.getText())
        );

        cq1_radiobutton47.setText(radio3("51", cq1_radiobutton47.getText())
        );

        cq1_radiobutton48.setText(radio4("51", cq1_radiobutton48.getText())
        );

        jButton52.setText("Save and next");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq11Layout = new javax.swing.GroupLayout(cppq11);
        cppq11.setLayout(cppq11Layout);
        cppq11Layout.setHorizontalGroup(
            cppq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane51)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq11Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton45)
                    .addComponent(cq1_radiobutton47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton48)
                    .addComponent(cq1_radiobutton46))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton52)
                .addGap(71, 71, 71))
        );
        cppq11Layout.setVerticalGroup(
            cppq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq11Layout.createSequentialGroup()
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton45)
                    .addComponent(cq1_radiobutton46))
                .addGap(114, 114, 114)
                .addGroup(cppq11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton48)
                    .addComponent(cq1_radiobutton47))
                .addGap(18, 18, 18)
                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq11, "card2");

        cppq12.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea52.setEditable(false);
        jTextArea52.setColumns(20);
        jTextArea52.setRows(5);
        jTextArea52.setText(textarea("52", jTextArea52.getText())
        );
        jScrollPane52.setViewportView(jTextArea52);

        cq1_radiobutton49.setText(radio1("52", cq1_radiobutton49.getText())
        );

        cq1_radiobutton50.setText(radio2("52", cq1_radiobutton50.getText())
        );

        cq1_radiobutton51.setText(radio3("52", cq1_radiobutton51.getText()));

        cq1_radiobutton52.setText(radio4("52", cq1_radiobutton52.getText())
        );

        jButton53.setText("Save and next");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq12Layout = new javax.swing.GroupLayout(cppq12);
        cppq12.setLayout(cppq12Layout);
        cppq12Layout.setHorizontalGroup(
            cppq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane52)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq12Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton49)
                    .addComponent(cq1_radiobutton51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton52)
                    .addComponent(cq1_radiobutton50))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton53)
                .addGap(71, 71, 71))
        );
        cppq12Layout.setVerticalGroup(
            cppq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq12Layout.createSequentialGroup()
                .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton49)
                    .addComponent(cq1_radiobutton50))
                .addGap(114, 114, 114)
                .addGroup(cppq12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton52)
                    .addComponent(cq1_radiobutton51))
                .addGap(18, 18, 18)
                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq12, "card2");

        cppq13.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea53.setEditable(false);
        jTextArea53.setColumns(20);
        jTextArea53.setRows(5);
        jTextArea53.setText(textarea("53", jTextArea53.getText()));
        jScrollPane53.setViewportView(jTextArea53);

        cq1_radiobutton53.setText(radio1("53", cq1_radiobutton53.getText()));

        cq1_radiobutton54.setText(radio2("53", cq1_radiobutton54.getText()));

        cq1_radiobutton55.setText(radio3("53", cq1_radiobutton55.getText()));

        cq1_radiobutton56.setText(radio4("53", cq1_radiobutton56.getText()));

        jButton54.setText("Save and next");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq13Layout = new javax.swing.GroupLayout(cppq13);
        cppq13.setLayout(cppq13Layout);
        cppq13Layout.setHorizontalGroup(
            cppq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane53)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq13Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton53)
                    .addComponent(cq1_radiobutton55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton56)
                    .addComponent(cq1_radiobutton54))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton54)
                .addGap(71, 71, 71))
        );
        cppq13Layout.setVerticalGroup(
            cppq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq13Layout.createSequentialGroup()
                .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton53)
                    .addComponent(cq1_radiobutton54))
                .addGap(114, 114, 114)
                .addGroup(cppq13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton56)
                    .addComponent(cq1_radiobutton55))
                .addGap(18, 18, 18)
                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq13, "card2");

        cppq14.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea54.setEditable(false);
        jTextArea54.setColumns(20);
        jTextArea54.setRows(5);
        jTextArea54.setText(textarea("54", jTextArea54.getText()));
        jScrollPane54.setViewportView(jTextArea54);

        cq1_radiobutton57.setText(radio1("54", cq1_radiobutton57.getText())
        );

        cq1_radiobutton58.setText(radio2("54", cq1_radiobutton58.getText())
        );

        cq1_radiobutton59.setText(radio3("54", cq1_radiobutton59.getText())
        );

        cq1_radiobutton60.setText(radio4("54", cq1_radiobutton60.getText())
        );

        jButton55.setText("Save and next");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq14Layout = new javax.swing.GroupLayout(cppq14);
        cppq14.setLayout(cppq14Layout);
        cppq14Layout.setHorizontalGroup(
            cppq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane54)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq14Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton57)
                    .addComponent(cq1_radiobutton59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton60)
                    .addComponent(cq1_radiobutton58))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton55)
                .addGap(71, 71, 71))
        );
        cppq14Layout.setVerticalGroup(
            cppq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq14Layout.createSequentialGroup()
                .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton57)
                    .addComponent(cq1_radiobutton58))
                .addGap(114, 114, 114)
                .addGroup(cppq14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton60)
                    .addComponent(cq1_radiobutton59))
                .addGap(18, 18, 18)
                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq14, "card2");

        cppq15.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea55.setEditable(false);
        jTextArea55.setColumns(20);
        jTextArea55.setRows(5);
        jTextArea55.setText(textarea("55", jTextArea55.getText())
        );
        jScrollPane55.setViewportView(jTextArea55);

        cq1_radiobutton61.setText(radio1("55", cq1_radiobutton61.getText())
        );

        cq1_radiobutton62.setText(radio2("55", cq1_radiobutton62.getText())
        );

        cq1_radiobutton63.setText(radio3("55", cq1_radiobutton63.getText())
        );

        cq1_radiobutton64.setText(radio4("55", cq1_radiobutton64.getText())
        );

        jButton56.setText("Save and next");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq15Layout = new javax.swing.GroupLayout(cppq15);
        cppq15.setLayout(cppq15Layout);
        cppq15Layout.setHorizontalGroup(
            cppq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane55)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq15Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton61)
                    .addComponent(cq1_radiobutton63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton64)
                    .addComponent(cq1_radiobutton62))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton56)
                .addGap(71, 71, 71))
        );
        cppq15Layout.setVerticalGroup(
            cppq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq15Layout.createSequentialGroup()
                .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton61)
                    .addComponent(cq1_radiobutton62))
                .addGap(114, 114, 114)
                .addGroup(cppq15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton64)
                    .addComponent(cq1_radiobutton63))
                .addGap(18, 18, 18)
                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq15, "card2");

        cppq16.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea56.setEditable(false);
        jTextArea56.setColumns(20);
        jTextArea56.setRows(5);
        jTextArea56.setText(textarea("56", jTextArea56.getText())
        );
        jScrollPane56.setViewportView(jTextArea56);

        cq1_radiobutton65.setText(radio1("56", cq1_radiobutton65.getText())
        );

        cq1_radiobutton66.setText(radio2("56", cq1_radiobutton66.getText())
        );

        cq1_radiobutton67.setText(radio3("56", cq1_radiobutton67.getText())
        );

        cq1_radiobutton68.setText(radio4("56", cq1_radiobutton68.getText())
        );

        jButton57.setText("Save and next");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq16Layout = new javax.swing.GroupLayout(cppq16);
        cppq16.setLayout(cppq16Layout);
        cppq16Layout.setHorizontalGroup(
            cppq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane56)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq16Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton65)
                    .addComponent(cq1_radiobutton67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton68)
                    .addComponent(cq1_radiobutton66))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton57)
                .addGap(71, 71, 71))
        );
        cppq16Layout.setVerticalGroup(
            cppq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq16Layout.createSequentialGroup()
                .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton65)
                    .addComponent(cq1_radiobutton66))
                .addGap(114, 114, 114)
                .addGroup(cppq16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton68)
                    .addComponent(cq1_radiobutton67))
                .addGap(18, 18, 18)
                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq16, "card2");

        cppq17.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea57.setEditable(false);
        jTextArea57.setColumns(20);
        jTextArea57.setRows(5);
        jTextArea57.setText(textarea("57", jTextArea57.getText())
        );
        jScrollPane57.setViewportView(jTextArea57);

        cq1_radiobutton69.setText(radio1("57", cq1_radiobutton69.getText())
        );

        cq1_radiobutton70.setText(radio2("57", cq1_radiobutton70.getText())
        );

        cq1_radiobutton71.setText(radio3("57", cq1_radiobutton71.getText())
        );

        cq1_radiobutton72.setText(radio4("57", cq1_radiobutton72.getText())
        );

        jButton58.setText("Save and next");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq17Layout = new javax.swing.GroupLayout(cppq17);
        cppq17.setLayout(cppq17Layout);
        cppq17Layout.setHorizontalGroup(
            cppq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane57)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq17Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton69)
                    .addComponent(cq1_radiobutton71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton72)
                    .addComponent(cq1_radiobutton70))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton58)
                .addGap(71, 71, 71))
        );
        cppq17Layout.setVerticalGroup(
            cppq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq17Layout.createSequentialGroup()
                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton69)
                    .addComponent(cq1_radiobutton70))
                .addGap(114, 114, 114)
                .addGroup(cppq17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton72)
                    .addComponent(cq1_radiobutton71))
                .addGap(18, 18, 18)
                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq17, "card2");

        cppq18.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea58.setEditable(false);
        jTextArea58.setColumns(20);
        jTextArea58.setRows(5);
        jTextArea58.setText(textarea("58", jTextArea58.getText())
        );
        jScrollPane58.setViewportView(jTextArea58);

        cq1_radiobutton73.setText(radio1("58", cq1_radiobutton73.getText())
        );

        cq1_radiobutton74.setText(radio2("58", cq1_radiobutton74.getText())
        );

        cq1_radiobutton75.setText(radio3("58", cq1_radiobutton75.getText())
        );

        cq1_radiobutton76.setText(radio4("58", cq1_radiobutton76.getText())
        );

        jButton59.setText("Save and next");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq18Layout = new javax.swing.GroupLayout(cppq18);
        cppq18.setLayout(cppq18Layout);
        cppq18Layout.setHorizontalGroup(
            cppq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane58)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq18Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton73)
                    .addComponent(cq1_radiobutton75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton76)
                    .addComponent(cq1_radiobutton74))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton59)
                .addGap(71, 71, 71))
        );
        cppq18Layout.setVerticalGroup(
            cppq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq18Layout.createSequentialGroup()
                .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton73)
                    .addComponent(cq1_radiobutton74))
                .addGap(114, 114, 114)
                .addGroup(cppq18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton76)
                    .addComponent(cq1_radiobutton75))
                .addGap(18, 18, 18)
                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq18, "card2");

        cppq19.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea59.setEditable(false);
        jTextArea59.setColumns(20);
        jTextArea59.setRows(5);
        jTextArea59.setText(textarea("59", jTextArea59.getText())
        );
        jScrollPane59.setViewportView(jTextArea59);

        cq1_radiobutton77.setText(radio1("59", cq1_radiobutton77.getText())
        );

        cq1_radiobutton78.setText(radio2("59", cq1_radiobutton78.getText())
        );

        cq1_radiobutton79.setText(radio3("59", cq1_radiobutton79.getText())
        );

        cq1_radiobutton80.setText(radio4("59", cq1_radiobutton80.getText())
        );

        jButton60.setText("Save and next");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq19Layout = new javax.swing.GroupLayout(cppq19);
        cppq19.setLayout(cppq19Layout);
        cppq19Layout.setHorizontalGroup(
            cppq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane59)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq19Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton77)
                    .addComponent(cq1_radiobutton79))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton80)
                    .addComponent(cq1_radiobutton78))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton60)
                .addGap(71, 71, 71))
        );
        cppq19Layout.setVerticalGroup(
            cppq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq19Layout.createSequentialGroup()
                .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton77)
                    .addComponent(cq1_radiobutton78))
                .addGap(114, 114, 114)
                .addGroup(cppq19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton80)
                    .addComponent(cq1_radiobutton79))
                .addGap(18, 18, 18)
                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq19, "card2");

        cppq20.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea60.setEditable(false);
        jTextArea60.setColumns(20);
        jTextArea60.setRows(5);
        jTextArea60.setText(textarea("60", jTextArea60.getText())
        );
        jScrollPane60.setViewportView(jTextArea60);

        cq1_radiobutton81.setText(radio1("60", cq1_radiobutton81.getText())
        );

        cq1_radiobutton82.setText(radio2("60", cq1_radiobutton82.getText())
        );

        cq1_radiobutton83.setText(radio3("60", cq1_radiobutton83.getText())
        );

        cq1_radiobutton84.setText(radio4("60", cq1_radiobutton84.getText())
        );

        jButton61.setText("Save and next");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cppq20Layout = new javax.swing.GroupLayout(cppq20);
        cppq20.setLayout(cppq20Layout);
        cppq20Layout.setHorizontalGroup(
            cppq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane60)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq20Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(cppq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton81)
                    .addComponent(cq1_radiobutton83))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addGroup(cppq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cq1_radiobutton84)
                    .addComponent(cq1_radiobutton82))
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cppq20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton61)
                .addGap(71, 71, 71))
        );
        cppq20Layout.setVerticalGroup(
            cppq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cppq20Layout.createSequentialGroup()
                .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(cppq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton81)
                    .addComponent(cq1_radiobutton82))
                .addGap(114, 114, 114)
                .addGroup(cppq20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq1_radiobutton84)
                    .addComponent(cq1_radiobutton83))
                .addGap(18, 18, 18)
                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        question_panel.add(cppq20, "card2");

        getContentPane().add(question_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        question_tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cq_t1.setText("1");
        cq_t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t1ActionPerformed(evt);
            }
        });

        cq_t2.setText("2");
        cq_t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t2ActionPerformed(evt);
            }
        });

        cq_t3.setText("4");
        cq_t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t3ActionPerformed(evt);
            }
        });

        cq_t4.setText("3");
        cq_t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t4ActionPerformed(evt);
            }
        });

        cq_t5.setText("5");
        cq_t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t5ActionPerformed(evt);
            }
        });

        cq_t6.setText("6");
        cq_t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t6ActionPerformed(evt);
            }
        });

        cq_t7.setText("7");
        cq_t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t7ActionPerformed(evt);
            }
        });

        cq_t8.setText("8");
        cq_t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t8ActionPerformed(evt);
            }
        });

        cq_t9.setText("9");
        cq_t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t9ActionPerformed(evt);
            }
        });

        cq_t10.setText("10");
        cq_t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t10ActionPerformed(evt);
            }
        });

        cq_t11.setText("11");
        cq_t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t11ActionPerformed(evt);
            }
        });

        cq_t12.setText("12");
        cq_t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t12ActionPerformed(evt);
            }
        });

        cq_t13.setText("13");
        cq_t13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cq_t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t13ActionPerformed(evt);
            }
        });

        cq_t14.setText("14");
        cq_t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t14ActionPerformed(evt);
            }
        });

        cq_t15.setText("15");
        cq_t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t15ActionPerformed(evt);
            }
        });

        cq_t16.setText("16");
        cq_t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t16ActionPerformed(evt);
            }
        });

        cq_t17.setText("17");
        cq_t17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t17ActionPerformed(evt);
            }
        });

        cq_t18.setText("18");
        cq_t18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t18ActionPerformed(evt);
            }
        });

        cq_t19.setText("19");
        cq_t19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t19ActionPerformed(evt);
            }
        });

        cq_t20.setText("20");
        cq_t20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout qt_CLayout = new javax.swing.GroupLayout(qt_C);
        qt_C.setLayout(qt_CLayout);
        qt_CLayout.setHorizontalGroup(
            qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qt_CLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qt_CLayout.createSequentialGroup()
                        .addComponent(cq_t5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cq_t6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(qt_CLayout.createSequentialGroup()
                        .addComponent(cq_t1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cq_t2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(qt_CLayout.createSequentialGroup()
                        .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cq_t9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cq_t13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cq_t17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(qt_CLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cq_t18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(qt_CLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cq_t10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(qt_CLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cq_t14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(qt_CLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(cq_t20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(qt_CLayout.createSequentialGroup()
                                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(qt_CLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(cq_t11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(qt_CLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cq_t19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cq_t15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cq_t16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cq_t12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        qt_CLayout.setVerticalGroup(
            qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qt_CLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        question_tab.addTab("C", qt_C);

        cpp_t1.setText("1");
        cpp_t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t1ActionPerformed(evt);
            }
        });

        cpp_t3.setText("3");
        cpp_t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t3ActionPerformed(evt);
            }
        });

        cpp_t2.setText("2");
        cpp_t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t2ActionPerformed(evt);
            }
        });

        cpp_t4.setText("4");
        cpp_t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t4ActionPerformed(evt);
            }
        });

        cpp_t5.setText("5");
        cpp_t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t5ActionPerformed(evt);
            }
        });

        cpp_t6.setText("6");
        cpp_t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t6ActionPerformed(evt);
            }
        });

        cpp_t7.setText("7");
        cpp_t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t7ActionPerformed(evt);
            }
        });

        cpp_t8.setText("8");
        cpp_t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t8ActionPerformed(evt);
            }
        });

        cpp_t9.setText("9");
        cpp_t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t9ActionPerformed(evt);
            }
        });

        cpp_t10.setText("10");
        cpp_t10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t10ActionPerformed(evt);
            }
        });

        cpp_t11.setText("11");
        cpp_t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t11ActionPerformed(evt);
            }
        });

        cpp_t12.setText("12");
        cpp_t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t12ActionPerformed(evt);
            }
        });

        cpp_t13.setText("13");
        cpp_t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t13ActionPerformed(evt);
            }
        });

        cpp_t14.setText("14");
        cpp_t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t14ActionPerformed(evt);
            }
        });

        cpp_t15.setText("15");
        cpp_t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t15ActionPerformed(evt);
            }
        });

        cpp_t16.setText("16");
        cpp_t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t16ActionPerformed(evt);
            }
        });

        cpp_t17.setText("17");
        cpp_t17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t17ActionPerformed(evt);
            }
        });

        cpp_t18.setText("18");
        cpp_t18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t18ActionPerformed(evt);
            }
        });

        cpp_t19.setText("19");
        cpp_t19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t19ActionPerformed(evt);
            }
        });

        cpp_t20.setText("20");
        cpp_t20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpp_t20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout qt_cppLayout = new javax.swing.GroupLayout(qt_cpp);
        qt_cpp.setLayout(qt_cppLayout);
        qt_cppLayout.setHorizontalGroup(
            qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qt_cppLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qt_cppLayout.createSequentialGroup()
                        .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(qt_cppLayout.createSequentialGroup()
                                .addComponent(cpp_t13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpp_t14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpp_t15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(qt_cppLayout.createSequentialGroup()
                                .addComponent(cpp_t17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpp_t18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpp_t19, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(qt_cppLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cpp_t16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(qt_cppLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpp_t20, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(qt_cppLayout.createSequentialGroup()
                        .addComponent(cpp_t9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cpp_t10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpp_t11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpp_t12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(qt_cppLayout.createSequentialGroup()
                        .addComponent(cpp_t1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cpp_t2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpp_t3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpp_t4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(qt_cppLayout.createSequentialGroup()
                        .addComponent(cpp_t5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cpp_t6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpp_t7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpp_t8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        qt_cppLayout.setVerticalGroup(
            qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qt_cppLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpp_t1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpp_t5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpp_t9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpp_t13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_cppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpp_t17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp_t20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        question_tab.addTab("C++", qt_cpp);

        cq_t21.setText("1");
        cq_t21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t21ActionPerformed(evt);
            }
        });

        cq_t22.setText("2");
        cq_t22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t22ActionPerformed(evt);
            }
        });

        cq_t23.setText("4");
        cq_t23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t23ActionPerformed(evt);
            }
        });

        cq_t24.setText("3");
        cq_t24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t24ActionPerformed(evt);
            }
        });

        cq_t25.setText("5");
        cq_t25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t25ActionPerformed(evt);
            }
        });

        cq_t26.setText("6");
        cq_t26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t26ActionPerformed(evt);
            }
        });

        cq_t27.setText("7");
        cq_t27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t27ActionPerformed(evt);
            }
        });

        cq_t28.setText("8");
        cq_t28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t28ActionPerformed(evt);
            }
        });

        cq_t29.setText("9");
        cq_t29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t29ActionPerformed(evt);
            }
        });

        cq_t30.setText("10");
        cq_t30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t30ActionPerformed(evt);
            }
        });

        cq_t31.setText("11");
        cq_t31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t31ActionPerformed(evt);
            }
        });

        cq_t32.setText("12");
        cq_t32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t32ActionPerformed(evt);
            }
        });

        cq_t33.setText("13");
        cq_t33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t33ActionPerformed(evt);
            }
        });

        cq_t34.setText("14");
        cq_t34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t34ActionPerformed(evt);
            }
        });

        cq_t35.setText("15");
        cq_t35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t35ActionPerformed(evt);
            }
        });

        cq_t36.setText("16");
        cq_t36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t36ActionPerformed(evt);
            }
        });

        cq_t37.setText("17");
        cq_t37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t37ActionPerformed(evt);
            }
        });

        cq_t38.setText("18");
        cq_t38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t38ActionPerformed(evt);
            }
        });

        cq_t39.setText("19");
        cq_t39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t39ActionPerformed(evt);
            }
        });

        cq_t40.setText("20");
        cq_t40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cq_t40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout qt_javaLayout = new javax.swing.GroupLayout(qt_java);
        qt_java.setLayout(qt_javaLayout);
        qt_javaLayout.setHorizontalGroup(
            qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qt_javaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(qt_javaLayout.createSequentialGroup()
                        .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(qt_javaLayout.createSequentialGroup()
                                .addComponent(cq_t33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cq_t34, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cq_t35, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(qt_javaLayout.createSequentialGroup()
                                .addComponent(cq_t29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(cq_t30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cq_t31, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cq_t32, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cq_t36, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(qt_javaLayout.createSequentialGroup()
                        .addComponent(cq_t37, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cq_t38, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t39, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t40, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(qt_javaLayout.createSequentialGroup()
                        .addComponent(cq_t25, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cq_t26, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t27, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t28, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(qt_javaLayout.createSequentialGroup()
                        .addComponent(cq_t21, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cq_t22, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cq_t23, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        qt_javaLayout.setVerticalGroup(
            qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qt_javaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t22)
                    .addComponent(cq_t24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(qt_javaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cq_t37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cq_t40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        question_tab.addTab("JAVA", qt_java);

        getContentPane().add(question_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 220, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 204, 204));
        jTextField1.setText("name");
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 255, 255));
        jTextField1.setSelectionColor(new java.awt.Color(0, 204, 204));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 204, 204));
        jTextField2.setText("uname");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public String textarea(String i,String s){
        s="not changed";
       
        try{
         ps=con.prepareStatement("SELECT * FROM `questions_c` WHERE `qid` = ?");
         ps.setString(1, i);
         re=ps.executeQuery();
         while(re.next()){
         s=re.getString("questions");
         }
        }
        catch(Exception e){
             System.out.println("exception:-"+e.getMessage());
        }
        return s;
    }
        
        public String radio1(String i,String s){
             s="not changed";
        try{
         ps=con.prepareStatement("SELECT * FROM `questions_c` WHERE `qid` = ?");
         ps.setString(1, i);
         re=ps.executeQuery();
         while(re.next()){
         s=re.getString("ans_1");
         }
        }
        catch(Exception e){
             System.out.println("exception:-"+e.getMessage());
        }
        return s;
        }
        
        
       public String radio2(String i,String s){
             s="not changed";
        try{
         ps=con.prepareStatement("SELECT * FROM `questions_c` WHERE `qid` = ?");
         ps.setString(1, i);
         re=ps.executeQuery();
         while(re.next()){
         s=re.getString("ans_2");
         }
        }
        catch(Exception e){
             System.out.println("exception:-"+e.getMessage());
        }
        return s;
        }
        
        
        public String radio3(String i,String s){
             s="not changed";
        try{
         ps=con.prepareStatement("SELECT * FROM `questions_c` WHERE `qid` = ?");
         ps.setString(1, i);
         re=ps.executeQuery();
         while(re.next()){
         s=re.getString("ans_3");
         }
        }
        catch(Exception e){
             System.out.println("exception:-"+e.getMessage());
        }
        return s;
        }
        
        
       public String radio4(String i,String s){
             s="not changed";
        try{
         ps=con.prepareStatement("SELECT * FROM `questions_c` WHERE `qid` = ?");
         ps.setString(1, i);
         re=ps.executeQuery();
         while(re.next()){
         s=re.getString("ans_4");
         }
        }
        catch(Exception e){
             System.out.println("exception:-"+e.getMessage());
        }
        return s;
        }
       
    private void cq_t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t1ActionPerformed
       question_panel.removeAll();
       question_panel.add(cq1);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t1ActionPerformed

    private void cq_t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t2ActionPerformed
       question_panel.removeAll();       
       question_panel.repaint();
       question_panel.revalidate();
       question_panel.add(cq2);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void cq_t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t4ActionPerformed
       question_panel.removeAll();
       question_panel.add(cq3);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t4ActionPerformed

    private void cq_t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t8ActionPerformed
        question_panel.removeAll();
       question_panel.add(cq8);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t8ActionPerformed

    private void cq_t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t3ActionPerformed
       question_panel.removeAll();
       question_panel.add(cq4);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t3ActionPerformed

    private void cq_t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t5ActionPerformed
question_panel.removeAll();
       question_panel.add(cq5);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t5ActionPerformed

    private void cq_t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t6ActionPerformed
question_panel.removeAll();
       question_panel.add(cq6);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t6ActionPerformed

    private void cq_t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t7ActionPerformed
question_panel.removeAll();
       question_panel.add(cq7);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t7ActionPerformed

    private void cq_t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t9ActionPerformed
       question_panel.removeAll();
       question_panel.add(cq9);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t9ActionPerformed

    private void cq_t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t10ActionPerformed
       question_panel.removeAll();
       question_panel.add(cq10);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t10ActionPerformed
    
    
        
    private void jRadioButton127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton127ActionPerformed
        
    }//GEN-LAST:event_jRadioButton127ActionPerformed

    private void jRadioButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton141ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton141ActionPerformed

    private void cq_t21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t21ActionPerformed
        question_panel.removeAll();
       question_panel.add(jq1);
       question_panel.repaint();
       question_panel.revalidate();
    }//GEN-LAST:event_cq_t21ActionPerformed

    private void cq_t22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t22ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq2);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t22ActionPerformed

    private void cq_t23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t23ActionPerformed
         question_panel.removeAll();
       question_panel.add(jq3);
       question_panel.repaint();
       question_panel.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_cq_t23ActionPerformed

    private void cq_t24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t24ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq4);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t24ActionPerformed

    private void cq_t25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t25ActionPerformed
        question_panel.removeAll();
       question_panel.add(jq5);
       question_panel.repaint();
       question_panel.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_cq_t25ActionPerformed

    private void cq_t26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t26ActionPerformed
        question_panel.removeAll();
       question_panel.add(jq6);
       question_panel.repaint();
       question_panel.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_cq_t26ActionPerformed

    private void cq_t27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t27ActionPerformed
        question_panel.removeAll();
       question_panel.add(jq7);
       question_panel.repaint();
       question_panel.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_cq_t27ActionPerformed

    private void cq_t28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t28ActionPerformed
         question_panel.removeAll();
       question_panel.add(jq8);
       question_panel.repaint();
       question_panel.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_cq_t28ActionPerformed

    private void cq_t29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t29ActionPerformed
        question_panel.removeAll();
       question_panel.add(jq9);
       question_panel.repaint();
       question_panel.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_cq_t29ActionPerformed

    private void cq_t30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t30ActionPerformed
        question_panel.removeAll();
       question_panel.add(jq10);
       question_panel.repaint();
       question_panel.revalidate(); // TODO add your handling code here:
    }//GEN-LAST:event_cq_t30ActionPerformed

    private void cq_t31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t31ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq11);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t31ActionPerformed

    private void cq_t32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t32ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq12);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t32ActionPerformed

    private void cq_t33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t33ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq13);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t33ActionPerformed

    private void cq_t34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t34ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq14);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t34ActionPerformed

    private void cq_t35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t35ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq15);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t35ActionPerformed

    private void cq_t36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t36ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq16);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t36ActionPerformed

    private void cq_t37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t37ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq17);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t37ActionPerformed

    private void cq_t38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t38ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq18);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t38ActionPerformed

    private void cq_t39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t39ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq19);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t39ActionPerformed

    private void cq_t40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t40ActionPerformed
 question_panel.removeAll();
       question_panel.add(jq20);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t40ActionPerformed

    private void cpp_t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t1ActionPerformed
      question_panel.removeAll();
       question_panel.add(cppq1);
       question_panel.repaint();
       question_panel.revalidate(); 
    }//GEN-LAST:event_cpp_t1ActionPerformed

    private void cq1_radiobutton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq1_radiobutton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cq1_radiobutton24ActionPerformed
int final_marks=0;
public int c_marks=0;
public int cpp_marks=0;
public int java_marks=0;
int wrong_ans=0,right_ans=0,not_ans=-1;
String show=null;
String show2=null;
String showc=null,showcpp=null,showjava=null;
int somethingwrong=0;
String show3=null;

    private void submit_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_finalActionPerformed
        for (int i = 0; i < response.length; i++) {
           if(i>=0&&i<=20){
               if(response[i]==1)
               {right_ans+=response[i]; 
               c_marks+=4;}
           else if(response[i]==-1)
           {wrong_ans+=response[i];
            c_marks-=1;
           }
           else
               not_ans+=1;  //count of not answered questions
        }
           
           else if(i>=21&&i<=40){
                if(response[i]==1)
                {right_ans+=response[i];
                cpp_marks+=4;}
           else if(response[i]==-1)
           { wrong_ans+=response[i];
           cpp_marks+=-1;}
           else
               not_ans+=1;
           }
           
           else if(i>=41&&i<=60){
                if(response[i]==1)
                {right_ans+=response[i]; 
                java_marks+=4;}
           else if(response[i]==-1)
           {wrong_ans+=response[i];
           java_marks+=-1;}
           else
               not_ans+=1;
           }
           
           else{
               somethingwrong+=1;
               System.out.println(somethingwrong);
           }
        }
        final_marks=(right_ans*4)+wrong_ans;
        show=String.valueOf(final_marks);
        show2=String.valueOf(60-not_ans);
        showc=String.valueOf(c_marks);
        showcpp=String.valueOf(cpp_marks);
        showjava=String.valueOf(java_marks);
        Result t=new Result();
         
        t.jLabel3.setText(show);
        t.numberofanswered.setText(show2);
        t.cm.setText(showc);
        t.cppm.setText(showcpp);
        t.javam.setText(showjava);
        System.out.println("not answered=  "+not_ans+"\nsomething wrong=  "+somethingwrong+
        "\nc=  "+c_marks+"\ncpp=  "+cpp_marks+
                        "\njava=  "+java_marks);
        
        Connection con=Myconnection.getConnection();
        PreparedStatement ps;
        ResultSet re;
        try {
                 ps=con.prepareStatement("SELECT * FROM `students1` WHERE `uname` = ?");
                  ps.setString(1, jTextField2.getText());
                   re=ps.executeQuery();
                  if(re.next()){ 
                      byte[] imagebytes;
                      imagebytes = re.getBytes("photo");
           
                         Image image=getToolkit().createImage(imagebytes);
                         Image img = image.getScaledInstance(120,120,Image.SCALE_SMOOTH);
                         ImageIcon icon=new ImageIcon(img);
                              t.setVisible(true);
        t.pack();
        t.setLocationRelativeTo(null);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        t.jLabel7.setText(re.getString("first_name"));
        t.jLabel6.setText(re.getString("uid"));
        t.jLabel8.setIcon(icon);
       
        
        }
        else{
                JOptionPane.showMessageDialog(null,"something wrong");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        try {
             PreparedStatement ps1=con.prepareStatement("UPDATE students1 SET marks=? WHERE uname=?");
            ps1.setString(1, show);
            ps1.setString(2, jTextField2.getText());
            ps1.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.dispose();
    }//GEN-LAST:event_submit_finalActionPerformed

    static int response[]=new int[61];
    static String correct;
    static int temp;
    static void changecolor(JButton tabbutton,JRadioButton r1,JRadioButton r2,JRadioButton r3,JRadioButton r4){
        if(r1.isSelected()){
            tabbutton.setBackground(Color.GREEN);
        }
        else if(r2.isSelected()){
            tabbutton.setBackground(Color.GREEN);
        }
        else if(r3.isSelected()){
            tabbutton.setBackground(Color.GREEN);
        }
        else if(r4.isSelected()){
            tabbutton.setBackground(Color.GREEN);
        }
        else{
            tabbutton.setBackground(Color.RED);
        }
    }
    static void savebutton_c(String qid,JRadioButton r1,JRadioButton r2,JRadioButton r3,JRadioButton r4){

      
        Connection conn=Myconnection.getConnection();
        PreparedStatement pss=null;  
         ResultSet resu;
         
        try{ 
            pss=conn.prepareStatement("SELECT * FROM `questions_c` WHERE `qid` = ?");
            pss.setString(1, qid);
             resu=pss.executeQuery();
             while(resu.next()){
                 correct=resu.getString("correct_ans");
             }
             temp=Integer.parseInt(qid);
        if(r1.isSelected()){
            if(r1.getText().equals(correct)){
            response[temp]=1;
        }
            else{
                response[temp]=-1;
            }
        }
        else if(r2.isSelected()){
             if(r2.getText().equals(correct)){
            response[temp]=1;
        }
            else{
                response[temp]=-1;
            }
        }
        else if(r3.isSelected()){
             if(r3.getText().equals(correct)){
            response[temp]=1;
        }
            else{
                response[temp]=-1;
            }
        }
        else if(r4.isSelected()){
            if(r4.getText().equals(correct)){
            response[temp]=1;
        }
            else{
                response[temp]=-1;
            }
        }
        else{
            response[temp]=0;
        }
        }
        catch(Exception e){
            System.out.println("Exception:"+e);
        }
    }
    private void SAVE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE1ActionPerformed
        changecolor(cq_t1, cq1_radiobutton1, cq1_radiobutton2, cq1_radiobutton3, cq1_radiobutton4);
        savebutton_c("1", cq1_radiobutton1, cq1_radiobutton2, cq1_radiobutton3, cq1_radiobutton4);
       question_panel.removeAll();
       question_panel.add(cq2);
       question_panel.repaint();
       question_panel.revalidate();        
    }//GEN-LAST:event_SAVE1ActionPerformed

    private void SAVE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVE2ActionPerformed
        changecolor(cq_t2, jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4);
        savebutton_c("2", jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4);
       question_panel.removeAll();
       question_panel.add(cq3);
       question_panel.repaint();
       question_panel.revalidate();   
    }//GEN-LAST:event_SAVE2ActionPerformed

    private void cpp_t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t13ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq13);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t13ActionPerformed

    private void cpp_t17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t17ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq17);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t17ActionPerformed

    private void cpp_t18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t18ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq18);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t18ActionPerformed

    private void cpp_t19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t19ActionPerformed
      
question_panel.removeAll();
question_panel.add(cppq19);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t19ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         changecolor(cq_t3, jRadioButton5, jRadioButton6, jRadioButton7, jRadioButton8);
        savebutton_c("3", jRadioButton5, jRadioButton6, jRadioButton7, jRadioButton8);
       question_panel.removeAll();
       question_panel.add(cq4);
       question_panel.repaint();
       question_panel.revalidate(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
changecolor(cq_t4, jRadioButton9, jRadioButton10, jRadioButton11, jRadioButton12);
savebutton_c("4", jRadioButton9, jRadioButton10, jRadioButton11, jRadioButton12);
question_panel.removeAll();
question_panel.add(cq5);
question_panel.repaint();
question_panel.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
changecolor(cq_t5, jRadioButton13, jRadioButton14, jRadioButton15, jRadioButton16);
savebutton_c("5", jRadioButton13, jRadioButton14, jRadioButton15, jRadioButton16);
question_panel.removeAll();
question_panel.add(cq6);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
changecolor(cq_t6, jRadioButton17, jRadioButton18, jRadioButton19, jRadioButton20);
savebutton_c("6", jRadioButton17, jRadioButton18, jRadioButton19, jRadioButton20);
question_panel.removeAll();
question_panel.add(cq7);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
changecolor(cq_t7, jRadioButton21, jRadioButton22, jRadioButton23, jRadioButton24);
savebutton_c("7", jRadioButton21, jRadioButton22, jRadioButton23, jRadioButton24);
question_panel.removeAll();
question_panel.add(cq8);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
changecolor(cq_t8, jRadioButton25, jRadioButton26, jRadioButton27, jRadioButton28);
savebutton_c("8", jRadioButton25, jRadioButton26, jRadioButton27, jRadioButton28);
question_panel.removeAll();
question_panel.add(cq9);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       
changecolor(cq_t9, jRadioButton29, jRadioButton30, jRadioButton31, jRadioButton32);
savebutton_c("9", jRadioButton29, jRadioButton30, jRadioButton31, jRadioButton32);
question_panel.removeAll();
question_panel.add(cq10);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      changecolor(cq_t10, jRadioButton33, jRadioButton34, jRadioButton35, jRadioButton36);
savebutton_c("10", jRadioButton33, jRadioButton34, jRadioButton35, jRadioButton36);
question_panel.removeAll();
question_panel.add(cq11);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      
changecolor(cq_t11, jRadioButton37, jRadioButton38, jRadioButton39, jRadioButton40);
savebutton_c("11", jRadioButton37, jRadioButton38, jRadioButton39, jRadioButton40);
question_panel.removeAll();
question_panel.add(cq12);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       
changecolor(cq_t12, jRadioButton41, jRadioButton42, jRadioButton43, jRadioButton44);
savebutton_c("12", jRadioButton41, jRadioButton42, jRadioButton43, jRadioButton44);
question_panel.removeAll();
question_panel.add(cq13);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
changecolor(cq_t13, jRadioButton45, jRadioButton46, jRadioButton47, jRadioButton48);
savebutton_c("13", jRadioButton45, jRadioButton46, jRadioButton47, jRadioButton48);
question_panel.removeAll();
question_panel.add(cq14);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       
changecolor(cq_t14, jRadioButton49, jRadioButton50, jRadioButton51, jRadioButton52);
savebutton_c("14", jRadioButton49, jRadioButton50, jRadioButton51, jRadioButton52);
question_panel.removeAll();
question_panel.add(cq15);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       
changecolor(cq_t15, jRadioButton53, jRadioButton54, jRadioButton55, jRadioButton56);
savebutton_c("15", jRadioButton53, jRadioButton54, jRadioButton55, jRadioButton56);
question_panel.removeAll();
question_panel.add(cq16);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
changecolor(cq_t16, jRadioButton57, jRadioButton58, jRadioButton59, jRadioButton60);
savebutton_c("16", jRadioButton57, jRadioButton58, jRadioButton59, jRadioButton60);
question_panel.removeAll();
question_panel.add(cq17);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       

changecolor(cq_t17, jRadioButton61, jRadioButton62, jRadioButton63, jRadioButton64);
savebutton_c("17", jRadioButton61, jRadioButton62, jRadioButton63, jRadioButton64);
question_panel.removeAll();
question_panel.add(cq18);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
changecolor(cq_t18, jRadioButton65, jRadioButton66, jRadioButton67, jRadioButton68);
savebutton_c("18", jRadioButton65, jRadioButton66, jRadioButton67, jRadioButton68);
question_panel.removeAll();
question_panel.add(cq19);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
changecolor(cq_t19, jRadioButton69, jRadioButton70, jRadioButton71, jRadioButton72);
savebutton_c("19", jRadioButton69, jRadioButton70, jRadioButton71, jRadioButton72);
question_panel.removeAll();
question_panel.add(cq20);
question_panel.repaint();
question_panel.revalidate();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
       
changecolor(cq_t20, jRadioButton73, jRadioButton74, jRadioButton75, jRadioButton76);
savebutton_c("20", jRadioButton73, jRadioButton74, jRadioButton75, jRadioButton76);
question_panel.removeAll();
question_panel.add(cppq1);
question_panel.repaint();
question_panel.revalidate();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
changecolor(cpp_t1, cq1_radiobutton5, cq1_radiobutton6, cq1_radiobutton7, cq1_radiobutton8);
savebutton_c("41", cq1_radiobutton5, cq1_radiobutton6, cq1_radiobutton7, cq1_radiobutton8);
question_panel.removeAll();
question_panel.add(cppq2);
question_panel.repaint();
question_panel.revalidate();         
    }//GEN-LAST:event_jButton42ActionPerformed

    private void cpp_t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t2ActionPerformed
        
question_panel.removeAll();
question_panel.add(cppq2);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t2ActionPerformed

    private void cpp_t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t3ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq3);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t3ActionPerformed

    private void cpp_t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t4ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq4);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t4ActionPerformed

    private void cpp_t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t5ActionPerformed
     
question_panel.removeAll();
question_panel.add(cppq5);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t5ActionPerformed

    private void cpp_t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t6ActionPerformed
        
question_panel.removeAll();
question_panel.add(cppq6);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t6ActionPerformed

    private void cpp_t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t7ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq7);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t7ActionPerformed

    private void cpp_t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t8ActionPerformed
      
question_panel.removeAll();
question_panel.add(cppq8);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t8ActionPerformed

    private void cpp_t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t9ActionPerformed
      
question_panel.removeAll();
question_panel.add(cppq9);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t9ActionPerformed

    private void cpp_t10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t10ActionPerformed
    
question_panel.removeAll();
question_panel.add(cppq10);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t10ActionPerformed

    private void cpp_t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t11ActionPerformed
      
question_panel.removeAll();
question_panel.add(cppq11);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t11ActionPerformed

    private void cpp_t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t12ActionPerformed
     
question_panel.removeAll();
question_panel.add(cppq12);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t12ActionPerformed

    private void cpp_t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t14ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq14);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t14ActionPerformed

    private void cpp_t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t15ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq15);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t15ActionPerformed

    private void cpp_t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t16ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq16);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_cpp_t16ActionPerformed

    private void cpp_t20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpp_t20ActionPerformed
       
question_panel.removeAll();
question_panel.add(cppq20);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_cpp_t20ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        
changecolor(cpp_t2, cq1_radiobutton9, cq1_radiobutton10, cq1_radiobutton11, cq1_radiobutton12);
savebutton_c("42", cq1_radiobutton9, cq1_radiobutton10, cq1_radiobutton11, cq1_radiobutton12);
question_panel.removeAll();
question_panel.add(cppq3);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
      
changecolor(cpp_t3, cq1_radiobutton13, cq1_radiobutton14, cq1_radiobutton15, cq1_radiobutton16);
savebutton_c("43", cq1_radiobutton13, cq1_radiobutton14, cq1_radiobutton15, cq1_radiobutton16);
question_panel.removeAll();
question_panel.add(cppq4);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        changecolor(cpp_t4, cq1_radiobutton17, cq1_radiobutton18, cq1_radiobutton19, cq1_radiobutton20);
savebutton_c("44", cq1_radiobutton17, cq1_radiobutton18, cq1_radiobutton19, cq1_radiobutton20);
question_panel.removeAll();
question_panel.add(cppq5);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
       
changecolor(cpp_t5, cq1_radiobutton21, cq1_radiobutton22, cq1_radiobutton23, cq1_radiobutton24);
savebutton_c("45", cq1_radiobutton21, cq1_radiobutton22, cq1_radiobutton23, cq1_radiobutton24);
question_panel.removeAll();
question_panel.add(cppq6);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
       
changecolor(cpp_t6, cq1_radiobutton25, cq1_radiobutton26, cq1_radiobutton27, cq1_radiobutton28);
savebutton_c("46", cq1_radiobutton25, cq1_radiobutton26, cq1_radiobutton27, cq1_radiobutton28);
question_panel.removeAll();
question_panel.add(cppq7);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        changecolor(cpp_t7, cq1_radiobutton29, cq1_radiobutton30, cq1_radiobutton31, cq1_radiobutton32);
savebutton_c("47", cq1_radiobutton29, cq1_radiobutton30, cq1_radiobutton31, cq1_radiobutton32);
question_panel.removeAll();
question_panel.add(cppq8);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
       changecolor(cpp_t8, cq1_radiobutton33, cq1_radiobutton34, cq1_radiobutton35, cq1_radiobutton36);
savebutton_c("48", cq1_radiobutton33, cq1_radiobutton34, cq1_radiobutton35, cq1_radiobutton36);
question_panel.removeAll();
question_panel.add(cppq9);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        
changecolor(cpp_t9, cq1_radiobutton37, cq1_radiobutton38, cq1_radiobutton39, cq1_radiobutton40);
savebutton_c("49", cq1_radiobutton37, cq1_radiobutton38, cq1_radiobutton39, cq1_radiobutton40);
question_panel.removeAll();
question_panel.add(cppq10);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
       
changecolor(cpp_t10, cq1_radiobutton41, cq1_radiobutton42, cq1_radiobutton43, cq1_radiobutton44);
savebutton_c("50", cq1_radiobutton41, cq1_radiobutton42, cq1_radiobutton43, cq1_radiobutton44);
question_panel.removeAll();
question_panel.add(cppq11);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
      
changecolor(cpp_t11, cq1_radiobutton45, cq1_radiobutton46, cq1_radiobutton47, cq1_radiobutton48);
savebutton_c("51", cq1_radiobutton45, cq1_radiobutton46, cq1_radiobutton47, cq1_radiobutton48);
question_panel.removeAll();
question_panel.add(cppq12);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
      

changecolor(cpp_t12, cq1_radiobutton49, cq1_radiobutton50, cq1_radiobutton51, cq1_radiobutton52);
savebutton_c("52", cq1_radiobutton49, cq1_radiobutton50, cq1_radiobutton51, cq1_radiobutton52);
question_panel.removeAll();
question_panel.add(cppq13);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
       


changecolor(cpp_t13, cq1_radiobutton53, cq1_radiobutton54, cq1_radiobutton55, cq1_radiobutton56);
savebutton_c("53", cq1_radiobutton53, cq1_radiobutton54, cq1_radiobutton55, cq1_radiobutton56);
question_panel.removeAll();
question_panel.add(cppq14);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
      
changecolor(cpp_t14, cq1_radiobutton57, cq1_radiobutton58, cq1_radiobutton59, cq1_radiobutton60);
savebutton_c("54", cq1_radiobutton57, cq1_radiobutton58, cq1_radiobutton59, cq1_radiobutton60);
question_panel.removeAll();
question_panel.add(cppq15);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
      changecolor(cpp_t15, cq1_radiobutton61, cq1_radiobutton62, cq1_radiobutton63, cq1_radiobutton64);
savebutton_c("55", cq1_radiobutton61, cq1_radiobutton62, cq1_radiobutton63, cq1_radiobutton64);
question_panel.removeAll();
question_panel.add(cppq16);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        
changecolor(cpp_t16, cq1_radiobutton65, cq1_radiobutton66, cq1_radiobutton67, cq1_radiobutton68);
savebutton_c("56", cq1_radiobutton65, cq1_radiobutton66, cq1_radiobutton67, cq1_radiobutton68);
question_panel.removeAll();
question_panel.add(cppq17);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
       changecolor(cpp_t17, cq1_radiobutton69, cq1_radiobutton70, cq1_radiobutton71, cq1_radiobutton72);
savebutton_c("57", cq1_radiobutton69, cq1_radiobutton70, cq1_radiobutton71, cq1_radiobutton72);
question_panel.removeAll();
question_panel.add(cppq18);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
       changecolor(cpp_t18, cq1_radiobutton73, cq1_radiobutton74, cq1_radiobutton75, cq1_radiobutton76);
savebutton_c("58", cq1_radiobutton73, cq1_radiobutton74, cq1_radiobutton75, cq1_radiobutton76);
question_panel.removeAll();
question_panel.add(cppq19);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
       
changecolor(cpp_t19, cq1_radiobutton77, cq1_radiobutton78, cq1_radiobutton79, cq1_radiobutton80);
savebutton_c("59", cq1_radiobutton77, cq1_radiobutton78, cq1_radiobutton79, cq1_radiobutton80);
question_panel.removeAll();
question_panel.add(cppq20);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
      changecolor(cpp_t20, cq1_radiobutton81, cq1_radiobutton82, cq1_radiobutton83, cq1_radiobutton84);
savebutton_c("60", cq1_radiobutton81, cq1_radiobutton82, cq1_radiobutton83, cq1_radiobutton84);
question_panel.removeAll();
question_panel.add(jq1);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
            changecolor(cq_t21, jRadioButton77, jRadioButton78, jRadioButton79, jRadioButton80);
savebutton_c("21", jRadioButton77, jRadioButton78, jRadioButton79, jRadioButton80);
question_panel.removeAll();
question_panel.add(jq2);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        changecolor(cq_t22, jRadioButton81, jRadioButton82, jRadioButton83, jRadioButton84);
savebutton_c("22", jRadioButton81, jRadioButton82, jRadioButton83, jRadioButton84);
question_panel.removeAll();
question_panel.add(jq3);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
 changecolor(cq_t23, jRadioButton85, jRadioButton86, jRadioButton87, jRadioButton88);
savebutton_c("23", jRadioButton85, jRadioButton86, jRadioButton87, jRadioButton88);
question_panel.removeAll();
question_panel.add(jq4);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
      
changecolor(cq_t24, jRadioButton89, jRadioButton90, jRadioButton91, jRadioButton92);
savebutton_c("24", jRadioButton89, jRadioButton90, jRadioButton91, jRadioButton92);
question_panel.removeAll();
question_panel.add(jq5);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        
changecolor(cq_t25, jRadioButton93, jRadioButton94, jRadioButton95, jRadioButton96);
savebutton_c("25", jRadioButton93, jRadioButton94, jRadioButton95, jRadioButton96);
question_panel.removeAll();
question_panel.add(jq6);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       
changecolor(cq_t26, jRadioButton97, jRadioButton98, jRadioButton99, jRadioButton100);
savebutton_c("26", jRadioButton97, jRadioButton98, jRadioButton99, jRadioButton100);
question_panel.removeAll();
question_panel.add(jq7);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       
changecolor(cq_t27, jRadioButton101, jRadioButton102, jRadioButton103, jRadioButton104);
savebutton_c("27", jRadioButton101, jRadioButton102, jRadioButton103, jRadioButton104);
question_panel.removeAll();
question_panel.add(jq8);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        
changecolor(cq_t28, jRadioButton105, jRadioButton106, jRadioButton107, jRadioButton108);
savebutton_c("28", jRadioButton105, jRadioButton106, jRadioButton107, jRadioButton108);
question_panel.removeAll();
question_panel.add(jq9);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
       
changecolor(cq_t29, jRadioButton109, jRadioButton110, jRadioButton111, jRadioButton112);
savebutton_c("29", jRadioButton109, jRadioButton110, jRadioButton111, jRadioButton112);
question_panel.removeAll();
question_panel.add(jq10);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
       

changecolor(cq_t30, jRadioButton113, jRadioButton114, jRadioButton115, jRadioButton116);
savebutton_c("30", jRadioButton113, jRadioButton114, jRadioButton115, jRadioButton116);
question_panel.removeAll();
question_panel.add(jq11);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
       
changecolor(cq_t31, jRadioButton117, jRadioButton118, jRadioButton119, jRadioButton120);
savebutton_c("31", jRadioButton117, jRadioButton118, jRadioButton119, jRadioButton120);
question_panel.removeAll();
question_panel.add(jq12);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
      
changecolor(cq_t32, jRadioButton121, jRadioButton122, jRadioButton123, jRadioButton124);
savebutton_c("32", jRadioButton121, jRadioButton122, jRadioButton123, jRadioButton124);
question_panel.removeAll();
question_panel.add(jq13);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        

changecolor(cq_t33, jRadioButton125, jRadioButton126, jRadioButton127, jRadioButton128);
savebutton_c("33", jRadioButton125, jRadioButton126, jRadioButton127, jRadioButton128);
question_panel.removeAll();
question_panel.add(jq14);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
       

changecolor(cq_t34, jRadioButton129, jRadioButton130, jRadioButton131, jRadioButton132);
savebutton_c("34", jRadioButton129, jRadioButton130, jRadioButton131, jRadioButton132);
question_panel.removeAll();
question_panel.add(jq15);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
       

changecolor(cq_t35, jRadioButton133, jRadioButton134, jRadioButton135, jRadioButton136);
savebutton_c("35", jRadioButton133, jRadioButton134, jRadioButton135, jRadioButton136);
question_panel.removeAll();
question_panel.add(jq16);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
       

changecolor(cq_t36, jRadioButton137, jRadioButton138, jRadioButton139, jRadioButton140);
savebutton_c("36", jRadioButton137, jRadioButton138, jRadioButton139, jRadioButton140);
question_panel.removeAll();
question_panel.add(jq17);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
       changecolor(cq_t37, jRadioButton141, jRadioButton142, jRadioButton143, jRadioButton144);
savebutton_c("37", jRadioButton141, jRadioButton142, jRadioButton143, jRadioButton144);
question_panel.removeAll();
question_panel.add(jq18);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
     
changecolor(cq_t38, jRadioButton145, jRadioButton146, jRadioButton147, jRadioButton148);
savebutton_c("38", jRadioButton145, jRadioButton146, jRadioButton147, jRadioButton148);
question_panel.removeAll();
question_panel.add(jq19);
question_panel.repaint();
question_panel.revalidate(); 
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        

changecolor(cq_t39, jRadioButton149, jRadioButton150, jRadioButton151, jRadioButton152);
savebutton_c("39", jRadioButton149, jRadioButton150, jRadioButton151, jRadioButton152);
question_panel.removeAll();
question_panel.add(jq20);
question_panel.repaint();
question_panel.revalidate(); 

    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
       
changecolor(cq_t40, jRadioButton153, jRadioButton154, jRadioButton155, jRadioButton156);
savebutton_c("40", jRadioButton153, jRadioButton154, jRadioButton155, jRadioButton156);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jRadioButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton56ActionPerformed

    private void cq_t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t11ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq11);
       question_panel.repaint();
       question_panel.revalidate();        
    }//GEN-LAST:event_cq_t11ActionPerformed

    private void cq_t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t14ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq14);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t14ActionPerformed

    private void cq_t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t15ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq15);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t15ActionPerformed

    private void cq_t19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t19ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq19);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t19ActionPerformed

    private void cq_t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t12ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq12);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t12ActionPerformed

    private void cq_t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t16ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq16);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t16ActionPerformed

    private void cq_t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t13ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq13);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t13ActionPerformed

    private void cq_t17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t17ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq17);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t17ActionPerformed

    private void cq_t18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t18ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq18);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t18ActionPerformed

    private void cq_t20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cq_t20ActionPerformed
 question_panel.removeAll();
       question_panel.add(cq20);
       question_panel.repaint();
       question_panel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_cq_t20ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exam2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
response[0]=0;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SAVE1;
    private javax.swing.JButton SAVE2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup28;
    private javax.swing.ButtonGroup buttonGroup29;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup30;
    private javax.swing.ButtonGroup buttonGroup31;
    private javax.swing.ButtonGroup buttonGroup32;
    private javax.swing.ButtonGroup buttonGroup33;
    private javax.swing.ButtonGroup buttonGroup34;
    private javax.swing.ButtonGroup buttonGroup35;
    private javax.swing.ButtonGroup buttonGroup36;
    private javax.swing.ButtonGroup buttonGroup37;
    private javax.swing.ButtonGroup buttonGroup38;
    private javax.swing.ButtonGroup buttonGroup39;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup40;
    private javax.swing.ButtonGroup buttonGroup41;
    private javax.swing.ButtonGroup buttonGroup42;
    private javax.swing.ButtonGroup buttonGroup43;
    private javax.swing.ButtonGroup buttonGroup44;
    private javax.swing.ButtonGroup buttonGroup45;
    private javax.swing.ButtonGroup buttonGroup46;
    private javax.swing.ButtonGroup buttonGroup47;
    private javax.swing.ButtonGroup buttonGroup48;
    private javax.swing.ButtonGroup buttonGroup49;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup50;
    private javax.swing.ButtonGroup buttonGroup51;
    private javax.swing.ButtonGroup buttonGroup52;
    private javax.swing.ButtonGroup buttonGroup53;
    private javax.swing.ButtonGroup buttonGroup54;
    private javax.swing.ButtonGroup buttonGroup55;
    private javax.swing.ButtonGroup buttonGroup56;
    private javax.swing.ButtonGroup buttonGroup57;
    private javax.swing.ButtonGroup buttonGroup58;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton cpp_t1;
    private javax.swing.JButton cpp_t10;
    private javax.swing.JButton cpp_t11;
    private javax.swing.JButton cpp_t12;
    private javax.swing.JButton cpp_t13;
    private javax.swing.JButton cpp_t14;
    private javax.swing.JButton cpp_t15;
    private javax.swing.JButton cpp_t16;
    private javax.swing.JButton cpp_t17;
    private javax.swing.JButton cpp_t18;
    private javax.swing.JButton cpp_t19;
    private javax.swing.JButton cpp_t2;
    private javax.swing.JButton cpp_t20;
    private javax.swing.JButton cpp_t3;
    private javax.swing.JButton cpp_t4;
    private javax.swing.JButton cpp_t5;
    private javax.swing.JButton cpp_t6;
    private javax.swing.JButton cpp_t7;
    private javax.swing.JButton cpp_t8;
    private javax.swing.JButton cpp_t9;
    private javax.swing.JPanel cppq1;
    private javax.swing.JPanel cppq10;
    private javax.swing.JPanel cppq11;
    private javax.swing.JPanel cppq12;
    private javax.swing.JPanel cppq13;
    private javax.swing.JPanel cppq14;
    private javax.swing.JPanel cppq15;
    private javax.swing.JPanel cppq16;
    private javax.swing.JPanel cppq17;
    private javax.swing.JPanel cppq18;
    private javax.swing.JPanel cppq19;
    private javax.swing.JPanel cppq2;
    private javax.swing.JPanel cppq20;
    private javax.swing.JPanel cppq3;
    private javax.swing.JPanel cppq4;
    private javax.swing.JPanel cppq5;
    private javax.swing.JPanel cppq6;
    private javax.swing.JPanel cppq7;
    private javax.swing.JPanel cppq8;
    private javax.swing.JPanel cppq9;
    private javax.swing.JPanel cq1;
    private javax.swing.JPanel cq10;
    private javax.swing.JPanel cq11;
    private javax.swing.JPanel cq12;
    private javax.swing.JPanel cq13;
    private javax.swing.JPanel cq14;
    private javax.swing.JPanel cq15;
    private javax.swing.JPanel cq16;
    private javax.swing.JPanel cq17;
    private javax.swing.JPanel cq18;
    private javax.swing.JPanel cq19;
    private javax.swing.ButtonGroup cq1_radio_group;
    private javax.swing.JRadioButton cq1_radiobutton1;
    private javax.swing.JRadioButton cq1_radiobutton10;
    private javax.swing.JRadioButton cq1_radiobutton11;
    private javax.swing.JRadioButton cq1_radiobutton12;
    private javax.swing.JRadioButton cq1_radiobutton13;
    private javax.swing.JRadioButton cq1_radiobutton14;
    private javax.swing.JRadioButton cq1_radiobutton15;
    private javax.swing.JRadioButton cq1_radiobutton16;
    private javax.swing.JRadioButton cq1_radiobutton17;
    private javax.swing.JRadioButton cq1_radiobutton18;
    private javax.swing.JRadioButton cq1_radiobutton19;
    private javax.swing.JRadioButton cq1_radiobutton2;
    private javax.swing.JRadioButton cq1_radiobutton20;
    private javax.swing.JRadioButton cq1_radiobutton21;
    private javax.swing.JRadioButton cq1_radiobutton22;
    private javax.swing.JRadioButton cq1_radiobutton23;
    private javax.swing.JRadioButton cq1_radiobutton24;
    private javax.swing.JRadioButton cq1_radiobutton25;
    private javax.swing.JRadioButton cq1_radiobutton26;
    private javax.swing.JRadioButton cq1_radiobutton27;
    private javax.swing.JRadioButton cq1_radiobutton28;
    private javax.swing.JRadioButton cq1_radiobutton29;
    private javax.swing.JRadioButton cq1_radiobutton3;
    private javax.swing.JRadioButton cq1_radiobutton30;
    private javax.swing.JRadioButton cq1_radiobutton31;
    private javax.swing.JRadioButton cq1_radiobutton32;
    private javax.swing.JRadioButton cq1_radiobutton33;
    private javax.swing.JRadioButton cq1_radiobutton34;
    private javax.swing.JRadioButton cq1_radiobutton35;
    private javax.swing.JRadioButton cq1_radiobutton36;
    private javax.swing.JRadioButton cq1_radiobutton37;
    private javax.swing.JRadioButton cq1_radiobutton38;
    private javax.swing.JRadioButton cq1_radiobutton39;
    private javax.swing.JRadioButton cq1_radiobutton4;
    private javax.swing.JRadioButton cq1_radiobutton40;
    private javax.swing.JRadioButton cq1_radiobutton41;
    private javax.swing.JRadioButton cq1_radiobutton42;
    private javax.swing.JRadioButton cq1_radiobutton43;
    private javax.swing.JRadioButton cq1_radiobutton44;
    private javax.swing.JRadioButton cq1_radiobutton45;
    private javax.swing.JRadioButton cq1_radiobutton46;
    private javax.swing.JRadioButton cq1_radiobutton47;
    private javax.swing.JRadioButton cq1_radiobutton48;
    private javax.swing.JRadioButton cq1_radiobutton49;
    private javax.swing.JRadioButton cq1_radiobutton5;
    private javax.swing.JRadioButton cq1_radiobutton50;
    private javax.swing.JRadioButton cq1_radiobutton51;
    private javax.swing.JRadioButton cq1_radiobutton52;
    private javax.swing.JRadioButton cq1_radiobutton53;
    private javax.swing.JRadioButton cq1_radiobutton54;
    private javax.swing.JRadioButton cq1_radiobutton55;
    private javax.swing.JRadioButton cq1_radiobutton56;
    private javax.swing.JRadioButton cq1_radiobutton57;
    private javax.swing.JRadioButton cq1_radiobutton58;
    private javax.swing.JRadioButton cq1_radiobutton59;
    private javax.swing.JRadioButton cq1_radiobutton6;
    private javax.swing.JRadioButton cq1_radiobutton60;
    private javax.swing.JRadioButton cq1_radiobutton61;
    private javax.swing.JRadioButton cq1_radiobutton62;
    private javax.swing.JRadioButton cq1_radiobutton63;
    private javax.swing.JRadioButton cq1_radiobutton64;
    private javax.swing.JRadioButton cq1_radiobutton65;
    private javax.swing.JRadioButton cq1_radiobutton66;
    private javax.swing.JRadioButton cq1_radiobutton67;
    private javax.swing.JRadioButton cq1_radiobutton68;
    private javax.swing.JRadioButton cq1_radiobutton69;
    private javax.swing.JRadioButton cq1_radiobutton7;
    private javax.swing.JRadioButton cq1_radiobutton70;
    private javax.swing.JRadioButton cq1_radiobutton71;
    private javax.swing.JRadioButton cq1_radiobutton72;
    private javax.swing.JRadioButton cq1_radiobutton73;
    private javax.swing.JRadioButton cq1_radiobutton74;
    private javax.swing.JRadioButton cq1_radiobutton75;
    private javax.swing.JRadioButton cq1_radiobutton76;
    private javax.swing.JRadioButton cq1_radiobutton77;
    private javax.swing.JRadioButton cq1_radiobutton78;
    private javax.swing.JRadioButton cq1_radiobutton79;
    private javax.swing.JRadioButton cq1_radiobutton8;
    private javax.swing.JRadioButton cq1_radiobutton80;
    private javax.swing.JRadioButton cq1_radiobutton81;
    private javax.swing.JRadioButton cq1_radiobutton82;
    private javax.swing.JRadioButton cq1_radiobutton83;
    private javax.swing.JRadioButton cq1_radiobutton84;
    private javax.swing.JRadioButton cq1_radiobutton9;
    private javax.swing.JPanel cq2;
    private javax.swing.JPanel cq20;
    private javax.swing.ButtonGroup cq2_radio_group;
    private javax.swing.JPanel cq3;
    private javax.swing.JPanel cq4;
    private javax.swing.JPanel cq5;
    private javax.swing.JPanel cq6;
    private javax.swing.JPanel cq7;
    private javax.swing.JPanel cq8;
    private javax.swing.JPanel cq9;
    private javax.swing.JButton cq_t1;
    private javax.swing.JButton cq_t10;
    private javax.swing.JButton cq_t11;
    private javax.swing.JButton cq_t12;
    private javax.swing.JButton cq_t13;
    private javax.swing.JButton cq_t14;
    private javax.swing.JButton cq_t15;
    private javax.swing.JButton cq_t16;
    private javax.swing.JButton cq_t17;
    private javax.swing.JButton cq_t18;
    private javax.swing.JButton cq_t19;
    private javax.swing.JButton cq_t2;
    private javax.swing.JButton cq_t20;
    private javax.swing.JButton cq_t21;
    private javax.swing.JButton cq_t22;
    private javax.swing.JButton cq_t23;
    private javax.swing.JButton cq_t24;
    private javax.swing.JButton cq_t25;
    private javax.swing.JButton cq_t26;
    private javax.swing.JButton cq_t27;
    private javax.swing.JButton cq_t28;
    private javax.swing.JButton cq_t29;
    private javax.swing.JButton cq_t3;
    private javax.swing.JButton cq_t30;
    private javax.swing.JButton cq_t31;
    private javax.swing.JButton cq_t32;
    private javax.swing.JButton cq_t33;
    private javax.swing.JButton cq_t34;
    private javax.swing.JButton cq_t35;
    private javax.swing.JButton cq_t36;
    private javax.swing.JButton cq_t37;
    private javax.swing.JButton cq_t38;
    private javax.swing.JButton cq_t39;
    private javax.swing.JButton cq_t4;
    private javax.swing.JButton cq_t40;
    private javax.swing.JButton cq_t5;
    private javax.swing.JButton cq_t6;
    private javax.swing.JButton cq_t7;
    private javax.swing.JButton cq_t8;
    private javax.swing.JButton cq_t9;
    private javax.swing.JPanel head_panel;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton100;
    private javax.swing.JRadioButton jRadioButton101;
    private javax.swing.JRadioButton jRadioButton102;
    private javax.swing.JRadioButton jRadioButton103;
    private javax.swing.JRadioButton jRadioButton104;
    private javax.swing.JRadioButton jRadioButton105;
    private javax.swing.JRadioButton jRadioButton106;
    private javax.swing.JRadioButton jRadioButton107;
    private javax.swing.JRadioButton jRadioButton108;
    private javax.swing.JRadioButton jRadioButton109;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton110;
    private javax.swing.JRadioButton jRadioButton111;
    private javax.swing.JRadioButton jRadioButton112;
    private javax.swing.JRadioButton jRadioButton113;
    private javax.swing.JRadioButton jRadioButton114;
    private javax.swing.JRadioButton jRadioButton115;
    private javax.swing.JRadioButton jRadioButton116;
    private javax.swing.JRadioButton jRadioButton117;
    private javax.swing.JRadioButton jRadioButton118;
    private javax.swing.JRadioButton jRadioButton119;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton120;
    private javax.swing.JRadioButton jRadioButton121;
    private javax.swing.JRadioButton jRadioButton122;
    private javax.swing.JRadioButton jRadioButton123;
    private javax.swing.JRadioButton jRadioButton124;
    private javax.swing.JRadioButton jRadioButton125;
    private javax.swing.JRadioButton jRadioButton126;
    private javax.swing.JRadioButton jRadioButton127;
    private javax.swing.JRadioButton jRadioButton128;
    private javax.swing.JRadioButton jRadioButton129;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton130;
    private javax.swing.JRadioButton jRadioButton131;
    private javax.swing.JRadioButton jRadioButton132;
    private javax.swing.JRadioButton jRadioButton133;
    private javax.swing.JRadioButton jRadioButton134;
    private javax.swing.JRadioButton jRadioButton135;
    private javax.swing.JRadioButton jRadioButton136;
    private javax.swing.JRadioButton jRadioButton137;
    private javax.swing.JRadioButton jRadioButton138;
    private javax.swing.JRadioButton jRadioButton139;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton140;
    private javax.swing.JRadioButton jRadioButton141;
    private javax.swing.JRadioButton jRadioButton142;
    private javax.swing.JRadioButton jRadioButton143;
    private javax.swing.JRadioButton jRadioButton144;
    private javax.swing.JRadioButton jRadioButton145;
    private javax.swing.JRadioButton jRadioButton146;
    private javax.swing.JRadioButton jRadioButton147;
    private javax.swing.JRadioButton jRadioButton148;
    private javax.swing.JRadioButton jRadioButton149;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton150;
    private javax.swing.JRadioButton jRadioButton151;
    private javax.swing.JRadioButton jRadioButton152;
    private javax.swing.JRadioButton jRadioButton153;
    private javax.swing.JRadioButton jRadioButton154;
    private javax.swing.JRadioButton jRadioButton155;
    private javax.swing.JRadioButton jRadioButton156;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JRadioButton jRadioButton49;
    public javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton65;
    private javax.swing.JRadioButton jRadioButton66;
    private javax.swing.JRadioButton jRadioButton67;
    private javax.swing.JRadioButton jRadioButton68;
    private javax.swing.JRadioButton jRadioButton69;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton70;
    private javax.swing.JRadioButton jRadioButton71;
    private javax.swing.JRadioButton jRadioButton72;
    private javax.swing.JRadioButton jRadioButton73;
    private javax.swing.JRadioButton jRadioButton74;
    private javax.swing.JRadioButton jRadioButton75;
    private javax.swing.JRadioButton jRadioButton76;
    private javax.swing.JRadioButton jRadioButton77;
    private javax.swing.JRadioButton jRadioButton78;
    private javax.swing.JRadioButton jRadioButton79;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton80;
    private javax.swing.JRadioButton jRadioButton81;
    private javax.swing.JRadioButton jRadioButton82;
    private javax.swing.JRadioButton jRadioButton83;
    private javax.swing.JRadioButton jRadioButton84;
    private javax.swing.JRadioButton jRadioButton85;
    private javax.swing.JRadioButton jRadioButton86;
    private javax.swing.JRadioButton jRadioButton87;
    private javax.swing.JRadioButton jRadioButton88;
    private javax.swing.JRadioButton jRadioButton89;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton jRadioButton90;
    private javax.swing.JRadioButton jRadioButton91;
    private javax.swing.JRadioButton jRadioButton92;
    private javax.swing.JRadioButton jRadioButton93;
    private javax.swing.JRadioButton jRadioButton94;
    private javax.swing.JRadioButton jRadioButton95;
    private javax.swing.JRadioButton jRadioButton96;
    private javax.swing.JRadioButton jRadioButton97;
    private javax.swing.JRadioButton jRadioButton98;
    private javax.swing.JRadioButton jRadioButton99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    private javax.swing.JTextArea jTextArea29;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea30;
    private javax.swing.JTextArea jTextArea31;
    private javax.swing.JTextArea jTextArea32;
    private javax.swing.JTextArea jTextArea33;
    private javax.swing.JTextArea jTextArea34;
    private javax.swing.JTextArea jTextArea35;
    private javax.swing.JTextArea jTextArea36;
    private javax.swing.JTextArea jTextArea37;
    private javax.swing.JTextArea jTextArea38;
    private javax.swing.JTextArea jTextArea39;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea40;
    private javax.swing.JTextArea jTextArea41;
    private javax.swing.JTextArea jTextArea42;
    private javax.swing.JTextArea jTextArea43;
    private javax.swing.JTextArea jTextArea44;
    private javax.swing.JTextArea jTextArea45;
    private javax.swing.JTextArea jTextArea46;
    private javax.swing.JTextArea jTextArea47;
    private javax.swing.JTextArea jTextArea48;
    private javax.swing.JTextArea jTextArea49;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea50;
    private javax.swing.JTextArea jTextArea51;
    private javax.swing.JTextArea jTextArea52;
    private javax.swing.JTextArea jTextArea53;
    private javax.swing.JTextArea jTextArea54;
    private javax.swing.JTextArea jTextArea55;
    private javax.swing.JTextArea jTextArea56;
    private javax.swing.JTextArea jTextArea57;
    private javax.swing.JTextArea jTextArea58;
    private javax.swing.JTextArea jTextArea59;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea60;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jq1;
    private javax.swing.JPanel jq10;
    private javax.swing.JPanel jq11;
    private javax.swing.JPanel jq12;
    private javax.swing.JPanel jq13;
    private javax.swing.JPanel jq14;
    private javax.swing.JPanel jq15;
    private javax.swing.JPanel jq16;
    private javax.swing.JPanel jq17;
    private javax.swing.JPanel jq18;
    private javax.swing.JPanel jq19;
    private javax.swing.JPanel jq2;
    private javax.swing.JPanel jq20;
    private javax.swing.JPanel jq3;
    private javax.swing.JPanel jq4;
    private javax.swing.JPanel jq5;
    private javax.swing.JPanel jq6;
    private javax.swing.JPanel jq7;
    private javax.swing.JPanel jq8;
    private javax.swing.JPanel jq9;
    private javax.swing.JPanel qt_C;
    private javax.swing.JPanel qt_cpp;
    private javax.swing.JPanel qt_java;
    private javax.swing.JPanel question_panel;
    private javax.swing.JTabbedPane question_tab;
    private javax.swing.JButton submit_final;
    public javax.swing.JLabel timer_label;
    // End of variables declaration//GEN-END:variables
}
