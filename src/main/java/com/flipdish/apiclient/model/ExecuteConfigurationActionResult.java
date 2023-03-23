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
 * Result of configuration action execution
 */
@ApiModel(description = "Result of configuration action execution")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-03-23T12:28:13.209Z")
public class ExecuteConfigurationActionResult {
  @SerializedName("ErrorMessage")
  private String errorMessage = null;

  @SerializedName("InfoMessage")
  private String infoMessage = null;

  @SerializedName("RedirectUrl")
  private String redirectUrl = null;

  /**
   * Redirect target
   */
  @JsonAdapter(RedirectTargetEnum.Adapter.class)
  public enum RedirectTargetEnum {
    DEFAULT("Default"),
    
    NEWWINDOW("NewWindow"),
    
    POPUP("Popup");

    private String value;

    RedirectTargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RedirectTargetEnum fromValue(String text) {
      for (RedirectTargetEnum b : RedirectTargetEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RedirectTargetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RedirectTargetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RedirectTargetEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RedirectTargetEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("RedirectTarget")
  private RedirectTargetEnum redirectTarget = null;

  public ExecuteConfigurationActionResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Error message to display to the user (if not empty)
   * @return errorMessage
  **/
  @ApiModelProperty(value = "Error message to display to the user (if not empty)")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ExecuteConfigurationActionResult infoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
    return this;
  }

   /**
   * Information message to display to the user (if not empty)
   * @return infoMessage
  **/
  @ApiModelProperty(value = "Information message to display to the user (if not empty)")
  public String getInfoMessage() {
    return infoMessage;
  }

  public void setInfoMessage(String infoMessage) {
    this.infoMessage = infoMessage;
  }

  public ExecuteConfigurationActionResult redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Redirect user to URL (if not empty)
   * @return redirectUrl
  **/
  @ApiModelProperty(value = "Redirect user to URL (if not empty)")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public ExecuteConfigurationActionResult redirectTarget(RedirectTargetEnum redirectTarget) {
    this.redirectTarget = redirectTarget;
    return this;
  }

   /**
   * Redirect target
   * @return redirectTarget
  **/
  @ApiModelProperty(value = "Redirect target")
  public RedirectTargetEnum getRedirectTarget() {
    return redirectTarget;
  }

  public void setRedirectTarget(RedirectTargetEnum redirectTarget) {
    this.redirectTarget = redirectTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteConfigurationActionResult executeConfigurationActionResult = (ExecuteConfigurationActionResult) o;
    return Objects.equals(this.errorMessage, executeConfigurationActionResult.errorMessage) &&
        Objects.equals(this.infoMessage, executeConfigurationActionResult.infoMessage) &&
        Objects.equals(this.redirectUrl, executeConfigurationActionResult.redirectUrl) &&
        Objects.equals(this.redirectTarget, executeConfigurationActionResult.redirectTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, infoMessage, redirectUrl, redirectTarget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteConfigurationActionResult {\n");
    
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    infoMessage: ").append(toIndentedString(infoMessage)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    redirectTarget: ").append(toIndentedString(redirectTarget)).append("\n");
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

