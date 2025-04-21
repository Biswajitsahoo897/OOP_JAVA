package Experiment_11;
import java.sql.*;
import java.util.Scanner;

public class StudentDatabaseJDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/students_cgu", "root", "biswajit@5002");
            System.out.println("Connected to the database.");

            Statement stmt = con.createStatement();
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                                 "reg_no INT PRIMARY KEY, " +
                                 "name VARCHAR(50), " +
                                 "branch VARCHAR(10), " +
                                 "email VARCHAR(50), " +
                                 "phone VARCHAR(15))";
            stmt.executeUpdate(createTable);

            String query1 = "INSERT INTO student VALUES (101, 'Raj', 'CSE', 'Raj@123.com', '1234567801')";
            String query2 = "INSERT INTO student VALUES (102, 'Amar', 'CSFE', 'Amar@gmail.com', '4845744771')";
            String query3 = "INSERT INTO student VALUES (103, 'Faran', 'CSD', 'farhan.qfm.com', '4185741874')";

            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);
            stmt.executeUpdate(query3);

            System.out.println("Records inserted using Statement.");

            String update1 = "UPDATE student SET name='Amar Raj', branch='CSSE' WHERE reg_no=102";
            String update2 = "UPDATE student SET branch='Mech', phone='9114254740' WHERE reg_no=103";

            stmt.executeUpdate(update1);
            stmt.executeUpdate(update2);

            System.out.println("Records updated.");

            String insertSQL = "INSERT INTO student VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertSQL);

            pstmt.setInt(1, 104);
            pstmt.setString(2, "Meera");
            pstmt.setString(3, "IT");
            pstmt.setString(4, "meera@gmail.com");
            pstmt.setString(5, "9988776655");
            pstmt.executeUpdate();

            System.out.println("Record inserted using PreparedStatement.");

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("\nRegNo\tName\tBranch\tEmail\tPhone");
            System.out.println("------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%d\t%-10s\t%-6s\t%-20s\t%s\n",
                    rs.getInt("reg_no"),
                    rs.getString("name"),
                    rs.getString("branch"),
                    rs.getString("email"),
                    rs.getString("phone"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            sc.close();
        }
    }
}

