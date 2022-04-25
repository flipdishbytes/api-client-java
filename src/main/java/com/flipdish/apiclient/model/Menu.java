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
import com.flipdish.apiclient.model.MenuSection;
import com.flipdish.apiclient.model.MenuTaxRate;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Menu
 */
@ApiModel(description = "Menu")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-25T15:07:58.954+01:00")
public class Menu {
  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("ModifiedTime")
  private OffsetDateTime modifiedTime = null;

  @SerializedName("VersionNumber")
  private Integer versionNumber = null;

  @SerializedName("ImageName")
  private String imageName = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Locked")
  private Boolean locked = null;

  @SerializedName("MenuSections")
  private List<MenuSection> menuSections = null;

  @SerializedName("TaxRates")
  private List<MenuTaxRate> taxRates = null;

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

  public Menu menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Menu identifier
   * @return menuId
  **/
  @ApiModelProperty(value = "Menu identifier")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public Menu modifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

   /**
   * Last modified time
   * @return modifiedTime
  **/
  @ApiModelProperty(value = "Last modified time")
  public OffsetDateTime getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(OffsetDateTime modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public Menu versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * Menu version
   * @return versionNumber
  **/
  @ApiModelProperty(value = "Menu version")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }

  public Menu imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Image Name
   * @return imageName
  **/
  @ApiModelProperty(value = "Image Name")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public Menu imageUrl(String imageUrl) {
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

  public Menu name(String name) {
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

  public Menu locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Locked: is menu locked against modifcation
   * @return locked
  **/
  @ApiModelProperty(value = "Locked: is menu locked against modifcation")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Menu menuSections(List<MenuSection> menuSections) {
    this.menuSections = menuSections;
    return this;
  }

  public Menu addMenuSectionsItem(MenuSection menuSectionsItem) {
    if (this.menuSections == null) {
      this.menuSections = new ArrayList<MenuSection>();
    }
    this.menuSections.add(menuSectionsItem);
    return this;
  }

   /**
   * Menu sections (startes, main etc)
   * @return menuSections
  **/
  @ApiModelProperty(value = "Menu sections (startes, main etc)")
  public List<MenuSection> getMenuSections() {
    return menuSections;
  }

  public void setMenuSections(List<MenuSection> menuSections) {
    this.menuSections = menuSections;
  }

  public Menu taxRates(List<MenuTaxRate> taxRates) {
    this.taxRates = taxRates;
    return this;
  }

  public Menu addTaxRatesItem(MenuTaxRate taxRatesItem) {
    if (this.taxRates == null) {
      this.taxRates = new ArrayList<MenuTaxRate>();
    }
    this.taxRates.add(taxRatesItem);
    return this;
  }

   /**
   * Menu tax rates
   * @return taxRates
  **/
  @ApiModelProperty(value = "Menu tax rates")
  public List<MenuTaxRate> getTaxRates() {
    return taxRates;
  }

  public void setTaxRates(List<MenuTaxRate> taxRates) {
    this.taxRates = taxRates;
  }

  public Menu displaySectionLinks(Boolean displaySectionLinks) {
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

  public Menu menuSectionBehaviour(MenuSectionBehaviourEnum menuSectionBehaviour) {
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

  public Menu taxType(TaxTypeEnum taxType) {
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
    Menu menu = (Menu) o;
    return Objects.equals(this.menuId, menu.menuId) &&
        Objects.equals(this.modifiedTime, menu.modifiedTime) &&
        Objects.equals(this.versionNumber, menu.versionNumber) &&
        Objects.equals(this.imageName, menu.imageName) &&
        Objects.equals(this.imageUrl, menu.imageUrl) &&
        Objects.equals(this.name, menu.name) &&
        Objects.equals(this.locked, menu.locked) &&
        Objects.equals(this.menuSections, menu.menuSections) &&
        Objects.equals(this.taxRates, menu.taxRates) &&
        Objects.equals(this.displaySectionLinks, menu.displaySectionLinks) &&
        Objects.equals(this.menuSectionBehaviour, menu.menuSectionBehaviour) &&
        Objects.equals(this.taxType, menu.taxType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuId, modifiedTime, versionNumber, imageName, imageUrl, name, locked, menuSections, taxRates, displaySectionLinks, menuSectionBehaviour, taxType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

