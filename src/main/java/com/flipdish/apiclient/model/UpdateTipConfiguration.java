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
 * Describes the configuration of tipping
 */
@ApiModel(description = "Describes the configuration of tipping")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T16:13:45.231+01:00")
public class UpdateTipConfiguration {
  @SerializedName("IsEnabled")
  private Boolean isEnabled = null;

  @SerializedName("AllowCustomTips")
  private Boolean allowCustomTips = null;

  @SerializedName("AllowRoundUp")
  private Boolean allowRoundUp = null;

  @SerializedName("AllowEmojis")
  private Boolean allowEmojis = null;

  @SerializedName("Percentages")
  private List<Double> percentages = null;

  @SerializedName("DefaultPercentage")
  private Double defaultPercentage = null;

  public UpdateTipConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Are tips enabled?
   * @return isEnabled
  **/
  @ApiModelProperty(value = "Are tips enabled?")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public UpdateTipConfiguration allowCustomTips(Boolean allowCustomTips) {
    this.allowCustomTips = allowCustomTips;
    return this;
  }

   /**
   * Are custom tips allowed?
   * @return allowCustomTips
  **/
  @ApiModelProperty(value = "Are custom tips allowed?")
  public Boolean isAllowCustomTips() {
    return allowCustomTips;
  }

  public void setAllowCustomTips(Boolean allowCustomTips) {
    this.allowCustomTips = allowCustomTips;
  }

  public UpdateTipConfiguration allowRoundUp(Boolean allowRoundUp) {
    this.allowRoundUp = allowRoundUp;
    return this;
  }

   /**
   * Is round up allowed?
   * @return allowRoundUp
  **/
  @ApiModelProperty(value = "Is round up allowed?")
  public Boolean isAllowRoundUp() {
    return allowRoundUp;
  }

  public void setAllowRoundUp(Boolean allowRoundUp) {
    this.allowRoundUp = allowRoundUp;
  }

  public UpdateTipConfiguration allowEmojis(Boolean allowEmojis) {
    this.allowEmojis = allowEmojis;
    return this;
  }

   /**
   * Are emojis allowed?
   * @return allowEmojis
  **/
  @ApiModelProperty(value = "Are emojis allowed?")
  public Boolean isAllowEmojis() {
    return allowEmojis;
  }

  public void setAllowEmojis(Boolean allowEmojis) {
    this.allowEmojis = allowEmojis;
  }

  public UpdateTipConfiguration percentages(List<Double> percentages) {
    this.percentages = percentages;
    return this;
  }

  public UpdateTipConfiguration addPercentagesItem(Double percentagesItem) {
    if (this.percentages == null) {
      this.percentages = new ArrayList<Double>();
    }
    this.percentages.add(percentagesItem);
    return this;
  }

   /**
   * Ordered list of tip breakpoints (smallest -&amp;gt; largest)
   * @return percentages
  **/
  @ApiModelProperty(value = "Ordered list of tip breakpoints (smallest -&gt; largest)")
  public List<Double> getPercentages() {
    return percentages;
  }

  public void setPercentages(List<Double> percentages) {
    this.percentages = percentages;
  }

  public UpdateTipConfiguration defaultPercentage(Double defaultPercentage) {
    this.defaultPercentage = defaultPercentage;
    return this;
  }

   /**
   * Defines a default percentage, it must be in the list of Percentages
   * @return defaultPercentage
  **/
  @ApiModelProperty(value = "Defines a default percentage, it must be in the list of Percentages")
  public Double getDefaultPercentage() {
    return defaultPercentage;
  }

  public void setDefaultPercentage(Double defaultPercentage) {
    this.defaultPercentage = defaultPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTipConfiguration updateTipConfiguration = (UpdateTipConfiguration) o;
    return Objects.equals(this.isEnabled, updateTipConfiguration.isEnabled) &&
        Objects.equals(this.allowCustomTips, updateTipConfiguration.allowCustomTips) &&
        Objects.equals(this.allowRoundUp, updateTipConfiguration.allowRoundUp) &&
        Objects.equals(this.allowEmojis, updateTipConfiguration.allowEmojis) &&
        Objects.equals(this.percentages, updateTipConfiguration.percentages) &&
        Objects.equals(this.defaultPercentage, updateTipConfiguration.defaultPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled, allowCustomTips, allowRoundUp, allowEmojis, percentages, defaultPercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTipConfiguration {\n");
    
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    allowCustomTips: ").append(toIndentedString(allowCustomTips)).append("\n");
    sb.append("    allowRoundUp: ").append(toIndentedString(allowRoundUp)).append("\n");
    sb.append("    allowEmojis: ").append(toIndentedString(allowEmojis)).append("\n");
    sb.append("    percentages: ").append(toIndentedString(percentages)).append("\n");
    sb.append("    defaultPercentage: ").append(toIndentedString(defaultPercentage)).append("\n");
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

