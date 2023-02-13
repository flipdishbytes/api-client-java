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
 * Push Notification
 */
@ApiModel(description = "Push Notification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-13T11:53:43.706Z")
public class PushNotificationResponse {
  @SerializedName("Sent")
  private Boolean sent = null;

  @SerializedName("ScheduledPushNotificationId")
  private Integer scheduledPushNotificationId = null;

  @SerializedName("ScheduledTime")
  private OffsetDateTime scheduledTime = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Message")
  private String message = null;

  public PushNotificationResponse sent(Boolean sent) {
    this.sent = sent;
    return this;
  }

   /**
   * Sent
   * @return sent
  **/
  @ApiModelProperty(value = "Sent")
  public Boolean isSent() {
    return sent;
  }

  public void setSent(Boolean sent) {
    this.sent = sent;
  }

  public PushNotificationResponse scheduledPushNotificationId(Integer scheduledPushNotificationId) {
    this.scheduledPushNotificationId = scheduledPushNotificationId;
    return this;
  }

   /**
   * Push notification identifier
   * @return scheduledPushNotificationId
  **/
  @ApiModelProperty(value = "Push notification identifier")
  public Integer getScheduledPushNotificationId() {
    return scheduledPushNotificationId;
  }

  public void setScheduledPushNotificationId(Integer scheduledPushNotificationId) {
    this.scheduledPushNotificationId = scheduledPushNotificationId;
  }

  public PushNotificationResponse scheduledTime(OffsetDateTime scheduledTime) {
    this.scheduledTime = scheduledTime;
    return this;
  }

   /**
   * UTC Time at which to send the push notification
   * @return scheduledTime
  **/
  @ApiModelProperty(value = "UTC Time at which to send the push notification")
  public OffsetDateTime getScheduledTime() {
    return scheduledTime;
  }

  public void setScheduledTime(OffsetDateTime scheduledTime) {
    this.scheduledTime = scheduledTime;
  }

  public PushNotificationResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the notification
   * @return title
  **/
  @ApiModelProperty(value = "Title of the notification")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PushNotificationResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message of the notification
   * @return message
  **/
  @ApiModelProperty(required = true, value = "Message of the notification")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushNotificationResponse pushNotificationResponse = (PushNotificationResponse) o;
    return Objects.equals(this.sent, pushNotificationResponse.sent) &&
        Objects.equals(this.scheduledPushNotificationId, pushNotificationResponse.scheduledPushNotificationId) &&
        Objects.equals(this.scheduledTime, pushNotificationResponse.scheduledTime) &&
        Objects.equals(this.title, pushNotificationResponse.title) &&
        Objects.equals(this.message, pushNotificationResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, scheduledPushNotificationId, scheduledTime, title, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushNotificationResponse {\n");
    
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    scheduledPushNotificationId: ").append(toIndentedString(scheduledPushNotificationId)).append("\n");
    sb.append("    scheduledTime: ").append(toIndentedString(scheduledTime)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

