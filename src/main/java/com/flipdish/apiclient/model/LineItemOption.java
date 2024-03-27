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
import com.flipdish.apiclient.model.Price;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a single line item option
 */
@ApiModel(description = "Defines a single line item option")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-27T13:36:47.136Z")
public class LineItemOption {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("ExternalId")
  private String externalId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Price")
  private Price price = null;

  @SerializedName("Metadata")
  private Map<String, String> metadata = null;

  public LineItemOption id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Flipdish Item Option Id, if unknown leave &#39;null&#39;
   * @return id
  **/
  @ApiModelProperty(value = "Flipdish Item Option Id, if unknown leave 'null'")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LineItemOption externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External Item Option Id
   * @return externalId
  **/
  @ApiModelProperty(value = "External Item Option Id")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public LineItemOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * External Item Option Name
   * @return name
  **/
  @ApiModelProperty(value = "External Item Option Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LineItemOption price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * External Item Option Price
   * @return price
  **/
  @ApiModelProperty(value = "External Item Option Price")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public LineItemOption metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public LineItemOption putMetadataItem(String key, String metadataItem) {
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
    LineItemOption lineItemOption = (LineItemOption) o;
    return Objects.equals(this.id, lineItemOption.id) &&
        Objects.equals(this.externalId, lineItemOption.externalId) &&
        Objects.equals(this.name, lineItemOption.name) &&
        Objects.equals(this.price, lineItemOption.price) &&
        Objects.equals(this.metadata, lineItemOption.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, name, price, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

