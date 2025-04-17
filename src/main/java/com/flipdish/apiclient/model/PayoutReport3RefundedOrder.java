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
import org.threeten.bp.OffsetDateTime;

/**
 * PayoutReport3RefundedOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-17T06:46:32.991Z")
public class PayoutReport3RefundedOrder {
  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("PlacedAtTime")
  private OffsetDateTime placedAtTime = null;

  @SerializedName("ModifiedAtTime")
  private OffsetDateTime modifiedAtTime = null;

  @SerializedName("StoreName")
  private String storeName = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    CASH("Cash"),
    
    CARD("Card");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  @SerializedName("RefundedAmount")
  private Double refundedAmount = null;

  @SerializedName("RefundedFees")
  private Double refundedFees = null;

  @SerializedName("RefundType")
  private String refundType = null;

  @SerializedName("CashFeeRefundedToCustomer")
  private Double cashFeeRefundedToCustomer = null;

  public PayoutReport3RefundedOrder orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public PayoutReport3RefundedOrder placedAtTime(OffsetDateTime placedAtTime) {
    this.placedAtTime = placedAtTime;
    return this;
  }

   /**
   * Get placedAtTime
   * @return placedAtTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPlacedAtTime() {
    return placedAtTime;
  }

  public void setPlacedAtTime(OffsetDateTime placedAtTime) {
    this.placedAtTime = placedAtTime;
  }

  public PayoutReport3RefundedOrder modifiedAtTime(OffsetDateTime modifiedAtTime) {
    this.modifiedAtTime = modifiedAtTime;
    return this;
  }

   /**
   * Get modifiedAtTime
   * @return modifiedAtTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifiedAtTime() {
    return modifiedAtTime;
  }

  public void setModifiedAtTime(OffsetDateTime modifiedAtTime) {
    this.modifiedAtTime = modifiedAtTime;
  }

  public PayoutReport3RefundedOrder storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Get storeName
   * @return storeName
  **/
  @ApiModelProperty(value = "")
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PayoutReport3RefundedOrder type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PayoutReport3RefundedOrder refundedAmount(Double refundedAmount) {
    this.refundedAmount = refundedAmount;
    return this;
  }

   /**
   * Get refundedAmount
   * @return refundedAmount
  **/
  @ApiModelProperty(value = "")
  public Double getRefundedAmount() {
    return refundedAmount;
  }

  public void setRefundedAmount(Double refundedAmount) {
    this.refundedAmount = refundedAmount;
  }

  public PayoutReport3RefundedOrder refundedFees(Double refundedFees) {
    this.refundedFees = refundedFees;
    return this;
  }

   /**
   * Get refundedFees
   * @return refundedFees
  **/
  @ApiModelProperty(value = "")
  public Double getRefundedFees() {
    return refundedFees;
  }

  public void setRefundedFees(Double refundedFees) {
    this.refundedFees = refundedFees;
  }

  public PayoutReport3RefundedOrder refundType(String refundType) {
    this.refundType = refundType;
    return this;
  }

   /**
   * Get refundType
   * @return refundType
  **/
  @ApiModelProperty(value = "")
  public String getRefundType() {
    return refundType;
  }

  public void setRefundType(String refundType) {
    this.refundType = refundType;
  }

  public PayoutReport3RefundedOrder cashFeeRefundedToCustomer(Double cashFeeRefundedToCustomer) {
    this.cashFeeRefundedToCustomer = cashFeeRefundedToCustomer;
    return this;
  }

   /**
   * Get cashFeeRefundedToCustomer
   * @return cashFeeRefundedToCustomer
  **/
  @ApiModelProperty(value = "")
  public Double getCashFeeRefundedToCustomer() {
    return cashFeeRefundedToCustomer;
  }

  public void setCashFeeRefundedToCustomer(Double cashFeeRefundedToCustomer) {
    this.cashFeeRefundedToCustomer = cashFeeRefundedToCustomer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3RefundedOrder payoutReport3RefundedOrder = (PayoutReport3RefundedOrder) o;
    return Objects.equals(this.orderId, payoutReport3RefundedOrder.orderId) &&
        Objects.equals(this.placedAtTime, payoutReport3RefundedOrder.placedAtTime) &&
        Objects.equals(this.modifiedAtTime, payoutReport3RefundedOrder.modifiedAtTime) &&
        Objects.equals(this.storeName, payoutReport3RefundedOrder.storeName) &&
        Objects.equals(this.type, payoutReport3RefundedOrder.type) &&
        Objects.equals(this.refundedAmount, payoutReport3RefundedOrder.refundedAmount) &&
        Objects.equals(this.refundedFees, payoutReport3RefundedOrder.refundedFees) &&
        Objects.equals(this.refundType, payoutReport3RefundedOrder.refundType) &&
        Objects.equals(this.cashFeeRefundedToCustomer, payoutReport3RefundedOrder.cashFeeRefundedToCustomer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, placedAtTime, modifiedAtTime, storeName, type, refundedAmount, refundedFees, refundType, cashFeeRefundedToCustomer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3RefundedOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    placedAtTime: ").append(toIndentedString(placedAtTime)).append("\n");
    sb.append("    modifiedAtTime: ").append(toIndentedString(modifiedAtTime)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    refundedAmount: ").append(toIndentedString(refundedAmount)).append("\n");
    sb.append("    refundedFees: ").append(toIndentedString(refundedFees)).append("\n");
    sb.append("    refundType: ").append(toIndentedString(refundType)).append("\n");
    sb.append("    cashFeeRefundedToCustomer: ").append(toIndentedString(cashFeeRefundedToCustomer)).append("\n");
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

