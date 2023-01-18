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
 * OAuth client redirect uri
 */
@ApiModel(description = "OAuth client redirect uri")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-18T09:48:41.601Z")
public class OauthClientRedirectUri {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Uri")
  private String uri = null;

  public OauthClientRedirectUri id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Redirect uri identifier
   * @return id
  **/
  @ApiModelProperty(value = "Redirect uri identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OauthClientRedirectUri uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Redirect uri
   * @return uri
  **/
  @ApiModelProperty(value = "Redirect uri")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthClientRedirectUri oauthClientRedirectUri = (OauthClientRedirectUri) o;
    return Objects.equals(this.id, oauthClientRedirectUri.id) &&
        Objects.equals(this.uri, oauthClientRedirectUri.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthClientRedirectUri {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

