/**
 * 
 */
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
public class ContactSystem {

	/**
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";

		 String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Contact";

		 String userName="sa";

		 String userPwd="123";			
		 Class.forName(driverName);
		Connection conn1 = DriverManager.getConnection(dbURL, userName, userPwd);// 获取数据库链接
	     PreparedStatement ps1 = null;
	     ResultSet rs1 = null;
	          
	            while(true){
	            		  System.out.println("--------------------欢迎使用通讯录管理系统  --------------------");
	            		  System.out.println("-------------------------by:彭俊文  ---------------------------");
	            		  System.out.println("---------------------1.查询当先已录入信息----------------------");
	            		  System.out.println("-------------------------2.添加一条信息-----------------------");
	            		  System.out.println("-------------------------3.删除一条信息-----------------------");
	            		  System.out.println("----------------------4.修改当前某条信息------------------------");
	            		  System.out.println("---------------------0.退出当前此项系统-------------------------");
	            		  int m = 0;
	            		  Scanner s1 = new Scanner(System.in);
	            		  m = s1.nextInt();
	            		  switch(m){
	            		  case 1:Method.selectmessage();break;
	            		  case 2:Method.addmessage();break;
	            		  case 3:Method.deletmessage();break;
	            		  case 4:Method.updatemessage();break;         		
	            		  case 0:System.out.println("------------------感谢您的使用--------------------");System.exit(0);
	            		  default:System.out.println("----------------请输入正确的数字-------------------\n\n\n");
	            		  }
	            	  }
	}
}

	
	
