package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 날짜 : 2024/01/18
 * 이름 : 남가희
 * 내용 : Java Swing 실습하기
 */

public class HelloSwingTest {
	public static void main(String[] args) {
		
		// 윈도우 생성
		JFrame frame=new JFrame("Hello Swing");// 창 이름
		frame.setPreferredSize(new Dimension(300,200));// 창 크기
		frame.pack();// 컴포넌트에 맞게 창의 크기 조정
		frame.setVisible(true);// 창을 표시
		
		// 컨테이너 생성
		Container pane=frame.getContentPane();
		
		// 컴포넌트 배치
		JLabel label=new JLabel("Hello Swing!"); // Hello Swing J라벨 생성
		pane.add(label);// 컨테이너에 추가
		
		JButton button=new JButton("확인"); // 확인 버튼 생성
		pane.add(button);// 컨테이너에 추가
	}

}
