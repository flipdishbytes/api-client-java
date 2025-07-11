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
 * AppStoreAppSupportInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class AppStoreAppSupportInfo {
  @SerializedName("PrivacyPolicy")
  private String privacyPolicy = null;

  @SerializedName("TermsOfUse")
  private String termsOfUse = null;

  @SerializedName("CompanyWebsite")
  private String companyWebsite = null;

  @SerializedName("LearnMore")
  private String learnMore = null;

  @SerializedName("InstallationMessage")
  private String installationMessage = null;

  @SerializedName("SupportEmail")
  private String supportEmail = null;

  public AppStoreAppSupportInfo privacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
    return this;
  }

   /**
   * Get privacyPolicy
   * @return privacyPolicy
  **/
  @ApiModelProperty(value = "")
  public String getPrivacyPolicy() {
    return privacyPolicy;
  }

  public void setPrivacyPolicy(String privacyPolicy) {
    this.privacyPolicy = privacyPolicy;
  }

  public AppStoreAppSupportInfo termsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
    return this;
  }

   /**
   * Get termsOfUse
   * @return termsOfUse
  **/
  @ApiModelProperty(value = "")
  public String getTermsOfUse() {
    return termsOfUse;
  }

  public void setTermsOfUse(String termsOfUse) {
    this.termsOfUse = termsOfUse;
  }

  public AppStoreAppSupportInfo companyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
    return this;
  }

   /**
   * Get companyWebsite
   * @return companyWebsite
  **/
  @ApiModelProperty(value = "")
  public String getCompanyWebsite() {
    return companyWebsite;
  }

  public void setCompanyWebsite(String companyWebsite) {
    this.companyWebsite = companyWebsite;
  }

  public AppStoreAppSupportInfo learnMore(String learnMore) {
    this.learnMore = learnMore;
    return this;
  }

   /**
   * Get learnMore
   * @return learnMore
  **/
  @ApiModelProperty(value = "")
  public String getLearnMore() {
    return learnMore;
  }

  public void setLearnMore(String learnMore) {
    this.learnMore = learnMore;
  }

  public AppStoreAppSupportInfo installationMessage(String installationMessage) {
    this.installationMessage = installationMessage;
    return this;
  }

   /**
   * Get installationMessage
   * @return installationMessage
  **/
  @ApiModelProperty(value = "")
  public String getInstallationMessage() {
    return installationMessage;
  }

  public void setInstallationMessage(String installationMessage) {
    this.installationMessage = installationMessage;
  }

  public AppStoreAppSupportInfo supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * Get supportEmail
   * @return supportEmail
  **/
  @ApiModelProperty(value = "")
  public String getSupportEmail() {
    return supportEmail;
  }

  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreAppSupportInfo appStoreAppSupportInfo = (AppStoreAppSupportInfo) o;
    return Objects.equals(this.privacyPolicy, appStoreAppSupportInfo.privacyPolicy) &&
        Objects.equals(this.termsOfUse, appStoreAppSupportInfo.termsOfUse) &&
        Objects.equals(this.companyWebsite, appStoreAppSupportInfo.companyWebsite) &&
        Objects.equals(this.learnMore, appStoreAppSupportInfo.learnMore) &&
        Objects.equals(this.installationMessage, appStoreAppSupportInfo.installationMessage) &&
        Objects.equals(this.supportEmail, appStoreAppSupportInfo.supportEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privacyPolicy, termsOfUse, companyWebsite, learnMore, installationMessage, supportEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppSupportInfo {\n");
    
    sb.append("    privacyPolicy: ").append(toIndentedString(privacyPolicy)).append("\n");
    sb.append("    termsOfUse: ").append(toIndentedString(termsOfUse)).append("\n");
    sb.append("    companyWebsite: ").append(toIndentedString(companyWebsite)).append("\n");
    sb.append("    learnMore: ").append(toIndentedString(learnMore)).append("\n");
    sb.append("    installationMessage: ").append(toIndentedString(installationMessage)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
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

