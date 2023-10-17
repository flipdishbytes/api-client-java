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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-17T09:39:41.364Z")
public class CreateTeammate {
  @SerializedName("Email")
  private String email = null;

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
    
    STOREMANAGER("StoreManager"),
    
    STORESTAFF("StoreStaff"),
    
    STOREREADONLYACCESS("StoreReadOnlyAccess"),
    
    FINANCEMANGER("FinanceManger"),
    
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

  public CreateTeammate email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address
   * @return email
  **/
  @ApiModelProperty(value = "Email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateTeammate appAccessLevel(AppAccessLevelEnum appAccessLevel) {
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

  public CreateTeammate hasAccessToAllStores(Boolean hasAccessToAllStores) {
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

  public CreateTeammate storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public CreateTeammate addStoreIdsItem(Integer storeIdsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTeammate createTeammate = (CreateTeammate) o;
    return Objects.equals(this.email, createTeammate.email) &&
        Objects.equals(this.appAccessLevel, createTeammate.appAccessLevel) &&
        Objects.equals(this.hasAccessToAllStores, createTeammate.hasAccessToAllStores) &&
        Objects.equals(this.storeIds, createTeammate.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, appAccessLevel, hasAccessToAllStores, storeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTeammate {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    appAccessLevel: ").append(toIndentedString(appAccessLevel)).append("\n");
    sb.append("    hasAccessToAllStores: ").append(toIndentedString(hasAccessToAllStores)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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

