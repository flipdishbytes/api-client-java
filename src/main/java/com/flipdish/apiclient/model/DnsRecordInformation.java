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
 * Holds the information for the A and CNAME Records of a domain.
 */
@ApiModel(description = "Holds the information for the A and CNAME Records of a domain.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-15T14:41:06.949Z")
public class DnsRecordInformation {
  @SerializedName("IsCNameReady")
  private Boolean isCNameReady = null;

  @SerializedName("IsAReady")
  private Boolean isAReady = null;

  @SerializedName("IsApiCNameReady")
  private Boolean isApiCNameReady = null;

  public DnsRecordInformation isCNameReady(Boolean isCNameReady) {
    this.isCNameReady = isCNameReady;
    return this;
  }

   /**
   * indicates whether the CNAME record is ready or not.
   * @return isCNameReady
  **/
  @ApiModelProperty(value = "indicates whether the CNAME record is ready or not.")
  public Boolean isIsCNameReady() {
    return isCNameReady;
  }

  public void setIsCNameReady(Boolean isCNameReady) {
    this.isCNameReady = isCNameReady;
  }

  public DnsRecordInformation isAReady(Boolean isAReady) {
    this.isAReady = isAReady;
    return this;
  }

   /**
   * indicates whether the A record is ready or not.
   * @return isAReady
  **/
  @ApiModelProperty(value = "indicates whether the A record is ready or not.")
  public Boolean isIsAReady() {
    return isAReady;
  }

  public void setIsAReady(Boolean isAReady) {
    this.isAReady = isAReady;
  }

  public DnsRecordInformation isApiCNameReady(Boolean isApiCNameReady) {
    this.isApiCNameReady = isApiCNameReady;
    return this;
  }

   /**
   * indicates whether the API CNAME record is ready or not.
   * @return isApiCNameReady
  **/
  @ApiModelProperty(value = "indicates whether the API CNAME record is ready or not.")
  public Boolean isIsApiCNameReady() {
    return isApiCNameReady;
  }

  public void setIsApiCNameReady(Boolean isApiCNameReady) {
    this.isApiCNameReady = isApiCNameReady;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsRecordInformation dnsRecordInformation = (DnsRecordInformation) o;
    return Objects.equals(this.isCNameReady, dnsRecordInformation.isCNameReady) &&
        Objects.equals(this.isAReady, dnsRecordInformation.isAReady) &&
        Objects.equals(this.isApiCNameReady, dnsRecordInformation.isApiCNameReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCNameReady, isAReady, isApiCNameReady);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsRecordInformation {\n");
    
    sb.append("    isCNameReady: ").append(toIndentedString(isCNameReady)).append("\n");
    sb.append("    isAReady: ").append(toIndentedString(isAReady)).append("\n");
    sb.append("    isApiCNameReady: ").append(toIndentedString(isApiCNameReady)).append("\n");
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

