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
import com.flipdish.apiclient.model.SubscriptionStore;
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
 * Product
 */
@ApiModel(description = "Product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-22T08:24:49.146Z")
public class SubscriptionProduct {
  @SerializedName("ProductId")
  private String productId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Quantity")
  private Long quantity = null;

  @SerializedName("PricePerUnit")
  private Double pricePerUnit = null;

  @SerializedName("PriceTotal")
  private Double priceTotal = null;

  /**
   * Payment Frequency
   */
  @JsonAdapter(PaymentFrequencyEnum.Adapter.class)
  public enum PaymentFrequencyEnum {
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    PaymentFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentFrequencyEnum fromValue(String text) {
      for (PaymentFrequencyEnum b : PaymentFrequencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentFrequencyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PaymentFrequency")
  private PaymentFrequencyEnum paymentFrequency = null;

  @SerializedName("Stores")
  private List<SubscriptionStore> stores = null;

  public SubscriptionProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Product Identifier
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "Product Identifier")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public SubscriptionProduct name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionProduct quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "Quantity")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public SubscriptionProduct pricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
    return this;
  }

   /**
   * Price Per Unit
   * @return pricePerUnit
  **/
  @ApiModelProperty(value = "Price Per Unit")
  public Double getPricePerUnit() {
    return pricePerUnit;
  }

  public void setPricePerUnit(Double pricePerUnit) {
    this.pricePerUnit = pricePerUnit;
  }

  public SubscriptionProduct priceTotal(Double priceTotal) {
    this.priceTotal = priceTotal;
    return this;
  }

   /**
   * Price Total
   * @return priceTotal
  **/
  @ApiModelProperty(value = "Price Total")
  public Double getPriceTotal() {
    return priceTotal;
  }

  public void setPriceTotal(Double priceTotal) {
    this.priceTotal = priceTotal;
  }

  public SubscriptionProduct paymentFrequency(PaymentFrequencyEnum paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

   /**
   * Payment Frequency
   * @return paymentFrequency
  **/
  @ApiModelProperty(required = true, value = "Payment Frequency")
  public PaymentFrequencyEnum getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(PaymentFrequencyEnum paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public SubscriptionProduct stores(List<SubscriptionStore> stores) {
    this.stores = stores;
    return this;
  }

  public SubscriptionProduct addStoresItem(SubscriptionStore storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<SubscriptionStore>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Stores
   * @return stores
  **/
  @ApiModelProperty(value = "Stores")
  public List<SubscriptionStore> getStores() {
    return stores;
  }

  public void setStores(List<SubscriptionStore> stores) {
    this.stores = stores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionProduct subscriptionProduct = (SubscriptionProduct) o;
    return Objects.equals(this.productId, subscriptionProduct.productId) &&
        Objects.equals(this.name, subscriptionProduct.name) &&
        Objects.equals(this.quantity, subscriptionProduct.quantity) &&
        Objects.equals(this.pricePerUnit, subscriptionProduct.pricePerUnit) &&
        Objects.equals(this.priceTotal, subscriptionProduct.priceTotal) &&
        Objects.equals(this.paymentFrequency, subscriptionProduct.paymentFrequency) &&
        Objects.equals(this.stores, subscriptionProduct.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, quantity, pricePerUnit, priceTotal, paymentFrequency, stores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionProduct {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
    sb.append("    priceTotal: ").append(toIndentedString(priceTotal)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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

