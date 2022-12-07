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
 * Reject
 */
@ApiModel(description = "Reject")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-07T12:37:23.455Z")
public class Reject {
  /**
   * Reject reason.
   */
  @JsonAdapter(RejectReasonEnum.Adapter.class)
  public enum RejectReasonEnum {
    TOOBUSY("TooBusy"),
    
    FOODUNAVAILABLE("FoodUnavailable"),
    
    UNABLETODELIVER("UnableToDeliver"),
    
    UNKNOWNADDRESS("UnknownAddress"),
    
    UNKNOWNREASON("UnknownReason"),
    
    TOOSOON("TooSoon"),
    
    TIMEUNAVAILABLE("TimeUnavailable"),
    
    DONTDELIVERTOAREA("DontDeliverToArea"),
    
    STOREUNCONTACTABLE("StoreUncontactable");

    private String value;

    RejectReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RejectReasonEnum fromValue(String text) {
      for (RejectReasonEnum b : RejectReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RejectReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RejectReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RejectReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RejectReasonEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("RejectReason")
  private RejectReasonEnum rejectReason = null;

  @SerializedName("DoNotNotifyCustomer")
  private Boolean doNotNotifyCustomer = null;

  public Reject rejectReason(RejectReasonEnum rejectReason) {
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * Reject reason.
   * @return rejectReason
  **/
  @ApiModelProperty(required = true, value = "Reject reason.")
  public RejectReasonEnum getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(RejectReasonEnum rejectReason) {
    this.rejectReason = rejectReason;
  }

  public Reject doNotNotifyCustomer(Boolean doNotNotifyCustomer) {
    this.doNotNotifyCustomer = doNotNotifyCustomer;
    return this;
  }

   /**
   * Notify customer. The server will not send and SMS to the customer if the value is true.
   * @return doNotNotifyCustomer
  **/
  @ApiModelProperty(value = "Notify customer. The server will not send and SMS to the customer if the value is true.")
  public Boolean isDoNotNotifyCustomer() {
    return doNotNotifyCustomer;
  }

  public void setDoNotNotifyCustomer(Boolean doNotNotifyCustomer) {
    this.doNotNotifyCustomer = doNotNotifyCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reject reject = (Reject) o;
    return Objects.equals(this.rejectReason, reject.rejectReason) &&
        Objects.equals(this.doNotNotifyCustomer, reject.doNotNotifyCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectReason, doNotNotifyCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reject {\n");
    
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    doNotNotifyCustomer: ").append(toIndentedString(doNotNotifyCustomer)).append("\n");
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

