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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Http Request and Response Log
 */
@ApiModel(description = "Http Request and Response Log")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-26T16:42:52.258Z")
public class HttpRequestAndResponseLog {
  @SerializedName("Guid")
  private UUID guid = null;

  @SerializedName("Verb")
  private String verb = null;

  @SerializedName("RequestUri")
  private String requestUri = null;

  @SerializedName("StatusCode")
  private Integer statusCode = null;

  @SerializedName("ReasonPhrase")
  private String reasonPhrase = null;

  @SerializedName("CallDurationInMilliseconds")
  private Long callDurationInMilliseconds = null;

  @SerializedName("UserId")
  private String userId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  @SerializedName("CreatedDateTime")
  private String createdDateTime = null;

  @SerializedName("RequestHeaders")
  private Map<String, String> requestHeaders = null;

  @SerializedName("RequestBody")
  private String requestBody = null;

  @SerializedName("RequestLength")
  private Long requestLength = null;

  @SerializedName("ResponseHeaders")
  private Map<String, String> responseHeaders = null;

  @SerializedName("ResponseBody")
  private String responseBody = null;

  @SerializedName("ResponseLength")
  private Long responseLength = null;

  public HttpRequestAndResponseLog guid(UUID guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Id of the log
   * @return guid
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Id of the log")
  public UUID getGuid() {
    return guid;
  }

  public void setGuid(UUID guid) {
    this.guid = guid;
  }

  public HttpRequestAndResponseLog verb(String verb) {
    this.verb = verb;
    return this;
  }

   /**
   * Verb associated with the HTTP call.
   * @return verb
  **/
  @ApiModelProperty(value = "Verb associated with the HTTP call.")
  public String getVerb() {
    return verb;
  }

  public void setVerb(String verb) {
    this.verb = verb;
  }

  public HttpRequestAndResponseLog requestUri(String requestUri) {
    this.requestUri = requestUri;
    return this;
  }

   /**
   * Http request URI.
   * @return requestUri
  **/
  @ApiModelProperty(value = "Http request URI.")
  public String getRequestUri() {
    return requestUri;
  }

  public void setRequestUri(String requestUri) {
    this.requestUri = requestUri;
  }

  public HttpRequestAndResponseLog statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Http response status code.
   * @return statusCode
  **/
  @ApiModelProperty(value = "Http response status code.")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public HttpRequestAndResponseLog reasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
    return this;
  }

   /**
   * Http response status line.
   * @return reasonPhrase
  **/
  @ApiModelProperty(value = "Http response status line.")
  public String getReasonPhrase() {
    return reasonPhrase;
  }

  public void setReasonPhrase(String reasonPhrase) {
    this.reasonPhrase = reasonPhrase;
  }

  public HttpRequestAndResponseLog callDurationInMilliseconds(Long callDurationInMilliseconds) {
    this.callDurationInMilliseconds = callDurationInMilliseconds;
    return this;
  }

   /**
   * Call duration representing the duration of the HTTP call in milliseconds.
   * @return callDurationInMilliseconds
  **/
  @ApiModelProperty(value = "Call duration representing the duration of the HTTP call in milliseconds.")
  public Long getCallDurationInMilliseconds() {
    return callDurationInMilliseconds;
  }

  public void setCallDurationInMilliseconds(Long callDurationInMilliseconds) {
    this.callDurationInMilliseconds = callDurationInMilliseconds;
  }

  public HttpRequestAndResponseLog userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identity of the caller.
   * @return userId
  **/
  @ApiModelProperty(value = "Identity of the caller.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public HttpRequestAndResponseLog ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Ip address of the caller
   * @return ipAddress
  **/
  @ApiModelProperty(value = "Ip address of the caller")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public HttpRequestAndResponseLog createdDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
    return this;
  }

   /**
   * Timestamp at which the HTTP call took place.
   * @return createdDateTime
  **/
  @ApiModelProperty(value = "Timestamp at which the HTTP call took place.")
  public String getCreatedDateTime() {
    return createdDateTime;
  }

  public void setCreatedDateTime(String createdDateTime) {
    this.createdDateTime = createdDateTime;
  }

