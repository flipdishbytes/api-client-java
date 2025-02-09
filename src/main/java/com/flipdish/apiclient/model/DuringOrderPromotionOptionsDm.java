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
 * DuringOrderPromotionOptionsDm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-05T15:19:42.240Z")
public class DuringOrderPromotionOptionsDm {
  /**
   * Gets or Sets duringOrderPromotionType
   */
  @JsonAdapter(DuringOrderPromotionTypeEnum.Adapter.class)
  public enum DuringOrderPromotionTypeEnum {
    NONE("None"),
    
    BUMPFREECHOCOLATE("BumpFreeChocolate"),
    
    BUMPFREECOKE("BumpFreeCoke"),
    
    SMSINVITEFREECHOCOLATE("SmsInviteFreeChocolate"),
    
    SMSINVITEFREECOKE("SmsInviteFreeCoke");

    private String value;

    DuringOrderPromotionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DuringOrderPromotionTypeEnum fromValue(String text) {
      for (DuringOrderPromotionTypeEnum b : DuringOrderPromotionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DuringOrderPromotionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DuringOrderPromotionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DuringOrderPromotionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DuringOrderPromotionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DuringOrderPromotionType")
  private DuringOrderPromotionTypeEnum duringOrderPromotionType = null;

  @SerializedName("MinSmsShareCount")
  private Integer minSmsShareCount = null;

  @SerializedName("FreeCokeCount")
  private Integer freeCokeCount = null;

  @SerializedName("PromotionPeriodSeconds")
  private Integer promotionPeriodSeconds = null;

  public DuringOrderPromotionOptionsDm duringOrderPromotionType(DuringOrderPromotionTypeEnum duringOrderPromotionType) {
    this.duringOrderPromotionType = duringOrderPromotionType;
    return this;
  }

   /**
   * Get duringOrderPromotionType
   * @return duringOrderPromotionType
  **/
  @ApiModelProperty(value = "")
  public DuringOrderPromotionTypeEnum getDuringOrderPromotionType() {
    return duringOrderPromotionType;
  }

  public void setDuringOrderPromotionType(DuringOrderPromotionTypeEnum duringOrderPromotionType) {
    this.duringOrderPromotionType = duringOrderPromotionType;
  }

  public DuringOrderPromotionOptionsDm minSmsShareCount(Integer minSmsShareCount) {
    this.minSmsShareCount = minSmsShareCount;
    return this;
  }

   /**
   * Get minSmsShareCount
   * @return minSmsShareCount
  **/
  @ApiModelProperty(value = "")
  public Integer getMinSmsShareCount() {
    return minSmsShareCount;
  }

  public void setMinSmsShareCount(Integer minSmsShareCount) {
    this.minSmsShareCount = minSmsShareCount;
  }

  public DuringOrderPromotionOptionsDm freeCokeCount(Integer freeCokeCount) {
    this.freeCokeCount = freeCokeCount;
    return this;
  }

   /**
   * Get freeCokeCount
   * @return freeCokeCount
  **/
  @ApiModelProperty(value = "")
  public Integer getFreeCokeCount() {
    return freeCokeCount;
  }

  public void setFreeCokeCount(Integer freeCokeCount) {
    this.freeCokeCount = freeCokeCount;
  }

  public DuringOrderPromotionOptionsDm promotionPeriodSeconds(Integer promotionPeriodSeconds) {
    this.promotionPeriodSeconds = promotionPeriodSeconds;
    return this;
  }

   /**
   * Get promotionPeriodSeconds
   * @return promotionPeriodSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getPromotionPeriodSeconds() {
    return promotionPeriodSeconds;
  }

  public void setPromotionPeriodSeconds(Integer promotionPeriodSeconds) {
    this.promotionPeriodSeconds = promotionPeriodSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DuringOrderPromotionOptionsDm duringOrderPromotionOptionsDm = (DuringOrderPromotionOptionsDm) o;
    return Objects.equals(this.duringOrderPromotionType, duringOrderPromotionOptionsDm.duringOrderPromotionType) &&
        Objects.equals(this.minSmsShareCount, duringOrderPromotionOptionsDm.minSmsShareCount) &&
        Objects.equals(this.freeCokeCount, duringOrderPromotionOptionsDm.freeCokeCount) &&
        Objects.equals(this.promotionPeriodSeconds, duringOrderPromotionOptionsDm.promotionPeriodSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duringOrderPromotionType, minSmsShareCount, freeCokeCount, promotionPeriodSeconds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DuringOrderPromotionOptionsDm {\n");
    
    sb.append("    duringOrderPromotionType: ").append(toIndentedString(duringOrderPromotionType)).append("\n");
    sb.append("    minSmsShareCount: ").append(toIndentedString(minSmsShareCount)).append("\n");
    sb.append("    freeCokeCount: ").append(toIndentedString(freeCokeCount)).append("\n");
    sb.append("    promotionPeriodSeconds: ").append(toIndentedString(promotionPeriodSeconds)).append("\n");
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

