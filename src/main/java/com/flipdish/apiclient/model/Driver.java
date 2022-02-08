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
import com.flipdish.apiclient.model.DriverStore;
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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class Driver {
  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("UserPhoneNumber")
  private String userPhoneNumber = null;

  @SerializedName("Stores")
  private List<DriverStore> stores = null;

  @SerializedName("ProfileImageUrl")
  private String profileImageUrl = null;

  @SerializedName("DriverKey")
  private String driverKey = null;

  public Driver userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User Id
   * @return userId
  **/
  @ApiModelProperty(value = "User Id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Driver userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * User Name
   * @return userName
  **/
  @ApiModelProperty(value = "User Name")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Driver userPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
    return this;
  }

   /**
   * User Phone Number
   * @return userPhoneNumber
  **/
  @ApiModelProperty(value = "User Phone Number")
  public String getUserPhoneNumber() {
    return userPhoneNumber;
  }

  public void setUserPhoneNumber(String userPhoneNumber) {
    this.userPhoneNumber = userPhoneNumber;
  }

  public Driver stores(List<DriverStore> stores) {
    this.stores = stores;
    return this;
  }

  public Driver addStoresItem(DriverStore storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<DriverStore>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * 
   * @return stores
  **/
  @ApiModelProperty(value = "")
  public List<DriverStore> getStores() {
    return stores;
  }

  public void setStores(List<DriverStore> stores) {
    this.stores = stores;
  }

  public Driver profileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
    return this;
  }

   /**
   * Profile image url
   * @return profileImageUrl
  **/
  @ApiModelProperty(value = "Profile image url")
  public String getProfileImageUrl() {
    return profileImageUrl;
  }

  public void setProfileImageUrl(String profileImageUrl) {
    this.profileImageUrl = profileImageUrl;
  }

  public Driver driverKey(String driverKey) {
    this.driverKey = driverKey;
    return this;
  }

   /**
   * Driver Key
   * @return driverKey
  **/
  @ApiModelProperty(value = "Driver Key")
  public String getDriverKey() {
    return driverKey;
  }

  public void setDriverKey(String driverKey) {
    this.driverKey = driverKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(this.userId, driver.userId) &&
        Objects.equals(this.userName, driver.userName) &&
        Objects.equals(this.userPhoneNumber, driver.userPhoneNumber) &&
        Objects.equals(this.stores, driver.stores) &&
        Objects.equals(this.profileImageUrl, driver.profileImageUrl) &&
        Objects.equals(this.driverKey, driver.driverKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userName, userPhoneNumber, stores, profileImageUrl, driverKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPhoneNumber: ").append(toIndentedString(userPhoneNumber)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    profileImageUrl: ").append(toIndentedString(profileImageUrl)).append("\n");
    sb.append("    driverKey: ").append(toIndentedString(driverKey)).append("\n");
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
