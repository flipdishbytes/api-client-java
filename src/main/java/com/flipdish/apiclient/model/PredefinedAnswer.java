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

/**
 * Predefined answer
 */
@ApiModel(description = "Predefined answer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-29T09:55:36.813Z")
public class PredefinedAnswer {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Text")
  private String text = null;

  public PredefinedAnswer id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier
   * @return id
  **/
  @ApiModelProperty(value = "Identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PredefinedAnswer text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text
   * @return text
  **/
  @ApiModelProperty(value = "Text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredefinedAnswer predefinedAnswer = (PredefinedAnswer) o;
    return Objects.equals(this.id, predefinedAnswer.id) &&
        Objects.equals(this.text, predefinedAnswer.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredefinedAnswer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

