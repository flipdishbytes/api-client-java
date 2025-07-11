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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ligthspeed store settings
 */
@ApiModel(description = "Ligthspeed store settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class LightspeedSettings {
  @SerializedName("CompanyId")
  private String companyId = null;

  @SerializedName("UseOAuth")
  private Boolean useOAuth = null;

  @SerializedName("Enabled")
  private Boolean enabled = null;

  @SerializedName("EstimatedMinutesForDelivery")
  private Integer estimatedMinutesForDelivery = null;

  @SerializedName("EstimatedMinutesForCollection")
  private Integer estimatedMinutesForCollection = null;

  @SerializedName("GeographicLocation")
  private String geographicLocation = null;

  @SerializedName("Establishment")
  private Boolean establishment = null;

  @SerializedName("VoucherId")
  private String voucherId = null;

  @SerializedName("DeliveryFeeId")
  private String deliveryFeeId = null;

  @SerializedName("ProcessingFeeId")
  private String processingFeeId = null;

  /**
   * Which price to choose from Lightspeed menu
   */
  @JsonAdapter(PriceTypeEnum.Adapter.class)
  public enum PriceTypeEnum {
    DEFAULT("Default"),
    
    TAKEAWAY("Takeaway"),
    
    DELIVERY("Delivery");

    private String value;

    PriceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriceTypeEnum fromValue(String text) {
      for (PriceTypeEnum b : PriceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PriceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PriceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PriceType")
  private PriceTypeEnum priceType = null;

  @SerializedName("MenuId")
  private Integer menuId = null;

  @SerializedName("CollectionTableId")
  private Integer collectionTableId = null;

  @SerializedName("DeliveryTableId")
  private Integer deliveryTableId = null;

  @SerializedName("CollectionTableIds")
  private Map<String, String> collectionTableIds = null;

  @SerializedName("DeliveryTableIds")
  private Map<String, String> deliveryTableIds = null;

  @SerializedName("UseTaxInclusivePrices")
  private Boolean useTaxInclusivePrices = null;

  @SerializedName("SkipStatusCheckAndAcceptOrderAfterSending")
  private Boolean skipStatusCheckAndAcceptOrderAfterSending = null;

  @SerializedName("SendTableNumberToTableId")
  private Boolean sendTableNumberToTableId = null;

  @SerializedName("AddChefNoteToProduct")
  private Boolean addChefNoteToProduct = null;

  @SerializedName("ChefNoteItemId")
  private String chefNoteItemId = null;

  @SerializedName("ChefNoteModifierId")
  private String chefNoteModifierId = null;

  @SerializedName("ServiceChargeId")
  private String serviceChargeId = null;

  public LightspeedSettings companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * Company Id
   * @return companyId
  **/
  @ApiModelProperty(value = "Company Id")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public LightspeedSettings useOAuth(Boolean useOAuth) {
    this.useOAuth = useOAuth;
    return this;
  }

   /**
   * Use OAuth for authentication
   * @return useOAuth
  **/
  @ApiModelProperty(value = "Use OAuth for authentication")
  public Boolean isUseOAuth() {
    return useOAuth;
  }

  public void setUseOAuth(Boolean useOAuth) {
    this.useOAuth = useOAuth;
  }

  public LightspeedSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "Enabled")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public LightspeedSettings estimatedMinutesForDelivery(Integer estimatedMinutesForDelivery) {
    this.estimatedMinutesForDelivery = estimatedMinutesForDelivery;
    return this;
  }

   /**
   * Estimated minutes for delivery
   * @return estimatedMinutesForDelivery
  **/
  @ApiModelProperty(value = "Estimated minutes for delivery")
  public Integer getEstimatedMinutesForDelivery() {
    return estimatedMinutesForDelivery;
  }

  public void setEstimatedMinutesForDelivery(Integer estimatedMinutesForDelivery) {
    this.estimatedMinutesForDelivery = estimatedMinutesForDelivery;
  }

  public LightspeedSettings estimatedMinutesForCollection(Integer estimatedMinutesForCollection) {
    this.estimatedMinutesForCollection = estimatedMinutesForCollection;
    return this;
  }

   /**
   * Estimated minutes for collection
   * @return estimatedMinutesForCollection
  **/
  @ApiModelProperty(value = "Estimated minutes for collection")
  public Integer getEstimatedMinutesForCollection() {
    return estimatedMinutesForCollection;
  }

  public void setEstimatedMinutesForCollection(Integer estimatedMinutesForCollection) {
    this.estimatedMinutesForCollection = estimatedMinutesForCollection;
  }

  public LightspeedSettings geographicLocation(String geographicLocation) {
    this.geographicLocation = geographicLocation;
    return this;
  }

   /**
   * Geographic location (euc1, nae1, euw2, ....))
   * @return geographicLocation
  **/
  @ApiModelProperty(value = "Geographic location (euc1, nae1, euw2, ....))")
  public String getGeographicLocation() {
    return geographicLocation;
  }

  public void setGeographicLocation(String geographicLocation) {
    this.geographicLocation = geographicLocation;
  }

  public LightspeedSettings establishment(Boolean establishment) {
    this.establishment = establishment;
    return this;
  }

   /**
   * Is the CompanyId an establishment (kind of the store of a group of store)
   * @return establishment
  **/
  @ApiModelProperty(value = "Is the CompanyId an establishment (kind of the store of a group of store)")
  public Boolean isEstablishment() {
    return establishment;
  }

  public void setEstablishment(Boolean establishment) {
    this.establishment = establishment;
  }

  public LightspeedSettings voucherId(String voucherId) {
    this.voucherId = voucherId;
    return this;
  }

   /**
   * The Lightspeed voucher identifier to map with our
   * @return voucherId
  **/
  @ApiModelProperty(value = "The Lightspeed voucher identifier to map with our")
  public String getVoucherId() {
    return voucherId;
  }

  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }

  public LightspeedSettings deliveryFeeId(String deliveryFeeId) {
    this.deliveryFeeId = deliveryFeeId;
    return this;
  }

   /**
   * The Lightspeed delivery fee identifier to map with our
   * @return deliveryFeeId
  **/
  @ApiModelProperty(value = "The Lightspeed delivery fee identifier to map with our")
  public String getDeliveryFeeId() {
    return deliveryFeeId;
  }

  public void setDeliveryFeeId(String deliveryFeeId) {
    this.deliveryFeeId = deliveryFeeId;
  }

  public LightspeedSettings processingFeeId(String processingFeeId) {
    this.processingFeeId = processingFeeId;
    return this;
  }

   /**
   * The Lightspeed processing fee identifier to map with our
   * @return processingFeeId
  **/
  @ApiModelProperty(value = "The Lightspeed processing fee identifier to map with our")
  public String getProcessingFeeId() {
    return processingFeeId;
  }

  public void setProcessingFeeId(String processingFeeId) {
    this.processingFeeId = processingFeeId;
  }

  public LightspeedSettings priceType(PriceTypeEnum priceType) {
    this.priceType = priceType;
    return this;
  }

   /**
   * Which price to choose from Lightspeed menu
   * @return priceType
  **/
  @ApiModelProperty(value = "Which price to choose from Lightspeed menu")
  public PriceTypeEnum getPriceType() {
    return priceType;
  }

  public void setPriceType(PriceTypeEnum priceType) {
    this.priceType = priceType;
  }

  public LightspeedSettings menuId(Integer menuId) {
    this.menuId = menuId;
    return this;
  }

   /**
   * The menu id of the store
   * @return menuId
  **/
  @ApiModelProperty(value = "The menu id of the store")
  public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }

  public LightspeedSettings collectionTableId(Integer collectionTableId) {
    this.collectionTableId = collectionTableId;
    return this;
  }

   /**
   * Collection Table ID to send orders
   * @return collectionTableId
  **/
  @ApiModelProperty(value = "Collection Table ID to send orders")
  public Integer getCollectionTableId() {
    return collectionTableId;
  }

  public void setCollectionTableId(Integer collectionTableId) {
    this.collectionTableId = collectionTableId;
  }

  public LightspeedSettings deliveryTableId(Integer deliveryTableId) {
    this.deliveryTableId = deliveryTableId;
    return this;
  }

   /**
   * Delivery Table ID to send orders
   * @return deliveryTableId
  **/
  @ApiModelProperty(value = "Delivery Table ID to send orders")
  public Integer getDeliveryTableId() {
    return deliveryTableId;
  }

  public void setDeliveryTableId(Integer deliveryTableId) {
    this.deliveryTableId = deliveryTableId;
  }

  public LightspeedSettings collectionTableIds(Map<String, String> collectionTableIds) {
    this.collectionTableIds = collectionTableIds;
    return this;
  }

  public LightspeedSettings putCollectionTableIdsItem(String key, String collectionTableIdsItem) {
    if (this.collectionTableIds == null) {
      this.collectionTableIds = new HashMap<String, String>();
    }
    this.collectionTableIds.put(key, collectionTableIdsItem);
    return this;
  }

   /**
   * Collection Table IDs to send orders to
   * @return collectionTableIds
  **/
  @ApiModelProperty(value = "Collection Table IDs to send orders to")
  public Map<String, String> getCollectionTableIds() {
    return collectionTableIds;
  }

  public void setCollectionTableIds(Map<String, String> collectionTableIds) {
    this.collectionTableIds = collectionTableIds;
  }

  public LightspeedSettings deliveryTableIds(Map<String, String> deliveryTableIds) {
    this.deliveryTableIds = deliveryTableIds;
    return this;
  }

  public LightspeedSettings putDeliveryTableIdsItem(String key, String deliveryTableIdsItem) {
    if (this.deliveryTableIds == null) {
      this.deliveryTableIds = new HashMap<String, String>();
    }
    this.deliveryTableIds.put(key, deliveryTableIdsItem);
    return this;
  }

   /**
   * Delivery Table IDs to send orders to
   * @return deliveryTableIds
  **/
  @ApiModelProperty(value = "Delivery Table IDs to send orders to")
  public Map<String, String> getDeliveryTableIds() {
    return deliveryTableIds;
  }

  public void setDeliveryTableIds(Map<String, String> deliveryTableIds) {
    this.deliveryTableIds = deliveryTableIds;
  }

  public LightspeedSettings useTaxInclusivePrices(Boolean useTaxInclusivePrices) {
    this.useTaxInclusivePrices = useTaxInclusivePrices;
    return this;
  }

   /**
   * Exclude tax
   * @return useTaxInclusivePrices
  **/
  @ApiModelProperty(value = "Exclude tax")
  public Boolean isUseTaxInclusivePrices() {
    return useTaxInclusivePrices;
  }

  public void setUseTaxInclusivePrices(Boolean useTaxInclusivePrices) {
    this.useTaxInclusivePrices = useTaxInclusivePrices;
  }

  public LightspeedSettings skipStatusCheckAndAcceptOrderAfterSending(Boolean skipStatusCheckAndAcceptOrderAfterSending) {
    this.skipStatusCheckAndAcceptOrderAfterSending = skipStatusCheckAndAcceptOrderAfterSending;
    return this;
  }

   /**
   * WARNING: only use this option if the Liteserver is not synchronizing within max 5 minutes with Lightspeed cloud!
   * @return skipStatusCheckAndAcceptOrderAfterSending
  **/
  @ApiModelProperty(value = "WARNING: only use this option if the Liteserver is not synchronizing within max 5 minutes with Lightspeed cloud!")
  public Boolean isSkipStatusCheckAndAcceptOrderAfterSending() {
    return skipStatusCheckAndAcceptOrderAfterSending;
  }

  public void setSkipStatusCheckAndAcceptOrderAfterSending(Boolean skipStatusCheckAndAcceptOrderAfterSending) {
    this.skipStatusCheckAndAcceptOrderAfterSending = skipStatusCheckAndAcceptOrderAfterSending;
  }

  public LightspeedSettings sendTableNumberToTableId(Boolean sendTableNumberToTableId) {
    this.sendTableNumberToTableId = sendTableNumberToTableId;
    return this;
  }

   /**
   * Send Table Number to Table Id
   * @return sendTableNumberToTableId
  **/
  @ApiModelProperty(value = "Send Table Number to Table Id")
  public Boolean isSendTableNumberToTableId() {
    return sendTableNumberToTableId;
  }

  public void setSendTableNumberToTableId(Boolean sendTableNumberToTableId) {
    this.sendTableNumberToTableId = sendTableNumberToTableId;
  }

  public LightspeedSettings addChefNoteToProduct(Boolean addChefNoteToProduct) {
    this.addChefNoteToProduct = addChefNoteToProduct;
    return this;
  }

   /**
   * Add ChefNote To Product
   * @return addChefNoteToProduct
  **/
  @ApiModelProperty(value = "Add ChefNote To Product")
  public Boolean isAddChefNoteToProduct() {
    return addChefNoteToProduct;
  }

  public void setAddChefNoteToProduct(Boolean addChefNoteToProduct) {
    this.addChefNoteToProduct = addChefNoteToProduct;
  }

  public LightspeedSettings chefNoteItemId(String chefNoteItemId) {
    this.chefNoteItemId = chefNoteItemId;
    return this;
  }

   /**
   * The Lightspeed Chef Note Item Id to map
   * @return chefNoteItemId
  **/
  @ApiModelProperty(value = "The Lightspeed Chef Note Item Id to map")
  public String getChefNoteItemId() {
    return chefNoteItemId;
  }

  public void setChefNoteItemId(String chefNoteItemId) {
    this.chefNoteItemId = chefNoteItemId;
  }

  public LightspeedSettings chefNoteModifierId(String chefNoteModifierId) {
    this.chefNoteModifierId = chefNoteModifierId;
    return this;
  }

   /**
   * The Lightspeed Chef Note Modifier Id to map
   * @return chefNoteModifierId
  **/
  @ApiModelProperty(value = "The Lightspeed Chef Note Modifier Id to map")
  public String getChefNoteModifierId() {
    return chefNoteModifierId;
  }

  public void setChefNoteModifierId(String chefNoteModifierId) {
    this.chefNoteModifierId = chefNoteModifierId;
  }

  public LightspeedSettings serviceChargeId(String serviceChargeId) {
    this.serviceChargeId = serviceChargeId;
    return this;
  }

   /**
   * The Lightspeed Service Charge Id to map
   * @return serviceChargeId
  **/
  @ApiModelProperty(value = "The Lightspeed Service Charge Id to map")
  public String getServiceChargeId() {
    return serviceChargeId;
  }

  public void setServiceChargeId(String serviceChargeId) {
    this.serviceChargeId = serviceChargeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LightspeedSettings lightspeedSettings = (LightspeedSettings) o;
    return Objects.equals(this.companyId, lightspeedSettings.companyId) &&
        Objects.equals(this.useOAuth, lightspeedSettings.useOAuth) &&
        Objects.equals(this.enabled, lightspeedSettings.enabled) &&
        Objects.equals(this.estimatedMinutesForDelivery, lightspeedSettings.estimatedMinutesForDelivery) &&
        Objects.equals(this.estimatedMinutesForCollection, lightspeedSettings.estimatedMinutesForCollection) &&
        Objects.equals(this.geographicLocation, lightspeedSettings.geographicLocation) &&
        Objects.equals(this.establishment, lightspeedSettings.establishment) &&
        Objects.equals(this.voucherId, lightspeedSettings.voucherId) &&
        Objects.equals(this.deliveryFeeId, lightspeedSettings.deliveryFeeId) &&
        Objects.equals(this.processingFeeId, lightspeedSettings.processingFeeId) &&
        Objects.equals(this.priceType, lightspeedSettings.priceType) &&
        Objects.equals(this.menuId, lightspeedSettings.menuId) &&
        Objects.equals(this.collectionTableId, lightspeedSettings.collectionTableId) &&
        Objects.equals(this.deliveryTableId, lightspeedSettings.deliveryTableId) &&
        Objects.equals(this.collectionTableIds, lightspeedSettings.collectionTableIds) &&
        Objects.equals(this.deliveryTableIds, lightspeedSettings.deliveryTableIds) &&
        Objects.equals(this.useTaxInclusivePrices, lightspeedSettings.useTaxInclusivePrices) &&
        Objects.equals(this.skipStatusCheckAndAcceptOrderAfterSending, lightspeedSettings.skipStatusCheckAndAcceptOrderAfterSending) &&
        Objects.equals(this.sendTableNumberToTableId, lightspeedSettings.sendTableNumberToTableId) &&
        Objects.equals(this.addChefNoteToProduct, lightspeedSettings.addChefNoteToProduct) &&
        Objects.equals(this.chefNoteItemId, lightspeedSettings.chefNoteItemId) &&
        Objects.equals(this.chefNoteModifierId, lightspeedSettings.chefNoteModifierId) &&
        Objects.equals(this.serviceChargeId, lightspeedSettings.serviceChargeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, useOAuth, enabled, estimatedMinutesForDelivery, estimatedMinutesForCollection, geographicLocation, establishment, voucherId, deliveryFeeId, processingFeeId, priceType, menuId, collectionTableId, deliveryTableId, collectionTableIds, deliveryTableIds, useTaxInclusivePrices, skipStatusCheckAndAcceptOrderAfterSending, sendTableNumberToTableId, addChefNoteToProduct, chefNoteItemId, chefNoteModifierId, serviceChargeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LightspeedSettings {\n");
    
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    useOAuth: ").append(toIndentedString(useOAuth)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    estimatedMinutesForDelivery: ").append(toIndentedString(estimatedMinutesForDelivery)).append("\n");
    sb.append("    estimatedMinutesForCollection: ").append(toIndentedString(estimatedMinutesForCollection)).append("\n");
    sb.append("    geographicLocation: ").append(toIndentedString(geographicLocation)).append("\n");
    sb.append("    establishment: ").append(toIndentedString(establishment)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    deliveryFeeId: ").append(toIndentedString(deliveryFeeId)).append("\n");
    sb.append("    processingFeeId: ").append(toIndentedString(processingFeeId)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    menuId: ").append(toIndentedString(menuId)).append("\n");
    sb.append("    collectionTableId: ").append(toIndentedString(collectionTableId)).append("\n");
    sb.append("    deliveryTableId: ").append(toIndentedString(deliveryTableId)).append("\n");
    sb.append("    collectionTableIds: ").append(toIndentedString(collectionTableIds)).append("\n");
    sb.append("    deliveryTableIds: ").append(toIndentedString(deliveryTableIds)).append("\n");
    sb.append("    useTaxInclusivePrices: ").append(toIndentedString(useTaxInclusivePrices)).append("\n");
    sb.append("    skipStatusCheckAndAcceptOrderAfterSending: ").append(toIndentedString(skipStatusCheckAndAcceptOrderAfterSending)).append("\n");
    sb.append("    sendTableNumberToTableId: ").append(toIndentedString(sendTableNumberToTableId)).append("\n");
    sb.append("    addChefNoteToProduct: ").append(toIndentedString(addChefNoteToProduct)).append("\n");
    sb.append("    chefNoteItemId: ").append(toIndentedString(chefNoteItemId)).append("\n");
    sb.append("    chefNoteModifierId: ").append(toIndentedString(chefNoteModifierId)).append("\n");
    sb.append("    serviceChargeId: ").append(toIndentedString(serviceChargeId)).append("\n");
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

