package sub3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2024/01/11
 * 이름 : 남가희
 * 내용 : Java 역직렬화 실습
 */
public class DeserializeTest2 {
	public static void main(String[] args) {
		
		
		String source="C:\\Users\\java\\Desktop\\Apple.txt";
		
		try {
			//객체를 직렬화 하기 위한 스트림 생성
			FileInputStream fis=new FileInputStream(source);
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			//객체 직렬화
			Apple apple=(Apple)ois.readObject();
			apple.show();
			
			//스트링 해제
			ois.close();
			fis.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}