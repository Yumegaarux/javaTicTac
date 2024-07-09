import javax.swing.JButton;

public class TicTacToe extends javax.swing.JFrame {
    public TicTacToe() {
        initComponents();
    }
    int[] p1SelectedTiles = new int[9]; 
    int[] p2SelectedTiles = new int[8];
    int p1TileCount = 0, p2TileCount = 0;
    int[][] winningTiles = {{0,1,2} , {0,3,6} , {0,4,8},
                            {3,4,5} , {1,4,7} , {6,4,2},
                            {6,7,8} , {2,5,8}};
    int move = 1;
    boolean isRunning = true;
    void selectTile(int selectedTile, JButton button, int move){
        addTile(selectedTile, button, move);
    }
    
    void addTile(int selectedTile, JButton button, int move){
        if (move % 2 != 0){
            if(!checkUsedTile(selectedTile, p1SelectedTiles)&& 
               !checkUsedTile(selectedTile, p2SelectedTiles)){
                p1SelectedTiles[p1TileCount++] = selectedTile;
                checkWinner(p1SelectedTiles);
                button.setText("X");
                this.move++;
            }
            else{
                System.out.println("Tile Already Used");
            }
        }else{
            if(!checkUsedTile(selectedTile, p1SelectedTiles)&& 
               !checkUsedTile(selectedTile, p2SelectedTiles)){
                p2SelectedTiles[p1TileCount++] = selectedTile;
                checkWinner(p2SelectedTiles);
                button.setText("O");
                this.move++;
            }
            else{
                System.out.println("Tile Already Used");
            }
        }
    }
    
    void checkWinner(int[] playerSelectedTiles){
    }
    
    boolean checkUsedTile(int selectedTile, int[] playerSelectedTiles){
        boolean used = false;
        if (playerSelectedTiles != null){
            for(int i = 0; i <= playerSelectedTiles.length - 1 ; i++){
                if(selectedTile == playerSelectedTiles[i]){
                    used = true;
                }
            }
        }
        return used;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tile = new javax.swing.JButton();
        tile1 = new javax.swing.JButton();
        tile2 = new javax.swing.JButton();
        tile3 = new javax.swing.JButton();
        tile4 = new javax.swing.JButton();
        tile5 = new javax.swing.JButton();
        tile6 = new javax.swing.JButton();
        tile7 = new javax.swing.JButton();
        tile8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        tile.setBackground(new java.awt.Color(255, 255, 255));
        tile.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile.setForeground(new java.awt.Color(0, 0, 0));
        tile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileActionPerformed(evt);
            }
        });

        tile1.setBackground(new java.awt.Color(255, 255, 255));
        tile1.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile1.setForeground(new java.awt.Color(0, 0, 0));
        tile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile1ActionPerformed(evt);
            }
        });

        tile2.setBackground(new java.awt.Color(255, 255, 255));
        tile2.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile2.setForeground(new java.awt.Color(0, 0, 0));
        tile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile2ActionPerformed(evt);
            }
        });

        tile3.setBackground(new java.awt.Color(255, 255, 255));
        tile3.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile3.setForeground(new java.awt.Color(0, 0, 0));
        tile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile3ActionPerformed(evt);
            }
        });

        tile4.setBackground(new java.awt.Color(255, 255, 255));
        tile4.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile4.setForeground(new java.awt.Color(0, 0, 0));
        tile4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile4ActionPerformed(evt);
            }
        });

        tile5.setBackground(new java.awt.Color(255, 255, 255));
        tile5.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile5.setForeground(new java.awt.Color(0, 0, 0));
        tile5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile5ActionPerformed(evt);
            }
        });

        tile6.setBackground(new java.awt.Color(255, 255, 255));
        tile6.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile6.setForeground(new java.awt.Color(0, 0, 0));
        tile6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile6ActionPerformed(evt);
            }
        });

        tile7.setBackground(new java.awt.Color(255, 255, 255));
        tile7.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile7.setForeground(new java.awt.Color(0, 0, 0));
        tile7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile7ActionPerformed(evt);
            }
        });

        tile8.setBackground(new java.awt.Color(255, 255, 255));
        tile8.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        tile8.setForeground(new java.awt.Color(0, 0, 0));
        tile8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tile8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tile, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tile6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileActionPerformed
        selectTile(1,tile, move);
    }//GEN-LAST:event_tileActionPerformed

    private void tile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile1ActionPerformed
        selectTile(2,tile1, move);
    }//GEN-LAST:event_tile1ActionPerformed

    private void tile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile2ActionPerformed
        selectTile(3,tile2, move);
    }//GEN-LAST:event_tile2ActionPerformed

    private void tile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile3ActionPerformed
       selectTile(4,tile3, move);
    }//GEN-LAST:event_tile3ActionPerformed

    private void tile4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile4ActionPerformed
        selectTile(5,tile4, move);
    }//GEN-LAST:event_tile4ActionPerformed

    private void tile5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile5ActionPerformed
        selectTile(6,tile5, move);
    }//GEN-LAST:event_tile5ActionPerformed

    private void tile6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile6ActionPerformed
        selectTile(7,tile6, move);
    }//GEN-LAST:event_tile6ActionPerformed

    private void tile7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile7ActionPerformed
        selectTile(8,tile7, move);
    }//GEN-LAST:event_tile7ActionPerformed

    private void tile8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tile8ActionPerformed
        selectTile(9,tile8, move);
    }//GEN-LAST:event_tile8ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton tile;
    private javax.swing.JButton tile1;
    private javax.swing.JButton tile2;
    private javax.swing.JButton tile3;
    private javax.swing.JButton tile4;
    private javax.swing.JButton tile5;
    private javax.swing.JButton tile6;
    private javax.swing.JButton tile7;
    private javax.swing.JButton tile8;
    // End of variables declaration//GEN-END:variables
}
