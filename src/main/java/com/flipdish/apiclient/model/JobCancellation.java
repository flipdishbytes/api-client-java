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
 * Job Cancellation
 */
@ApiModel(description = "Job Cancellation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-27T11:41:42.137+01:00")
public class JobCancellation {
  @SerializedName("CanceledBy")
  private String canceledBy = null;

  @SerializedName("ReasonKey")
  private String reasonKey = null;

  @SerializedName("Comment")
  private String comment = null;

  public JobCancellation canceledBy(String canceledBy) {
    this.canceledBy = canceledBy;
    return this;
  }

   /**
   * Canceled By
   * @return canceledBy
  **/
  @ApiModelProperty(value = "Canceled By")
  public String getCanceledBy() {
    return canceledBy;
  }

  public void setCanceledBy(String canceledBy) {
    this.canceledBy = canceledBy;
  }

  public JobCancellation reasonKey(String reasonKey) {
    this.reasonKey = reasonKey;
    return this;
  }

   /**
   * Reason Key
   * @return reasonKey
  **/
  @ApiModelProperty(value = "Reason Key")
  public String getReasonKey() {
    return reasonKey;
  }

  public void setReasonKey(String reasonKey) {
    this.reasonKey = reasonKey;
  }

  public JobCancellation comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment
   * @return comment
  **/
  @ApiModelProperty(value = "Comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCancellation jobCancellation = (JobCancellation) o;
    return Objects.equals(this.canceledBy, jobCancellation.canceledBy) &&
        Objects.equals(this.reasonKey, jobCancellation.reasonKey) &&
        Objects.equals(this.comment, jobCancellation.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canceledBy, reasonKey, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCancellation {\n");
    
    sb.append("    canceledBy: ").append(toIndentedString(canceledBy)).append("\n");
    sb.append("    reasonKey: ").append(toIndentedString(reasonKey)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

