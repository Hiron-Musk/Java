package sub5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * 날짜 : 2024/01/11
 * 이름 : 남가희
 * 내용 : Java File 클래스 실습
 */
public class FileTest {
	public static void main(String[] args) {
		
		//File 객체 생성
		String path1="C:\\Users\\java\\Desktop\\File1.txt";
		String path2="C:\\Users\\java\\Desktop\\MyDir";
		
		File f1=new File(path1);
		File f2=new File(path2);
		
		
		
		try {
			//파일 생성
			f1.createNewFile();
			//디렉토리 생성
			f2.mkdir();
			
			//파일 정보
			System.out.println("f1 exists: "+f1.exists());
			System.out.println("f2 exists: "+f2.exists());
			
			System.out.println("f1 isFile: "+f1.isFile());
			System.out.println("f1 isDirectory: "+f1.isDirectory());
			System.out.println("f2 isFile: "+f2.isFile());
			System.out.println("f2 isDirectory: "+f2.isDirectory());
			
			System.out.println("f1 getName: "+f1.getName());
			System.out.println("f2 getName: "+f2.getName());
			System.out.println("f1 gatPath: "+f1.getPath());
			System.out.println("f2 getPath: "+f2.getPath());
			System.out.println("f1 getAbsolutePath: "+f1.getAbsolutePath());
			System.out.println("f2 getAbsolutePath: "+f2.getAbsolutePath());
			
			//파일 삭제
			//f1.delete();
			//f2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Files 실습
		Path source=Paths.get("C:\\Users\\java\\Desktop\\source.txt");
		Path target=Paths.get("C:\\Users\\java\\Desktop\\target.txt");
		Path destination = Paths.get("C:\\Users\\java\\Desktop\\MyDir\\Destination.txt");
		
		try {
			//복사
			Files.copy(source, target);
			
			//이동
			Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
			
			//삭제
			Files.delete(target);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램 종료");
	}

}
