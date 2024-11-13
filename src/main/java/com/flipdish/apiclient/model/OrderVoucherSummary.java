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
 * Voucher summary
 */
@ApiModel(description = "Voucher summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-11-13T12:22:11.768Z")
public class OrderVoucherSummary {
  @SerializedName("VoucherId")
  private Integer voucherId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Code")
  private String code = null;

  @SerializedName("Amount")
  private Double amount = null;

  /**
   * Voucher type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PERCENTAGEDISCOUNT("PercentageDiscount"),
    
    LUMPDISCOUNT("LumpDiscount"),
    
    ADDITEM("AddItem"),
    
    CREDITNOTE("CreditNote"),
    
    FREEDELIVERY("FreeDelivery");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  /**
   * Voucher sub type
   */
  @JsonAdapter(SubTypeEnum.Adapter.class)
  public enum SubTypeEnum {
    NONE("None"),
    
    SIGNUP("SignUp"),
    
    LOYALTY("Loyalty"),
    
    LOYALTY25("Loyalty25"),
    
    RETENTION("Retention"),
    
    SECONDARYRETENTION("SecondaryRetention"),
    
    CUSTOM("Custom");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubTypeEnum fromValue(String text) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SubType")
  private SubTypeEnum subType = null;

  public OrderVoucherSummary voucherId(Integer voucherId) {
    this.voucherId = voucherId;
    return this;
  }

   /**
   * Voucher ID
   * @return voucherId
  **/
  @ApiModelProperty(value = "Voucher ID")
  public Integer getVoucherId() {
    return voucherId;
  }

  public void setVoucherId(Integer voucherId) {
    this.voucherId = voucherId;
  }

  public OrderVoucherSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Voucher name
   * @return name
  **/
  @ApiModelProperty(value = "Voucher name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderVoucherSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Voucher description
   * @return description
  **/
  @ApiModelProperty(value = "Voucher description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderVoucherSummary code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Voucher code
   * @return code
  **/
  @ApiModelProperty(value = "Voucher code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrderVoucherSummary amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Voucher amount
   * @return amount
  **/
  @ApiModelProperty(value = "Voucher amount")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public OrderVoucherSummary type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Voucher type
   * @return type
  **/
  @ApiModelProperty(value = "Voucher type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OrderVoucherSummary subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Voucher sub type
   * @return subType
  **/
  @ApiModelProperty(value = "Voucher sub type")
  public SubTypeEnum getSubType() {
    return subType;
  }

  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherSummary orderVoucherSummary = (OrderVoucherSummary) o;
    return Objects.equals(this.voucherId, orderVoucherSummary.voucherId) &&
        Objects.equals(this.name, orderVoucherSummary.name) &&
        Objects.equals(this.description, orderVoucherSummary.description) &&
        Objects.equals(this.code, orderVoucherSummary.code) &&
        Objects.equals(this.amount, orderVoucherSummary.amount) &&
        Objects.equals(this.type, orderVoucherSummary.type) &&
        Objects.equals(this.subType, orderVoucherSummary.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherId, name, description, code, amount, type, subType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherSummary {\n");
    
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

