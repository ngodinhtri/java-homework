/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Kết nối với CSDL
 */
public class Demo {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            //Kết nối CSDL
            String dbURL_Mysql = "jdbc:mysql://localhost:3306/quanlysinhvien_db";
            conn = DriverManager.getConnection(dbURL_Mysql, "root","");
            //SQL
            String sql = "insert into MONHOC(ma, ten, sotinchi) values (?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "MH02");
            statement.setString(2, "Lap trinh C#");
            statement.setInt(3, 3);
            //Execute
            int rowInserted = statement.executeUpdate();
            if (rowInserted > 0) {
                System.out.println("Môn học đã được thêm thành công");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
