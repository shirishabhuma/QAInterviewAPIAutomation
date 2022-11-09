package com.QAInterviewBooks.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"isbn",
"title",
"author",
"review"
})
@Generated("jsonschema2pojo")
public class Book {

@JsonProperty("isbn")
private String isbn;
@JsonProperty("title")
private String title;
@JsonProperty("author")
private String author;
@JsonProperty("review")
private String review;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("isbn")
public String getIsbn() {
return isbn;
}

@JsonProperty("isbn")
public void setIsbn(String isbn) {
this.isbn = isbn;
}

@JsonProperty("title")
public String getTitle() {
return title;
}

@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

@JsonProperty("author")
public String getAuthor() {
return author;
}

@JsonProperty("author")
public void setAuthor(String author) {
this.author = author;
}

@JsonProperty("review")
public String getReview() {
return review;
}

@JsonProperty("review")
public void setReview(String review) {
this.review = review;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}