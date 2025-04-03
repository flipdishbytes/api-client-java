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
import com.flipdish.apiclient.model.LineItemOption;
import com.flipdish.apiclient.model.Price;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a single line item
 */
@ApiModel(description = "Defines a single line item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-03T14:49:56.858Z")
public class LineItem {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("SectionName")
  private String sectionName = null;

  @SerializedName("ExternalId")
  private String externalId = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("Price")
  private Price price = null;

  @SerializedName("Notes")
  private String notes = null;

  @SerializedName("Options")
  private List<LineItemOption> options = null;

  @SerializedName("Metadata")
  private Map<String, String> metadata = null;

  public LineItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Flipdish Item Id, if unknown leave &#39;null&#39;
   * @return id
  **/
  @ApiModelProperty(value = "Flipdish Item Id, if unknown leave 'null'")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LineItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Item Name
   * @return name
  **/
  @ApiModelProperty(value = "Item Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LineItem sectionName(String sectionName) {
    this.sectionName = sectionName;
    return this;
  }

   /**
   * Menu section name
   * @return sectionName
  **/
  @ApiModelProperty(value = "Menu section name")
  public String getSectionName() {
    return sectionName;
  }

  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }

  public LineItem externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External Item Id
   * @return externalId
  **/
  @ApiModelProperty(value = "External Item Id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public LineItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Item Quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Item Quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public LineItem price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Item Price
   * @return price
  **/
  @ApiModelProperty(value = "Item Price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public LineItem notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Item Notes
   * @return notes
  **/
  @ApiModelProperty(value = "Item Notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public LineItem options(List<LineItemOption> options) {
    this.options = options;
    return this;
  }

  public LineItem addOptionsItem(LineItemOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<LineItemOption>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Item Option
   * @return options
  **/
  @ApiModelProperty(value = "Item Option")
  public List<LineItemOption> getOptions() {
    return options;
  }

  public void setOptions(List<LineItemOption> options) {
    this.options = options;
  }

  public LineItem metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public LineItem putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Other Item Metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Other Item Metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.id, lineItem.id) &&
        Objects.equals(this.name, lineItem.name) &&
        Objects.equals(this.sectionName, lineItem.sectionName) &&
        Objects.equals(this.externalId, lineItem.externalId) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.price, lineItem.price) &&
        Objects.equals(this.notes, lineItem.notes) &&
        Objects.equals(this.options, lineItem.options) &&
        Objects.equals(this.metadata, lineItem.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, sectionName, externalId, quantity, price, notes, options, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

