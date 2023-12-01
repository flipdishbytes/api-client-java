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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-01T12:34:33.674Z")
public class MenuElementListItemResponse {
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

  public MenuElementListItemResponse menuElementId(Integer menuElementId) {
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

  public MenuElementListItemResponse menuElementType(MenuElementTypeEnum menuElementType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuElementListItemResponse menuElementListItemResponse = (MenuElementListItemResponse) o;
    return Objects.equals(this.menuElementId, menuElementListItemResponse.menuElementId) &&
        Objects.equals(this.menuElementType, menuElementListItemResponse.menuElementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuElementId, menuElementType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuElementListItemResponse {\n");
    
    sb.append("    menuElementId: ").append(toIndentedString(menuElementId)).append("\n");
    sb.append("    menuElementType: ").append(toIndentedString(menuElementType)).append("\n");
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

