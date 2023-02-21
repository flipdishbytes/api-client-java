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
import java.util.ArrayList;
import java.util.List;

/**
 * Payout Request ids for filtering on Payouts
 */
@ApiModel(description = "Payout Request ids for filtering on Payouts")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-21T10:47:00.453Z")
public class PayoutRequestIds {
  @SerializedName("BankAccountIds")
  private List<Integer> bankAccountIds = null;

  /**
   * Gets or Sets states
   */
  @JsonAdapter(StatesEnum.Adapter.class)
  public enum StatesEnum {
    PENDING("Pending"),
    
    INTRANSIT("InTransit"),
    
    PAID("Paid"),
    
    FAILED("Failed"),
    
    CANCELLED("Cancelled");

    private String value;

    StatesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatesEnum fromValue(String text) {
      for (StatesEnum b : StatesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("States")
  private List<StatesEnum> states = null;

  public PayoutRequestIds bankAccountIds(List<Integer> bankAccountIds) {
    this.bankAccountIds = bankAccountIds;
    return this;
  }

  public PayoutRequestIds addBankAccountIdsItem(Integer bankAccountIdsItem) {
    if (this.bankAccountIds == null) {
      this.bankAccountIds = new ArrayList<Integer>();
    }
    this.bankAccountIds.add(bankAccountIdsItem);
    return this;
  }

   /**
   * List of bank account ids to search for
   * @return bankAccountIds
  **/
  @ApiModelProperty(value = "List of bank account ids to search for")
  public List<Integer> getBankAccountIds() {
    return bankAccountIds;
  }

  public void setBankAccountIds(List<Integer> bankAccountIds) {
    this.bankAccountIds = bankAccountIds;
  }

  public PayoutRequestIds states(List<StatesEnum> states) {
    this.states = states;
    return this;
  }

  public PayoutRequestIds addStatesItem(StatesEnum statesItem) {
    if (this.states == null) {
      this.states = new ArrayList<StatesEnum>();
    }
    this.states.add(statesItem);
    return this;
  }

   /**
   * List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for
   * @return states
  **/
  @ApiModelProperty(value = "List of {Flipdish.PublicModels.V1.Payouts.PayoutStatus} so search for")
  public List<StatesEnum> getStates() {
    return states;
  }

  public void setStates(List<StatesEnum> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayoutRequestIds payoutRequestIds = (PayoutRequestIds) o;
    return Objects.equals(this.bankAccountIds, payoutRequestIds.bankAccountIds) &&
        Objects.equals(this.states, payoutRequestIds.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccountIds, states);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayoutRequestIds {\n");
    
    sb.append("    bankAccountIds: ").append(toIndentedString(bankAccountIds)).append("\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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

