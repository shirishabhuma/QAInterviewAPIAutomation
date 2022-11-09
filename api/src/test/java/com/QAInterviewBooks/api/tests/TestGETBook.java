package com.QAInterviewBooks.api.tests;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.QAInterviewBooks.api.helpers.BookServiceHelper;

import io.restassured.RestAssured;

public class TestGETBook {
	
	private BookServiceHelper bookServiceHelper;
	
	
	@BeforeClass
	public void init()
	{
		 bookServiceHelper = new BookServiceHelper();
		
	}	
	
	@Test
	public void testGetBook()
	{
		String isbn = bookServiceHelper.GetSingleBook(111114).jsonPath().getString("isbn");
		System.out.println(isbn);
		
		System.out.println("testing");
		
	

		
		
		//assertNotNull(isbn,"Book ISBN is getting details");
	}
	
	
	

}
