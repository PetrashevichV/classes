package bankinfo.pt.ch.vl;

public class BankInfo {
	private int numOfCard;
	private int numOfBankAccount;

	public BankInfo(int numOfCard, int numOfBankAccount) {
		this.numOfCard = numOfCard;
		this.numOfBankAccount = numOfBankAccount;
	}

	public int getNumOfCard() {
		return numOfCard;
	}

	public void setNumOfCard(int numOfCard) {
		this.numOfCard = numOfCard;
	}

//
	public int getNumOfBankAccount() {
		return numOfBankAccount;
	}

	public void setNumOfBankAccount(int numOfBankAccount) {
		this.numOfBankAccount = numOfBankAccount;
	}

}