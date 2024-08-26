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
 * PayoutReport3DetailsFlipdishFees
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-26T14:28:41.057Z")
public class PayoutReport3DetailsFlipdishFees {
  @SerializedName("WebAndAppCash")
  private Double webAndAppCash = null;

  @SerializedName("WebAndAppCashRevenueIncludingTips")
  private Double webAndAppCashRevenueIncludingTips = null;

  @SerializedName("WebAndAppCard")
  private Double webAndAppCard = null;

  @SerializedName("WebAndAppCardRevenueIncludingTips")
  private Double webAndAppCardRevenueIncludingTips = null;

  @SerializedName("KioskCash")
  private Double kioskCash = null;

  @SerializedName("KioskCashRevenue")
  private Double kioskCashRevenue = null;

  @SerializedName("KioskCard")
  private Double kioskCard = null;

  @SerializedName("KioskCardRevenue")
  private Double kioskCardRevenue = null;

  @SerializedName("QropCash")
  private Double qropCash = null;

  @SerializedName("QropCard")
  private Double qropCard = null;

  @SerializedName("PosCard")
  private Double posCard = null;

  @SerializedName("PosCardRevenue")
  private Double posCardRevenue = null;

  @SerializedName("PosCardOnFlipdishOrders")
  private Double posCardOnFlipdishOrders = null;

  @SerializedName("OtherIntegrationFees")
  private Double otherIntegrationFees = null;

  @SerializedName("OtherIntegrationTips")
  private Double otherIntegrationTips = null;

  @SerializedName("RefundedFeesOnRefundedSales")
  private Double refundedFeesOnRefundedSales = null;

  @SerializedName("Vat")
  private Double vat = null;

  @SerializedName("Total")
  private Double total = null;

  @SerializedName("ThirdPartyIntegrationFeesAndTips")
  private Double thirdPartyIntegrationFeesAndTips = null;

  public PayoutReport3DetailsFlipdishFees webAndAppCash(Double webAndAppCash) {
    this.webAndAppCash = webAndAppCash;
    return this;
  }

   /**
   * Get webAndAppCash
   * @return webAndAppCash
  **/
  @ApiModelProperty(value = "")
  public Double getWebAndAppCash() {
    return webAndAppCash;
  }

  public void setWebAndAppCash(Double webAndAppCash) {
    this.webAndAppCash = webAndAppCash;
  }

  public PayoutReport3DetailsFlipdishFees webAndAppCashRevenueIncludingTips(Double webAndAppCashRevenueIncludingTips) {
    this.webAndAppCashRevenueIncludingTips = webAndAppCashRevenueIncludingTips;
    return this;
  }

   /**
   * Get webAndAppCashRevenueIncludingTips
   * @return webAndAppCashRevenueIncludingTips
  **/
  @ApiModelProperty(value = "")
  public Double getWebAndAppCashRevenueIncludingTips() {
    return webAndAppCashRevenueIncludingTips;
  }

  public void setWebAndAppCashRevenueIncludingTips(Double webAndAppCashRevenueIncludingTips) {
    this.webAndAppCashRevenueIncludingTips = webAndAppCashRevenueIncludingTips;
  }

  public PayoutReport3DetailsFlipdishFees webAndAppCard(Double webAndAppCard) {
    this.webAndAppCard = webAndAppCard;
    return this;
  }

   /**
   * Get webAndAppCard
   * @return webAndAppCard
  **/
  @ApiModelProperty(value = "")
  public Double getWebAndAppCard() {
    return webAndAppCard;
  }

  public void setWebAndAppCard(Double webAndAppCard) {
    this.webAndAppCard = webAndAppCard;
  }

  public PayoutReport3DetailsFlipdishFees webAndAppCardRevenueIncludingTips(Double webAndAppCardRevenueIncludingTips) {
    this.webAndAppCardRevenueIncludingTips = webAndAppCardRevenueIncludingTips;
    return this;
  }

   /**
   * Get webAndAppCardRevenueIncludingTips
   * @return webAndAppCardRevenueIncludingTips
  **/
  @ApiModelProperty(value = "")
  public Double getWebAndAppCardRevenueIncludingTips() {
    return webAndAppCardRevenueIncludingTips;
  }

