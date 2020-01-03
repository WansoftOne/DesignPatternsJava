package com.wansoft.design.pattern.builder;

public class BankAcount {
	
	public long accountNumber;
	public String owner;
	public String branch;
	public double balance;
	public Object interestRate;

	public static class Builder{
		long accountNumber;
		String owner;
		String branch;
		double balance;
		double interesRate;
		
		public Builder(long accountNumber){
			this.accountNumber =accountNumber;
		}
		
		public Builder atBranch(String branch){
             this.branch = branch;
             return this;
		}
		public Builder openingBalance(double balance){
             this.balance = balance;
             return this;
        }
		public Builder atRate(double interestRate){
			this.interesRate = interestRate;
			return this;
		}
		
        public BankAcount build(){
        	BankAcount account = new BankAcount();  //Since the builder is in the BankAccount class, we can invoke its private constructor.
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interesRate;
            return account;

        }
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("BankAcount: {");
		buffer.append("\"accountNumber\": "+ accountNumber+ ", ");
		buffer.append("\"owner\": "+ owner+ ", ");
		buffer.append("\"branch\": "+ branch+ ", ");
		buffer.append("\"balance\": "+ balance+ ", ");
		buffer.append("\"interesRate\": "+ interestRate+ " }");
		return buffer.toString();
	}
	
}
