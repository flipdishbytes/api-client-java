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
import com.flipdish.apiclient.model.NextStatusWithOrderType;
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

/**
 * Fulfillment Status Item
 */
@ApiModel(description = "Fulfillment Status Item")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-03-06T15:29:18.975Z")
public class FulfillmentStatusConfigurationItem {
  @SerializedName("StatusId")
  private String statusId = null;

  @SerializedName("StatusName")
  private String statusName = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("Icon")
  private String icon = null;

  @SerializedName("PublicDescription")
  private String publicDescription = null;

  @SerializedName("Internal")
  private Boolean internal = null;

  @SerializedName("NextStatuses")
  private List<String> nextStatuses = null;

  @SerializedName("DefaultNextStatus")
  private List<NextStatusWithOrderType> defaultNextStatus = null;

  /**
   * How will state change (manually or automated, including timed)
   */
  @JsonAdapter(ChangeTypeEnum.Adapter.class)
  public enum ChangeTypeEnum {
    MANUAL("Manual"),
    
    AUTOMATED("Automated"),
    
    INTEGRATED("Integrated");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChangeTypeEnum fromValue(String text) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChangeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChangeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChangeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChangeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ChangeType")
  private ChangeTypeEnum changeType = null;

  @SerializedName("IncludeInReports")
  private Boolean includeInReports = null;

  @SerializedName("IsCustom")
  private Boolean isCustom = null;

  /**
   * Gets or Sets orderTypes
   */
  @JsonAdapter(OrderTypesEnum.Adapter.class)
  public enum OrderTypesEnum {
    ALL("All"),
    
    DELIVERY("Delivery"),
    
    COLLECTION("Collection"),
    
    DINEIN("DineIn");

    private String value;

    OrderTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderTypesEnum fromValue(String text) {
      for (OrderTypesEnum b : OrderTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OrderTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OrderTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("OrderTypes")
  private List<OrderTypesEnum> orderTypes = null;

  @SerializedName("Communication")
  private Boolean communication = null;

  @SerializedName("Image")
  private String image = null;

  public FulfillmentStatusConfigurationItem statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * Status Id (no whitespaces)
   * @return statusId
  **/
  @ApiModelProperty(value = "Status Id (no whitespaces)")
  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  public FulfillmentStatusConfigurationItem statusName(String statusName) {
    this.statusName = statusName;
    return this;
  }

   /**
   * Status name
   * @return statusName
  **/
  @ApiModelProperty(value = "Status name")
  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  public FulfillmentStatusConfigurationItem enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Is status enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "Is status enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public FulfillmentStatusConfigurationItem displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The short status string that is displayed to users in apps, portal. If empty then Order Status Name is displayed instead
   * @return displayName
  **/
  @ApiModelProperty(value = "The short status string that is displayed to users in apps, portal. If empty then Order Status Name is displayed instead")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FulfillmentStatusConfigurationItem icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Icon/Image that represents that status visual
   * @return icon
  **/
  @ApiModelProperty(value = "Icon/Image that represents that status visual")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public FulfillmentStatusConfigurationItem publicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
    return this;
  }

   /**
   * A string which could be used in notification templates with a placeholder (SMS, email, push, web page with status)
   * @return publicDescription
  **/
  @ApiModelProperty(value = "A string which could be used in notification templates with a placeholder (SMS, email, push, web page with status)")
  public String getPublicDescription() {
    return publicDescription;
  }

  public void setPublicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
  }

  public FulfillmentStatusConfigurationItem internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

   /**
   * Is internal state (internal states not shown to customers)
   * @return internal
  **/
  @ApiModelProperty(value = "Is internal state (internal states not shown to customers)")
  public Boolean isInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public FulfillmentStatusConfigurationItem nextStatuses(List<String> nextStatuses) {
    this.nextStatuses = nextStatuses;
    return this;
  }

  public FulfillmentStatusConfigurationItem addNextStatusesItem(String nextStatusesItem) {
    if (this.nextStatuses == null) {
      this.nextStatuses = new ArrayList<String>();
    }
    this.nextStatuses.add(nextStatusesItem);
    return this;
  }

   /**
   * list of statuses that this status can move to (can be back or forth)
   * @return nextStatuses
  **/
  @ApiModelProperty(value = "list of statuses that this status can move to (can be back or forth)")
  public List<String> getNextStatuses() {
    return nextStatuses;
  }

  public void setNextStatuses(List<String> nextStatuses) {
    this.nextStatuses = nextStatuses;
  }

  public FulfillmentStatusConfigurationItem defaultNextStatus(List<NextStatusWithOrderType> defaultNextStatus) {
    this.defaultNextStatus = defaultNextStatus;
    return this;
  }

  public FulfillmentStatusConfigurationItem addDefaultNextStatusItem(NextStatusWithOrderType defaultNextStatusItem) {
    if (this.defaultNextStatus == null) {
      this.defaultNextStatus = new ArrayList<NextStatusWithOrderType>();
    }
    this.defaultNextStatus.add(defaultNextStatusItem);
    return this;
  }

   /**
   * The default next status (on a dropdown or quick button on terminal or portal)
   * @return defaultNextStatus
  **/
  @ApiModelProperty(value = "The default next status (on a dropdown or quick button on terminal or portal)")
  public List<NextStatusWithOrderType> getDefaultNextStatus() {
    return defaultNextStatus;
  }

