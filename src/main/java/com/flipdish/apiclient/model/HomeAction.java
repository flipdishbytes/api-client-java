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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-16T11:32:15.881Z")
public class HomeAction {
  @SerializedName("HomeActionId")
  private Integer homeActionId = null;

  /**
   * Type of Action
   */
  @JsonAdapter(HomeActionTypeEnum.Adapter.class)
  public enum HomeActionTypeEnum {
    PORTAL("Portal"),
    
    EXTERNAL("External");

    private String value;

    HomeActionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HomeActionTypeEnum fromValue(String text) {
      for (HomeActionTypeEnum b : HomeActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<HomeActionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HomeActionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HomeActionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return HomeActionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("HomeActionType")
  private HomeActionTypeEnum homeActionType = null;

  @SerializedName("Order")
  private Integer order = null;

  @SerializedName("TitleKey")
  private String titleKey = null;

  @SerializedName("ActionKey")
  private String actionKey = null;

  @SerializedName("DescriptionKey")
  private String descriptionKey = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("Dismissible")
  private Boolean dismissible = null;

  public HomeAction homeActionId(Integer homeActionId) {
    this.homeActionId = homeActionId;
    return this;
  }

   /**
   * 
   * @return homeActionId
  **/
  @ApiModelProperty(value = "")
  public Integer getHomeActionId() {
    return homeActionId;
  }

  public void setHomeActionId(Integer homeActionId) {
    this.homeActionId = homeActionId;
  }

  public HomeAction homeActionType(HomeActionTypeEnum homeActionType) {
    this.homeActionType = homeActionType;
    return this;
  }

   /**
   * Type of Action
   * @return homeActionType
  **/
  @ApiModelProperty(value = "Type of Action")
  public HomeActionTypeEnum getHomeActionType() {
    return homeActionType;
  }

  public void setHomeActionType(HomeActionTypeEnum homeActionType) {
    this.homeActionType = homeActionType;
  }

  public HomeAction order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public HomeAction titleKey(String titleKey) {
    this.titleKey = titleKey;
    return this;
  }

   /**
   * 
   * @return titleKey
  **/
  @ApiModelProperty(value = "")
  public String getTitleKey() {
    return titleKey;
  }

  public void setTitleKey(String titleKey) {
    this.titleKey = titleKey;
  }

  public HomeAction actionKey(String actionKey) {
    this.actionKey = actionKey;
    return this;
  }

   /**
   * 
   * @return actionKey
  **/
  @ApiModelProperty(value = "")
  public String getActionKey() {
    return actionKey;
  }

  public void setActionKey(String actionKey) {
    this.actionKey = actionKey;
  }

  public HomeAction descriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
    return this;
  }

   /**
   * 
   * @return descriptionKey
  **/
  @ApiModelProperty(value = "")
  public String getDescriptionKey() {
    return descriptionKey;
  }

  public void setDescriptionKey(String descriptionKey) {
    this.descriptionKey = descriptionKey;
  }

  public HomeAction action(String action) {
    this.action = action;
    return this;
  }

   /**
   * 
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public HomeAction dismissible(Boolean dismissible) {
    this.dismissible = dismissible;
    return this;
  }

   /**
   * 
   * @return dismissible
  **/
  @ApiModelProperty(value = "")
  public Boolean isDismissible() {
    return dismissible;
  }

  public void setDismissible(Boolean dismissible) {
    this.dismissible = dismissible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeAction homeAction = (HomeAction) o;
    return Objects.equals(this.homeActionId, homeAction.homeActionId) &&
        Objects.equals(this.homeActionType, homeAction.homeActionType) &&
        Objects.equals(this.order, homeAction.order) &&
        Objects.equals(this.titleKey, homeAction.titleKey) &&
        Objects.equals(this.actionKey, homeAction.actionKey) &&
        Objects.equals(this.descriptionKey, homeAction.descriptionKey) &&
        Objects.equals(this.action, homeAction.action) &&
        Objects.equals(this.dismissible, homeAction.dismissible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeActionId, homeActionType, order, titleKey, actionKey, descriptionKey, action, dismissible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeAction {\n");
    
    sb.append("    homeActionId: ").append(toIndentedString(homeActionId)).append("\n");
    sb.append("    homeActionType: ").append(toIndentedString(homeActionType)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    titleKey: ").append(toIndentedString(titleKey)).append("\n");
    sb.append("    actionKey: ").append(toIndentedString(actionKey)).append("\n");
    sb.append("    descriptionKey: ").append(toIndentedString(descriptionKey)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    dismissible: ").append(toIndentedString(dismissible)).append("\n");
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

