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
import com.flipdish.apiclient.model.Group;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Reference to an existing {Flipdish.Menus.PublicModels.V1.Catalog.Groups.Group}
 */
@ApiModel(description = "Reference to an existing {Flipdish.Menus.PublicModels.V1.Catalog.Groups.Group}")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-22T10:32:41.599Z")
public class CatalogGroupReference {
  @SerializedName("Group")
  private Group group = null;

  @SerializedName("CatalogGroupId")
  private String catalogGroupId = null;

  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  /**
   * Type of the SupProduct
   */
  @JsonAdapter(GroupTypeEnum.Adapter.class)
  public enum GroupTypeEnum {
    MODIFIERGROUP("ModifierGroup");

    private String value;

    GroupTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GroupTypeEnum fromValue(String text) {
      for (GroupTypeEnum b : GroupTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<GroupTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GroupTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GroupTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GroupTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("GroupType")
  private GroupTypeEnum groupType = null;

  public CatalogGroupReference group(Group group) {
    this.group = group;
    return this;
  }

   /**
   * Details of the referenced {Flipdish.Menus.PublicModels.V1.Catalog.Items.CatalogItem}
   * @return group
  **/
  @ApiModelProperty(value = "Details of the referenced {Flipdish.Menus.PublicModels.V1.Catalog.Items.CatalogItem}")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public CatalogGroupReference catalogGroupId(String catalogGroupId) {
    this.catalogGroupId = catalogGroupId;
    return this;
  }

   /**
   * Identifier of the ProductId to use as SubProduct
   * @return catalogGroupId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the ProductId to use as SubProduct")
  public String getCatalogGroupId() {
    return catalogGroupId;
  }

  public void setCatalogGroupId(String catalogGroupId) {
    this.catalogGroupId = catalogGroupId;
  }

  public CatalogGroupReference catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Identifier of the ProductId to use as SubProduct
   * @return catalogItemId
  **/
  @ApiModelProperty(value = "Identifier of the ProductId to use as SubProduct")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public CatalogGroupReference groupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
    return this;
  }

   /**
   * Type of the SupProduct
   * @return groupType
  **/
  @ApiModelProperty(required = true, value = "Type of the SupProduct")
  public GroupTypeEnum getGroupType() {
    return groupType;
  }

  public void setGroupType(GroupTypeEnum groupType) {
    this.groupType = groupType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogGroupReference catalogGroupReference = (CatalogGroupReference) o;
    return Objects.equals(this.group, catalogGroupReference.group) &&
        Objects.equals(this.catalogGroupId, catalogGroupReference.catalogGroupId) &&
        Objects.equals(this.catalogItemId, catalogGroupReference.catalogItemId) &&
        Objects.equals(this.groupType, catalogGroupReference.groupType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, catalogGroupId, catalogItemId, groupType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogGroupReference {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    catalogGroupId: ").append(toIndentedString(catalogGroupId)).append("\n");
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
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

