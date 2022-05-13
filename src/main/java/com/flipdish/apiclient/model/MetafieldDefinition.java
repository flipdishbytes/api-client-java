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

/**
 * Metafield Definition
 */
@ApiModel(description = "Metafield Definition")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-05-13T09:47:54.420+01:00")
public class MetafieldDefinition {
  @SerializedName("IsReadOnly")
  private Boolean isReadOnly = null;

  /**
   * The Metafield will extend the specified {Flipdish.PublicModels.V1.Metafields.MetafieldDefinitionBase.OwnerEntity}
   */
  @JsonAdapter(OwnerEntityEnum.Adapter.class)
  public enum OwnerEntityEnum {
    CATALOGITEM("CatalogItem"),
    
    CATALOGGROUP("CatalogGroup"),
    
    MENU("Menu");

    private String value;

    OwnerEntityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OwnerEntityEnum fromValue(String text) {
      for (OwnerEntityEnum b : OwnerEntityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OwnerEntityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OwnerEntityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OwnerEntityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OwnerEntityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("OwnerEntity")
  private OwnerEntityEnum ownerEntity = null;

  @SerializedName("Key")
  private String key = null;

  /**
   * The excepted type for the Value field
   */
  @JsonAdapter(ValueTypeEnum.Adapter.class)
  public enum ValueTypeEnum {
    JSON("Json"),
    
    SINGLELINESTRING("SingleLineString"),
    
    MULTILINESTRING("MultiLineString");

    private String value;

    ValueTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValueTypeEnum fromValue(String text) {
      for (ValueTypeEnum b : ValueTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ValueTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValueTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValueTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ValueTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ValueType")
  private ValueTypeEnum valueType = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Description")
  private String description = null;

  /**
   * Gets or Sets behaviors
   */
  @JsonAdapter(BehaviorsEnum.Adapter.class)
  public enum BehaviorsEnum {
    SENDTOORDER("SendToOrder"),
    
    SENDTOMENU("SendToMenu");

    private String value;

    BehaviorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BehaviorsEnum fromValue(String text) {
      for (BehaviorsEnum b : BehaviorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BehaviorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BehaviorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BehaviorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BehaviorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Behaviors")
  private List<BehaviorsEnum> behaviors = null;

  @SerializedName("MetafieldDefinitionRecommendationId")
  private Integer metafieldDefinitionRecommendationId = null;

  public MetafieldDefinition isReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
    return this;
  }

   /**
   * Indicates if a definition can be edited or not
   * @return isReadOnly
  **/
  @ApiModelProperty(value = "Indicates if a definition can be edited or not")
  public Boolean isIsReadOnly() {
    return isReadOnly;
  }

  public void setIsReadOnly(Boolean isReadOnly) {
    this.isReadOnly = isReadOnly;
  }

  public MetafieldDefinition ownerEntity(OwnerEntityEnum ownerEntity) {
    this.ownerEntity = ownerEntity;
    return this;
  }

   /**
   * The Metafield will extend the specified {Flipdish.PublicModels.V1.Metafields.MetafieldDefinitionBase.OwnerEntity}
   * @return ownerEntity
  **/
  @ApiModelProperty(value = "The Metafield will extend the specified {Flipdish.PublicModels.V1.Metafields.MetafieldDefinitionBase.OwnerEntity}")
  public OwnerEntityEnum getOwnerEntity() {
    return ownerEntity;
  }

  public void setOwnerEntity(OwnerEntityEnum ownerEntity) {
    this.ownerEntity = ownerEntity;
  }

  public MetafieldDefinition key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key of the metafield.  The key must have two parts, separated by a dot. The first part acts as a category, for organizational purposes.  The parts can be composed of lowercase letters, numbers, hyphen and underscore
   * @return key
  **/
  @ApiModelProperty(required = true, value = "Key of the metafield.  The key must have two parts, separated by a dot. The first part acts as a category, for organizational purposes.  The parts can be composed of lowercase letters, numbers, hyphen and underscore")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MetafieldDefinition valueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * The excepted type for the Value field
   * @return valueType
  **/
  @ApiModelProperty(value = "The excepted type for the Value field")
  public ValueTypeEnum getValueType() {
    return valueType;
  }

  public void setValueType(ValueTypeEnum valueType) {
    this.valueType = valueType;
  }

  public MetafieldDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Field Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Field Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MetafieldDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Field Description
   * @return description
  **/
  @ApiModelProperty(value = "Field Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MetafieldDefinition behaviors(List<BehaviorsEnum> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public MetafieldDefinition addBehaviorsItem(BehaviorsEnum behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<BehaviorsEnum>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * Enable Metafield Behaviors
   * @return behaviors
  **/
  @ApiModelProperty(value = "Enable Metafield Behaviors")
  public List<BehaviorsEnum> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<BehaviorsEnum> behaviors) {
    this.behaviors = behaviors;
  }

  public MetafieldDefinition metafieldDefinitionRecommendationId(Integer metafieldDefinitionRecommendationId) {
    this.metafieldDefinitionRecommendationId = metafieldDefinitionRecommendationId;
    return this;
  }

   /**
   * Metafield Recommendation Id
   * @return metafieldDefinitionRecommendationId
  **/
  @ApiModelProperty(value = "Metafield Recommendation Id")
  public Integer getMetafieldDefinitionRecommendationId() {
    return metafieldDefinitionRecommendationId;
  }

  public void setMetafieldDefinitionRecommendationId(Integer metafieldDefinitionRecommendationId) {
    this.metafieldDefinitionRecommendationId = metafieldDefinitionRecommendationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetafieldDefinition metafieldDefinition = (MetafieldDefinition) o;
    return Objects.equals(this.isReadOnly, metafieldDefinition.isReadOnly) &&
        Objects.equals(this.ownerEntity, metafieldDefinition.ownerEntity) &&
        Objects.equals(this.key, metafieldDefinition.key) &&
        Objects.equals(this.valueType, metafieldDefinition.valueType) &&
        Objects.equals(this.name, metafieldDefinition.name) &&
        Objects.equals(this.description, metafieldDefinition.description) &&
        Objects.equals(this.behaviors, metafieldDefinition.behaviors) &&
        Objects.equals(this.metafieldDefinitionRecommendationId, metafieldDefinition.metafieldDefinitionRecommendationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isReadOnly, ownerEntity, key, valueType, name, description, behaviors, metafieldDefinitionRecommendationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetafieldDefinition {\n");
    
    sb.append("    isReadOnly: ").append(toIndentedString(isReadOnly)).append("\n");
    sb.append("    ownerEntity: ").append(toIndentedString(ownerEntity)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    metafieldDefinitionRecommendationId: ").append(toIndentedString(metafieldDefinitionRecommendationId)).append("\n");
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

