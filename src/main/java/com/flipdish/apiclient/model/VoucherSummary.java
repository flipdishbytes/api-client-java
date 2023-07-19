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
 * Voucher Summary
 */
@ApiModel(description = "Voucher Summary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-19T09:55:22.769+01:00")
public class VoucherSummary {
  @SerializedName("VoucherId")
  private Integer voucherId = null;

  @SerializedName("Code")
  private String code = null;

  /**
   * Voucher Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALID("Valid"),
    
    NOTYETVALID("NotYetValid"),
    
    EXPIRED("Expired"),
    
    USED("Used"),
    
    DISABLED("Disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Status")
  private StatusEnum status = null;

  /**
   * Voucher Type
   */
  @JsonAdapter(VoucherTypeEnum.Adapter.class)
  public enum VoucherTypeEnum {
    PERCENTAGEDISCOUNT("PercentageDiscount"),
    
    LUMPDISCOUNT("LumpDiscount"),
    
    ADDITEM("AddItem"),
    
    CREDITNOTE("CreditNote");

    private String value;

    VoucherTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoucherTypeEnum fromValue(String text) {
      for (VoucherTypeEnum b : VoucherTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VoucherTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoucherTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoucherTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VoucherTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VoucherType")
  private VoucherTypeEnum voucherType = null;

  /**
   * Voucher Sub Type
   */
  @JsonAdapter(VoucherSubTypeEnum.Adapter.class)
  public enum VoucherSubTypeEnum {
    NONE("None"),
    
    SIGNUP("SignUp"),
    
    LOYALTY("Loyalty"),
    
    LOYALTY25("Loyalty25"),
    
    RETENTION("Retention"),
    
    SECONDARYRETENTION("SecondaryRetention"),
    
    CUSTOM("Custom");

    private String value;

    VoucherSubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VoucherSubTypeEnum fromValue(String text) {
      for (VoucherSubTypeEnum b : VoucherSubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VoucherSubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VoucherSubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VoucherSubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VoucherSubTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("VoucherSubType")
  private VoucherSubTypeEnum voucherSubType = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  public VoucherSummary voucherId(Integer voucherId) {
    this.voucherId = voucherId;
    return this;
  }

   /**
   * Voucher Id
   * @return voucherId
  **/
  @ApiModelProperty(value = "Voucher Id")
  public Integer getVoucherId() {
    return voucherId;
  }

  public void setVoucherId(Integer voucherId) {
    this.voucherId = voucherId;
  }

  public VoucherSummary code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Voucher Code
   * @return code
  **/
  @ApiModelProperty(value = "Voucher Code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public VoucherSummary status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Voucher Status
   * @return status
  **/
  @ApiModelProperty(value = "Voucher Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public VoucherSummary voucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
    return this;
  }

   /**
   * Voucher Type
   * @return voucherType
  **/
  @ApiModelProperty(value = "Voucher Type")
  public VoucherTypeEnum getVoucherType() {
    return voucherType;
  }

  public void setVoucherType(VoucherTypeEnum voucherType) {
    this.voucherType = voucherType;
  }

  public VoucherSummary voucherSubType(VoucherSubTypeEnum voucherSubType) {
    this.voucherSubType = voucherSubType;
    return this;
  }

   /**
   * Voucher Sub Type
   * @return voucherSubType
  **/
  @ApiModelProperty(value = "Voucher Sub Type")
  public VoucherSubTypeEnum getVoucherSubType() {
    return voucherSubType;
  }

  public void setVoucherSubType(VoucherSubTypeEnum voucherSubType) {
    this.voucherSubType = voucherSubType;
  }

  public VoucherSummary description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Voucher Description (Visible on printout)
   * @return description
  **/
  @ApiModelProperty(value = "Voucher Description (Visible on printout)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VoucherSummary isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Is voucher enabled
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Is voucher enabled")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSummary voucherSummary = (VoucherSummary) o;
    return Objects.equals(this.voucherId, voucherSummary.voucherId) &&
        Objects.equals(this.code, voucherSummary.code) &&
        Objects.equals(this.status, voucherSummary.status) &&
        Objects.equals(this.voucherType, voucherSummary.voucherType) &&
        Objects.equals(this.voucherSubType, voucherSummary.voucherSubType) &&
        Objects.equals(this.description, voucherSummary.description) &&
        Objects.equals(this.isEnabled, voucherSummary.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherId, code, status, voucherType, voucherSubType, description, isEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSummary {\n");
    
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    voucherSubType: ").append(toIndentedString(voucherSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
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

