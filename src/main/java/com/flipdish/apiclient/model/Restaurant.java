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
import com.flipdish.apiclient.model.WhiteLabelConfig;
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
 * Restaurant search result
 */
@ApiModel(description = "Restaurant search result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-17T06:46:32.991Z")
public class Restaurant {
  @SerializedName("WhiteLabelConfigs")
  private List<WhiteLabelConfig> whiteLabelConfigs = null;

  @SerializedName("VirtualRestaurantId")
  private Integer virtualRestaurantId = null;

  @SerializedName("VirtualRestaurantName")
  private String virtualRestaurantName = null;

  @SerializedName("VirtualRestaurantUrl")
  private String virtualRestaurantUrl = null;

  @SerializedName("PhysicalRestaurantId")
  private Integer physicalRestaurantId = null;

  @SerializedName("PhysicalRestaurantName")
  private String physicalRestaurantName = null;

  @SerializedName("PhysicalRestaurantAddress")
  private String physicalRestaurantAddress = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("IsArchived")
  private Boolean isArchived = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  @SerializedName("FlipdishStripeCustomConnectedAccounts")
  private List<Integer> flipdishStripeCustomConnectedAccounts = null;

  public Restaurant whiteLabelConfigs(List<WhiteLabelConfig> whiteLabelConfigs) {
    this.whiteLabelConfigs = whiteLabelConfigs;
    return this;
  }

  public Restaurant addWhiteLabelConfigsItem(WhiteLabelConfig whiteLabelConfigsItem) {
    if (this.whiteLabelConfigs == null) {
      this.whiteLabelConfigs = new ArrayList<WhiteLabelConfig>();
    }
    this.whiteLabelConfigs.add(whiteLabelConfigsItem);
    return this;
  }

   /**
   * Collection of white label configurations
   * @return whiteLabelConfigs
  **/
  @ApiModelProperty(value = "Collection of white label configurations")
  public List<WhiteLabelConfig> getWhiteLabelConfigs() {
    return whiteLabelConfigs;
  }

  public void setWhiteLabelConfigs(List<WhiteLabelConfig> whiteLabelConfigs) {
    this.whiteLabelConfigs = whiteLabelConfigs;
  }

  public Restaurant virtualRestaurantId(Integer virtualRestaurantId) {
    this.virtualRestaurantId = virtualRestaurantId;
    return this;
  }

   /**
   * Virtual restaurant identifier
   * @return virtualRestaurantId
  **/
  @ApiModelProperty(value = "Virtual restaurant identifier")
  public Integer getVirtualRestaurantId() {
    return virtualRestaurantId;
  }

  public void setVirtualRestaurantId(Integer virtualRestaurantId) {
    this.virtualRestaurantId = virtualRestaurantId;
  }

  public Restaurant virtualRestaurantName(String virtualRestaurantName) {
    this.virtualRestaurantName = virtualRestaurantName;
    return this;
  }

   /**
   * Virtual restaurant name
   * @return virtualRestaurantName
  **/
  @ApiModelProperty(value = "Virtual restaurant name")
  public String getVirtualRestaurantName() {
    return virtualRestaurantName;
  }

  public void setVirtualRestaurantName(String virtualRestaurantName) {
    this.virtualRestaurantName = virtualRestaurantName;
  }

  public Restaurant virtualRestaurantUrl(String virtualRestaurantUrl) {
    this.virtualRestaurantUrl = virtualRestaurantUrl;
    return this;
  }

   /**
   * Virtual restaurant URL
   * @return virtualRestaurantUrl
  **/
  @ApiModelProperty(value = "Virtual restaurant URL")
  public String getVirtualRestaurantUrl() {
    return virtualRestaurantUrl;
  }

  public void setVirtualRestaurantUrl(String virtualRestaurantUrl) {
    this.virtualRestaurantUrl = virtualRestaurantUrl;
  }

  public Restaurant physicalRestaurantId(Integer physicalRestaurantId) {
    this.physicalRestaurantId = physicalRestaurantId;
    return this;
  }

   /**
   * Physical restaurant identifier
   * @return physicalRestaurantId
  **/
  @ApiModelProperty(value = "Physical restaurant identifier")
  public Integer getPhysicalRestaurantId() {
    return physicalRestaurantId;
  }

  public void setPhysicalRestaurantId(Integer physicalRestaurantId) {
    this.physicalRestaurantId = physicalRestaurantId;
  }

  public Restaurant physicalRestaurantName(String physicalRestaurantName) {
    this.physicalRestaurantName = physicalRestaurantName;
    return this;
  }

   /**
   * Physical restaurant name
   * @return physicalRestaurantName
  **/
  @ApiModelProperty(value = "Physical restaurant name")
  public String getPhysicalRestaurantName() {
    return physicalRestaurantName;
  }

  public void setPhysicalRestaurantName(String physicalRestaurantName) {
    this.physicalRestaurantName = physicalRestaurantName;
  }

