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
import java.util.UUID;

/**
 * Promotion
 */
@ApiModel(description = "Promotion")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-08T08:35:00.964Z")
public class PromotionAward {
  @SerializedName("PromotionAwardId")
  private Integer promotionAwardId = null;

  @SerializedName("MenuItemPublicId")
  private UUID menuItemPublicId = null;

  public PromotionAward promotionAwardId(Integer promotionAwardId) {
    this.promotionAwardId = promotionAwardId;
    return this;
  }

   /**
   * Promotion Award Id
   * @return promotionAwardId
  **/
  @ApiModelProperty(value = "Promotion Award Id")
  public Integer getPromotionAwardId() {
    return promotionAwardId;
  }

  public void setPromotionAwardId(Integer promotionAwardId) {
    this.promotionAwardId = promotionAwardId;
  }

  public PromotionAward menuItemPublicId(UUID menuItemPublicId) {
    this.menuItemPublicId = menuItemPublicId;
    return this;
  }

   /**
   * The public id of the menu item that will be awarded
   * @return menuItemPublicId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The public id of the menu item that will be awarded")
  public UUID getMenuItemPublicId() {
    return menuItemPublicId;
  }

  public void setMenuItemPublicId(UUID menuItemPublicId) {
    this.menuItemPublicId = menuItemPublicId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionAward promotionAward = (PromotionAward) o;
    return Objects.equals(this.promotionAwardId, promotionAward.promotionAwardId) &&
        Objects.equals(this.menuItemPublicId, promotionAward.menuItemPublicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionAwardId, menuItemPublicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionAward {\n");
    
    sb.append("    promotionAwardId: ").append(toIndentedString(promotionAwardId)).append("\n");
    sb.append("    menuItemPublicId: ").append(toIndentedString(menuItemPublicId)).append("\n");
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

