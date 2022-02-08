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
 * Push Notification Details
 */
@ApiModel(description = "Push Notification Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class PushNotificationRequest {
  @SerializedName("ScheduledTime")
  private OffsetDateTime scheduledTime = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Message")
  private String message = null;

  public PushNotificationRequest scheduledTime(OffsetDateTime scheduledTime) {
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

  public PushNotificationRequest title(String title) {
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

  public PushNotificationRequest message(String message) {
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
    PushNotificationRequest pushNotificationRequest = (PushNotificationRequest) o;
    return Objects.equals(this.scheduledTime, pushNotificationRequest.scheduledTime) &&
        Objects.equals(this.title, pushNotificationRequest.title) &&
        Objects.equals(this.message, pushNotificationRequest.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledTime, title, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushNotificationRequest {\n");
    
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
