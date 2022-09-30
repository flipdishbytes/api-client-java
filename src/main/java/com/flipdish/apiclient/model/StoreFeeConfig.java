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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-30T10:42:22.879+01:00")
public class StoreFeeConfig {
  @SerializedName("FeeConfigId")
  private Integer feeConfigId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StartTime")
  private OffsetDateTime startTime = null;

  @SerializedName("PercentFeeCardOrders")
  private Double percentFeeCardOrders = null;

  @SerializedName("PercentFeeCashOrders")
  private Double percentFeeCashOrders = null;

  @SerializedName("PercentFeeCardOrdersWeb")
  private Double percentFeeCardOrdersWeb = null;

  @SerializedName("PercentFeeCashOrdersWeb")
  private Double percentFeeCashOrdersWeb = null;

  @SerializedName("PercentFeeCardOrdersKiosk")
  private Double percentFeeCardOrdersKiosk = null;

  @SerializedName("PercentFeeCashOrdersKiosk")
  private Double percentFeeCashOrdersKiosk = null;

  @SerializedName("FixedFeeCardOrdersKiosk")
  private Double fixedFeeCardOrdersKiosk = null;

  @SerializedName("FixedFeeCashOrdersKiosk")
  private Double fixedFeeCashOrdersKiosk = null;

  @SerializedName("PercentFeeCardOrdersKioskChargedToCustomerIncludingVat")
  private Double percentFeeCardOrdersKioskChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCardOrdersKioskChargedToCustomerIncludingVat")
  private Double fixedFeeCardOrdersKioskChargedToCustomerIncludingVat = null;

  @SerializedName("PercentFeeCashOrdersKioskChargedToCustomerIncludingVat")
  private Double percentFeeCashOrdersKioskChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCashOrdersKioskChargedToCustomerIncludingVat")
  private Double fixedFeeCashOrdersKioskChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCardOrders")
  private Double fixedFeeCardOrders = null;

  @SerializedName("FixedFeeCashOrders")
  private Double fixedFeeCashOrders = null;

  @SerializedName("PercentFeeCardOrdersChargedToCustomerIncludingVat")
  private Double percentFeeCardOrdersChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCardOrdersChargedToCustomerIncludingVat")
  private Double fixedFeeCardOrdersChargedToCustomerIncludingVat = null;

  @SerializedName("PercentFeeCashOrdersChargedToCustomerIncludingVat")
  private Double percentFeeCashOrdersChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCashOrdersChargedToCustomerIncludingVat")
  private Double fixedFeeCashOrdersChargedToCustomerIncludingVat = null;

  @SerializedName("PercentFeeTips")
  private Double percentFeeTips = null;

  @SerializedName("TaxRatePercent")
  private Double taxRatePercent = null;

  @SerializedName("PercentFeeCardOrdersLocationService")
  private Double percentFeeCardOrdersLocationService = null;

  @SerializedName("PercentFeeCashOrdersLocationService")
  private Double percentFeeCashOrdersLocationService = null;

  @SerializedName("FixedFeeCardOrdersLocationService")
  private Double fixedFeeCardOrdersLocationService = null;

  @SerializedName("FixedFeeCashOrdersLocationService")
  private Double fixedFeeCashOrdersLocationService = null;

  @SerializedName("PercentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat")
  private Double percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat = null;

  @SerializedName("PercentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat")
  private Double percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat")
  private Double fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat = null;

  @SerializedName("FixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat")
  private Double fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat = null;

  @SerializedName("PercentFeeCardOrdersIngest")
  private Double percentFeeCardOrdersIngest = null;

  @SerializedName("PercentFeeCashOrdersIngest")
  private Double percentFeeCashOrdersIngest = null;

  @SerializedName("FixedFeeCardOrdersIngest")
  private Double fixedFeeCardOrdersIngest = null;

  @SerializedName("FixedFeeCashOrdersIngest")
  private Double fixedFeeCashOrdersIngest = null;

  public StoreFeeConfig feeConfigId(Integer feeConfigId) {
    this.feeConfigId = feeConfigId;
    return this;
  }

   /**
   * 
   * @return feeConfigId
  **/
  @ApiModelProperty(value = "")
  public Integer getFeeConfigId() {
    return feeConfigId;
  }

