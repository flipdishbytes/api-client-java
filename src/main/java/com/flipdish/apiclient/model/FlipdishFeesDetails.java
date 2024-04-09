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
 * Fees breakdown
 */
@ApiModel(description = "Fees breakdown")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-09T11:23:12.163Z")
public class FlipdishFeesDetails {
  @SerializedName("OnlineSalesFees")
  private Double onlineSalesFees = null;

  @SerializedName("CashSalesFees")
  private Double cashSalesFees = null;

  @SerializedName("PosSalesFees")
  private Double posSalesFees = null;

  @SerializedName("TotalSalesFees")
  private Double totalSalesFees = null;

  @SerializedName("OnlineSalesRefundedFees")
  private Double onlineSalesRefundedFees = null;

  @SerializedName("CashSalesRefundedFees")
  private Double cashSalesRefundedFees = null;

  @SerializedName("PosSalesRefundedFees")
  private Double posSalesRefundedFees = null;

  @SerializedName("SalesFeesVat")
  private Double salesFeesVat = null;

  @SerializedName("TotalFees")
  private Double totalFees = null;

  public FlipdishFeesDetails onlineSalesFees(Double onlineSalesFees) {
    this.onlineSalesFees = onlineSalesFees;
    return this;
  }

   /**
   * Fees on online sales
   * @return onlineSalesFees
  **/
  @ApiModelProperty(value = "Fees on online sales")
  public Double getOnlineSalesFees() {
    return onlineSalesFees;
  }

  public void setOnlineSalesFees(Double onlineSalesFees) {
    this.onlineSalesFees = onlineSalesFees;
  }

  public FlipdishFeesDetails cashSalesFees(Double cashSalesFees) {
    this.cashSalesFees = cashSalesFees;
    return this;
  }

   /**
   * Fees on cash sales
   * @return cashSalesFees
  **/
  @ApiModelProperty(value = "Fees on cash sales")
  public Double getCashSalesFees() {
    return cashSalesFees;
  }

  public void setCashSalesFees(Double cashSalesFees) {
    this.cashSalesFees = cashSalesFees;
  }

  public FlipdishFeesDetails posSalesFees(Double posSalesFees) {
    this.posSalesFees = posSalesFees;
    return this;
  }

   /**
   * Fees of POS sales
   * @return posSalesFees
  **/
  @ApiModelProperty(value = "Fees of POS sales")
  public Double getPosSalesFees() {
    return posSalesFees;
  }

  public void setPosSalesFees(Double posSalesFees) {
    this.posSalesFees = posSalesFees;
  }

  public FlipdishFeesDetails totalSalesFees(Double totalSalesFees) {
    this.totalSalesFees = totalSalesFees;
    return this;
  }

   /**
   * Total online and cash sales
   * @return totalSalesFees
  **/
  @ApiModelProperty(value = "Total online and cash sales")
  public Double getTotalSalesFees() {
    return totalSalesFees;
  }

  public void setTotalSalesFees(Double totalSalesFees) {
    this.totalSalesFees = totalSalesFees;
  }

  public FlipdishFeesDetails onlineSalesRefundedFees(Double onlineSalesRefundedFees) {
    this.onlineSalesRefundedFees = onlineSalesRefundedFees;
    return this;
  }

   /**
   * Fees on refunds for online sales
   * @return onlineSalesRefundedFees
  **/
  @ApiModelProperty(value = "Fees on refunds for online sales")
  public Double getOnlineSalesRefundedFees() {
    return onlineSalesRefundedFees;
  }

  public void setOnlineSalesRefundedFees(Double onlineSalesRefundedFees) {
    this.onlineSalesRefundedFees = onlineSalesRefundedFees;
  }

  public FlipdishFeesDetails cashSalesRefundedFees(Double cashSalesRefundedFees) {
    this.cashSalesRefundedFees = cashSalesRefundedFees;
    return this;
  }

