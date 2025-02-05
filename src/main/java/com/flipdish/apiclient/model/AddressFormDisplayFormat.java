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
 * AddressFormDisplayFormat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-05T15:19:42.240Z")
public class AddressFormDisplayFormat {
  @SerializedName("OneLine")
  private String oneLine = null;

  @SerializedName("TwoLines")
  private List<String> twoLines = null;

  public AddressFormDisplayFormat oneLine(String oneLine) {
    this.oneLine = oneLine;
    return this;
  }

   /**
   * Get oneLine
   * @return oneLine
  **/
  @ApiModelProperty(value = "")
  public String getOneLine() {
    return oneLine;
  }

  public void setOneLine(String oneLine) {
    this.oneLine = oneLine;
  }

  public AddressFormDisplayFormat twoLines(List<String> twoLines) {
    this.twoLines = twoLines;
    return this;
  }

  public AddressFormDisplayFormat addTwoLinesItem(String twoLinesItem) {
    if (this.twoLines == null) {
      this.twoLines = new ArrayList<String>();
    }
    this.twoLines.add(twoLinesItem);
    return this;
  }

   /**
   * Get twoLines
   * @return twoLines
  **/
  @ApiModelProperty(value = "")
  public List<String> getTwoLines() {
    return twoLines;
  }

  public void setTwoLines(List<String> twoLines) {
    this.twoLines = twoLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressFormDisplayFormat addressFormDisplayFormat = (AddressFormDisplayFormat) o;
    return Objects.equals(this.oneLine, addressFormDisplayFormat.oneLine) &&
        Objects.equals(this.twoLines, addressFormDisplayFormat.twoLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oneLine, twoLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressFormDisplayFormat {\n");
    
    sb.append("    oneLine: ").append(toIndentedString(oneLine)).append("\n");
    sb.append("    twoLines: ").append(toIndentedString(twoLines)).append("\n");
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