  public void setFeeConfigId(Integer feeConfigId) {
    this.feeConfigId = feeConfigId;
  }

  public StoreFeeConfig storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * 
   * @return storeId
  **/
  @ApiModelProperty(value = "")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public StoreFeeConfig startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public StoreFeeConfig percentFeeCardOrders(Double percentFeeCardOrders) {
    this.percentFeeCardOrders = percentFeeCardOrders;
    return this;
  }

   /**
   * 
   * @return percentFeeCardOrders
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCardOrders() {
    return percentFeeCardOrders;
  }

  public void setPercentFeeCardOrders(Double percentFeeCardOrders) {
    this.percentFeeCardOrders = percentFeeCardOrders;
  }

  public StoreFeeConfig percentFeeCashOrders(Double percentFeeCashOrders) {
    this.percentFeeCashOrders = percentFeeCashOrders;
    return this;
  }

   /**
   * 
   * @return percentFeeCashOrders
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCashOrders() {
    return percentFeeCashOrders;
  }

  public void setPercentFeeCashOrders(Double percentFeeCashOrders) {
    this.percentFeeCashOrders = percentFeeCashOrders;
  }

  public StoreFeeConfig percentFeeCardOrdersWeb(Double percentFeeCardOrdersWeb) {
    this.percentFeeCardOrdersWeb = percentFeeCardOrdersWeb;
    return this;
  }

   /**
   * 
   * @return percentFeeCardOrdersWeb
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCardOrdersWeb() {
    return percentFeeCardOrdersWeb;
  }

  public void setPercentFeeCardOrdersWeb(Double percentFeeCardOrdersWeb) {
    this.percentFeeCardOrdersWeb = percentFeeCardOrdersWeb;
  }

  public StoreFeeConfig percentFeeCashOrdersWeb(Double percentFeeCashOrdersWeb) {
    this.percentFeeCashOrdersWeb = percentFeeCashOrdersWeb;
    return this;
  }

   /**
   * 
   * @return percentFeeCashOrdersWeb
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCashOrdersWeb() {
    return percentFeeCashOrdersWeb;
  }

  public void setPercentFeeCashOrdersWeb(Double percentFeeCashOrdersWeb) {
    this.percentFeeCashOrdersWeb = percentFeeCashOrdersWeb;
  }

  public StoreFeeConfig percentFeeCardOrdersKiosk(Double percentFeeCardOrdersKiosk) {
    this.percentFeeCardOrdersKiosk = percentFeeCardOrdersKiosk;
    return this;
  }

   /**
   * 
   * @return percentFeeCardOrdersKiosk
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCardOrdersKiosk() {
    return percentFeeCardOrdersKiosk;
  }

  public void setPercentFeeCardOrdersKiosk(Double percentFeeCardOrdersKiosk) {
    this.percentFeeCardOrdersKiosk = percentFeeCardOrdersKiosk;
  }

  public StoreFeeConfig percentFeeCashOrdersKiosk(Double percentFeeCashOrdersKiosk) {
    this.percentFeeCashOrdersKiosk = percentFeeCashOrdersKiosk;
    return this;
  }

   /**
   * 
   * @return percentFeeCashOrdersKiosk
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCashOrdersKiosk() {
    return percentFeeCashOrdersKiosk;
  }

  public void setPercentFeeCashOrdersKiosk(Double percentFeeCashOrdersKiosk) {
    this.percentFeeCashOrdersKiosk = percentFeeCashOrdersKiosk;
  }

  public StoreFeeConfig fixedFeeCardOrdersKiosk(Double fixedFeeCardOrdersKiosk) {
    this.fixedFeeCardOrdersKiosk = fixedFeeCardOrdersKiosk;
    return this;
  }

   /**
   * 
   * @return fixedFeeCardOrdersKiosk
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCardOrdersKiosk() {
    return fixedFeeCardOrdersKiosk;
  }

  public void setFixedFeeCardOrdersKiosk(Double fixedFeeCardOrdersKiosk) {
    this.fixedFeeCardOrdersKiosk = fixedFeeCardOrdersKiosk;
  }

  public StoreFeeConfig fixedFeeCashOrdersKiosk(Double fixedFeeCashOrdersKiosk) {
    this.fixedFeeCashOrdersKiosk = fixedFeeCashOrdersKiosk;
    return this;
  }

   /**
   * 
   * @return fixedFeeCashOrdersKiosk
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCashOrdersKiosk() {
    return fixedFeeCashOrdersKiosk;
  }

  public void setFixedFeeCashOrdersKiosk(Double fixedFeeCashOrdersKiosk) {
    this.fixedFeeCashOrdersKiosk = fixedFeeCashOrdersKiosk;
  }

  public StoreFeeConfig percentFeeCardOrdersKioskChargedToCustomerIncludingVat(Double percentFeeCardOrdersKioskChargedToCustomerIncludingVat) {
    this.percentFeeCardOrdersKioskChargedToCustomerIncludingVat = percentFeeCardOrdersKioskChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return percentFeeCardOrdersKioskChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCardOrdersKioskChargedToCustomerIncludingVat() {
    return percentFeeCardOrdersKioskChargedToCustomerIncludingVat;
  }

  public void setPercentFeeCardOrdersKioskChargedToCustomerIncludingVat(Double percentFeeCardOrdersKioskChargedToCustomerIncludingVat) {
    this.percentFeeCardOrdersKioskChargedToCustomerIncludingVat = percentFeeCardOrdersKioskChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCardOrdersKioskChargedToCustomerIncludingVat(Double fixedFeeCardOrdersKioskChargedToCustomerIncludingVat) {
    this.fixedFeeCardOrdersKioskChargedToCustomerIncludingVat = fixedFeeCardOrdersKioskChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return fixedFeeCardOrdersKioskChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCardOrdersKioskChargedToCustomerIncludingVat() {
    return fixedFeeCardOrdersKioskChargedToCustomerIncludingVat;
  }

  public void setFixedFeeCardOrdersKioskChargedToCustomerIncludingVat(Double fixedFeeCardOrdersKioskChargedToCustomerIncludingVat) {
    this.fixedFeeCardOrdersKioskChargedToCustomerIncludingVat = fixedFeeCardOrdersKioskChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig percentFeeCashOrdersKioskChargedToCustomerIncludingVat(Double percentFeeCashOrdersKioskChargedToCustomerIncludingVat) {
    this.percentFeeCashOrdersKioskChargedToCustomerIncludingVat = percentFeeCashOrdersKioskChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return percentFeeCashOrdersKioskChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCashOrdersKioskChargedToCustomerIncludingVat() {
    return percentFeeCashOrdersKioskChargedToCustomerIncludingVat;
  }

  public void setPercentFeeCashOrdersKioskChargedToCustomerIncludingVat(Double percentFeeCashOrdersKioskChargedToCustomerIncludingVat) {
    this.percentFeeCashOrdersKioskChargedToCustomerIncludingVat = percentFeeCashOrdersKioskChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCashOrdersKioskChargedToCustomerIncludingVat(Double fixedFeeCashOrdersKioskChargedToCustomerIncludingVat) {
    this.fixedFeeCashOrdersKioskChargedToCustomerIncludingVat = fixedFeeCashOrdersKioskChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return fixedFeeCashOrdersKioskChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCashOrdersKioskChargedToCustomerIncludingVat() {
    return fixedFeeCashOrdersKioskChargedToCustomerIncludingVat;
  }

  public void setFixedFeeCashOrdersKioskChargedToCustomerIncludingVat(Double fixedFeeCashOrdersKioskChargedToCustomerIncludingVat) {
    this.fixedFeeCashOrdersKioskChargedToCustomerIncludingVat = fixedFeeCashOrdersKioskChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCardOrders(Double fixedFeeCardOrders) {
    this.fixedFeeCardOrders = fixedFeeCardOrders;
    return this;
  }

   /**
   * 
   * @return fixedFeeCardOrders
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCardOrders() {
    return fixedFeeCardOrders;
  }

  public void setFixedFeeCardOrders(Double fixedFeeCardOrders) {
    this.fixedFeeCardOrders = fixedFeeCardOrders;
  }

  public StoreFeeConfig fixedFeeCashOrders(Double fixedFeeCashOrders) {
    this.fixedFeeCashOrders = fixedFeeCashOrders;
    return this;
  }

   /**
   * 
   * @return fixedFeeCashOrders
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCashOrders() {
    return fixedFeeCashOrders;
  }

  public void setFixedFeeCashOrders(Double fixedFeeCashOrders) {
    this.fixedFeeCashOrders = fixedFeeCashOrders;
  }

  public StoreFeeConfig percentFeeCardOrdersChargedToCustomerIncludingVat(Double percentFeeCardOrdersChargedToCustomerIncludingVat) {
    this.percentFeeCardOrdersChargedToCustomerIncludingVat = percentFeeCardOrdersChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return percentFeeCardOrdersChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCardOrdersChargedToCustomerIncludingVat() {
    return percentFeeCardOrdersChargedToCustomerIncludingVat;
  }

  public void setPercentFeeCardOrdersChargedToCustomerIncludingVat(Double percentFeeCardOrdersChargedToCustomerIncludingVat) {
    this.percentFeeCardOrdersChargedToCustomerIncludingVat = percentFeeCardOrdersChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCardOrdersChargedToCustomerIncludingVat(Double fixedFeeCardOrdersChargedToCustomerIncludingVat) {
    this.fixedFeeCardOrdersChargedToCustomerIncludingVat = fixedFeeCardOrdersChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return fixedFeeCardOrdersChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCardOrdersChargedToCustomerIncludingVat() {
    return fixedFeeCardOrdersChargedToCustomerIncludingVat;
  }

  public void setFixedFeeCardOrdersChargedToCustomerIncludingVat(Double fixedFeeCardOrdersChargedToCustomerIncludingVat) {
    this.fixedFeeCardOrdersChargedToCustomerIncludingVat = fixedFeeCardOrdersChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig percentFeeCashOrdersChargedToCustomerIncludingVat(Double percentFeeCashOrdersChargedToCustomerIncludingVat) {
    this.percentFeeCashOrdersChargedToCustomerIncludingVat = percentFeeCashOrdersChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return percentFeeCashOrdersChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getPercentFeeCashOrdersChargedToCustomerIncludingVat() {
    return percentFeeCashOrdersChargedToCustomerIncludingVat;
  }

  public void setPercentFeeCashOrdersChargedToCustomerIncludingVat(Double percentFeeCashOrdersChargedToCustomerIncludingVat) {
    this.percentFeeCashOrdersChargedToCustomerIncludingVat = percentFeeCashOrdersChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCashOrdersChargedToCustomerIncludingVat(Double fixedFeeCashOrdersChargedToCustomerIncludingVat) {
    this.fixedFeeCashOrdersChargedToCustomerIncludingVat = fixedFeeCashOrdersChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * 
   * @return fixedFeeCashOrdersChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "")
  public Double getFixedFeeCashOrdersChargedToCustomerIncludingVat() {
    return fixedFeeCashOrdersChargedToCustomerIncludingVat;
  }

  public void setFixedFeeCashOrdersChargedToCustomerIncludingVat(Double fixedFeeCashOrdersChargedToCustomerIncludingVat) {
    this.fixedFeeCashOrdersChargedToCustomerIncludingVat = fixedFeeCashOrdersChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig percentFeeTips(Double percentFeeTips) {
    this.percentFeeTips = percentFeeTips;
    return this;
  }

   /**
   * Gets or sets the percent fee tips.
   * @return percentFeeTips
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee tips.")
  public Double getPercentFeeTips() {
    return percentFeeTips;
  }

  public void setPercentFeeTips(Double percentFeeTips) {
    this.percentFeeTips = percentFeeTips;
  }

  public StoreFeeConfig taxRatePercent(Double taxRatePercent) {
    this.taxRatePercent = taxRatePercent;
    return this;
  }

   /**
   * Gets or sets the tax rate percent.
   * @return taxRatePercent
  **/
  @ApiModelProperty(value = "Gets or sets the tax rate percent.")
  public Double getTaxRatePercent() {
    return taxRatePercent;
  }

