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
import com.flipdish.apiclient.model.JobDelivery;
import com.flipdish.apiclient.model.JobDriver;
import com.flipdish.apiclient.model.JobPricing;
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
import org.threeten.bp.OffsetDateTime;

/**
 * Job Response
 */
@ApiModel(description = "Job Response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class JobResponse {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("CreatedAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("PackageType")
  private String packageType = null;

  @SerializedName("TransportType")
  private String transportType = null;

  @SerializedName("AssignmentCode")
  private String assignmentCode = null;

  @SerializedName("PickupAt")
  private String pickupAt = null;

  @SerializedName("DropoffAt")
  private String dropoffAt = null;

  @SerializedName("Comment")
  private String comment = null;

  @SerializedName("Distance")
  private Double distance = null;

  @SerializedName("Duration")
  private Integer duration = null;

  @SerializedName("Deliveries")
  private List<JobDelivery> deliveries = null;

  @SerializedName("Pricing")
  private JobPricing pricing = null;

  @SerializedName("Driver")
  private JobDriver driver = null;

  public JobResponse id(Integer id) {
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

  public JobResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Created At
   * @return createdAt
  **/
  @ApiModelProperty(value = "Created At")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public JobResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(value = "Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public JobResponse packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

   /**
   * Package Type
   * @return packageType
  **/
  @ApiModelProperty(value = "Package Type")
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public JobResponse transportType(String transportType) {
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

  public JobResponse assignmentCode(String assignmentCode) {
    this.assignmentCode = assignmentCode;
    return this;
  }

   /**
   * Assignment Code
   * @return assignmentCode
  **/
  @ApiModelProperty(value = "Assignment Code")
  public String getAssignmentCode() {
    return assignmentCode;
  }

  public void setAssignmentCode(String assignmentCode) {
    this.assignmentCode = assignmentCode;
  }

  public JobResponse pickupAt(String pickupAt) {
    this.pickupAt = pickupAt;
    return this;
  }

   /**
   * Pickup At
   * @return pickupAt
  **/
  @ApiModelProperty(value = "Pickup At")
  public String getPickupAt() {
    return pickupAt;
  }

  public void setPickupAt(String pickupAt) {
    this.pickupAt = pickupAt;
  }

  public JobResponse dropoffAt(String dropoffAt) {
    this.dropoffAt = dropoffAt;
    return this;
  }

   /**
   * Dropoff At
   * @return dropoffAt
  **/
  @ApiModelProperty(value = "Dropoff At")
  public String getDropoffAt() {
    return dropoffAt;
  }

  public void setDropoffAt(String dropoffAt) {
    this.dropoffAt = dropoffAt;
  }

  public JobResponse comment(String comment) {
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

  public JobResponse distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Distance
   * @return distance
  **/
  @ApiModelProperty(value = "Distance")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public JobResponse duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration
   * @return duration
  **/
  @ApiModelProperty(value = "Duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public JobResponse deliveries(List<JobDelivery> deliveries) {
    this.deliveries = deliveries;
    return this;
  }

  public JobResponse addDeliveriesItem(JobDelivery deliveriesItem) {
    if (this.deliveries == null) {
      this.deliveries = new ArrayList<JobDelivery>();
    }
    this.deliveries.add(deliveriesItem);
    return this;
  }

   /**
   * Deliveries
   * @return deliveries
  **/
  @ApiModelProperty(value = "Deliveries")
  public List<JobDelivery> getDeliveries() {
    return deliveries;
  }

  public void setDeliveries(List<JobDelivery> deliveries) {
    this.deliveries = deliveries;
  }

  public JobResponse pricing(JobPricing pricing) {
    this.pricing = pricing;
    return this;
  }

   /**
   * Pricing
   * @return pricing
  **/
  @ApiModelProperty(value = "Pricing")
  public JobPricing getPricing() {
    return pricing;
  }

  public void setPricing(JobPricing pricing) {
    this.pricing = pricing;
  }

  public JobResponse driver(JobDriver driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Driver
   * @return driver
  **/
  @ApiModelProperty(value = "Driver")
  public JobDriver getDriver() {
    return driver;
  }

  public void setDriver(JobDriver driver) {
    this.driver = driver;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.id, jobResponse.id) &&
        Objects.equals(this.createdAt, jobResponse.createdAt) &&
        Objects.equals(this.status, jobResponse.status) &&
        Objects.equals(this.packageType, jobResponse.packageType) &&
        Objects.equals(this.transportType, jobResponse.transportType) &&
        Objects.equals(this.assignmentCode, jobResponse.assignmentCode) &&
        Objects.equals(this.pickupAt, jobResponse.pickupAt) &&
        Objects.equals(this.dropoffAt, jobResponse.dropoffAt) &&
        Objects.equals(this.comment, jobResponse.comment) &&
        Objects.equals(this.distance, jobResponse.distance) &&
        Objects.equals(this.duration, jobResponse.duration) &&
        Objects.equals(this.deliveries, jobResponse.deliveries) &&
        Objects.equals(this.pricing, jobResponse.pricing) &&
        Objects.equals(this.driver, jobResponse.driver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, packageType, transportType, assignmentCode, pickupAt, dropoffAt, comment, distance, duration, deliveries, pricing, driver);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    transportType: ").append(toIndentedString(transportType)).append("\n");
    sb.append("    assignmentCode: ").append(toIndentedString(assignmentCode)).append("\n");
    sb.append("    pickupAt: ").append(toIndentedString(pickupAt)).append("\n");
    sb.append("    dropoffAt: ").append(toIndentedString(dropoffAt)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    deliveries: ").append(toIndentedString(deliveries)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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
