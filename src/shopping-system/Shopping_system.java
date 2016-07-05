package shopping_system;

import java.sql.*;

public class Shopping_system {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
                new login().setVisible(true);
            }
        });
        
        /*Connection conn= null;
        Statement stmt= null;
        int id_in=12;
        String name_in="deep_fin";
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Connecting to database....");
            conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","konvictstar");
            System.out.println("Creating statement.....");
            stmt = conn.createStatement();
            
            String sql_query;
            sql_query="insert into tabl values('"+id_in+"','"+name_in+"')";
            stmt.executeQuery(sql_query);
            
            sql_query="SELECT ID,NAME FROM tabl";
            ResultSet rs = stmt.executeQuery(sql_query);
            while(rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                System.out.print(id+" ");
                System.out.println(name);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye!!");*/
    }
}