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
import com.flipdish.apiclient.model.Location;
import com.flipdish.apiclient.model.Price;
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
 * Fulfillment information (required for all orders)
 */
@ApiModel(description = "Fulfillment information (required for all orders)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-14T11:12:33.159Z")
public class FulfillmentInfo {
  /**
   * [Required] Dispatch Type (i.e Pickup / Delivery)
   */
  @JsonAdapter(DispatchTypeEnum.Adapter.class)
  public enum DispatchTypeEnum {
    DELIVERY("Delivery"),
    
    PICKUP("Pickup");

    private String value;

    DispatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DispatchTypeEnum fromValue(String text) {
      for (DispatchTypeEnum b : DispatchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DispatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DispatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DispatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DispatchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DispatchType")
  private DispatchTypeEnum dispatchType = null;

  @SerializedName("RequestedForUtc")
  private OffsetDateTime requestedForUtc = null;

  @SerializedName("Location")
  private Location location = null;

  @SerializedName("DispatchAmount")
  private Price dispatchAmount = null;

  public FulfillmentInfo dispatchType(DispatchTypeEnum dispatchType) {
    this.dispatchType = dispatchType;
    return this;
  }

   /**
   * [Required] Dispatch Type (i.e Pickup / Delivery)
   * @return dispatchType
  **/
  @ApiModelProperty(value = "[Required] Dispatch Type (i.e Pickup / Delivery)")
  public DispatchTypeEnum getDispatchType() {
    return dispatchType;
  }

  public void setDispatchType(DispatchTypeEnum dispatchType) {
    this.dispatchType = dispatchType;
  }

  public FulfillmentInfo requestedForUtc(OffsetDateTime requestedForUtc) {
    this.requestedForUtc = requestedForUtc;
    return this;
  }

   /**
   * [Required] Time the order is requested for
   * @return requestedForUtc
  **/
  @ApiModelProperty(value = "[Required] Time the order is requested for")
  public OffsetDateTime getRequestedForUtc() {
    return requestedForUtc;
  }

  public void setRequestedForUtc(OffsetDateTime requestedForUtc) {
    this.requestedForUtc = requestedForUtc;
  }

  public FulfillmentInfo location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Location the order is to be delivered to  [Required] Delivery  [Not Required] Pickup
   * @return location
  **/
  @ApiModelProperty(value = "Location the order is to be delivered to  [Required] Delivery  [Not Required] Pickup")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public FulfillmentInfo dispatchAmount(Price dispatchAmount) {
    this.dispatchAmount = dispatchAmount;
    return this;
  }

   /**
   * Price of the dispatch, normally 0 for collection and a value for delivery  [Required] Delivery  [Not Required] Pickup
   * @return dispatchAmount
  **/
  @ApiModelProperty(value = "Price of the dispatch, normally 0 for collection and a value for delivery  [Required] Delivery  [Not Required] Pickup")
  public Price getDispatchAmount() {
    return dispatchAmount;
  }

  public void setDispatchAmount(Price dispatchAmount) {
    this.dispatchAmount = dispatchAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentInfo fulfillmentInfo = (FulfillmentInfo) o;
    return Objects.equals(this.dispatchType, fulfillmentInfo.dispatchType) &&
        Objects.equals(this.requestedForUtc, fulfillmentInfo.requestedForUtc) &&
        Objects.equals(this.location, fulfillmentInfo.location) &&
        Objects.equals(this.dispatchAmount, fulfillmentInfo.dispatchAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchType, requestedForUtc, location, dispatchAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentInfo {\n");
    
    sb.append("    dispatchType: ").append(toIndentedString(dispatchType)).append("\n");
    sb.append("    requestedForUtc: ").append(toIndentedString(requestedForUtc)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    dispatchAmount: ").append(toIndentedString(dispatchAmount)).append("\n");
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

