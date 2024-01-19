package sub1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
		
	private static List<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
			
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");

			 int choice = scanner.nextInt();

	         switch (choice) {
	         case 1:
	        	 System.out.println("-------------");
	        	 System.out.println("계좌생성");
	        	 System.out.println("-------------");
	        	 createAccount();
	             break;
	         case 2:
	        	 System.out.println("-------------");
	        	 System.out.println("계좌목록");
	        	 System.out.println("-------------");
	        	 accountList();
	             break;
	         case 3:
	        	 System.out.println("-------------");
	        	 System.out.println("예금");
	        	 System.out.println("-------------");
	        	 deposit();
	        	 break;
	         case 4:
	        	 System.out.println("-------------");
	        	 System.out.println("출금");
	        	 System.out.println("-------------");
	        	 withdraw();
	        	 break;
	         case 5:
	        	 run=false;
	        	 System.out.println("프로그램 종료");
	        	 break;
		}
		}
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.print("계좌번호: ");
        String accountNumber = scanner.next();

        System.out.print("계좌주: ");
        String accountName = scanner.next();

        System.out.print("초기입금액: ");
        int initialBalance = scanner.nextInt();

        Account account = new Account();
        account.setAno(accountNumber);
        account.setOwner(accountName);
        account.setBalance(initialBalance);

        accounts.add(account);

        System.out.println("결과: 계좌가 생성되었습니다.");
	}
	

	// 계좌목록보기
	private static void accountList() {	
		 if (accounts.isEmpty()) {
	            System.out.println("생성된 계좌가 없습니다.");
	        } else {
	            System.out.println("계좌 목록:");

	            for (Account account : accounts) {
	                System.out.println(account);
	                }
	            }
	}

	// 예금하기
	private static void deposit() {
		System.out.print("계좌번호: ");
        String accountNumber = scanner.next();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("예금액: ");
            int depositAmount = scanner.nextInt();
            account.deposit(depositAmount);
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
	}

	// 출금하기
	private static void withdraw() {
		System.out.print("계좌번호: ");
        String accountNumber = scanner.next();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.print("출금액: ");
            int withdrawAmount = scanner.nextInt();
            account.withdraw(withdrawAmount);
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
	}

	// Account 리스트에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (Account account : accounts) {
            if (account.getAno().equals(ano)) {
                return account;
            }
        }
        return null;
    }
	}