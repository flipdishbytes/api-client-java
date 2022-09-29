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
 * UpdateDriver Push Notification Token
 */
@ApiModel(description = "UpdateDriver Push Notification Token")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-29T11:03:59.009+01:00")
public class UpdateDriverNotificationToken {
  @SerializedName("PushNotificationsToken")
  private String pushNotificationsToken = null;

  public UpdateDriverNotificationToken pushNotificationsToken(String pushNotificationsToken) {
    this.pushNotificationsToken = pushNotificationsToken;
    return this;
  }

   /**
   * Push notifications token, cannot be null
   * @return pushNotificationsToken
  **/
  @ApiModelProperty(required = true, value = "Push notifications token, cannot be null")
  public String getPushNotificationsToken() {
    return pushNotificationsToken;
  }

  public void setPushNotificationsToken(String pushNotificationsToken) {
    this.pushNotificationsToken = pushNotificationsToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDriverNotificationToken updateDriverNotificationToken = (UpdateDriverNotificationToken) o;
    return Objects.equals(this.pushNotificationsToken, updateDriverNotificationToken.pushNotificationsToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushNotificationsToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDriverNotificationToken {\n");
    
    sb.append("    pushNotificationsToken: ").append(toIndentedString(pushNotificationsToken)).append("\n");
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

