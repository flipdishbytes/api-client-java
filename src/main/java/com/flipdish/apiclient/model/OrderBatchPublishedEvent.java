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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Order Batch Published Event
 */
@ApiModel(description = "Order Batch Published Event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class OrderBatchPublishedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("OrderBatchId")
  private Integer orderBatchId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("OrderIds")
  private List<Integer> orderIds = null;

  @SerializedName("FlipdishEventId")
  private UUID flipdishEventId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("OrgId")
  private String orgId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public OrderBatchPublishedEvent eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name
   * @return eventName
  **/
  @ApiModelProperty(value = "The event name")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public OrderBatchPublishedEvent orderBatchId(Integer orderBatchId) {
    this.orderBatchId = orderBatchId;
    return this;
  }

   /**
   * Order Batch Id
   * @return orderBatchId
  **/
  @ApiModelProperty(value = "Order Batch Id")
  public Integer getOrderBatchId() {
    return orderBatchId;
  }

  public void setOrderBatchId(Integer orderBatchId) {
    this.orderBatchId = orderBatchId;
  }

  public OrderBatchPublishedEvent storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store id the order batch belogs to
   * @return storeId
  **/
  @ApiModelProperty(value = "Store id the order batch belogs to")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public OrderBatchPublishedEvent orderIds(List<Integer> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public OrderBatchPublishedEvent addOrderIdsItem(Integer orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<Integer>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Orders&#39; ids on the batch
   * @return orderIds
  **/
  @ApiModelProperty(value = "Orders' ids on the batch")
  public List<Integer> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<Integer> orderIds) {
    this.orderIds = orderIds;
  }

  public OrderBatchPublishedEvent flipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
    return this;
  }

   /**
   * The identitfier of the event
   * @return flipdishEventId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The identitfier of the event")
  public UUID getFlipdishEventId() {
    return flipdishEventId;
  }

  public void setFlipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
  }

  public OrderBatchPublishedEvent createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The time of creation of the event
   * @return createTime
  **/
  @ApiModelProperty(value = "The time of creation of the event")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public OrderBatchPublishedEvent position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Position
   * @return position
  **/
  @ApiModelProperty(value = "Position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public OrderBatchPublishedEvent appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App id
   * @return appId
  **/
  @ApiModelProperty(value = "App id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public OrderBatchPublishedEvent orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Org id
   * @return orgId
  **/
  @ApiModelProperty(value = "Org id")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public OrderBatchPublishedEvent ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Ip Address
   * @return ipAddress
  **/
  @ApiModelProperty(value = "Ip Address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBatchPublishedEvent orderBatchPublishedEvent = (OrderBatchPublishedEvent) o;
    return Objects.equals(this.eventName, orderBatchPublishedEvent.eventName) &&
        Objects.equals(this.orderBatchId, orderBatchPublishedEvent.orderBatchId) &&
        Objects.equals(this.storeId, orderBatchPublishedEvent.storeId) &&
        Objects.equals(this.orderIds, orderBatchPublishedEvent.orderIds) &&
        Objects.equals(this.flipdishEventId, orderBatchPublishedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, orderBatchPublishedEvent.createTime) &&
        Objects.equals(this.position, orderBatchPublishedEvent.position) &&
        Objects.equals(this.appId, orderBatchPublishedEvent.appId) &&
        Objects.equals(this.orgId, orderBatchPublishedEvent.orgId) &&
        Objects.equals(this.ipAddress, orderBatchPublishedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, orderBatchId, storeId, orderIds, flipdishEventId, createTime, position, appId, orgId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBatchPublishedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    orderBatchId: ").append(toIndentedString(orderBatchId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

