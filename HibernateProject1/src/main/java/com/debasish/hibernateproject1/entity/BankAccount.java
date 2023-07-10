package com.debasish.hibernateproject1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity@Table(name="bank_account")
public class BankAccount {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY) 
		private Integer  id;
		@Column(name="bank_name",nullable =false)
		private String bankName; 
		@Column(name="account_number",nullable = true) 
		private String accountNumber;
		public BankAccount() {
			
		}
		public BankAccount(Integer id, String bankName, String accountNumber) {
			super();
			this.id = id;
			this.bankName = bankName;
			this.accountNumber = accountNumber;
		}
		 public BankAccount(String bankName, String accountNumber) {  
			super();
		//	this.id = id;  
			this.bankName = bankName;
			this.accountNumber = accountNumber; }
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		@Override
		public String toString() {
			return "BankAccount [id=" + id + ", bankName=" + bankName + ", accountNumber=" + accountNumber + "]";
		}
		
}
