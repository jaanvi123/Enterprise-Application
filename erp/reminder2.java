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
public class reminder2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form reminder2
     */
    public reminder2() {
        initComponents();
        //initComponents();
        Date now=new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yy");
        jTextField1.setText(formatter.format(now));
        
    }

    private void dealer()
    {
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Reminder");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.No", "Date", "Customer", "Company", "City"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("REMINDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton2)
                .addGap(41, 41, 41)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.addTableModelListener(jTable1);    
       Connection con;
        Statement s;
        ResultSet vs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jaanvi","root","admin");
            s=con.createStatement();
            String a="stationery";
            String Query="select * from reminder2 where item like '"+a+"' ";
            vs=s.executeQuery(Query);
              int i=0;
             int j=1;
           while(vs.next()==true)
            {    
                 String s1=vs.getString("date");
        String ff="/";
        String gg="0";
                String s2=jTextField1.getText();
               
            int f=s1.indexOf('/');
            String date = s1.substring(0,f);
            int c=Integer.parseInt(date);
            System.out.println("c" +c);
            
            int b=s1.lastIndexOf('/');
            String month = s1.substring(f+1,b);
            int e=Integer.parseInt(month);
            System.out.println("e" +e);
            
            int d=s1.length();
            String year=s1.substring(b+1,d);
            int g=Integer.parseInt(year);
            System.out.println("g" +g);
         if(e==1)
        {
        if((date.equals("30")||(date.equals("31"))))
        {    
            String s4="30";
            String s5="06";
            String s6=year;
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("name"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
        }
        else
        {
         
            String s4=date;
            String s5="06";
            String s6=year;
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
        }
        }     
         else if(e==02||e==03||e==04||e==05||e==06||e==07)
        {
            String s4=date;
            e=e+05;
            String s5=Integer.toString(e);
            String s6=year;
            String s7=s4+ff+gg+s5+ff+s6;
            if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("name"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
        }
              else if(e==8)
               {
            String s4=date;
            String s5="01";
            g=g+1;
            String s6=Integer.toString(g);
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
                   
               }
              else if(e==9)
              {
                  int y=g+1;
                  int y2=y%4;
                   if((date.equals("28"))||(date.equals("29"))||(date.equals("30")))
                   {
                     if(y2!=0)
                     {
                          String s4="29";
                          String s5="02";
                          g=g+1;
                          String s6=Integer.toString(g);
                          String s7=s4+ff+s5+ff+s6;
                          if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
                 }
                     }       else
                          {
                              if((date.equals("29"))||(date.equals("30")))
                              {
                                String s4="29";
                          String s5="02";
                          g=g+1;
                          String s6=Integer.toString(g);
                          String s7=s4+ff+s5+ff+s6;
                              if(s7.equals(s2))
                     {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
                 }  
                  }            
                 }
                     JOptionPane.showMessageDialog(this,"Nothing To Show");
                }
                   else
                   {
                     String s4=date;
            String s5="02";
            g=g+1;
            String s6=Integer.toString(g);
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }  
                   }
                  
              }
              else if(e==10)
              {
                  String s4=date;
            String s5="03";
            g=g+1;
            String s6=Integer.toString(g);
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
              }
       
              else if(e==11)
              {
                  String s4=date;
            String s5="04";
            g=g+1;
            String s6=Integer.toString(g);
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
              }
              else if(e==12)
              {
                  String s4=date;
            String s5="05";
            g=g+1;
            String s6=Integer.toString(g);
            String s7=s4+ff+s5+ff+s6;
             if(s7.equals(s2))
                 {
                 model.addRow(new Object[]{});
                 jTable1.setValueAt(vs.getString("dname"),i,2);
                 jTable1.setValueAt(vs.getString("company"),i,3);
                 jTable1.setValueAt(vs.getString("city"),i,4);
                 jTable1.setValueAt(vs.getString("date"),i,1);
                 jTable1.setValueAt((j),i,0);
                   j++;
                   i++;
        }
              }
        
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
