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
import com.flipdish.apiclient.model.CoordinatesDm;
import com.flipdish.apiclient.model.OrderItemDm;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * OrderDm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-18T06:28:53.942Z")
public class OrderDm {
  @SerializedName("UserLocation")
  private CoordinatesDm userLocation = null;

  @SerializedName("RequestedDeliveryOrPickupTimeUtc")
  private OffsetDateTime requestedDeliveryOrPickupTimeUtc = null;

  @SerializedName("TipAmount")
  private Double tipAmount = null;

  @SerializedName("DeliveryLocationId")
  private Integer deliveryLocationId = null;

  @SerializedName("VoucherCode")
  private String voucherCode = null;

  @SerializedName("OrderItemVms")
  private List<OrderItemDm> orderItemVms = null;

  @SerializedName("VirtualRestaurantId")
  private Integer virtualRestaurantId = null;

  @SerializedName("PhysicalRestaurantId")
  private Integer physicalRestaurantId = null;

  /**
   * Gets or Sets deliveryType
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

  /**
   * Gets or Sets pickupLocationType
   */
  @JsonAdapter(PickupLocationTypeEnum.Adapter.class)
  public enum PickupLocationTypeEnum {
    TAKEOUT("TakeOut"),
    
    TABLESERVICE("TableService"),
    
    DINEIN("DineIn");

    private String value;

    PickupLocationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PickupLocationTypeEnum fromValue(String text) {
      for (PickupLocationTypeEnum b : PickupLocationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PickupLocationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PickupLocationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PickupLocationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PickupLocationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PickupLocationType")
  private PickupLocationTypeEnum pickupLocationType = null;

  @SerializedName("PickupLocationId")
  private Integer pickupLocationId = null;

  /**
   * Gets or Sets tableServiceCatagory
   */
  @JsonAdapter(TableServiceCatagoryEnum.Adapter.class)
  public enum TableServiceCatagoryEnum {
    GENERIC("Generic"),
    
    VILLA("Villa"),
    
    HOUSE("House"),
    
    ROOM("Room"),
    
    AREA("Area"),
    
    TABLE("Table"),
    
    PARKINGBAY("ParkingBay"),
    
    GATE("Gate"),
    
    DRIVETHROUGH("DriveThrough"),
    
    TEAM("Team");

    private String value;

    TableServiceCatagoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TableServiceCatagoryEnum fromValue(String text) {
      for (TableServiceCatagoryEnum b : TableServiceCatagoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TableServiceCatagoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TableServiceCatagoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TableServiceCatagoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TableServiceCatagoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TableServiceCatagory")
  private TableServiceCatagoryEnum tableServiceCatagory = null;

  @SerializedName("PaymentAccountId")
  private Integer paymentAccountId = null;

  @SerializedName("IsPreOrder")
  private Boolean isPreOrder = null;

  @SerializedName("IsAsapOrder")
  private Boolean isAsapOrder = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("MenuVersion")
  private Integer menuVersion = null;

  public OrderDm userLocation(CoordinatesDm userLocation) {
    this.userLocation = userLocation;
    return this;
  }

   /**
   * Get userLocation
   * @return userLocation
  **/
  @ApiModelProperty(value = "")
  public CoordinatesDm getUserLocation() {
    return userLocation;
  }

  public void setUserLocation(CoordinatesDm userLocation) {
    this.userLocation = userLocation;
  }

  public OrderDm requestedDeliveryOrPickupTimeUtc(OffsetDateTime requestedDeliveryOrPickupTimeUtc) {
    this.requestedDeliveryOrPickupTimeUtc = requestedDeliveryOrPickupTimeUtc;
    return this;
  }

   /**
   * Get requestedDeliveryOrPickupTimeUtc
   * @return requestedDeliveryOrPickupTimeUtc
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getRequestedDeliveryOrPickupTimeUtc() {
    return requestedDeliveryOrPickupTimeUtc;
  }

  public void setRequestedDeliveryOrPickupTimeUtc(OffsetDateTime requestedDeliveryOrPickupTimeUtc) {
    this.requestedDeliveryOrPickupTimeUtc = requestedDeliveryOrPickupTimeUtc;
  }

  public OrderDm tipAmount(Double tipAmount) {
    this.tipAmount = tipAmount;
    return this;
  }

   /**
   * Get tipAmount
   * @return tipAmount
  **/
  @ApiModelProperty(value = "")
  public Double getTipAmount() {
    return tipAmount;
  }

  public void setTipAmount(Double tipAmount) {
    this.tipAmount = tipAmount;
  }

  public OrderDm deliveryLocationId(Integer deliveryLocationId) {
    this.deliveryLocationId = deliveryLocationId;
    return this;
  }

   /**
   * Get deliveryLocationId
   * @return deliveryLocationId
  **/
  @ApiModelProperty(value = "")
  public Integer getDeliveryLocationId() {
    return deliveryLocationId;
  }

  public void setDeliveryLocationId(Integer deliveryLocationId) {
    this.deliveryLocationId = deliveryLocationId;
  }

  public OrderDm voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Get voucherCode
   * @return voucherCode
  **/
  @ApiModelProperty(value = "")
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

  public OrderDm orderItemVms(List<OrderItemDm> orderItemVms) {
    this.orderItemVms = orderItemVms;
    return this;
  }

  public OrderDm addOrderItemVmsItem(OrderItemDm orderItemVmsItem) {
    if (this.orderItemVms == null) {
      this.orderItemVms = new ArrayList<OrderItemDm>();
    }
    this.orderItemVms.add(orderItemVmsItem);
    return this;
  }

   /**
   * Get orderItemVms
   * @return orderItemVms
  **/
  @ApiModelProperty(value = "")
  public List<OrderItemDm> getOrderItemVms() {
    return orderItemVms;
  }

  public void setOrderItemVms(List<OrderItemDm> orderItemVms) {
    this.orderItemVms = orderItemVms;
  }

  public OrderDm virtualRestaurantId(Integer virtualRestaurantId) {
    this.virtualRestaurantId = virtualRestaurantId;
    return this;
  }

   /**
   * Get virtualRestaurantId
   * @return virtualRestaurantId
  **/
  @ApiModelProperty(value = "")
  public Integer getVirtualRestaurantId() {
    return virtualRestaurantId;
  }

  public void setVirtualRestaurantId(Integer virtualRestaurantId) {
    this.virtualRestaurantId = virtualRestaurantId;
  }

  public OrderDm physicalRestaurantId(Integer physicalRestaurantId) {
    this.physicalRestaurantId = physicalRestaurantId;
    return this;
  }

   /**
   * Get physicalRestaurantId
   * @return physicalRestaurantId
  **/
  @ApiModelProperty(value = "")
  public Integer getPhysicalRestaurantId() {
    return physicalRestaurantId;
  }

  public void setPhysicalRestaurantId(Integer physicalRestaurantId) {
    this.physicalRestaurantId = physicalRestaurantId;
  }

  public OrderDm deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Get deliveryType
   * @return deliveryType
  **/
  @ApiModelProperty(value = "")
  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public OrderDm pickupLocationType(PickupLocationTypeEnum pickupLocationType) {
    this.pickupLocationType = pickupLocationType;
    return this;
  }

   /**
   * Get pickupLocationType
   * @return pickupLocationType
  **/
  @ApiModelProperty(value = "")
  public PickupLocationTypeEnum getPickupLocationType() {
    return pickupLocationType;
  }

  public void setPickupLocationType(PickupLocationTypeEnum pickupLocationType) {
    this.pickupLocationType = pickupLocationType;
  }

  public OrderDm pickupLocationId(Integer pickupLocationId) {
    this.pickupLocationId = pickupLocationId;
    return this;
  }

   /**
   * Get pickupLocationId
   * @return pickupLocationId
  **/
  @ApiModelProperty(value = "")
  public Integer getPickupLocationId() {
    return pickupLocationId;
  }

  public void setPickupLocationId(Integer pickupLocationId) {
    this.pickupLocationId = pickupLocationId;
  }

  public OrderDm tableServiceCatagory(TableServiceCatagoryEnum tableServiceCatagory) {
    this.tableServiceCatagory = tableServiceCatagory;
    return this;
  }

   /**
   * Get tableServiceCatagory
   * @return tableServiceCatagory
  **/
  @ApiModelProperty(value = "")
  public TableServiceCatagoryEnum getTableServiceCatagory() {
    return tableServiceCatagory;
  }

  public void setTableServiceCatagory(TableServiceCatagoryEnum tableServiceCatagory) {
    this.tableServiceCatagory = tableServiceCatagory;
  }

  public OrderDm paymentAccountId(Integer paymentAccountId) {
    this.paymentAccountId = paymentAccountId;
    return this;
  }

   /**
   * Get paymentAccountId
   * @return paymentAccountId
  **/
  @ApiModelProperty(value = "")
  public Integer getPaymentAccountId() {
    return paymentAccountId;
  }

  public void setPaymentAccountId(Integer paymentAccountId) {
    this.paymentAccountId = paymentAccountId;
  }

   /**
   * Get isPreOrder
   * @return isPreOrder
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsPreOrder() {
    return isPreOrder;
  }

  public OrderDm isAsapOrder(Boolean isAsapOrder) {
    this.isAsapOrder = isAsapOrder;
    return this;
  }

   /**
   * Get isAsapOrder
   * @return isAsapOrder
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsAsapOrder() {
    return isAsapOrder;
  }

  public void setIsAsapOrder(Boolean isAsapOrder) {
    this.isAsapOrder = isAsapOrder;
  }

  public OrderDm menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Get menuId
   * @return menuId
  **/
  @ApiModelProperty(value = "")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public OrderDm menuVersion(Integer menuVersion) {
    this.menuVersion = menuVersion;
    return this;
  }

   /**
   * Get menuVersion
   * @return menuVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getMenuVersion() {
    return menuVersion;
  }

  public void setMenuVersion(Integer menuVersion) {
    this.menuVersion = menuVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDm orderDm = (OrderDm) o;
    return Objects.equals(this.userLocation, orderDm.userLocation) &&
        Objects.equals(this.requestedDeliveryOrPickupTimeUtc, orderDm.requestedDeliveryOrPickupTimeUtc) &&
        Objects.equals(this.tipAmount, orderDm.tipAmount) &&
        Objects.equals(this.deliveryLocationId, orderDm.deliveryLocationId) &&
        Objects.equals(this.voucherCode, orderDm.voucherCode) &&
        Objects.equals(this.orderItemVms, orderDm.orderItemVms) &&
        Objects.equals(this.virtualRestaurantId, orderDm.virtualRestaurantId) &&
        Objects.equals(this.physicalRestaurantId, orderDm.physicalRestaurantId) &&
        Objects.equals(this.deliveryType, orderDm.deliveryType) &&
        Objects.equals(this.pickupLocationType, orderDm.pickupLocationType) &&
        Objects.equals(this.pickupLocationId, orderDm.pickupLocationId) &&
        Objects.equals(this.tableServiceCatagory, orderDm.tableServiceCatagory) &&
        Objects.equals(this.paymentAccountId, orderDm.paymentAccountId) &&
        Objects.equals(this.isPreOrder, orderDm.isPreOrder) &&
        Objects.equals(this.isAsapOrder, orderDm.isAsapOrder) &&
        Objects.equals(this.menuId, orderDm.menuId) &&
        Objects.equals(this.menuVersion, orderDm.menuVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userLocation, requestedDeliveryOrPickupTimeUtc, tipAmount, deliveryLocationId, voucherCode, orderItemVms, virtualRestaurantId, physicalRestaurantId, deliveryType, pickupLocationType, pickupLocationId, tableServiceCatagory, paymentAccountId, isPreOrder, isAsapOrder, menuId, menuVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDm {\n");
    
    sb.append("    userLocation: ").append(toIndentedString(userLocation)).append("\n");
    sb.append("    requestedDeliveryOrPickupTimeUtc: ").append(toIndentedString(requestedDeliveryOrPickupTimeUtc)).append("\n");
    sb.append("    tipAmount: ").append(toIndentedString(tipAmount)).append("\n");
    sb.append("    deliveryLocationId: ").append(toIndentedString(deliveryLocationId)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    orderItemVms: ").append(toIndentedString(orderItemVms)).append("\n");
    sb.append("    virtualRestaurantId: ").append(toIndentedString(virtualRestaurantId)).append("\n");
    sb.append("    physicalRestaurantId: ").append(toIndentedString(physicalRestaurantId)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    pickupLocationType: ").append(toIndentedString(pickupLocationType)).append("\n");
    sb.append("    pickupLocationId: ").append(toIndentedString(pickupLocationId)).append("\n");
    sb.append("    tableServiceCatagory: ").append(toIndentedString(tableServiceCatagory)).append("\n");
    sb.append("    paymentAccountId: ").append(toIndentedString(paymentAccountId)).append("\n");
    sb.append("    isPreOrder: ").append(toIndentedString(isPreOrder)).append("\n");
    sb.append("    isAsapOrder: ").append(toIndentedString(isAsapOrder)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    menuVersion: ").append(toIndentedString(menuVersion)).append("\n");
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