  public void setDefaultNextStatus(List<NextStatusWithOrderType> defaultNextStatus) {
    this.defaultNextStatus = defaultNextStatus;
  }

  public FulfillmentStatusConfigurationItem changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

   /**
   * How will state change (manually or automated, including timed)
   * @return changeType
  **/
  @ApiModelProperty(value = "How will state change (manually or automated, including timed)")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public FulfillmentStatusConfigurationItem includeInReports(Boolean includeInReports) {
    this.includeInReports = includeInReports;
    return this;
  }

   /**
   * Include in reports
   * @return includeInReports
  **/
  @ApiModelProperty(value = "Include in reports")
  public Boolean isIncludeInReports() {
    return includeInReports;
  }

  public void setIncludeInReports(Boolean includeInReports) {
    this.includeInReports = includeInReports;
  }

  public FulfillmentStatusConfigurationItem isCustom(Boolean isCustom) {
    this.isCustom = isCustom;
    return this;
  }

   /**
   * Is custom state. If not, then it&#39;s a system state
   * @return isCustom
  **/
  @ApiModelProperty(value = "Is custom state. If not, then it's a system state")
  public Boolean isIsCustom() {
    return isCustom;
  }

  public void setIsCustom(Boolean isCustom) {
    this.isCustom = isCustom;
  }

  public FulfillmentStatusConfigurationItem orderTypes(List<OrderTypesEnum> orderTypes) {
    this.orderTypes = orderTypes;
    return this;
  }

  public FulfillmentStatusConfigurationItem addOrderTypesItem(OrderTypesEnum orderTypesItem) {
    if (this.orderTypes == null) {
      this.orderTypes = new ArrayList<OrderTypesEnum>();
    }
    this.orderTypes.add(orderTypesItem);
    return this;
  }

   /**
   * If empty then applies to all ordertypes, otherwise a list of order types this state applies to
   * @return orderTypes
  **/
  @ApiModelProperty(value = "If empty then applies to all ordertypes, otherwise a list of order types this state applies to")
  public List<OrderTypesEnum> getOrderTypes() {
    return orderTypes;
  }

  public void setOrderTypes(List<OrderTypesEnum> orderTypes) {
    this.orderTypes = orderTypes;
  }

  public FulfillmentStatusConfigurationItem communication(Boolean communication) {
    this.communication = communication;
    return this;
  }

   /**
   * Whether state should fire off a notification to the customer
   * @return communication
  **/
  @ApiModelProperty(value = "Whether state should fire off a notification to the customer")
  public Boolean isCommunication() {
    return communication;
  }

  public void setCommunication(Boolean communication) {
    this.communication = communication;
  }

  public FulfillmentStatusConfigurationItem image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image (image filename, relative, not absolute URL)
   * @return image
  **/
  @ApiModelProperty(value = "Image (image filename, relative, not absolute URL)")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentStatusConfigurationItem fulfillmentStatusConfigurationItem = (FulfillmentStatusConfigurationItem) o;
    return Objects.equals(this.statusId, fulfillmentStatusConfigurationItem.statusId) &&
        Objects.equals(this.statusName, fulfillmentStatusConfigurationItem.statusName) &&
        Objects.equals(this.enabled, fulfillmentStatusConfigurationItem.enabled) &&
        Objects.equals(this.displayName, fulfillmentStatusConfigurationItem.displayName) &&
        Objects.equals(this.icon, fulfillmentStatusConfigurationItem.icon) &&
        Objects.equals(this.publicDescription, fulfillmentStatusConfigurationItem.publicDescription) &&
        Objects.equals(this.internal, fulfillmentStatusConfigurationItem.internal) &&
        Objects.equals(this.nextStatuses, fulfillmentStatusConfigurationItem.nextStatuses) &&
        Objects.equals(this.defaultNextStatus, fulfillmentStatusConfigurationItem.defaultNextStatus) &&
        Objects.equals(this.changeType, fulfillmentStatusConfigurationItem.changeType) &&
        Objects.equals(this.includeInReports, fulfillmentStatusConfigurationItem.includeInReports) &&
        Objects.equals(this.isCustom, fulfillmentStatusConfigurationItem.isCustom) &&
        Objects.equals(this.orderTypes, fulfillmentStatusConfigurationItem.orderTypes) &&
        Objects.equals(this.communication, fulfillmentStatusConfigurationItem.communication) &&
        Objects.equals(this.image, fulfillmentStatusConfigurationItem.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusId, statusName, enabled, displayName, icon, publicDescription, internal, nextStatuses, defaultNextStatus, changeType, includeInReports, isCustom, orderTypes, communication, image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentStatusConfigurationItem {\n");
    
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    publicDescription: ").append(toIndentedString(publicDescription)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    nextStatuses: ").append(toIndentedString(nextStatuses)).append("\n");
    sb.append("    defaultNextStatus: ").append(toIndentedString(defaultNextStatus)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    includeInReports: ").append(toIndentedString(includeInReports)).append("\n");
    sb.append("    isCustom: ").append(toIndentedString(isCustom)).append("\n");
    sb.append("    orderTypes: ").append(toIndentedString(orderTypes)).append("\n");
    sb.append("    communication: ").append(toIndentedString(communication)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

