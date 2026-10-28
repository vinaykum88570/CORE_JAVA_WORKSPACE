package com.bank.controller;

import com.bank.services.BankStatementTxtFile;
import com.bank.services.SaveCustomerData;
import com.bank.services.ShowCustomerDetail;
import com.bank.services.ShowListOfCustomers;

public class TestApplication {
    public static void main(String[] args) throws Exception {
    	
//    	
//        
//        // Serialize into file Particular 
//    	UserStatementFile.userStatementFile(1);
//       
//      // Get All Statement
//        GetBankStatement.getBankStatemnt();
//       
//    	// Serialize All Customer Records into file 
//    	BankStatementFile.bankStatementFile();
		
    	
    	
    	
    	//1. Insert data into database
    	SaveCustomerData.saveDetails();
	
    	//2. Show All Customer Records 	
//    	ShowListOfCustomers.customerAllDetails1();
    	
    	//3. Show One Customer Records
//    	ShowCustomerDetail.showcustomerDetail(202);
    	
    	//4.Bank Statement File Creation
//    	BankStatementTxtFile.exportAllCustomersToFile();
    }  
}
