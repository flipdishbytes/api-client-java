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
 * App store app summary information
 */
@ApiModel(description = "App store app summary information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-16T11:11:31.213Z")
public class AppStoreAppSummary {
  @SerializedName("Id")
  private String id = null;

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

  @SerializedName("Logo")
  private String logo = null;

  @SerializedName("Internal")
  private Boolean internal = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  /**
   * Gets or Sets categories
   */
  @JsonAdapter(CategoriesEnum.Adapter.class)
  public enum CategoriesEnum {
    POINTOFSALE("PointOfSale"),
    
    DELIVERYANDLOGISTICS("DeliveryAndLogistics"),
    
    CRM("CRM"),
    
    GIFTCARD("GiftCard"),
    
    ACCOUNTING("Accounting"),
    
    LOYALTYANDMARKETING("LoyaltyAndMarketing"),
    
    OTHER("Other");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoriesEnum fromValue(String text) {
      for (CategoriesEnum b : CategoriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoriesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoriesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoriesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Categories")
  private List<CategoriesEnum> categories = new ArrayList<CategoriesEnum>();

  /**
   * Gets or Sets countries
   */
  @JsonAdapter(CountriesEnum.Adapter.class)
  public enum CountriesEnum {
    GB("GB"),
    
    IE("IE"),
    
    FR("FR"),
    
    ES("ES"),
    
    PT("PT"),
    
    IT("IT"),
    
    DE("DE"),
    
    PL("PL"),
    
    BE("BE"),
    
    LU("LU"),
    
    NL("NL"),
    
    US("US"),
    
    CA("CA"),
    
    BG("BG"),
    
    MX("MX"),
    
    AU("AU"),
    
    NZ("NZ");

    private String value;

    CountriesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CountriesEnum fromValue(String text) {
      for (CountriesEnum b : CountriesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CountriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CountriesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CountriesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CountriesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Countries")
  private List<CountriesEnum> countries = new ArrayList<CountriesEnum>();

  @SerializedName("DeveloperName")
  private String developerName = null;

  public AppStoreAppSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique App store app id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique App store app id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppStoreAppSummary verificationStatus(VerificationStatusEnum verificationStatus) {
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

  public AppStoreAppSummary logo(String logo) {
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

  public AppStoreAppSummary internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Internal
   * @return internal
  **/
  @ApiModelProperty(required = true, value = "Internal")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public AppStoreAppSummary name(String name) {
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

  public AppStoreAppSummary description(String description) {
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

  public AppStoreAppSummary isEnabled(Boolean isEnabled) {
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

  public AppStoreAppSummary categories(List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }

  public AppStoreAppSummary addCategoriesItem(CategoriesEnum categoriesItem) {
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories
   * @return categories
  **/
  @ApiModelProperty(required = true, value = "Categories")
  public List<CategoriesEnum> getCategories() {
    return categories;
  }

  public void setCategories(List<CategoriesEnum> categories) {
    this.categories = categories;
  }

  public AppStoreAppSummary countries(List<CountriesEnum> countries) {
    this.countries = countries;
    return this;
  }

  public AppStoreAppSummary addCountriesItem(CountriesEnum countriesItem) {
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Countries
   * @return countries
  **/
  @ApiModelProperty(required = true, value = "Countries")
  public List<CountriesEnum> getCountries() {
    return countries;
  }

  public void setCountries(List<CountriesEnum> countries) {
    this.countries = countries;
  }

  public AppStoreAppSummary developerName(String developerName) {
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
    AppStoreAppSummary appStoreAppSummary = (AppStoreAppSummary) o;
    return Objects.equals(this.id, appStoreAppSummary.id) &&
        Objects.equals(this.verificationStatus, appStoreAppSummary.verificationStatus) &&
        Objects.equals(this.logo, appStoreAppSummary.logo) &&
        Objects.equals(this.internal, appStoreAppSummary.internal) &&
        Objects.equals(this.name, appStoreAppSummary.name) &&
        Objects.equals(this.description, appStoreAppSummary.description) &&
        Objects.equals(this.isEnabled, appStoreAppSummary.isEnabled) &&
        Objects.equals(this.categories, appStoreAppSummary.categories) &&
        Objects.equals(this.countries, appStoreAppSummary.countries) &&
        Objects.equals(this.developerName, appStoreAppSummary.developerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, verificationStatus, logo, internal, name, description, isEnabled, categories, countries, developerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

