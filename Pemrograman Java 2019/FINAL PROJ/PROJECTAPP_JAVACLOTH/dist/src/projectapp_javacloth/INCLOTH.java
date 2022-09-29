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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FAWKES
 */
public class INCLOTH extends javax.swing.JInternalFrame {

    Connection conn;
    Statement stm;
    ResultSet rs;
    
    /**
     * Creates new form rockwell_what
     */
    public INCLOTH() {
        initComponents();
        SiapIsi(false);
        TombolNormal();
        //tabeltransaksi();
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
        txtransaksi.setEnabled(a);
        txidcloth.setEnabled(a);
        txnama.setEnabled(a);
        txjenis.setEnabled(a);
        txhargabeli.setEnabled(a);
        txmodalsatuan.setEnabled(a);
        txjualsatuan.setEnabled(a);
        txincome.setEnabled(a);
        txstoktersedia.setEnabled(a);
        txjumlahbeli.setEnabled(a);
        txtotalstok.setEnabled(a);
    }
    
    private void TombolNormal(){
        bttambah.setEnabled(true);
        btsimpan.setEnabled(false);
        btperbarui.setEnabled(false);
        btedit.setEnabled(false);
        bthapus.setEnabled(false);
        btinventori.setEnabled(false);
       // bttransaksi.setEnabled(false);
    }
    
    private void bersih(){
        txtransaksi.setText("");
        txidcloth.setText("");
        txnama.setText("");
        txjenis.setText("");
        txhargabeli.setText("");
        txmodalsatuan.setText("");
        txjualsatuan.setText("");
        txjualsatuan.setText("");
        txincome.setText("");
        txstoktersedia.setText("");
        txjumlahbeli.setText("");
        txtotalstok.setText("");
    }
    
