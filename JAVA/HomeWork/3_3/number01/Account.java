package homework.day3_03.number01;

public class Account {
	private String accountNo = ""; // 계좌번호
	private boolean creditLine=false; // 마이너스통장 유무
	private int creditLineLimit = 0; // 마이너스 금액한도
	private int balance = 0; // 통장잔고

	public Account() {
		super();
	}

	public Account(String accountNo, boolean creditLine, int creditLineLimit, int balance) {
		this.setAccountNo(accountNo);
		this.setCreditLine(creditLine);
		this.setCreditLineLimit(creditLineLimit);
		this.setBalance(balance);
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public boolean isCreditLine() {
		return creditLine;
	}

	public void setCreditLine(boolean creditLine) {
		this.creditLine = creditLine;
	}

	public int getCreditLineLimit() {
		return creditLineLimit;
	}

	public void setCreditLineLimit(int creditLineLimit) {
		this.creditLineLimit = creditLineLimit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void withdraw(int draw) throws Exception {
		if ((this.balance-=draw) <-(this.creditLineLimit)) {
			throw new Exception("잔고부족 출금불가 합니다.");
		}
	}

	public void deposit(int posit) {
		this.balance += posit;
	}

	public String toString() {
		return "계좌정보: " + accountNo + ", 잔고: " + balance + "원" + "   [[ -"
				+ (creditLine ? creditLineLimit + "원 마이너스통장]]" : "");
	}

}
