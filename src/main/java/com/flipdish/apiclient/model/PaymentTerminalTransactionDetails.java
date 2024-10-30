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
 * Details of Payment Terminal Transaction
 */
@ApiModel(description = "Details of Payment Terminal Transaction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-30T09:32:52.002Z")
public class PaymentTerminalTransactionDetails {
  @SerializedName("CardSchemeName")
  private String cardSchemeName = null;

  @SerializedName("DateOfExpiry")
  private String dateOfExpiry = null;

  @SerializedName("AuthCode")
  private String authCode = null;

  @SerializedName("TransactionResult")
  private String transactionResult = null;

  @SerializedName("PrimaryAccountNumber")
  private String primaryAccountNumber = null;

  @SerializedName("CardholderVerificationMethod")
  private String cardholderVerificationMethod = null;

  public PaymentTerminalTransactionDetails cardSchemeName(String cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
    return this;
  }

   /**
   * Card Type
   * @return cardSchemeName
  **/
  @ApiModelProperty(value = "Card Type")
  public String getCardSchemeName() {
    return cardSchemeName;
  }

  public void setCardSchemeName(String cardSchemeName) {
    this.cardSchemeName = cardSchemeName;
  }

  public PaymentTerminalTransactionDetails dateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
    return this;
  }

   /**
   * Expirey Date on Card
   * @return dateOfExpiry
  **/
  @ApiModelProperty(value = "Expirey Date on Card")
  public String getDateOfExpiry() {
    return dateOfExpiry;
  }

  public void setDateOfExpiry(String dateOfExpiry) {
    this.dateOfExpiry = dateOfExpiry;
  }

  public PaymentTerminalTransactionDetails authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * AuthCode
   * @return authCode
  **/
  @ApiModelProperty(value = "AuthCode")
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }

  public PaymentTerminalTransactionDetails transactionResult(String transactionResult) {
    this.transactionResult = transactionResult;
    return this;
  }

   /**
   * State of Request, \&quot;PENDING\&quot; is not yet completed
   * @return transactionResult
  **/
  @ApiModelProperty(value = "State of Request, \"PENDING\" is not yet completed")
  public String getTransactionResult() {
    return transactionResult;
  }

  public void setTransactionResult(String transactionResult) {
    this.transactionResult = transactionResult;
  }

  public PaymentTerminalTransactionDetails primaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
    return this;
  }

   /**
   * Masked PAN
   * @return primaryAccountNumber
  **/
  @ApiModelProperty(value = "Masked PAN")
  public String getPrimaryAccountNumber() {
    return primaryAccountNumber;
  }

  public void setPrimaryAccountNumber(String primaryAccountNumber) {
    this.primaryAccountNumber = primaryAccountNumber;
  }

  public PaymentTerminalTransactionDetails cardholderVerificationMethod(String cardholderVerificationMethod) {
    this.cardholderVerificationMethod = cardholderVerificationMethod;
    return this;
  }

   /**
   * Type of Verification.
   * @return cardholderVerificationMethod
  **/
  @ApiModelProperty(value = "Type of Verification.")
  public String getCardholderVerificationMethod() {
    return cardholderVerificationMethod;
  }

  public void setCardholderVerificationMethod(String cardholderVerificationMethod) {
    this.cardholderVerificationMethod = cardholderVerificationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTerminalTransactionDetails paymentTerminalTransactionDetails = (PaymentTerminalTransactionDetails) o;
    return Objects.equals(this.cardSchemeName, paymentTerminalTransactionDetails.cardSchemeName) &&
        Objects.equals(this.dateOfExpiry, paymentTerminalTransactionDetails.dateOfExpiry) &&
        Objects.equals(this.authCode, paymentTerminalTransactionDetails.authCode) &&
        Objects.equals(this.transactionResult, paymentTerminalTransactionDetails.transactionResult) &&
        Objects.equals(this.primaryAccountNumber, paymentTerminalTransactionDetails.primaryAccountNumber) &&
        Objects.equals(this.cardholderVerificationMethod, paymentTerminalTransactionDetails.cardholderVerificationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardSchemeName, dateOfExpiry, authCode, transactionResult, primaryAccountNumber, cardholderVerificationMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTerminalTransactionDetails {\n");
    
    sb.append("    cardSchemeName: ").append(toIndentedString(cardSchemeName)).append("\n");
    sb.append("    dateOfExpiry: ").append(toIndentedString(dateOfExpiry)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    transactionResult: ").append(toIndentedString(transactionResult)).append("\n");
    sb.append("    primaryAccountNumber: ").append(toIndentedString(primaryAccountNumber)).append("\n");
    sb.append("    cardholderVerificationMethod: ").append(toIndentedString(cardholderVerificationMethod)).append("\n");
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

