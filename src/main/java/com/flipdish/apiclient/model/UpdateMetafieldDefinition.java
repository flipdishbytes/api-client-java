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
 * Information to update a {Flipdish.PublicModels.V1.Metafields.MetafieldDefinition}
 */
@ApiModel(description = "Information to update a {Flipdish.PublicModels.V1.Metafields.MetafieldDefinition}")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-21T11:49:31.050Z")
public class UpdateMetafieldDefinition {
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

  public UpdateMetafieldDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Field Name
   * @return name
  **/
  @ApiModelProperty(value = "Field Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateMetafieldDefinition description(String description) {
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

  public UpdateMetafieldDefinition behaviors(List<BehaviorsEnum> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public UpdateMetafieldDefinition addBehaviorsItem(BehaviorsEnum behaviorsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMetafieldDefinition updateMetafieldDefinition = (UpdateMetafieldDefinition) o;
    return Objects.equals(this.name, updateMetafieldDefinition.name) &&
        Objects.equals(this.description, updateMetafieldDefinition.description) &&
        Objects.equals(this.behaviors, updateMetafieldDefinition.behaviors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, behaviors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMetafieldDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
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

