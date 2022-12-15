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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-15T14:41:06.949Z")
public class RedeemInvitationResult {
  @SerializedName("AppId")
  private String appId = null;

  /**
   * Invitation status
   */
  @JsonAdapter(InvitationStatusEnum.Adapter.class)
  public enum InvitationStatusEnum {
    PENDING("Pending"),
    
    ACCEPTED("Accepted"),
    
    EXPIRED("Expired");

    private String value;

    InvitationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvitationStatusEnum fromValue(String text) {
      for (InvitationStatusEnum b : InvitationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InvitationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvitationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvitationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InvitationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("InvitationStatus")
  private InvitationStatusEnum invitationStatus = null;

  public RedeemInvitationResult appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Access level is for this App
   * @return appId
  **/
  @ApiModelProperty(value = "Access level is for this App")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public RedeemInvitationResult invitationStatus(InvitationStatusEnum invitationStatus) {
    this.invitationStatus = invitationStatus;
    return this;
  }

   /**
   * Invitation status
   * @return invitationStatus
  **/
  @ApiModelProperty(value = "Invitation status")
  public InvitationStatusEnum getInvitationStatus() {
    return invitationStatus;
  }

  public void setInvitationStatus(InvitationStatusEnum invitationStatus) {
    this.invitationStatus = invitationStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedeemInvitationResult redeemInvitationResult = (RedeemInvitationResult) o;
    return Objects.equals(this.appId, redeemInvitationResult.appId) &&
        Objects.equals(this.invitationStatus, redeemInvitationResult.invitationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, invitationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedeemInvitationResult {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
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

