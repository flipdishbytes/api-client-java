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
 * Job Driver
 */
@ApiModel(description = "Job Driver")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-02T11:42:55.643+01:00")
public class JobDriver {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Phone")
  private String phone = null;

  @SerializedName("PictureUrl")
  private String pictureUrl = null;

  @SerializedName("TransportType")
  private String transportType = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  public JobDriver id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id
   * @return id
  **/
  @ApiModelProperty(value = "Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public JobDriver displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display Name
   * @return displayName
  **/
  @ApiModelProperty(value = "Display Name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public JobDriver phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone
   * @return phone
  **/
  @ApiModelProperty(value = "Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public JobDriver pictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
    return this;
  }

   /**
   * Picture Url
   * @return pictureUrl
  **/
  @ApiModelProperty(value = "Picture Url")
  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public JobDriver transportType(String transportType) {
    this.transportType = transportType;
    return this;
  }

   /**
   * Transport Type
   * @return transportType
  **/
  @ApiModelProperty(value = "Transport Type")
  public String getTransportType() {
    return transportType;
  }

  public void setTransportType(String transportType) {
    this.transportType = transportType;
  }

  public JobDriver latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public JobDriver longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDriver jobDriver = (JobDriver) o;
    return Objects.equals(this.id, jobDriver.id) &&
        Objects.equals(this.displayName, jobDriver.displayName) &&
        Objects.equals(this.phone, jobDriver.phone) &&
        Objects.equals(this.pictureUrl, jobDriver.pictureUrl) &&
        Objects.equals(this.transportType, jobDriver.transportType) &&
        Objects.equals(this.latitude, jobDriver.latitude) &&
        Objects.equals(this.longitude, jobDriver.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, phone, pictureUrl, transportType, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDriver {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    pictureUrl: ").append(toIndentedString(pictureUrl)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

