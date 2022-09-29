/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tapplate file, choose Tools | Tapplates
 * and open the tapplate in the editor.
 */
package backend;

/**
 *
 * @author USER
 */
import java.util.*;
import java.sql.*;
public class appointment extends AAppointment{
    private int id_appoint;
    private String AppointTime, AppointPlace,  AppointDate;
    private customer cust = new customer();
    
    

    public int getId_appoint() {
        return id_appoint;
    }

    public void setId_appoint(int id_appoint) {
        this.id_appoint = id_appoint;
    }

    public String getAppointDate() {
        return AppointDate;
    }

    public void setAppointDate(String AppointDate) {
        this.AppointDate = AppointDate;
    }

    public String getAppointPlace() {
        return AppointPlace;
    }
    
    public void setAppointTime(String AppointTime) {
        this.AppointTime = AppointTime;
    }

    public String getAppointTime() {
        return AppointTime;
    }

    public void setAppointPlace(String AppointPlace) {
        this.AppointPlace = AppointPlace;
    }

    public customer getCust() {
        return cust;
    }

    public void setCust(customer cust) {
        this.cust = cust;
    }

    public appointment(){
        
    }

    public appointment(String AppointDate, String AppointTime, String AppointPlace, customer cust) {
        this.id_appoint = id_appoint;
        this.AppointDate = AppointDate;
        this.AppointTime = AppointTime;
        this.AppointPlace = AppointPlace;
        this.cust = cust;
    }
    
    public appointment getById(int id){
        appointment app = new appointment();
        ResultSet rs = DBHelper.selectQuery("SELECT " 
                + "a.id_appoint as id_appoint,"
                + "a.AppointDate as AppointDate,"
                + "a.AppointTime as AppointTime,"
                + "a.AppointPlace as AppointPlace,"
                + "c.id_custom as id_custom,"
                + "c.Firstname as Firstname,"
                + "c.Lastname as Lastname,"
                + "c.Phone as Phone,"
                + "c.Gender as Gender,"
                + "c.Address as Address "
        + "from appointment a left join customer c on a.id_custom = c.id_custom where a.id_appoint = '" + id + "'");
        try{
            while(rs.next()){
                app = new appointment();
                app.setId_appoint(rs.getInt("id_appoint"));
                app.setAppointDate(rs.getString("AppointDate"));
                app.setAppointDate(rs.getString("AppointTime"));
                app.setAppointPlace(rs.getString("AppointPlace"));
                app.getCust().setId_custom(rs.getInt("id_custom"));
                app.getCust().setFirstname(rs.getString("Firstname"));
                app.getCust().setLastname(rs.getString("Lastname"));
                app.getCust().setPhone(rs.getString("Phone"));
                app.getCust().setGender(rs.getString("Gender"));
                app.getCust().setAddress(rs.getString("Address"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return app;
    }
    
    public ArrayList<appointment> getAll(){
    ArrayList<appointment> Listappointment = new ArrayList();
    ResultSet rs = DBHelper.selectQuery("SELECT "
                + "a.id_appoint as id_appoint,"
                + "a.AppointDate as AppointDate,"
                + "a.AppointTime as AppointTime,"
                + "a.AppointPlace as AppointPlace,"
                + "c.id_custom as id_custom,"
                + "c.Firstname as Firstname,"
                + "c.Lastname as Lastname,"
                + "c.Phone as Phone,"
                + "c.Gender as Gender,"
                + "c.Address as Address "
            + "from appointment a left join customer c on a.id_custom = c.id_custom");
    try
    {
        while(rs.next())
        {
            appointment app = new appointment();
            app.setId_appoint(rs.getInt("id_appoint"));
            app.setAppointDate(rs.getString("AppointDate"));
            app.setAppointTime(rs.getString("AppointTime"));
            app.setAppointPlace(rs.getString("AppointPlace"));
            app.getCust().setId_custom(rs.getInt("id_custom"));
            app.getCust().setFirstname(rs.getString("Firstname"));
            app.getCust().setLastname(rs.getString("Lastname"));
            app.getCust().setPhone(rs.getString("Phone"));
            app.getCust().setGender(rs.getString("Gender"));
            app.getCust().setAddress(rs.getString("Address"));
     
            Listappointment.add(app);
        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return Listappointment;
}
    
    
    
    @Override
    public void save() {
    if(getById(id_appoint).getId_appoint() == 0)
    {
        String SQL = "INSERT INTO appointment (AppointDate, AppointTime, AppointPlace, id_custom) VALUES(" 
                + "  '" + this.AppointDate + "',   "
                + "  '" + this.AppointTime + "',   "
                + "  '" + this.AppointPlace + "',  "
                + "'" + this.getCust().getId_custom() + "' "
                + "     )";
        this.id_appoint = DBHelper.insertQueryGetId(SQL);
    }   
    else{
        String SQL = "UPDATE appointment SET "
                + "AppointDate = '" + this.AppointDate + "',   "
                + "AppointDate = '" + this.AppointTime + "',   "
                + "AppointPlace = '" + this.AppointPlace + "',   "
                + "id_custom = " + this.getCust().getId_custom()+ "' "
                + " WHERE id_appoint = '" + this.id_appoint + "' ";
        DBHelper.executeQuery(SQL);
    }
}
     public void delete(){
        String sql = "Delete from appointment where id_appoint = '" + this.id_appoint + "'";
        DBHelper.executeQuery(sql);
    }
    
    @Override
    public String toString(){
        return AppointPlace;
    }
    
}