  public Restaurant physicalRestaurantAddress(String physicalRestaurantAddress) {
    this.physicalRestaurantAddress = physicalRestaurantAddress;
    return this;
  }

   /**
   * Physical restaurant address
   * @return physicalRestaurantAddress
  **/
  @ApiModelProperty(value = "Physical restaurant address")
  public String getPhysicalRestaurantAddress() {
    return physicalRestaurantAddress;
  }

  public void setPhysicalRestaurantAddress(String physicalRestaurantAddress) {
    this.physicalRestaurantAddress = physicalRestaurantAddress;
  }

  public Restaurant menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Menu identifier
   * @return menuId
  **/
  @ApiModelProperty(value = "Menu identifier")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public Restaurant isArchived(Boolean isArchived) {
    this.isArchived = isArchived;
    return this;
  }

   /**
   * Indicates if the restaurant is archived
   * @return isArchived
  **/
  @ApiModelProperty(value = "Indicates if the restaurant is archived")
  public Boolean isIsArchived() {
    return isArchived;
  }

  public void setIsArchived(Boolean isArchived) {
    this.isArchived = isArchived;
  }

  public Restaurant isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

   /**
   * Indicates if the restaurant is published
   * @return isPublished
  **/
  @ApiModelProperty(value = "Indicates if the restaurant is published")
  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }

  public Restaurant flipdishStripeCustomConnectedAccounts(List<Integer> flipdishStripeCustomConnectedAccounts) {
    this.flipdishStripeCustomConnectedAccounts = flipdishStripeCustomConnectedAccounts;
    return this;
  }

  public Restaurant addFlipdishStripeCustomConnectedAccountsItem(Integer flipdishStripeCustomConnectedAccountsItem) {
    if (this.flipdishStripeCustomConnectedAccounts == null) {
      this.flipdishStripeCustomConnectedAccounts = new ArrayList<Integer>();
    }
    this.flipdishStripeCustomConnectedAccounts.add(flipdishStripeCustomConnectedAccountsItem);
    return this;
  }

   /**
   * List of Flipdish Stripe custom connected account identifiers
   * @return flipdishStripeCustomConnectedAccounts
  **/
  @ApiModelProperty(value = "List of Flipdish Stripe custom connected account identifiers")
  public List<Integer> getFlipdishStripeCustomConnectedAccounts() {
    return flipdishStripeCustomConnectedAccounts;
  }

  public void setFlipdishStripeCustomConnectedAccounts(List<Integer> flipdishStripeCustomConnectedAccounts) {
    this.flipdishStripeCustomConnectedAccounts = flipdishStripeCustomConnectedAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restaurant restaurant = (Restaurant) o;
    return Objects.equals(this.whiteLabelConfigs, restaurant.whiteLabelConfigs) &&
        Objects.equals(this.virtualRestaurantId, restaurant.virtualRestaurantId) &&
        Objects.equals(this.virtualRestaurantName, restaurant.virtualRestaurantName) &&
        Objects.equals(this.virtualRestaurantUrl, restaurant.virtualRestaurantUrl) &&
        Objects.equals(this.physicalRestaurantId, restaurant.physicalRestaurantId) &&
        Objects.equals(this.physicalRestaurantName, restaurant.physicalRestaurantName) &&
        Objects.equals(this.physicalRestaurantAddress, restaurant.physicalRestaurantAddress) &&
        Objects.equals(this.menuId, restaurant.menuId) &&
        Objects.equals(this.isArchived, restaurant.isArchived) &&
        Objects.equals(this.isPublished, restaurant.isPublished) &&
        Objects.equals(this.flipdishStripeCustomConnectedAccounts, restaurant.flipdishStripeCustomConnectedAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whiteLabelConfigs, virtualRestaurantId, virtualRestaurantName, virtualRestaurantUrl, physicalRestaurantId, physicalRestaurantName, physicalRestaurantAddress, menuId, isArchived, isPublished, flipdishStripeCustomConnectedAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurant {\n");
    
    sb.append("    whiteLabelConfigs: ").append(toIndentedString(whiteLabelConfigs)).append("\n");
    sb.append("    virtualRestaurantId: ").append(toIndentedString(virtualRestaurantId)).append("\n");
    sb.append("    virtualRestaurantName: ").append(toIndentedString(virtualRestaurantName)).append("\n");
    sb.append("    virtualRestaurantUrl: ").append(toIndentedString(virtualRestaurantUrl)).append("\n");
    sb.append("    physicalRestaurantId: ").append(toIndentedString(physicalRestaurantId)).append("\n");
    sb.append("    physicalRestaurantName: ").append(toIndentedString(physicalRestaurantName)).append("\n");
    sb.append("    physicalRestaurantAddress: ").append(toIndentedString(physicalRestaurantAddress)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    isArchived: ").append(toIndentedString(isArchived)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    flipdishStripeCustomConnectedAccounts: ").append(toIndentedString(flipdishStripeCustomConnectedAccounts)).append("\n");
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

