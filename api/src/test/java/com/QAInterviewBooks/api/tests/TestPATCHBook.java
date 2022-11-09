package com.QAInterviewBooks.api.tests;


import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.QAInterviewBooks.api.helpers.BookServiceHelper;


public class TestPATCHBook {

	
	 private BookServiceHelper bookServiceHelper;
		
		@BeforeClass
	    public void init()
		{
			 bookServiceHelper = new BookServiceHelper();
			 //System.out.println("Before Init");
		}	
	
}
