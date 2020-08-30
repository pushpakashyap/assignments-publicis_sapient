package com.calculatefeetransaction.sapient;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransactionAttribute {
	private String ExternalTransactionId;
	private String ClientId;
	private String SecurityId;
	private TransactionType transactiontype;
	private Date transactiondate;
	private double marketvalue;
	private PriorityFlag pflag;
	private double processingfee;
	
	
	
	
	public TransactionAttribute(String[] transactionattributes) throws ParseException {
		
		// TODO Auto-generated constructor stub
		this.ExternalTransactionId=transactionattributes[0];
		this.ClientId=transactionattributes[1];
		this.SecurityId=transactionattributes[2];
		this.transactiontype=TransactionType.valueOf(transactionattributes[3]);
		this.marketvalue=Double.valueOf(transactionattributes[4]);
		this.pflag=PriorityFlag.valueOf(transactionattributes[5]);
		this.processingfee=Double.valueOf(transactionattributes[6]);
		this.transactiondate= new SimpleDateFormat("MM/dd/yyy").parse(transactionattributes[7]);
	}


	public String getExternalTransactionId() {
		return ExternalTransactionId;
	}
	
	
	public void setExternalTransactionId(String externalTransactionId) {
		ExternalTransactionId = externalTransactionId;
	}
	
	
	public String getClientId() {
		return ClientId;
	}
	
	
	public void setClientId(String clientId) {
		ClientId = clientId;
	}
	
	
	public String getSecurityId() {
		return SecurityId;
	}
	
	
	public void setSecurityId(String securityId) {
		SecurityId = securityId;
	}
	
	
	public TransactionType getTransactiontype() {
		return transactiontype;
	}
	
	
	public void setTransactiontype(TransactionType transactiontype) {
		this.transactiontype = transactiontype;
	}
	
	
	public Date getTransactiondate() {
		return transactiondate;
	}
	
	
	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}
	
	
	public double getMarketvalue() {
		return marketvalue;
	}
	
	
	public void setMarketvalue(double marketvalue) {
		this.marketvalue = marketvalue;
	}
	
	
	public PriorityFlag getPflag() {
		return pflag;
	}
	
	
	public double getProcessingfee() {
		return processingfee;
	}


	public void setProcessingfee(double processingfee) {
		this.processingfee = processingfee;
	}


	public void setPflag(PriorityFlag pflag) {
		this.pflag = pflag;
	}
	

}
