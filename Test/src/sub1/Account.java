package sub1;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getAno() {
		return ano;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	
	
	@Override
	public String toString() {
		return ano+"\t"+ owner+"\t"+balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		
	}
	 public void withdraw(int amount) {
	            balance -= amount;
	 }
}
	        
	

	
