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
 * Base of Index Page
 */
@ApiModel(description = "Base of Index Page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class IndexPageBase {
  @SerializedName("AboutSectionEnabled")
  private Boolean aboutSectionEnabled = null;

  @SerializedName("AboutSectionTitle")
  private String aboutSectionTitle = null;

  @SerializedName("AboutSectionSubtitle")
  private String aboutSectionSubtitle = null;

  @SerializedName("AboutSectionLeftTitle")
  private String aboutSectionLeftTitle = null;

  @SerializedName("AboutSectionLeftBody")
  private String aboutSectionLeftBody = null;

  @SerializedName("AboutSectionRightTitle")
  private String aboutSectionRightTitle = null;

  @SerializedName("AboutSectionRightBody")
  private String aboutSectionRightBody = null;

  @SerializedName("OpeningHoursEnabled")
  private Boolean openingHoursEnabled = null;

  @SerializedName("MenuPreviewEnabled")
  private Boolean menuPreviewEnabled = null;

  @SerializedName("GalleryEnabled")
  private Boolean galleryEnabled = null;

  @SerializedName("TestimonialsEnabled")
  private Boolean testimonialsEnabled = null;

  @SerializedName("ContactFormEnabled")
  private Boolean contactFormEnabled = null;

  @SerializedName("ContactFormEmail")
  private String contactFormEmail = null;

  @SerializedName("MapEnabled")
  private Boolean mapEnabled = null;

  public IndexPageBase aboutSectionEnabled(Boolean aboutSectionEnabled) {
    this.aboutSectionEnabled = aboutSectionEnabled;
    return this;
  }

   /**
   * About section enabled
   * @return aboutSectionEnabled
  **/
  @ApiModelProperty(value = "About section enabled")
  public Boolean isAboutSectionEnabled() {
    return aboutSectionEnabled;
  }

  public void setAboutSectionEnabled(Boolean aboutSectionEnabled) {
    this.aboutSectionEnabled = aboutSectionEnabled;
  }

  public IndexPageBase aboutSectionTitle(String aboutSectionTitle) {
    this.aboutSectionTitle = aboutSectionTitle;
    return this;
  }

   /**
   * About section title
   * @return aboutSectionTitle
  **/
  @ApiModelProperty(value = "About section title")
  public String getAboutSectionTitle() {
    return aboutSectionTitle;
  }

  public void setAboutSectionTitle(String aboutSectionTitle) {
    this.aboutSectionTitle = aboutSectionTitle;
  }

  public IndexPageBase aboutSectionSubtitle(String aboutSectionSubtitle) {
    this.aboutSectionSubtitle = aboutSectionSubtitle;
    return this;
  }

   /**
   * About section sub-title
   * @return aboutSectionSubtitle
  **/
  @ApiModelProperty(value = "About section sub-title")
  public String getAboutSectionSubtitle() {
    return aboutSectionSubtitle;
  }

  public void setAboutSectionSubtitle(String aboutSectionSubtitle) {
    this.aboutSectionSubtitle = aboutSectionSubtitle;
  }

  public IndexPageBase aboutSectionLeftTitle(String aboutSectionLeftTitle) {
    this.aboutSectionLeftTitle = aboutSectionLeftTitle;
    return this;
  }

   /**
   * About section title left
   * @return aboutSectionLeftTitle
  **/
  @ApiModelProperty(value = "About section title left")
  public String getAboutSectionLeftTitle() {
    return aboutSectionLeftTitle;
  }

  public void setAboutSectionLeftTitle(String aboutSectionLeftTitle) {
    this.aboutSectionLeftTitle = aboutSectionLeftTitle;
  }

  public IndexPageBase aboutSectionLeftBody(String aboutSectionLeftBody) {
    this.aboutSectionLeftBody = aboutSectionLeftBody;
    return this;
  }

   /**
   * About section text left
   * @return aboutSectionLeftBody
  **/
  @ApiModelProperty(value = "About section text left")
  public String getAboutSectionLeftBody() {
    return aboutSectionLeftBody;
  }

  public void setAboutSectionLeftBody(String aboutSectionLeftBody) {
    this.aboutSectionLeftBody = aboutSectionLeftBody;
  }

  public IndexPageBase aboutSectionRightTitle(String aboutSectionRightTitle) {
    this.aboutSectionRightTitle = aboutSectionRightTitle;
    return this;
  }

   /**
   * About section title right
   * @return aboutSectionRightTitle
  **/
  @ApiModelProperty(value = "About section title right")
  public String getAboutSectionRightTitle() {
    return aboutSectionRightTitle;
  }

  public void setAboutSectionRightTitle(String aboutSectionRightTitle) {
    this.aboutSectionRightTitle = aboutSectionRightTitle;
  }

  public IndexPageBase aboutSectionRightBody(String aboutSectionRightBody) {
    this.aboutSectionRightBody = aboutSectionRightBody;
    return this;
  }

   /**
   * About section text right
   * @return aboutSectionRightBody
  **/
  @ApiModelProperty(value = "About section text right")
  public String getAboutSectionRightBody() {
    return aboutSectionRightBody;
  }

  public void setAboutSectionRightBody(String aboutSectionRightBody) {
    this.aboutSectionRightBody = aboutSectionRightBody;
  }

  public IndexPageBase openingHoursEnabled(Boolean openingHoursEnabled) {
    this.openingHoursEnabled = openingHoursEnabled;
    return this;
  }

   /**
   * Opening hours section Enabled
   * @return openingHoursEnabled
  **/
  @ApiModelProperty(value = "Opening hours section Enabled")
  public Boolean isOpeningHoursEnabled() {
    return openingHoursEnabled;
  }

  public void setOpeningHoursEnabled(Boolean openingHoursEnabled) {
    this.openingHoursEnabled = openingHoursEnabled;
  }

  public IndexPageBase menuPreviewEnabled(Boolean menuPreviewEnabled) {
    this.menuPreviewEnabled = menuPreviewEnabled;
    return this;
  }

   /**
   * Menu Preview section Enabled
   * @return menuPreviewEnabled
  **/
  @ApiModelProperty(value = "Menu Preview section Enabled")
  public Boolean isMenuPreviewEnabled() {
    return menuPreviewEnabled;
  }

  public void setMenuPreviewEnabled(Boolean menuPreviewEnabled) {
    this.menuPreviewEnabled = menuPreviewEnabled;
  }

  public IndexPageBase galleryEnabled(Boolean galleryEnabled) {
    this.galleryEnabled = galleryEnabled;
    return this;
  }

   /**
   * Gallery section enabled
   * @return galleryEnabled
  **/
  @ApiModelProperty(value = "Gallery section enabled")
  public Boolean isGalleryEnabled() {
    return galleryEnabled;
  }

  public void setGalleryEnabled(Boolean galleryEnabled) {
    this.galleryEnabled = galleryEnabled;
  }

  public IndexPageBase testimonialsEnabled(Boolean testimonialsEnabled) {
    this.testimonialsEnabled = testimonialsEnabled;
    return this;
  }

   /**
   * Testimonials section Enabled
   * @return testimonialsEnabled
  **/
  @ApiModelProperty(value = "Testimonials section Enabled")
  public Boolean isTestimonialsEnabled() {
    return testimonialsEnabled;
  }

  public void setTestimonialsEnabled(Boolean testimonialsEnabled) {
    this.testimonialsEnabled = testimonialsEnabled;
  }

  public IndexPageBase contactFormEnabled(Boolean contactFormEnabled) {
    this.contactFormEnabled = contactFormEnabled;
    return this;
  }

   /**
   * Contact Form section Enabled
   * @return contactFormEnabled
  **/
  @ApiModelProperty(value = "Contact Form section Enabled")
  public Boolean isContactFormEnabled() {
    return contactFormEnabled;
  }

  public void setContactFormEnabled(Boolean contactFormEnabled) {
    this.contactFormEnabled = contactFormEnabled;
  }

  public IndexPageBase contactFormEmail(String contactFormEmail) {
    this.contactFormEmail = contactFormEmail;
    return this;
  }

   /**
   * Contact Form Email
   * @return contactFormEmail
  **/
  @ApiModelProperty(value = "Contact Form Email")
  public String getContactFormEmail() {
    return contactFormEmail;
  }

  public void setContactFormEmail(String contactFormEmail) {
    this.contactFormEmail = contactFormEmail;
  }

  public IndexPageBase mapEnabled(Boolean mapEnabled) {
    this.mapEnabled = mapEnabled;
    return this;
  }

   /**
   * Map section Enabled
   * @return mapEnabled
  **/
  @ApiModelProperty(value = "Map section Enabled")
  public Boolean isMapEnabled() {
    return mapEnabled;
  }

  public void setMapEnabled(Boolean mapEnabled) {
    this.mapEnabled = mapEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexPageBase indexPageBase = (IndexPageBase) o;
    return Objects.equals(this.aboutSectionEnabled, indexPageBase.aboutSectionEnabled) &&
        Objects.equals(this.aboutSectionTitle, indexPageBase.aboutSectionTitle) &&
        Objects.equals(this.aboutSectionSubtitle, indexPageBase.aboutSectionSubtitle) &&
        Objects.equals(this.aboutSectionLeftTitle, indexPageBase.aboutSectionLeftTitle) &&
        Objects.equals(this.aboutSectionLeftBody, indexPageBase.aboutSectionLeftBody) &&
        Objects.equals(this.aboutSectionRightTitle, indexPageBase.aboutSectionRightTitle) &&
        Objects.equals(this.aboutSectionRightBody, indexPageBase.aboutSectionRightBody) &&
        Objects.equals(this.openingHoursEnabled, indexPageBase.openingHoursEnabled) &&
        Objects.equals(this.menuPreviewEnabled, indexPageBase.menuPreviewEnabled) &&
        Objects.equals(this.galleryEnabled, indexPageBase.galleryEnabled) &&
        Objects.equals(this.testimonialsEnabled, indexPageBase.testimonialsEnabled) &&
        Objects.equals(this.contactFormEnabled, indexPageBase.contactFormEnabled) &&
        Objects.equals(this.contactFormEmail, indexPageBase.contactFormEmail) &&
        Objects.equals(this.mapEnabled, indexPageBase.mapEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aboutSectionEnabled, aboutSectionTitle, aboutSectionSubtitle, aboutSectionLeftTitle, aboutSectionLeftBody, aboutSectionRightTitle, aboutSectionRightBody, openingHoursEnabled, menuPreviewEnabled, galleryEnabled, testimonialsEnabled, contactFormEnabled, contactFormEmail, mapEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexPageBase {\n");
    
    sb.append("    aboutSectionEnabled: ").append(toIndentedString(aboutSectionEnabled)).append("\n");
    sb.append("    aboutSectionTitle: ").append(toIndentedString(aboutSectionTitle)).append("\n");
    sb.append("    aboutSectionSubtitle: ").append(toIndentedString(aboutSectionSubtitle)).append("\n");
    sb.append("    aboutSectionLeftTitle: ").append(toIndentedString(aboutSectionLeftTitle)).append("\n");
    sb.append("    aboutSectionLeftBody: ").append(toIndentedString(aboutSectionLeftBody)).append("\n");
    sb.append("    aboutSectionRightTitle: ").append(toIndentedString(aboutSectionRightTitle)).append("\n");
    sb.append("    aboutSectionRightBody: ").append(toIndentedString(aboutSectionRightBody)).append("\n");
    sb.append("    openingHoursEnabled: ").append(toIndentedString(openingHoursEnabled)).append("\n");
    sb.append("    menuPreviewEnabled: ").append(toIndentedString(menuPreviewEnabled)).append("\n");
    sb.append("    galleryEnabled: ").append(toIndentedString(galleryEnabled)).append("\n");
    sb.append("    testimonialsEnabled: ").append(toIndentedString(testimonialsEnabled)).append("\n");
    sb.append("    contactFormEnabled: ").append(toIndentedString(contactFormEnabled)).append("\n");
    sb.append("    contactFormEmail: ").append(toIndentedString(contactFormEmail)).append("\n");
    sb.append("    mapEnabled: ").append(toIndentedString(mapEnabled)).append("\n");
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
