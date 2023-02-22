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
import org.threeten.bp.OffsetDateTime;

/**
 * Search Criteria for Audit Logs
 */
@ApiModel(description = "Search Criteria for Audit Logs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-22T15:57:23.167Z")
public class SearchCriteria {
  @SerializedName("Limit")
  private Integer limit = null;

  @SerializedName("Page")
  private Integer page = null;

  @SerializedName("Start")
  private OffsetDateTime start = null;

  @SerializedName("End")
  private OffsetDateTime end = null;

  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("StoreGroupId")
  private Integer storeGroupId = null;

  @SerializedName("UserId")
  private Integer userId = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("CampaignId")
  private Integer campaignId = null;

  @SerializedName("UserEmail")
  private String userEmail = null;

  @SerializedName("UserName")
  private String userName = null;

  @SerializedName("VoucherCode")
  private String voucherCode = null;

  @SerializedName("EventType")
  private List<String> eventType = null;

  @SerializedName("FlipdishEventId")
  private String flipdishEventId = null;

  public SearchCriteria limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The maximum elements to return
   * @return limit
  **/
  @ApiModelProperty(value = "The maximum elements to return")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public SearchCriteria page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * The index of the page to return, starting by 1
   * @return page
  **/
  @ApiModelProperty(value = "The index of the page to return, starting by 1")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public SearchCriteria start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Start date
   * @return start
  **/
  @ApiModelProperty(value = "Start date")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public SearchCriteria end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * End date
   * @return end
  **/
  @ApiModelProperty(value = "End date")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public SearchCriteria orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Events that have Order Id
   * @return orderId
  **/
  @ApiModelProperty(value = "Events that have Order Id")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public SearchCriteria storeId(Integer storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Events that have Store Id
   * @return storeId
  **/
  @ApiModelProperty(value = "Events that have Store Id")
  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }

  public SearchCriteria storeGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
    return this;
  }

   /**
   * Events that have Store Group Id
   * @return storeGroupId
  **/
  @ApiModelProperty(value = "Events that have Store Group Id")
  public Integer getStoreGroupId() {
    return storeGroupId;
  }

  public void setStoreGroupId(Integer storeGroupId) {
    this.storeGroupId = storeGroupId;
  }

  public SearchCriteria userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Events that have User Id
   * @return userId
  **/
  @ApiModelProperty(value = "Events that have User Id")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public SearchCriteria menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * Events that have Menu Id
   * @return menuId
  **/
  @ApiModelProperty(value = "Events that have Menu Id")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public SearchCriteria campaignId(Integer campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Events that have Campaign Id
   * @return campaignId
  **/
  @ApiModelProperty(value = "Events that have Campaign Id")
  public Integer getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Integer campaignId) {
    this.campaignId = campaignId;
  }

  public SearchCriteria userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

   /**
   * Events that have User Email
   * @return userEmail
  **/
  @ApiModelProperty(value = "Events that have User Email")
  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public SearchCriteria userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Events that have User Name
   * @return userName
  **/
  @ApiModelProperty(value = "Events that have User Name")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SearchCriteria voucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
    return this;
  }

   /**
   * Events that have voucher code
   * @return voucherCode
  **/
  @ApiModelProperty(value = "Events that have voucher code")
  public String getVoucherCode() {
    return voucherCode;
  }

  public void setVoucherCode(String voucherCode) {
    this.voucherCode = voucherCode;
  }

  public SearchCriteria eventType(List<String> eventType) {
    this.eventType = eventType;
    return this;
  }

  public SearchCriteria addEventTypeItem(String eventTypeItem) {
    if (this.eventType == null) {
      this.eventType = new ArrayList<String>();
    }
    this.eventType.add(eventTypeItem);
    return this;
  }

   /**
   * Events that have event type\\s
   * @return eventType
  **/
  @ApiModelProperty(value = "Events that have event type\\s")
  public List<String> getEventType() {
    return eventType;
  }

  public void setEventType(List<String> eventType) {
    this.eventType = eventType;
  }

  public SearchCriteria flipdishEventId(String flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
    return this;
  }

   /**
   * Unique Identifier of Event, if this is specified, all other criteria are ignored.
   * @return flipdishEventId
  **/
  @ApiModelProperty(value = "Unique Identifier of Event, if this is specified, all other criteria are ignored.")
  public String getFlipdishEventId() {
    return flipdishEventId;
  }

  public void setFlipdishEventId(String flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteria searchCriteria = (SearchCriteria) o;
    return Objects.equals(this.limit, searchCriteria.limit) &&
        Objects.equals(this.page, searchCriteria.page) &&
        Objects.equals(this.start, searchCriteria.start) &&
        Objects.equals(this.end, searchCriteria.end) &&
        Objects.equals(this.orderId, searchCriteria.orderId) &&
        Objects.equals(this.storeId, searchCriteria.storeId) &&
        Objects.equals(this.storeGroupId, searchCriteria.storeGroupId) &&
        Objects.equals(this.userId, searchCriteria.userId) &&
        Objects.equals(this.menuId, searchCriteria.menuId) &&
        Objects.equals(this.campaignId, searchCriteria.campaignId) &&
        Objects.equals(this.userEmail, searchCriteria.userEmail) &&
        Objects.equals(this.userName, searchCriteria.userName) &&
        Objects.equals(this.voucherCode, searchCriteria.voucherCode) &&
        Objects.equals(this.eventType, searchCriteria.eventType) &&
        Objects.equals(this.flipdishEventId, searchCriteria.flipdishEventId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, page, start, end, orderId, storeId, storeGroupId, userId, menuId, campaignId, userEmail, userName, voucherCode, eventType, flipdishEventId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteria {\n");
    
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    storeGroupId: ").append(toIndentedString(storeGroupId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    voucherCode: ").append(toIndentedString(voucherCode)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
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

