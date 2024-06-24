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
 * Card reader registration request
 */
@ApiModel(description = "Card reader registration request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-24T10:16:25.462Z")
public class CardReaderRegistrationRequest {
  @SerializedName("RegistrationCode")
  private String registrationCode = null;

  @SerializedName("KioskDeviceId")
  private String kioskDeviceId = null;

  public CardReaderRegistrationRequest registrationCode(String registrationCode) {
    this.registrationCode = registrationCode;
    return this;
  }

   /**
   * The reader registration code
   * @return registrationCode
  **/
  @ApiModelProperty(required = true, value = "The reader registration code")
  public String getRegistrationCode() {
    return registrationCode;
  }

  public void setRegistrationCode(String registrationCode) {
    this.registrationCode = registrationCode;
  }

  public CardReaderRegistrationRequest kioskDeviceId(String kioskDeviceId) {
    this.kioskDeviceId = kioskDeviceId;
    return this;
  }

   /**
   * The kiosk device id
   * @return kioskDeviceId
  **/
  @ApiModelProperty(value = "The kiosk device id")
  public String getKioskDeviceId() {
    return kioskDeviceId;
  }

  public void setKioskDeviceId(String kioskDeviceId) {
    this.kioskDeviceId = kioskDeviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardReaderRegistrationRequest cardReaderRegistrationRequest = (CardReaderRegistrationRequest) o;
    return Objects.equals(this.registrationCode, cardReaderRegistrationRequest.registrationCode) &&
        Objects.equals(this.kioskDeviceId, cardReaderRegistrationRequest.kioskDeviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationCode, kioskDeviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardReaderRegistrationRequest {\n");
    
    sb.append("    registrationCode: ").append(toIndentedString(registrationCode)).append("\n");
    sb.append("    kioskDeviceId: ").append(toIndentedString(kioskDeviceId)).append("\n");
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

