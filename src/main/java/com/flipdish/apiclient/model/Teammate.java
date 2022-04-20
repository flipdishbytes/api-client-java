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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-20T15:30:52.193+01:00")
public class Teammate {
  @SerializedName("TeammateId")
  private String teammateId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("LastActivity")
  private OffsetDateTime lastActivity = null;

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

  public Teammate teammateId(String teammateId) {
    this.teammateId = teammateId;
    return this;
  }

   /**
   * Unique indentifier
   * @return teammateId
  **/
  @ApiModelProperty(value = "Unique indentifier")
  public String getTeammateId() {
    return teammateId;
  }

  public void setTeammateId(String teammateId) {
    this.teammateId = teammateId;
  }

  public Teammate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Teammate lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Last activity
   * @return lastActivity
  **/
  @ApiModelProperty(value = "Last activity")
  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }

  public Teammate appId(String appId) {
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

  public Teammate invitationStatus(InvitationStatusEnum invitationStatus) {
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

  public Teammate email(String email) {
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

  public Teammate appAccessLevel(AppAccessLevelEnum appAccessLevel) {
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

  public Teammate hasAccessToAllStores(Boolean hasAccessToAllStores) {
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

  public Teammate storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public Teammate addStoreIdsItem(Integer storeIdsItem) {
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
    Teammate teammate = (Teammate) o;
    return Objects.equals(this.teammateId, teammate.teammateId) &&
        Objects.equals(this.name, teammate.name) &&
        Objects.equals(this.lastActivity, teammate.lastActivity) &&
        Objects.equals(this.appId, teammate.appId) &&
        Objects.equals(this.invitationStatus, teammate.invitationStatus) &&
        Objects.equals(this.email, teammate.email) &&
        Objects.equals(this.appAccessLevel, teammate.appAccessLevel) &&
        Objects.equals(this.hasAccessToAllStores, teammate.hasAccessToAllStores) &&
        Objects.equals(this.storeIds, teammate.storeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teammateId, name, lastActivity, appId, invitationStatus, email, appAccessLevel, hasAccessToAllStores, storeIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teammate {\n");
    
    sb.append("    teammateId: ").append(toIndentedString(teammateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
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

