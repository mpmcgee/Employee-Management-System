package employees;

import java.sql.*;


public class conn {

    public Connection c;
    public Statement s;

    public conn(){
        try{
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp_db", "root", "");
            s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}
