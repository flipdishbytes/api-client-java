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
 * Stream
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-31T15:42:54.077Z")
public class Stream {
  @SerializedName("CanRead")
  private Boolean canRead = null;

  @SerializedName("CanSeek")
  private Boolean canSeek = null;

  @SerializedName("CanTimeout")
  private Boolean canTimeout = null;

  @SerializedName("CanWrite")
  private Boolean canWrite = null;

  @SerializedName("Length")
  private Long length = null;

  @SerializedName("Position")
  private Long position = null;

  @SerializedName("ReadTimeout")
  private Integer readTimeout = null;

  @SerializedName("WriteTimeout")
  private Integer writeTimeout = null;

   /**
   * Get canRead
   * @return canRead
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRead() {
    return canRead;
  }

   /**
   * Get canSeek
   * @return canSeek
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanSeek() {
    return canSeek;
  }

   /**
   * Get canTimeout
   * @return canTimeout
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanTimeout() {
    return canTimeout;
  }

   /**
   * Get canWrite
   * @return canWrite
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanWrite() {
    return canWrite;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Long getLength() {
    return length;
  }

  public Stream position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public Stream readTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

   /**
   * Get readTimeout
   * @return readTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getReadTimeout() {
    return readTimeout;
  }

  public void setReadTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
  }

  public Stream writeTimeout(Integer writeTimeout) {
    this.writeTimeout = writeTimeout;
    return this;
  }

   /**
   * Get writeTimeout
   * @return writeTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getWriteTimeout() {
    return writeTimeout;
  }

  public void setWriteTimeout(Integer writeTimeout) {
    this.writeTimeout = writeTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return Objects.equals(this.canRead, stream.canRead) &&
        Objects.equals(this.canSeek, stream.canSeek) &&
        Objects.equals(this.canTimeout, stream.canTimeout) &&
        Objects.equals(this.canWrite, stream.canWrite) &&
        Objects.equals(this.length, stream.length) &&
        Objects.equals(this.position, stream.position) &&
        Objects.equals(this.readTimeout, stream.readTimeout) &&
        Objects.equals(this.writeTimeout, stream.writeTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRead, canSeek, canTimeout, canWrite, length, position, readTimeout, writeTimeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    canTimeout: ").append(toIndentedString(canTimeout)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
    sb.append("    writeTimeout: ").append(toIndentedString(writeTimeout)).append("\n");
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
