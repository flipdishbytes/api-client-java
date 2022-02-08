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
import com.flipdish.apiclient.model.StoreKioskSettingModel;
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
 * Store Kiosk Settings
 */
@ApiModel(description = "Store Kiosk Settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class StoreKioskSettings {
  @SerializedName("KioskStoreSettings")
  private List<StoreKioskSettingModel> kioskStoreSettings = null;

  @SerializedName("StoreLogoUrl")
  private String storeLogoUrl = null;

  public StoreKioskSettings kioskStoreSettings(List<StoreKioskSettingModel> kioskStoreSettings) {
    this.kioskStoreSettings = kioskStoreSettings;
    return this;
  }

  public StoreKioskSettings addKioskStoreSettingsItem(StoreKioskSettingModel kioskStoreSettingsItem) {
    if (this.kioskStoreSettings == null) {
      this.kioskStoreSettings = new ArrayList<StoreKioskSettingModel>();
    }
    this.kioskStoreSettings.add(kioskStoreSettingsItem);
    return this;
  }

   /**
   * List of Store Kiosk Settings
   * @return kioskStoreSettings
  **/
  @ApiModelProperty(value = "List of Store Kiosk Settings")
  public List<StoreKioskSettingModel> getKioskStoreSettings() {
    return kioskStoreSettings;
  }

  public void setKioskStoreSettings(List<StoreKioskSettingModel> kioskStoreSettings) {
    this.kioskStoreSettings = kioskStoreSettings;
  }

  public StoreKioskSettings storeLogoUrl(String storeLogoUrl) {
    this.storeLogoUrl = storeLogoUrl;
    return this;
  }

   /**
   * Store Logo Url
   * @return storeLogoUrl
  **/
  @ApiModelProperty(value = "Store Logo Url")
  public String getStoreLogoUrl() {
    return storeLogoUrl;
  }

  public void setStoreLogoUrl(String storeLogoUrl) {
    this.storeLogoUrl = storeLogoUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreKioskSettings storeKioskSettings = (StoreKioskSettings) o;
    return Objects.equals(this.kioskStoreSettings, storeKioskSettings.kioskStoreSettings) &&
        Objects.equals(this.storeLogoUrl, storeKioskSettings.storeLogoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kioskStoreSettings, storeLogoUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreKioskSettings {\n");
    
    sb.append("    kioskStoreSettings: ").append(toIndentedString(kioskStoreSettings)).append("\n");
    sb.append("    storeLogoUrl: ").append(toIndentedString(storeLogoUrl)).append("\n");
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
