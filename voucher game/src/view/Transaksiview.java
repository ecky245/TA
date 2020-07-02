package view;

import controller.transaksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.owner;
import model.barang;
import model.detail_transaksi;
import model.pembeli;



public class Transaksiview extends javax.swing.JFrame {
private transaksi transaksi;
private ArrayList<detail_transaksi> arrKeranjang;
private ArrayList<owner> arrKeranjang1;
private ArrayList<pembeli> arrKeranjang2;
private Double hargatotal;



    public Transaksiview() throws SQLException {
        initComponents();
        hargatotal = 0.0;
        transaksi = new transaksi();
        arrKeranjang = new ArrayList<>();
        arrKeranjang1 = new ArrayList<>();
        arrKeranjang2 = new ArrayList<>();
        showTableKeranjang();
        showTableIdentitas();
        showTableIdentitas1();
        showComboBoxOwner();
        showComboBoxIdo();
        showComboBoxPembeli();
        showComboBoxIdp();
        showComboBoxBarang();
        showComboBoxIdb();
        showComboBoxIdT();
        showComboBoxIdTG();
        
    }
    
 public void showTableKeranjang() {
        DefaultTableModel dtmKeranjang = new DefaultTableModel(new String[]{"ID Barang", "ID Transaksi",
            "Total Harga", "Tanggal Transaksi"}, 0);
        for (detail_transaksi dt : arrKeranjang) {
            dtmKeranjang.addRow(new String[]{dt.getId_barang().toString(),
                dt.getId_transaksi().toString(),dt.gettotal_harga().toString(),dt.gettgl_transaksi().toString()
            });
        }
        tblkeranjang.setModel(dtmKeranjang);
    }
 public void showTableIdentitas() {
        DefaultTableModel dtmIdentitas = new DefaultTableModel(new String[]{"ID Owner", "Owner"}, 0);
        for (owner ow : arrKeranjang1) {
            dtmIdentitas.addRow(new String[]{ow.getId_owner().toString(),
                ow.getusername_owner().toString()
            });
        }
        tblidentitas.setModel(dtmIdentitas);
    }
 public void showTableIdentitas1() {
        DefaultTableModel dtmIdentitas1 = new DefaultTableModel(new String[]{"ID Pembeli", "Pembeli"}, 0);
        for (pembeli pb : arrKeranjang2) {
            dtmIdentitas1.addRow(new String[]{pb.getId_pembeli().toString(),
                pb.getusername_pembeli()
            });
        }
        tblidentitas1.setModel(dtmIdentitas1);
    }
    
  public void showComboBoxOwner() throws SQLException {
        DefaultComboBoxModel dcbmowner = new DefaultComboBoxModel();
        for (owner ow : transaksi.getDataOwner()) {
            dcbmowner.addElement(ow.getusername_owner());
        }
        cbowner.setModel(dcbmowner);
    }
 
  public void showComboBoxIdo() throws SQLException {
        DefaultComboBoxModel dcbmowner = new DefaultComboBoxModel();
        for (owner ow : transaksi.getDataOwner()) {
            dcbmowner.addElement(ow.getId_owner());
        }
        cbido.setModel(dcbmowner);
    }
 
 public void showComboBoxPembeli() throws SQLException {
        DefaultComboBoxModel dcbmpembeli = new DefaultComboBoxModel();
        for (pembeli p : transaksi.getDataPembeli()) {
            dcbmpembeli.addElement(p.getusername_pembeli());
        }
        cbpembeli.setModel(dcbmpembeli);
    }
 
  public void showComboBoxIdp() throws SQLException {
        DefaultComboBoxModel dcbmpembeli = new DefaultComboBoxModel();
        for (pembeli p : transaksi.getDataPembeli()) {
            dcbmpembeli.addElement(p.getId_pembeli());
        }
        cbidp.setModel(dcbmpembeli);
    }
  
  public void showComboBoxBarang() throws SQLException {
        DefaultComboBoxModel dcbmbarang = new DefaultComboBoxModel();
        for (barang b : transaksi.getDataBarang()) {
            dcbmbarang.addElement(b.getnama_voucher());
        }
        cbbarang.setModel(dcbmbarang);
    }
  
public void showComboBoxIdb() throws SQLException {
        DefaultComboBoxModel dcbmbarang = new DefaultComboBoxModel();
        for (barang b : transaksi.getDataBarang()) {
            dcbmbarang.addElement(b.getId_barang());
        }
        cdmidb.setModel(dcbmbarang);
}
public void showComboBoxIdT() throws SQLException {
        DefaultComboBoxModel dcbmTransaksi = new DefaultComboBoxModel();
        for (detail_transaksi dt  : transaksi.getDatadetail()) {
            dcbmTransaksi.addElement(dt.getId_transaksi());
        }
        cbmt.setModel(dcbmTransaksi);
}
public void showComboBoxIdTG() throws SQLException {
        DefaultComboBoxModel dcbmTransaksi = new DefaultComboBoxModel();
        for (detail_transaksi dt  : transaksi.getDatadetail()) {
            dcbmTransaksi.addElement(dt.gettgl_transaksi());
            
        }
        cbmtgl.setModel(dcbmTransaksi);
}

 private void jButton1ActionPerformed (java.awt.event.ActionEvent evt) {                                         
         owner o = new owner();
        try {
            o.setOwner(transaksi.getDataOwner().get(cbowner.getSelectedIndex()));
            
        }catch (SQLException ex) {
            Logger.getLogger(Transaksiview.class.getName()).log(Level.SEVERE, null, ex);
                      
    }                                        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblkeranjang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbido = new javax.swing.JComboBox<>();
        cbidp = new javax.swing.JComboBox<>();
        cdmidb = new javax.swing.JComboBox<>();
        cbowner = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblidentitas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblidentitas1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cbbarang = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        cbpembeli = new javax.swing.JComboBox<>();
        cbmt = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbmtgl = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblkeranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblkeranjang);

        jLabel1.setText("Nama Owner");

        jLabel2.setText("ID");

        jLabel3.setText("ID");

        jLabel4.setText("Nama pembeli");

        jLabel5.setText("ID");

        jLabel6.setText("Nama Barang");

        jLabel8.setText("Tanggal Transaksi");

        cbido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbidp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cdmidb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbowner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblidentitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblidentitas);

        tblidentitas1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblidentitas1);

        jButton2.setText("Insert");

        cbbarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton3.setText("Insert");

        cbpembeli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbmt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("ID Transaksi");

        cbmtgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(250, 100, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("VOUCHER GAME ONLINE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jButton1.setText("Insert");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbarang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cdmidb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addComponent(cbmtgl, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2)
                                        .addComponent(cbido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbowner, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbowner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbpembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cdmidb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbmtgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * @param args   **/ 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        } 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbarang;
    private javax.swing.JComboBox<String> cbido;
    private javax.swing.JComboBox<String> cbidp;
    private javax.swing.JComboBox<String> cbmt;
    private javax.swing.JComboBox<String> cbmtgl;
    private javax.swing.JComboBox<String> cbowner;
    private javax.swing.JComboBox<String> cbpembeli;
    private javax.swing.JComboBox<String> cdmidb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblidentitas;
    private javax.swing.JTable tblidentitas1;
    private javax.swing.JTable tblkeranjang;
    // End of variables declaration//GEN-END:variables

}
