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
import com.flipdish.apiclient.model.AuditLogFieldChangeInformation;
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
 * External event
 */
@ApiModel(description = "External event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-17T09:39:41.364Z")
public class ExternalStoreAuditLog {
  @SerializedName("ExternalCreateTime")
  private OffsetDateTime externalCreateTime = null;

  @SerializedName("StoreId")
  private Integer storeId = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("Source")
  private String source = null;

  @SerializedName("Version")
  private String version = null;

  @SerializedName("DescriptionFormat")
  private String descriptionFormat = null;

  @SerializedName("DescriptionFields")
  private String descriptionFields = null;

  @SerializedName("DescriptionId")
  private String descriptionId = null;

  @SerializedName("Ref1")
  private String ref1 = null;

  @SerializedName("Ref2")
  private String ref2 = null;

  @SerializedName("Ref3")
  private String ref3 = null;

  @SerializedName("Ref4")
  private String ref4 = null;

  @SerializedName("OrderId")
  private Integer orderId = null;

  @SerializedName("Tags")
  private List<String> tags = null;

  @SerializedName("FieldChanges")
  private List<AuditLogFieldChangeInformation> fieldChanges = null;

  public ExternalStoreAuditLog externalCreateTime(OffsetDateTime externalCreateTime) {
    this.externalCreateTime = externalCreateTime;
    return this;
  }

   /**
   * The time of creation of the event
   * @return externalCreateTime
  **/
  @ApiModelProperty(value = "The time of creation of the event")
  public OffsetDateTime getExternalCreateTime() {
    return externalCreateTime;
  }

  public void setExternalCreateTime(OffsetDateTime externalCreateTime) {
    this.externalCreateTime = externalCreateTime;
  }

