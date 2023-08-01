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
import org.threeten.bp.OffsetDateTime;

/**
 * Update Mobile Apps Status
 */
@ApiModel(description = "Update Mobile Apps Status")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-01T12:45:24.090+01:00")
public class UpdateMobileAppsSubmissionStatus {
  @SerializedName("MobileAppsSubmissionStatusId")
  private Integer mobileAppsSubmissionStatusId = null;

  /**
   * Mobile Type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("None"),
    
    ANDROID("Android"),
    
    IOS("IOS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  /**
   * Mobile App Status
   */
  @JsonAdapter(AppStatusEnum.Adapter.class)
  public enum AppStatusEnum {
    NONE("None"),
    
    PUBLISHED("Published"),
    
    UNPUBLISHED("Unpublished");

    private String value;

    AppStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppStatusEnum fromValue(String text) {
      for (AppStatusEnum b : AppStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AppStatus")
  private AppStatusEnum appStatus = null;

  /**
   * Mobile App Status
   */
  @JsonAdapter(UpdateStatusEnum.Adapter.class)
  public enum UpdateStatusEnum {
    NONE("None"),
    
    SUBMITTED("Submitted"),
    
    INREVIEW("InReview"),
    
    REJECTED("Rejected"),
    
    APPROVED("Approved"),
    
    PUBLISHED("Published");

    private String value;

    UpdateStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UpdateStatusEnum fromValue(String text) {
      for (UpdateStatusEnum b : UpdateStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UpdateStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UpdateStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UpdateStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UpdateStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("UpdateStatus")
  private UpdateStatusEnum updateStatus = null;

  @SerializedName("LastUpdateStatusTime")
  private OffsetDateTime lastUpdateStatusTime = null;

  @SerializedName("Notes")
  private String notes = null;

  public UpdateMobileAppsSubmissionStatus mobileAppsSubmissionStatusId(Integer mobileAppsSubmissionStatusId) {
    this.mobileAppsSubmissionStatusId = mobileAppsSubmissionStatusId;
    return this;
  }

   /**
   * Mobile Apps Submission Status Id
   * @return mobileAppsSubmissionStatusId
  **/
  @ApiModelProperty(value = "Mobile Apps Submission Status Id")
  public Integer getMobileAppsSubmissionStatusId() {
    return mobileAppsSubmissionStatusId;
  }

  public void setMobileAppsSubmissionStatusId(Integer mobileAppsSubmissionStatusId) {
    this.mobileAppsSubmissionStatusId = mobileAppsSubmissionStatusId;
  }

  public UpdateMobileAppsSubmissionStatus type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Mobile Type
   * @return type
  **/
  @ApiModelProperty(value = "Mobile Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public UpdateMobileAppsSubmissionStatus appStatus(AppStatusEnum appStatus) {
    this.appStatus = appStatus;
    return this;
  }

   /**
   * Mobile App Status
   * @return appStatus
  **/
  @ApiModelProperty(value = "Mobile App Status")
  public AppStatusEnum getAppStatus() {
    return appStatus;
  }

  public void setAppStatus(AppStatusEnum appStatus) {
    this.appStatus = appStatus;
  }

  public UpdateMobileAppsSubmissionStatus updateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

   /**
   * Mobile App Status
   * @return updateStatus
  **/
  @ApiModelProperty(value = "Mobile App Status")
  public UpdateStatusEnum getUpdateStatus() {
    return updateStatus;
  }

  public void setUpdateStatus(UpdateStatusEnum updateStatus) {
    this.updateStatus = updateStatus;
  }

  public UpdateMobileAppsSubmissionStatus lastUpdateStatusTime(OffsetDateTime lastUpdateStatusTime) {
    this.lastUpdateStatusTime = lastUpdateStatusTime;
    return this;
  }

   /**
   * Mobile LastUpdateStatusTime
   * @return lastUpdateStatusTime
  **/
  @ApiModelProperty(value = "Mobile LastUpdateStatusTime")
  public OffsetDateTime getLastUpdateStatusTime() {
    return lastUpdateStatusTime;
  }

  public void setLastUpdateStatusTime(OffsetDateTime lastUpdateStatusTime) {
    this.lastUpdateStatusTime = lastUpdateStatusTime;
  }

  public UpdateMobileAppsSubmissionStatus notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Mobile Notes
   * @return notes
  **/
  @ApiModelProperty(value = "Mobile Notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMobileAppsSubmissionStatus updateMobileAppsSubmissionStatus = (UpdateMobileAppsSubmissionStatus) o;
    return Objects.equals(this.mobileAppsSubmissionStatusId, updateMobileAppsSubmissionStatus.mobileAppsSubmissionStatusId) &&
        Objects.equals(this.type, updateMobileAppsSubmissionStatus.type) &&
        Objects.equals(this.appStatus, updateMobileAppsSubmissionStatus.appStatus) &&
        Objects.equals(this.updateStatus, updateMobileAppsSubmissionStatus.updateStatus) &&
        Objects.equals(this.lastUpdateStatusTime, updateMobileAppsSubmissionStatus.lastUpdateStatusTime) &&
        Objects.equals(this.notes, updateMobileAppsSubmissionStatus.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileAppsSubmissionStatusId, type, appStatus, updateStatus, lastUpdateStatusTime, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMobileAppsSubmissionStatus {\n");
    
    sb.append("    mobileAppsSubmissionStatusId: ").append(toIndentedString(mobileAppsSubmissionStatusId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    appStatus: ").append(toIndentedString(appStatus)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    lastUpdateStatusTime: ").append(toIndentedString(lastUpdateStatusTime)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

