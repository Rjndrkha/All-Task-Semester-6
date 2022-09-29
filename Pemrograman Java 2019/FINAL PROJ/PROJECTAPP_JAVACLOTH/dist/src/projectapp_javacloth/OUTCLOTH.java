/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp_javacloth;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author FAWKES
 */
public class OUTCLOTH extends javax.swing.JInternalFrame {
private DefaultTableModel TabModel;
    Connection conn;
    Statement stm;
    ResultSet rs;
    
    /**
     * Creates new form rockwell_what
     */
    public OUTCLOTH() {
        initComponents();
        SiapIsi(false);
        TombolNormal();
        //tabeltransaksi();
        txstok.setVisible(false);
        txsubtotal.setVisible(false);
        
        Object header[]={"ID CLOTH","NAMA","JENIS","HARGA","JUMLAH","SUBTOTAL"};
        TabModel=new DefaultTableModel(null, header);
        
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
        txjumlah.setEnabled(a);
        txhargajual.setEnabled(a);
        txsubtotal.setEnabled(a);
        txtotal.setEnabled(a);
        txbayar.setEnabled(a);
        txkembalian.setEnabled(a);
        txstok.setEnabled(a);
        
    }
    
    private void TombolNormal(){
        bttambah.setEnabled(true);
        btsimpan.setEnabled(false);
        //btedit.setEnabled(false);
       // bthapus.setEnabled(false);
        btinventori.setEnabled(false);
       // bttransaksi.setEnabled(false);
    }
    
    private void bersih(){
        txtransaksi.setText("");
        txidcloth.setText("");
        txnama.setText("");
        txjenis.setText("");
        txjumlah.setText("");
        txhargajual.setText("");
        txsubtotal.setText("0");
        txtotal.setText("0");
        txbayar.setText("0");
        txkembalian.setText("");
        txstok.setText("");
        
    }
    
