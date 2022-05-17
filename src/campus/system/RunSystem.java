package campus.system;

import java.sql.*;
import java.util.Scanner;
import java.sql.SQLException;

public class RunSystem {
    public static ResultSet Rs;
    public static Connection con;
    public static String sql = "SELECT * FROM ";
    public static Statement stmt;
    public static void main(String[] args) throws Exception {
        try {
            ConnectDataBase();
            LoginView Login = new LoginView();
            Login.show();
            Login.setLocation(400, 100);
            Login.setVisible(true);
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void ConnectDataBase() throws SQLException {
        String host = "jdbc:derby://localhost:1527/Campus System";
        String uName = "user1";
        String uPass = "user1";
        con = DriverManager.getConnection(host, uName, uPass);
        stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

    }
}
