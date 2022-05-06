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
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook subscription
 */
@ApiModel(description = "Webhook subscription")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-06T10:54:10.532+01:00")
public class WebhookSubscription {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("OwnerUserId")
  private Integer ownerUserId = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("EventNames")
  private List<String> eventNames = null;

  @SerializedName("CallbackUrl")
  private String callbackUrl = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("VerifyToken")
  private String verifyToken = null;

  public WebhookSubscription id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Webhook subscription identifier
   * @return id
  **/
  @ApiModelProperty(value = "Webhook subscription identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WebhookSubscription ownerUserId(Integer ownerUserId) {
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

  public WebhookSubscription version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Webhook subscription owner user identifier
   * @return version
  **/
  @ApiModelProperty(value = "Webhook subscription owner user identifier")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public WebhookSubscription eventNames(List<String> eventNames) {
    this.eventNames = eventNames;
    return this;
  }

  public WebhookSubscription addEventNamesItem(String eventNamesItem) {
    if (this.eventNames == null) {
      this.eventNames = new ArrayList<String>();
    }
    this.eventNames.add(eventNamesItem);
    return this;
  }

   /**
   * Webhook subscription event names
   * @return eventNames
  **/
  @ApiModelProperty(value = "Webhook subscription event names")
  public List<String> getEventNames() {
    return eventNames;
  }

  public void setEventNames(List<String> eventNames) {
    this.eventNames = eventNames;
  }

  public WebhookSubscription callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback url. Flipdish system POST messages to this url.
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "Callback url. Flipdish system POST messages to this url.")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public WebhookSubscription enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Is webhook subscription enabled.
   * @return enabled
  **/
  @ApiModelProperty(value = "Is webhook subscription enabled.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public WebhookSubscription verifyToken(String verifyToken) {
    this.verifyToken = verifyToken;
    return this;
  }

   /**
   * This is your token which will be in the Header of each POST request from Flipdish with name: X-Verify-Token.
   * @return verifyToken
  **/
  @ApiModelProperty(value = "This is your token which will be in the Header of each POST request from Flipdish with name: X-Verify-Token.")
  public String getVerifyToken() {
    return verifyToken;
  }

  public void setVerifyToken(String verifyToken) {
    this.verifyToken = verifyToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSubscription webhookSubscription = (WebhookSubscription) o;
    return Objects.equals(this.id, webhookSubscription.id) &&
        Objects.equals(this.ownerUserId, webhookSubscription.ownerUserId) &&
        Objects.equals(this.version, webhookSubscription.version) &&
        Objects.equals(this.eventNames, webhookSubscription.eventNames) &&
        Objects.equals(this.callbackUrl, webhookSubscription.callbackUrl) &&
        Objects.equals(this.enabled, webhookSubscription.enabled) &&
        Objects.equals(this.verifyToken, webhookSubscription.verifyToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ownerUserId, version, eventNames, callbackUrl, enabled, verifyToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSubscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    eventNames: ").append(toIndentedString(eventNames)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    verifyToken: ").append(toIndentedString(verifyToken)).append("\n");
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