    private void idtransaksi(){
       try{
           setKoneksi();
           String sql="select right(idtransaksi,2)+1 from incloth";
           ResultSet rs=stm.executeQuery(sql);
           if(rs.next()){
           rs.last();
           String no=rs.getString(1);
           while (no.length()<3){
               no="0"+no;
               txtransaksi.setText("TR"+no);}
       }
           else
           {
                   txtransaksi.setText("TR001");
       }
       } catch (Exception e)
       {
    }
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
                    +"','"+txtotalstok.getText()
                    +"','"+txmodalsatuan.getText()
                    +"','"+txjualsatuan.getText()
                    +"','"+txincome.getText() +"')";
            stm.executeUpdate(sql); 
            JOptionPane.showMessageDialog(null,"Simpan Data Berhasil");
            }
            catch (Exception e) {
        }
        perbarui();
    }
    
    private void perbarui(){
        try{
            
           Date skrg=new Date();
           SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
           String tanggal=frm.format(skrg); 
           
            setKoneksi();
            String sql="insert into incloth values('"+txtransaksi.getText()
                    +"','"+txidcloth.getText()
                    +"','"+tanggal
                    +"','"+txnama.getText()
                    +"','"+txjenis.getText()
                    +"','"+txhargabeli.getText()
                    +"','"+txmodalsatuan.getText()
                    +"','"+txjualsatuan.getText()
                    +"','"+txincome.getText()
                    +"','"+txstoktersedia.getText()
                    +"','"+txjumlahbeli.getText()
                    +"','"+txtotalstok.getText() +"')";
            stm.executeUpdate(sql); 
            JOptionPane.showMessageDialog(null,"Simpan Transaksi Berhasil");
            }
            catch (Exception e) {
        }
        tabeltransaksi();
       
    }
    
    private void edit(){
        try{
            setKoneksi();
            String sql="update incloth set idcloth='"+txidcloth.getText()
                    +"',nama='"+txnama.getText()
                    +"',jenis='"+txjenis.getText()
                    +"',hargabeli='"+txhargabeli.getText()
                    +"',modalsatuan='"+txmodalsatuan.getText()
                    +"',jualsatuan='"+txjualsatuan.getText()
                    +"',income='"+txincome.getText()
                    +"',stoktersedia='"+txstoktersedia.getText()
                    +"',jumlahbeli='"+txjumlahbeli.getText()
                    +"',totalstok='"+txtotalstok.getText()
                    +"' where idtransaksi='"+txtransaksi.getText()+"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Edit Data Berhasil","",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch(Exception e){
        }
        tabeltransaksi();
        perbaruistok();
    }
    
    private void perbaruistok(){
        try{
            setKoneksi();
            String sql="update inventori set stok='"+txtotalstok.getText()
                    +"' where idcloth='"+txidcloth.getText()+"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Stok Diperbarui","",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch(Exception e){
        }
        tabeltransaksi();
        
    }
    
    private void hapus(){
        try{
            String sql="delete from incloth where idtransaksi='"+ txtransaksi.getText() +"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
            }
            catch (Exception e) {
            }
        tabelinventory();
    }
    
    public void tabeltransaksi(){
        Object header[]={"IDTRANS","IDCLOTH","TANGGAL","NAMA","JENIS","HBELI","MODALSATUAN","JUALSATUAN","INCOME","TERSEDIA","JUMLAH","TOTALSTOK"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabeltransaksi.setModel(data);
        setKoneksi();
        String sql="select*from incloth";
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
                String kolom8=rs.getString(8);
                String kolom9=rs.getString(9);
                String kolom10=rs.getString(10);
                String kolom11=rs.getString(11);
                String kolom12=rs.getString(12);
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11,kolom12};
                data.addRow(kolom);
            }
        } catch (Exception e) {
        }
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
    
    public void hitungstok(){
        int jumlahbeli=Integer.parseInt(txjumlahbeli.getText());
        int stoktersedia=Integer.parseInt(txstoktersedia.getText());
        
        int total=jumlahbeli+stoktersedia;
        txtotalstok.setText(Integer.toString(total));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogtabelinventory = new javax.swing.JDialog();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelinventory = new javax.swing.JTable();
        txpencarianinventory = new javax.swing.JTextField();
        jDialogtabeltransaksi = new javax.swing.JDialog();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabeltransaksi = new javax.swing.JTable();
        txpencariantransaksi = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txidcloth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txnama = new javax.swing.JTextField();
        txjenis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txhargabeli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txmodalsatuan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txjualsatuan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txincome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txstoktersedia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txjumlahbeli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtotalstok = new javax.swing.JTextField();
        bttambah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btinventori = new javax.swing.JButton();
        bttransaksi = new javax.swing.JButton();
        btperbarui = new javax.swing.JButton();

        jDialogtabelinventory.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogtabelinventory.setBackground(new java.awt.Color(0, 0, 51));
        jDialogtabelinventory.setMinimumSize(new java.awt.Dimension(694, 430));
        jDialogtabelinventory.setModal(true);
        jDialogtabelinventory.setResizable(false);

        jInternalFrame1.setTitle("TABEL INVENTORI");
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(694, 430));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternalFrame1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));

        tabelinventory.setAutoCreateRowSorter(true);
        tabelinventory.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabelinventory.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelinventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelinventoryMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelinventory);

        txpencarianinventory.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txpencarianinventory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txpencarianinventory.setText("KOLOM PENCARIAN");
        txpencarianinventory.setPreferredSize(new java.awt.Dimension(87, 30));
        txpencarianinventory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txpencarianinventoryKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txpencarianinventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txpencarianinventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialogtabelinventoryLayout = new javax.swing.GroupLayout(jDialogtabelinventory.getContentPane());
        jDialogtabelinventory.getContentPane().setLayout(jDialogtabelinventoryLayout);
        jDialogtabelinventoryLayout.setHorizontalGroup(
            jDialogtabelinventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogtabelinventoryLayout.setVerticalGroup(
            jDialogtabelinventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDialogtabeltransaksi.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialogtabeltransaksi.setBackground(new java.awt.Color(0, 0, 51));
        jDialogtabeltransaksi.setMinimumSize(new java.awt.Dimension(1079, 430));
        jDialogtabeltransaksi.setModal(true);
        jDialogtabeltransaksi.setResizable(false);

        jInternalFrame2.setTitle("TABEL TRANSAKSI INCLOTH");
        jInternalFrame2.setPreferredSize(new java.awt.Dimension(694, 430));
        jInternalFrame2.setVisible(true);
        jInternalFrame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jInternalFrame2MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));

        tabeltransaksi.setAutoCreateRowSorter(true);
        tabeltransaksi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tabeltransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltransaksiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabeltransaksi);

        txpencariantransaksi.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txpencariantransaksi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txpencariantransaksi.setText("KOLOM PENCARIAN");
        txpencariantransaksi.setPreferredSize(new java.awt.Dimension(87, 30));
        txpencariantransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txpencariantransaksiKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txpencariantransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txpencariantransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialogtabeltransaksiLayout = new javax.swing.GroupLayout(jDialogtabeltransaksi.getContentPane());
        jDialogtabeltransaksi.getContentPane().setLayout(jDialogtabeltransaksiLayout);
        jDialogtabeltransaksiLayout.setHorizontalGroup(
            jDialogtabeltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
        );
        jDialogtabeltransaksiLayout.setVerticalGroup(
            jDialogtabeltransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("INCLOTH");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID TRANSAKSI");

        txtransaksi.setEditable(false);
        txtransaksi.setBackground(new java.awt.Color(0, 0, 51));
        txtransaksi.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txtransaksi.setForeground(new java.awt.Color(204, 204, 204));
        txtransaksi.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ID CLOTH");

        txidcloth.setEditable(false);
        txidcloth.setBackground(new java.awt.Color(0, 0, 51));
        txidcloth.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txidcloth.setForeground(new java.awt.Color(204, 204, 204));
        txidcloth.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("NAMA");

        txnama.setBackground(new java.awt.Color(0, 0, 51));
        txnama.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txnama.setForeground(new java.awt.Color(204, 204, 204));
        txnama.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txjenis.setBackground(new java.awt.Color(0, 0, 51));
        txjenis.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txjenis.setForeground(new java.awt.Color(204, 204, 204));
        txjenis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("JENIS");

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("HARGA BELI");

        txhargabeli.setBackground(new java.awt.Color(0, 0, 51));
        txhargabeli.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txhargabeli.setForeground(new java.awt.Color(204, 204, 204));
        txhargabeli.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("MODAL SATUAN");

        txmodalsatuan.setBackground(new java.awt.Color(0, 0, 51));
        txmodalsatuan.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txmodalsatuan.setForeground(new java.awt.Color(204, 204, 204));
        txmodalsatuan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("JUAL SATUAN");

        txjualsatuan.setBackground(new java.awt.Color(0, 0, 51));
        txjualsatuan.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txjualsatuan.setForeground(new java.awt.Color(204, 204, 204));
        txjualsatuan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("INCOME");

        txincome.setBackground(new java.awt.Color(0, 0, 51));
        txincome.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txincome.setForeground(new java.awt.Color(204, 204, 204));
        txincome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("STOK TERSEDIA");

        txstoktersedia.setBackground(new java.awt.Color(0, 0, 51));
        txstoktersedia.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txstoktersedia.setForeground(new java.awt.Color(204, 204, 204));
        txstoktersedia.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("JUMLAH BELI");

        txjumlahbeli.setBackground(new java.awt.Color(0, 0, 51));
        txjumlahbeli.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txjumlahbeli.setForeground(new java.awt.Color(204, 204, 204));
        txjumlahbeli.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("TOTAL STOK");

        txtotalstok.setBackground(new java.awt.Color(0, 0, 51));
        txtotalstok.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txtotalstok.setForeground(new java.awt.Color(204, 204, 204));
        txtotalstok.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtotalstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtotalstokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txidcloth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txjenis, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txincome, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txhargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txstoktersedia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txmodalsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txjualsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtotalstok, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txhargabeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txstoktersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txidcloth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txmodalsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txjualsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtotalstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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

        btinventori.setBackground(new java.awt.Color(51, 51, 51));
        btinventori.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        btinventori.setForeground(new java.awt.Color(204, 204, 204));
        btinventori.setText("TB INVENTORI");
        btinventori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btinventoriActionPerformed(evt);
            }
        });

        bttransaksi.setBackground(new java.awt.Color(51, 51, 51));
        bttransaksi.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        bttransaksi.setForeground(new java.awt.Color(204, 204, 204));
        bttransaksi.setText("TB TRANSAKSI");
        bttransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttransaksiActionPerformed(evt);
            }
        });

        btperbarui.setBackground(new java.awt.Color(51, 51, 51));
        btperbarui.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        btperbarui.setForeground(new java.awt.Color(204, 204, 204));
        btperbarui.setText("PERBARUI");
        btperbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btperbaruiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bttransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btinventori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btperbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btedit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addContainerGap())
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
                    .addComponent(bthapus)
                    .addComponent(btinventori)
                    .addComponent(bttransaksi)
                    .addComponent(btperbarui))
                .addContainerGap())
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
            idtransaksi();

            //txidcloth.setEnabled(true);
            //bttransaksi.setEnabled(true);
            btinventori.setEnabled(true);
            bttambah.setEnabled(true);
            btsimpan.setEnabled(true);
            btperbarui.setEnabled(true);
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
        hitungstok();
        if(txtransaksi.getText().isEmpty()
            ||txidcloth.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "LENGKAPI INPUTAN DATA!!!","",JOptionPane.INFORMATION_MESSAGE);
        } else{

            if(bttambah.getText().equalsIgnoreCase("Refresh")){
                if(bttambah.getText().equalsIgnoreCase("Refresh")){
                    simpan();
                    perbaruistok();
                } else{
                    JOptionPane.showMessageDialog(null, "SIMPAN DATA GAGAL, PERIKSA KEMBALI :( ","",JOptionPane.INFORMATION_MESSAGE);
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
        hitungstok();
        if(btedit.getText().equalsIgnoreCase("edit")){
            btedit.setText("Batal");
            SiapIsi(true);
            bttambah.setEnabled(false);
            //btsimpan.setEnabled(true);
            btperbarui.setEnabled(true);
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

    private void txtotalstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtotalstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtotalstokActionPerformed

    private void tabelinventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelinventoryMouseClicked
        // TODO add your handling code here:
        int baris = tabelinventory.getSelectedRow();
        txidcloth.setText(tabelinventory.getModel().getValueAt(baris, 0).toString());
        txnama.setText(tabelinventory.getModel().getValueAt(baris, 1).toString());
        txjenis.setText(tabelinventory.getModel().getValueAt(baris, 2).toString());
        txstoktersedia.setText(tabelinventory.getModel().getValueAt(baris, 3).toString());
        txmodalsatuan.setText(tabelinventory.getModel().getValueAt(baris, 4).toString());
        txjualsatuan.setText(tabelinventory.getModel().getValueAt(baris, 5).toString());
        txincome.setText(tabelinventory.getModel().getValueAt(baris, 6).toString());
        jDialogtabelinventory.dispose();
    }//GEN-LAST:event_tabelinventoryMouseClicked

    private void txpencarianinventoryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpencarianinventoryKeyPressed
        // TODO add your handling code here:
        Object header[]={"ID CLOTH","NAMA","JENIS","STOK","MODAL","JUAL","INCOME"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabelinventory.setModel(data);
        setKoneksi();
        String sql="Select * from inventori where idcloth like '%" + txpencarianinventory.getText() + "%'" + "or nama like '%" + txpencarianinventory.getText()+"%'";
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
    }//GEN-LAST:event_txpencarianinventoryKeyPressed

    private void jInternalFrame1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrame1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1MouseClicked

    private void btinventoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btinventoriActionPerformed
        // TODO add your handling code here:
        jDialogtabelinventory.setLocationRelativeTo(null);
        tabelinventory();
        jDialogtabelinventory.setVisible(true);
    }//GEN-LAST:event_btinventoriActionPerformed

    private void tabeltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltransaksiMouseClicked
        // TODO add your handling code here:
        int baris = tabeltransaksi.getSelectedRow();
        txtransaksi.setText(tabeltransaksi.getModel().getValueAt(baris, 0).toString());
        txidcloth.setText(tabeltransaksi.getModel().getValueAt(baris, 1).toString());
        txnama.setText(tabeltransaksi.getModel().getValueAt(baris, 3).toString());
        txjenis.setText(tabeltransaksi.getModel().getValueAt(baris, 4).toString());
        txhargabeli.setText(tabeltransaksi.getModel().getValueAt(baris, 5).toString());
        txmodalsatuan.setText(tabeltransaksi.getModel().getValueAt(baris, 6).toString());
        txjualsatuan.setText(tabeltransaksi.getModel().getValueAt(baris, 7).toString());
        txincome.setText(tabeltransaksi.getModel().getValueAt(baris, 8).toString());
        txstoktersedia.setText(tabeltransaksi.getModel().getValueAt(baris, 9).toString());
        txjumlahbeli.setText(tabeltransaksi.getModel().getValueAt(baris, 10).toString());
        txtotalstok.setText(tabeltransaksi.getModel().getValueAt(baris, 11).toString());
        jDialogtabeltransaksi.dispose();
        btedit.setEnabled(true);
        bthapus.setEnabled(true);
    }//GEN-LAST:event_tabeltransaksiMouseClicked

    private void txpencariantransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpencariantransaksiKeyPressed
        // TODO add your handling code here:
        Object header[]={"IDTRANS","IDCLOTH","TANGGAL","NAMA","JENIS","HBELI","MODALSATUAN","JUALSATUAN","INCOME","TERSEDIA","JUMLAH","TOTALSTOK"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabeltransaksi.setModel(data);
        setKoneksi();
        String sql="Select * from incloth where idtransaksi like '%" + txpencariantransaksi.getText() + "%'" + "or idcloth like '%" + txpencariantransaksi.getText()+"%'";
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
                String kolom8=rs.getString(8);
                String kolom9=rs.getString(9);
                String kolom10=rs.getString(10);
                String kolom11=rs.getString(11);
                String kolom12=rs.getString(12);
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11,kolom12};
                data.addRow(kolom);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_txpencariantransaksiKeyPressed

    private void jInternalFrame2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jInternalFrame2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame2MouseClicked

    private void bttransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttransaksiActionPerformed
        // TODO add your handling code here:
        jDialogtabeltransaksi.setLocationRelativeTo(null);
        tabeltransaksi();
        jDialogtabeltransaksi.setVisible(true);
    }//GEN-LAST:event_bttransaksiActionPerformed

    private void btperbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btperbaruiActionPerformed
        // TODO add your handling code here:
        hitungstok();
        if(txtransaksi.getText().isEmpty()
            ||txincome.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "LENGKAPI INPUTAN DATA!!!","",JOptionPane.INFORMATION_MESSAGE);
        } else{

            if(bttambah.getText().equalsIgnoreCase("Refresh")){
                if(bttambah.getText().equalsIgnoreCase("Refresh")){
                    perbarui();
                    perbaruistok();
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
    }//GEN-LAST:event_btperbaruiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btinventori;
    private javax.swing.JButton btperbarui;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JButton bttransaksi;
    private javax.swing.JDialog jDialogtabelinventory;
    private javax.swing.JDialog jDialogtabeltransaksi;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelinventory;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JTextField txhargabeli;
    private javax.swing.JTextField txidcloth;
    private javax.swing.JTextField txincome;
    private javax.swing.JTextField txjenis;
    private javax.swing.JTextField txjualsatuan;
    private javax.swing.JTextField txjumlahbeli;
    private javax.swing.JTextField txmodalsatuan;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txpencarianinventory;
    private javax.swing.JTextField txpencariantransaksi;
    private javax.swing.JTextField txstoktersedia;
    private javax.swing.JTextField txtotalstok;
    private javax.swing.JTextField txtransaksi;
    // End of variables declaration//GEN-END:variables
}
