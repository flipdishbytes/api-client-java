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
import com.flipdish.apiclient.model.SignupStep;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Account details
 */
@ApiModel(description = "Account details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-04-02T09:34:05.773Z")
public class AccountDetail {
  @SerializedName("Email")
  private String email = null;

  @SerializedName("SignupSteps")
  private List<SignupStep> signupSteps = null;

  @SerializedName("IsVerified")
  private Boolean isVerified = null;

  @SerializedName("IsSelfServeUser")
  private Boolean isSelfServeUser = null;

  @SerializedName("AccountId")
  private Integer accountId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Language")
  private String language = null;

  @SerializedName("TimeZoneInfoId")
  private String timeZoneInfoId = null;

  @SerializedName("DisplayTimesInUserLocalTimeZone")
  private Boolean displayTimesInUserLocalTimeZone = null;

  @SerializedName("ShowHiddenFeatures")
  private Boolean showHiddenFeatures = null;

  @SerializedName("CreatedAt")
  private OffsetDateTime createdAt = null;

  public AccountDetail email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @ApiModelProperty(value = "Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountDetail signupSteps(List<SignupStep> signupSteps) {
    this.signupSteps = signupSteps;
    return this;
  }

  public AccountDetail addSignupStepsItem(SignupStep signupStepsItem) {
    if (this.signupSteps == null) {
      this.signupSteps = new ArrayList<SignupStep>();
    }
    this.signupSteps.add(signupStepsItem);
    return this;
  }

   /**
   * Signup steps
   * @return signupSteps
  **/
  @ApiModelProperty(value = "Signup steps")
  public List<SignupStep> getSignupSteps() {
    return signupSteps;
  }

  public void setSignupSteps(List<SignupStep> signupSteps) {
    this.signupSteps = signupSteps;
  }

  public AccountDetail isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Is account email verified
   * @return isVerified
  **/
  @ApiModelProperty(value = "Is account email verified")
  public Boolean isIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public AccountDetail isSelfServeUser(Boolean isSelfServeUser) {
    this.isSelfServeUser = isSelfServeUser;
    return this;
  }

   /**
   * is the account a Self Server
   * @return isSelfServeUser
  **/
  @ApiModelProperty(value = "is the account a Self Server")
  public Boolean isIsSelfServeUser() {
    return isSelfServeUser;
  }

  public void setIsSelfServeUser(Boolean isSelfServeUser) {
    this.isSelfServeUser = isSelfServeUser;
  }

  public AccountDetail accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Accounts Id
   * @return accountId
  **/
  @ApiModelProperty(value = "Accounts Id")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public AccountDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountDetail language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language Id
   * @return language
  **/
  @ApiModelProperty(value = "Language Id")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public AccountDetail timeZoneInfoId(String timeZoneInfoId) {
    this.timeZoneInfoId = timeZoneInfoId;
    return this;
  }

   /**
   * Time Zone Info Id
   * @return timeZoneInfoId
  **/
  @ApiModelProperty(value = "Time Zone Info Id")
  public String getTimeZoneInfoId() {
    return timeZoneInfoId;
  }

  public void setTimeZoneInfoId(String timeZoneInfoId) {
    this.timeZoneInfoId = timeZoneInfoId;
  }

  public AccountDetail displayTimesInUserLocalTimeZone(Boolean displayTimesInUserLocalTimeZone) {
    this.displayTimesInUserLocalTimeZone = displayTimesInUserLocalTimeZone;
    return this;
  }

   /**
   * Display the time in time zone local to the user
   * @return displayTimesInUserLocalTimeZone
  **/
  @ApiModelProperty(value = "Display the time in time zone local to the user")
  public Boolean isDisplayTimesInUserLocalTimeZone() {
    return displayTimesInUserLocalTimeZone;
  }

  public void setDisplayTimesInUserLocalTimeZone(Boolean displayTimesInUserLocalTimeZone) {
    this.displayTimesInUserLocalTimeZone = displayTimesInUserLocalTimeZone;
  }

  public AccountDetail showHiddenFeatures(Boolean showHiddenFeatures) {
    this.showHiddenFeatures = showHiddenFeatures;
    return this;
  }

   /**
   * Show hidden features
   * @return showHiddenFeatures
  **/
  @ApiModelProperty(value = "Show hidden features")
  public Boolean isShowHiddenFeatures() {
    return showHiddenFeatures;
  }

  public void setShowHiddenFeatures(Boolean showHiddenFeatures) {
    this.showHiddenFeatures = showHiddenFeatures;
  }

  public AccountDetail createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * User created at
   * @return createdAt
  **/
  @ApiModelProperty(value = "User created at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountDetail accountDetail = (AccountDetail) o;
    return Objects.equals(this.email, accountDetail.email) &&
        Objects.equals(this.signupSteps, accountDetail.signupSteps) &&
        Objects.equals(this.isVerified, accountDetail.isVerified) &&
        Objects.equals(this.isSelfServeUser, accountDetail.isSelfServeUser) &&
        Objects.equals(this.accountId, accountDetail.accountId) &&
        Objects.equals(this.name, accountDetail.name) &&
        Objects.equals(this.language, accountDetail.language) &&
        Objects.equals(this.timeZoneInfoId, accountDetail.timeZoneInfoId) &&
        Objects.equals(this.displayTimesInUserLocalTimeZone, accountDetail.displayTimesInUserLocalTimeZone) &&
        Objects.equals(this.showHiddenFeatures, accountDetail.showHiddenFeatures) &&
        Objects.equals(this.createdAt, accountDetail.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, signupSteps, isVerified, isSelfServeUser, accountId, name, language, timeZoneInfoId, displayTimesInUserLocalTimeZone, showHiddenFeatures, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetail {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    signupSteps: ").append(toIndentedString(signupSteps)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    isSelfServeUser: ").append(toIndentedString(isSelfServeUser)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeZoneInfoId: ").append(toIndentedString(timeZoneInfoId)).append("\n");
    sb.append("    displayTimesInUserLocalTimeZone: ").append(toIndentedString(displayTimesInUserLocalTimeZone)).append("\n");
    sb.append("    showHiddenFeatures: ").append(toIndentedString(showHiddenFeatures)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

