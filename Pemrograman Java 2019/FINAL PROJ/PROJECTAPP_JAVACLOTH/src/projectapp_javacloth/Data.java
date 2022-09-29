/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp_javacloth;

import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public interface Data {
     abstract void simpan();
     abstract void edit();
     abstract void hapus();
     abstract Connection setKoneksi();
}
