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
 * Credit note details
 */
@ApiModel(description = "Credit note details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-03T13:33:49.409+01:00")
public class CreditNoteDetails {
  @SerializedName("RemainingCredit")
  private Double remainingCredit = null;

  public CreditNoteDetails remainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
    return this;
  }

   /**
   * Remaining credit
   * @return remainingCredit
  **/
  @ApiModelProperty(value = "Remaining credit")
  public Double getRemainingCredit() {
    return remainingCredit;
  }

  public void setRemainingCredit(Double remainingCredit) {
    this.remainingCredit = remainingCredit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditNoteDetails creditNoteDetails = (CreditNoteDetails) o;
    return Objects.equals(this.remainingCredit, creditNoteDetails.remainingCredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(remainingCredit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditNoteDetails {\n");
    
    sb.append("    remainingCredit: ").append(toIndentedString(remainingCredit)).append("\n");
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

