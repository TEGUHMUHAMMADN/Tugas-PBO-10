/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas10;

/**
 *
 * @author USER
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InputNilai extends javax.swing.JFrame {
    DefaultTableModel modelmahasiswa;
    Inputdata datamahasiswa;
    
    /**
     * Creates new form InputNilaiMahasiwa
     */
    public InputNilai() {
        initComponents();
        datamahasiswa = new Inputdata();
        viewDataTable();
    }
    
    public final void viewDataTable(){
        String[] namaKolom = {"NIM", "Nama", "Alamat","MataKuliah", "Nilai Akhir"};
        Object[][] objekMahasiswa = new Object[datamahasiswa.getALL().size()][5];
        
        int i = 0;
        for (Mahasiswa mhs : datamahasiswa.getALL()){
            objekMahasiswa[i][0] = mhs.getNIM();
            objekMahasiswa[i][1] = mhs.getNama();
            objekMahasiswa[i][2] = mhs.getAlamat();
            objekMahasiswa[i][3] = mhs.getMataKuliah();
            objekMahasiswa[i][4] = mhs.getNilaiAkhir();
            i++;
        }
        
        modelmahasiswa = new DefaultTableModel(objekMahasiswa, namaKolom);
        mahasiswaTB.setModel(modelmahasiswa);
    };
    
    public void ClearTextField(){
        nimINPUT.setText("");
        namaINPUT.setText("");
        alamatINPUT.setText("");
        matakuliahINPUT.setText("");
        nimINPUT.requestFocus();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nimINPUT = new javax.swing.JTextField();
        namaINPUT = new javax.swing.JTextField();
        alamatINPUT = new javax.swing.JTextField();
        matakuliahINPUT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nilai1TF = new javax.swing.JTextField();
        nilai2TF = new javax.swing.JTextField();
        nilai3TF = new javax.swing.JTextField();
        nilai4TF = new javax.swing.JTextField();
        nilai5TF = new javax.swing.JTextField();
        nilaiakhirTF = new javax.swing.JTextField();
        simpanBT = new javax.swing.JButton();
        hapusBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mahasiswaTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NIM");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alamat");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mata Kuliah");

        nimINPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimINPUTActionPerformed(evt);
            }
        });

        alamatINPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatINPUTActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nilai 1 [10%]");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nilai 2 [15%]");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nilai 3-UTS[25%]");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nilai 4 [15%]");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nilai 5 [35%]");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nilai Akhir");

        nilai1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai1TFActionPerformed(evt);
            }
        });

        nilai2TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai2TFActionPerformed(evt);
            }
        });

        nilai4TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai4TFActionPerformed(evt);
            }
        });

        nilai5TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilai5TFActionPerformed(evt);
            }
        });

        nilaiakhirTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiakhirTFActionPerformed(evt);
            }
        });

        simpanBT.setBackground(new java.awt.Color(255, 255, 255));
        simpanBT.setForeground(new java.awt.Color(0, 0, 0));
        simpanBT.setText("Simpan");
        simpanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBTActionPerformed(evt);
            }
        });

        hapusBT.setBackground(new java.awt.Color(255, 255, 255));
        hapusBT.setForeground(new java.awt.Color(0, 0, 0));
        hapusBT.setText("Hapus");
        hapusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTActionPerformed(evt);
            }
        });

        mahasiswaTB.setBackground(new java.awt.Color(255, 255, 255));
        mahasiswaTB.setForeground(new java.awt.Color(0, 0, 0));
        mahasiswaTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Alamat", "Mata Kuliah"
            }
        ));
        mahasiswaTB.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(mahasiswaTB);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nimINPUT)
                            .addComponent(namaINPUT)
                            .addComponent(alamatINPUT)
                            .addComponent(matakuliahINPUT, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpanBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(hapusBT)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nilai2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilai1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilai3TF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilai4TF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilai5TF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nilaiakhirTF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nimINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(nilai1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(nilai2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamatINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(nilai3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matakuliahINPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nilai4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nilai5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(nilaiakhirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpanBT)
                            .addComponent(hapusBT))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
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

    private void alamatINPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatINPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatINPUTActionPerformed

    private void nimINPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimINPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimINPUTActionPerformed

    private void hapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTActionPerformed
         int selectedRow = mahasiswaTB.getSelectedRow();
           if (selectedRow != -1) {  // Check if a row is selected
               datamahasiswa.deleteData(selectedRow);
               viewDataTable();
               ClearTextField();
    } else {
        JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
    }
           
    }//GEN-LAST:event_hapusBTActionPerformed

    private void simpanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBTActionPerformed
       String nim = nimINPUT.getText();
       String nama = namaINPUT.getText();
       String alamat = alamatINPUT.getText();
       String mataKuliah = matakuliahINPUT.getText();
       
        if (nim.length() != 13) {
        JOptionPane.showMessageDialog(this, "NIM harus terdiri dari 13 angka!", "Error", JOptionPane.ERROR_MESSAGE);
        nimINPUT.requestFocus();
        return;
    }

    try {
        double nilai1 = Double.parseDouble(nilai1TF.getText());
        double nilai2 = Double.parseDouble(nilai2TF.getText());
        double nilai3 = Double.parseDouble(nilai3TF.getText());
        double nilai4 = Double.parseDouble(nilai4TF.getText());
        double nilai5 = Double.parseDouble(nilai5TF.getText());

        datamahasiswa.insertData(nim, nama, alamat, mataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        viewDataTable();
        ClearTextField();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Pastikan semua nilai diisi dengan benar!", "Error", JOptionPane.ERROR_MESSAGE);
        // Optionally, you could focus on the first invalid text field here.
    }
    
    }//GEN-LAST:event_simpanBTActionPerformed

    private void nilai1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai1TFActionPerformed

    private void nilai2TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai2TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai2TFActionPerformed

    private void nilai4TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai4TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai4TFActionPerformed

    private void nilai5TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilai5TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilai5TFActionPerformed

    private void nilaiakhirTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiakhirTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nilaiakhirTFActionPerformed

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
            java.util.logging.Logger.getLogger(InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputNilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatINPUT;
    private javax.swing.JButton hapusBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTable mahasiswaTB;
    private javax.swing.JTextField matakuliahINPUT;
    private javax.swing.JTextField namaINPUT;
    private javax.swing.JTextField nilai1TF;
    private javax.swing.JTextField nilai2TF;
    private javax.swing.JTextField nilai3TF;
    private javax.swing.JTextField nilai4TF;
    private javax.swing.JTextField nilai5TF;
    private javax.swing.JTextField nilaiakhirTF;
    private javax.swing.JTextField nimINPUT;
    private javax.swing.JButton simpanBT;
    // End of variables declaration//GEN-END:variables

}
