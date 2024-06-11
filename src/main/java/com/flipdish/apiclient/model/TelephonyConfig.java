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
 * Phone call
 */
@ApiModel(description = "Phone call")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-11T10:04:11.849Z")
public class TelephonyConfig {
  @SerializedName("TelephonyConfigId")
  private Integer telephonyConfigId = null;

  @SerializedName("ApmEnabled")
  private Boolean apmEnabled = null;

  @SerializedName("ConsentEnabled")
  private Boolean consentEnabled = null;

  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  @SerializedName("SendAppLinkSms")
  private Boolean sendAppLinkSms = null;

  @SerializedName("UseCustomAppLinkSmsMessage")
  private Boolean useCustomAppLinkSmsMessage = null;

  @SerializedName("UseCustomVoiceMessage")
  private Boolean useCustomVoiceMessage = null;

  @SerializedName("AppLinkSmsMessage")
  private String appLinkSmsMessage = null;

  @SerializedName("ResendApmMessageAfterDays")
  private Integer resendApmMessageAfterDays = null;

  public TelephonyConfig telephonyConfigId(Integer telephonyConfigId) {
    this.telephonyConfigId = telephonyConfigId;
    return this;
  }

   /**
   * ID of the phone call
   * @return telephonyConfigId
  **/
  @ApiModelProperty(value = "ID of the phone call")
  public Integer getTelephonyConfigId() {
    return telephonyConfigId;
  }

  public void setTelephonyConfigId(Integer telephonyConfigId) {
    this.telephonyConfigId = telephonyConfigId;
  }

  public TelephonyConfig apmEnabled(Boolean apmEnabled) {
    this.apmEnabled = apmEnabled;
    return this;
  }

   /**
   * APM enabled flag
   * @return apmEnabled
  **/
  @ApiModelProperty(value = "APM enabled flag")
  public Boolean isApmEnabled() {
    return apmEnabled;
  }

  public void setApmEnabled(Boolean apmEnabled) {
    this.apmEnabled = apmEnabled;
  }

  public TelephonyConfig consentEnabled(Boolean consentEnabled) {
    this.consentEnabled = consentEnabled;
    return this;
  }

   /**
   * Consent enabled flag
   * @return consentEnabled
  **/
  @ApiModelProperty(value = "Consent enabled flag")
  public Boolean isConsentEnabled() {
    return consentEnabled;
  }

  public void setConsentEnabled(Boolean consentEnabled) {
    this.consentEnabled = consentEnabled;
  }

