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
import com.flipdish.apiclient.model.FlipdishEventBase;
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
 * Sample payload of a webhook event
 */
@ApiModel(description = "Sample payload of a webhook event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-11T11:43:34.227Z")
public class WebhookEventSample {
  @SerializedName("Type")
  private String type = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Body")
  private FlipdishEventBase body = null;

  public WebhookEventSample type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Event name
   * @return type
  **/
  @ApiModelProperty(value = "Event name")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WebhookEventSample createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Sample event creation date and time
   * @return createTime
  **/
  @ApiModelProperty(value = "Sample event creation date and time")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public WebhookEventSample body(FlipdishEventBase body) {
    this.body = body;
    return this;
  }

   /**
   * Sample event body
   * @return body
  **/
  @ApiModelProperty(value = "Sample event body")
  public FlipdishEventBase getBody() {
    return body;
  }

  public void setBody(FlipdishEventBase body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookEventSample webhookEventSample = (WebhookEventSample) o;
    return Objects.equals(this.type, webhookEventSample.type) &&
        Objects.equals(this.createTime, webhookEventSample.createTime) &&
        Objects.equals(this.body, webhookEventSample.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, createTime, body);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookEventSample {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