  public ExternalStoreAuditLog storeId(Integer storeId) {
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

  public ExternalStoreAuditLog description(String description) {
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

  public ExternalStoreAuditLog source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Identifies the source of the log
   * @return source
  **/
  @ApiModelProperty(value = "Identifies the source of the log")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public ExternalStoreAuditLog version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Identifies the version of the {Flipdish.PublicModels.V1.AuditLogs.ExternalStoreAuditLog.Source}
   * @return version
  **/
  @ApiModelProperty(value = "Identifies the version of the {Flipdish.PublicModels.V1.AuditLogs.ExternalStoreAuditLog.Source}")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ExternalStoreAuditLog descriptionFormat(String descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
    return this;
  }

   /**
   * Description with format placeholders
   * @return descriptionFormat
  **/
  @ApiModelProperty(value = "Description with format placeholders")
  public String getDescriptionFormat() {
    return descriptionFormat;
  }

  public void setDescriptionFormat(String descriptionFormat) {
    this.descriptionFormat = descriptionFormat;
  }

  public ExternalStoreAuditLog descriptionFields(String descriptionFields) {
    this.descriptionFields = descriptionFields;
    return this;
  }

   /**
   * Description with format placeholders
   * @return descriptionFields
  **/
  @ApiModelProperty(value = "Description with format placeholders")
  public String getDescriptionFields() {
    return descriptionFields;
  }

  public void setDescriptionFields(String descriptionFields) {
    this.descriptionFields = descriptionFields;
  }

  public ExternalStoreAuditLog descriptionId(String descriptionId) {
    this.descriptionId = descriptionId;
    return this;
  }

   /**
   * Description
   * @return descriptionId
  **/
  @ApiModelProperty(value = "Description")
  public String getDescriptionId() {
    return descriptionId;
  }

  public void setDescriptionId(String descriptionId) {
    this.descriptionId = descriptionId;
  }

  public ExternalStoreAuditLog ref1(String ref1) {
    this.ref1 = ref1;
    return this;
  }

   /**
   * Ref (reference field)
   * @return ref1
  **/
  @ApiModelProperty(value = "Ref (reference field)")
  public String getRef1() {
    return ref1;
  }

  public void setRef1(String ref1) {
    this.ref1 = ref1;
  }

  public ExternalStoreAuditLog ref2(String ref2) {
    this.ref2 = ref2;
    return this;
  }

   /**
   * Ref2 (reference field)
   * @return ref2
  **/
  @ApiModelProperty(value = "Ref2 (reference field)")
  public String getRef2() {
    return ref2;
  }

  public void setRef2(String ref2) {
    this.ref2 = ref2;
  }

  public ExternalStoreAuditLog ref3(String ref3) {
    this.ref3 = ref3;
    return this;
  }

   /**
   * Ref3 (reference field)
   * @return ref3
  **/
  @ApiModelProperty(value = "Ref3 (reference field)")
  public String getRef3() {
    return ref3;
  }

  public void setRef3(String ref3) {
    this.ref3 = ref3;
  }

  public ExternalStoreAuditLog ref4(String ref4) {
    this.ref4 = ref4;
    return this;
  }

   /**
   * Ref4 (reference field)
   * @return ref4
  **/
  @ApiModelProperty(value = "Ref4 (reference field)")
  public String getRef4() {
    return ref4;
  }

  public void setRef4(String ref4) {
    this.ref4 = ref4;
  }

  public ExternalStoreAuditLog orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order Id
   * @return orderId
  **/
  @ApiModelProperty(value = "Order Id")
  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public ExternalStoreAuditLog tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ExternalStoreAuditLog addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags
   * @return tags
  **/
  @ApiModelProperty(value = "Tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ExternalStoreAuditLog fieldChanges(List<AuditLogFieldChangeInformation> fieldChanges) {
    this.fieldChanges = fieldChanges;
    return this;
  }

  public ExternalStoreAuditLog addFieldChangesItem(AuditLogFieldChangeInformation fieldChangesItem) {
    if (this.fieldChanges == null) {
      this.fieldChanges = new ArrayList<AuditLogFieldChangeInformation>();
    }
    this.fieldChanges.add(fieldChangesItem);
    return this;
  }

   /**
   * Field changes list
   * @return fieldChanges
  **/
  @ApiModelProperty(value = "Field changes list")
  public List<AuditLogFieldChangeInformation> getFieldChanges() {
    return fieldChanges;
  }

  public void setFieldChanges(List<AuditLogFieldChangeInformation> fieldChanges) {
    this.fieldChanges = fieldChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalStoreAuditLog externalStoreAuditLog = (ExternalStoreAuditLog) o;
    return Objects.equals(this.externalCreateTime, externalStoreAuditLog.externalCreateTime) &&
        Objects.equals(this.storeId, externalStoreAuditLog.storeId) &&
        Objects.equals(this.description, externalStoreAuditLog.description) &&
        Objects.equals(this.source, externalStoreAuditLog.source) &&
        Objects.equals(this.version, externalStoreAuditLog.version) &&
        Objects.equals(this.descriptionFormat, externalStoreAuditLog.descriptionFormat) &&
        Objects.equals(this.descriptionFields, externalStoreAuditLog.descriptionFields) &&
        Objects.equals(this.descriptionId, externalStoreAuditLog.descriptionId) &&
        Objects.equals(this.ref1, externalStoreAuditLog.ref1) &&
        Objects.equals(this.ref2, externalStoreAuditLog.ref2) &&
        Objects.equals(this.ref3, externalStoreAuditLog.ref3) &&
        Objects.equals(this.ref4, externalStoreAuditLog.ref4) &&
        Objects.equals(this.orderId, externalStoreAuditLog.orderId) &&
        Objects.equals(this.tags, externalStoreAuditLog.tags) &&
        Objects.equals(this.fieldChanges, externalStoreAuditLog.fieldChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCreateTime, storeId, description, source, version, descriptionFormat, descriptionFields, descriptionId, ref1, ref2, ref3, ref4, orderId, tags, fieldChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalStoreAuditLog {\n");
    
    sb.append("    externalCreateTime: ").append(toIndentedString(externalCreateTime)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    descriptionFormat: ").append(toIndentedString(descriptionFormat)).append("\n");
    sb.append("    descriptionFields: ").append(toIndentedString(descriptionFields)).append("\n");
    sb.append("    descriptionId: ").append(toIndentedString(descriptionId)).append("\n");
    sb.append("    ref1: ").append(toIndentedString(ref1)).append("\n");
    sb.append("    ref2: ").append(toIndentedString(ref2)).append("\n");
    sb.append("    ref3: ").append(toIndentedString(ref3)).append("\n");
    sb.append("    ref4: ").append(toIndentedString(ref4)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fieldChanges: ").append(toIndentedString(fieldChanges)).append("\n");
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

