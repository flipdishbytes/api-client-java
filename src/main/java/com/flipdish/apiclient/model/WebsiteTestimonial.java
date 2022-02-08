/*
 * Flipdish Open API v1.0
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.flipdish.apiclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a testimonial
 */
@ApiModel(description = "Represents a testimonial")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class WebsiteTestimonial {
  @SerializedName("TestimonialId")
  private Integer testimonialId = null;

  @SerializedName("Author")
  private String author = null;

  @SerializedName("Message")
  private String message = null;

  public WebsiteTestimonial testimonialId(Integer testimonialId) {
    this.testimonialId = testimonialId;
    return this;
  }

   /**
   * Id of the testimonial
   * @return testimonialId
  **/
  @ApiModelProperty(value = "Id of the testimonial")
  public Integer getTestimonialId() {
    return testimonialId;
  }

  public void setTestimonialId(Integer testimonialId) {
    this.testimonialId = testimonialId;
  }

  public WebsiteTestimonial author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Author of the testimonial
   * @return author
  **/
  @ApiModelProperty(value = "Author of the testimonial")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public WebsiteTestimonial message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message of the testimonial
   * @return message
  **/
  @ApiModelProperty(value = "Message of the testimonial")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteTestimonial websiteTestimonial = (WebsiteTestimonial) o;
    return Objects.equals(this.testimonialId, websiteTestimonial.testimonialId) &&
        Objects.equals(this.author, websiteTestimonial.author) &&
        Objects.equals(this.message, websiteTestimonial.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testimonialId, author, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteTestimonial {\n");
    
    sb.append("    testimonialId: ").append(toIndentedString(testimonialId)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
