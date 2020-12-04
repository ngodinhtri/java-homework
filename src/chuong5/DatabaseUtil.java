/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DatabaseUtil {

    public static Connection conn = null;
    private static String db_url = "jdbc:mysql://localhost:3306/quanlysinhvien_db";
    private static String username = "root";
    private static String passsword = "";

    //Kết nối csdl
    public static Connection getConnection() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(db_url, username, passsword);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }

    //Ghi dl xuống csdl
    public static int setData(String sql) {
        int iResult = 0;
        try {
            iResult = DatabaseUtil.getConnection().createStatement().executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return iResult;
    }

    //Lấy dl từ csdl
    public static ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            rs = DatabaseUtil.getConnection().createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }

    public static void tao_sp_them_SinhVien() {
        //Tạo sp_them_sinhvien
        try {
            Connection conn = DatabaseUtil.getConnection();
            Statement statement = conn.createStatement();

            String queryDrop = "DROP PROCEDURE IF EXISTS sp_them_sinhvien";

            String queryCreate = "CREATE PROCEDURE sp_them_sinhvien (IN maSV CHAR(10), IN hoTen VARCHAR(50),IN email VARCHAR(50), IN dienThoai CHAR(13))";
            queryCreate += "BEGIN ";
            queryCreate += "INSERT INTO tb_sinhvien(maso, hoten, email, dienthoai) VALUES( maSV, hoTen, email, dienThoai);";
            queryCreate += "END";
            // xóa procedure nếu đã có
            statement.execute(queryDrop);
            // rồi tạo stored procedure mới
            statement.execute(queryCreate);

            System.out.println("sp_them_sinhvien được tạo thành công!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void tao_sp_xoa_SinhVien() {
        //Tạo sp_xoa_sinhvien
        try {
            Connection conn = DatabaseUtil.getConnection();
            Statement statement = conn.createStatement();

            String queryDrop = "DROP PROCEDURE IF EXISTS sp_xoa_sinhvien";

            String queryCreate = "CREATE PROCEDURE sp_xoa_sinhvien (IN maSV CHAR(10))";
            queryCreate += "BEGIN ";
            queryCreate += "DELETE FROM tb_sinhvien WHERE maso = maSV;";
            queryCreate += "END";
            // xóa procedure nếu đã có
            statement.execute(queryDrop);
            // rồi tạo stored procedure mới
            statement.execute(queryCreate);

            System.out.println("sp_xoa_sinhvien được tạo thành công!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void tao_sp_sua_SinhVien() {
        //Tạo sp_sua_sinhvien
        try {
            Connection conn = DatabaseUtil.getConnection();
            Statement statement = conn.createStatement();

            String queryDrop = "DROP PROCEDURE IF EXISTS sp_sua_sinhvien";

            String queryCreate = "CREATE PROCEDURE sp_sua_sinhvien (IN maSV CHAR(10), IN hoTen VARCHAR(50),IN email VARCHAR(50), IN dienThoai CHAR(13))";
            queryCreate += "BEGIN ";
            queryCreate += "UPDATE tb_sinhvien SET hoten = hoTen, email = email, dienthoai = dienThoai WHERE maso = maSV;";
            queryCreate += "END";
            // xóa procedure nếu đã có
            statement.execute(queryDrop);
            // rồi tạo stored procedure mới
            statement.execute(queryCreate);

            System.out.println("sp_sua_sinhvien  được tạo thành công!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void tao_sp_lay_DS_SinhVien() {
        //Tạo sp_sua_sinhvien
        try {
            Connection conn = DatabaseUtil.getConnection();
            Statement statement = conn.createStatement();

            String queryDrop = "DROP PROCEDURE IF EXISTS sp_lay_ds_sinhvien";

            String queryCreate = "CREATE PROCEDURE sp_lay_ds_sinhvien()";
            queryCreate += "BEGIN ";
            queryCreate += "SELECT * FROM tb_sinhvien;";
            queryCreate += "END";
            // xóa procedure nếu đã có
            statement.execute(queryDrop);
            // rồi tạo stored procedure mới
            statement.execute(queryCreate);

            System.out.println("sp_lay_ds_sinhvien được tạo thành công!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void dongCSDL() {
        try {
            Connection conn = DatabaseUtil.getConnection();
            Statement statement = conn.createStatement();
            statement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
