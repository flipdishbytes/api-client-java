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
import com.flipdish.apiclient.model.JobAddress;
import com.flipdish.apiclient.model.JobContact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Job Delivery Detail
 */
@ApiModel(description = "Job Delivery Detail")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-17T06:46:32.991Z")
public class JobDeliveryDetail {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Latitude")
  private Double latitude = null;

  @SerializedName("Longitude")
  private Double longitude = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Address")
  private JobAddress address = null;

  @SerializedName("Contact")
  private JobContact contact = null;

  public JobDeliveryDetail id(Integer id) {
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

  public JobDeliveryDetail latitude(Double latitude) {
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

  public JobDeliveryDetail longitude(Double longitude) {
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

  public JobDeliveryDetail comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment
   * @return comment
  **/
  @ApiModelProperty(value = "Comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public JobDeliveryDetail address(JobAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Address
   * @return address
  **/
  @ApiModelProperty(value = "Address")
  public JobAddress getAddress() {
    return address;
  }

  public void setAddress(JobAddress address) {
    this.address = address;
  }

  public JobDeliveryDetail contact(JobContact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact
   * @return contact
  **/
  @ApiModelProperty(value = "Contact")
  public JobContact getContact() {
    return contact;
  }

  public void setContact(JobContact contact) {
    this.contact = contact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDeliveryDetail jobDeliveryDetail = (JobDeliveryDetail) o;
    return Objects.equals(this.id, jobDeliveryDetail.id) &&
        Objects.equals(this.latitude, jobDeliveryDetail.latitude) &&
        Objects.equals(this.longitude, jobDeliveryDetail.longitude) &&
        Objects.equals(this.comment, jobDeliveryDetail.comment) &&
        Objects.equals(this.address, jobDeliveryDetail.address) &&
        Objects.equals(this.contact, jobDeliveryDetail.contact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latitude, longitude, comment, address, contact);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDeliveryDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

