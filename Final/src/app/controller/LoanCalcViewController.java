package app.controller;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import app.StudentCalc;

public class LoanCalcViewController {

	private double LoanAmount;
	private double InterestRate;
	private int Term;
	private double ExtraPayment;
	private boolean Compounds;
	private double FV;
	private Date Start;
	
	private LinkedList<StudentCalc> LoanPayments = new LinkedList<StudentCalc>();
	
	
	
	public LoanCalcViewController(double loanAmount, double interestRate, 
			int term, double extraPayment, 
			boolean compounds, double fV) {
		super();
		
		try {
			Start = new SimpleDateFormat( "yyyy-MM-dd" ).parse( "2019-06-01" );
		} catch (ParseException e) {
		}
		LoanAmount = loanAmount;
		InterestRate = interestRate;
		Term = term;
		ExtraPayment = extraPayment;
		Compounds = compounds;
		FV = fV;
		
		
		int PaymentNbr = 0;
		double dRollingBalance = this.LoanAmount;
		
				
		
		
		
		do 
		{
			StudentCalc p = new StudentCalc(++PaymentNbr, Start, dRollingBalance, this);
			this.LoanPayments.add(p);
			dRollingBalance = p.getBalance();
			
			if (dRollingBalance <= 0)
			{
				this.LoanPayments.getLast().setBalance(0);	
				break;
			}
			
		} while (true);
		
		
		
		
	}
	public double getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	public double getTerm() {
		return Term;
	}
	public void setTerm(int term) {
		Term = term;
	}
	public double getExtraPayment() {
		return ExtraPayment;
	}
	public void setExtraPayment(double extraPayment) {
		ExtraPayment = extraPayment;
	}
	public boolean getCompounds() {
		return Compounds;
	}
	public void setCompounds(boolean compounds) {
		Compounds = compounds;
	}
	public double getFV() {
		return FV;
	}
	public void setFV(double fV) {
		FV = fV;
	}
	
	
	
}