    private void idtransaksi(){
       try{
           setKoneksi();
           String sql="select right(idtransaksi,2)+1 from outcloth";
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
    
    
    
    private void simpan(){
        try{
           Date skrg=new Date();
           SimpleDateFormat frm=new SimpleDateFormat("yyyy-MM-dd");
           String tanggal=frm.format(skrg); 
 
            int t = tabelsementara.getRowCount();
             for(int i=0;i<t;i++)    
            {
            String idcloth=tabelsementara.getValueAt(i, 0).toString();
            String nama=tabelsementara.getValueAt(i, 1).toString();
            String jenis=tabelsementara.getValueAt(i, 2).toString();
            int jml= Integer.parseInt(tabelsementara.getValueAt(i, 3).toString());
            int harga= Integer.parseInt(tabelsementara.getValueAt(i, 4).toString());           
            int subtot= Integer.parseInt(tabelsementara.getValueAt(i, 5).toString());
         
            String sql ="insert into outcloth values('"+txtransaksi.getText()
                    +"','"+idcloth+"','"
                    +tanggal+"','"
                    +nama+"','"
                    +jenis+"','"
                    +harga+"','"
                    +jml+"','"
                    +subtot+"','"
                    +txtotal.getText()+"','"
                    +txbayar.getText()+"','"
                    +txkembalian.getText()+"')";
            
             stm.executeUpdate(sql);
             
            }         
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "SIMPAN TRANSAKSI PENJUALAN GAGAL");
        }
        
    }
    
    
    
    private void perbaruistok(){
        try{
            setKoneksi();
            String sql="update inventori set stok='"+txstok.getText()
                    +"' where idcloth='"+txidcloth.getText()+"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Stok Diperbarui","",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch(Exception e){
        }
        tabeltransaksi();
        
    }
    
    
    
    public void tabeltransaksi(){
        Object header[]={"IDTRANS","IDCLOTH","TANGGAL","NAMA","JENIS","JUMLAH","HARGA","SUBTOTAL","TOTAL","BAYAR","KEMBALIAN"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabeltransaksi.setModel(data);
        setKoneksi();
        String sql="select*from outcloth";
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
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11};
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
        int jumlahbeli=Integer.parseInt(txjumlah.getText());
        int stok=Integer.parseInt(txstok.getText());
        
        int total=jumlahbeli-stok;
        txstok.setText(Integer.toString(total));
    }
    
    public void ambildata() {
        try {
            tabelsementara.setModel(TabModel);
                String kolom1 = txidcloth.getText();
                String kolom2 = txnama.getText();
                String kolom3 = txjenis.getText();
                String kolom4 = txhargajual.getText();
                String kolom5 = txjumlah.getText();
                String kolom6 = txsubtotal.getText();
                String[] kolom = {kolom1, kolom2, kolom3, kolom4, kolom5,kolom6};
                TabModel.addRow(kolom);
          }
          catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Data gagal disimpan");
          }     
    }
    
    public void cetak_nota(){
        try {
            String NamaFile = "src/report/nota.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection setKoneksi = DriverManager.getConnection("jdbc:mysql://localhost/projectapp_javacloth","root","");
            HashMap param = new HashMap();
            param.put("ptrans",txtransaksi.getText());
            JasperPrint JPrint = JasperFillManager.fillReport(NamaFile, param, conn);
            JasperViewer.viewReport(JPrint, false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak!","Cetak Data",JOptionPane.ERROR_MESSAGE);
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
        jLabel4 = new javax.swing.JLabel();
        txjenis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txhargajual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelsementara = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txjumlah = new javax.swing.JTextField();
        btadd = new javax.swing.JButton();
        bttambah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btinventori = new javax.swing.JButton();
        bttransaksi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txkembalian = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txbayar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txstok = new javax.swing.JTextField();
        txsubtotal = new javax.swing.JTextField();

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

        jInternalFrame2.setTitle("TABEL TRANSAKSI");
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
        setTitle("OUTCLOTH");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("ID TRANS");

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

        txnama.setEditable(false);
        txnama.setBackground(new java.awt.Color(0, 0, 51));
        txnama.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txnama.setForeground(new java.awt.Color(204, 204, 204));
        txnama.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("JENIS");

        txjenis.setEditable(false);
        txjenis.setBackground(new java.awt.Color(0, 0, 51));
        txjenis.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txjenis.setForeground(new java.awt.Color(204, 204, 204));
        txjenis.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("HARGA ");

        txhargajual.setEditable(false);
        txhargajual.setBackground(new java.awt.Color(0, 0, 51));
        txhargajual.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txhargajual.setForeground(new java.awt.Color(204, 204, 204));
        txhargajual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tabelsementara.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelsementara);

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("JUMLAH");

        txjumlah.setBackground(new java.awt.Color(0, 0, 51));
        txjumlah.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txjumlah.setForeground(new java.awt.Color(204, 204, 204));
        txjumlah.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btadd.setBackground(new java.awt.Color(51, 51, 51));
        btadd.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        btadd.setForeground(new java.awt.Color(204, 204, 204));
        btadd.setText(">");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txjumlah)
                    .addComponent(txhargajual, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txjenis, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txnama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txidcloth, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btadd)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txidcloth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txhargajual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        txkembalian.setEditable(false);
        txkembalian.setBackground(new java.awt.Color(0, 0, 51));
        txkembalian.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txkembalian.setForeground(new java.awt.Color(255, 0, 0));
        txkembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("KEMBALIAN");

        txbayar.setBackground(new java.awt.Color(0, 0, 51));
        txbayar.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txbayar.setForeground(new java.awt.Color(255, 0, 0));
        txbayar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txbayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txbayarKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("BAYAR");

        txtotal.setEditable(false);
        txtotal.setBackground(new java.awt.Color(0, 0, 51));
        txtotal.setFont(new java.awt.Font("Tekton Pro", 0, 14)); // NOI18N
        txtotal.setForeground(new java.awt.Color(255, 0, 0));
        txtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("TOTAL");

        txstok.setForeground(new java.awt.Color(255, 0, 0));
        txstok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txstokActionPerformed(evt);
            }
        });

        txsubtotal.setForeground(new java.awt.Color(255, 0, 0));
        txsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txsubtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(txstok, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(bttransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btinventori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttambah)
                    .addComponent(btsimpan)
                    .addComponent(btinventori)
                    .addComponent(bttransaksi))
                .addGap(29, 29, 29))
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
          
            idtransaksi();

            //txidcloth.setEnabled(true);
            //bttransaksi.setEnabled(true);
            btinventori.setEnabled(true);
            bttambah.setEnabled(true);
            btsimpan.setEnabled(true);
            //bthapus.setEnabled(false);
            //btedit.setEnabled(false);
        } else{
            bttambah.setText("Tambah");
            bersih();
            SiapIsi(false);
            TombolNormal();
            tabelinventory();
            TabModel.getDataVector().removeAllElements();
            TabModel.fireTableDataChanged();
        }
    }//GEN-LAST:event_bttambahActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        if(txtransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi inputan penjualan barang");
        } else{
            simpan();
            int pesan=JOptionPane.showConfirmDialog(null, "Print Out Nota?","Print",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

            if(pesan==JOptionPane.YES_OPTION){
                cetak_nota();
            }else {
                JOptionPane.showMessageDialog(null, "Simpan Transaksi Berhasil");
            }
            perbaruistok();
            bersih();    
        } 
    }//GEN-LAST:event_btsimpanActionPerformed

    private void tabelinventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelinventoryMouseClicked
        // TODO add your handling code here:
        int baris = tabelinventory.getSelectedRow();
        txidcloth.setText(tabelinventory.getModel().getValueAt(baris, 0).toString());
        txnama.setText(tabelinventory.getModel().getValueAt(baris, 1).toString());
        txjenis.setText(tabelinventory.getModel().getValueAt(baris, 2).toString());
        txhargajual.setText(tabelinventory.getModel().getValueAt(baris, 5).toString());
        txstok.setText(tabelinventory.getModel().getValueAt(baris, 3).toString());
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
        txjumlah.setText(tabeltransaksi.getModel().getValueAt(baris, 5).toString());
        txhargajual.setText(tabeltransaksi.getModel().getValueAt(baris, 6).toString());
        txsubtotal.setText(tabeltransaksi.getModel().getValueAt(baris, 7).toString());
        txtotal.setText(tabeltransaksi.getModel().getValueAt(baris, 8).toString());
        txbayar.setText(tabeltransaksi.getModel().getValueAt(baris, 9).toString());
        txkembalian.setText(tabeltransaksi.getModel().getValueAt(baris, 10).toString());
        jDialogtabeltransaksi.dispose();
        cetak_nota();
        //btedit.setEnabled(true);
        //bthapus.setEnabled(true);
    }//GEN-LAST:event_tabeltransaksiMouseClicked

    private void txpencariantransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpencariantransaksiKeyPressed
        // TODO add your handling code here:
        Object header[]={"IDTRANS","IDCLOTH","TANGGAL","NAMA","JENIS","JUMLAH","HARGA","SUBTOTAL","TOTAL","BAYAR","KEMBALIAN"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabeltransaksi.setModel(data);
        setKoneksi();
        String sql="Select * from outcloth where idtransaksi like '%" + txpencariantransaksi.getText() + "%'" + "or idcloth like '%" + txpencariantransaksi.getText()+"%'";
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
                
                
                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7,kolom8,kolom9,kolom10,kolom11,};
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

    private void txstokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txstokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txstokActionPerformed

    private void txsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txsubtotalActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // TODO add your handling code here:
        int harga=Integer.parseInt(txhargajual.getText());
        int jml=Integer.parseInt(txjumlah.getText());
        int stok=Integer.parseInt(txstok.getText());
        int total=Integer.parseInt(txtotal.getText());

        if(jml>stok){
            JOptionPane.showMessageDialog(null, "Stok barang tidak mencukupi");
        }else{

            int subtot=harga*jml;
            txsubtotal.setText(Integer.toString(subtot));

            int hasilstok=stok-jml;
            txstok.setText(Integer.toString(hasilstok));

            int totbay=total+(harga*jml);
            txtotal.setText(Integer.toString(totbay));

            ambildata();
            
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void txbayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbayarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int total=Integer.parseInt(txtotal.getText());
            int bayar=Integer.parseInt(txbayar.getText());
            if(bayar<total){
                JOptionPane.showMessageDialog(null, "Jumlah bayar tidak mencukupi");
                txbayar.requestFocus();
            } else{
                int kembali=bayar-total;
                txkembalian.setText(Integer.toString(kembali));
            }
        }
    }//GEN-LAST:event_txbayarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btinventori;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JButton bttransaksi;
    private javax.swing.JDialog jDialogtabelinventory;
    private javax.swing.JDialog jDialogtabeltransaksi;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tabelinventory;
    private javax.swing.JTable tabelsementara;
    private javax.swing.JTable tabeltransaksi;
    private javax.swing.JTextField txbayar;
    private javax.swing.JTextField txhargajual;
    private javax.swing.JTextField txidcloth;
    private javax.swing.JTextField txjenis;
    private javax.swing.JTextField txjumlah;
    private javax.swing.JTextField txkembalian;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txpencarianinventory;
    private javax.swing.JTextField txpencariantransaksi;
    private javax.swing.JTextField txstok;
    private javax.swing.JTextField txsubtotal;
    private javax.swing.JTextField txtotal;
    private javax.swing.JTextField txtransaksi;
    // End of variables declaration//GEN-END:variables
}
