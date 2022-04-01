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
import com.flipdish.apiclient.model.PredefinedAnswer;
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

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-01T10:49:40.428+01:00")
public class SignupStep {
  /**
   * Action needs to take
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    QUESTION("Question"),
    
    STORELOCATION("StoreLocation"),
    
    PAYMENTSUBSCRIPTION("PaymentSubscription");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Action")
  private ActionEnum action = null;

  @SerializedName("Question")
  private String question = null;

  @SerializedName("PredefinedAnswers")
  private List<PredefinedAnswer> predefinedAnswers = null;

  public SignupStep action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Action needs to take
   * @return action
  **/
  @ApiModelProperty(value = "Action needs to take")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public SignupStep question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Question in case Action &#x3D;&#x3D; Question
   * @return question
  **/
  @ApiModelProperty(value = "Question in case Action == Question")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public SignupStep predefinedAnswers(List<PredefinedAnswer> predefinedAnswers) {
    this.predefinedAnswers = predefinedAnswers;
    return this;
  }

  public SignupStep addPredefinedAnswersItem(PredefinedAnswer predefinedAnswersItem) {
    if (this.predefinedAnswers == null) {
      this.predefinedAnswers = new ArrayList<PredefinedAnswer>();
    }
    this.predefinedAnswers.add(predefinedAnswersItem);
    return this;
  }

   /**
   * Predefined answer in case Action &#x3D;&#x3D; Question
   * @return predefinedAnswers
  **/
  @ApiModelProperty(value = "Predefined answer in case Action == Question")
  public List<PredefinedAnswer> getPredefinedAnswers() {
    return predefinedAnswers;
  }

  public void setPredefinedAnswers(List<PredefinedAnswer> predefinedAnswers) {
    this.predefinedAnswers = predefinedAnswers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupStep signupStep = (SignupStep) o;
    return Objects.equals(this.action, signupStep.action) &&
        Objects.equals(this.question, signupStep.question) &&
        Objects.equals(this.predefinedAnswers, signupStep.predefinedAnswers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, question, predefinedAnswers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupStep {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    predefinedAnswers: ").append(toIndentedString(predefinedAnswers)).append("\n");
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