  public void setTaxRatePercent(Double taxRatePercent) {
    this.taxRatePercent = taxRatePercent;
  }

  public StoreFeeConfig percentFeeCardOrdersLocationService(Double percentFeeCardOrdersLocationService) {
    this.percentFeeCardOrdersLocationService = percentFeeCardOrdersLocationService;
    return this;
  }

   /**
   * Gets or sets the percent fee card orders location service.
   * @return percentFeeCardOrdersLocationService
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee card orders location service.")
  public Double getPercentFeeCardOrdersLocationService() {
    return percentFeeCardOrdersLocationService;
  }

  public void setPercentFeeCardOrdersLocationService(Double percentFeeCardOrdersLocationService) {
    this.percentFeeCardOrdersLocationService = percentFeeCardOrdersLocationService;
  }

  public StoreFeeConfig percentFeeCashOrdersLocationService(Double percentFeeCashOrdersLocationService) {
    this.percentFeeCashOrdersLocationService = percentFeeCashOrdersLocationService;
    return this;
  }

   /**
   * Gets or sets the percent fee cash orders location service.
   * @return percentFeeCashOrdersLocationService
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee cash orders location service.")
  public Double getPercentFeeCashOrdersLocationService() {
    return percentFeeCashOrdersLocationService;
  }

  public void setPercentFeeCashOrdersLocationService(Double percentFeeCashOrdersLocationService) {
    this.percentFeeCashOrdersLocationService = percentFeeCashOrdersLocationService;
  }

  public StoreFeeConfig fixedFeeCardOrdersLocationService(Double fixedFeeCardOrdersLocationService) {
    this.fixedFeeCardOrdersLocationService = fixedFeeCardOrdersLocationService;
    return this;
  }

   /**
   * Gets or sets the fixed fee card orders location service.
   * @return fixedFeeCardOrdersLocationService
  **/
  @ApiModelProperty(value = "Gets or sets the fixed fee card orders location service.")
  public Double getFixedFeeCardOrdersLocationService() {
    return fixedFeeCardOrdersLocationService;
  }

