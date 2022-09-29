/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tservlate file, choose Tools | Tservlates
 * and open the tservlate in the editor.
 */
package backend;

/**
 *
 * @author USER
 */
import java.util.*;
import java.sql.*;
public class service implements IService{
    private int id_service, duration, price;
    private String name;

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public service(){
        
    }

    public service(String name, int duration, int price) {
        this.id_service = id_service;
        this.duration = duration;
        this.price = price;
        this.name = name;
    }
    
    public service getById(int id){
        service serv = new service();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM service" 
           + " WHERE id_service = '" + id + "'");
        try{
            while(rs.next()){
            serv = new service();
            serv.setId_service(rs.getInt("id_service"));
            serv.setName(rs.getString("ServiceName"));
            serv.setDuration(rs.getInt("ServiceDuration"));
            serv.setPrice(rs.getInt("ServicePrice"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return serv;
    }
    
    @Override
    public ArrayList<service> getAllByIdList(int id){
        ArrayList<service> Listservice = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM service" 
           + " WHERE id_service = '" + id + "'");
        try{
            while(rs.next()){
                service servis = new service();
                servis.setId_service(rs.getInt("id_service"));
                servis.setName(rs.getString("ServiceName"));
                servis.setDuration(rs.getInt("ServiceDuration"));
                servis.setPrice(rs.getInt("ServicePrice"));
                
                Listservice.add(servis);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Listservice;
    }
    
    public ArrayList<service> getAll()
{
    ArrayList<service> Listservice = new ArrayList();
    ResultSet rs = DBHelper.selectQuery("SELECT * FROM service");
    try
    {
        while(rs.next())
        {
            service serv = new service();
            serv.setId_service(rs.getInt("id_service"));
            serv.setName(rs.getString("ServiceName"));
            serv.setDuration(rs.getInt("ServiceDuration"));
            serv.setPrice(rs.getInt("ServicePrice"));
     
            Listservice.add(serv);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return Listservice;
}
    
    public void save() {
    if(getById(id_service).getId_service() == 0)
    {
        String SQL = "INSERT INTO service (ServiceName, ServiceDuration, ServicePrice) VALUES(" 
                + "  '" + this.name + "',   "
                + "  '" + this.duration + "',   "
                + "  '" + this.price + "'   "
                + "     )";
        this.id_service = DBHelper.insertQueryGetId(SQL);
    }   
    else{
        String SQL = "UPDATE service SET "
                + "ServiceName = '" + this.name + "',   "
                + "ServiceDuration = '" + this.duration + "',   "
                + "ServicePrice = '" + this.price + "',   "
                + " WHERE id_service = '" + this.id_service + "' ";
        DBHelper.executeQuery(SQL);
    }
}
    
    
    @Override
    public String toString(){
    return name;
}
    
}
