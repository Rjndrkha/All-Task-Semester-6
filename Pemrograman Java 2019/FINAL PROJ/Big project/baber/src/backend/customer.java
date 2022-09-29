/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author ARUM
 */
import java.util.*;
import java.sql.*;
public class customer {

    private int id_custom;
    private String firstname, lastname,  phone, gender, address;
    private service servis = new service();

    public int getId_custom() {
        return id_custom;
    }

    public void setId_custom(int id_custom) {
        this.id_custom = id_custom;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public service getServis() {
        return servis;
    }

    public void setServis(service servis) {
        this.servis = servis;
    }
    
    public customer(){
    }

    public customer(String firstname, String lastname, String phone, String gender, String address, service servis) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.servis = servis;
    }
     

    public customer getById(int id){
        customer cust = new customer();
        ResultSet rs = DBHelper.selectQuery("SELECT "
                + "c.id_custom as id_custom,"
                + "c.Firstname as Firstname,"
                + "c.Lastname as Lastname,"
                + "c.Phone as Phone,"
                + "c.Gender as Gender,"
                + "c.Address as Address, "
                + "s.id_service as id_service,"
                + "s.ServiceName as ServiceName,"
                + "s.ServiceDuration as ServiceDuration,"
                + "s.ServicePrice as ServicePrice "
        + "from customer c left join service s on c.id_service = s.id_service where c.id_custom = '" + id + "'");
        try{
            while(rs.next()){
                cust = new customer();
                cust.setId_custom(rs.getInt("id_custom"));
                cust.setFirstname(rs.getString("Firstname"));
                cust.setLastname(rs.getString("Lastname"));
                cust.setPhone(rs.getString("Phone"));
                cust.setGender(rs.getString("Gender"));
                cust.setAddress(rs.getString("Address"));
                cust.getServis().setId_service(rs.getInt("id_service"));
                cust.getServis().setName(rs.getString("ServiceName"));
                cust.getServis().setDuration(rs.getInt("ServiceDuration"));
                cust.getServis().setPrice(rs.getInt("ServicePrice"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return cust;
    }
    
    public ArrayList<customer> getAll(){
    ArrayList<customer> Listcustomer = new ArrayList();
    ResultSet rs = DBHelper.selectQuery("SELECT "
                + "c.id_custom as id_custom,"
                + "c.Firstname as Firstname,"
                + "c.Lastname as Lastname,"
                + "c.Phone as Phone,"
                + "c.Gender as Gender,"
                + "c.Address as Address, "
                + "s.id_service as id_service,"
                + "s.ServiceName as ServiceName,"
                + "s.ServiceDuration as ServiceDuration,"
                + "s.ServicePrice as ServicePrice "
            + "from customer c left join service s on c.id_service = s.id_service");
    try
    {
        while(rs.next())
        {
            customer cust = new customer();
                cust.setId_custom(rs.getInt("id_custom"));
                cust.setFirstname(rs.getString("Firstname"));
                cust.setLastname(rs.getString("Lastname"));
                cust.setPhone(rs.getString("Phone"));
                cust.setGender(rs.getString("Gender"));
                cust.setAddress(rs.getString("Address"));
                cust.getServis().setId_service(rs.getInt("id_service"));
                cust.getServis().setName(rs.getString("ServiceName"));
                cust.getServis().setDuration(rs.getInt("ServiceDuration"));
                cust.getServis().setPrice(rs.getInt("ServicePrice"));
     
            Listcustomer.add(cust);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return Listcustomer;
}
    
    public void save() {
    if(getById(id_custom).getId_custom() == 0)
    {
        String SQL = "INSERT INTO customer (Firstname, Lastname, Phone, Gender, Address, id_service) VALUES(" 
                + "  '" + this.firstname + "',   "
                + "  '" + this.lastname + "',   "
                + "  '" + this.phone + "',  "
                + "  '" + this.gender + "',  "
                + "  '" + this.address + "',  "
                + "'" + this.getServis().getId_service() + "' "
                + "     )";
        this.id_custom = DBHelper.insertQueryGetId(SQL);
    }   
    else{
        String SQL = "UPDATE customer SET "
                + "Firstname = '" + this.firstname + "',   "
                + "Lastname = '" + this.lastname + "',   "
                + "Phone = '" + this.phone + "',   "
                + "Gender = '" + this.gender + "',   "
                + "Address = '" + this.address + "',   "
                + "id_service = " + this.getServis().getId_service()+ "' "
                + " WHERE id_custom = '" + this.id_custom + "' ";
        DBHelper.executeQuery(SQL);
    }
}
    
     public ArrayList<customer> search(String keyword){
    ArrayList<customer> Listcustomer = new ArrayList();
    ResultSet rs = DBHelper.selectQuery("SELECT "
                + "c.id_custom as id_custom,"
                + "c.Firstname as Firstname,"
                + "c.Lastname as Lastname,"
                + "c.Phone as Phone,"
                + "c.Gender as Gender,"
                + "c.Address as Address, "
                + "s.id_service as id_service,"
                + "s.ServiceName as ServiceName,"
                + "s.ServiceDuration as ServiceDuration,"
                + "s.ServicePrice as ServicePrice "
            + "from customer c left join service s on c.id_service = s.id_service "
            + "where c.Firstname like '%" + keyword + "%' or c.Lastname like '%" + keyword + "%'"
                + " or c.Phone like '%" + keyword + "%' or c.Gender like '%" + keyword + "%'"
                + " or c.Address like '%" + keyword + "%'" );
    try
    {
        while(rs.next())
        {
            customer cust = new customer();
                cust.setId_custom(rs.getInt("id_custom"));
                cust.setFirstname(rs.getString("Firstname"));
                cust.setLastname(rs.getString("Lastname"));
                cust.setPhone(rs.getString("Phone"));
                cust.setGender(rs.getString("Gender"));
                cust.setAddress(rs.getString("Address"));
                cust.getServis().setId_service(rs.getInt("id_service"));
                cust.getServis().setName(rs.getString("ServiceName"));
                cust.getServis().setDuration(rs.getInt("ServiceDuration"));
                cust.getServis().setPrice(rs.getInt("ServicePrice"));
     
            Listcustomer.add(cust);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return Listcustomer;
}
    
    public void delete() {
    String SQL = "DELETE FROM customer WHERE id_custom = '" 
            + this.id_custom + "'";
    DBHelper.executeQuery(SQL);
}
    
    public ArrayList<customer>getByFullCust(String firstname, String lastname, String phone, String gender, String address) {
        ArrayList<customer> Listcustomer = new ArrayList();
        ResultSet rs;
        
        if((firstname.trim().length()>0) && (lastname.trim().length()>0) && (phone.trim().length()>0) && (gender.trim().length()>0) && (address.trim().length()>0)) {
            rs = DBHelper.selectQuery("SELECT * FROM customer WHERE Firstname = '" + firstname + "' AND Lastname = '" + lastname + "' AND Phone = '"+ phone + "' AND Gender = '"+ gender + "' AND Address = '"+ address + "'");
        }else if((firstname.trim().length()>0) && (lastname.trim().length()>0) && (phone.trim().length()>0) && (gender.trim().length()>0) && (address.trim().length()==0)) {
            rs = DBHelper.selectQuery("SELECT * FROM customer WHERE Firstname = '" + firstname + "' AND Lastname = '" + lastname + "' AND Phone = '"+ phone + "' AND Gender = '"+ gender + "'");
        }else if((firstname.trim().length()>0) && (lastname.trim().length()>0) && (phone.trim().length()>0) && (gender.trim().length()==0) && (address.trim().length()>0)) {
            rs = DBHelper.selectQuery("SELECT * FROM customer WHERE Firstname = '" + firstname + "' AND Lastname = '" + lastname + "' AND Phone = '"+ phone + "' AND Address = '"+ address + "'");
        }else if((firstname.trim().length()>0) && (lastname.trim().length()>0) && (phone.trim().length()==0) && (gender.trim().length()>0) && (address.trim().length()>0)) {
            rs = DBHelper.selectQuery("SELECT * FROM customer WHERE Firstname = '" + firstname + "' AND Lastname = '" + lastname + "' AND Gender = '"+ gender + "' AND Address = '"+ address + "'");
        }else if((firstname.trim().length()>0) && (lastname.trim().length()==0) && (phone.trim().length()>0) && (gender.trim().length()>0) && (address.trim().length()>0)) {
            rs = DBHelper.selectQuery("SELECT * FROM customer WHERE Firstname = '" + firstname + "' AND Phone = '"+ phone + "' AND Gender = '"+ gender + "' AND Address = '"+ address + "'");
        }else {
            rs = DBHelper.selectQuery("SELECT * FROM customer WHERE Lastname = '" + lastname + "' AND Phone = '"+ phone + "' AND Gender = '"+ gender + "' AND Address = '"+ address + "'");
        }
        
        try {
            while(rs.next()) {
                customer cust = new customer();
                cust.setId_custom(rs.getInt("id_custom"));
                cust.setFirstname(rs.getString("Firstname"));
                cust.setLastname(rs.getString("Lastname"));
                cust.setPhone(rs.getString("Phone"));
                cust.setGender(rs.getString("Gender"));
                cust.setAddress(rs.getString("Address"));
                cust.getServis().setId_service(rs.getInt("id_service"));
     
            Listcustomer.add(cust);
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return Listcustomer;
    }

}