  public void setFixedFeeCardOrdersLocationService(Double fixedFeeCardOrdersLocationService) {
    this.fixedFeeCardOrdersLocationService = fixedFeeCardOrdersLocationService;
  }

  public StoreFeeConfig fixedFeeCashOrdersLocationService(Double fixedFeeCashOrdersLocationService) {
    this.fixedFeeCashOrdersLocationService = fixedFeeCashOrdersLocationService;
    return this;
  }

   /**
   * Gets or sets the fixed fee cash orders location service.
   * @return fixedFeeCashOrdersLocationService
  **/
  @ApiModelProperty(value = "Gets or sets the fixed fee cash orders location service.")
  public Double getFixedFeeCashOrdersLocationService() {
    return fixedFeeCashOrdersLocationService;
  }

  public void setFixedFeeCashOrdersLocationService(Double fixedFeeCashOrdersLocationService) {
    this.fixedFeeCashOrdersLocationService = fixedFeeCashOrdersLocationService;
  }

  public StoreFeeConfig percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat(Double percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat = percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * Gets or sets the percent fee card orders location service charged to customer including vat.
   * @return percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee card orders location service charged to customer including vat.")
  public Double getPercentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat() {
    return percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public void setPercentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat(Double percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat = percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat(Double percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat = percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * Gets or sets the percent fee cash orders location service charged to customer including vat.
   * @return percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee cash orders location service charged to customer including vat.")
  public Double getPercentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat() {
    return percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public void setPercentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat(Double percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat = percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat(Double fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat = fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * Gets or sets the fixed fee card orders location service charged to customer including vat.
   * @return fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "Gets or sets the fixed fee card orders location service charged to customer including vat.")
  public Double getFixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat() {
    return fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public void setFixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat(Double fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat = fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat(Double fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat = fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat;
    return this;
  }

   /**
   * Gets or sets the fixed fee cash orders location service charged to customer including vat.
   * @return fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat
  **/
  @ApiModelProperty(value = "Gets or sets the fixed fee cash orders location service charged to customer including vat.")
  public Double getFixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat() {
    return fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public void setFixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat(Double fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat) {
    this.fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat = fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat;
  }

  public StoreFeeConfig percentFeeCardOrdersIngest(Double percentFeeCardOrdersIngest) {
    this.percentFeeCardOrdersIngest = percentFeeCardOrdersIngest;
    return this;
  }

   /**
   * Gets or sets the percent fee card orders ingest.
   * @return percentFeeCardOrdersIngest
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee card orders ingest.")
  public Double getPercentFeeCardOrdersIngest() {
    return percentFeeCardOrdersIngest;
  }

  public void setPercentFeeCardOrdersIngest(Double percentFeeCardOrdersIngest) {
    this.percentFeeCardOrdersIngest = percentFeeCardOrdersIngest;
  }

  public StoreFeeConfig percentFeeCashOrdersIngest(Double percentFeeCashOrdersIngest) {
    this.percentFeeCashOrdersIngest = percentFeeCashOrdersIngest;
    return this;
  }

   /**
   * Gets or sets the percent fee cash orders ingest.
   * @return percentFeeCashOrdersIngest
  **/
  @ApiModelProperty(value = "Gets or sets the percent fee cash orders ingest.")
  public Double getPercentFeeCashOrdersIngest() {
    return percentFeeCashOrdersIngest;
  }

  public void setPercentFeeCashOrdersIngest(Double percentFeeCashOrdersIngest) {
    this.percentFeeCashOrdersIngest = percentFeeCashOrdersIngest;
  }

  public StoreFeeConfig fixedFeeCardOrdersIngest(Double fixedFeeCardOrdersIngest) {
    this.fixedFeeCardOrdersIngest = fixedFeeCardOrdersIngest;
    return this;
  }

   /**
   * Gets or sets the fixed fee card orders ingest.
   * @return fixedFeeCardOrdersIngest
  **/
  @ApiModelProperty(value = "Gets or sets the fixed fee card orders ingest.")
  public Double getFixedFeeCardOrdersIngest() {
    return fixedFeeCardOrdersIngest;
  }

  public void setFixedFeeCardOrdersIngest(Double fixedFeeCardOrdersIngest) {
    this.fixedFeeCardOrdersIngest = fixedFeeCardOrdersIngest;
  }

  public StoreFeeConfig fixedFeeCashOrdersIngest(Double fixedFeeCashOrdersIngest) {
    this.fixedFeeCashOrdersIngest = fixedFeeCashOrdersIngest;
    return this;
  }

   /**
   * Gets or sets the fixed fee cash orders ingest.
   * @return fixedFeeCashOrdersIngest
  **/
  @ApiModelProperty(value = "Gets or sets the fixed fee cash orders ingest.")
  public Double getFixedFeeCashOrdersIngest() {
    return fixedFeeCashOrdersIngest;
  }

  public void setFixedFeeCashOrdersIngest(Double fixedFeeCashOrdersIngest) {
    this.fixedFeeCashOrdersIngest = fixedFeeCashOrdersIngest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreFeeConfig storeFeeConfig = (StoreFeeConfig) o;
    return Objects.equals(this.feeConfigId, storeFeeConfig.feeConfigId) &&
        Objects.equals(this.storeId, storeFeeConfig.storeId) &&
        Objects.equals(this.startTime, storeFeeConfig.startTime) &&
        Objects.equals(this.percentFeeCardOrders, storeFeeConfig.percentFeeCardOrders) &&
        Objects.equals(this.percentFeeCashOrders, storeFeeConfig.percentFeeCashOrders) &&
        Objects.equals(this.percentFeeCardOrdersWeb, storeFeeConfig.percentFeeCardOrdersWeb) &&
        Objects.equals(this.percentFeeCashOrdersWeb, storeFeeConfig.percentFeeCashOrdersWeb) &&
        Objects.equals(this.percentFeeCardOrdersKiosk, storeFeeConfig.percentFeeCardOrdersKiosk) &&
        Objects.equals(this.percentFeeCashOrdersKiosk, storeFeeConfig.percentFeeCashOrdersKiosk) &&
        Objects.equals(this.fixedFeeCardOrdersKiosk, storeFeeConfig.fixedFeeCardOrdersKiosk) &&
        Objects.equals(this.fixedFeeCashOrdersKiosk, storeFeeConfig.fixedFeeCashOrdersKiosk) &&
        Objects.equals(this.percentFeeCardOrdersKioskChargedToCustomerIncludingVat, storeFeeConfig.percentFeeCardOrdersKioskChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCardOrdersKioskChargedToCustomerIncludingVat, storeFeeConfig.fixedFeeCardOrdersKioskChargedToCustomerIncludingVat) &&
        Objects.equals(this.percentFeeCashOrdersKioskChargedToCustomerIncludingVat, storeFeeConfig.percentFeeCashOrdersKioskChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCashOrdersKioskChargedToCustomerIncludingVat, storeFeeConfig.fixedFeeCashOrdersKioskChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCardOrders, storeFeeConfig.fixedFeeCardOrders) &&
        Objects.equals(this.fixedFeeCashOrders, storeFeeConfig.fixedFeeCashOrders) &&
        Objects.equals(this.percentFeeCardOrdersChargedToCustomerIncludingVat, storeFeeConfig.percentFeeCardOrdersChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCardOrdersChargedToCustomerIncludingVat, storeFeeConfig.fixedFeeCardOrdersChargedToCustomerIncludingVat) &&
        Objects.equals(this.percentFeeCashOrdersChargedToCustomerIncludingVat, storeFeeConfig.percentFeeCashOrdersChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCashOrdersChargedToCustomerIncludingVat, storeFeeConfig.fixedFeeCashOrdersChargedToCustomerIncludingVat) &&
        Objects.equals(this.percentFeeTips, storeFeeConfig.percentFeeTips) &&
        Objects.equals(this.taxRatePercent, storeFeeConfig.taxRatePercent) &&
        Objects.equals(this.percentFeeCardOrdersLocationService, storeFeeConfig.percentFeeCardOrdersLocationService) &&
        Objects.equals(this.percentFeeCashOrdersLocationService, storeFeeConfig.percentFeeCashOrdersLocationService) &&
        Objects.equals(this.fixedFeeCardOrdersLocationService, storeFeeConfig.fixedFeeCardOrdersLocationService) &&
        Objects.equals(this.fixedFeeCashOrdersLocationService, storeFeeConfig.fixedFeeCashOrdersLocationService) &&
        Objects.equals(this.percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat, storeFeeConfig.percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat) &&
        Objects.equals(this.percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat, storeFeeConfig.percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat, storeFeeConfig.fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat) &&
        Objects.equals(this.fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat, storeFeeConfig.fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat) &&
        Objects.equals(this.percentFeeCardOrdersIngest, storeFeeConfig.percentFeeCardOrdersIngest) &&
        Objects.equals(this.percentFeeCashOrdersIngest, storeFeeConfig.percentFeeCashOrdersIngest) &&
        Objects.equals(this.fixedFeeCardOrdersIngest, storeFeeConfig.fixedFeeCardOrdersIngest) &&
        Objects.equals(this.fixedFeeCashOrdersIngest, storeFeeConfig.fixedFeeCashOrdersIngest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeConfigId, storeId, startTime, percentFeeCardOrders, percentFeeCashOrders, percentFeeCardOrdersWeb, percentFeeCashOrdersWeb, percentFeeCardOrdersKiosk, percentFeeCashOrdersKiosk, fixedFeeCardOrdersKiosk, fixedFeeCashOrdersKiosk, percentFeeCardOrdersKioskChargedToCustomerIncludingVat, fixedFeeCardOrdersKioskChargedToCustomerIncludingVat, percentFeeCashOrdersKioskChargedToCustomerIncludingVat, fixedFeeCashOrdersKioskChargedToCustomerIncludingVat, fixedFeeCardOrders, fixedFeeCashOrders, percentFeeCardOrdersChargedToCustomerIncludingVat, fixedFeeCardOrdersChargedToCustomerIncludingVat, percentFeeCashOrdersChargedToCustomerIncludingVat, fixedFeeCashOrdersChargedToCustomerIncludingVat, percentFeeTips, taxRatePercent, percentFeeCardOrdersLocationService, percentFeeCashOrdersLocationService, fixedFeeCardOrdersLocationService, fixedFeeCashOrdersLocationService, percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat, percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat, fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat, fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat, percentFeeCardOrdersIngest, percentFeeCashOrdersIngest, fixedFeeCardOrdersIngest, fixedFeeCashOrdersIngest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreFeeConfig {\n");
    
    sb.append("    feeConfigId: ").append(toIndentedString(feeConfigId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    percentFeeCardOrders: ").append(toIndentedString(percentFeeCardOrders)).append("\n");
    sb.append("    percentFeeCashOrders: ").append(toIndentedString(percentFeeCashOrders)).append("\n");
    sb.append("    percentFeeCardOrdersWeb: ").append(toIndentedString(percentFeeCardOrdersWeb)).append("\n");
    sb.append("    percentFeeCashOrdersWeb: ").append(toIndentedString(percentFeeCashOrdersWeb)).append("\n");
    sb.append("    percentFeeCardOrdersKiosk: ").append(toIndentedString(percentFeeCardOrdersKiosk)).append("\n");
    sb.append("    percentFeeCashOrdersKiosk: ").append(toIndentedString(percentFeeCashOrdersKiosk)).append("\n");
    sb.append("    fixedFeeCardOrdersKiosk: ").append(toIndentedString(fixedFeeCardOrdersKiosk)).append("\n");
    sb.append("    fixedFeeCashOrdersKiosk: ").append(toIndentedString(fixedFeeCashOrdersKiosk)).append("\n");
    sb.append("    percentFeeCardOrdersKioskChargedToCustomerIncludingVat: ").append(toIndentedString(percentFeeCardOrdersKioskChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCardOrdersKioskChargedToCustomerIncludingVat: ").append(toIndentedString(fixedFeeCardOrdersKioskChargedToCustomerIncludingVat)).append("\n");
    sb.append("    percentFeeCashOrdersKioskChargedToCustomerIncludingVat: ").append(toIndentedString(percentFeeCashOrdersKioskChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCashOrdersKioskChargedToCustomerIncludingVat: ").append(toIndentedString(fixedFeeCashOrdersKioskChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCardOrders: ").append(toIndentedString(fixedFeeCardOrders)).append("\n");
    sb.append("    fixedFeeCashOrders: ").append(toIndentedString(fixedFeeCashOrders)).append("\n");
    sb.append("    percentFeeCardOrdersChargedToCustomerIncludingVat: ").append(toIndentedString(percentFeeCardOrdersChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCardOrdersChargedToCustomerIncludingVat: ").append(toIndentedString(fixedFeeCardOrdersChargedToCustomerIncludingVat)).append("\n");
    sb.append("    percentFeeCashOrdersChargedToCustomerIncludingVat: ").append(toIndentedString(percentFeeCashOrdersChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCashOrdersChargedToCustomerIncludingVat: ").append(toIndentedString(fixedFeeCashOrdersChargedToCustomerIncludingVat)).append("\n");
    sb.append("    percentFeeTips: ").append(toIndentedString(percentFeeTips)).append("\n");
    sb.append("    taxRatePercent: ").append(toIndentedString(taxRatePercent)).append("\n");
    sb.append("    percentFeeCardOrdersLocationService: ").append(toIndentedString(percentFeeCardOrdersLocationService)).append("\n");
    sb.append("    percentFeeCashOrdersLocationService: ").append(toIndentedString(percentFeeCashOrdersLocationService)).append("\n");
    sb.append("    fixedFeeCardOrdersLocationService: ").append(toIndentedString(fixedFeeCardOrdersLocationService)).append("\n");
    sb.append("    fixedFeeCashOrdersLocationService: ").append(toIndentedString(fixedFeeCashOrdersLocationService)).append("\n");
    sb.append("    percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat: ").append(toIndentedString(percentFeeCardOrdersLocationServiceChargedToCustomerIncludingVat)).append("\n");
    sb.append("    percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat: ").append(toIndentedString(percentFeeCashOrdersLocationServiceChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat: ").append(toIndentedString(fixedFeeCardOrdersLocationServiceChargedToCustomerIncludingVat)).append("\n");
    sb.append("    fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat: ").append(toIndentedString(fixedFeeCashOrdersLocationServiceChargedToCustomerIncludingVat)).append("\n");
    sb.append("    percentFeeCardOrdersIngest: ").append(toIndentedString(percentFeeCardOrdersIngest)).append("\n");
    sb.append("    percentFeeCashOrdersIngest: ").append(toIndentedString(percentFeeCashOrdersIngest)).append("\n");
    sb.append("    fixedFeeCardOrdersIngest: ").append(toIndentedString(fixedFeeCardOrdersIngest)).append("\n");
    sb.append("    fixedFeeCashOrdersIngest: ").append(toIndentedString(fixedFeeCashOrdersIngest)).append("\n");
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

