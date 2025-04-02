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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T11:34:10.106Z")
public class TeammateBase {
  /**
   * App access level
   */
  @JsonAdapter(AppAccessLevelEnum.Adapter.class)
  public enum AppAccessLevelEnum {
    NONE("None"),
    
    OWNER("Owner"),
    
    STOREOWNER("StoreOwner"),
    
    MANAGEDOWNER("ManagedOwner"),
    
    INTEGRATOR("Integrator"),
    
    PROPERTYMANAGER("PropertyManager"),
    
    STOREMANAGER("StoreManager"),
    
    STORESTAFF("StoreStaff"),
    
    STOREREADONLYACCESS("StoreReadOnlyAccess"),
    
    FINANCEMANGER("FinanceManger"),
    
    ONBOARDING("Onboarding"),
    
    SUPPORT("Support");

    private String value;

    AppAccessLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppAccessLevelEnum fromValue(String text) {
      for (AppAccessLevelEnum b : AppAccessLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppAccessLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppAccessLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppAccessLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppAccessLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AppAccessLevel")
  private AppAccessLevelEnum appAccessLevel = null;

  @SerializedName("HasAccessToAllStores")
  private Boolean hasAccessToAllStores = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("PropertyIds")
  private List<String> propertyIds = null;

  public TeammateBase appAccessLevel(AppAccessLevelEnum appAccessLevel) {
    this.appAccessLevel = appAccessLevel;
    return this;
  }

   /**
   * App access level
   * @return appAccessLevel
  **/
  @ApiModelProperty(value = "App access level")
  public AppAccessLevelEnum getAppAccessLevel() {
    return appAccessLevel;
  }

  public void setAppAccessLevel(AppAccessLevelEnum appAccessLevel) {
    this.appAccessLevel = appAccessLevel;
  }

  public TeammateBase hasAccessToAllStores(Boolean hasAccessToAllStores) {
    this.hasAccessToAllStores = hasAccessToAllStores;
    return this;
  }

   /**
   * The user has access to all stores for the app (including new stores that added later)
   * @return hasAccessToAllStores
  **/
  @ApiModelProperty(value = "The user has access to all stores for the app (including new stores that added later)")
  public Boolean isHasAccessToAllStores() {
    return hasAccessToAllStores;
  }

  public void setHasAccessToAllStores(Boolean hasAccessToAllStores) {
    this.hasAccessToAllStores = hasAccessToAllStores;
  }

  public TeammateBase storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public TeammateBase addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store IDs the user has access to (if HasAccessToAllStores is false)
   * @return storeIds
  **/
  @ApiModelProperty(value = "Store IDs the user has access to (if HasAccessToAllStores is false)")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public TeammateBase propertyIds(List<String> propertyIds) {
    this.propertyIds = propertyIds;
    return this;
  }

  public TeammateBase addPropertyIdsItem(String propertyIdsItem) {
    if (this.propertyIds == null) {
      this.propertyIds = new ArrayList<String>();
    }
    this.propertyIds.add(propertyIdsItem);
    return this;
  }

   /**
   * Property Ids the user has access to (if HasAccessToAllStores is false)
   * @return propertyIds
  **/
  @ApiModelProperty(value = "Property Ids the user has access to (if HasAccessToAllStores is false)")
  public List<String> getPropertyIds() {
    return propertyIds;
  }

  public void setPropertyIds(List<String> propertyIds) {
    this.propertyIds = propertyIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeammateBase teammateBase = (TeammateBase) o;
    return Objects.equals(this.appAccessLevel, teammateBase.appAccessLevel) &&
        Objects.equals(this.hasAccessToAllStores, teammateBase.hasAccessToAllStores) &&
        Objects.equals(this.storeIds, teammateBase.storeIds) &&
        Objects.equals(this.propertyIds, teammateBase.propertyIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appAccessLevel, hasAccessToAllStores, storeIds, propertyIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeammateBase {\n");
    
    sb.append("    appAccessLevel: ").append(toIndentedString(appAccessLevel)).append("\n");
    sb.append("    hasAccessToAllStores: ").append(toIndentedString(hasAccessToAllStores)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    propertyIds: ").append(toIndentedString(propertyIds)).append("\n");
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

