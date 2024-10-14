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
 * Mobile Apps Statistics
 */
@ApiModel(description = "Mobile Apps Statistics")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-14T09:27:31.777Z")
public class MobileAppsStatistics {
  @SerializedName("NumberDownload")
  private Integer numberDownload = null;

  @SerializedName("CurrentRate")
  private Integer currentRate = null;

  @SerializedName("CurrentVersion")
  private String currentVersion = null;

  @SerializedName("PlayStoreLink")
  private String playStoreLink = null;

  @SerializedName("AppBundleId")
  private String appBundleId = null;

  @SerializedName("LastUpdated")
  private OffsetDateTime lastUpdated = null;

  @SerializedName("Notes")
  private String notes = null;

  @SerializedName("Published")
  private Boolean published = null;

  /**
   * Platform Type
   */
  @JsonAdapter(PlatformTypeEnum.Adapter.class)
  public enum PlatformTypeEnum {
    NONE("None"),
    
    ANDROID("Android"),
    
    IOS("IOS");

    private String value;

    PlatformTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PlatformTypeEnum fromValue(String text) {
      for (PlatformTypeEnum b : PlatformTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PlatformTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PlatformTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PlatformTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PlatformTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PlatformType")
  private PlatformTypeEnum platformType = null;

  public MobileAppsStatistics numberDownload(Integer numberDownload) {
    this.numberDownload = numberDownload;
    return this;
  }

   /**
   * Number Download
   * @return numberDownload
  **/
  @ApiModelProperty(value = "Number Download")
  public Integer getNumberDownload() {
    return numberDownload;
  }

  public void setNumberDownload(Integer numberDownload) {
    this.numberDownload = numberDownload;
  }

  public MobileAppsStatistics currentRate(Integer currentRate) {
    this.currentRate = currentRate;
    return this;
  }

   /**
   * Current Rate
   * @return currentRate
  **/
  @ApiModelProperty(value = "Current Rate")
  public Integer getCurrentRate() {
    return currentRate;
  }

  public void setCurrentRate(Integer currentRate) {
    this.currentRate = currentRate;
  }

  public MobileAppsStatistics currentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

   /**
   * Current Version
   * @return currentVersion
  **/
  @ApiModelProperty(value = "Current Version")
  public String getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }

  public MobileAppsStatistics playStoreLink(String playStoreLink) {
    this.playStoreLink = playStoreLink;
    return this;
  }

   /**
   * Play Store Link
   * @return playStoreLink
  **/
  @ApiModelProperty(value = "Play Store Link")
  public String getPlayStoreLink() {
    return playStoreLink;
  }

  public void setPlayStoreLink(String playStoreLink) {
    this.playStoreLink = playStoreLink;
  }

  public MobileAppsStatistics appBundleId(String appBundleId) {
    this.appBundleId = appBundleId;
    return this;
  }

   /**
   * App Bundle Id
   * @return appBundleId
  **/
  @ApiModelProperty(value = "App Bundle Id")
  public String getAppBundleId() {
    return appBundleId;
  }

  public void setAppBundleId(String appBundleId) {
    this.appBundleId = appBundleId;
  }

  public MobileAppsStatistics lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * Last Updated
   * @return lastUpdated
  **/
  @ApiModelProperty(value = "Last Updated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public MobileAppsStatistics notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Last Updated
   * @return notes
  **/
  @ApiModelProperty(value = "Last Updated")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public MobileAppsStatistics published(Boolean published) {
    this.published = published;
    return this;
  }

   /**
   * Published
   * @return published
  **/
  @ApiModelProperty(value = "Published")
  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public MobileAppsStatistics platformType(PlatformTypeEnum platformType) {
    this.platformType = platformType;
    return this;
  }

   /**
   * Platform Type
   * @return platformType
  **/
  @ApiModelProperty(value = "Platform Type")
  public PlatformTypeEnum getPlatformType() {
    return platformType;
  }

  public void setPlatformType(PlatformTypeEnum platformType) {
    this.platformType = platformType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileAppsStatistics mobileAppsStatistics = (MobileAppsStatistics) o;
    return Objects.equals(this.numberDownload, mobileAppsStatistics.numberDownload) &&
        Objects.equals(this.currentRate, mobileAppsStatistics.currentRate) &&
        Objects.equals(this.currentVersion, mobileAppsStatistics.currentVersion) &&
        Objects.equals(this.playStoreLink, mobileAppsStatistics.playStoreLink) &&
        Objects.equals(this.appBundleId, mobileAppsStatistics.appBundleId) &&
        Objects.equals(this.lastUpdated, mobileAppsStatistics.lastUpdated) &&
        Objects.equals(this.notes, mobileAppsStatistics.notes) &&
        Objects.equals(this.published, mobileAppsStatistics.published) &&
        Objects.equals(this.platformType, mobileAppsStatistics.platformType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberDownload, currentRate, currentVersion, playStoreLink, appBundleId, lastUpdated, notes, published, platformType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileAppsStatistics {\n");
    
    sb.append("    numberDownload: ").append(toIndentedString(numberDownload)).append("\n");
    sb.append("    currentRate: ").append(toIndentedString(currentRate)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    playStoreLink: ").append(toIndentedString(playStoreLink)).append("\n");
    sb.append("    appBundleId: ").append(toIndentedString(appBundleId)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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

