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
import org.threeten.bp.OffsetDateTime;

/**
 * Store note
 */
@ApiModel(description = "Store note")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-11T11:43:34.227Z")
public class StoreNote {
  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Note")
  private String note = null;

  public StoreNote userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User identifier
   * @return userId
  **/
  @ApiModelProperty(value = "User identifier")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public StoreNote createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Create time
   * @return createTime
  **/
  @ApiModelProperty(value = "Create time")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public StoreNote note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Note
   * @return note
  **/
  @ApiModelProperty(value = "Note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreNote storeNote = (StoreNote) o;
    return Objects.equals(this.userId, storeNote.userId) &&
        Objects.equals(this.createTime, storeNote.createTime) &&
        Objects.equals(this.note, storeNote.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, createTime, note);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreNote {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

