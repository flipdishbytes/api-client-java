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
 * CspReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-08T15:51:29.369+01:00")
public class CspReport {
  @SerializedName("Document-uri")
  private String documentUri = null;

  @SerializedName("Referrer")
  private String referrer = null;

  @SerializedName("Violated-directive")
  private String violatedDirective = null;

  @SerializedName("Effective-directive")
  private String effectiveDirective = null;

  @SerializedName("Original-policy")
  private String originalPolicy = null;

  @SerializedName("Blocked-uri")
  private String blockedUri = null;

  @SerializedName("Status-code")
  private Integer statusCode = null;

  public CspReport documentUri(String documentUri) {
    this.documentUri = documentUri;
    return this;
  }

   /**
   * Get documentUri
   * @return documentUri
  **/
  @ApiModelProperty(value = "")
  public String getDocumentUri() {
    return documentUri;
  }

  public void setDocumentUri(String documentUri) {
    this.documentUri = documentUri;
  }

  public CspReport referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @ApiModelProperty(value = "")
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public CspReport violatedDirective(String violatedDirective) {
    this.violatedDirective = violatedDirective;
    return this;
  }

   /**
   * Get violatedDirective
   * @return violatedDirective
  **/
  @ApiModelProperty(value = "")
  public String getViolatedDirective() {
    return violatedDirective;
  }

  public void setViolatedDirective(String violatedDirective) {
    this.violatedDirective = violatedDirective;
  }

  public CspReport effectiveDirective(String effectiveDirective) {
    this.effectiveDirective = effectiveDirective;
    return this;
  }

   /**
   * Get effectiveDirective
   * @return effectiveDirective
  **/
  @ApiModelProperty(value = "")
  public String getEffectiveDirective() {
    return effectiveDirective;
  }

  public void setEffectiveDirective(String effectiveDirective) {
    this.effectiveDirective = effectiveDirective;
  }

  public CspReport originalPolicy(String originalPolicy) {
    this.originalPolicy = originalPolicy;
    return this;
  }

   /**
   * Get originalPolicy
   * @return originalPolicy
  **/
  @ApiModelProperty(value = "")
  public String getOriginalPolicy() {
    return originalPolicy;
  }

  public void setOriginalPolicy(String originalPolicy) {
    this.originalPolicy = originalPolicy;
  }

  public CspReport blockedUri(String blockedUri) {
    this.blockedUri = blockedUri;
    return this;
  }

   /**
   * Get blockedUri
   * @return blockedUri
  **/
  @ApiModelProperty(value = "")
  public String getBlockedUri() {
    return blockedUri;
  }

  public void setBlockedUri(String blockedUri) {
    this.blockedUri = blockedUri;
  }

  public CspReport statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @ApiModelProperty(value = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CspReport cspReport = (CspReport) o;
    return Objects.equals(this.documentUri, cspReport.documentUri) &&
        Objects.equals(this.referrer, cspReport.referrer) &&
        Objects.equals(this.violatedDirective, cspReport.violatedDirective) &&
        Objects.equals(this.effectiveDirective, cspReport.effectiveDirective) &&
        Objects.equals(this.originalPolicy, cspReport.originalPolicy) &&
        Objects.equals(this.blockedUri, cspReport.blockedUri) &&
        Objects.equals(this.statusCode, cspReport.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentUri, referrer, violatedDirective, effectiveDirective, originalPolicy, blockedUri, statusCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CspReport {\n");
    
    sb.append("    documentUri: ").append(toIndentedString(documentUri)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    violatedDirective: ").append(toIndentedString(violatedDirective)).append("\n");
    sb.append("    effectiveDirective: ").append(toIndentedString(effectiveDirective)).append("\n");
    sb.append("    originalPolicy: ").append(toIndentedString(originalPolicy)).append("\n");
    sb.append("    blockedUri: ").append(toIndentedString(blockedUri)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