  public TelephonyConfig phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * APM phone number of the store
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "APM phone number of the store")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public TelephonyConfig sendAppLinkSms(Boolean sendAppLinkSms) {
    this.sendAppLinkSms = sendAppLinkSms;
    return this;
  }

   /**
   * Send app link SMS flag
   * @return sendAppLinkSms
  **/
  @ApiModelProperty(value = "Send app link SMS flag")
  public Boolean isSendAppLinkSms() {
    return sendAppLinkSms;
  }

  public void setSendAppLinkSms(Boolean sendAppLinkSms) {
    this.sendAppLinkSms = sendAppLinkSms;
  }

  public TelephonyConfig useCustomAppLinkSmsMessage(Boolean useCustomAppLinkSmsMessage) {
    this.useCustomAppLinkSmsMessage = useCustomAppLinkSmsMessage;
    return this;
  }

   /**
   * Use custom app link SMS message flag
   * @return useCustomAppLinkSmsMessage
  **/
  @ApiModelProperty(value = "Use custom app link SMS message flag")
  public Boolean isUseCustomAppLinkSmsMessage() {
    return useCustomAppLinkSmsMessage;
  }

  public void setUseCustomAppLinkSmsMessage(Boolean useCustomAppLinkSmsMessage) {
    this.useCustomAppLinkSmsMessage = useCustomAppLinkSmsMessage;
  }

  public TelephonyConfig useCustomVoiceMessage(Boolean useCustomVoiceMessage) {
    this.useCustomVoiceMessage = useCustomVoiceMessage;
    return this;
  }

   /**
   * Use custom voice message flag
   * @return useCustomVoiceMessage
  **/
  @ApiModelProperty(value = "Use custom voice message flag")
  public Boolean isUseCustomVoiceMessage() {
    return useCustomVoiceMessage;
  }

  public void setUseCustomVoiceMessage(Boolean useCustomVoiceMessage) {
    this.useCustomVoiceMessage = useCustomVoiceMessage;
  }

  public TelephonyConfig appLinkSmsMessage(String appLinkSmsMessage) {
    this.appLinkSmsMessage = appLinkSmsMessage;
    return this;
  }

   /**
   * App link SMS message
   * @return appLinkSmsMessage
  **/
  @ApiModelProperty(value = "App link SMS message")
  public String getAppLinkSmsMessage() {
    return appLinkSmsMessage;
  }

  public void setAppLinkSmsMessage(String appLinkSmsMessage) {
    this.appLinkSmsMessage = appLinkSmsMessage;
  }

  public TelephonyConfig resendApmMessageAfterDays(Integer resendApmMessageAfterDays) {
    this.resendApmMessageAfterDays = resendApmMessageAfterDays;
    return this;
  }

   /**
   * Amount of days to resend APM message
   * @return resendApmMessageAfterDays
  **/
  @ApiModelProperty(value = "Amount of days to resend APM message")
  public Integer getResendApmMessageAfterDays() {
    return resendApmMessageAfterDays;
  }

  public void setResendApmMessageAfterDays(Integer resendApmMessageAfterDays) {
    this.resendApmMessageAfterDays = resendApmMessageAfterDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelephonyConfig telephonyConfig = (TelephonyConfig) o;
    return Objects.equals(this.telephonyConfigId, telephonyConfig.telephonyConfigId) &&
        Objects.equals(this.apmEnabled, telephonyConfig.apmEnabled) &&
        Objects.equals(this.consentEnabled, telephonyConfig.consentEnabled) &&
        Objects.equals(this.phoneNumber, telephonyConfig.phoneNumber) &&
        Objects.equals(this.sendAppLinkSms, telephonyConfig.sendAppLinkSms) &&
        Objects.equals(this.useCustomAppLinkSmsMessage, telephonyConfig.useCustomAppLinkSmsMessage) &&
        Objects.equals(this.useCustomVoiceMessage, telephonyConfig.useCustomVoiceMessage) &&
        Objects.equals(this.appLinkSmsMessage, telephonyConfig.appLinkSmsMessage) &&
        Objects.equals(this.resendApmMessageAfterDays, telephonyConfig.resendApmMessageAfterDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(telephonyConfigId, apmEnabled, consentEnabled, phoneNumber, sendAppLinkSms, useCustomAppLinkSmsMessage, useCustomVoiceMessage, appLinkSmsMessage, resendApmMessageAfterDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelephonyConfig {\n");
    
    sb.append("    telephonyConfigId: ").append(toIndentedString(telephonyConfigId)).append("\n");
    sb.append("    apmEnabled: ").append(toIndentedString(apmEnabled)).append("\n");
    sb.append("    consentEnabled: ").append(toIndentedString(consentEnabled)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    sendAppLinkSms: ").append(toIndentedString(sendAppLinkSms)).append("\n");
    sb.append("    useCustomAppLinkSmsMessage: ").append(toIndentedString(useCustomAppLinkSmsMessage)).append("\n");
    sb.append("    useCustomVoiceMessage: ").append(toIndentedString(useCustomVoiceMessage)).append("\n");
    sb.append("    appLinkSmsMessage: ").append(toIndentedString(appLinkSmsMessage)).append("\n");
    sb.append("    resendApmMessageAfterDays: ").append(toIndentedString(resendApmMessageAfterDays)).append("\n");
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

