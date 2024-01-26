package ch09.sec06.exam03;

import ch09.sec06.exam02.Button.ClickListener;

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
