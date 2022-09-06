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
import com.flipdish.apiclient.model.BusinessHoursPeriod;
import com.flipdish.apiclient.model.UserEventInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * Store Opening Hours Updated Event
 */
@ApiModel(description = "Store Opening Hours Updated Event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-06T12:39:46.243+01:00")
public class StoreOpeningHoursUpdatedEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  /**
   * Type of opening hours Delivery / Pickup
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

  @SerializedName("BusinessHoursPeriodOld")
  private BusinessHoursPeriod businessHoursPeriodOld = null;

  @SerializedName("BusinessHoursPeriod")
  private BusinessHoursPeriod businessHoursPeriod = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("FlipdishEventId")
  private UUID flipdishEventId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("AppId")
  private String appId = null;

  @SerializedName("IpAddress")
  private String ipAddress = null;

  public StoreOpeningHoursUpdatedEvent eventName(String eventName) {
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

  public StoreOpeningHoursUpdatedEvent storeId(Integer storeId) {
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

  public StoreOpeningHoursUpdatedEvent storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Store group Id
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Store group Id")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public StoreOpeningHoursUpdatedEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * User which updated opening hours for this store
   * @return user
  **/
  @ApiModelProperty(value = "User which updated opening hours for this store")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public StoreOpeningHoursUpdatedEvent deliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
    return this;
  }

   /**
   * Type of opening hours Delivery / Pickup
   * @return deliveryType
  **/
  @ApiModelProperty(value = "Type of opening hours Delivery / Pickup")
  public DeliveryTypeEnum getDeliveryType() {
    return deliveryType;
  }

  public void setDeliveryType(DeliveryTypeEnum deliveryType) {
    this.deliveryType = deliveryType;
  }

  public StoreOpeningHoursUpdatedEvent businessHoursPeriodOld(BusinessHoursPeriod businessHoursPeriodOld) {
    this.businessHoursPeriodOld = businessHoursPeriodOld;
    return this;
  }

   /**
   * The period that was updated
   * @return businessHoursPeriodOld
  **/
  @ApiModelProperty(value = "The period that was updated")
  public BusinessHoursPeriod getBusinessHoursPeriodOld() {
    return businessHoursPeriodOld;
  }

  public void setBusinessHoursPeriodOld(BusinessHoursPeriod businessHoursPeriodOld) {
    this.businessHoursPeriodOld = businessHoursPeriodOld;
  }

  public StoreOpeningHoursUpdatedEvent businessHoursPeriod(BusinessHoursPeriod businessHoursPeriod) {
    this.businessHoursPeriod = businessHoursPeriod;
    return this;
  }

   /**
   * The new values of the period
   * @return businessHoursPeriod
  **/
  @ApiModelProperty(value = "The new values of the period")
  public BusinessHoursPeriod getBusinessHoursPeriod() {
    return businessHoursPeriod;
  }

  public void setBusinessHoursPeriod(BusinessHoursPeriod businessHoursPeriod) {
    this.businessHoursPeriod = businessHoursPeriod;
  }

  public StoreOpeningHoursUpdatedEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @ApiModelProperty(value = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StoreOpeningHoursUpdatedEvent flipdishEventId(UUID flipdishEventId) {
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

  public StoreOpeningHoursUpdatedEvent createTime(OffsetDateTime createTime) {
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

  public StoreOpeningHoursUpdatedEvent position(Integer position) {
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

  public StoreOpeningHoursUpdatedEvent appId(String appId) {
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

  public StoreOpeningHoursUpdatedEvent ipAddress(String ipAddress) {
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
    StoreOpeningHoursUpdatedEvent storeOpeningHoursUpdatedEvent = (StoreOpeningHoursUpdatedEvent) o;
    return Objects.equals(this.eventName, storeOpeningHoursUpdatedEvent.eventName) &&
        Objects.equals(this.storeId, storeOpeningHoursUpdatedEvent.storeId) &&
        Objects.equals(this.storeGroupId, storeOpeningHoursUpdatedEvent.storeGroupId) &&
        Objects.equals(this.user, storeOpeningHoursUpdatedEvent.user) &&
        Objects.equals(this.deliveryType, storeOpeningHoursUpdatedEvent.deliveryType) &&
        Objects.equals(this.businessHoursPeriodOld, storeOpeningHoursUpdatedEvent.businessHoursPeriodOld) &&
        Objects.equals(this.businessHoursPeriod, storeOpeningHoursUpdatedEvent.businessHoursPeriod) &&
        Objects.equals(this.description, storeOpeningHoursUpdatedEvent.description) &&
        Objects.equals(this.flipdishEventId, storeOpeningHoursUpdatedEvent.flipdishEventId) &&
        Objects.equals(this.createTime, storeOpeningHoursUpdatedEvent.createTime) &&
        Objects.equals(this.position, storeOpeningHoursUpdatedEvent.position) &&
        Objects.equals(this.appId, storeOpeningHoursUpdatedEvent.appId) &&
        Objects.equals(this.ipAddress, storeOpeningHoursUpdatedEvent.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, storeId, storeGroupId, user, deliveryType, businessHoursPeriodOld, businessHoursPeriod, description, flipdishEventId, createTime, position, appId, ipAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreOpeningHoursUpdatedEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    deliveryType: ").append(toIndentedString(deliveryType)).append("\n");
    sb.append("    businessHoursPeriodOld: ").append(toIndentedString(businessHoursPeriodOld)).append("\n");
    sb.append("    businessHoursPeriod: ").append(toIndentedString(businessHoursPeriod)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

