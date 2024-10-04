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
import org.threeten.bp.OffsetDateTime;

/**
 * Menu Checkpoint
 */
@ApiModel(description = "Menu Checkpoint")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-10-04T11:36:58.526Z")
public class MenuCheckpoint {
  @SerializedName("MenuCheckpointId")
  private Integer menuCheckpointId = null;

  @SerializedName("Time")
  private OffsetDateTime time = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Url")
  private String url = null;

  public MenuCheckpoint menuCheckpointId(Integer menuCheckpointId) {
    this.menuCheckpointId = menuCheckpointId;
    return this;
  }

   /**
   * Identifier of Menu Checkpoint
   * @return menuCheckpointId
  **/
  @ApiModelProperty(value = "Identifier of Menu Checkpoint")
  public Integer getMenuCheckpointId() {
    return menuCheckpointId;
  }

  public void setMenuCheckpointId(Integer menuCheckpointId) {
    this.menuCheckpointId = menuCheckpointId;
  }

  public MenuCheckpoint time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Time of creation of checkpoint
   * @return time
  **/
  @ApiModelProperty(value = "Time of creation of checkpoint")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public MenuCheckpoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of checkpoint
   * @return name
  **/
  @ApiModelProperty(value = "Name of checkpoint")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MenuCheckpoint url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url that points to Serialized Checkpoint
   * @return url
  **/
  @ApiModelProperty(value = "Url that points to Serialized Checkpoint")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuCheckpoint menuCheckpoint = (MenuCheckpoint) o;
    return Objects.equals(this.menuCheckpointId, menuCheckpoint.menuCheckpointId) &&
        Objects.equals(this.time, menuCheckpoint.time) &&
        Objects.equals(this.name, menuCheckpoint.name) &&
        Objects.equals(this.url, menuCheckpoint.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuCheckpointId, time, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuCheckpoint {\n");
    
    sb.append("    menuCheckpointId: ").append(toIndentedString(menuCheckpointId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

