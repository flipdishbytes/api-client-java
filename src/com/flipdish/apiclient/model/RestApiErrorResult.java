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
import com.flipdish.apiclient.model.ValidationErrorResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Rest api error result
 */
@ApiModel(description = "Rest api error result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-21T10:37:59.975Z")
public class RestApiErrorResult implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("Message")
  private String message = null;

  @SerializedName("Errors")
  private List<ValidationErrorResult> errors = null;

  public RestApiErrorResult message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RestApiErrorResult errors(List<ValidationErrorResult> errors) {
    this.errors = errors;
    return this;
  }

  public RestApiErrorResult addErrorsItem(ValidationErrorResult errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of errors grouped by field name
   * @return errors
  **/
  @ApiModelProperty(value = "List of errors grouped by field name")
  public List<ValidationErrorResult> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationErrorResult> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestApiErrorResult restApiErrorResult = (RestApiErrorResult) o;
    return Objects.equals(this.message, restApiErrorResult.message) &&
        Objects.equals(this.errors, restApiErrorResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiErrorResult {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

