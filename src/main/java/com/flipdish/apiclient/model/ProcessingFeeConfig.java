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
 * Processing fee config
 */
@ApiModel(description = "Processing fee config")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-28T10:12:52.786+01:00")
public class ProcessingFeeConfig {
  @SerializedName("StoreId")
  private Integer storeId = null;

  /**
   * Payment account type
   */
  @JsonAdapter(PaymentAccountTypeEnum.Adapter.class)
  public enum PaymentAccountTypeEnum {
    CARD("Card"),
    
    CASH("Cash"),
    
    IDEAL("Ideal"),
    
    BANCONTACT("Bancontact"),
    
    GIROPAY("Giropay"),
    
    EPS("Eps"),
    
    EMV("Emv"),
    
    PAYPAL("PayPal"),
    
    PAYGREEN("PayGreen");

    private String value;

    PaymentAccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentAccountTypeEnum fromValue(String text) {
      for (PaymentAccountTypeEnum b : PaymentAccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentAccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentAccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentAccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PaymentAccountType")
  private PaymentAccountTypeEnum paymentAccountType = null;

  @SerializedName("PercentFee")
  private Double percentFee = null;

  @SerializedName("FixedFee")
  private Double fixedFee = null;

  public ProcessingFeeConfig storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public ProcessingFeeConfig paymentAccountType(PaymentAccountTypeEnum paymentAccountType) {
    this.paymentAccountType = paymentAccountType;
    return this;
  }

   /**
   * Payment account type
   * @return paymentAccountType
  **/
  @ApiModelProperty(value = "Payment account type")
  public PaymentAccountTypeEnum getPaymentAccountType() {
    return paymentAccountType;
  }

  public void setPaymentAccountType(PaymentAccountTypeEnum paymentAccountType) {
    this.paymentAccountType = paymentAccountType;
  }

  public ProcessingFeeConfig percentFee(Double percentFee) {
    this.percentFee = percentFee;
    return this;
  }

   /**
   * Percent fee to customer, including VAT
   * @return percentFee
  **/
  @ApiModelProperty(value = "Percent fee to customer, including VAT")
  public Double getPercentFee() {
    return percentFee;
  }

  public void setPercentFee(Double percentFee) {
    this.percentFee = percentFee;
  }

  public ProcessingFeeConfig fixedFee(Double fixedFee) {
    this.fixedFee = fixedFee;
    return this;
  }

   /**
   * Fixed fee to customer, including VAT
   * @return fixedFee
  **/
  @ApiModelProperty(value = "Fixed fee to customer, including VAT")
  public Double getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(Double fixedFee) {
    this.fixedFee = fixedFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessingFeeConfig processingFeeConfig = (ProcessingFeeConfig) o;
    return Objects.equals(this.storeId, processingFeeConfig.storeId) &&
        Objects.equals(this.paymentAccountType, processingFeeConfig.paymentAccountType) &&
        Objects.equals(this.percentFee, processingFeeConfig.percentFee) &&
        Objects.equals(this.fixedFee, processingFeeConfig.fixedFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, paymentAccountType, percentFee, fixedFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessingFeeConfig {\n");
    
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    paymentAccountType: ").append(toIndentedString(paymentAccountType)).append("\n");
    sb.append("    percentFee: ").append(toIndentedString(percentFee)).append("\n");
    sb.append("    fixedFee: ").append(toIndentedString(fixedFee)).append("\n");
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

