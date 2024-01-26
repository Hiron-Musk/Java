package ch09.sec06.exam03;


public class ButtonExample {
	public static void main(String[] args) {
		
		Button btnOk=new Button();
		
		class OkListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
			
		}
		
		btnOk.setClilckListener(new OkListener());
		btnOk.click();
		
		Button btnCancle=new Button();
		
		class CancleListener implements Button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
			
		}
		
		btnCancle.setClilckListener(new CancleListener());
		
		btnCancle.click();
	}

}
