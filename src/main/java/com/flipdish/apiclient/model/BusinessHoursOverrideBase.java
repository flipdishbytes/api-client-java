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
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-04T11:36:58.526Z")
public class BusinessHoursOverrideBase {
  /**
   * Delivery or Pickup
   */
  @JsonAdapter(DeliveryTypeEnum.Adapter.class)
  public enum DeliveryTypeEnum {
    DELIVERY("Delivery"),
    
    PICKUP("Pickup");

    private String value;

    DeliveryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryTypeEnum fromValue(String text) {
      for (DeliveryTypeEnum b : DeliveryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeliveryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeliveryType")
  private DeliveryTypeEnum deliveryType = null;

  @SerializedName("StartTime")
  private OffsetDateTime startTime = null;

  @SerializedName("EndTime")
  private OffsetDateTime endTime = null;

  /**
   * Open, Closed or ClosedAllowPreOrders
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    OPEN("Open"),
    
    CLOSED("Closed"),
    
    CLOSEDALLOWPREORDERS("ClosedAllowPreOrders");

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

  public BusinessHoursOverrideBase deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Delivery or Pickup
   * @return deliveryType
  **/
  @ApiModelProperty(value = "Delivery or Pickup")
  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public BusinessHoursOverrideBase startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Date and time in ISO 8601 format.
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Date and time in ISO 8601 format.")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public BusinessHoursOverrideBase endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Date and time in ISO 8601 format.
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "Date and time in ISO 8601 format.")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public BusinessHoursOverrideBase type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Open, Closed or ClosedAllowPreOrders
   * @return type
  **/
  @ApiModelProperty(value = "Open, Closed or ClosedAllowPreOrders")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessHoursOverrideBase businessHoursOverrideBase = (BusinessHoursOverrideBase) o;
    return Objects.equals(this.deliveryType, businessHoursOverrideBase.deliveryType) &&
        Objects.equals(this.startTime, businessHoursOverrideBase.startTime) &&
        Objects.equals(this.endTime, businessHoursOverrideBase.endTime) &&
        Objects.equals(this.type, businessHoursOverrideBase.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryType, startTime, endTime, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessHoursOverrideBase {\n");
    
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

