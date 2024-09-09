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
import com.flipdish.apiclient.model.PromotionAward;
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
 * Promotion
 */
@ApiModel(description = "Promotion")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-09T13:43:13.963Z")
public class PromotionDetails {
  @SerializedName("PromotionId")
  private Integer promotionId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PromotionAwards")
  private List<PromotionAward> promotionAwards = null;

  public PromotionDetails promotionId(Integer promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * Promotion Id
   * @return promotionId
  **/
  @ApiModelProperty(value = "Promotion Id")
  public Integer getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(Integer promotionId) {
    this.promotionId = promotionId;
  }

  public PromotionDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the promotion
   * @return name
  **/
  @ApiModelProperty(value = "The name of the promotion")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PromotionDetails promotionAwards(List<PromotionAward> promotionAwards) {
    this.promotionAwards = promotionAwards;
    return this;
  }

  public PromotionDetails addPromotionAwardsItem(PromotionAward promotionAwardsItem) {
    if (this.promotionAwards == null) {
      this.promotionAwards = new ArrayList<PromotionAward>();
    }
    this.promotionAwards.add(promotionAwardsItem);
    return this;
  }

   /**
   * The items that this promotion will award
   * @return promotionAwards
  **/
  @ApiModelProperty(value = "The items that this promotion will award")
  public List<PromotionAward> getPromotionAwards() {
    return promotionAwards;
  }

  public void setPromotionAwards(List<PromotionAward> promotionAwards) {
    this.promotionAwards = promotionAwards;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionDetails promotionDetails = (PromotionDetails) o;
    return Objects.equals(this.promotionId, promotionDetails.promotionId) &&
        Objects.equals(this.name, promotionDetails.name) &&
        Objects.equals(this.promotionAwards, promotionDetails.promotionAwards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotionId, name, promotionAwards);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionDetails {\n");
    
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    promotionAwards: ").append(toIndentedString(promotionAwards)).append("\n");
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

