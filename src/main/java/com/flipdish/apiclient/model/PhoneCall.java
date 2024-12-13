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
 * Phone call
 */
@ApiModel(description = "Phone call")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-12-13T14:18:55.615Z")
public class PhoneCall {
  @SerializedName("PhoneCallId")
  private Integer phoneCallId = null;

  @SerializedName("TimeOfCall")
  private OffsetDateTime timeOfCall = null;

  @SerializedName("TimeOfCallLocal")
  private OffsetDateTime timeOfCallLocal = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("CallerName")
  private String callerName = null;

  @SerializedName("CallerUserId")
  private Integer callerUserId = null;

  @SerializedName("CallerNumber")
  private String callerNumber = null;

  @SerializedName("CallLengthInSeconds")
  private Integer callLengthInSeconds = null;

  /**
   * The status of the call
   */
  @JsonAdapter(CallStatusEnum.Adapter.class)
  public enum CallStatusEnum {
    QUEUED("Queued"),
    
    RINGING("Ringing"),
    
    INPROGRESS("InProgress"),
    
    COMPLETED("Completed"),
    
    FAILED("Failed"),
    
    BUSY("Busy"),
    
    NOANSWER("NoAnswer"),
    
    UNKNOWN("Unknown"),
    
    CANCELED("Canceled");

    private String value;

    CallStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CallStatusEnum fromValue(String text) {
      for (CallStatusEnum b : CallStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CallStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CallStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CallStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CallStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CallStatus")
  private CallStatusEnum callStatus = null;

  public PhoneCall phoneCallId(Integer phoneCallId) {
    this.phoneCallId = phoneCallId;
    return this;
  }

   /**
   * Phone call id
   * @return phoneCallId
  **/
  @ApiModelProperty(value = "Phone call id")
  public Integer getPhoneCallId() {
    return phoneCallId;
  }

  public void setPhoneCallId(Integer phoneCallId) {
    this.phoneCallId = phoneCallId;
  }

  public PhoneCall timeOfCall(OffsetDateTime timeOfCall) {
    this.timeOfCall = timeOfCall;
    return this;
  }

   /**
   * Time of the call
   * @return timeOfCall
  **/
  @ApiModelProperty(value = "Time of the call")
  public OffsetDateTime getTimeOfCall() {
    return timeOfCall;
  }

  public void setTimeOfCall(OffsetDateTime timeOfCall) {
    this.timeOfCall = timeOfCall;
  }

  public PhoneCall timeOfCallLocal(OffsetDateTime timeOfCallLocal) {
    this.timeOfCallLocal = timeOfCallLocal;
    return this;
  }

   /**
   * Time of the call, local to the store to which the call was made
   * @return timeOfCallLocal
  **/
  @ApiModelProperty(value = "Time of the call, local to the store to which the call was made")
  public OffsetDateTime getTimeOfCallLocal() {
    return timeOfCallLocal;
  }

  public void setTimeOfCallLocal(OffsetDateTime timeOfCallLocal) {
    this.timeOfCallLocal = timeOfCallLocal;
  }

  public PhoneCall storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * ID of the store that the call was TO
   * @return storeId
  **/
  @ApiModelProperty(value = "ID of the store that the call was TO")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public PhoneCall storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Name of the store that the call was TO
   * @return storeName
  **/
  @ApiModelProperty(value = "Name of the store that the call was TO")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PhoneCall callerName(String callerName) {
    this.callerName = callerName;
    return this;
  }

   /**
   * Name of the caller
   * @return callerName
  **/
  @ApiModelProperty(value = "Name of the caller")
  public String getCallerName() {
    return callerName;
  }

  public void setCallerName(String callerName) {
    this.callerName = callerName;
  }

  public PhoneCall callerUserId(Integer callerUserId) {
    this.callerUserId = callerUserId;
    return this;
  }

   /**
   * UserID of the caller
   * @return callerUserId
  **/
  @ApiModelProperty(value = "UserID of the caller")
  public Integer getCallerUserId() {
    return callerUserId;
  }

  public void setCallerUserId(Integer callerUserId) {
    this.callerUserId = callerUserId;
  }

  public PhoneCall callerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
    return this;
  }

   /**
   * Phone number of the caller
   * @return callerNumber
  **/
  @ApiModelProperty(value = "Phone number of the caller")
  public String getCallerNumber() {
    return callerNumber;
  }

  public void setCallerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
  }

  public PhoneCall callLengthInSeconds(Integer callLengthInSeconds) {
    this.callLengthInSeconds = callLengthInSeconds;
    return this;
  }

   /**
   * The amount of time the call took
   * @return callLengthInSeconds
  **/
  @ApiModelProperty(value = "The amount of time the call took")
  public Integer getCallLengthInSeconds() {
    return callLengthInSeconds;
  }

  public void setCallLengthInSeconds(Integer callLengthInSeconds) {
    this.callLengthInSeconds = callLengthInSeconds;
  }

  public PhoneCall callStatus(CallStatusEnum callStatus) {
    this.callStatus = callStatus;
    return this;
  }

   /**
   * The status of the call
   * @return callStatus
  **/
  @ApiModelProperty(value = "The status of the call")
  public CallStatusEnum getCallStatus() {
    return callStatus;
  }

  public void setCallStatus(CallStatusEnum callStatus) {
    this.callStatus = callStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneCall phoneCall = (PhoneCall) o;
    return Objects.equals(this.phoneCallId, phoneCall.phoneCallId) &&
        Objects.equals(this.timeOfCall, phoneCall.timeOfCall) &&
        Objects.equals(this.timeOfCallLocal, phoneCall.timeOfCallLocal) &&
        Objects.equals(this.storeId, phoneCall.storeId) &&
        Objects.equals(this.storeName, phoneCall.storeName) &&
        Objects.equals(this.callerName, phoneCall.callerName) &&
        Objects.equals(this.callerUserId, phoneCall.callerUserId) &&
        Objects.equals(this.callerNumber, phoneCall.callerNumber) &&
        Objects.equals(this.callLengthInSeconds, phoneCall.callLengthInSeconds) &&
        Objects.equals(this.callStatus, phoneCall.callStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneCallId, timeOfCall, timeOfCallLocal, storeId, storeName, callerName, callerUserId, callerNumber, callLengthInSeconds, callStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneCall {\n");
    
    sb.append("    phoneCallId: ").append(toIndentedString(phoneCallId)).append("\n");
    sb.append("    timeOfCall: ").append(toIndentedString(timeOfCall)).append("\n");
    sb.append("    timeOfCallLocal: ").append(toIndentedString(timeOfCallLocal)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
    sb.append("    callerUserId: ").append(toIndentedString(callerUserId)).append("\n");
    sb.append("    callerNumber: ").append(toIndentedString(callerNumber)).append("\n");
    sb.append("    callLengthInSeconds: ").append(toIndentedString(callLengthInSeconds)).append("\n");
    sb.append("    callStatus: ").append(toIndentedString(callStatus)).append("\n");
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

