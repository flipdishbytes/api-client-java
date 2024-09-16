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
 * Defines a customer create model
 */
@ApiModel(description = "Defines a customer create model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-16T14:31:56.180Z")
public class CustomerCreateModel {
  @SerializedName("PhoneNumber")
  private String phoneNumber = null;

  /**
   * Customer AppType
   */
  @JsonAdapter(AppTypeEnum.Adapter.class)
  public enum AppTypeEnum {
    UNKNOWN("Unknown"),
    
    IOS("Ios"),
    
    ANDROID("Android"),
    
    WEB("Web"),
    
    KIOSK("Kiosk"),
    
    POS("Pos"),
    
    TELEPHONECALL("TelephoneCall"),
    
    SMS("Sms"),
    
    PWAANDROID("PwaAndroid"),
    
    PWAIOS("PwaIos"),
    
    GOOGLE("Google");

    private String value;

    AppTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AppTypeEnum fromValue(String text) {
      for (AppTypeEnum b : AppTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AppTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AppTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AppTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AppTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AppType")
  private AppTypeEnum appType = null;

  @SerializedName("Name")
  private String name = null;

  public CustomerCreateModel phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Customer Phone Number
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Customer Phone Number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CustomerCreateModel appType(AppTypeEnum appType) {
    this.appType = appType;
    return this;
  }

   /**
   * Customer AppType
   * @return appType
  **/
  @ApiModelProperty(value = "Customer AppType")
  public AppTypeEnum getAppType() {
    return appType;
  }

  public void setAppType(AppTypeEnum appType) {
    this.appType = appType;
  }

  public CustomerCreateModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Customer Name
   * @return name
  **/
  @ApiModelProperty(value = "Customer Name")
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
    CustomerCreateModel customerCreateModel = (CustomerCreateModel) o;
    return Objects.equals(this.phoneNumber, customerCreateModel.phoneNumber) &&
        Objects.equals(this.appType, customerCreateModel.appType) &&
        Objects.equals(this.name, customerCreateModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, appType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerCreateModel {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
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