  public void setWebAndAppCardRevenueIncludingTips(Double webAndAppCardRevenueIncludingTips) {
    this.webAndAppCardRevenueIncludingTips = webAndAppCardRevenueIncludingTips;
  }

  public PayoutReport3DetailsFlipdishFees kioskCash(Double kioskCash) {
    this.kioskCash = kioskCash;
    return this;
  }

   /**
   * Get kioskCash
   * @return kioskCash
  **/
  @ApiModelProperty(value = "")
  public Double getKioskCash() {
    return kioskCash;
  }

  public void setKioskCash(Double kioskCash) {
    this.kioskCash = kioskCash;
  }

  public PayoutReport3DetailsFlipdishFees kioskCashRevenue(Double kioskCashRevenue) {
    this.kioskCashRevenue = kioskCashRevenue;
    return this;
  }

   /**
   * Get kioskCashRevenue
   * @return kioskCashRevenue
  **/
  @ApiModelProperty(value = "")
  public Double getKioskCashRevenue() {
    return kioskCashRevenue;
  }

  public void setKioskCashRevenue(Double kioskCashRevenue) {
    this.kioskCashRevenue = kioskCashRevenue;
  }

  public PayoutReport3DetailsFlipdishFees kioskCard(Double kioskCard) {
    this.kioskCard = kioskCard;
    return this;
  }

   /**
   * Get kioskCard
   * @return kioskCard
  **/
  @ApiModelProperty(value = "")
  public Double getKioskCard() {
    return kioskCard;
  }

  public void setKioskCard(Double kioskCard) {
    this.kioskCard = kioskCard;
  }

  public PayoutReport3DetailsFlipdishFees kioskCardRevenue(Double kioskCardRevenue) {
    this.kioskCardRevenue = kioskCardRevenue;
    return this;
  }

   /**
   * Get kioskCardRevenue
   * @return kioskCardRevenue
  **/
  @ApiModelProperty(value = "")
  public Double getKioskCardRevenue() {
    return kioskCardRevenue;
  }

  public void setKioskCardRevenue(Double kioskCardRevenue) {
    this.kioskCardRevenue = kioskCardRevenue;
  }

  public PayoutReport3DetailsFlipdishFees qropCash(Double qropCash) {
    this.qropCash = qropCash;
    return this;
  }

   /**
   * Get qropCash
   * @return qropCash
  **/
  @ApiModelProperty(value = "")
  public Double getQropCash() {
    return qropCash;
  }

  public void setQropCash(Double qropCash) {
    this.qropCash = qropCash;
  }

  public PayoutReport3DetailsFlipdishFees qropCard(Double qropCard) {
    this.qropCard = qropCard;
    return this;
  }

   /**
   * Get qropCard
   * @return qropCard
  **/
  @ApiModelProperty(value = "")
  public Double getQropCard() {
    return qropCard;
  }

  public void setQropCard(Double qropCard) {
    this.qropCard = qropCard;
  }

  public PayoutReport3DetailsFlipdishFees posCard(Double posCard) {
    this.posCard = posCard;
    return this;
  }

   /**
   * Get posCard
   * @return posCard
  **/
  @ApiModelProperty(value = "")
  public Double getPosCard() {
    return posCard;
  }

  public void setPosCard(Double posCard) {
    this.posCard = posCard;
  }

  public PayoutReport3DetailsFlipdishFees posCardRevenue(Double posCardRevenue) {
    this.posCardRevenue = posCardRevenue;
    return this;
  }

   /**
   * Get posCardRevenue
   * @return posCardRevenue
  **/
  @ApiModelProperty(value = "")
  public Double getPosCardRevenue() {
    return posCardRevenue;
  }

  public void setPosCardRevenue(Double posCardRevenue) {
    this.posCardRevenue = posCardRevenue;
  }

  public PayoutReport3DetailsFlipdishFees posCardOnFlipdishOrders(Double posCardOnFlipdishOrders) {
    this.posCardOnFlipdishOrders = posCardOnFlipdishOrders;
    return this;
  }

