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
 * If the order exceeds are certain amount this configuration will determine a new vehicle type
 */
@ApiModel(description = "If the order exceeds are certain amount this configuration will determine a new vehicle type")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class StuartSettingsTransportPrices {
  @SerializedName("Bike")
  private Double bike = null;

  @SerializedName("Cargobike")
  private Double cargobike = null;

  @SerializedName("Cargobikexl")
  private Double cargobikexl = null;

  @SerializedName("Motorbike")
  private Double motorbike = null;

  @SerializedName("Motorbikexl")
  private Double motorbikexl = null;

  @SerializedName("Car")
  private Double car = null;

  @SerializedName("Van")
  private Double van = null;

  public StuartSettingsTransportPrices bike(Double bike) {
    this.bike = bike;
    return this;
  }

   /**
   * Get bike
   * @return bike
  **/
  @ApiModelProperty(value = "")
  public Double getBike() {
    return bike;
  }

  public void setBike(Double bike) {
    this.bike = bike;
  }

  public StuartSettingsTransportPrices cargobike(Double cargobike) {
    this.cargobike = cargobike;
    return this;
  }

   /**
   * Get cargobike
   * @return cargobike
  **/
  @ApiModelProperty(value = "")
  public Double getCargobike() {
    return cargobike;
  }

  public void setCargobike(Double cargobike) {
    this.cargobike = cargobike;
  }

  public StuartSettingsTransportPrices cargobikexl(Double cargobikexl) {
    this.cargobikexl = cargobikexl;
    return this;
  }

   /**
   * Get cargobikexl
   * @return cargobikexl
  **/
  @ApiModelProperty(value = "")
  public Double getCargobikexl() {
    return cargobikexl;
  }

  public void setCargobikexl(Double cargobikexl) {
    this.cargobikexl = cargobikexl;
  }

  public StuartSettingsTransportPrices motorbike(Double motorbike) {
    this.motorbike = motorbike;
    return this;
  }

   /**
   * Get motorbike
   * @return motorbike
  **/
  @ApiModelProperty(value = "")
  public Double getMotorbike() {
    return motorbike;
  }

  public void setMotorbike(Double motorbike) {
    this.motorbike = motorbike;
  }

  public StuartSettingsTransportPrices motorbikexl(Double motorbikexl) {
    this.motorbikexl = motorbikexl;
    return this;
  }

   /**
   * Get motorbikexl
   * @return motorbikexl
  **/
  @ApiModelProperty(value = "")
  public Double getMotorbikexl() {
    return motorbikexl;
  }

  public void setMotorbikexl(Double motorbikexl) {
    this.motorbikexl = motorbikexl;
  }

  public StuartSettingsTransportPrices car(Double car) {
    this.car = car;
    return this;
  }

   /**
   * Get car
   * @return car
  **/
  @ApiModelProperty(value = "")
  public Double getCar() {
    return car;
  }

  public void setCar(Double car) {
    this.car = car;
  }

  public StuartSettingsTransportPrices van(Double van) {
    this.van = van;
    return this;
  }

   /**
   * Get van
   * @return van
  **/
  @ApiModelProperty(value = "")
  public Double getVan() {
    return van;
  }

  public void setVan(Double van) {
    this.van = van;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StuartSettingsTransportPrices stuartSettingsTransportPrices = (StuartSettingsTransportPrices) o;
    return Objects.equals(this.bike, stuartSettingsTransportPrices.bike) &&
        Objects.equals(this.cargobike, stuartSettingsTransportPrices.cargobike) &&
        Objects.equals(this.cargobikexl, stuartSettingsTransportPrices.cargobikexl) &&
        Objects.equals(this.motorbike, stuartSettingsTransportPrices.motorbike) &&
        Objects.equals(this.motorbikexl, stuartSettingsTransportPrices.motorbikexl) &&
        Objects.equals(this.car, stuartSettingsTransportPrices.car) &&
        Objects.equals(this.van, stuartSettingsTransportPrices.van);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bike, cargobike, cargobikexl, motorbike, motorbikexl, car, van);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StuartSettingsTransportPrices {\n");
    
    sb.append("    bike: ").append(toIndentedString(bike)).append("\n");
    sb.append("    cargobike: ").append(toIndentedString(cargobike)).append("\n");
    sb.append("    cargobikexl: ").append(toIndentedString(cargobikexl)).append("\n");
    sb.append("    motorbike: ").append(toIndentedString(motorbike)).append("\n");
    sb.append("    motorbikexl: ").append(toIndentedString(motorbikexl)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    van: ").append(toIndentedString(van)).append("\n");
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

