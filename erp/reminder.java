
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class reminder extends javax.swing.JInternalFrame {

    /**
     * Creates new form reminder
     */
    public reminder() {
        initComponents();
        Date now=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
        jTextField1.setText(formatter.format(now));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        DATE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setClosable(true);
        setIconifiable(true);
        setTitle("Reminder");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.No", "Date", "Customer", "Account_no"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 608, 255));

        jButton5.setText("Reminders");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        getContentPane().add(DATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setText("DATE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 10));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.addTableModelListener(jTable1);      
        Connection con;
        Statement s;
        ResultSet vs;
        try
        {  
            String s2="";
        String s1=jTextField1.getText();
        String ff="/";
        String gg="0";
           
            int a=s1.indexOf('/');
            String date = s1.substring(0,a);
            int c=Integer.parseInt(date);
            System.out.println(c);
            int b=s1.lastIndexOf('/');
            String month = s1.substring(a+1,b);
            int e=Integer.parseInt(month);
            System.out.println(e);
            int d=s1.length();
            String year=s1.substring(b+1,d);
            int f=Integer.parseInt(year);
            System.out.println(f);
           
             if(e==5||e==7||e==8||e==10)
            {   
                if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8||c==9)
                {
                e=e-1;
                String mon=Integer.toString(e);
                s2=date+ff+gg+mon+ff+year;
                System.out.println(s2);
                } 
                if(c==10||c==11||c==12||c==13||c==14||c==15||c==16||c==17||c==18||c==19||c==20||c==21||c==22||c==23||c==24||c==25||c==26||c==27||c==28||c==29||c==30) 
            {   
                e=e-1;
                String mon=Integer.toString(e);
                s2=date+ff+gg+mon+ff+year;
                System.out.println(s2);
            }
                if(c==31)
                {
                    c=1;
                    String da=Integer.toString(c);
                    s2=da+ff+gg+month+ff+year;
                    
                    System.out.println(s2);
                }
            }
             else if(e==4||e==6||e==9)
             {   if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8)
             {
                 e=e-1;
                 String mon=Integer.toString(e);
                 c=c+1;
                 String da=Integer.toString(c);
                 s2=gg+da+ff+gg+mon+ff+year;
                 System.out.println(s2);
             }
             else 
             {
                 e=e-1;
                 String mon=Integer.toString(e);
                 c=c+1;
                 String da=Integer.toString(c);
                 s2=da+ff+gg+mon+ff+year;
                 System.out.println(s2);
             }}
               else if(e==12)
            {
                
                if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8||c==9)
                {
                e=e-1;
                String mon=Integer.toString(e);
                s2=gg+date+ff+gg+mon+ff+year;
                System.out.println(s2);
                }
                if(c==10||c==11||c==12||c==13||c==14||c==15||c==16||c==17||c==18||c==19||c==20||c==21||c==22||c==23||c==24||c==25||c==26||c==27||c==28||c==29||c==30)
                {
                e=e-1;
                String mon=Integer.toString(e);
                s2=date+ff+gg+mon+ff+year;
                System.out.println(s2);
                }
                if(c==31)
                { c=1;
                String da=Integer.toString(c);
                s2=gg+da+ff+month+ff+year;
                System.out.println(s2);
                }
                    }
               else if(e==11)
               {
                    {   if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8)
             {
                 e=e-1;
                 String mon=Integer.toString(e);
                 c=c+1;
                 String da=Integer.toString(c);
                 s2=gg+da+ff+mon+ff+year;
                 System.out.println(s2);
             }
             else 
             {
                 e=e-1;
                 String mon=Integer.toString(e);
                 c=c+1;
                 String da=Integer.toString(c);
                 s2=da+ff+mon+ff+year;
                 System.out.println(s2);
             }
               }}
               else if(e==1)
               {
                   if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8)
                   {
                      c=c+1;
                e=e+11;
                f=f-1;
                String da=Integer.toString(c);
                String ye=Integer.toString(f);
                String mon=Integer.toString(e);
                s2=gg+da+ff+mon+ff+ye;
                System.out.println(s2);
                   }
                   if(c==9||c==10||c==11||c==12||c==13||c==14||c==15||c==16||c==17||c==18||c==19||c==20||c==21||c==22||c==23||c==24||c==25||c==26||c==27||c==28||c==29||c==30)
                   {
                c=c+1;
                e=e+11;
                f=f-1;
                String da=Integer.toString(c);
                String ye=Integer.toString(f);
                String mon=Integer.toString(e);
                s2=da+ff+mon+ff+ye;
                System.out.println(s2);
                   }
                   if(c==31)
                   {
                c=1;
                String da=Integer.toString(c);
                s2=gg+da+ff+month+ff+year;
                System.out.println(s2);
                   }
                       }
               else if(e==2)
               {
                   if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8)
                   {
                         e=e-1;
                 String mon=Integer.toString(e);
                 c=c+1;
                 String da=Integer.toString(c);
                 s2=gg+da+ff+gg+mon+ff+year;
                 System.out.println(s2);
                   }
                   if(c==9||c==10||c==11||c==12||c==13||c==14||c==15||c==16||c==17||c==18||c==19||c==20||c==21||c==22||c==23||c==24||c==25||c==26||c==27||c==28)
                   {
                 e=e-1;
                 String mon=Integer.toString(e);
                 c=c+1;
                 String da=Integer.toString(c);
                 s2=da+ff+gg+mon+ff+year;
                 System.out.println(s2);
                  }         
               }
               if(c==3){
                   
                 
               
                   if(c==1||c==2||c==3||c==4||c==5||c==6||c==7||c==8)
                   { e=e-1;
                   String mon=Integer.toString(e);
                   s2=gg+date+ff+gg+mon+ff+year;
                   System.out.println(s2);
                   }
                   if(f%4==0)
                   {
                   if(c==9||c==10||c==11||c==12||c==13||c==14||c==15||c==16||c==17||c==18||c==19||c==20||c==21||c==22||c==23||c==24||c==25||c==26||c==27||c==28||c==29)
                   {
                e=e-1;
                String mon=Integer.toString(e);
                s2=date+ff+gg+mon+ff+year;
                System.out.println(s2);
                   }
                   }
                   else 
                   {
                        if(c==9||c==10||c==11||c==12||c==13||c==14||c==15||c==16||c==17||c==18||c==19||c==20||c==21||c==22||c==23||c==24||c==25||c==26||c==27||c==28)
                   {
                e=e-1;
                String mon=Integer.toString(e);
                s2=date+ff+gg+mon+ff+year;
                System.out.println(s2);
                   }}
               }
           
              
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jaanvi","root","admin");
            s=con.createStatement();
            String Query="select * from customer where date like ('"+s2+"')";
            vs=s.executeQuery(Query);
             int i=0;
             int j=1;
           while(vs.next())
            {
                  model.addRow(new Object[]{});
                 
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("no"),i,3);
                  jTable1.setValueAt(vs.getString("date"),i,1);
                   jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
            }
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
