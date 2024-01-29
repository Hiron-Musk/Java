package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deopsit(int money) {
		balance+=money;
	}
	public void witdraw(int money)throws InsufficientException{
		if(balance<money) {
			throw new InsufficientException("잔고부족: "+(money-balance)+" 모자람");
			
		}
		balance-=money;
	}

}
