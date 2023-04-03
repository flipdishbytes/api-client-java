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
 * Represents a website image
 */
@ApiModel(description = "Represents a website image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-03T10:31:00.711+01:00")
public class WebsiteImage {
  @SerializedName("ImageId")
  private Integer imageId = null;

  /**
   * Represents the location of the image
   */
  @JsonAdapter(ImageLocationEnum.Adapter.class)
  public enum ImageLocationEnum {
    INDEXHEADER("IndexHeader"),
    
    INDEXABOUTSECTIONLEFT("IndexAboutSectionLeft"),
    
    INDEXABOUTSECTIONRIGHT("IndexAboutSectionRight"),
    
    INDEXGALLERY("IndexGallery"),
    
    INDEXOPENINGHOURSHEADER("IndexOpeningHoursHeader"),
    
    INDEXTESTIMONIALSHEADER("IndexTestimonialsHeader");

    private String value;

    ImageLocationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageLocationEnum fromValue(String text) {
      for (ImageLocationEnum b : ImageLocationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageLocationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageLocationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageLocationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImageLocationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ImageLocation")
  private ImageLocationEnum imageLocation = null;

  @SerializedName("ImageUrl")
  private String imageUrl = null;

  public WebsiteImage imageId(Integer imageId) {
    this.imageId = imageId;
    return this;
  }

   /**
   * Represents the id of the image
   * @return imageId
  **/
  @ApiModelProperty(value = "Represents the id of the image")
  public Integer getImageId() {
    return imageId;
  }

  public void setImageId(Integer imageId) {
    this.imageId = imageId;
  }

  public WebsiteImage imageLocation(ImageLocationEnum imageLocation) {
    this.imageLocation = imageLocation;
    return this;
  }

   /**
   * Represents the location of the image
   * @return imageLocation
  **/
  @ApiModelProperty(value = "Represents the location of the image")
  public ImageLocationEnum getImageLocation() {
    return imageLocation;
  }

  public void setImageLocation(ImageLocationEnum imageLocation) {
    this.imageLocation = imageLocation;
  }

  public WebsiteImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Represents the image url
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Represents the image url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebsiteImage websiteImage = (WebsiteImage) o;
    return Objects.equals(this.imageId, websiteImage.imageId) &&
        Objects.equals(this.imageLocation, websiteImage.imageLocation) &&
        Objects.equals(this.imageUrl, websiteImage.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, imageLocation, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebsiteImage {\n");
    
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageLocation: ").append(toIndentedString(imageLocation)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

