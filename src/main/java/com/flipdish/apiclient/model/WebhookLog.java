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
import java.util.UUID;

/**
 * Webhook log
 */
@ApiModel(description = "Webhook log")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-09-13T14:46:11.660Z")
public class WebhookLog {
  @SerializedName("WebhookSubscriptionOwnerUserId")
  private Integer webhookSubscriptionOwnerUserId = null;

  @SerializedName("EventCreated")
  private String eventCreated = null;

  @SerializedName("WebhookTriggered")
  private String webhookTriggered = null;

  @SerializedName("WebhookEventName")
  private String webhookEventName = null;

  @SerializedName("WebhookSubscriptionCallbackUrl")
  private String webhookSubscriptionCallbackUrl = null;

  @SerializedName("HttpResponseStatusCode")
  private String httpResponseStatusCode = null;

  @SerializedName("HttpResponseStatus")
  private String httpResponseStatus = null;

  @SerializedName("RequestHeaders")
  private String requestHeaders = null;

  @SerializedName("RequestBody")
  private String requestBody = null;

  @SerializedName("ResponseHeaders")
  private String responseHeaders = null;

  @SerializedName("ResponseBody")
  private String responseBody = null;

  @SerializedName("Duration")
  private String duration = null;

  @SerializedName("RetryCount")
  private Integer retryCount = null;

  @SerializedName("FlipdishWebhookId")
  private UUID flipdishWebhookId = null;

  @SerializedName("Version")
  private String version = null;

  public WebhookLog webhookSubscriptionOwnerUserId(Integer webhookSubscriptionOwnerUserId) {
    this.webhookSubscriptionOwnerUserId = webhookSubscriptionOwnerUserId;
    return this;
  }

   /**
   * Webhook subscription owner user identifier
   * @return webhookSubscriptionOwnerUserId
  **/
  @ApiModelProperty(value = "Webhook subscription owner user identifier")
  public Integer getWebhookSubscriptionOwnerUserId() {
    return webhookSubscriptionOwnerUserId;
  }

  public void setWebhookSubscriptionOwnerUserId(Integer webhookSubscriptionOwnerUserId) {
    this.webhookSubscriptionOwnerUserId = webhookSubscriptionOwnerUserId;
  }

  public WebhookLog eventCreated(String eventCreated) {
    this.eventCreated = eventCreated;
    return this;
  }

   /**
   * Event created
   * @return eventCreated
  **/
  @ApiModelProperty(value = "Event created")
  public String getEventCreated() {
    return eventCreated;
  }

  public void setEventCreated(String eventCreated) {
    this.eventCreated = eventCreated;
  }

  public WebhookLog webhookTriggered(String webhookTriggered) {
    this.webhookTriggered = webhookTriggered;
    return this;
  }

   /**
   * Webhook triggered
   * @return webhookTriggered
  **/
  @ApiModelProperty(value = "Webhook triggered")
  public String getWebhookTriggered() {
    return webhookTriggered;
  }

  public void setWebhookTriggered(String webhookTriggered) {
    this.webhookTriggered = webhookTriggered;
  }

  public WebhookLog webhookEventName(String webhookEventName) {
    this.webhookEventName = webhookEventName;
    return this;
  }

   /**
   * Webhook event name
   * @return webhookEventName
  **/
  @ApiModelProperty(value = "Webhook event name")
  public String getWebhookEventName() {
    return webhookEventName;
  }

  public void setWebhookEventName(String webhookEventName) {
    this.webhookEventName = webhookEventName;
  }

  public WebhookLog webhookSubscriptionCallbackUrl(String webhookSubscriptionCallbackUrl) {
    this.webhookSubscriptionCallbackUrl = webhookSubscriptionCallbackUrl;
    return this;
  }

   /**
   * Webhook subscription callback url
   * @return webhookSubscriptionCallbackUrl
  **/
  @ApiModelProperty(value = "Webhook subscription callback url")
  public String getWebhookSubscriptionCallbackUrl() {
    return webhookSubscriptionCallbackUrl;
  }

  public void setWebhookSubscriptionCallbackUrl(String webhookSubscriptionCallbackUrl) {
    this.webhookSubscriptionCallbackUrl = webhookSubscriptionCallbackUrl;
  }

  public WebhookLog httpResponseStatusCode(String httpResponseStatusCode) {
    this.httpResponseStatusCode = httpResponseStatusCode;
    return this;
  }

   /**
   * Received HTTP repsonse status HTTP code
   * @return httpResponseStatusCode
  **/
  @ApiModelProperty(value = "Received HTTP repsonse status HTTP code")
  public String getHttpResponseStatusCode() {
    return httpResponseStatusCode;
  }

  public void setHttpResponseStatusCode(String httpResponseStatusCode) {
    this.httpResponseStatusCode = httpResponseStatusCode;
  }

