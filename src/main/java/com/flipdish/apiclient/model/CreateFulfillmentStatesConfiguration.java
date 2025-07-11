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
 * Create fulfillment states configuration
 */
@ApiModel(description = "Create fulfillment states configuration")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class CreateFulfillmentStatesConfiguration {
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

  public CreateFulfillmentStatesConfiguration storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public CreateFulfillmentStatesConfiguration addStoreIdsItem(Integer storeIdsItem) {
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

  public CreateFulfillmentStatesConfiguration storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
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

  public CreateFulfillmentStatesConfiguration states(List<FulfillmentStatusConfigurationItem> states) {
    this.states = states;
    return this;
  }

  public CreateFulfillmentStatesConfiguration addStatesItem(FulfillmentStatusConfigurationItem statesItem) {
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

  public CreateFulfillmentStatesConfiguration automaticTransitionsEnabled(Boolean automaticTransitionsEnabled) {
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

  public CreateFulfillmentStatesConfiguration name(String name) {
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
    CreateFulfillmentStatesConfiguration createFulfillmentStatesConfiguration = (CreateFulfillmentStatesConfiguration) o;
    return Objects.equals(this.storeIds, createFulfillmentStatesConfiguration.storeIds) &&
        Objects.equals(this.storeSelectorType, createFulfillmentStatesConfiguration.storeSelectorType) &&
        Objects.equals(this.states, createFulfillmentStatesConfiguration.states) &&
        Objects.equals(this.automaticTransitionsEnabled, createFulfillmentStatesConfiguration.automaticTransitionsEnabled) &&
        Objects.equals(this.name, createFulfillmentStatesConfiguration.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeIds, storeSelectorType, states, automaticTransitionsEnabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFulfillmentStatesConfiguration {\n");
    
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

