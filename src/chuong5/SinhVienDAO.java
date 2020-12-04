/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ngodi
 */
public class SinhVienDAO {

    public static void themSinhVien(SinhVien sv) {
        try {
            Connection conn = DatabaseUtil.getConnection();
            CallableStatement statement = conn.prepareCall("{call sp_them_SinhVien(?,?,?,?)}");
            statement.setString(1, sv.getMaSV());
            statement.setString(2, sv.getHoTen());
            statement.setString(3, sv.getEmail());
            statement.setString(4, sv.getSdt());
            statement.execute();    
            System.out.println("Thêm sinh viên thành công!");
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void xoaSinhVien(String maSV) {
        try {
            Connection conn = DatabaseUtil.getConnection();
            CallableStatement statement = conn.prepareCall("{call sp_xoa_SinhVien(?)}");
            statement.setString(1, maSV);
            statement.execute();    
            System.out.println("Xóa sinh viên có mã "+ maSV +" thành công!");
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void suaSinhVien(SinhVien sv) {
        try {
            Connection conn = DatabaseUtil.getConnection();
            CallableStatement statement = conn.prepareCall("{call sp_sua_SinhVien(?,?,?,?)}");
            statement.setString(1, sv.getMaSV());
            statement.setString(2, sv.getHoTen());
            statement.setString(3, sv.getEmail());
            statement.setString(4, sv.getSdt());
            statement.execute();    
            System.out.println("Sửa sinh viên có mã "+ sv.getMaSV() +" thành công!");
            //conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<SinhVien>  layDSSV()
    {
        ArrayList<SinhVien> rs = new ArrayList<>();
        try{
            Connection conn = DatabaseUtil.getConnection();
            CallableStatement statement = conn.prepareCall("{call sp_lay_ds_SinhVien()}");
            boolean hadResults = statement.execute();
            
            while(hadResults)
            {
                ResultSet resultSet = statement.getResultSet();
                while(resultSet.next())
                {
                    String maSo = resultSet.getString("maso");
                    String hoTen = resultSet.getString("hoten");
                    String email = resultSet.getString("email");
                    String sdt = resultSet.getString("dienthoai");   
                    rs.add(new SinhVien(hoTen, maSo, email, sdt));
                }
                hadResults = statement.getMoreResults();
            }
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return rs;
    }
}
