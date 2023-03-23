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
import com.flipdish.apiclient.model.LastPaymentError;
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
 * Represents stripe PaymentIntent
 */
@ApiModel(description = "Represents stripe PaymentIntent")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-23T12:28:13.209Z")
public class PaymentIntent {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Created")
  private OffsetDateTime created = null;

  @SerializedName("LastPaymentError")
  private LastPaymentError lastPaymentError = null;

  public PaymentIntent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of payment intent
   * @return id
  **/
  @ApiModelProperty(value = "Id of payment intent")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentIntent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   * @return description
  **/
  @ApiModelProperty(value = "An arbitrary string attached to the object. Often useful for displaying to users.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentIntent currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Three-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-4217-currency-codes.html\&quot;&gt;ISO currency  code&lt;/a&gt;, in lowercase. Must be a &lt;a href&#x3D;\&quot;https://stripe.com/docs/currencies\&quot;&gt;supported  currency&lt;/a&gt;.
   * @return currency
  **/
  @ApiModelProperty(value = "Three-letter <a href=\"https://www.iso.org/iso-4217-currency-codes.html\">ISO currency  code</a>, in lowercase. Must be a <a href=\"https://stripe.com/docs/currencies\">supported  currency</a>.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentIntent status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of this PaymentIntent, one of requires_payment_method,  requires_confirmation, requires_action, processing,  requires_capture, canceled, or succeeded. Read more about each  PaymentIntent &lt;a href&#x3D;\&quot;https://stripe.com/docs/payments/intents#intent-statuses\&quot;&gt;status&lt;/a&gt;.  One of: canceled, processing, requires_action,  requires_capture, requires_confirmation, requires_payment_method,  or succeeded.
   * @return status
  **/
  @ApiModelProperty(value = "Status of this PaymentIntent, one of requires_payment_method,  requires_confirmation, requires_action, processing,  requires_capture, canceled, or succeeded. Read more about each  PaymentIntent <a href=\"https://stripe.com/docs/payments/intents#intent-statuses\">status</a>.  One of: canceled, processing, requires_action,  requires_capture, requires_confirmation, requires_payment_method,  or succeeded.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentIntent created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   * @return created
  **/
  @ApiModelProperty(value = "Time at which the object was created. Measured in seconds since the Unix epoch.")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public PaymentIntent lastPaymentError(LastPaymentError lastPaymentError) {
    this.lastPaymentError = lastPaymentError;
    return this;
  }

   /**
   * Failed payment intent Errors
   * @return lastPaymentError
  **/
  @ApiModelProperty(value = "Failed payment intent Errors")
  public LastPaymentError getLastPaymentError() {
    return lastPaymentError;
  }

  public void setLastPaymentError(LastPaymentError lastPaymentError) {
    this.lastPaymentError = lastPaymentError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentIntent paymentIntent = (PaymentIntent) o;
    return Objects.equals(this.id, paymentIntent.id) &&
        Objects.equals(this.description, paymentIntent.description) &&
        Objects.equals(this.currency, paymentIntent.currency) &&
        Objects.equals(this.status, paymentIntent.status) &&
        Objects.equals(this.created, paymentIntent.created) &&
        Objects.equals(this.lastPaymentError, paymentIntent.lastPaymentError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, currency, status, created, lastPaymentError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentIntent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastPaymentError: ").append(toIndentedString(lastPaymentError)).append("\n");
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

