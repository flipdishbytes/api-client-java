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
 * Menu section availability
 */
@ApiModel(description = "Menu section availability")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-10T15:50:34.748+01:00")
public class MenuSectionAvailabilityBase {
  /**
   * Availability mode
   */
  @JsonAdapter(AvailabilityModeEnum.Adapter.class)
  public enum AvailabilityModeEnum {
    DISPLAYALWAYS("DisplayAlways"),
    
    DISPLAYBASEDONTIMES("DisplayBasedOnTimes"),
    
    DISPLAYALWAYSSTARTCOLLAPSED("DisplayAlwaysStartCollapsed"),
    
    DISPLAYALWAYSSTARTCOLLAPSEDBASEDONTIMES("DisplayAlwaysStartCollapsedBasedOnTimes");

    private String value;

    AvailabilityModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AvailabilityModeEnum fromValue(String text) {
      for (AvailabilityModeEnum b : AvailabilityModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AvailabilityModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AvailabilityModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AvailabilityModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AvailabilityModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AvailabilityMode")
  private AvailabilityModeEnum availabilityMode = null;

  public MenuSectionAvailabilityBase availabilityMode(AvailabilityModeEnum availabilityMode) {
    this.availabilityMode = availabilityMode;
    return this;
  }

   /**
   * Availability mode
   * @return availabilityMode
  **/
  @ApiModelProperty(value = "Availability mode")
  public AvailabilityModeEnum getAvailabilityMode() {
    return availabilityMode;
  }

  public void setAvailabilityMode(AvailabilityModeEnum availabilityMode) {
    this.availabilityMode = availabilityMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuSectionAvailabilityBase menuSectionAvailabilityBase = (MenuSectionAvailabilityBase) o;
    return Objects.equals(this.availabilityMode, menuSectionAvailabilityBase.availabilityMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuSectionAvailabilityBase {\n");
    
    sb.append("    availabilityMode: ").append(toIndentedString(availabilityMode)).append("\n");
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

