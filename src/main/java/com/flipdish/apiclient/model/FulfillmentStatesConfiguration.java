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
 * Fulfillment States Configuration
 */
@ApiModel(description = "Fulfillment States Configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class FulfillmentStatesConfiguration {
  @SerializedName("States")
  private List<FulfillmentStatusConfigurationItem> states = null;

  @SerializedName("AutomaticTransitionsEnabled")
  private Boolean automaticTransitionsEnabled = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("ConfigurationUid")
  private String configurationUid = null;

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

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("Name")
  private String name = null;

  public FulfillmentStatesConfiguration states(List<FulfillmentStatusConfigurationItem> states) {
    this.states = states;
    return this;
  }

  public FulfillmentStatesConfiguration addStatesItem(FulfillmentStatusConfigurationItem statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<FulfillmentStatusConfigurationItem>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * States
   * @return states
  **/
  @ApiModelProperty(value = "States")
  public List<FulfillmentStatusConfigurationItem> getStates() {
    return states;
  }

  public void setStates(List<FulfillmentStatusConfigurationItem> states) {
    this.states = states;
  }

  public FulfillmentStatesConfiguration automaticTransitionsEnabled(Boolean automaticTransitionsEnabled) {
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

  public FulfillmentStatesConfiguration appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * AppId
   * @return appId
  **/
  @ApiModelProperty(value = "AppId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public FulfillmentStatesConfiguration configurationUid(String configurationUid) {
    this.configurationUid = configurationUid;
    return this;
  }

   /**
   * Configuration Uid
   * @return configurationUid
  **/
  @ApiModelProperty(value = "Configuration Uid")
  public String getConfigurationUid() {
    return configurationUid;
  }

  public void setConfigurationUid(String configurationUid) {
    this.configurationUid = configurationUid;
  }

  public FulfillmentStatesConfiguration storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
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

  public FulfillmentStatesConfiguration storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public FulfillmentStatesConfiguration addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Store Ids
   * @return storeIds
  **/
  @ApiModelProperty(value = "Store Ids")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public FulfillmentStatesConfiguration name(String name) {
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
    FulfillmentStatesConfiguration fulfillmentStatesConfiguration = (FulfillmentStatesConfiguration) o;
    return Objects.equals(this.states, fulfillmentStatesConfiguration.states) &&
        Objects.equals(this.automaticTransitionsEnabled, fulfillmentStatesConfiguration.automaticTransitionsEnabled) &&
        Objects.equals(this.appId, fulfillmentStatesConfiguration.appId) &&
        Objects.equals(this.configurationUid, fulfillmentStatesConfiguration.configurationUid) &&
        Objects.equals(this.storeSelectorType, fulfillmentStatesConfiguration.storeSelectorType) &&
        Objects.equals(this.storeIds, fulfillmentStatesConfiguration.storeIds) &&
        Objects.equals(this.name, fulfillmentStatesConfiguration.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(states, automaticTransitionsEnabled, appId, configurationUid, storeSelectorType, storeIds, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentStatesConfiguration {\n");
    
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
    sb.append("    automaticTransitionsEnabled: ").append(toIndentedString(automaticTransitionsEnabled)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    configurationUid: ").append(toIndentedString(configurationUid)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
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

