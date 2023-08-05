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

/**
 * Rest api error result
 */
@ApiModel(description = "Rest api error result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-05T11:32:36.536+01:00")
public class RestApiErrorResult {
  @SerializedName("Message")
  private String message = null;

  @SerializedName("ErrorCode")
  private Integer errorCode = null;

  @SerializedName("StackTrace")
  private String stackTrace = null;

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

  public RestApiErrorResult errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code
   * @return errorCode
  **/
  @ApiModelProperty(value = "Error code")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public RestApiErrorResult stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Stack trace
   * @return stackTrace
  **/
  @ApiModelProperty(value = "Stack trace")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public RestApiErrorResult errors(List<ValidationErrorResult> errors) {
    this.errors = errors;
    return this;
  }

  public RestApiErrorResult addErrorsItem(ValidationErrorResult errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationErrorResult>();
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
        Objects.equals(this.errorCode, restApiErrorResult.errorCode) &&
        Objects.equals(this.stackTrace, restApiErrorResult.stackTrace) &&
        Objects.equals(this.errors, restApiErrorResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errorCode, stackTrace, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiErrorResult {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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

