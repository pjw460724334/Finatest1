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
		Connection conn1 = DriverManager.getConnection(dbURL, userName, userPwd);// ��ȡ���ݿ�����
	     PreparedStatement ps1 = null;
	     ResultSet rs1 = null;
	          
	            while(true){
	            		  System.out.println("--------------------��ӭʹ��ͨѶ¼����ϵͳ  --------------------");
	            		  System.out.println("-------------------------by:����  ---------------------------");
	            		  System.out.println("---------------------1.��ѯ������¼����Ϣ----------------------");
	            		  System.out.println("-------------------------2.���һ����Ϣ-----------------------");
	            		  System.out.println("-------------------------3.ɾ��һ����Ϣ-----------------------");
	            		  System.out.println("----------------------4.�޸ĵ�ǰĳ����Ϣ------------------------");
	            		  System.out.println("---------------------0.�˳���ǰ����ϵͳ-------------------------");
	            		  int m = 0;
	            		  Scanner s1 = new Scanner(System.in);
	            		  m = s1.nextInt();
	            		  switch(m){
	            		  case 1:Method.selectmessage();break;
	            		  case 2:Method.addmessage();break;
	            		  case 3:Method.deletmessage();break;
	            		  case 4:Method.updatemessage();break;         		
	            		  case 0:System.out.println("------------------��л����ʹ��--------------------");System.exit(0);
	            		  default:System.out.println("----------------��������ȷ������-------------------\n\n\n");
	            		  }
	            	  }
	}
}

	
	
