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
import com.flipdish.apiclient.model.Stream;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HttpPostedFileBase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-17T06:46:32.991Z")
public class HttpPostedFileBase {
  @SerializedName("ContentLength")
  private Integer contentLength = null;

  @SerializedName("ContentType")
  private String contentType = null;

  @SerializedName("FileName")
  private String fileName = null;

  @SerializedName("InputStream")
  private Stream inputStream = null;

   /**
   * Get contentLength
   * @return contentLength
  **/
  @ApiModelProperty(value = "")
  public Integer getContentLength() {
    return contentLength;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(value = "")
  public String getContentType() {
    return contentType;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

   /**
   * Get inputStream
   * @return inputStream
  **/
  @ApiModelProperty(value = "")
  public Stream getInputStream() {
    return inputStream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpPostedFileBase httpPostedFileBase = (HttpPostedFileBase) o;
    return Objects.equals(this.contentLength, httpPostedFileBase.contentLength) &&
        Objects.equals(this.contentType, httpPostedFileBase.contentType) &&
        Objects.equals(this.fileName, httpPostedFileBase.fileName) &&
        Objects.equals(this.inputStream, httpPostedFileBase.inputStream);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLength, contentType, fileName, inputStream);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpPostedFileBase {\n");
    
    sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
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

