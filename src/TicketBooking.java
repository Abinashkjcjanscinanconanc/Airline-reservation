
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TicketBooking extends javax.swing.JFrame {

   
    public TicketBooking() {
        initComponents();
        GetPassenger();
        NationalityTb.setEditable(false);
        PassNameTb.setEditable(false);
        PassNumTb.setEditable(false);
        GenTb.setEditable(false);
       // FCodeCb.setEditable(true);
        GetFlights();
        DisplayBooking();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PassIdCb = new javax.swing.JComboBox<>();
        GenTb = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        BookBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        PassNameTb = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        PassNumTb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FCodeCb = new javax.swing.JComboBox<>();
        NationalityTb = new javax.swing.JTextField();
        AmountTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("Ticket Booking");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 190, 30));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Passenger Id");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, 30));
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Nationality");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Gender");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Passport Name");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Amount");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 100, 30));

        PassIdCb.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });
        jPanel4.add(PassIdCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 30));
        jPanel4.add(GenTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 120, 30));

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
        jPanel4.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 100, -1));

        BookBtn.setBackground(new java.awt.Color(255, 0, 51));
        BookBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        BookBtn.setText("BOOK");
        BookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookBtnMouseClicked(evt);
            }
        });
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });
        jPanel4.add(BookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 100, -1));

        ResetBtn.setBackground(new java.awt.Color(255, 51, 51));
        ResetBtn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ResetBtn.setText("RESET");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 120, -1));

        jTextField4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 0, 0));
        jTextField4.setText("BOKKING LISTS");
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 170, 30));

        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(BookingTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1040, 180));
        jPanel4.add(PassNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 150, 30));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setText("Flight Code");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));
        jPanel4.add(PassNumTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 170, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText(" Passport Number");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 180, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel2.setText("SWAIN AIRLINE");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 340, 30));

        FCodeCb.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        FCodeCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeCbActionPerformed(evt);
            }
        });
        jPanel4.add(FCodeCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 100, 30));
        jPanel4.add(NationalityTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 290, 120, 30));
        jPanel4.add(AmountTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
      
          GetPassengersData();
        
    }//GEN-LAST:event_PassIdCbActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void FCodeCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeCbActionPerformed
       Connection Con=null;
       PreparedStatement pst=null;
       ResultSet Rs=null,Rs1=null;
       Statement St=null,St1=null;
       private void GetPassenger()
       {
          try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                St=Con.createStatement();
                String Query="select * from PassengersTbl";
                Rs=St.executeQuery(Query);
                while(Rs.next())
                {
                    String PId=String.valueOf(Rs.getInt("PId"));
                    PassIdCb.addItem(PId);
                }    
              
          }catch(Exception e)
          {
              
          } 
          
       }       
     private void GetPassengersData()
     {
         String Query="select * from PassengersTbl where PId="+PassIdCb.getSelectedItem().toString();
         Statement St;
         ResultSet Rs;
         try{
             Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
             St=Con.createStatement();
             Rs=St.executeQuery(Query);
             if(Rs.next())
             {
                 PassNameTb.setText(Rs.getString("PName"));
                 GenTb.setText(Rs.getString("PGen"));
                 PassNumTb.setText(Rs.getString("PPass"));
                NationalityTb.setText(Rs.getString("PNat"));
             }  
         }catch(Exception e)
         {
             
         } 
         
     }  
     private void GetFlights()
       {
          try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                St=Con.createStatement();
                String Query="select * from FlightTbl";
                Rs=St.executeQuery(Query);
                while(Rs.next())
                {
                    String FCode=String.valueOf(Rs.getInt("FlCode"));
                    FCodeCb.addItem(FCode);
                }    
              
          }catch(Exception e)
          {
              
          } 
          
       }    
     private void DisplayBooking()
      {
           try{
               Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
               St=Con.createStatement();
               Rs=St.executeQuery("select * from BookingTbl");
               BookingTable.setModel(DbUtils.resultSetToTableModel(Rs));
           }catch(Exception e)
           {
                
           }  
      }  
      int TId=0;
      private void CountFlights()
      {
           try{
               St1=Con.createStatement();
               Rs1=St1.executeQuery("select Max(TicketId) from BookingTbl");
               Rs1.next();
               TId=Rs1.getInt(1)+1;
           }catch(Exception e)
           {
               
           }
          
      }  
    
               
    private void BookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookBtnMouseClicked
          if(PassIdCb.getSelectedIndex()== -1|| FCodeCb.getSelectedIndex() == -1 || AmountTb.getText().isEmpty())
             {
                  JOptionPane.showMessageDialog(this,"Missing InforMation");
                      
             }else{
                    try{
                          CountFlights();
                         
                          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","root");
                          PreparedStatement Add=Con.prepareStatement("insert into BookingTbl values(?,?,?,?,?,?,?)");
                          Add.setInt(1,TId);
                          Add.setString(2, PassNameTb.getText());
                          Add.setString(3,FCodeCb.getSelectedItem().toString());
                          Add.setString(4,GenTb.getText());
                          Add.setString(5,PassNumTb.getText());
                           Add.setInt(6,Integer.valueOf(AmountTb.getText())); 
                          Add.setString(7,NationalityTb.getText());
                          int row=Add.executeUpdate();
                          JOptionPane.showMessageDialog(this,"Ticket Booked");
                          Con.close();
                          DisplayBooking(); 
                          Clear();
                    }catch(Exception e)
                    {
                     JOptionPane.showMessageDialog(this, e);
                    }     
                     
             }       
             
        
    }//GEN-LAST:event_BookBtnMouseClicked

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
        
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
          new MainForm().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
     private void Clear()
     {
           FCodeCb.setSelectedIndex(-1);
               // PassIdCb.setSelectedIndex(-1);
                PassNameTb.setText(" ");
                PassNumTb.setText(" ");
                GenTb.setText(" ");
                NationalityTb.setText(" ");
                AmountTb.setText(" ");
         
     }  
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
                Clear();
    }//GEN-LAST:event_ResetBtnMouseClicked

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JTable BookingTable;
    private javax.swing.JComboBox<String> FCodeCb;
    private javax.swing.JTextField GenTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox<String> PassIdCb;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
