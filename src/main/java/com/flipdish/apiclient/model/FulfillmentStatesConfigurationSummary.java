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
import com.flipdish.apiclient.model.FulfillmentStatesConfiguredStore;
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
 * Fulfillment configuration header information
 */
@ApiModel(description = "Fulfillment configuration header information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class FulfillmentStatesConfigurationSummary {
  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("ConfigurationUid")
  private String configurationUid = null;

  @SerializedName("Name")
  private String name = null;

  /**
   * Store selector type
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

  @SerializedName("Stores")
  private List<FulfillmentStatesConfiguredStore> stores = null;

  public FulfillmentStatesConfigurationSummary appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * AppId
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "AppId")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public FulfillmentStatesConfigurationSummary configurationUid(String configurationUid) {
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

  public FulfillmentStatesConfigurationSummary name(String name) {
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

  public FulfillmentStatesConfigurationSummary storeSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
    return this;
  }

   /**
   * Store selector type
   * @return storeSelectorType
  **/
  @ApiModelProperty(value = "Store selector type")
  public StoreSelectorTypeEnum getStoreSelectorType() {
    return storeSelectorType;
  }

  public void setStoreSelectorType(StoreSelectorTypeEnum storeSelectorType) {
    this.storeSelectorType = storeSelectorType;
  }

  public FulfillmentStatesConfigurationSummary stores(List<FulfillmentStatesConfiguredStore> stores) {
    this.stores = stores;
    return this;
  }

  public FulfillmentStatesConfigurationSummary addStoresItem(FulfillmentStatesConfiguredStore storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<FulfillmentStatesConfiguredStore>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Stores
   * @return stores
  **/
  @ApiModelProperty(value = "Stores")
  public List<FulfillmentStatesConfiguredStore> getStores() {
    return stores;
  }

  public void setStores(List<FulfillmentStatesConfiguredStore> stores) {
    this.stores = stores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentStatesConfigurationSummary fulfillmentStatesConfigurationSummary = (FulfillmentStatesConfigurationSummary) o;
    return Objects.equals(this.appId, fulfillmentStatesConfigurationSummary.appId) &&
        Objects.equals(this.configurationUid, fulfillmentStatesConfigurationSummary.configurationUid) &&
        Objects.equals(this.name, fulfillmentStatesConfigurationSummary.name) &&
        Objects.equals(this.storeSelectorType, fulfillmentStatesConfigurationSummary.storeSelectorType) &&
        Objects.equals(this.stores, fulfillmentStatesConfigurationSummary.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, configurationUid, name, storeSelectorType, stores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentStatesConfigurationSummary {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    configurationUid: ").append(toIndentedString(configurationUid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storeSelectorType: ").append(toIndentedString(storeSelectorType)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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

