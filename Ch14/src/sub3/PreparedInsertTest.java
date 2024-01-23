package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 남가희
 * 내용 : PreparedStatement 실습하기
 */

public class PreparedInsertTest {
	public static void main(String[] args) {
		// DB 정보
		String host="jdbc:mysql://127.0.0.1:3306/studydb";
		String user="jsa7868";
		String pass="abc1234";
		
		try {
			//1단계-JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계-데이터베이스 접속
			Connection conn=DriverManager.getConnection(host,user,pass);
			
			//3단계-SQL 실행 객체 생성 및 맵핑
			String sql="INSERT INTO `USER1` VALUES(?,?,?,?,?)"; // ? : 쿼리 파라미터
			PreparedStatement psmt=conn.prepareStatement(sql);
			//Mapping(사상) Binding 
			psmt.setString(1, "B101");
			psmt.setString(2, "장보고");
			psmt.setString(3, "99-01-01");
			psmt.setString(4, "010-1234-1003");
			psmt.setInt(5, 33);
			
			//4단계-SQL 실행
			psmt.executeUpdate();
			
			//5단계-결과처리(SELECT 경우)
			
			//6단계-데이터베이스 종료
			conn.close();
			psmt.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
		
		
		
	}
	

}