   /**
   * Fees on refunds for cash sales
   * @return cashSalesRefundedFees
  **/
  @ApiModelProperty(value = "Fees on refunds for cash sales")
  public Double getCashSalesRefundedFees() {
    return cashSalesRefundedFees;
  }

  public void setCashSalesRefundedFees(Double cashSalesRefundedFees) {
    this.cashSalesRefundedFees = cashSalesRefundedFees;
  }

  public FlipdishFeesDetails posSalesRefundedFees(Double posSalesRefundedFees) {
    this.posSalesRefundedFees = posSalesRefundedFees;
    return this;
  }

   /**
   * Fees on refunds for POS sales
   * @return posSalesRefundedFees
  **/
  @ApiModelProperty(value = "Fees on refunds for POS sales")
  public Double getPosSalesRefundedFees() {
    return posSalesRefundedFees;
  }

  public void setPosSalesRefundedFees(Double posSalesRefundedFees) {
    this.posSalesRefundedFees = posSalesRefundedFees;
  }

  public FlipdishFeesDetails salesFeesVat(Double salesFeesVat) {
    this.salesFeesVat = salesFeesVat;
    return this;
  }

   /**
   * VAT on sales fees
   * @return salesFeesVat
  **/
  @ApiModelProperty(value = "VAT on sales fees")
  public Double getSalesFeesVat() {
    return salesFeesVat;
  }

  public void setSalesFeesVat(Double salesFeesVat) {
    this.salesFeesVat = salesFeesVat;
  }

  public FlipdishFeesDetails totalFees(Double totalFees) {
    this.totalFees = totalFees;
    return this;
  }

   /**
   * Total fees
   * @return totalFees
  **/
  @ApiModelProperty(value = "Total fees")
  public Double getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(Double totalFees) {
    this.totalFees = totalFees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlipdishFeesDetails flipdishFeesDetails = (FlipdishFeesDetails) o;
    return Objects.equals(this.onlineSalesFees, flipdishFeesDetails.onlineSalesFees) &&
        Objects.equals(this.cashSalesFees, flipdishFeesDetails.cashSalesFees) &&
        Objects.equals(this.posSalesFees, flipdishFeesDetails.posSalesFees) &&
        Objects.equals(this.totalSalesFees, flipdishFeesDetails.totalSalesFees) &&
        Objects.equals(this.onlineSalesRefundedFees, flipdishFeesDetails.onlineSalesRefundedFees) &&
        Objects.equals(this.cashSalesRefundedFees, flipdishFeesDetails.cashSalesRefundedFees) &&
        Objects.equals(this.posSalesRefundedFees, flipdishFeesDetails.posSalesRefundedFees) &&
        Objects.equals(this.salesFeesVat, flipdishFeesDetails.salesFeesVat) &&
        Objects.equals(this.totalFees, flipdishFeesDetails.totalFees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineSalesFees, cashSalesFees, posSalesFees, totalSalesFees, onlineSalesRefundedFees, cashSalesRefundedFees, posSalesRefundedFees, salesFeesVat, totalFees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlipdishFeesDetails {\n");
    
    sb.append("    onlineSalesFees: ").append(toIndentedString(onlineSalesFees)).append("\n");
    sb.append("    cashSalesFees: ").append(toIndentedString(cashSalesFees)).append("\n");
    sb.append("    posSalesFees: ").append(toIndentedString(posSalesFees)).append("\n");
    sb.append("    totalSalesFees: ").append(toIndentedString(totalSalesFees)).append("\n");
    sb.append("    onlineSalesRefundedFees: ").append(toIndentedString(onlineSalesRefundedFees)).append("\n");
    sb.append("    cashSalesRefundedFees: ").append(toIndentedString(cashSalesRefundedFees)).append("\n");
    sb.append("    posSalesRefundedFees: ").append(toIndentedString(posSalesRefundedFees)).append("\n");
    sb.append("    salesFeesVat: ").append(toIndentedString(salesFeesVat)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
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