   /**
   * Get posCardOnFlipdishOrders
   * @return posCardOnFlipdishOrders
  **/
  @ApiModelProperty(value = "")
  public Double getPosCardOnFlipdishOrders() {
    return posCardOnFlipdishOrders;
  }

  public void setPosCardOnFlipdishOrders(Double posCardOnFlipdishOrders) {
    this.posCardOnFlipdishOrders = posCardOnFlipdishOrders;
  }

  public PayoutReport3DetailsFlipdishFees otherIntegrationFees(Double otherIntegrationFees) {
    this.otherIntegrationFees = otherIntegrationFees;
    return this;
  }

   /**
   * Get otherIntegrationFees
   * @return otherIntegrationFees
  **/
  @ApiModelProperty(value = "")
  public Double getOtherIntegrationFees() {
    return otherIntegrationFees;
  }

  public void setOtherIntegrationFees(Double otherIntegrationFees) {
    this.otherIntegrationFees = otherIntegrationFees;
  }

  public PayoutReport3DetailsFlipdishFees otherIntegrationTips(Double otherIntegrationTips) {
    this.otherIntegrationTips = otherIntegrationTips;
    return this;
  }

   /**
   * Get otherIntegrationTips
   * @return otherIntegrationTips
  **/
  @ApiModelProperty(value = "")
  public Double getOtherIntegrationTips() {
    return otherIntegrationTips;
  }

  public void setOtherIntegrationTips(Double otherIntegrationTips) {
    this.otherIntegrationTips = otherIntegrationTips;
  }

  public PayoutReport3DetailsFlipdishFees refundedFeesOnRefundedSales(Double refundedFeesOnRefundedSales) {
    this.refundedFeesOnRefundedSales = refundedFeesOnRefundedSales;
    return this;
  }

   /**
   * Get refundedFeesOnRefundedSales
   * @return refundedFeesOnRefundedSales
  **/
  @ApiModelProperty(value = "")
  public Double getRefundedFeesOnRefundedSales() {
    return refundedFeesOnRefundedSales;
  }

  public void setRefundedFeesOnRefundedSales(Double refundedFeesOnRefundedSales) {
    this.refundedFeesOnRefundedSales = refundedFeesOnRefundedSales;
  }

