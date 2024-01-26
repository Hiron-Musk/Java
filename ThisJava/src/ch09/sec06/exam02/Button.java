package ch09.sec06.exam02;

public class Button {
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clilckListener;
	
	public void setClilckListener(ClickListener clilckListener) {
		this.clilckListener = clilckListener;
	}
	

}
