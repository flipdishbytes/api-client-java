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
 * App Config Sales Channel
 */
@ApiModel(description = "App Config Sales Channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-14T11:38:28.696Z")
public class AppConfigSalesChannel {
  /**
   * Display a popup to users requesting their email address
   */
  @JsonAdapter(EmailRequestModeEnum.Adapter.class)
  public enum EmailRequestModeEnum {
    DONOTREQUEST("DoNotRequest"),
    
    REQUEST("Request"),
    
    REQUIRE("Require");

    private String value;

    EmailRequestModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailRequestModeEnum fromValue(String text) {
      for (EmailRequestModeEnum b : EmailRequestModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EmailRequestModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailRequestModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailRequestModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EmailRequestModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("EmailRequestMode")
  private EmailRequestModeEnum emailRequestMode = null;

  /**
   * Sends users to their native apps or request them to install the pwa
   */
  @JsonAdapter(WebToAppRedirectEnum.Adapter.class)
  public enum WebToAppRedirectEnum {
    NOREDIRECT("NoRedirect"),
    
    REDIRECTONCE("RedirectOnce"),
    
    REDIRECTALWAYS("RedirectAlways"),
    
    SUGGESTPWA("SuggestPwa"),
    
    FORCEPWA("ForcePwa");

    private String value;

    WebToAppRedirectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WebToAppRedirectEnum fromValue(String text) {
      for (WebToAppRedirectEnum b : WebToAppRedirectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<WebToAppRedirectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WebToAppRedirectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WebToAppRedirectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return WebToAppRedirectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("WebToAppRedirect")
  private WebToAppRedirectEnum webToAppRedirect = null;

  /**
   * Address entry type
   */
  @JsonAdapter(AddressEntryTypeEnum.Adapter.class)
  public enum AddressEntryTypeEnum {
    MAPFIRST("MapFirst"),
    
    TEXTENTRYMANUALALLOWED("TextEntryManualAllowed"),
    
    TEXTENTRYMANUALDISALLOWED("TextEntryManualDisallowed");

    private String value;

    AddressEntryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressEntryTypeEnum fromValue(String text) {
      for (AddressEntryTypeEnum b : AddressEntryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AddressEntryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressEntryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressEntryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressEntryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AddressEntryType")
  private AddressEntryTypeEnum addressEntryType = null;

  @SerializedName("DisplayDeliveryRestaurantListScreen")
  private Boolean displayDeliveryRestaurantListScreen = null;

  public AppConfigSalesChannel emailRequestMode(EmailRequestModeEnum emailRequestMode) {
    this.emailRequestMode = emailRequestMode;
    return this;
  }

   /**
   * Display a popup to users requesting their email address
   * @return emailRequestMode
  **/
  @ApiModelProperty(value = "Display a popup to users requesting their email address")
  public EmailRequestModeEnum getEmailRequestMode() {
    return emailRequestMode;
  }

  public void setEmailRequestMode(EmailRequestModeEnum emailRequestMode) {
    this.emailRequestMode = emailRequestMode;
  }

  public AppConfigSalesChannel webToAppRedirect(WebToAppRedirectEnum webToAppRedirect) {
    this.webToAppRedirect = webToAppRedirect;
    return this;
  }

   /**
   * Sends users to their native apps or request them to install the pwa
   * @return webToAppRedirect
  **/
  @ApiModelProperty(value = "Sends users to their native apps or request them to install the pwa")
  public WebToAppRedirectEnum getWebToAppRedirect() {
    return webToAppRedirect;
  }

  public void setWebToAppRedirect(WebToAppRedirectEnum webToAppRedirect) {
    this.webToAppRedirect = webToAppRedirect;
  }

  public AppConfigSalesChannel addressEntryType(AddressEntryTypeEnum addressEntryType) {
    this.addressEntryType = addressEntryType;
    return this;
  }

   /**
   * Address entry type
   * @return addressEntryType
  **/
  @ApiModelProperty(value = "Address entry type")
  public AddressEntryTypeEnum getAddressEntryType() {
    return addressEntryType;
  }

  public void setAddressEntryType(AddressEntryTypeEnum addressEntryType) {
    this.addressEntryType = addressEntryType;
  }

  public AppConfigSalesChannel displayDeliveryRestaurantListScreen(Boolean displayDeliveryRestaurantListScreen) {
    this.displayDeliveryRestaurantListScreen = displayDeliveryRestaurantListScreen;
    return this;
  }

   /**
   * Display Pickup Restaurant List Screen
   * @return displayDeliveryRestaurantListScreen
  **/
  @ApiModelProperty(value = "Display Pickup Restaurant List Screen")
  public Boolean isDisplayDeliveryRestaurantListScreen() {
    return displayDeliveryRestaurantListScreen;
  }

  public void setDisplayDeliveryRestaurantListScreen(Boolean displayDeliveryRestaurantListScreen) {
    this.displayDeliveryRestaurantListScreen = displayDeliveryRestaurantListScreen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppConfigSalesChannel appConfigSalesChannel = (AppConfigSalesChannel) o;
    return Objects.equals(this.emailRequestMode, appConfigSalesChannel.emailRequestMode) &&
        Objects.equals(this.webToAppRedirect, appConfigSalesChannel.webToAppRedirect) &&
        Objects.equals(this.addressEntryType, appConfigSalesChannel.addressEntryType) &&
        Objects.equals(this.displayDeliveryRestaurantListScreen, appConfigSalesChannel.displayDeliveryRestaurantListScreen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailRequestMode, webToAppRedirect, addressEntryType, displayDeliveryRestaurantListScreen);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppConfigSalesChannel {\n");
    
    sb.append("    emailRequestMode: ").append(toIndentedString(emailRequestMode)).append("\n");
    sb.append("    webToAppRedirect: ").append(toIndentedString(webToAppRedirect)).append("\n");
    sb.append("    addressEntryType: ").append(toIndentedString(addressEntryType)).append("\n");
    sb.append("    displayDeliveryRestaurantListScreen: ").append(toIndentedString(displayDeliveryRestaurantListScreen)).append("\n");
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

