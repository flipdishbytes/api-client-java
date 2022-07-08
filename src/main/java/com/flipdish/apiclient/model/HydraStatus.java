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
 * Hydra status
 */
@ApiModel(description = "Hydra status")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-08T18:00:57.841+01:00")
public class HydraStatus {
  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("IsRegistered")
  private Boolean isRegistered = null;

  @SerializedName("PinCode")
  private Integer pinCode = null;

  @SerializedName("Images")
  private List<String> images = null;

  /**
   * Hydra User Type
   */
  @JsonAdapter(UserTypeEnum.Adapter.class)
  public enum UserTypeEnum {
    KIOSK("Kiosk"),
    
    TERMINAL("Terminal"),
    
    LEGACYPRINTER("LegacyPrinter");

    private String value;

    UserTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserTypeEnum fromValue(String text) {
      for (UserTypeEnum b : UserTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UserTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UserTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("UserType")
  private UserTypeEnum userType = null;

  public HydraStatus appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public HydraStatus storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public HydraStatus addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store to assign the hydra
   * @return storeIds
  **/
  @ApiModelProperty(value = "Store to assign the hydra")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public HydraStatus isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

   /**
   * The device has been already registered
   * @return isRegistered
  **/
  @ApiModelProperty(required = true, value = "The device has been already registered")
  public Boolean isIsRegistered() {
    return isRegistered;
  }

  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public HydraStatus pinCode(Integer pinCode) {
    this.pinCode = pinCode;
    return this;
  }

   /**
   * 6 digit PIN code (not starting with zero).
   * minimum: 100000
   * maximum: 999999
   * @return pinCode
  **/
  @ApiModelProperty(value = "6 digit PIN code (not starting with zero).")
  public Integer getPinCode() {
    return pinCode;
  }

  public void setPinCode(Integer pinCode) {
    this.pinCode = pinCode;
  }

  public HydraStatus images(List<String> images) {
    this.images = images;
    return this;
  }

  public HydraStatus addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<String>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Hydra images (covers)
   * @return images
  **/
  @ApiModelProperty(value = "Hydra images (covers)")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public HydraStatus userType(UserTypeEnum userType) {
    this.userType = userType;
    return this;
  }

   /**
   * Hydra User Type
   * @return userType
  **/
  @ApiModelProperty(value = "Hydra User Type")
  public UserTypeEnum getUserType() {
    return userType;
  }

  public void setUserType(UserTypeEnum userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HydraStatus hydraStatus = (HydraStatus) o;
    return Objects.equals(this.appId, hydraStatus.appId) &&
        Objects.equals(this.storeIds, hydraStatus.storeIds) &&
        Objects.equals(this.isRegistered, hydraStatus.isRegistered) &&
        Objects.equals(this.pinCode, hydraStatus.pinCode) &&
        Objects.equals(this.images, hydraStatus.images) &&
        Objects.equals(this.userType, hydraStatus.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, storeIds, isRegistered, pinCode, images, userType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HydraStatus {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    pinCode: ").append(toIndentedString(pinCode)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
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

