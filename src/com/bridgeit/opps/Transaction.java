package com.bridgeit.opps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction
{
	private String userName;
	private String symbol;
	private int share;
	private String date;
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	public Transaction() {
		LocalDateTime now=LocalDateTime.now();
		setDate(dtf.format(now).toString());
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getShare() {
		return share;
	}
	public void setShare(int share) {
		this.share = share;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public DateTimeFormatter getDtf() {
		return dtf;
	}
	public void setDtf(DateTimeFormatter dtf) {
		this.dtf = dtf;
	}
	
}