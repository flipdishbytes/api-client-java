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
import com.flipdish.apiclient.model.UserEventInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * User answered signup questions event
 */
@ApiModel(description = "User answered signup questions event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-08T14:18:50.949Z")
public class UserAnsweredSignupQuestionsEvent {
  @SerializedName("EventName")
  private String eventName = null;

  @SerializedName("User")
  private UserEventInfo user = null;

  @SerializedName("SignupAnswers")
  private String signupAnswers = null;

  @SerializedName("FlipdishEventId")
  private UUID flipdishEventId = null;

  @SerializedName("CreateTime")
  private OffsetDateTime createTime = null;

  @SerializedName("Position")
  private Integer position = null;

  @SerializedName("AppId")
  private String appId = null;

  public UserAnsweredSignupQuestionsEvent eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name
   * @return eventName
  **/
  @ApiModelProperty(value = "The event name")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public UserAnsweredSignupQuestionsEvent user(UserEventInfo user) {
    this.user = user;
    return this;
  }

   /**
   * The user
   * @return user
  **/
  @ApiModelProperty(value = "The user")
  public UserEventInfo getUser() {
    return user;
  }

  public void setUser(UserEventInfo user) {
    this.user = user;
  }

  public UserAnsweredSignupQuestionsEvent signupAnswers(String signupAnswers) {
    this.signupAnswers = signupAnswers;
    return this;
  }

   /**
   * The users answers
   * @return signupAnswers
  **/
  @ApiModelProperty(value = "The users answers")
  public String getSignupAnswers() {
    return signupAnswers;
  }

  public void setSignupAnswers(String signupAnswers) {
    this.signupAnswers = signupAnswers;
  }

  public UserAnsweredSignupQuestionsEvent flipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
    return this;
  }

   /**
   * The identitfier of the event
   * @return flipdishEventId
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "The identitfier of the event")
  public UUID getFlipdishEventId() {
    return flipdishEventId;
  }

  public void setFlipdishEventId(UUID flipdishEventId) {
    this.flipdishEventId = flipdishEventId;
  }

  public UserAnsweredSignupQuestionsEvent createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * The time of creation of the event
   * @return createTime
  **/
  @ApiModelProperty(value = "The time of creation of the event")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public UserAnsweredSignupQuestionsEvent position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Position
   * @return position
  **/
  @ApiModelProperty(value = "Position")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public UserAnsweredSignupQuestionsEvent appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App id
   * @return appId
  **/
  @ApiModelProperty(value = "App id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAnsweredSignupQuestionsEvent userAnsweredSignupQuestionsEvent = (UserAnsweredSignupQuestionsEvent) o;
    return Objects.equals(this.eventName, userAnsweredSignupQuestionsEvent.eventName) &&
        Objects.equals(this.user, userAnsweredSignupQuestionsEvent.user) &&
        Objects.equals(this.signupAnswers, userAnsweredSignupQuestionsEvent.signupAnswers) &&
        Objects.equals(this.flipdishEventId, userAnsweredSignupQuestionsEvent.flipdishEventId) &&
        Objects.equals(this.createTime, userAnsweredSignupQuestionsEvent.createTime) &&
        Objects.equals(this.position, userAnsweredSignupQuestionsEvent.position) &&
        Objects.equals(this.appId, userAnsweredSignupQuestionsEvent.appId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, user, signupAnswers, flipdishEventId, createTime, position, appId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAnsweredSignupQuestionsEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    signupAnswers: ").append(toIndentedString(signupAnswers)).append("\n");
    sb.append("    flipdishEventId: ").append(toIndentedString(flipdishEventId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
