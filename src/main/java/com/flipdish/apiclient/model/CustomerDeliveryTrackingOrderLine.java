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
 * Defines an order line for driver tracking
 */
@ApiModel(description = "Defines an order line for driver tracking")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-19T12:32:07.573Z")
public class CustomerDeliveryTrackingOrderLine {
  @SerializedName("ItemName")
  private String itemName = null;

  @SerializedName("SelectedOptions")
  private List<String> selectedOptions = null;

  public CustomerDeliveryTrackingOrderLine itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Item name from the order
   * @return itemName
  **/
  @ApiModelProperty(value = "Item name from the order")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public CustomerDeliveryTrackingOrderLine selectedOptions(List<String> selectedOptions) {
    this.selectedOptions = selectedOptions;
    return this;
  }

  public CustomerDeliveryTrackingOrderLine addSelectedOptionsItem(String selectedOptionsItem) {
    if (this.selectedOptions == null) {
      this.selectedOptions = new ArrayList<String>();
    }
    this.selectedOptions.add(selectedOptionsItem);
    return this;
  }

   /**
   * Selected option names
   * @return selectedOptions
  **/
  @ApiModelProperty(value = "Selected option names")
  public List<String> getSelectedOptions() {
    return selectedOptions;
  }

  public void setSelectedOptions(List<String> selectedOptions) {
    this.selectedOptions = selectedOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDeliveryTrackingOrderLine customerDeliveryTrackingOrderLine = (CustomerDeliveryTrackingOrderLine) o;
    return Objects.equals(this.itemName, customerDeliveryTrackingOrderLine.itemName) &&
        Objects.equals(this.selectedOptions, customerDeliveryTrackingOrderLine.selectedOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemName, selectedOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDeliveryTrackingOrderLine {\n");
    
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    selectedOptions: ").append(toIndentedString(selectedOptions)).append("\n");
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

