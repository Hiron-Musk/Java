package ch09.sec07.exam03;

import ch09.sec06.exam03.Button;
import ch09.sec06.exam03.Button.ClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk=new Button();
		
		btnOk.setClilckListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		});
		
		btnOk.click();
		
		Button btnCancle=new Button();
		
		btnCancle.setClilckListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		});
		
		btnCancle.click();
		
		
	}

}