  public WebhookLog httpResponseStatus(String httpResponseStatus) {
    this.httpResponseStatus = httpResponseStatus;
    return this;
  }

   /**
   * Received HTTP repsonse status
   * @return httpResponseStatus
  **/
  @ApiModelProperty(value = "Received HTTP repsonse status")
  public String getHttpResponseStatus() {
    return httpResponseStatus;
  }

  public void setHttpResponseStatus(String httpResponseStatus) {
    this.httpResponseStatus = httpResponseStatus;
  }

  public WebhookLog requestHeaders(String requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

   /**
   * Request headers
   * @return requestHeaders
  **/
  @ApiModelProperty(value = "Request headers")
  public String getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(String requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public WebhookLog requestBody(String requestBody) {
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Request body
   * @return requestBody
  **/
  @ApiModelProperty(value = "Request body")
  public String getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }

  public WebhookLog responseHeaders(String responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

   /**
   * Received response headers
   * @return responseHeaders
  **/
  @ApiModelProperty(value = "Received response headers")
  public String getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(String responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public WebhookLog responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Received response body
   * @return responseBody
  **/
  @ApiModelProperty(value = "Received response body")
  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }

  public WebhookLog duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration of HTTP request
   * @return duration
  **/
  @ApiModelProperty(value = "Duration of HTTP request")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public WebhookLog retryCount(Integer retryCount) {
    this.retryCount = retryCount;
    return this;
  }

   /**
   * Retry count
   * @return retryCount
  **/
  @ApiModelProperty(value = "Retry count")
  public Integer getRetryCount() {
    return retryCount;
  }

  public void setRetryCount(Integer retryCount) {
    this.retryCount = retryCount;
  }

  public WebhookLog flipdishWebhookId(UUID flipdishWebhookId) {
    this.flipdishWebhookId = flipdishWebhookId;
    return this;
  }

   /**
   * Flipdish webhook identifier
   * @return flipdishWebhookId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Flipdish webhook identifier")
  public UUID getFlipdishWebhookId() {
    return flipdishWebhookId;
  }

  public void setFlipdishWebhookId(UUID flipdishWebhookId) {
    this.flipdishWebhookId = flipdishWebhookId;
  }

  public WebhookLog version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Flipdish webhook version
   * @return version
  **/
  @ApiModelProperty(value = "Flipdish webhook version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLog webhookLog = (WebhookLog) o;
    return Objects.equals(this.webhookSubscriptionOwnerUserId, webhookLog.webhookSubscriptionOwnerUserId) &&
        Objects.equals(this.eventCreated, webhookLog.eventCreated) &&
        Objects.equals(this.webhookTriggered, webhookLog.webhookTriggered) &&
        Objects.equals(this.webhookEventName, webhookLog.webhookEventName) &&
        Objects.equals(this.webhookSubscriptionCallbackUrl, webhookLog.webhookSubscriptionCallbackUrl) &&
        Objects.equals(this.httpResponseStatusCode, webhookLog.httpResponseStatusCode) &&
        Objects.equals(this.httpResponseStatus, webhookLog.httpResponseStatus) &&
        Objects.equals(this.requestHeaders, webhookLog.requestHeaders) &&
        Objects.equals(this.requestBody, webhookLog.requestBody) &&
        Objects.equals(this.responseHeaders, webhookLog.responseHeaders) &&
        Objects.equals(this.responseBody, webhookLog.responseBody) &&
        Objects.equals(this.duration, webhookLog.duration) &&
        Objects.equals(this.retryCount, webhookLog.retryCount) &&
        Objects.equals(this.flipdishWebhookId, webhookLog.flipdishWebhookId) &&
        Objects.equals(this.version, webhookLog.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookSubscriptionOwnerUserId, eventCreated, webhookTriggered, webhookEventName, webhookSubscriptionCallbackUrl, httpResponseStatusCode, httpResponseStatus, requestHeaders, requestBody, responseHeaders, responseBody, duration, retryCount, flipdishWebhookId, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLog {\n");
    
    sb.append("    webhookSubscriptionOwnerUserId: ").append(toIndentedString(webhookSubscriptionOwnerUserId)).append("\n");
    sb.append("    eventCreated: ").append(toIndentedString(eventCreated)).append("\n");
    sb.append("    webhookTriggered: ").append(toIndentedString(webhookTriggered)).append("\n");
    sb.append("    webhookEventName: ").append(toIndentedString(webhookEventName)).append("\n");
    sb.append("    webhookSubscriptionCallbackUrl: ").append(toIndentedString(webhookSubscriptionCallbackUrl)).append("\n");
    sb.append("    httpResponseStatusCode: ").append(toIndentedString(httpResponseStatusCode)).append("\n");
    sb.append("    httpResponseStatus: ").append(toIndentedString(httpResponseStatus)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    flipdishWebhookId: ").append(toIndentedString(flipdishWebhookId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

