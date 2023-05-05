/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.*;
import java.util.concurrent.locks.StampedLock;
/**
 *
 * @author Admin
 */
public class TestConnection {
    public Connection conn=null;
    public Connection getConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3307/products";
            conn=DriverManager.getConnection(url,"root","");
            if(conn!=null){
                System.out.println("Ket noi thanh cong!");
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return conn;
    }
    
     public TestConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3307/products";
        this.conn=DriverManager.getConnection(url,"root","");
    }
    
    public ResultSet GetData(String tbName) throws SQLException{
        //cung cap thong tin tu csdl, cho phep truy xuat cac dl
        ResultSet rs=null;
        //phép thực thi các câu lệnh SQL
        Statement statement =this.conn.createStatement();
        String sql="Select * From data";
        rs=statement.executeQuery(sql);
        return rs;
    }
    
    public void Update(int id, String name, int number) throws SQLException {
        Statement sta = this.conn.createStatement();
        String sql1 = "Update data set Name='" + name + "' where ID=" + id + "";
        String sql2 = "Update data set Number=" + number + " where ID=" + id + "";
        sta.executeUpdate(sql1);
        sta.executeUpdate(sql2);
        /*
        được sử dụng để thực thi câu truy vấn được chỉ định, 
        nó có thể là create, drop, insert, update, delete, ...
        */
    }
    
    public void Insert(int id, String name, int number) throws SQLException{
        Statement sta= this.conn.createStatement();
        String sql="Insert Into data Values("+id+",'"+name+"',"+number+")";
        sta.executeUpdate(sql);
    }
    
    public void Delete(int id) throws SQLException{
        Statement sta=this.conn.createStatement();
        String sql ="delete From data where ID Like ="+id+"";
        sta.executeUpdate(sql);
    }
    
    public void Search(int id) throws SQLException{
        Statement sta=this.conn.createStatement();
        String sql ="Select *From data Where  ID ="+id+"";
        sta.executeQuery(sql);
    }
    
    public void SearchTen(String name) throws SQLException{
        Statement sta=this.conn.createStatement();
        String sql ="Select * From data Where Name = '"+name+"'";
        sta.executeQuery(sql);
    }
    public void Close() throws SQLException{
        if(this.conn!=null){
            this.conn.close();
        }
    }
}


/*
+Execute (làm việc đa năng): phương thức này sử dụng khi ta không rõ kiểu của statement.
+PreparedStatement (liên lạc lấy một mặt hàng nhất định): 
sử dụng tốt cho các câu SQL lặp lại nhiều lần, chấp nhận tham số truyền vào.
+ResultSet là một đối tượng Java, nó được trả về khi truy vấn (query) dữ liệu
+execUpdate() : được sử dụng để thực hiện các truy vấn insert/ update/ delete.
+Statement interface trong java cung cấp các phương thức để thực thi các câu lệnh
truy vấn với cơ sở dữ liệu SQL.Statement cung cấp phương thức để tạo ra đối tượng ResultSet.

*/