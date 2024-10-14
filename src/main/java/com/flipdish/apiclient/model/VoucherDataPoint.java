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
 * A single data point in timeline graphs related to Vouchers
 */
@ApiModel(description = "A single data point in timeline graphs related to Vouchers")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-14T09:27:31.777Z")
public class VoucherDataPoint {
  @SerializedName("PeriodStart")
  private OffsetDateTime periodStart = null;

  @SerializedName("PeriodLengthInDays")
  private Integer periodLengthInDays = null;

  @SerializedName("Value")
  private Integer value = null;

  public VoucherDataPoint periodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Date from which the data point starts
   * @return periodStart
  **/
  @ApiModelProperty(value = "Date from which the data point starts")
  public OffsetDateTime getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(OffsetDateTime periodStart) {
    this.periodStart = periodStart;
  }

  public VoucherDataPoint periodLengthInDays(Integer periodLengthInDays) {
    this.periodLengthInDays = periodLengthInDays;
    return this;
  }

   /**
   * The length in days that this data point covers
   * @return periodLengthInDays
  **/
  @ApiModelProperty(value = "The length in days that this data point covers")
  public Integer getPeriodLengthInDays() {
    return periodLengthInDays;
  }

  public void setPeriodLengthInDays(Integer periodLengthInDays) {
    this.periodLengthInDays = periodLengthInDays;
  }

  public VoucherDataPoint value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The value of this data point
   * @return value
  **/
  @ApiModelProperty(value = "The value of this data point")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherDataPoint voucherDataPoint = (VoucherDataPoint) o;
    return Objects.equals(this.periodStart, voucherDataPoint.periodStart) &&
        Objects.equals(this.periodLengthInDays, voucherDataPoint.periodLengthInDays) &&
        Objects.equals(this.value, voucherDataPoint.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodStart, periodLengthInDays, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherDataPoint {\n");
    
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
    sb.append("    periodLengthInDays: ").append(toIndentedString(periodLengthInDays)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

