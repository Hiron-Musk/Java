package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/01/22
 * 이름 : 남가희
 * 내용 : Delete 실습하기
 * 
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		String host="jdbc:mysql://127.0.0.1:3306/studydb";
		String user="jsa7868";
		String pass="abc1234";
		
		try {
			//1단계-JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계-데이터베이스 접속
			Connection conn=DriverManager.getConnection(host,user,pass);
			
			//3단계-SQL 실행객체 생성
			Statement stmt=conn.createStatement();
			
			//5단계-SQL 실행
			String sql="DELETE FROM `USER1` WHERE `uid`='J101'";
			stmt.executeUpdate(sql);
			
			// 5단계-결과 처리(SELECT 경우)
			
			// 6단계-접속 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DELETE 완료...");
		
		
	}

}
