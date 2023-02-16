
package game;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricky Williams
 */
public class guessWord extends javax.swing.JFrame {

    /**
     * Creates new form guessWord
     */
    public String TW;
    
    public guessWord() {
     
        initComponents();
    }
    public guessWord(String mm, String hint) {
         initComponents();
        setTitle("Word Guesser");  
        try{
        jLabel1.setText(mm.toString()); 
        jLabel1.setVisible(false);
        //getting the length of the given word and displaying it. 
        lblCount.setText("Letter Count: "+mm.length());
        
        lblHint.setText("Hint: "+ hint); 
        
        TW = mm;
        }catch(Exception e){
       JOptionPane.showMessageDialog(null,"eroorrr:" + e,"Error Message",JOptionPane.WARNING_MESSAGE);
      }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCount = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();
        txtGuess = new javax.swing.JTextField();
        btnGuess = new javax.swing.JButton();
        btnGive = new javax.swing.JButton();
        lblLife = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeading1.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        lblHeading1.setText("Player 2 (Guesser)");

        jLabel1.setText("Show data");
        jLabel1.setEnabled(false);

        lblCount.setText("jLabel2");

        lblHint.setText("jLabel2");

        btnGuess.setBackground(new java.awt.Color(0, 0, 0));
        btnGuess.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnGuess.setForeground(new java.awt.Color(255, 255, 255));
        btnGuess.setText("GUESS");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        btnGive.setBackground(new java.awt.Color(255, 0, 51));
        btnGive.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        btnGive.setForeground(new java.awt.Color(255, 255, 255));
        btnGive.setText("Give Up");
        btnGive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveActionPerformed(evt);
            }
        });

        lblLife.setText("3");

        jLabel2.setText("Lives:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHeading1)))
                .addGap(97, 97, 97)
                .addComponent(btnGive)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblLife, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHeading1)
                        .addComponent(btnGive))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(txtGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuess)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLife)
                    .addComponent(jLabel2))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
     
        try{
      String g =  txtGuess.getText().toString(); // getting word from textbox for the guess
      int life = 3; // number of lives 
     
      // checking if word guessed to the same as the word entered
      if(g.equals(TW)){
          setVisible(false);//closing current window  
          winner w = new winner();//Creating object for winner window.
          w.setVisible(true);
      }
      // else if word is not the same as the word entered 
      else if(!g.equals(TW)){
          // checking if user still has lives 
           if(Integer.parseInt(lblLife.getText())==1){
               setVisible(false);//closing current window
               String w = jLabel1.getText();
              new loser(w).setVisible(true);// opening new window (loser)
          }
           //if user still has lives 
           else{
          //clear text box
          txtGuess.setText("");
          // take away one life and update lives on window
          life = Integer.parseInt(lblLife.getText())-1;
          lblLife.setText(String.valueOf(life));
          
          //message to tell user guess is incorrect 
          JOptionPane.showMessageDialog(null,"Incorrect guess! Try again","Incorrect",JOptionPane.WARNING_MESSAGE);
         }
      }
        }catch(Exception e){
       JOptionPane.showMessageDialog(null,"eroorrr:" + e,"Error Message",JOptionPane.WARNING_MESSAGE);
      }
          
      
    }//GEN-LAST:event_btnGuessActionPerformed

    private void btnGiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveActionPerformed
        try{
        System.exit(0); // exitting program
        }catch(Exception e){
       JOptionPane.showMessageDialog(null,"eroorrr:" + e,"Error Message",JOptionPane.WARNING_MESSAGE);
      }
    }//GEN-LAST:event_btnGiveActionPerformed

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
            java.util.logging.Logger.getLogger(guessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guessWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGive;
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblHeading1;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblLife;
    private javax.swing.JTextField txtGuess;
    // End of variables declaration//GEN-END:variables
}
