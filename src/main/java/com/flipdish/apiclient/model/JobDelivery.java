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
import com.flipdish.apiclient.model.JobCancellation;
import com.flipdish.apiclient.model.JobDeliveryDetail;
import com.flipdish.apiclient.model.JobEta;
import com.flipdish.apiclient.model.JobProof;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Job Delivery
 */
@ApiModel(description = "Job Delivery")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-24T11:23:04.718Z")
public class JobDelivery {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("PickedAt")
  private String pickedAt = null;

  @SerializedName("DeliveredAt")
  private String deliveredAt = null;

  @SerializedName("TrackingUrl")
  private String trackingUrl = null;

  @SerializedName("ClientReference")
  private String clientReference = null;

  @SerializedName("PackageDescription")
  private String packageDescription = null;

  @SerializedName("PackageType")
  private String packageType = null;

  @SerializedName("Pickup")
  private JobDeliveryDetail pickup = null;

  @SerializedName("Dropoff")
  private JobDeliveryDetail dropoff = null;

  @SerializedName("Eta")
  private JobEta eta = null;

  @SerializedName("Cancellation")
  private JobCancellation cancellation = null;

  @SerializedName("Proof")
  private JobProof proof = null;

  public JobDelivery id(Integer id) {
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

  public JobDelivery status(String status) {
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

  public JobDelivery pickedAt(String pickedAt) {
    this.pickedAt = pickedAt;
    return this;
  }

   /**
   * Picked At
   * @return pickedAt
  **/
  @ApiModelProperty(value = "Picked At")
  public String getPickedAt() {
    return pickedAt;
  }

  public void setPickedAt(String pickedAt) {
    this.pickedAt = pickedAt;
  }

  public JobDelivery deliveredAt(String deliveredAt) {
    this.deliveredAt = deliveredAt;
    return this;
  }

   /**
   * Delivered At
   * @return deliveredAt
  **/
  @ApiModelProperty(value = "Delivered At")
  public String getDeliveredAt() {
    return deliveredAt;
  }

  public void setDeliveredAt(String deliveredAt) {
    this.deliveredAt = deliveredAt;
  }

  public JobDelivery trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * Tracking Url
   * @return trackingUrl
  **/
  @ApiModelProperty(value = "Tracking Url")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public JobDelivery clientReference(String clientReference) {
    this.clientReference = clientReference;
    return this;
  }

   /**
   * Client Reference
   * @return clientReference
  **/
  @ApiModelProperty(value = "Client Reference")
  public String getClientReference() {
    return clientReference;
  }

  public void setClientReference(String clientReference) {
    this.clientReference = clientReference;
  }

  public JobDelivery packageDescription(String packageDescription) {
    this.packageDescription = packageDescription;
    return this;
  }

   /**
   * Package Description
   * @return packageDescription
  **/
  @ApiModelProperty(value = "Package Description")
  public String getPackageDescription() {
    return packageDescription;
  }

  public void setPackageDescription(String packageDescription) {
    this.packageDescription = packageDescription;
  }

  public JobDelivery packageType(String packageType) {
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

  public JobDelivery pickup(JobDeliveryDetail pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Pickup
   * @return pickup
  **/
  @ApiModelProperty(value = "Pickup")
  public JobDeliveryDetail getPickup() {
    return pickup;
  }

  public void setPickup(JobDeliveryDetail pickup) {
    this.pickup = pickup;
  }

  public JobDelivery dropoff(JobDeliveryDetail dropoff) {
    this.dropoff = dropoff;
    return this;
  }

   /**
   * Dropoff
   * @return dropoff
  **/
  @ApiModelProperty(value = "Dropoff")
  public JobDeliveryDetail getDropoff() {
    return dropoff;
  }

  public void setDropoff(JobDeliveryDetail dropoff) {
    this.dropoff = dropoff;
  }

  public JobDelivery eta(JobEta eta) {
    this.eta = eta;
    return this;
  }

   /**
   * Eta
   * @return eta
  **/
  @ApiModelProperty(value = "Eta")
  public JobEta getEta() {
    return eta;
  }

  public void setEta(JobEta eta) {
    this.eta = eta;
  }

  public JobDelivery cancellation(JobCancellation cancellation) {
    this.cancellation = cancellation;
    return this;
  }

   /**
   * Cancellation
   * @return cancellation
  **/
  @ApiModelProperty(value = "Cancellation")
  public JobCancellation getCancellation() {
    return cancellation;
  }

  public void setCancellation(JobCancellation cancellation) {
    this.cancellation = cancellation;
  }

  public JobDelivery proof(JobProof proof) {
    this.proof = proof;
    return this;
  }

   /**
   * Proof
   * @return proof
  **/
  @ApiModelProperty(value = "Proof")
  public JobProof getProof() {
    return proof;
  }

  public void setProof(JobProof proof) {
    this.proof = proof;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDelivery jobDelivery = (JobDelivery) o;
    return Objects.equals(this.id, jobDelivery.id) &&
        Objects.equals(this.status, jobDelivery.status) &&
        Objects.equals(this.pickedAt, jobDelivery.pickedAt) &&
        Objects.equals(this.deliveredAt, jobDelivery.deliveredAt) &&
        Objects.equals(this.trackingUrl, jobDelivery.trackingUrl) &&
        Objects.equals(this.clientReference, jobDelivery.clientReference) &&
        Objects.equals(this.packageDescription, jobDelivery.packageDescription) &&
        Objects.equals(this.packageType, jobDelivery.packageType) &&
        Objects.equals(this.pickup, jobDelivery.pickup) &&
        Objects.equals(this.dropoff, jobDelivery.dropoff) &&
        Objects.equals(this.eta, jobDelivery.eta) &&
        Objects.equals(this.cancellation, jobDelivery.cancellation) &&
        Objects.equals(this.proof, jobDelivery.proof);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, pickedAt, deliveredAt, trackingUrl, clientReference, packageDescription, packageType, pickup, dropoff, eta, cancellation, proof);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDelivery {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pickedAt: ").append(toIndentedString(pickedAt)).append("\n");
    sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    clientReference: ").append(toIndentedString(clientReference)).append("\n");
    sb.append("    packageDescription: ").append(toIndentedString(packageDescription)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    dropoff: ").append(toIndentedString(dropoff)).append("\n");
    sb.append("    eta: ").append(toIndentedString(eta)).append("\n");
    sb.append("    cancellation: ").append(toIndentedString(cancellation)).append("\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
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

