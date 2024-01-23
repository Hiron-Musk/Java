package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2024/01/23
 * 이름 : 남가희
 * 내용 : PreparedStatement 실습하기
 */

public class PreparedUpdateTest {
	public static void main(String[] args) {
		// DB 정보
		String host="jdbc:mysql://127.0.0.1:3306/studydb";
		String user="jsa7868";
		String pass="abc1234";
		
		try {
		//1단계
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2단계
		Connection conn=DriverManager.getConnection(host,user,pass);
		
		//3단계
		String sql="UPDATE `USER1` SET `hp`=?,`age`=? WHERE `uid`=? ";
		PreparedStatement psmt=conn.prepareStatement(sql);
		psmt.setString(1, "010-1234-1005");
		psmt.setInt(2, 35);
		psmt.setString(3, "B101");
		//4단계
		psmt.executeUpdate();
		//5단계
		
		//6단계
		conn.close();
		psmt.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
		
		
	}

}
