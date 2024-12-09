package backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SubaBaseConnection  {
    public static void main(String[] args) {
        // Thông tin kết nối
        String url = "jdbc:postgresql://aws-0-ap-southeast-1.pooler.supabase.com:6543/postgres?sslmode=require";
        String user = "postgres.davcjvarqrxawvyqqosi";
        String password = "ntOBrJUXwsEYy9ql";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Kết nối thành công với Supabase!");
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại!");
            e.printStackTrace();
        }
    }
}
