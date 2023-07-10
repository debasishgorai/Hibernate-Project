package com.debasish.hibernateproject1;

import java.util.ArrayList;
import java.util.List;
import com.debasish.hibernateproject1.entity.BankAccount;
import com.debasish.hibernateproject1.entity.Customer;
import com.debasish.hibernateproject1.repository.CustomerRepository;
public class App2 {
	public static void main(String[] args) {
		 BankAccount account1 = new BankAccount("Canara","85201477"); 
	      BankAccount account2 = new BankAccount("SBI","85201445"); 
	      BankAccount account3 = new BankAccount("ICICI","85248627"); 
	      BankAccount account4 = new BankAccount("KOTAKA","852124567"); 
	      BankAccount account5 = new BankAccount("AXIS","78951477"); 
	      List<BankAccount>list=new ArrayList<>(); 
	      list.add(account1); 
	      list.add(account2); 
	      list.add(account3); 
	      list.add(account4); 
	      list.add(account5); 

 Customer customer = new Customer("sandy","khordha",list);  
	      CustomerRepository repo = new CustomerRepository(); 
	      repo.saveCustomer(customer);
//	      Customer customer2= repo.getCustomer(1);
//	      List<BankAccount> accounts= customer2.getAccounts();
//	      accounts.forEach(System.out::println);
	}
}
