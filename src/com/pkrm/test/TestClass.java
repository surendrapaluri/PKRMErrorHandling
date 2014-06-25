package com.pkrm.test;

import com.pkrm.assertservice.CompareAssert;
import com.pkrm.baseexception.PKRMException;


public class TestClass {

	public static void main(String[] args){
		
		
		PKRMException expectedAssert1 = new 
				PKRMException("1008", "FutureStartDate", "START DATE CAN NOT BE GREATER THAN CURRENT DATE.", "400");
		
		PKRMException expectedAssert2 = new 
				PKRMException("1012", "DPMappingFailure", "EMPTY RESPONSE.", "499");
		
		PKRMException expectedAssert3 = new 
				PKRMException("1008", "FutureStartDate", "START DATE CAN NOT BE GREATER THAN CURRENT DATE.", "499");
		
		PKRMException expectedAssert4 = new 
				PKRMException("1012", "DPMappingFailure", "EMPTY RESPONSE.", "400");
		
		
		System.out.println("First one is correct for 400:::::"+CompareAssert.isValidAssert(expectedAssert1));
		
		System.out.println("First one is correct for 499::::::"+CompareAssert.isValidAssert(expectedAssert2));
		
		System.out.println("First one is in-correct for 499:::"+CompareAssert.isValidAssert(expectedAssert3));
		
		System.out.println("First one is in-correct for 400:::"+CompareAssert.isValidAssert(expectedAssert4));
		

		

	}

}
