package com.QAInterviewBooks.api.helpers;



import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.http.HttpStatus;

import com.QAInterviewBooks.api.constants.Endpoints;
import com.QAInterviewBooks.api.model.Book;
import com.QAInterviewBooks.api.utils.ConfigManager;
//import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
//import com.fasterxml.jackson.core.type.TypeReference; 

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BookServiceHelper {
	
	// Contains funtions which used to fetch data from end points 
	//GET/POST/GET SINGLE/ PATCH/DELTE
	
	//private static final String BASE_URL = "https://fw-qainterview-books-app.azurewebsites.net/api";//ConfigManager.getInstance().getString("baseURL");
	
	private static final String BASE_URL = ConfigManager.getInstance().getString("baseURL");;
	private static final String PORT = "8081";//ConfigManager.getInstance().getString("port");
	
	public BookServiceHelper(){
		RestAssured.baseURI = BASE_URL;
		RestAssured.useRelaxedHTTPSValidation();
		
	}
	
/*	public List<Book> getAllBook()
	{
		Response response = RestAssured.given().contentType(ContentType.JSON).get(Endpoints.GET_ALL_BOOKS).andReturn();
		
		//Type type = new TypeReference<List<Book>>()
	}*/;
	
	
	public Response CreateBook(){
		System.out.println("Hello Iam in create book");
		
		Book book = new Book();
		book.setIsbn("111115");
		book.setTitle("4WAR");
		book.setAuthor("4Author");
		book.setReview("4Review");
		
		//String book = null;
		Response response = RestAssured.given().contentType(ContentType.JSON).when().body(book).post(Endpoints.CREATE_BOOKS).andReturn();
		
		assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED,"Created");
		
		return response;
		
	
	};
	
	
	public Response GetSingleBook(Integer isbn){
		System.out.println("Hello Iam fetching A book");
		System.out.println(Endpoints.GET_SINGLE_BOOKS);
		
		Book book = new Book();
		Response response = RestAssured.given().contentType(ContentType.JSON).pathParam("isbn",isbn).when().body(book).get(Endpoints.GET_SINGLE_BOOKS).andReturn();
		
		System.out.println(response);
		
	
		assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
		
		return response;
		
	
	};
	
	
	

}
