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
 * Job Proof
 */
@ApiModel(description = "Job Proof")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T13:06:38.270Z")
public class JobProof {
  @SerializedName("SignatureUrl")
  private String signatureUrl = null;

  public JobProof signatureUrl(String signatureUrl) {
    this.signatureUrl = signatureUrl;
    return this;
  }

   /**
   * Signature Url
   * @return signatureUrl
  **/
  @ApiModelProperty(value = "Signature Url")
  public String getSignatureUrl() {
    return signatureUrl;
  }

  public void setSignatureUrl(String signatureUrl) {
    this.signatureUrl = signatureUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobProof jobProof = (JobProof) o;
    return Objects.equals(this.signatureUrl, jobProof.signatureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProof {\n");
    
    sb.append("    signatureUrl: ").append(toIndentedString(signatureUrl)).append("\n");
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

