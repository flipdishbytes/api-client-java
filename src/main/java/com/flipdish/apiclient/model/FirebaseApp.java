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
 * FirebaseApp
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-11-09T09:12:39.143Z")
public class FirebaseApp {
  @SerializedName("WhitelabelId")
  private Integer whitelabelId = null;

  @SerializedName("PackageId")
  private String packageId = null;

  @SerializedName("FirebaseAppId")
  private String firebaseAppId = null;

  @SerializedName("FirebaseProjectId")
  private String firebaseProjectId = null;

  public FirebaseApp whitelabelId(Integer whitelabelId) {
    this.whitelabelId = whitelabelId;
    return this;
  }

   /**
   * Get whitelabelId
   * @return whitelabelId
  **/
  @ApiModelProperty(value = "")
  public Integer getWhitelabelId() {
    return whitelabelId;
  }

  public void setWhitelabelId(Integer whitelabelId) {
    this.whitelabelId = whitelabelId;
  }

  public FirebaseApp packageId(String packageId) {
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @ApiModelProperty(value = "")
  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public FirebaseApp firebaseAppId(String firebaseAppId) {
    this.firebaseAppId = firebaseAppId;
    return this;
  }

   /**
   * Get firebaseAppId
   * @return firebaseAppId
  **/
  @ApiModelProperty(value = "")
  public String getFirebaseAppId() {
    return firebaseAppId;
  }

  public void setFirebaseAppId(String firebaseAppId) {
    this.firebaseAppId = firebaseAppId;
  }

  public FirebaseApp firebaseProjectId(String firebaseProjectId) {
    this.firebaseProjectId = firebaseProjectId;
    return this;
  }

   /**
   * Get firebaseProjectId
   * @return firebaseProjectId
  **/
  @ApiModelProperty(value = "")
  public String getFirebaseProjectId() {
    return firebaseProjectId;
  }

  public void setFirebaseProjectId(String firebaseProjectId) {
    this.firebaseProjectId = firebaseProjectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirebaseApp firebaseApp = (FirebaseApp) o;
    return Objects.equals(this.whitelabelId, firebaseApp.whitelabelId) &&
        Objects.equals(this.packageId, firebaseApp.packageId) &&
        Objects.equals(this.firebaseAppId, firebaseApp.firebaseAppId) &&
        Objects.equals(this.firebaseProjectId, firebaseApp.firebaseProjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelabelId, packageId, firebaseAppId, firebaseProjectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirebaseApp {\n");
    
    sb.append("    whitelabelId: ").append(toIndentedString(whitelabelId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    firebaseAppId: ").append(toIndentedString(firebaseAppId)).append("\n");
    sb.append("    firebaseProjectId: ").append(toIndentedString(firebaseProjectId)).append("\n");
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

