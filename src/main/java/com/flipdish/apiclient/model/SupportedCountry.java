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
 * Describes a supported country
 */
@ApiModel(description = "Describes a supported country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class SupportedCountry {
  @SerializedName("CountryCode")
  private String countryCode = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PhoneCode")
  private Integer phoneCode = null;

  @SerializedName("LanguageCode")
  private String languageCode = null;

  @SerializedName("LanguageName")
  private String languageName = null;

  @SerializedName("OtpNumber")
  private String otpNumber = null;

  @SerializedName("SupportNumber")
  private String supportNumber = null;

  /**
   * Address layout format. This changes the layout of address entry forms on the web app, iOS and Android app and should be set based on local custom.
   */
  @JsonAdapter(AddressLayoutEnum.Adapter.class)
  public enum AddressLayoutEnum {
    BUILDINGFIRST("BuildingFirst"),
    
    ADDRESSFIRST("AddressFirst"),
    
    FULLSTREETADDRESSFIRST("FullStreetAddressFirst");

    private String value;

    AddressLayoutEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressLayoutEnum fromValue(String text) {
      for (AddressLayoutEnum b : AddressLayoutEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AddressLayoutEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressLayoutEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressLayoutEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AddressLayoutEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AddressLayout")
  private AddressLayoutEnum addressLayout = null;

  /**
   * Post code type
   */
  @JsonAdapter(PostCodeTypeEnum.Adapter.class)
  public enum PostCodeTypeEnum {
    NONE("None"),
    
    POSTCODE("PostCode"),
    
    ZIP("Zip");

    private String value;

    PostCodeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PostCodeTypeEnum fromValue(String text) {
      for (PostCodeTypeEnum b : PostCodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PostCodeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PostCodeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PostCodeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PostCodeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PostCodeType")
  private PostCodeTypeEnum postCodeType = null;

  /**
   * Supported region. This is not used.
   */
  @JsonAdapter(SupportRegionEnum.Adapter.class)
  public enum SupportRegionEnum {
    DEFAULT("Default"),
    
    SPAIN("Spain"),
    
    BENELUX("Benelux");

    private String value;

    SupportRegionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SupportRegionEnum fromValue(String text) {
      for (SupportRegionEnum b : SupportRegionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SupportRegionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportRegionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportRegionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SupportRegionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SupportRegion")
  private SupportRegionEnum supportRegion = null;

  public SupportedCountry countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SupportedCountry name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nice display name for a country
   * @return name
  **/
  @ApiModelProperty(value = "Nice display name for a country")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SupportedCountry phoneCode(Integer phoneCode) {
    this.phoneCode = phoneCode;
    return this;
  }

   /**
   * Country internatinoal phone code prefix
   * @return phoneCode
  **/
  @ApiModelProperty(value = "Country internatinoal phone code prefix")
  public Integer getPhoneCode() {
    return phoneCode;
  }

  public void setPhoneCode(Integer phoneCode) {
    this.phoneCode = phoneCode;
  }

  public SupportedCountry languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Language code
   * @return languageCode
  **/
  @ApiModelProperty(value = "Language code")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public SupportedCountry languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

   /**
   * Language name
   * @return languageName
  **/
  @ApiModelProperty(value = "Language name")
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }

  public SupportedCountry otpNumber(String otpNumber) {
    this.otpNumber = otpNumber;
    return this;
  }

   /**
   * The phone number provided to Store staff which, in conjunction with a one-time-code, will connect them to the customer.
   * @return otpNumber
  **/
  @ApiModelProperty(value = "The phone number provided to Store staff which, in conjunction with a one-time-code, will connect them to the customer.")
  public String getOtpNumber() {
    return otpNumber;
  }

  public void setOtpNumber(String otpNumber) {
    this.otpNumber = otpNumber;
  }

  public SupportedCountry supportNumber(String supportNumber) {
    this.supportNumber = supportNumber;
    return this;
  }

   /**
   * The store&#39;s support phone number, displayed to customers.
   * @return supportNumber
  **/
  @ApiModelProperty(value = "The store's support phone number, displayed to customers.")
  public String getSupportNumber() {
    return supportNumber;
  }

  public void setSupportNumber(String supportNumber) {
    this.supportNumber = supportNumber;
  }

  public SupportedCountry addressLayout(AddressLayoutEnum addressLayout) {
    this.addressLayout = addressLayout;
    return this;
  }

   /**
   * Address layout format. This changes the layout of address entry forms on the web app, iOS and Android app and should be set based on local custom.
   * @return addressLayout
  **/
  @ApiModelProperty(value = "Address layout format. This changes the layout of address entry forms on the web app, iOS and Android app and should be set based on local custom.")
  public AddressLayoutEnum getAddressLayout() {
    return addressLayout;
  }

  public void setAddressLayout(AddressLayoutEnum addressLayout) {
    this.addressLayout = addressLayout;
  }

  public SupportedCountry postCodeType(PostCodeTypeEnum postCodeType) {
    this.postCodeType = postCodeType;
    return this;
  }

   /**
   * Post code type
   * @return postCodeType
  **/
  @ApiModelProperty(value = "Post code type")
  public PostCodeTypeEnum getPostCodeType() {
    return postCodeType;
  }

  public void setPostCodeType(PostCodeTypeEnum postCodeType) {
    this.postCodeType = postCodeType;
  }

  public SupportedCountry supportRegion(SupportRegionEnum supportRegion) {
    this.supportRegion = supportRegion;
    return this;
  }

   /**
   * Supported region. This is not used.
   * @return supportRegion
  **/
  @ApiModelProperty(value = "Supported region. This is not used.")
  public SupportRegionEnum getSupportRegion() {
    return supportRegion;
  }

  public void setSupportRegion(SupportRegionEnum supportRegion) {
    this.supportRegion = supportRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedCountry supportedCountry = (SupportedCountry) o;
    return Objects.equals(this.countryCode, supportedCountry.countryCode) &&
        Objects.equals(this.name, supportedCountry.name) &&
        Objects.equals(this.phoneCode, supportedCountry.phoneCode) &&
        Objects.equals(this.languageCode, supportedCountry.languageCode) &&
        Objects.equals(this.languageName, supportedCountry.languageName) &&
        Objects.equals(this.otpNumber, supportedCountry.otpNumber) &&
        Objects.equals(this.supportNumber, supportedCountry.supportNumber) &&
        Objects.equals(this.addressLayout, supportedCountry.addressLayout) &&
        Objects.equals(this.postCodeType, supportedCountry.postCodeType) &&
        Objects.equals(this.supportRegion, supportedCountry.supportRegion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, name, phoneCode, languageCode, languageName, otpNumber, supportNumber, addressLayout, postCodeType, supportRegion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedCountry {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneCode: ").append(toIndentedString(phoneCode)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    otpNumber: ").append(toIndentedString(otpNumber)).append("\n");
    sb.append("    supportNumber: ").append(toIndentedString(supportNumber)).append("\n");
    sb.append("    addressLayout: ").append(toIndentedString(addressLayout)).append("\n");
    sb.append("    postCodeType: ").append(toIndentedString(postCodeType)).append("\n");
    sb.append("    supportRegion: ").append(toIndentedString(supportRegion)).append("\n");
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
