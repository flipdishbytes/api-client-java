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
import com.flipdish.apiclient.model.FulfillmentStatusConfigurationItem;
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
 * Update fulfillment states configuration
 */
@ApiModel(description = "Update fulfillment states configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-28T10:12:52.786+01:00")
public class UpdateFulfillmentStatesConfiguration {
  @SerializedName("OverwriteSystemTemplate")
  private Boolean overwriteSystemTemplate = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  /**
   * Store Selector Type
   */
  @JsonAdapter(StoreSelectorTypeEnum.Adapter.class)
  public enum StoreSelectorTypeEnum {
    NONE("None"),
    
    SINGLE("Single"),
    
    MULTIPLE("Multiple");

    private String value;

    StoreSelectorTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StoreSelectorTypeEnum fromValue(String text) {
      for (StoreSelectorTypeEnum b : StoreSelectorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StoreSelectorTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StoreSelectorTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StoreSelectorTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StoreSelectorTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("StoreSelectorType")
  private StoreSelectorTypeEnum storeSelectorType = null;

  @SerializedName("States")
  private List<FulfillmentStatusConfigurationItem> states = null;

  @SerializedName("AutomaticTransitionsEnabled")
  private Boolean automaticTransitionsEnabled = null;

  @SerializedName("Name")
  private String name = null;

  public UpdateFulfillmentStatesConfiguration overwriteSystemTemplate(Boolean overwriteSystemTemplate) {
    this.overwriteSystemTemplate = overwriteSystemTemplate;
    return this;
  }

   /**
   * Set to true if a system configuration template is to be updated (permissions also needed)
   * @return overwriteSystemTemplate
  **/
  @ApiModelProperty(value = "Set to true if a system configuration template is to be updated (permissions also needed)")
  public Boolean isOverwriteSystemTemplate() {
    return overwriteSystemTemplate;
  }

  public void setOverwriteSystemTemplate(Boolean overwriteSystemTemplate) {
    this.overwriteSystemTemplate = overwriteSystemTemplate;
  }

  public UpdateFulfillmentStatesConfiguration storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public UpdateFulfillmentStatesConfiguration addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Stores id&#39;s
   * @return storeIds
  **/
  @ApiModelProperty(value = "Stores id's")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public UpdateFulfillmentStatesConfiguration storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Store Selector Type
   * @return storeSelectorType
  **/
  @ApiModelProperty(value = "Store Selector Type")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public UpdateFulfillmentStatesConfiguration states(List<FulfillmentStatusConfigurationItem> states) {
    this.states = states;
    return this;
  }

  public UpdateFulfillmentStatesConfiguration addStatesItem(FulfillmentStatusConfigurationItem statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<FulfillmentStatusConfigurationItem>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * Settings
   * @return states
  **/
  @ApiModelProperty(value = "Settings")
  public List<FulfillmentStatusConfigurationItem> getStates() {
    return states;
  }

  public void setStates(List<FulfillmentStatusConfigurationItem> states) {
    this.states = states;
  }

  public UpdateFulfillmentStatesConfiguration automaticTransitionsEnabled(Boolean automaticTransitionsEnabled) {
    this.automaticTransitionsEnabled = automaticTransitionsEnabled;
    return this;
  }

   /**
   * Enable automatic transitions
   * @return automaticTransitionsEnabled
  **/
  @ApiModelProperty(value = "Enable automatic transitions")
  public Boolean isAutomaticTransitionsEnabled() {
    return automaticTransitionsEnabled;
  }

  public void setAutomaticTransitionsEnabled(Boolean automaticTransitionsEnabled) {
    this.automaticTransitionsEnabled = automaticTransitionsEnabled;
  }

  public UpdateFulfillmentStatesConfiguration name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFulfillmentStatesConfiguration updateFulfillmentStatesConfiguration = (UpdateFulfillmentStatesConfiguration) o;
    return Objects.equals(this.overwriteSystemTemplate, updateFulfillmentStatesConfiguration.overwriteSystemTemplate) &&
        Objects.equals(this.storeIds, updateFulfillmentStatesConfiguration.storeIds) &&
        Objects.equals(this.storeSelectorType, updateFulfillmentStatesConfiguration.storeSelectorType) &&
        Objects.equals(this.states, updateFulfillmentStatesConfiguration.states) &&
        Objects.equals(this.automaticTransitionsEnabled, updateFulfillmentStatesConfiguration.automaticTransitionsEnabled) &&
        Objects.equals(this.name, updateFulfillmentStatesConfiguration.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overwriteSystemTemplate, storeIds, storeSelectorType, states, automaticTransitionsEnabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFulfillmentStatesConfiguration {\n");
    
    sb.append("    overwriteSystemTemplate: ").append(toIndentedString(overwriteSystemTemplate)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    automaticTransitionsEnabled: ").append(toIndentedString(automaticTransitionsEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

