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
 * Application Summary  &lt;remarks&gt;Header information for display in lists, like list of apps&lt;/remarks&gt;
 */
@ApiModel(description = "Application Summary  <remarks>Header information for display in lists, like list of apps</remarks>")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-02T15:41:59.208Z")
public class AppSummary {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Logo")
  private String logo = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  /**
   * Application verification status
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    DRAFT("Draft"),
    
    SUBMITTED("Submitted"),
    
    VERIFIED("Verified");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String text) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerificationStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VerificationStatus")
  private VerificationStatusEnum verificationStatus = null;

  @SerializedName("Tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("Regions")
  private List<String> regions = new ArrayList<String>();

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Integration Public Id
   * @return id
  **/
  @ApiModelProperty(value = "Integration Public Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AppSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AppSummary logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Logo
   * @return logo
  **/
  @ApiModelProperty(value = "Logo")
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public AppSummary isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is application enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is application enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AppSummary verificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Application verification status
   * @return verificationStatus
  **/
  @ApiModelProperty(required = true, value = "Application verification status")
  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }

  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }

  public AppSummary tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AppSummary addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "Tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public AppSummary regions(List<String> regions) {
    this.regions = regions;
    return this;
  }

  public AppSummary addRegionsItem(String regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "Regions")
  public List<String> getRegions() {
    return regions;
  }

  public void setRegions(List<String> regions) {
    this.regions = regions;
  }

  public AppSummary developerName(String developerName) {
    this.developerName = developerName;
    return this;
  }

   /**
   * Developer Name
   * @return developerName
  **/
  @ApiModelProperty(value = "Developer Name")
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppSummary appSummary = (AppSummary) o;
    return Objects.equals(this.id, appSummary.id) &&
        Objects.equals(this.name, appSummary.name) &&
        Objects.equals(this.description, appSummary.description) &&
        Objects.equals(this.logo, appSummary.logo) &&
        Objects.equals(this.isEnabled, appSummary.isEnabled) &&
        Objects.equals(this.verificationStatus, appSummary.verificationStatus) &&
        Objects.equals(this.tags, appSummary.tags) &&
        Objects.equals(this.regions, appSummary.regions) &&
        Objects.equals(this.developerName, appSummary.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, logo, isEnabled, verificationStatus, tags, regions, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    developerName: ").append(toIndentedString(developerName)).append("\n");
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

