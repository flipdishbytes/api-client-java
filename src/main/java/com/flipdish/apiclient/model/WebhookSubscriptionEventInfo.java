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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-09T13:43:13.963Z")
public class WebhookSubscriptionEventInfo {
  @SerializedName("OwnerUserId")
  private Integer ownerUserId = null;

  @SerializedName("WebhookSubscriptionId")
  private Integer webhookSubscriptionId = null;

  @SerializedName("ClientId")
  private String clientId = null;

  @SerializedName("CallbackUrl")
  private String callbackUrl = null;

  public WebhookSubscriptionEventInfo ownerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * Webhook subscription owner user identifier
   * @return ownerUserId
  **/
  @ApiModelProperty(value = "Webhook subscription owner user identifier")
  public Integer getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public WebhookSubscriptionEventInfo webhookSubscriptionId(Integer webhookSubscriptionId) {
    this.webhookSubscriptionId = webhookSubscriptionId;
    return this;
  }

   /**
   * Webhook subscription identifier
   * @return webhookSubscriptionId
  **/
  @ApiModelProperty(value = "Webhook subscription identifier")
  public Integer getWebhookSubscriptionId() {
    return webhookSubscriptionId;
  }

  public void setWebhookSubscriptionId(Integer webhookSubscriptionId) {
    this.webhookSubscriptionId = webhookSubscriptionId;
  }

  public WebhookSubscriptionEventInfo clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Oauth client identifier
   * @return clientId
  **/
  @ApiModelProperty(value = "Oauth client identifier")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public WebhookSubscriptionEventInfo callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Webhook callback url
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "Webhook callback url")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSubscriptionEventInfo webhookSubscriptionEventInfo = (WebhookSubscriptionEventInfo) o;
    return Objects.equals(this.ownerUserId, webhookSubscriptionEventInfo.ownerUserId) &&
        Objects.equals(this.webhookSubscriptionId, webhookSubscriptionEventInfo.webhookSubscriptionId) &&
        Objects.equals(this.clientId, webhookSubscriptionEventInfo.clientId) &&
        Objects.equals(this.callbackUrl, webhookSubscriptionEventInfo.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerUserId, webhookSubscriptionId, clientId, callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscriptionEventInfo {\n");
    
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    webhookSubscriptionId: ").append(toIndentedString(webhookSubscriptionId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

