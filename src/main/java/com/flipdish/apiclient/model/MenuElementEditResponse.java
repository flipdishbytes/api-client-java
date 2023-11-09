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
 * Response with any menu elements that had issues being hidden/shown
 */
@ApiModel(description = "Response with any menu elements that had issues being hidden/shown")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-09T09:12:39.143Z")
public class MenuElementEditResponse {
  @SerializedName("SectionName")
  private String sectionName = null;

  @SerializedName("ItemName")
  private String itemName = null;

  @SerializedName("OptionSetName")
  private String optionSetName = null;

  @SerializedName("OptionSetItemName")
  private String optionSetItemName = null;

  @SerializedName("MenuElementId")
  private Integer menuElementId = null;

  /**
   * Type of menu element
   */
  @JsonAdapter(MenuElementTypeEnum.Adapter.class)
  public enum MenuElementTypeEnum {
    ITEM("Item"),
    
    OPTIONSETITEM("OptionSetItem");

    private String value;

    MenuElementTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MenuElementTypeEnum fromValue(String text) {
      for (MenuElementTypeEnum b : MenuElementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MenuElementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MenuElementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MenuElementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MenuElementTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("MenuElementType")
  private MenuElementTypeEnum menuElementType = null;

  /**
   * Validation message for menu element issue
   */
  @JsonAdapter(ValidationCodeEnum.Adapter.class)
  public enum ValidationCodeEnum {
    SUCCESS("Success"),
    
    MINIMUMCOUNTVIOLATION("MinimumCountViolation"),
    
    MASTEROPTIONSETVIOLATION("MasterOptionSetViolation"),
    
    INCORRECTELEMENTTYPEINMENU("IncorrectElementTypeInMenu"),
    
    DBFAILED("DBFailed");

    private String value;

    ValidationCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationCodeEnum fromValue(String text) {
      for (ValidationCodeEnum b : ValidationCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ValidationCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ValidationCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ValidationCode")
  private ValidationCodeEnum validationCode = null;

  public MenuElementEditResponse sectionName(String sectionName) {
    this.sectionName = sectionName;
    return this;
  }

   /**
   * Section name
   * @return sectionName
  **/
  @ApiModelProperty(value = "Section name")
  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }

  public MenuElementEditResponse itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Item name
   * @return itemName
  **/
  @ApiModelProperty(value = "Item name")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public MenuElementEditResponse optionSetName(String optionSetName) {
    this.optionSetName = optionSetName;
    return this;
  }

   /**
   * Option Set name
   * @return optionSetName
  **/
  @ApiModelProperty(value = "Option Set name")
  public String getOptionSetName() {
    return optionSetName;
  }

  public void setOptionSetName(String optionSetName) {
    this.optionSetName = optionSetName;
  }

  public MenuElementEditResponse optionSetItemName(String optionSetItemName) {
    this.optionSetItemName = optionSetItemName;
    return this;
  }

   /**
   * Element name
   * @return optionSetItemName
  **/
  @ApiModelProperty(value = "Element name")
  public String getOptionSetItemName() {
    return optionSetItemName;
  }

  public void setOptionSetItemName(String optionSetItemName) {
    this.optionSetItemName = optionSetItemName;
  }

  public MenuElementEditResponse menuElementId(Integer menuElementId) {
    this.menuElementId = menuElementId;
    return this;
  }

   /**
   * Holds the information for the A and CNAME Records of a domain.
   * @return menuElementId
  **/
  @ApiModelProperty(value = "Holds the information for the A and CNAME Records of a domain.")
  public Integer getMenuElementId() {
    return menuElementId;
  }

  public void setMenuElementId(Integer menuElementId) {
    this.menuElementId = menuElementId;
  }

  public MenuElementEditResponse menuElementType(MenuElementTypeEnum menuElementType) {
    this.menuElementType = menuElementType;
    return this;
  }

   /**
   * Type of menu element
   * @return menuElementType
  **/
  @ApiModelProperty(value = "Type of menu element")
  public MenuElementTypeEnum getMenuElementType() {
    return menuElementType;
  }

  public void setMenuElementType(MenuElementTypeEnum menuElementType) {
    this.menuElementType = menuElementType;
  }

  public MenuElementEditResponse validationCode(ValidationCodeEnum validationCode) {
    this.validationCode = validationCode;
    return this;
  }

   /**
   * Validation message for menu element issue
   * @return validationCode
  **/
  @ApiModelProperty(value = "Validation message for menu element issue")
  public ValidationCodeEnum getValidationCode() {
    return validationCode;
  }

  public void setValidationCode(ValidationCodeEnum validationCode) {
    this.validationCode = validationCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuElementEditResponse menuElementEditResponse = (MenuElementEditResponse) o;
    return Objects.equals(this.sectionName, menuElementEditResponse.sectionName) &&
        Objects.equals(this.itemName, menuElementEditResponse.itemName) &&
        Objects.equals(this.optionSetName, menuElementEditResponse.optionSetName) &&
        Objects.equals(this.optionSetItemName, menuElementEditResponse.optionSetItemName) &&
        Objects.equals(this.menuElementId, menuElementEditResponse.menuElementId) &&
        Objects.equals(this.menuElementType, menuElementEditResponse.menuElementType) &&
        Objects.equals(this.validationCode, menuElementEditResponse.validationCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionName, itemName, optionSetName, optionSetItemName, menuElementId, menuElementType, validationCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuElementEditResponse {\n");
    
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    optionSetName: ").append(toIndentedString(optionSetName)).append("\n");
    sb.append("    optionSetItemName: ").append(toIndentedString(optionSetItemName)).append("\n");
    sb.append("    menuElementId: ").append(toIndentedString(menuElementId)).append("\n");
    sb.append("    menuElementType: ").append(toIndentedString(menuElementType)).append("\n");
    sb.append("    validationCode: ").append(toIndentedString(validationCode)).append("\n");
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

