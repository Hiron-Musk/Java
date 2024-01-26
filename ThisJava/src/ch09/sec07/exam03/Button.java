package ch09.sec07.exam03;


public class Button {
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clilckListener;
	
	public void setClilckListener(ClickListener clilckListener) {
		this.clilckListener = clilckListener;
	}
	
	public void click() {
		this.clilckListener.onClick();
	}

}
