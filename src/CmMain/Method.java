package CmMain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author DSSB
 *
 */
public class Method {
	String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";

	 static String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Contact";

	 static String userName="sa";

	 static String userPwd="123";	
	/**
	 * @throws SQLException
	 */

	public static void selectmessage() throws SQLException{
		Connection conn1 = DriverManager.getConnection(dbURL, userName, userPwd);// 获取数据库链接
	     PreparedStatement ps1 = null;
	     ResultSet rs1 = null;
	          try {
	              String sql = "select * from Student";
	              ps1 = conn1.prepareStatement(sql);
	              rs1 = ps1.executeQuery();// 执行查询
	              while (rs1.next()) {// 判断是否还有下一个数据
	                  System.out.println("Sno:" + rs1.getInt("Sno") + "\tgroup:"+ rs1.getInt("group")
	                  + "\tSname:"+ rs1.getString("Sname")+"\tgender"+rs1.getString("gender") +"\tBirthday:"+ rs1.getInt("Birthday")+"\taddress"+rs1.getString("address")
	                  +"\tphone"+rs1.getInt("phone")+"\temail"+rs1.getString("email")+"\n\n\n");
	              }
	          } catch (SQLException e) {
	              e.printStackTrace();
	          } finally {
	              if (rs1 != null) {
	                 try {
	                      rs1.close();// 关闭记录集
	                  } catch (SQLException e) {
	                      e.printStackTrace();
	                  }
	              }
	             if (ps1 != null) {
	                 try {
	                      ps1.close();// 关闭声明
	                  } catch (SQLException e) {
	                      e.printStackTrace();
	                  }
	              }
	              if (conn1 != null) {
	                  try {
	                      conn1.close();// 关闭连接
	                 } catch (SQLException e) {
	                     e.printStackTrace();
               }
	           }
	          }
	}
	/**
	 * @throws SQLException
	 */
	public static void addmessage() throws SQLException{
		Connection conn2 = DriverManager.getConnection(dbURL, userName, userPwd);// 获取数据库链接
        PreparedStatement ps2 = null;
        try {
            String sql = "insert into Student values (?,?,?,?,?,?,?,?)";
            ps2 = conn2.prepareStatement(sql);
          
          	System.out.println("----------请依次输入学号，组号，姓名，性别，生日，地址，电话，邮箱-----------"); 
            String c,d,f,h;
            int a,b,e,g;
            Scanner x1 = new Scanner(System.in);
            Scanner x2 = new Scanner(System.in);
            Scanner x3 = new Scanner(System.in);
            Scanner x4 = new Scanner(System.in);
            Scanner x5 = new Scanner(System.in);
            Scanner x6 = new Scanner(System.in);
            Scanner x7 = new Scanner(System.in);
            Scanner x8 = new Scanner(System.in);
            a = x1.nextInt();
            b = x2.nextInt();
            c = x3.nextLine();
            d = x4.nextLine();
            e = x5.nextInt();
            f = x6.nextLine();
            g = x7.nextInt();
            h = x8.nextLine();
            ps2.setInt(1, a);
            ps2.setInt(2, b);
            ps2.setString(3, c);
            ps2.setString(4, d);
            ps2.setInt(5, e);
            ps2.setString(6, f);
            ps2.setInt(7, g);
            ps2.setString(8, h);
            ps2.executeUpdate();// 执行插入
            System.out.println("------------------添加成功-------------------\n\n\n"); 
          }
         catch (SQLException e) {
            e.printStackTrace();
        } finally {
           if (ps2 != null) {
               try {
                    ps2.close();// 关闭声明
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn2 != null) {
                try {
                    conn2.close();// 关闭连接
               } catch (SQLException e) {
                   e.printStackTrace();
        }
         }
        }
	}
	
	public static void deletmessage() throws SQLException{
		 Connection conn3 = DriverManager.getConnection(dbURL, userName, userPwd);// 获取数据库链接
         PreparedStatement ps3 = null;
         try {
             String sql = "delete from Student where Sno=?";
             ps3 = conn3.prepareStatement(sql);
       
       	  System.out.println("--------------请输入要删除的学生学号----------------");
       	  Scanner m = new Scanner(System.in);
       	  int e = m.nextInt();
       	  ps3.setInt(1, e);
       	  ps3.executeUpdate();//执行删除
       	  System.out.println("------------------删除成功-----------------------\n\n\n");             
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
            if (ps3 != null) {
                try {
                     ps3.close();// 关闭声明
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if (conn3 != null) {
                 try {
                     conn3.close();// 关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
          }
          }
         }
	}
	
	/**
	 * @throws SQLException
	 */
	public static void updatemessage() throws SQLException{
		 Connection conn4 = DriverManager.getConnection(dbURL, userName, userPwd);// 获取数据库链接
         PreparedStatement ps4 = null;
         try {
       	  System.out.println("----------学号，组号，姓名，性别，生日，地址，电话，邮箱-----------");
             String sql = "update Class set Sno=?,group=?, Sname=?, gender=? ,Birthday=? ,address=?,phone=?,email=?,where Sno=?";
             ps4 = conn4.prepareStatement(sql);
       	  
       	  Scanner m = new Scanner(System.in);
          String c,d,f,h;
          int a,b,e,g;
          Scanner x1 = new Scanner(System.in);
          Scanner x2 = new Scanner(System.in);
          Scanner x3 = new Scanner(System.in);
          Scanner x4 = new Scanner(System.in);
          Scanner x5 = new Scanner(System.in);
          Scanner x6 = new Scanner(System.in);
          Scanner x7 = new Scanner(System.in);
          Scanner x8 = new Scanner(System.in);
          a = x1.nextInt();
          b = x2.nextInt();
          c = x3.nextLine();
          d = x4.nextLine();
          e = x5.nextInt();
          f = x6.nextLine();
          g = x7.nextInt();
          h = x8.nextLine();
          ps4.setInt(1, a);
          ps4.setInt(2, b);
          ps4.setString(3, c);
          ps4.setString(4, d);
          ps4.setInt(5, e);
          ps4.setString(6, f);
          ps4.setInt(7, g);
          ps4.setString(8, h);
             ps4.executeUpdate();//执行修改
       	  System.out.println("------------------修改成功-------------------\n\n\n");             
         } catch (SQLException e) {
             e.printStackTrace();
         } finally {
            if (ps4 != null) {
                try {
                     ps4.close();// 关闭声明
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if (conn4 != null) {
                 try {
                     conn4.close();// 关闭连接
                } catch (SQLException e) {
                    e.printStackTrace();
          }
          }
         }
	}
	
}
