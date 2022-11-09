package com.QAInterviewBooks.api.tests;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.QAInterviewBooks.api.helpers.BookServiceHelper;

public class TestPOSTBook {
	 
    private BookServiceHelper bookServiceHelper;
	
	@BeforeClass
    public void init()
	{
		 bookServiceHelper = new BookServiceHelper();
		 //System.out.println("Before Init");
	}	
	
	@Test
	public void testPostCreateBook()
	{
		String isbn = bookServiceHelper.CreateBook().jsonPath().getString("isbn");
		System.out.println(isbn);
		assertNotNull(isbn,"Book ISBN is not null");
	}

}
