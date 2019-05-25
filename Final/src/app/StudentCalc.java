package app;

import java.util.Date;
import app.controller.LoanCalcViewController;


public class StudentCalc {
	
	private int PaymentID;
	private Date Due;
	private double Total;
	private LoanCalcViewController Loan;
	private double Balance;
	private double AdditionalPayment;
	private double IPMT;
	private double PPMT;
	
	public StudentCalc(int paymentID, Date due, double balance, LoanCalcViewController loan) {
		super();
		this.Loan = loan;
		PaymentID = paymentID;
		Due = due;
		IPMT  = balance * (Loan.getInterestRate() / 12);
		PPMT = Math.abs(getPPMT());
		Total = PPMT + Loan.getExtraPayment();
		Balance = balance - Total;	
	}

	
	
	
	public int getPaymentID() {
		return PaymentID;
	}



	public void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}



	public Date getDueDate() {
		return Due;
	}



	public void setDueDate(Date due) {
		Due = due;
	}



	public double getIPMT() {
		return IPMT;
	}



	public void setIPMT(double iPMT) {
		IPMT = iPMT;
	}



	public double getTotalPrinciple() {
		return Total;
	}



	public void setTotalPrinciple(double t) {
		Total = t;
	}



	public LoanCalcViewController getLoan() {
		return Loan;
	}



	public void setLoan(LoanCalcViewController loan) {
		Loan = loan;
	}



	public double getBalance() {
		return Balance;
	}



	public void setBalance(double balance) {
		Balance = balance;
	}



	public double getAdditionalPayment() {
		return AdditionalPayment;
	}



	public void setAdditionalPayment(double additionalPayment) {
		AdditionalPayment = additionalPayment;
	}



	public void setPPMT(double pPMT) {
		PPMT = pPMT;
	}


	public double getPPMT() {
		return PPMT;
	}



	

	
}