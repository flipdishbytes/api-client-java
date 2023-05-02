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
 * Job Eta
 */
@ApiModel(description = "Job Eta")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-05-02T11:42:55.643+01:00")
public class JobEta {
  @SerializedName("Pickup")
  private String pickup = null;

  @SerializedName("Dropoff")
  private String dropoff = null;

  public JobEta pickup(String pickup) {
    this.pickup = pickup;
    return this;
  }

   /**
   * Pickup
   * @return pickup
  **/
  @ApiModelProperty(value = "Pickup")
  public String getPickup() {
    return pickup;
  }

  public void setPickup(String pickup) {
    this.pickup = pickup;
  }

  public JobEta dropoff(String dropoff) {
    this.dropoff = dropoff;
    return this;
  }

   /**
   * Dropoff
   * @return dropoff
  **/
  @ApiModelProperty(value = "Dropoff")
  public String getDropoff() {
    return dropoff;
  }

  public void setDropoff(String dropoff) {
    this.dropoff = dropoff;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobEta jobEta = (JobEta) o;
    return Objects.equals(this.pickup, jobEta.pickup) &&
        Objects.equals(this.dropoff, jobEta.dropoff);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pickup, dropoff);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobEta {\n");
    
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    dropoff: ").append(toIndentedString(dropoff)).append("\n");
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

