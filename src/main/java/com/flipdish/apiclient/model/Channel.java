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
 * Channel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-09-12T09:58:30.363Z")
public class Channel {
  @SerializedName("ChannelId")
  private Integer channelId = null;

  @SerializedName("TranslationKey")
  private String translationKey = null;

  /**
   * Channel Source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    INTERNAL("Internal"),
    
    EXTERNAL("External");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Source")
  private SourceEnum source = null;

  @SerializedName("LogoUri")
  private String logoUri = null;

  @SerializedName("Available")
  private Boolean available = null;

  @SerializedName("MaintainedExternally")
  private Boolean maintainedExternally = null;

  public Channel channelId(Integer channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Channel Id
   * @return channelId
  **/
  @ApiModelProperty(value = "Channel Id")
  public Integer getChannelId() {
    return channelId;
  }

  public void setChannelId(Integer channelId) {
    this.channelId = channelId;
  }

  public Channel translationKey(String translationKey) {
    this.translationKey = translationKey;
    return this;
  }

   /**
   * Channel TranslationKey
   * @return translationKey
  **/
  @ApiModelProperty(value = "Channel TranslationKey")
  public String getTranslationKey() {
    return translationKey;
  }

  public void setTranslationKey(String translationKey) {
    this.translationKey = translationKey;
  }

  public Channel source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Channel Source
   * @return source
  **/
  @ApiModelProperty(value = "Channel Source")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public Channel logoUri(String logoUri) {
    this.logoUri = logoUri;
    return this;
  }

   /**
   * Channel Logo URl
   * @return logoUri
  **/
  @ApiModelProperty(value = "Channel Logo URl")
  public String getLogoUri() {
    return logoUri;
  }

  public void setLogoUri(String logoUri) {
    this.logoUri = logoUri;
  }

  public Channel available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Channel is Available or not
   * @return available
  **/
  @ApiModelProperty(value = "Channel is Available or not")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public Channel maintainedExternally(Boolean maintainedExternally) {
    this.maintainedExternally = maintainedExternally;
    return this;
  }

   /**
   * Channel is Maintained Externally or not
   * @return maintainedExternally
  **/
  @ApiModelProperty(value = "Channel is Maintained Externally or not")
  public Boolean isMaintainedExternally() {
    return maintainedExternally;
  }

  public void setMaintainedExternally(Boolean maintainedExternally) {
    this.maintainedExternally = maintainedExternally;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.channelId, channel.channelId) &&
        Objects.equals(this.translationKey, channel.translationKey) &&
        Objects.equals(this.source, channel.source) &&
        Objects.equals(this.logoUri, channel.logoUri) &&
        Objects.equals(this.available, channel.available) &&
        Objects.equals(this.maintainedExternally, channel.maintainedExternally);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, translationKey, source, logoUri, available, maintainedExternally);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    translationKey: ").append(toIndentedString(translationKey)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    logoUri: ").append(toIndentedString(logoUri)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    maintainedExternally: ").append(toIndentedString(maintainedExternally)).append("\n");
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

