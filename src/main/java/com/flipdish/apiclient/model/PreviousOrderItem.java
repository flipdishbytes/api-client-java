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
import com.flipdish.apiclient.model.PreviousOrderItemOption;
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
 * PreviousOrderItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-22T13:06:38.270Z")
public class PreviousOrderItem {
  @SerializedName("MenuSectionDisplayOrder")
  private Integer menuSectionDisplayOrder = null;

  @SerializedName("MenuSectionName")
  private String menuSectionName = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PriceIncludingOptionSetItems")
  private Double priceIncludingOptionSetItems = null;

  @SerializedName("DepositReturnFee")
  private Double depositReturnFee = null;

  @SerializedName("TaxAmount")
  private Double taxAmount = null;

  @SerializedName("PreviousOrderItemOptions")
  private List<PreviousOrderItemOption> previousOrderItemOptions = null;

  public PreviousOrderItem menuSectionDisplayOrder(Integer menuSectionDisplayOrder) {
    this.menuSectionDisplayOrder = menuSectionDisplayOrder;
    return this;
  }

   /**
   * Get menuSectionDisplayOrder
   * @return menuSectionDisplayOrder
  **/
  @ApiModelProperty(value = "")
  public Integer getMenuSectionDisplayOrder() {
    return menuSectionDisplayOrder;
  }

  public void setMenuSectionDisplayOrder(Integer menuSectionDisplayOrder) {
    this.menuSectionDisplayOrder = menuSectionDisplayOrder;
  }

  public PreviousOrderItem menuSectionName(String menuSectionName) {
    this.menuSectionName = menuSectionName;
    return this;
  }

   /**
   * Get menuSectionName
   * @return menuSectionName
  **/
  @ApiModelProperty(value = "")
  public String getMenuSectionName() {
    return menuSectionName;
  }

  public void setMenuSectionName(String menuSectionName) {
    this.menuSectionName = menuSectionName;
  }

  public PreviousOrderItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PreviousOrderItem priceIncludingOptionSetItems(Double priceIncludingOptionSetItems) {
    this.priceIncludingOptionSetItems = priceIncludingOptionSetItems;
    return this;
  }

   /**
   * Get priceIncludingOptionSetItems
   * @return priceIncludingOptionSetItems
  **/
  @ApiModelProperty(value = "")
  public Double getPriceIncludingOptionSetItems() {
    return priceIncludingOptionSetItems;
  }

  public void setPriceIncludingOptionSetItems(Double priceIncludingOptionSetItems) {
    this.priceIncludingOptionSetItems = priceIncludingOptionSetItems;
  }

  public PreviousOrderItem depositReturnFee(Double depositReturnFee) {
    this.depositReturnFee = depositReturnFee;
    return this;
  }

   /**
   * Get depositReturnFee
   * @return depositReturnFee
  **/
  @ApiModelProperty(value = "")
  public Double getDepositReturnFee() {
    return depositReturnFee;
  }

  public void setDepositReturnFee(Double depositReturnFee) {
    this.depositReturnFee = depositReturnFee;
  }

  public PreviousOrderItem taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }

  public PreviousOrderItem previousOrderItemOptions(List<PreviousOrderItemOption> previousOrderItemOptions) {
    this.previousOrderItemOptions = previousOrderItemOptions;
    return this;
  }

  public PreviousOrderItem addPreviousOrderItemOptionsItem(PreviousOrderItemOption previousOrderItemOptionsItem) {
    if (this.previousOrderItemOptions == null) {
      this.previousOrderItemOptions = new ArrayList<PreviousOrderItemOption>();
    }
    this.previousOrderItemOptions.add(previousOrderItemOptionsItem);
    return this;
  }

   /**
   * Get previousOrderItemOptions
   * @return previousOrderItemOptions
  **/
  @ApiModelProperty(value = "")
  public List<PreviousOrderItemOption> getPreviousOrderItemOptions() {
    return previousOrderItemOptions;
  }

  public void setPreviousOrderItemOptions(List<PreviousOrderItemOption> previousOrderItemOptions) {
    this.previousOrderItemOptions = previousOrderItemOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviousOrderItem previousOrderItem = (PreviousOrderItem) o;
    return Objects.equals(this.menuSectionDisplayOrder, previousOrderItem.menuSectionDisplayOrder) &&
        Objects.equals(this.menuSectionName, previousOrderItem.menuSectionName) &&
        Objects.equals(this.name, previousOrderItem.name) &&
        Objects.equals(this.priceIncludingOptionSetItems, previousOrderItem.priceIncludingOptionSetItems) &&
        Objects.equals(this.depositReturnFee, previousOrderItem.depositReturnFee) &&
        Objects.equals(this.taxAmount, previousOrderItem.taxAmount) &&
        Objects.equals(this.previousOrderItemOptions, previousOrderItem.previousOrderItemOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuSectionDisplayOrder, menuSectionName, name, priceIncludingOptionSetItems, depositReturnFee, taxAmount, previousOrderItemOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousOrderItem {\n");
    
    sb.append("    menuSectionDisplayOrder: ").append(toIndentedString(menuSectionDisplayOrder)).append("\n");
    sb.append("    menuSectionName: ").append(toIndentedString(menuSectionName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceIncludingOptionSetItems: ").append(toIndentedString(priceIncludingOptionSetItems)).append("\n");
    sb.append("    depositReturnFee: ").append(toIndentedString(depositReturnFee)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    previousOrderItemOptions: ").append(toIndentedString(previousOrderItemOptions)).append("\n");
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

