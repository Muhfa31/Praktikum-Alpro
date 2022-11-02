package projekuas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class kasir extends javax.swing.JFrame {
    
    int bayar, beli, harga;
    
    private static Connection koneksi;
    
    private void kosongkan_form(){
    txtkode.setEditable(true);
    txtkode.setText(null);
    txtproduk.setText(null);
    txtharga.setText(null);
    txtbeli.setText(null);
    txttotal.setText(null);
}

    public kasir() {
        initComponents();
    }
    
    public void koneksidatabase(){
    try{
        koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/buah","root","");
    }catch(Exception e){
        System.err.println("Excepton:"+e.getMessage());
    }
}
    
    public static Connection koneksiDB() throws SQLException{
        if(koneksi == null){
            try{
                String DB = "jdbc:mysql://localhost:3306/buah";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(DB, user, pass);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Gagal Koneksi");
            }
        }
        return koneksi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtproduk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbcari = new javax.swing.JButton();
        jbbatal = new javax.swing.JButton();
        jbkeluar = new javax.swing.JButton();
        txtkode = new javax.swing.JTextField();
        txtbeli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbtotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kode Produk");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 86, -1, -1));

        jLabel2.setText("Nama Produk");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, -1, -1));
        getContentPane().add(txtproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 120, 250, -1));

        jLabel3.setText("Harga (per kg)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 164, -1, -1));
        getContentPane().add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 160, 250, -1));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("KASIR TOKO BUAH BADAK JAYA");
        jLabel4.setMaximumSize(new java.awt.Dimension(70, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 20));

        jLabel5.setText("Oleh : Taufik Ardiansyah Putra  &  Muhammad Faza Abdillah");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 380, -1));

        jbcari.setText("Cari ");
        jbcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcariActionPerformed(evt);
            }
        });
        getContentPane().add(jbcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 83, -1));

        jbbatal.setText("Batal");
        jbbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbatalActionPerformed(evt);
            }
        });
        getContentPane().add(jbbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 83, -1));

        jbkeluar.setText("Keluar");
        jbkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(jbkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 83, -1));
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 82, 250, -1));
        getContentPane().add(txtbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 206, 40, -1));

        jLabel7.setText("Jumlah Beli (kg)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 210, -1, -1));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 206, 130, -1));

        jLabel8.setText("Total Harga");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jbtotal.setText("Total");
        jbtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtotalActionPerformed(evt);
            }
        });
        getContentPane().add(jbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 83, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
          
    private void jbcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcariActionPerformed
        koneksidatabase();
        try{
            String cari = JOptionPane.showInputDialog("Masukkan Kode Produk");
            Statement statement = koneksi.createStatement();
            String sql = "select*from data_buah where kode_produk like'"+cari+"'";
            ResultSet rs = statement.executeQuery(sql);
            if(rs.next()){
                txtkode.setText(rs.getString(1));
                txtproduk.setText(rs.getString(2));
                txtharga.setText(rs.getString(3));
        }else{
                JOptionPane.showMessageDialog(null, "Data tidak ada di database");
                }
        statement.close();
        koneksi.close(); 
        }catch(Exception ex){
            System.out.println("Error:"+ex);
}
    }//GEN-LAST:event_jbcariActionPerformed
    
    
    private void jbkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbkeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbkeluarActionPerformed

    private void jbbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbatalActionPerformed
        kosongkan_form();
    }//GEN-LAST:event_jbbatalActionPerformed

    private void jbtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtotalActionPerformed
        harga = Integer.parseInt(txtharga.getText());
        beli = Integer.parseInt(txtbeli.getText());
        
        bayar = harga*beli;
        
        txttotal.setText("Rp " + Integer.toString(bayar));
    }//GEN-LAST:event_jbtotalActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbbatal;
    private javax.swing.JButton jbcari;
    private javax.swing.JButton jbkeluar;
    private javax.swing.JButton jbtotal;
    private javax.swing.JTextField txtbeli;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtproduk;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
