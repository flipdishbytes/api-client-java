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
 * Stripe Terminal Private Key
 */
@ApiModel(description = "Stripe Terminal Private Key")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-17T14:30:37.663+01:00")
public class StripeTerminalPrivateKey {
  @SerializedName("Location")
  private String location = null;

  @SerializedName("Secret")
  private String secret = null;

  public StripeTerminalPrivateKey location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Registered location of the terminal
   * @return location
  **/
  @ApiModelProperty(value = "Registered location of the terminal")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public StripeTerminalPrivateKey secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Secret used to pass to stripe to attach terminal
   * @return secret
  **/
  @ApiModelProperty(value = "Secret used to pass to stripe to attach terminal")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeTerminalPrivateKey stripeTerminalPrivateKey = (StripeTerminalPrivateKey) o;
    return Objects.equals(this.location, stripeTerminalPrivateKey.location) &&
        Objects.equals(this.secret, stripeTerminalPrivateKey.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeTerminalPrivateKey {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

