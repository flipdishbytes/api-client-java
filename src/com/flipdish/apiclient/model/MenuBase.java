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
import java.io.Serializable;

/**
 * Menu base
 */
@ApiModel(description = "Menu base")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-21T10:37:59.975Z")
public class MenuBase implements Serializable {
  private static final long serialVersionUID = 1L;

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

  public MenuBase displaySectionLinks(Boolean displaySectionLinks) {
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

  public MenuBase menuSectionBehaviour(MenuSectionBehaviourEnum menuSectionBehaviour) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuBase menuBase = (MenuBase) o;
    return Objects.equals(this.displaySectionLinks, menuBase.displaySectionLinks) &&
        Objects.equals(this.menuSectionBehaviour, menuBase.menuSectionBehaviour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displaySectionLinks, menuSectionBehaviour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuBase {\n");
    
    sb.append("    displaySectionLinks: ").append(toIndentedString(displaySectionLinks)).append("\n");
    sb.append("    menuSectionBehaviour: ").append(toIndentedString(menuSectionBehaviour)).append("\n");
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

