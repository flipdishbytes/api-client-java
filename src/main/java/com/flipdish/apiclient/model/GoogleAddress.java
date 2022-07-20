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
import com.flipdish.apiclient.model.GoogleAddressResult;
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
 * GoogleAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-20T13:59:48.716+01:00")
public class GoogleAddress {
  @SerializedName("Results")
  private List<GoogleAddressResult> results = null;

  @SerializedName("Result")
  private GoogleAddressResult result = null;

  @SerializedName("Status")
  private String status = null;

  public GoogleAddress results(List<GoogleAddressResult> results) {
    this.results = results;
    return this;
  }

  public GoogleAddress addResultsItem(GoogleAddressResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<GoogleAddressResult>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<GoogleAddressResult> getResults() {
    return results;
  }

  public void setResults(List<GoogleAddressResult> results) {
    this.results = results;
  }

  public GoogleAddress result(GoogleAddressResult result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public GoogleAddressResult getResult() {
    return result;
  }

  public void setResult(GoogleAddressResult result) {
    this.result = result;
  }

  public GoogleAddress status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleAddress googleAddress = (GoogleAddress) o;
    return Objects.equals(this.results, googleAddress.results) &&
        Objects.equals(this.result, googleAddress.result) &&
        Objects.equals(this.status, googleAddress.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, result, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleAddress {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

