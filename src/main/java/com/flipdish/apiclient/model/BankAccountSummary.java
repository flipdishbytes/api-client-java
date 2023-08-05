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
import com.flipdish.apiclient.model.AccountFieldKeyValuePair;
import com.flipdish.apiclient.model.StripeConnectedAccountInfo;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-08-05T11:32:36.536+01:00")
public class BankAccountSummary {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("StoreNames")
  private List<String> storeNames = null;

  /**
   * Status of Account
   */
  @JsonAdapter(AccountStateEnum.Adapter.class)
  public enum AccountStateEnum {
    UNVERIFIED("Unverified"),
    
    AWATINGVERIFICATION("AwatingVerification"),
    
    VERIFIED("Verified"),
    
    GRANDFATHERED("Grandfathered");

    private String value;

    AccountStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountStateEnum fromValue(String text) {
      for (AccountStateEnum b : AccountStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("AccountState")
  private AccountStateEnum accountState = null;

  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("StripeConnectedAccountInfo")
  private StripeConnectedAccountInfo stripeConnectedAccountInfo = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("Iban")
  private String iban = null;

  @SerializedName("Swift")
  private String swift = null;

  @SerializedName("NationalClearingCode")
  private String nationalClearingCode = null;

  @SerializedName("PopulatedAccountFields")
  private List<AccountFieldKeyValuePair> populatedAccountFields = null;

  @SerializedName("RejectionReason")
  private String rejectionReason = null;

  /**
   * Business Type
   */
  @JsonAdapter(BusinessTypeEnum.Adapter.class)
  public enum BusinessTypeEnum {
    INDIVIDUAL("Individual"),
    
    COMPANY("Company"),
    
    NONPROFIT("NonProfit"),
    
    GOVERNMENTENTITY("GovernmentEntity");

    private String value;

    BusinessTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BusinessTypeEnum fromValue(String text) {
      for (BusinessTypeEnum b : BusinessTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BusinessTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BusinessTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BusinessTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BusinessTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("BusinessType")
  private BusinessTypeEnum businessType = null;

  public BankAccountSummary id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of this account
   * @return id
  **/
  @ApiModelProperty(value = "Id of this account")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public BankAccountSummary storeNames(List<String> storeNames) {
    this.storeNames = storeNames;
    return this;
  }

  public BankAccountSummary addStoreNamesItem(String storeNamesItem) {
    if (this.storeNames == null) {
      this.storeNames = new ArrayList<String>();
    }
    this.storeNames.add(storeNamesItem);
    return this;
  }

   /**
   * Store Names that are attached to this account
   * @return storeNames
  **/
  @ApiModelProperty(value = "Store Names that are attached to this account")
  public List<String> getStoreNames() {
    return storeNames;
  }

  public void setStoreNames(List<String> storeNames) {
    this.storeNames = storeNames;
  }

  public BankAccountSummary accountState(AccountStateEnum accountState) {
    this.accountState = accountState;
    return this;
  }

   /**
   * Status of Account
   * @return accountState
  **/
  @ApiModelProperty(value = "Status of Account")
  public AccountStateEnum getAccountState() {
    return accountState;
  }

  public void setAccountState(AccountStateEnum accountState) {
    this.accountState = accountState;
  }

  public BankAccountSummary currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency of Account
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Currency of Account")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BankAccountSummary stripeConnectedAccountInfo(StripeConnectedAccountInfo stripeConnectedAccountInfo) {
    this.stripeConnectedAccountInfo = stripeConnectedAccountInfo;
    return this;
  }

   /**
   * Information about the Stripe connected account associated with this bank account (if any)
   * @return stripeConnectedAccountInfo
  **/
  @ApiModelProperty(value = "Information about the Stripe connected account associated with this bank account (if any)")
  public StripeConnectedAccountInfo getStripeConnectedAccountInfo() {
    return stripeConnectedAccountInfo;
  }

  public void setStripeConnectedAccountInfo(StripeConnectedAccountInfo stripeConnectedAccountInfo) {
    this.stripeConnectedAccountInfo = stripeConnectedAccountInfo;
  }

  public BankAccountSummary accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Name of this account
   * @return accountName
  **/
  @ApiModelProperty(value = "Name of this account")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public BankAccountSummary iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN of this account
   * @return iban
  **/
  @ApiModelProperty(value = "IBAN of this account")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public BankAccountSummary swift(String swift) {
    this.swift = swift;
    return this;
  }

   /**
   * SWIFT of this bank account
   * @return swift
  **/
  @ApiModelProperty(value = "SWIFT of this bank account")
  public String getSwift() {
    return swift;
  }

  public void setSwift(String swift) {
    this.swift = swift;
  }

  public BankAccountSummary nationalClearingCode(String nationalClearingCode) {
    this.nationalClearingCode = nationalClearingCode;
    return this;
  }

   /**
   * National Clearing Code (BSB in Australia, Routing Number in USA/Canada, NCC in NZ)
   * @return nationalClearingCode
  **/
  @ApiModelProperty(value = "National Clearing Code (BSB in Australia, Routing Number in USA/Canada, NCC in NZ)")
  public String getNationalClearingCode() {
    return nationalClearingCode;
  }

  public void setNationalClearingCode(String nationalClearingCode) {
    this.nationalClearingCode = nationalClearingCode;
  }

  public BankAccountSummary populatedAccountFields(List<AccountFieldKeyValuePair> populatedAccountFields) {
    this.populatedAccountFields = populatedAccountFields;
    return this;
  }

  public BankAccountSummary addPopulatedAccountFieldsItem(AccountFieldKeyValuePair populatedAccountFieldsItem) {
    if (this.populatedAccountFields == null) {
      this.populatedAccountFields = new ArrayList<AccountFieldKeyValuePair>();
    }
    this.populatedAccountFields.add(populatedAccountFieldsItem);
    return this;
  }

   /**
   * A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields will be ignored.
   * @return populatedAccountFields
  **/
  @ApiModelProperty(value = "A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields will be ignored.")
  public List<AccountFieldKeyValuePair> getPopulatedAccountFields() {
    return populatedAccountFields;
  }

  public void setPopulatedAccountFields(List<AccountFieldKeyValuePair> populatedAccountFields) {
    this.populatedAccountFields = populatedAccountFields;
  }

  public BankAccountSummary rejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * Reason for Rejection
   * @return rejectionReason
  **/
  @ApiModelProperty(value = "Reason for Rejection")
  public String getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  public BankAccountSummary businessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
    return this;
  }

   /**
   * Business Type
   * @return businessType
  **/
  @ApiModelProperty(value = "Business Type")
  public BusinessTypeEnum getBusinessType() {
    return businessType;
  }

  public void setBusinessType(BusinessTypeEnum businessType) {
    this.businessType = businessType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountSummary bankAccountSummary = (BankAccountSummary) o;
    return Objects.equals(this.id, bankAccountSummary.id) &&
        Objects.equals(this.storeNames, bankAccountSummary.storeNames) &&
        Objects.equals(this.accountState, bankAccountSummary.accountState) &&
        Objects.equals(this.currencyCode, bankAccountSummary.currencyCode) &&
        Objects.equals(this.stripeConnectedAccountInfo, bankAccountSummary.stripeConnectedAccountInfo) &&
        Objects.equals(this.accountName, bankAccountSummary.accountName) &&
        Objects.equals(this.iban, bankAccountSummary.iban) &&
        Objects.equals(this.swift, bankAccountSummary.swift) &&
        Objects.equals(this.nationalClearingCode, bankAccountSummary.nationalClearingCode) &&
        Objects.equals(this.populatedAccountFields, bankAccountSummary.populatedAccountFields) &&
        Objects.equals(this.rejectionReason, bankAccountSummary.rejectionReason) &&
        Objects.equals(this.businessType, bankAccountSummary.businessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, storeNames, accountState, currencyCode, stripeConnectedAccountInfo, accountName, iban, swift, nationalClearingCode, populatedAccountFields, rejectionReason, businessType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    storeNames: ").append(toIndentedString(storeNames)).append("\n");
    sb.append("    accountState: ").append(toIndentedString(accountState)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    stripeConnectedAccountInfo: ").append(toIndentedString(stripeConnectedAccountInfo)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
    sb.append("    nationalClearingCode: ").append(toIndentedString(nationalClearingCode)).append("\n");
    sb.append("    populatedAccountFields: ").append(toIndentedString(populatedAccountFields)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
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

