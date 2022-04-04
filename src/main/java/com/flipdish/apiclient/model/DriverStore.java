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

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-04T11:37:01.767+01:00")
public class DriverStore {
  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreName")
  private String storeName = null;

  /**
   * Presence
   */
  @JsonAdapter(PresenceEnum.Adapter.class)
  public enum PresenceEnum {
    OFFLINE("Offline"),
    
    ONLINE("Online");

    private String value;

    PresenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PresenceEnum fromValue(String text) {
      for (PresenceEnum b : PresenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PresenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PresenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PresenceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PresenceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Presence")
  private PresenceEnum presence = null;

  public DriverStore storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store identifier
   * @return storeId
  **/
  @ApiModelProperty(value = "Store identifier")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public DriverStore storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store name
   * @return storeName
  **/
  @ApiModelProperty(value = "Store name")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public DriverStore presence(PresenceEnum presence) {
    this.presence = presence;
    return this;
  }

   /**
   * Presence
   * @return presence
  **/
  @ApiModelProperty(value = "Presence")
  public PresenceEnum getPresence() {
    return presence;
  }

  public void setPresence(PresenceEnum presence) {
    this.presence = presence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverStore driverStore = (DriverStore) o;
    return Objects.equals(this.storeId, driverStore.storeId) &&
        Objects.equals(this.storeName, driverStore.storeName) &&
        Objects.equals(this.presence, driverStore.presence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, storeName, presence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverStore {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
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

