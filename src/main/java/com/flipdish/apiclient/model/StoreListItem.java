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
 * Store id and name
 */
@ApiModel(description = "Store id and name")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-19T12:32:07.573Z")
public class StoreListItem {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("StoreGroupName")
  private String storeGroupName = null;

  @SerializedName("HasLoyaltyCampaign")
  private Boolean hasLoyaltyCampaign = null;

  @SerializedName("HasRetentionCampaign")
  private Boolean hasRetentionCampaign = null;

  @SerializedName("IsPublished")
  private Boolean isPublished = null;

  public StoreListItem storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreListItem storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store Name
   * @return storeName
  **/
  @ApiModelProperty(value = "Store Name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public StoreListItem storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Store Group Id
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Store Group Id")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public StoreListItem storeGroupName(String storeGroupName) {
    this.storeGroupName = storeGroupName;
    return this;
  }

   /**
   * Store Group Name
   * @return storeGroupName
  **/
  @ApiModelProperty(value = "Store Group Name")
  public String getStoreGroupName() {
    return storeGroupName;
  }

  public void setStoreGroupName(String storeGroupName) {
    this.storeGroupName = storeGroupName;
  }

  public StoreListItem hasLoyaltyCampaign(Boolean hasLoyaltyCampaign) {
    this.hasLoyaltyCampaign = hasLoyaltyCampaign;
    return this;
  }

   /**
   * Store has loyalty campaign
   * @return hasLoyaltyCampaign
  **/
  @ApiModelProperty(value = "Store has loyalty campaign")
  public Boolean isHasLoyaltyCampaign() {
    return hasLoyaltyCampaign;
  }

  public void setHasLoyaltyCampaign(Boolean hasLoyaltyCampaign) {
    this.hasLoyaltyCampaign = hasLoyaltyCampaign;
  }

  public StoreListItem hasRetentionCampaign(Boolean hasRetentionCampaign) {
    this.hasRetentionCampaign = hasRetentionCampaign;
    return this;
  }

   /**
   * Store has retention campaign
   * @return hasRetentionCampaign
  **/
  @ApiModelProperty(value = "Store has retention campaign")
  public Boolean isHasRetentionCampaign() {
    return hasRetentionCampaign;
  }

  public void setHasRetentionCampaign(Boolean hasRetentionCampaign) {
    this.hasRetentionCampaign = hasRetentionCampaign;
  }

  public StoreListItem isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

   /**
   * Is Published store
   * @return isPublished
  **/
  @ApiModelProperty(value = "Is Published store")
  public Boolean isIsPublished() {
    return isPublished;
  }

  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreListItem storeListItem = (StoreListItem) o;
    return Objects.equals(this.storeId, storeListItem.storeId) &&
        Objects.equals(this.storeName, storeListItem.storeName) &&
        Objects.equals(this.storeGroupId, storeListItem.storeGroupId) &&
        Objects.equals(this.storeGroupName, storeListItem.storeGroupName) &&
        Objects.equals(this.hasLoyaltyCampaign, storeListItem.hasLoyaltyCampaign) &&
        Objects.equals(this.hasRetentionCampaign, storeListItem.hasRetentionCampaign) &&
        Objects.equals(this.isPublished, storeListItem.isPublished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeName, storeGroupId, storeGroupName, hasLoyaltyCampaign, hasRetentionCampaign, isPublished);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreListItem {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    storeGroupName: ").append(toIndentedString(storeGroupName)).append("\n");
    sb.append("    hasLoyaltyCampaign: ").append(toIndentedString(hasLoyaltyCampaign)).append("\n");
    sb.append("    hasRetentionCampaign: ").append(toIndentedString(hasRetentionCampaign)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
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

