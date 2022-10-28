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
 * Un-Register card reader request
 */
@ApiModel(description = "Un-Register card reader request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-28T14:38:13.608+01:00")
public class UnRegisterCardReaderRequest {
  @SerializedName("ReaderId")
  private String readerId = null;

  @SerializedName("KioskDeviceId")
  private String kioskDeviceId = null;

  public UnRegisterCardReaderRequest readerId(String readerId) {
    this.readerId = readerId;
    return this;
  }

   /**
   * Device card readerid
   * @return readerId
  **/
  @ApiModelProperty(required = true, value = "Device card readerid")
  public String getReaderId() {
    return readerId;
  }

  public void setReaderId(String readerId) {
    this.readerId = readerId;
  }

  public UnRegisterCardReaderRequest kioskDeviceId(String kioskDeviceId) {
    this.kioskDeviceId = kioskDeviceId;
    return this;
  }

   /**
   * The kiosk device id
   * @return kioskDeviceId
  **/
  @ApiModelProperty(required = true, value = "The kiosk device id")
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
    UnRegisterCardReaderRequest unRegisterCardReaderRequest = (UnRegisterCardReaderRequest) o;
    return Objects.equals(this.readerId, unRegisterCardReaderRequest.readerId) &&
        Objects.equals(this.kioskDeviceId, unRegisterCardReaderRequest.kioskDeviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readerId, kioskDeviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnRegisterCardReaderRequest {\n");
    
    sb.append("    readerId: ").append(toIndentedString(readerId)).append("\n");
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

