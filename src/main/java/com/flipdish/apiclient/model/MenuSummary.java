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
import org.threeten.bp.OffsetDateTime;

/**
 * Menu Summary
 */
@ApiModel(description = "Menu Summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-18T06:28:53.942Z")
public class MenuSummary {
  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("ModifiedTime")
  private OffsetDateTime modifiedTime = null;

  @SerializedName("VersionNumber")
  private Integer versionNumber = null;

  @SerializedName("MenuUrl")
  private String menuUrl = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Locked")
  private Boolean locked = null;

  @SerializedName("StoreNames")
  private List<String> storeNames = null;

  public MenuSummary menuId(Integer menuId) {
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

  public MenuSummary modifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

   /**
   * Last modified time
   * @return modifiedTime
  **/
  @ApiModelProperty(value = "Last modified time")
  public OffsetDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public MenuSummary versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Menu version
   * @return versionNumber
  **/
  @ApiModelProperty(value = "Menu version")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }

  public MenuSummary menuUrl(String menuUrl) {
    this.menuUrl = menuUrl;
    return this;
  }

   /**
   * Menu Url
   * @return menuUrl
  **/
  @ApiModelProperty(value = "Menu Url")
  public String getMenuUrl() {
    return menuUrl;
  }

  public void setMenuUrl(String menuUrl) {
    this.menuUrl = menuUrl;
  }

  public MenuSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Menu, only shown in portal
   * @return name
  **/
  @ApiModelProperty(value = "Name of Menu, only shown in portal")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuSummary locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Locked: is menu locked against modifcation
   * @return locked
  **/
  @ApiModelProperty(value = "Locked: is menu locked against modifcation")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public MenuSummary storeNames(List<String> storeNames) {
    this.storeNames = storeNames;
    return this;
  }

  public MenuSummary addStoreNamesItem(String storeNamesItem) {
    if (this.storeNames == null) {
      this.storeNames = new ArrayList<String>();
    }
    this.storeNames.add(storeNamesItem);
    return this;
  }

   /**
   * List of stores names which are associated with this menu
   * @return storeNames
  **/
  @ApiModelProperty(value = "List of stores names which are associated with this menu")
  public List<String> getStoreNames() {
    return storeNames;
  }

  public void setStoreNames(List<String> storeNames) {
    this.storeNames = storeNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuSummary menuSummary = (MenuSummary) o;
    return Objects.equals(this.menuId, menuSummary.menuId) &&
        Objects.equals(this.modifiedTime, menuSummary.modifiedTime) &&
        Objects.equals(this.versionNumber, menuSummary.versionNumber) &&
        Objects.equals(this.menuUrl, menuSummary.menuUrl) &&
        Objects.equals(this.name, menuSummary.name) &&
        Objects.equals(this.locked, menuSummary.locked) &&
        Objects.equals(this.storeNames, menuSummary.storeNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuId, modifiedTime, versionNumber, menuUrl, name, locked, storeNames);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuSummary {\n");
    
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    menuUrl: ").append(toIndentedString(menuUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    storeNames: ").append(toIndentedString(storeNames)).append("\n");
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

