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
 * OwnerEntity information to configure its {Flipdish.Metafields.PublicModels.V1.MetafieldDefinition}s
 */
@ApiModel(description = "OwnerEntity information to configure its {Flipdish.Metafields.PublicModels.V1.MetafieldDefinition}s")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-12T15:58:55.291Z")
public class OwnerEntityConfiguration {
  /**
   * Owner Entity
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

  /**
   * Gets or Sets allowedBehaviors
   */
  @JsonAdapter(AllowedBehaviorsEnum.Adapter.class)
  public enum AllowedBehaviorsEnum {
    SENDTOORDER("SendToOrder"),
    
    SENDTOMENU("SendToMenu");

    private String value;

    AllowedBehaviorsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedBehaviorsEnum fromValue(String text) {
      for (AllowedBehaviorsEnum b : AllowedBehaviorsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AllowedBehaviorsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedBehaviorsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedBehaviorsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AllowedBehaviorsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AllowedBehaviors")
  private List<AllowedBehaviorsEnum> allowedBehaviors = null;

  public OwnerEntityConfiguration ownerEntity(OwnerEntityEnum ownerEntity) {
    this.ownerEntity = ownerEntity;
    return this;
  }

   /**
   * Owner Entity
   * @return ownerEntity
  **/
  @ApiModelProperty(value = "Owner Entity")
  public OwnerEntityEnum getOwnerEntity() {
    return ownerEntity;
  }

  public void setOwnerEntity(OwnerEntityEnum ownerEntity) {
    this.ownerEntity = ownerEntity;
  }

  public OwnerEntityConfiguration allowedBehaviors(List<AllowedBehaviorsEnum> allowedBehaviors) {
    this.allowedBehaviors = allowedBehaviors;
    return this;
  }

  public OwnerEntityConfiguration addAllowedBehaviorsItem(AllowedBehaviorsEnum allowedBehaviorsItem) {
    if (this.allowedBehaviors == null) {
      this.allowedBehaviors = new ArrayList<AllowedBehaviorsEnum>();
    }
    this.allowedBehaviors.add(allowedBehaviorsItem);
    return this;
  }

   /**
   * 
   * @return allowedBehaviors
  **/
  @ApiModelProperty(value = "")
  public List<AllowedBehaviorsEnum> getAllowedBehaviors() {
    return allowedBehaviors;
  }

  public void setAllowedBehaviors(List<AllowedBehaviorsEnum> allowedBehaviors) {
    this.allowedBehaviors = allowedBehaviors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerEntityConfiguration ownerEntityConfiguration = (OwnerEntityConfiguration) o;
    return Objects.equals(this.ownerEntity, ownerEntityConfiguration.ownerEntity) &&
        Objects.equals(this.allowedBehaviors, ownerEntityConfiguration.allowedBehaviors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerEntity, allowedBehaviors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerEntityConfiguration {\n");
    
    sb.append("    ownerEntity: ").append(toIndentedString(ownerEntity)).append("\n");
    sb.append("    allowedBehaviors: ").append(toIndentedString(allowedBehaviors)).append("\n");
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

