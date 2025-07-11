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
 * Oauth client (also knowns as &#39;app&#39;)
 */
@ApiModel(description = "Oauth client (also knowns as 'app')")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class OAuthApp {
  @SerializedName("OauthAppId")
  private String oauthAppId = null;

  @SerializedName("OauthAppName")
  private String oauthAppName = null;

  @SerializedName("OwnerUserId")
  private Integer ownerUserId = null;

  @SerializedName("LogoUri")
  private String logoUri = null;

  /**
   * Supported OpenID Connect flows
   */
  @JsonAdapter(FlowEnum.Adapter.class)
  public enum FlowEnum {
    AUTHORIZATIONCODE("AuthorizationCode"),
    
    IMPLICIT("Implicit"),
    
    HYBRID("Hybrid"),
    
    CLIENTCREDENTIALS("ClientCredentials");

    private String value;

    FlowEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FlowEnum fromValue(String text) {
      for (FlowEnum b : FlowEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FlowEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FlowEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FlowEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FlowEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Flow")
  private FlowEnum flow = null;

  /**
   * ReUse: the refresh token handle will stay the same when refreshing tokens   OneTime: the refresh token handle will be updated when refreshing tokens
   */
  @JsonAdapter(RefreshTokenUsageEnum.Adapter.class)
  public enum RefreshTokenUsageEnum {
    REUSE("ReUse"),
    
    ONETIMEONLY("OneTimeOnly");

    private String value;

    RefreshTokenUsageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshTokenUsageEnum fromValue(String text) {
      for (RefreshTokenUsageEnum b : RefreshTokenUsageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RefreshTokenUsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefreshTokenUsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefreshTokenUsageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RefreshTokenUsageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("RefreshTokenUsage")
  private RefreshTokenUsageEnum refreshTokenUsage = null;

  @SerializedName("AccessTokenLifetime")
  private Integer accessTokenLifetime = null;

  @SerializedName("AbsoluteRefreshTokenLifetime")
  private Integer absoluteRefreshTokenLifetime = null;

  public OAuthApp oauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
    return this;
  }

   /**
   * OAuth App Identifier
   * @return oauthAppId
  **/
  @ApiModelProperty(value = "OAuth App Identifier")
  public String getOauthAppId() {
    return oauthAppId;
  }

  public void setOauthAppId(String oauthAppId) {
    this.oauthAppId = oauthAppId;
  }

  public OAuthApp oauthAppName(String oauthAppName) {
    this.oauthAppName = oauthAppName;
    return this;
  }

   /**
   * OAuth App Name
   * @return oauthAppName
  **/
  @ApiModelProperty(value = "OAuth App Name")
  public String getOauthAppName() {
    return oauthAppName;
  }

  public void setOauthAppName(String oauthAppName) {
    this.oauthAppName = oauthAppName;
  }

  public OAuthApp ownerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * OAuth App owner user identifier
   * @return ownerUserId
  **/
  @ApiModelProperty(value = "OAuth App owner user identifier")
  public Integer getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(Integer ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public OAuthApp logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

   /**
   * OAuth App logo uri
   * @return logoUri
  **/
  @ApiModelProperty(value = "OAuth App logo uri")
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public OAuthApp flow(FlowEnum flow) {
    this.flow = flow;
    return this;
  }

   /**
   * Supported OpenID Connect flows
   * @return flow
  **/
  @ApiModelProperty(value = "Supported OpenID Connect flows")
  public FlowEnum getFlow() {
    return flow;
  }

  public void setFlow(FlowEnum flow) {
    this.flow = flow;
  }

  public OAuthApp refreshTokenUsage(RefreshTokenUsageEnum refreshTokenUsage) {
    this.refreshTokenUsage = refreshTokenUsage;
    return this;
  }

   /**
   * ReUse: the refresh token handle will stay the same when refreshing tokens   OneTime: the refresh token handle will be updated when refreshing tokens
   * @return refreshTokenUsage
  **/
  @ApiModelProperty(value = "ReUse: the refresh token handle will stay the same when refreshing tokens   OneTime: the refresh token handle will be updated when refreshing tokens")
  public RefreshTokenUsageEnum getRefreshTokenUsage() {
    return refreshTokenUsage;
  }

  public void setRefreshTokenUsage(RefreshTokenUsageEnum refreshTokenUsage) {
    this.refreshTokenUsage = refreshTokenUsage;
  }

  public OAuthApp accessTokenLifetime(Integer accessTokenLifetime) {
    this.accessTokenLifetime = accessTokenLifetime;
    return this;
  }

   /**
   * Timem it takes for the IdentityToken to expire in seconds
   * @return accessTokenLifetime
  **/
  @ApiModelProperty(value = "Timem it takes for the IdentityToken to expire in seconds")
  public Integer getAccessTokenLifetime() {
    return accessTokenLifetime;
  }

  public void setAccessTokenLifetime(Integer accessTokenLifetime) {
    this.accessTokenLifetime = accessTokenLifetime;
  }

  public OAuthApp absoluteRefreshTokenLifetime(Integer absoluteRefreshTokenLifetime) {
    this.absoluteRefreshTokenLifetime = absoluteRefreshTokenLifetime;
    return this;
  }

   /**
   * Maximum lifetime of a refresh token in seconds
   * @return absoluteRefreshTokenLifetime
  **/
  @ApiModelProperty(value = "Maximum lifetime of a refresh token in seconds")
  public Integer getAbsoluteRefreshTokenLifetime() {
    return absoluteRefreshTokenLifetime;
  }

  public void setAbsoluteRefreshTokenLifetime(Integer absoluteRefreshTokenLifetime) {
    this.absoluteRefreshTokenLifetime = absoluteRefreshTokenLifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthApp oauthApp = (OAuthApp) o;
    return Objects.equals(this.oauthAppId, oauthApp.oauthAppId) &&
        Objects.equals(this.oauthAppName, oauthApp.oauthAppName) &&
        Objects.equals(this.ownerUserId, oauthApp.ownerUserId) &&
        Objects.equals(this.logoUri, oauthApp.logoUri) &&
        Objects.equals(this.flow, oauthApp.flow) &&
        Objects.equals(this.refreshTokenUsage, oauthApp.refreshTokenUsage) &&
        Objects.equals(this.accessTokenLifetime, oauthApp.accessTokenLifetime) &&
        Objects.equals(this.absoluteRefreshTokenLifetime, oauthApp.absoluteRefreshTokenLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oauthAppId, oauthAppName, ownerUserId, logoUri, flow, refreshTokenUsage, accessTokenLifetime, absoluteRefreshTokenLifetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthApp {\n");
    
    sb.append("    oauthAppId: ").append(toIndentedString(oauthAppId)).append("\n");
    sb.append("    oauthAppName: ").append(toIndentedString(oauthAppName)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    refreshTokenUsage: ").append(toIndentedString(refreshTokenUsage)).append("\n");
    sb.append("    accessTokenLifetime: ").append(toIndentedString(accessTokenLifetime)).append("\n");
    sb.append("    absoluteRefreshTokenLifetime: ").append(toIndentedString(absoluteRefreshTokenLifetime)).append("\n");
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

