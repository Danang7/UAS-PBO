/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penerimaanMHSBaru;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import models.modelspenerimaan;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author user
 */
public class formpenerimaan extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/penerimaanmhs";
    static final String USER = "root";
    static final String PASS = "";

    List<modelspenerimaan> items = new ArrayList<>();
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    /**
     * Creates new form formpenerimaan
     */
    public formpenerimaan() {
        initComponents();
        showTableData();
        tblEdit.setEnabled(false);
        tblHapus.setEnabled(false);
        tblKeluar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNISN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttgl_lhr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttmpt_lhr = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAgama = new javax.swing.JTextField();
        txtno_Telp = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        tblSimpan = new javax.swing.JButton();
        tblEdit = new javax.swing.JButton();
        tblHapus = new javax.swing.JButton();
        tblKeluar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        prodi = new javax.swing.JComboBox<>();
        genderBox = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPenerimaan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Form Penerimaan Mahasiswa");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel3.setText("NISN");

        jLabel4.setText("Program Studi");

        txttgl_lhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttgl_lhrActionPerformed(evt);
            }
        });

        jLabel5.setText("Jenis kelamin");

        txttmpt_lhr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttmpt_lhrActionPerformed(evt);
            }
        });

        jLabel6.setText("Tanggal Lahir");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Fakultas Ilmu komputer");

        jLabel8.setText("Tempat lahir");

        jLabel9.setText("Alamat");

        jLabel10.setText("No_telp");

        jLabel11.setText("Email");

        jLabel12.setText("Agama");

        txtAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgamaActionPerformed(evt);
            }
        });

        txtno_Telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtno_TelpActionPerformed(evt);
            }
        });

        tblSimpan.setText("Simpan");
        tblSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblSimpanActionPerformed(evt);
            }
        });

        tblEdit.setText("Edit");
        tblEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblEditActionPerformed(evt);
            }
        });

        tblHapus.setText("Hapus");
        tblHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblHapusActionPerformed(evt);
            }
        });

        tblKeluar.setText("Keluar");
        tblKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblKeluarActionPerformed(evt);
            }
        });

        prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S-1 Teknik Informatika", "S-1 Sistem Informasi", "S-1 Desain Komunikas Visual", "S-1 Animasi", "S-1 Ilmu Komunikasi", "D-4 Film dan Televisi", "D-3 Teknik Informatika", " " }));
        prodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodiActionPerformed(evt);
            }
        });

        genderBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TabelPenerimaan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        TabelPenerimaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPenerimaanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelPenerimaan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(txttmpt_lhr, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttgl_lhr, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel12))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel10))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtno_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(tblSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(tblEdit)
                                .addGap(18, 18, 18)
                                .addComponent(tblHapus)
                                .addGap(109, 109, 109)
                                .addComponent(tblKeluar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txttmpt_lhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttgl_lhr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtno_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tblSimpan)
                    .addComponent(tblEdit)
                    .addComponent(tblHapus)
                    .addComponent(tblKeluar))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addGap(521, 521, 521))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txttgl_lhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttgl_lhrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttgl_lhrActionPerformed

    private void txttmpt_lhrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttmpt_lhrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttmpt_lhrActionPerformed

    private void txtAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgamaActionPerformed

    private void txtno_TelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtno_TelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtno_TelpActionPerformed

    private void tblSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSimpanActionPerformed
        // TODO add your handling code here:
        String namamhsbaru = txtNama.getText();
        int NISN = Integer.parseInt(txtNISN.getText());
        String tanggal_lahir = txttgl_lhr.getText();
        String tempat_lahir = txttmpt_lhr.getText();
        String alamat = txtAlamat.getText();
        int no_telp = Integer.parseInt(txtno_Telp.getText());
        String email = txtEmail.getText();
        String program_studi = prodi.getSelectedItem().toString();
        String agama = txtAgama.getText();
        String gender = genderBox.getSelectedItem().toString();
        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "INSERT INTO formpenerimaan (nama, NISN, tanggal_lahir, tempat_lahir, alamat, no_telp, email, program_studi, agama, gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, namamhsbaru);
            ps.setInt(2, NISN);
            ps.setString(3, tanggal_lahir);
            ps.setString(4, tempat_lahir);
            ps.setString(5, alamat);
            ps.setInt(6, no_telp);
            ps.setString(7, email);
            ps.setString(8, program_studi);
            ps.setString(9, agama);
            ps.setString(10, gender);

            ps.executeUpdate();
            txtid.setVisible(false);

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        showTableData();
    }//GEN-LAST:event_tblSimpanActionPerformed

    private void tblEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblEditActionPerformed
        // TODO add your handling code here:
        String nama = txtNama.getText();
        int id = Integer.parseInt(txtid.getText());
        int NISN = Integer.parseInt(txtNISN.getText());
        String tanggal_lahir = txttgl_lhr.getText();
        String tempat_lahir = txttmpt_lhr.getText();
        String alamat = txtAlamat.getText();
        int no_telp = Integer.parseInt(txtno_Telp.getText());
        String email = txtEmail.getText();
        String program_studi = prodi.getSelectedItem().toString();
        String agama = txtAgama.getText();
        String gender = genderBox.getSelectedItem().toString();
        
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE formpenerimaan SET nama=?, NISN=? ,tanggal_lahir=?, tempat_lahir=?, alamat=?, no_telp=?, email=?, program_studi=?, agama=?, gender=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama);
            ps.setInt(2, NISN);
            ps.setString(3, tanggal_lahir);
            ps.setString(4, tempat_lahir);
            ps.setString(5, alamat);
            ps.setInt(6, no_telp);
            ps.setString(7, email);
            ps.setString(8, program_studi);
            ps.setString(9, agama);
            ps.setString(10, gender);
            ps.setInt(11, id);
            
            ps.executeUpdate();
            
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        showTableData();
    
    }//GEN-LAST:event_tblEditActionPerformed

    private void tblHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblHapusActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtid.getText());
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String sql = "DELETE from formpenerimaan WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        showTableData();
        tblSimpan.setEnabled(true);
        tblEdit.setEnabled(false);
        tblHapus.setEnabled(false);
    }//GEN-LAST:event_tblHapusActionPerformed

    private void tblKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tblKeluarActionPerformed

    private void prodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_prodiActionPerformed

    public void showTableData(){
        try{
            items.clear();
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nama Mahasiswa Baru");
            model.addColumn("NISN");
            model.addColumn("Program studi");
            model.addColumn("Gender");
            model.addColumn("Agama");
            model.addColumn("Tgl Lahir");
            model.addColumn("Tempat lahir");
            model.addColumn("Alamat");
            model.addColumn("telp");
            model.addColumn("Email");
            
            stmt = conn.createStatement();
            String sql = "SELECT * FROM formpenerimaan";
            int i = 1;
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                items.add(new modelspenerimaan(rs.getInt("id"), rs.getString("nama"), rs.getInt("NISN"), 
                rs.getString("program_studi"), rs.getString("gender"), rs.getString("agama"), rs.getString("tanggal_lahir"),
                rs.getString("tempat_lahir"), rs.getString("alamat"), rs.getInt("no_telp"),
                rs.getString("email")));
            }
            
            for(modelspenerimaan p : items)
            {
                model.addRow(new Object[]{
                i,
                p.getNama(),p.getNISN(),p.getProgram_studi(),p.getGender(),p.getAgama(),p.getTanggal_lahir(),
                p.getTempat_lahir(),p.getAlamat(),p.getNo_telp(),p.getEmail(),
                });
                i++;
            }
            rs.close();
            conn.close();
            stmt.close();
            
            TabelPenerimaan.setModel(model);
            txtid.setVisible(false);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void getData(){
        int baris = TabelPenerimaan.getSelectedRow();
        txtNama.setText(items.get(baris).getNama());
        txtNISN.setText(Integer.toString(items.get(baris).getNISN()));
        txtno_Telp.setText(Integer.toString(items.get(baris).getNo_telp()));
        txtAgama.setText(items.get(baris).getAgama());
        txttgl_lhr.setText(items.get(baris).getTanggal_lahir());
        txttmpt_lhr.setText(items.get(baris).getTempat_lahir());
        txtAlamat.setText(items.get(baris).getAlamat());
        txtEmail.setText(items.get(baris).getEmail());
        prodi.setSelectedItem(items.get(baris).getProgram_studi());
        genderBox.setSelectedItem(items.get(baris).getGender());
        
        txtid.setVisible(false);
        txtid.setText(Integer.toString(items.get(baris).getId()));

    }
    
    
    
    private void TabelPenerimaanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPenerimaanMouseClicked
        // TODO add your handling code here:
        getData();
        tblSimpan.setEnabled(false);
        tblEdit.setEnabled(true);
        tblHapus.setEnabled(true);
    }//GEN-LAST:event_TabelPenerimaanMouseClicked

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
            java.util.logging.Logger.getLogger(formpenerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formpenerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formpenerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formpenerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

                    break;
                }
            }
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formpenerimaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPenerimaan;
    private javax.swing.JComboBox<String> genderBox;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> prodi;
    private javax.swing.JButton tblEdit;
    private javax.swing.JButton tblHapus;
    private javax.swing.JButton tblKeluar;
    private javax.swing.JButton tblSimpan;
    private javax.swing.JTextField txtAgama;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNISN;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtno_Telp;
    private javax.swing.JTextField txttgl_lhr;
    private javax.swing.JTextField txttmpt_lhr;
    // End of variables declaration//GEN-END:variables
}
