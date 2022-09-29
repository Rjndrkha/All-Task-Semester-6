/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp_javacloth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAWKES
 */
public class INVENTORY extends javax.swing.JInternalFrame {

    Connection conn;
    Statement stm;
    ResultSet rs;
    
    /**
     * Creates new form rockwell_what
     */
    public INVENTORY() {
        initComponents();
        SiapIsi(false);
        TombolNormal();
        tabelinventory();
    }
    
    public Connection setKoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/projectapp_javacloth","root","");
            stm=conn.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal:"+e);
        }
        return conn;
    }
    
    private void SiapIsi(boolean a){
        txidcloth.setEnabled(a);
        txnama.setEnabled(a);
        txjenis.setEnabled(a);
        txstok.setEnabled(a);
        txhargamodal.setEnabled(a);
        txhargajual.setEnabled(a);
        txincome.setEnabled(a);
    }
    
    private void TombolNormal(){
        bttambah.setEnabled(true);
        btsimpan.setEnabled(false);
        btedit.setEnabled(false);
        bthapus.setEnabled(false);
    }
    
    private void bersih(){
        txidcloth.setText("");
        txnama.setText("");
        txjenis.setText("");
        txstok.setText("");
        txhargamodal.setText("");
        txhargajual.setText("");
        txincome.setText("");
    }
    
    private void idcloth(){
       try{
           setKoneksi();
           String sql="select right(idcloth,2)+1 from inventori";
           ResultSet rs=stm.executeQuery(sql);
           if(rs.next()){
           rs.last();
           String no=rs.getString(1);
           while (no.length()<3){
               no="0"+no;
               txidcloth.setText("IDC"+no);}
       }
           else
           {
                   txidcloth.setText("IDC001");
       }
       } catch (Exception e)
       {
    }
    }
    
    private void simpan(){
        try{
            setKoneksi();
            String sql="insert into inventori values('"+txidcloth.getText()
                    +"','"+txnama.getText()
                    +"','"+txjenis.getText()
                    +"','"+txstok.getText()
                    +"','"+txhargamodal.getText()
                    +"','"+txhargajual.getText()
                    +"','"+txincome.getText() +"')";
            stm.executeUpdate(sql); 
            JOptionPane.showMessageDialog(null,"Simpan Data Berhasil");
            }
            catch (Exception e) {
        }
        tabelinventory();
       
    }
    
    private void edit(){
        try{
            setKoneksi();
            String sql="update inventori set nama='"+txnama.getText()
                    +"',jenis='"+txjenis.getText()
                    +"',stok='"+txstok.getText()
                    +"',hargamodal='"+txhargamodal.getText()
                    +"',hargajual='"+txhargajual.getText()
                    +"',income='"+txincome.getText()
                    +"' where idcloth='"+txidcloth.getText()+"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Edit Data Berhasil","",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch(Exception e){
        }
        tabelinventory();
        
    }
    
    private void hapus(){
        try{
            String sql="delete from inventori where idcloth='"+ txidcloth.getText() +"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            }
            catch (Exception e) {
            }
        tabelinventory();
    }
    
    public void tabelinventory(){
        Object header[]={"ID CLOTH","NAMA","JENIS","STOK","MODAL","JUAL","INCOME"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabelinventory.setModel(data);
        setKoneksi();
        String sql="select*from inventori";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString(1);
                String kolom2=rs.getString(2);
                String kolom3=rs.getString(3);
                String kolom4=rs.getString(4);
                String kolom5=rs.getString(5);
                String kolom6=rs.getString(6);
                String kolom7=rs.getString(7);
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7};
                data.addRow(kolom);
            }
        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txidcloth = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        txjenis = new javax.swing.JTextField();
        txstok = new javax.swing.JTextField();
        txhargamodal = new javax.swing.JTextField();
        txhargajual = new javax.swing.JTextField();
        txincome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelinventory = new javax.swing.JTable();
        txpencarian = new javax.swing.JTextField();
        bttambah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INVENTORI");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID CLOTH");

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("JENIS");

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("STOK");

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("HARGA MODAL");

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("HARGA JUAL");

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("INCOME");

        txidcloth.setBackground(new java.awt.Color(0, 0, 51));
        txidcloth.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txidcloth.setForeground(new java.awt.Color(204, 204, 204));
        txidcloth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txnama.setBackground(new java.awt.Color(0, 0, 51));
        txnama.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txnama.setForeground(new java.awt.Color(204, 204, 204));
        txnama.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txjenis.setBackground(new java.awt.Color(0, 0, 51));
        txjenis.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txjenis.setForeground(new java.awt.Color(204, 204, 204));
        txjenis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txstok.setBackground(new java.awt.Color(0, 0, 51));
        txstok.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txstok.setForeground(new java.awt.Color(204, 204, 204));
        txstok.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txhargamodal.setBackground(new java.awt.Color(0, 0, 51));
        txhargamodal.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txhargamodal.setForeground(new java.awt.Color(204, 204, 204));
        txhargamodal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txhargajual.setBackground(new java.awt.Color(0, 0, 51));
        txhargajual.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txhargajual.setForeground(new java.awt.Color(204, 204, 204));
        txhargajual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txhargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txhargajualActionPerformed(evt);
            }
        });

        txincome.setBackground(new java.awt.Color(0, 0, 51));
        txincome.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txincome.setForeground(new java.awt.Color(204, 204, 204));
        txincome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tabelinventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tabelinventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelinventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelinventory);

        txpencarian.setBackground(new java.awt.Color(0, 0, 51));
        txpencarian.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txpencarian.setForeground(new java.awt.Color(204, 204, 204));
        txpencarian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txpencarian.setText("KOLOM PENCARIAN");
        txpencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txpencarianKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txidcloth, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txpencarian))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txincome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txhargajual, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txhargamodal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txstok, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txidcloth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txpencarian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txhargamodal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txhargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        bttambah.setBackground(new java.awt.Color(51, 51, 51));
        bttambah.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        bttambah.setForeground(new java.awt.Color(204, 204, 204));
        bttambah.setText("TAMBAH");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        btsimpan.setBackground(new java.awt.Color(51, 51, 51));
        btsimpan.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        btsimpan.setForeground(new java.awt.Color(204, 204, 204));
        btsimpan.setText("SIMPAN");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btedit.setBackground(new java.awt.Color(51, 51, 51));
        btedit.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        btedit.setForeground(new java.awt.Color(204, 204, 204));
        btedit.setText("EDIT");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });

        bthapus.setBackground(new java.awt.Color(51, 51, 51));
        bthapus.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        bthapus.setForeground(new java.awt.Color(204, 204, 204));
        bthapus.setText("HAPUS");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(bttambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btedit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttambah)
                    .addComponent(btsimpan)
                    .addComponent(btedit)
                    .addComponent(bthapus))
                .addContainerGap(42, Short.MAX_VALUE))
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

        setBounds(0, 0, 865, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
        // TODO add your handling code here:
        if(bttambah.getText().equalsIgnoreCase("tambah")){
            bttambah.setText("Refresh");
            bersih();
            SiapIsi(true);
            idcloth();

            //txidcloth.setEnabled(true);
            bttambah.setEnabled(true);
            btsimpan.setEnabled(true);
            bthapus.setEnabled(false);
            btedit.setEnabled(false);
        } else{
            bttambah.setText("Tambah");
            bersih();
            SiapIsi(false);
            TombolNormal();
            tabelinventory();
        }
    }//GEN-LAST:event_bttambahActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        if(txidcloth.getText().isEmpty()
            ||txnama.getText().isEmpty()
            ||txjenis.getText().isEmpty()
            ||txstok.getText().isEmpty()
            ||txhargamodal.getText().isEmpty()
            ||txhargajual.getText().isEmpty()
            ||txincome.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "LENGKAPI INPUTAN DATA!!!","",JOptionPane.INFORMATION_MESSAGE);
        } else{

            if(bttambah.getText().equalsIgnoreCase("Refresh")){
                if(bttambah.getText().equalsIgnoreCase("Refresh")){
                    simpan();
                } else{
                    JOptionPane.showMessageDialog(null, "SIMPAN DATA GAGAL, PERIKSA KEMBALI :( ","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            if(btedit.getText().equalsIgnoreCase("batal")){
                if(btedit.getText().equalsIgnoreCase("batal")){
                    edit();
                } else{
                    JOptionPane.showMessageDialog(null, "EDIT DATA GAGAL, PERIKSA KEMBALI :( ","",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            bersih();
            SiapIsi(false);
            bttambah.setText("Tambah");
            btedit.setText("Edit");
            TombolNormal();

        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
        if(btedit.getText().equalsIgnoreCase("edit")){
            btedit.setText("Batal");
            SiapIsi(true);
            bttambah.setEnabled(false);
            btsimpan.setEnabled(true);
            bthapus.setEnabled(false);
            btedit.setEnabled(true);
        } else{
            btedit.setText("Edit");
            bersih();
            SiapIsi(false);
            TombolNormal();

        }
    }//GEN-LAST:event_bteditActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        int pesan=JOptionPane.showConfirmDialog(null, "YAKIN DATA AKAN DIHAPUS ?","Konfirmasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(pesan==JOptionPane.YES_OPTION){
            if(pesan==JOptionPane.YES_OPTION){
                hapus();
                bersih();
                SiapIsi(false);
                TombolNormal();
            } else{
                JOptionPane.showMessageDialog(null, "HAPUS DATA GAGAL :(");
            }

        }
    }//GEN-LAST:event_bthapusActionPerformed

    private void txpencarianKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpencarianKeyPressed
        // TODO add your handling code here:
        Object header[]={"ID CLOTH","NAMA","JENIS","STOK","MODAL","JUAL","INCOME"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabelinventory.setModel(data);
        setKoneksi();
        String sql="Select * from inventori where idcloth like '%" + txpencarian.getText() + "%'" + "or nama like '%" + txpencarian.getText()+"%'";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString(1);
                String kolom2=rs.getString(2);
                String kolom3=rs.getString(3);
                String kolom4=rs.getString(4);
                String kolom5=rs.getString(5);
                String kolom6=rs.getString(6);
                String kolom7=rs.getString(7);

                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7};
                data.addRow(kolom);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txpencarianKeyPressed

    private void tabelinventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelinventoryMouseClicked
        // TODO add your handling code here:
        int baris = tabelinventory.getSelectedRow();
        txidcloth.setText(tabelinventory.getModel().getValueAt(baris, 0).toString());
        txnama.setText(tabelinventory.getModel().getValueAt(baris, 1).toString());
        txjenis.setText(tabelinventory.getModel().getValueAt(baris, 2).toString());
        txstok.setText(tabelinventory.getModel().getValueAt(baris, 3).toString());
        txhargamodal.setText(tabelinventory.getModel().getValueAt(baris, 4).toString());
        txhargajual.setText(tabelinventory.getModel().getValueAt(baris, 5).toString());
        txincome.setText(tabelinventory.getModel().getValueAt(baris, 6).toString());
        bthapus.setEnabled(true);
        btedit.setEnabled(true);
    }//GEN-LAST:event_tabelinventoryMouseClicked

    private void txhargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txhargajualActionPerformed
        // TODO add your handling code here:
        int hargajual=Integer.parseInt(txhargajual.getText());
        int hargamodal=Integer.parseInt(txhargamodal.getText());

        int total=hargajual-hargamodal;
        txincome.setText(Integer.toString(total));
    }//GEN-LAST:event_txhargajualActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelinventory;
    private javax.swing.JTextField txhargajual;
    private javax.swing.JTextField txhargamodal;
    private javax.swing.JTextField txidcloth;
    private javax.swing.JTextField txincome;
    private javax.swing.JTextField txjenis;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txpencarian;
    private javax.swing.JTextField txstok;
    // End of variables declaration//GEN-END:variables
}