  public HttpRequestAndResponseLog requestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public HttpRequestAndResponseLog putRequestHeadersItem(String key, String requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new HashMap<String, String>();
    }
    this.requestHeaders.put(key, requestHeadersItem);
    return this;
  }

   /**
   * Http request headers.
   * @return requestHeaders
  **/
  @ApiModelProperty(value = "Http request headers.")
  public Map<String, String> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(Map<String, String> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public HttpRequestAndResponseLog requestBody(String requestBody) {
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Http request body, if any.
   * @return requestBody
  **/
  @ApiModelProperty(value = "Http request body, if any.")
  public String getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(String requestBody) {
    this.requestBody = requestBody;
  }

  public HttpRequestAndResponseLog requestLength(Long requestLength) {
    this.requestLength = requestLength;
    return this;
  }

   /**
   * Http request content-length
   * @return requestLength
  **/
  @ApiModelProperty(value = "Http request content-length")
  public Long getRequestLength() {
    return requestLength;
  }

  public void setRequestLength(Long requestLength) {
    this.requestLength = requestLength;
  }

  public HttpRequestAndResponseLog responseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
    return this;
  }

  public HttpRequestAndResponseLog putResponseHeadersItem(String key, String responseHeadersItem) {
    if (this.responseHeaders == null) {
      this.responseHeaders = new HashMap<String, String>();
    }
    this.responseHeaders.put(key, responseHeadersItem);
    return this;
  }

   /**
   * Http response headers.
   * @return responseHeaders
  **/
  @ApiModelProperty(value = "Http response headers.")
  public Map<String, String> getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Map<String, String> responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public HttpRequestAndResponseLog responseBody(String responseBody) {
    this.responseBody = responseBody;
    return this;
  }

   /**
   * Http response body.
   * @return responseBody
  **/
  @ApiModelProperty(value = "Http response body.")
  public String getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(String responseBody) {
    this.responseBody = responseBody;
  }

  public HttpRequestAndResponseLog responseLength(Long responseLength) {
    this.responseLength = responseLength;
    return this;
  }

   /**
   * Http response content-length
   * @return responseLength
  **/
  @ApiModelProperty(value = "Http response content-length")
  public Long getResponseLength() {
    return responseLength;
  }

  public void setResponseLength(Long responseLength) {
    this.responseLength = responseLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpRequestAndResponseLog httpRequestAndResponseLog = (HttpRequestAndResponseLog) o;
    return Objects.equals(this.guid, httpRequestAndResponseLog.guid) &&
        Objects.equals(this.verb, httpRequestAndResponseLog.verb) &&
        Objects.equals(this.requestUri, httpRequestAndResponseLog.requestUri) &&
        Objects.equals(this.statusCode, httpRequestAndResponseLog.statusCode) &&
        Objects.equals(this.reasonPhrase, httpRequestAndResponseLog.reasonPhrase) &&
        Objects.equals(this.callDurationInMilliseconds, httpRequestAndResponseLog.callDurationInMilliseconds) &&
        Objects.equals(this.userId, httpRequestAndResponseLog.userId) &&
        Objects.equals(this.ipAddress, httpRequestAndResponseLog.ipAddress) &&
        Objects.equals(this.createdDateTime, httpRequestAndResponseLog.createdDateTime) &&
        Objects.equals(this.requestHeaders, httpRequestAndResponseLog.requestHeaders) &&
        Objects.equals(this.requestBody, httpRequestAndResponseLog.requestBody) &&
        Objects.equals(this.requestLength, httpRequestAndResponseLog.requestLength) &&
        Objects.equals(this.responseHeaders, httpRequestAndResponseLog.responseHeaders) &&
        Objects.equals(this.responseBody, httpRequestAndResponseLog.responseBody) &&
        Objects.equals(this.responseLength, httpRequestAndResponseLog.responseLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(guid, verb, requestUri, statusCode, reasonPhrase, callDurationInMilliseconds, userId, ipAddress, createdDateTime, requestHeaders, requestBody, requestLength, responseHeaders, responseBody, responseLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpRequestAndResponseLog {\n");
    
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    verb: ").append(toIndentedString(verb)).append("\n");
    sb.append("    requestUri: ").append(toIndentedString(requestUri)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    reasonPhrase: ").append(toIndentedString(reasonPhrase)).append("\n");
    sb.append("    callDurationInMilliseconds: ").append(toIndentedString(callDurationInMilliseconds)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    createdDateTime: ").append(toIndentedString(createdDateTime)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    requestLength: ").append(toIndentedString(requestLength)).append("\n");
    sb.append("    responseHeaders: ").append(toIndentedString(responseHeaders)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
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