  public PayoutReport3DetailsFlipdishFees vat(Double vat) {
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @ApiModelProperty(value = "")
  public Double getVat() {
    return vat;
  }

  public void setVat(Double vat) {
    this.vat = vat;
  }

  public PayoutReport3DetailsFlipdishFees total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public PayoutReport3DetailsFlipdishFees thirdPartyIntegrationFeesAndTips(Double thirdPartyIntegrationFeesAndTips) {
    this.thirdPartyIntegrationFeesAndTips = thirdPartyIntegrationFeesAndTips;
    return this;
  }

   /**
   * Get thirdPartyIntegrationFeesAndTips
   * @return thirdPartyIntegrationFeesAndTips
  **/
  @ApiModelProperty(value = "")
  public Double getThirdPartyIntegrationFeesAndTips() {
    return thirdPartyIntegrationFeesAndTips;
  }

  public void setThirdPartyIntegrationFeesAndTips(Double thirdPartyIntegrationFeesAndTips) {
    this.thirdPartyIntegrationFeesAndTips = thirdPartyIntegrationFeesAndTips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutReport3DetailsFlipdishFees payoutReport3DetailsFlipdishFees = (PayoutReport3DetailsFlipdishFees) o;
    return Objects.equals(this.webAndAppCash, payoutReport3DetailsFlipdishFees.webAndAppCash) &&
        Objects.equals(this.webAndAppCashRevenueIncludingTips, payoutReport3DetailsFlipdishFees.webAndAppCashRevenueIncludingTips) &&
        Objects.equals(this.webAndAppCard, payoutReport3DetailsFlipdishFees.webAndAppCard) &&
        Objects.equals(this.webAndAppCardRevenueIncludingTips, payoutReport3DetailsFlipdishFees.webAndAppCardRevenueIncludingTips) &&
        Objects.equals(this.kioskCash, payoutReport3DetailsFlipdishFees.kioskCash) &&
        Objects.equals(this.kioskCashRevenue, payoutReport3DetailsFlipdishFees.kioskCashRevenue) &&
        Objects.equals(this.kioskCard, payoutReport3DetailsFlipdishFees.kioskCard) &&
        Objects.equals(this.kioskCardRevenue, payoutReport3DetailsFlipdishFees.kioskCardRevenue) &&
        Objects.equals(this.qropCash, payoutReport3DetailsFlipdishFees.qropCash) &&
        Objects.equals(this.qropCard, payoutReport3DetailsFlipdishFees.qropCard) &&
        Objects.equals(this.posCard, payoutReport3DetailsFlipdishFees.posCard) &&
        Objects.equals(this.posCardRevenue, payoutReport3DetailsFlipdishFees.posCardRevenue) &&
        Objects.equals(this.posCardOnFlipdishOrders, payoutReport3DetailsFlipdishFees.posCardOnFlipdishOrders) &&
        Objects.equals(this.otherIntegrationFees, payoutReport3DetailsFlipdishFees.otherIntegrationFees) &&
        Objects.equals(this.otherIntegrationTips, payoutReport3DetailsFlipdishFees.otherIntegrationTips) &&
        Objects.equals(this.refundedFeesOnRefundedSales, payoutReport3DetailsFlipdishFees.refundedFeesOnRefundedSales) &&
        Objects.equals(this.vat, payoutReport3DetailsFlipdishFees.vat) &&
        Objects.equals(this.total, payoutReport3DetailsFlipdishFees.total) &&
        Objects.equals(this.thirdPartyIntegrationFeesAndTips, payoutReport3DetailsFlipdishFees.thirdPartyIntegrationFeesAndTips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webAndAppCash, webAndAppCashRevenueIncludingTips, webAndAppCard, webAndAppCardRevenueIncludingTips, kioskCash, kioskCashRevenue, kioskCard, kioskCardRevenue, qropCash, qropCard, posCard, posCardRevenue, posCardOnFlipdishOrders, otherIntegrationFees, otherIntegrationTips, refundedFeesOnRefundedSales, vat, total, thirdPartyIntegrationFeesAndTips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutReport3DetailsFlipdishFees {\n");
    
    sb.append("    webAndAppCash: ").append(toIndentedString(webAndAppCash)).append("\n");
    sb.append("    webAndAppCashRevenueIncludingTips: ").append(toIndentedString(webAndAppCashRevenueIncludingTips)).append("\n");
    sb.append("    webAndAppCard: ").append(toIndentedString(webAndAppCard)).append("\n");
    sb.append("    webAndAppCardRevenueIncludingTips: ").append(toIndentedString(webAndAppCardRevenueIncludingTips)).append("\n");
    sb.append("    kioskCash: ").append(toIndentedString(kioskCash)).append("\n");
    sb.append("    kioskCashRevenue: ").append(toIndentedString(kioskCashRevenue)).append("\n");
    sb.append("    kioskCard: ").append(toIndentedString(kioskCard)).append("\n");
    sb.append("    kioskCardRevenue: ").append(toIndentedString(kioskCardRevenue)).append("\n");
    sb.append("    qropCash: ").append(toIndentedString(qropCash)).append("\n");
    sb.append("    qropCard: ").append(toIndentedString(qropCard)).append("\n");
    sb.append("    posCard: ").append(toIndentedString(posCard)).append("\n");
    sb.append("    posCardRevenue: ").append(toIndentedString(posCardRevenue)).append("\n");
    sb.append("    posCardOnFlipdishOrders: ").append(toIndentedString(posCardOnFlipdishOrders)).append("\n");
    sb.append("    otherIntegrationFees: ").append(toIndentedString(otherIntegrationFees)).append("\n");
    sb.append("    otherIntegrationTips: ").append(toIndentedString(otherIntegrationTips)).append("\n");
    sb.append("    refundedFeesOnRefundedSales: ").append(toIndentedString(refundedFeesOnRefundedSales)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    thirdPartyIntegrationFeesAndTips: ").append(toIndentedString(thirdPartyIntegrationFeesAndTips)).append("\n");
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

