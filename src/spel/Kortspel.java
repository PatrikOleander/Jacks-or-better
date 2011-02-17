/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Kortspel.java
 *
 * Created on 2011-jan-30, 19:22:31
 */
package spel;

public class Kortspel extends javax.swing.JFrame {

    int nummer = 0;
    String s;
    int bet = 0;
    String d;
    String h;
    String insattning;
    String insattning2;

    private Buttons b1;

    public  Kortspel(Buttons b1, String insattning) {
        initComponents();
        this.b1 = b1;
        this.insattning2 = insattning;
        konto.setText(insattning2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        betMoreButton = new javax.swing.JButton();
        betMaxButton = new javax.swing.JButton();
        DrawButton = new javax.swing.JButton();
        betting = new javax.swing.JLabel();
        bettLessButton = new javax.swing.JButton();
        konto = new javax.swing.JLabel();
        card1 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        keep1 = new javax.swing.JToggleButton();
        keep2 = new javax.swing.JToggleButton();
        keep3 = new javax.swing.JToggleButton();
        keep4 = new javax.swing.JToggleButton();
        keep5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        betMoreButton.setText("Bet");
        betMoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betMoreButtonActionPerformed(evt);
            }
        });

        betMaxButton.setText("Bet max");
        betMaxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betMaxButtonActionPerformed(evt);
            }
        });

        DrawButton.setText("Draw");
        DrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawButtonActionPerformed(evt);
            }
        });

        betting.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        betting.setText("Bet: 0");

        bettLessButton.setText("Bett less");
        bettLessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bettLessButtonActionPerformed(evt);
            }
        });

        konto.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        konto.setText("Konto: 0");

        card1.setIcon(new javax.swing.ImageIcon("/Users/Patrik/Downloads/Lecture2/src/cards/25.png")); // NOI18N

        card2.setIcon(new javax.swing.ImageIcon("/Users/Patrik/Downloads/Lecture2/src/cards/25.png")); // NOI18N

        card3.setIcon(new javax.swing.ImageIcon("/Users/Patrik/Downloads/Lecture2/src/cards/25.png")); // NOI18N

        card4.setIcon(new javax.swing.ImageIcon("/Users/Patrik/Downloads/Lecture2/src/cards/25.png")); // NOI18N

        card5.setIcon(new javax.swing.ImageIcon("/Users/Patrik/Downloads/Lecture2/src/cards/25.png")); // NOI18N

        keep1.setText("Behåll");
        keep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keep1ActionPerformed(evt);
            }
        });

        keep2.setText("Behåll");

        keep3.setText("Behåll");

        keep4.setText("Behåll");

        keep5.setText("Behåll");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(141, 141, 141)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(betting, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 135, Short.MAX_VALUE)
                        .add(konto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(110, 110, 110))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(betMoreButton)
                            .add(bettLessButton)
                            .add(layout.createSequentialGroup()
                                .add(betMaxButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(136, 136, 136)
                                .add(DrawButton))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(card1)
                                    .add(keep1))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(card2)
                                        .add(18, 18, 18)
                                        .add(card3)
                                        .add(18, 18, 18)
                                        .add(card4))
                                    .add(layout.createSequentialGroup()
                                        .add(keep2)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(keep3)
                                        .add(18, 18, 18)
                                        .add(keep4)))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(keep5)
                                    .add(card5))))
                        .addContainerGap(214, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(94, 94, 94)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(card1)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(card4)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(card3)
                                    .add(card2))))
                        .add(26, 26, 26)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(keep1)
                            .add(keep2)
                            .add(keep3)
                            .add(keep4)
                            .add(keep5)))
                    .add(card5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(konto, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(betting, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 101, Short.MAX_VALUE)
                .add(betMoreButton)
                .add(4, 4, 4)
                .add(bettLessButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(betMaxButton)
                    .add(DrawButton))
                .add(177, 177, 177))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    private void betMoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betMoreButtonActionPerformed
        s = this.b1.betMore();
        betting.setText("Bet: "+s);
    }//GEN-LAST:event_betMoreButtonActionPerformed

    private void betMaxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betMaxButtonActionPerformed
        s = this.b1.betMax();
        betting.setText("Bet: "+s);
    }//GEN-LAST:event_betMaxButtonActionPerformed

    private void bettLessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bettLessButtonActionPerformed
        s = this.b1.betLess();
        betting.setText("Bet: "+s);
    }//GEN-LAST:event_bettLessButtonActionPerformed

    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
        
        insattning2 = this.b1.drawButton(insattning2);
        konto.setText("Konto: "+insattning2);
    }//GEN-LAST:event_DrawButtonActionPerformed

    private void keep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keep1ActionPerformed

    }//GEN-LAST:event_keep1ActionPerformed





    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            Inmatning t1 = new Inmatning();
            Buttons b1 = new Buttons();
            String insattning = t1.kontoInsättning();
            public void run() {
                insattning = b1.drawButton(insattning);
                Kortspel k = new Kortspel(b1, insattning);
                k.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DrawButton;
    private javax.swing.JButton betMaxButton;
    private javax.swing.JButton betMoreButton;
    private javax.swing.JButton bettLessButton;
    private javax.swing.JLabel betting;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JToggleButton keep1;
    private javax.swing.JToggleButton keep2;
    private javax.swing.JToggleButton keep3;
    private javax.swing.JToggleButton keep4;
    private javax.swing.JToggleButton keep5;
    private javax.swing.JLabel konto;
    // End of variables declaration//GEN-END:variables
}
