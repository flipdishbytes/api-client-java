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
 * Represents a request for Stripe account link creation
 */
@ApiModel(description = "Represents a request for Stripe account link creation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-01-28T11:16:53.429Z")
public class StripeAccountLinkRequest {
  @SerializedName("StripeId")
  private String stripeId = null;

  @SerializedName("ReturnUrl")
  private String returnUrl = null;

  /**
   * Which information to collect from users at this stage
   */
  @JsonAdapter(CollectEnum.Adapter.class)
  public enum CollectEnum {
    CURRENTLYDUE("CurrentlyDue"),
    
    EVENTUALLYDUE("EventuallyDue");

    private String value;

    CollectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CollectEnum fromValue(String text) {
      for (CollectEnum b : CollectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CollectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CollectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CollectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CollectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Collect")
  private CollectEnum collect = null;

  /**
   * Either onboarding or edit user information
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONBOARDING("Onboarding"),
    
    UPDATE("Update");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  public StripeAccountLinkRequest stripeId(String stripeId) {
    this.stripeId = stripeId;
    return this;
  }

   /**
   * Stripe&#39;s own connected account identifier
   * @return stripeId
  **/
  @ApiModelProperty(value = "Stripe's own connected account identifier")
  public String getStripeId() {
    return stripeId;
  }

  public void setStripeId(String stripeId) {
    this.stripeId = stripeId;
  }

  public StripeAccountLinkRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * URL to be hit if link creation succeeds
   * @return returnUrl
  **/
  @ApiModelProperty(value = "URL to be hit if link creation succeeds")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public StripeAccountLinkRequest collect(CollectEnum collect) {
    this.collect = collect;
    return this;
  }

   /**
   * Which information to collect from users at this stage
   * @return collect
  **/
  @ApiModelProperty(value = "Which information to collect from users at this stage")
  public CollectEnum getCollect() {
    return collect;
  }

  public void setCollect(CollectEnum collect) {
    this.collect = collect;
  }

  public StripeAccountLinkRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Either onboarding or edit user information
   * @return type
  **/
  @ApiModelProperty(value = "Either onboarding or edit user information")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripeAccountLinkRequest stripeAccountLinkRequest = (StripeAccountLinkRequest) o;
    return Objects.equals(this.stripeId, stripeAccountLinkRequest.stripeId) &&
        Objects.equals(this.returnUrl, stripeAccountLinkRequest.returnUrl) &&
        Objects.equals(this.collect, stripeAccountLinkRequest.collect) &&
        Objects.equals(this.type, stripeAccountLinkRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stripeId, returnUrl, collect, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripeAccountLinkRequest {\n");
    
    sb.append("    stripeId: ").append(toIndentedString(stripeId)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    collect: ").append(toIndentedString(collect)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

