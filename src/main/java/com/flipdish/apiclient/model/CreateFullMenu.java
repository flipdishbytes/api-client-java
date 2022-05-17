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
import com.flipdish.apiclient.model.CreateFullMenuSection;
import com.flipdish.apiclient.model.CreateMenuTaxRate;
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
 * Create menu object
 */
@ApiModel(description = "Create menu object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-17T12:59:34.139+01:00")
public class CreateFullMenu {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("MenuSections")
  private List<CreateFullMenuSection> menuSections = null;

  @SerializedName("TaxRates")
  private List<CreateMenuTaxRate> taxRates = null;

  @SerializedName("DisplaySectionLinks")
  private Boolean displaySectionLinks = null;

  /**
   * Menu section behaviour
   */
  @JsonAdapter(MenuSectionBehaviourEnum.Adapter.class)
  public enum MenuSectionBehaviourEnum {
    EXPANDSINGLE("ExpandSingle"),
    
    EXPANDMULTIPLE("ExpandMultiple");

    private String value;

    MenuSectionBehaviourEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MenuSectionBehaviourEnum fromValue(String text) {
      for (MenuSectionBehaviourEnum b : MenuSectionBehaviourEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MenuSectionBehaviourEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MenuSectionBehaviourEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MenuSectionBehaviourEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MenuSectionBehaviourEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MenuSectionBehaviour")
  private MenuSectionBehaviourEnum menuSectionBehaviour = null;

  /**
   * Tax type
   */
  @JsonAdapter(TaxTypeEnum.Adapter.class)
  public enum TaxTypeEnum {
    INCLUDEDINBASEPRICE("IncludedInBasePrice"),
    
    EXCLUDEDFROMBASEPRICE("ExcludedFromBasePrice");

    private String value;

    TaxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxTypeEnum fromValue(String text) {
      for (TaxTypeEnum b : TaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TaxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TaxTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TaxType")
  private TaxTypeEnum taxType = null;

  public CreateFullMenu name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Menu, only shown in portal
   * @return name
  **/
  @ApiModelProperty(value = "Name of Menu, only shown in portal")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFullMenu imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image url
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Image url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public CreateFullMenu menuSections(List<CreateFullMenuSection> menuSections) {
    this.menuSections = menuSections;
    return this;
  }

  public CreateFullMenu addMenuSectionsItem(CreateFullMenuSection menuSectionsItem) {
    if (this.menuSections == null) {
      this.menuSections = new ArrayList<CreateFullMenuSection>();
    }
    this.menuSections.add(menuSectionsItem);
    return this;
  }

   /**
   * Menu sections (startes, main etc)
   * @return menuSections
  **/
  @ApiModelProperty(value = "Menu sections (startes, main etc)")
  public List<CreateFullMenuSection> getMenuSections() {
    return menuSections;
  }

  public void setMenuSections(List<CreateFullMenuSection> menuSections) {
    this.menuSections = menuSections;
  }

  public CreateFullMenu taxRates(List<CreateMenuTaxRate> taxRates) {
    this.taxRates = taxRates;
    return this;
  }

  public CreateFullMenu addTaxRatesItem(CreateMenuTaxRate taxRatesItem) {
    if (this.taxRates == null) {
      this.taxRates = new ArrayList<CreateMenuTaxRate>();
    }
    this.taxRates.add(taxRatesItem);
    return this;
  }

   /**
   * Menu tax rates
   * @return taxRates
  **/
  @ApiModelProperty(value = "Menu tax rates")
  public List<CreateMenuTaxRate> getTaxRates() {
    return taxRates;
  }

  public void setTaxRates(List<CreateMenuTaxRate> taxRates) {
    this.taxRates = taxRates;
  }

  public CreateFullMenu displaySectionLinks(Boolean displaySectionLinks) {
    this.displaySectionLinks = displaySectionLinks;
    return this;
  }

   /**
   * Display menu section link on UI
   * @return displaySectionLinks
  **/
  @ApiModelProperty(value = "Display menu section link on UI")
  public Boolean isDisplaySectionLinks() {
    return displaySectionLinks;
  }

  public void setDisplaySectionLinks(Boolean displaySectionLinks) {
    this.displaySectionLinks = displaySectionLinks;
  }

  public CreateFullMenu menuSectionBehaviour(MenuSectionBehaviourEnum menuSectionBehaviour) {
    this.menuSectionBehaviour = menuSectionBehaviour;
    return this;
  }

   /**
   * Menu section behaviour
   * @return menuSectionBehaviour
  **/
  @ApiModelProperty(value = "Menu section behaviour")
  public MenuSectionBehaviourEnum getMenuSectionBehaviour() {
    return menuSectionBehaviour;
  }

  public void setMenuSectionBehaviour(MenuSectionBehaviourEnum menuSectionBehaviour) {
    this.menuSectionBehaviour = menuSectionBehaviour;
  }

  public CreateFullMenu taxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Tax type
   * @return taxType
  **/
  @ApiModelProperty(value = "Tax type")
  public TaxTypeEnum getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFullMenu createFullMenu = (CreateFullMenu) o;
    return Objects.equals(this.name, createFullMenu.name) &&
        Objects.equals(this.imageUrl, createFullMenu.imageUrl) &&
        Objects.equals(this.menuSections, createFullMenu.menuSections) &&
        Objects.equals(this.taxRates, createFullMenu.taxRates) &&
        Objects.equals(this.displaySectionLinks, createFullMenu.displaySectionLinks) &&
        Objects.equals(this.menuSectionBehaviour, createFullMenu.menuSectionBehaviour) &&
        Objects.equals(this.taxType, createFullMenu.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, imageUrl, menuSections, taxRates, displaySectionLinks, menuSectionBehaviour, taxType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFullMenu {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    menuSections: ").append(toIndentedString(menuSections)).append("\n");
    sb.append("    taxRates: ").append(toIndentedString(taxRates)).append("\n");
    sb.append("    displaySectionLinks: ").append(toIndentedString(displaySectionLinks)).append("\n");
    sb.append("    menuSectionBehaviour: ").append(toIndentedString(menuSectionBehaviour)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
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

