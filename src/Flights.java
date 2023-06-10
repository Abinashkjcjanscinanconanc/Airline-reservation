
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Flights extends javax.swing.JFrame {

    
    public Flights() {
        initComponents();
        DisplayFlight();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        FDestCb = new javax.swing.JComboBox<>();
        FSourceCb = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        SeatsTb = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("SWAIN AIRLINE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 340, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Manage Flights");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 180, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Flight Code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 120, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Source");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Destination");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Take Of Date ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Number Of Seats");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));
        jPanel1.add(FCodeTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 110, 30));

        FDestCb.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        FDestCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banglore", "Delhi", "Mumbai", "Chennai", "Goa", "Maisore", "Tamilnadu", "Odisha", " " }));
        FDestCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDestCbActionPerformed(evt);
            }
        });
        jPanel1.add(FDestCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 30));

        FSourceCb.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banglore", "Delhi", "Mumbai", "Chennai", "Goa", "Maisore", "Tamilnadu", "Odisha", " " }));
        FSourceCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSourceCbActionPerformed(evt);
            }
        });
        jPanel1.add(FSourceCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 120, -1));
        jPanel1.add(FDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 130, 30));
        jPanel1.add(SeatsTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 150, 30));

        BackBtn.setBackground(new java.awt.Color(255, 0, 51));
        BackBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        BackBtn.setText("BACK");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 100, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 0, 51));
        SaveBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        SaveBtn.setText("SAVE");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 100, -1));

        EditBtn.setBackground(new java.awt.Color(255, 0, 51));
        EditBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        EditBtn.setText("EDIT");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 100, -1));

        DeleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 120, -1));

        jTextField3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 0, 0));
        jTextField3.setText("Flights List");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 110, 30));

        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightsTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1040, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FDestCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDestCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FDestCbActionPerformed

    private void FSourceCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSourceCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FSourceCbActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BackBtnMouseClicked
       Connection Con=null;
       PreparedStatement pst=null;
       ResultSet Rs=null,Rs1=null;
       Statement St=null,St1=null;
       
      private void DisplayFlight()
      {
           try{
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
               St=Con.createStatement();
               Rs=St.executeQuery("select * from FlightTbl");
               FlightsTable.setModel(DbUtils.resultSetToTableModel(Rs));
           }catch(Exception e)
           {
                
           }  
      }  
      private void Clear()
     {      
         FCodeTb.setText(" ");
         SeatsTb.setText(" ");
         
         
         
     }    

    
        
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
       
         if(FCodeTb.getText().isEmpty() || SeatsTb.getText().isEmpty() || FSourceCb.getSelectedIndex()== -1|| FDestCb.getSelectedIndex()== -1)
             {
                  JOptionPane.showMessageDialog(this,"Missing InforMation");
                      
             }else{
                    try{
                         
                          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                          PreparedStatement Add=Con.prepareStatement("insert into flightTbl values(?,?,?,?,?)");
                          Add.setString(1,FCodeTb.getText());
                          Add.setString(2,FSourceCb.getSelectedItem().toString());
                          Add.setString(3,FDestCb.getSelectedItem().toString());
                          Add.setString(4,FDate.getDate().toString());
                          Add.setInt(5,Integer.valueOf(SeatsTb.getText()));
                          
                          int row=Add.executeUpdate();
                          JOptionPane.showMessageDialog(this,"Flight Added");
                          Con.close();
                          DisplayFlight(); 
                          Clear();
                    }catch(Exception e)
                    {
                     JOptionPane.showMessageDialog(this, e);
                    }     
                     
         }         
        
        
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
          if(key == " ")
        {
            JOptionPane.showMessageDialog(this,"select a Flight");
        }else{
            try{
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
               String Query="Delete from  FlightTbl where FlCode= ' "+key+" ' ";
               Statement Del=Con.createStatement();
               Del.executeUpdate(Query);
               JOptionPane.showMessageDialog(this,"Flight Deleted.");
               DisplayFlight();
               
            }catch(Exception e)
            {
               JOptionPane.showMessageDialog(this,e);
            }
        } 
           
        
    }//GEN-LAST:event_DeleteBtnMouseClicked
  String key=" ";
    private void FlightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)FlightsTable.getModel();
         int MyIndex=FlightsTable.getSelectedRow();
         key=model.getValueAt(MyIndex,0).toString();
         FSourceCb.setSelectedItem(model.getValueAt(MyIndex,1).toString());
         FDestCb.setSelectedItem(model.getValueAt(MyIndex,2).toString());
         SeatsTb.setText(model.getValueAt(MyIndex,4).toString());
         
          
    }//GEN-LAST:event_FlightsTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(key == " ")
             {
                  JOptionPane.showMessageDialog(this,"select A Passengers");
                      
             }else{
                    try{
                         
                         
                          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                          String Query ="update FlightTbl set FlSource=?,FlDate=?,FlDest=?,FlSeats=? where FlCode=?";
                          
                          
                          PreparedStatement Add=Con.prepareStatement(Query);
                          Add.setString(5,key);
                          Add.setString(1, FSourceCb.getSelectedItem().toString());
                          Add.setString(2,FDestCb.getSelectedItem().toString());
                          Add.setString(3,FDate.getDate().toString());
                          Add.setString(4,SeatsTb.getText());
                          int row=Add.executeUpdate();
                          JOptionPane.showMessageDialog(this,"Flight updated");
                          Con.close();
                          DisplayFlight(); 
                          Clear();
                    }catch(Exception e)
                    {
                     JOptionPane.showMessageDialog(this, e);
                    }
        }        
        
        
    }//GEN-LAST:event_EditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox<String> FDestCb;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField SeatsTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
