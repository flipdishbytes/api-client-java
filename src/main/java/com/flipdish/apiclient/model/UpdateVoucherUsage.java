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
 * Update Voucher Usage
 */
@ApiModel(description = "Update Voucher Usage")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-06T12:18:31.729Z")
public class UpdateVoucherUsage {
  @SerializedName("IsUsed")
  private Boolean isUsed = null;

  @SerializedName("UsedByCustomerId")
  private Integer usedByCustomerId = null;

  @SerializedName("TransactionKey")
  private String transactionKey = null;

  public UpdateVoucherUsage isUsed(Boolean isUsed) {
    this.isUsed = isUsed;
    return this;
  }

   /**
   * Flag indicating whether the voucher is used
   * @return isUsed
  **/
  @ApiModelProperty(value = "Flag indicating whether the voucher is used")
  public Boolean isIsUsed() {
    return isUsed;
  }

  public void setIsUsed(Boolean isUsed) {
    this.isUsed = isUsed;
  }

  public UpdateVoucherUsage usedByCustomerId(Integer usedByCustomerId) {
    this.usedByCustomerId = usedByCustomerId;
    return this;
  }

   /**
   * Indicates Customer that used the voucher.
   * @return usedByCustomerId
  **/
  @ApiModelProperty(value = "Indicates Customer that used the voucher.")
  public Integer getUsedByCustomerId() {
    return usedByCustomerId;
  }

  public void setUsedByCustomerId(Integer usedByCustomerId) {
    this.usedByCustomerId = usedByCustomerId;
  }

  public UpdateVoucherUsage transactionKey(String transactionKey) {
    this.transactionKey = transactionKey;
    return this;
  }

   /**
   * An opaque string, to ensure idempotency. This allows for safely retrying requests without accidentally performing the same stamp operation twice.   This will typically contain the the ID of the sale order.
   * @return transactionKey
  **/
  @ApiModelProperty(value = "An opaque string, to ensure idempotency. This allows for safely retrying requests without accidentally performing the same stamp operation twice.   This will typically contain the the ID of the sale order.")
  public String getTransactionKey() {
    return transactionKey;
  }

  public void setTransactionKey(String transactionKey) {
    this.transactionKey = transactionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVoucherUsage updateVoucherUsage = (UpdateVoucherUsage) o;
    return Objects.equals(this.isUsed, updateVoucherUsage.isUsed) &&
        Objects.equals(this.usedByCustomerId, updateVoucherUsage.usedByCustomerId) &&
        Objects.equals(this.transactionKey, updateVoucherUsage.transactionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isUsed, usedByCustomerId, transactionKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVoucherUsage {\n");
    
    sb.append("    isUsed: ").append(toIndentedString(isUsed)).append("\n");
    sb.append("    usedByCustomerId: ").append(toIndentedString(usedByCustomerId)).append("\n");
    sb.append("    transactionKey: ").append(toIndentedString(transactionKey)).append("\n");
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

