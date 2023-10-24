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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-10-24T12:01:02.196Z")
public class BankAccountCreate {
  @SerializedName("BankAddress")
  private String bankAddress = null;

  @SerializedName("BankCountryCode")
  private String bankCountryCode = null;

  @SerializedName("AccountHolderAddress")
  private String accountHolderAddress = null;

  @SerializedName("AccountHolderCountryCode")
  private String accountHolderCountryCode = null;

  @SerializedName("VatNumber")
  private String vatNumber = null;

  /**
   * Currency of Account
   */
  @JsonAdapter(CurrencyCodeEnum.Adapter.class)
  public enum CurrencyCodeEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    GBP("GBP"),
    
    CAD("CAD"),
    
    AUD("AUD"),
    
    DJF("DJF"),
    
    ZAR("ZAR"),
    
    ETB("ETB"),
    
    AED("AED"),
    
    BHD("BHD"),
    
    DZD("DZD"),
    
    EGP("EGP"),
    
    IQD("IQD"),
    
    JOD("JOD"),
    
    KWD("KWD"),
    
    LBP("LBP"),
    
    LYD("LYD"),
    
    MAD("MAD"),
    
    OMR("OMR"),
    
    QAR("QAR"),
    
    SAR("SAR"),
    
    SYP("SYP"),
    
    TND("TND"),
    
    YER("YER"),
    
    CLP("CLP"),
    
    INR("INR"),
    
    AZN("AZN"),
    
    RUB("RUB"),
    
    BYN("BYN"),
    
    BGN("BGN"),
    
    NGN("NGN"),
    
    BDT("BDT"),
    
    CNY("CNY"),
    
    BAM("BAM"),
    
    CZK("CZK"),
    
    DKK("DKK"),
    
    CHF("CHF"),
    
    MVR("MVR"),
    
    BTN("BTN"),
    
    XCD("XCD"),
    
    BZD("BZD"),
    
    HKD("HKD"),
    
    IDR("IDR"),
    
    JMD("JMD"),
    
    MYR("MYR"),
    
    NZD("NZD"),
    
    PHP("PHP"),
    
    SGD("SGD"),
    
    TTD("TTD"),
    
    XDR("XDR"),
    
    ARS("ARS"),
    
    BOB("BOB"),
    
    COP("COP"),
    
    CRC("CRC"),
    
    CUP("CUP"),
    
    DOP("DOP"),
    
    GTQ("GTQ"),
    
    HNL("HNL"),
    
    MXN("MXN"),
    
    NIO("NIO"),
    
    PAB("PAB"),
    
    PEN("PEN"),
    
    PYG("PYG"),
    
    UYU("UYU"),
    
    VEF("VEF"),
    
    IRR("IRR"),
    
    XOF("XOF"),
    
    CDF("CDF"),
    
    XAF("XAF"),
    
    HTG("HTG"),
    
    ILS("ILS"),
    
    HRK("HRK"),
    
    HUF("HUF"),
    
    AMD("AMD"),
    
    ISK("ISK"),
    
    JPY("JPY"),
    
    GEL("GEL"),
    
    KZT("KZT"),
    
    KHR("KHR"),
    
    KRW("KRW"),
    
    KGS("KGS"),
    
    LAK("LAK"),
    
    MKD("MKD"),
    
    MNT("MNT"),
    
    BND("BND"),
    
    MMK("MMK"),
    
    NOK("NOK"),
    
    NPR("NPR"),
    
    PKR("PKR"),
    
    PLN("PLN"),
    
    AFN("AFN"),
    
    BRL("BRL"),
    
    MDL("MDL"),
    
    RON("RON"),
    
    RWF("RWF"),
    
    SEK("SEK"),
    
    LKR("LKR"),
    
    SOS("SOS"),
    
    ALL("ALL"),
    
    RSD("RSD"),
    
    KES("KES"),
    
    TJS("TJS"),
    
    THB("THB"),
    
    ERN("ERN"),
    
    TMT("TMT"),
    
    BWP("BWP"),
    
    TRY("TRY"),
    
    UAH("UAH"),
    
    UZS("UZS"),
    
    VND("VND"),
    
    MOP("MOP"),
    
    TWD("TWD"),
    
    BMD("BMD");

    private String value;

    CurrencyCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrencyCodeEnum fromValue(String text) {
      for (CurrencyCodeEnum b : CurrencyCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CurrencyCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrencyCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrencyCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrencyCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CurrencyCode")
  private CurrencyCodeEnum currencyCode = null;

  @SerializedName("StoreIds")
  private List<Integer> storeIds = null;

  @SerializedName("BankName")
  private String bankName = null;

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

  public BankAccountCreate bankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

   /**
   * Address lf the bank
   * @return bankAddress
  **/
  @ApiModelProperty(value = "Address lf the bank")
  public String getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }

  public BankAccountCreate bankCountryCode(String bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
    return this;
  }

   /**
   * CountryCode of the Bank Account
   * @return bankCountryCode
  **/
  @ApiModelProperty(value = "CountryCode of the Bank Account")
  public String getBankCountryCode() {
    return bankCountryCode;
  }

  public void setBankCountryCode(String bankCountryCode) {
    this.bankCountryCode = bankCountryCode;
  }

  public BankAccountCreate accountHolderAddress(String accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
    return this;
  }

   /**
   * Account Holders Address
   * @return accountHolderAddress
  **/
  @ApiModelProperty(value = "Account Holders Address")
  public String getAccountHolderAddress() {
    return accountHolderAddress;
  }

  public void setAccountHolderAddress(String accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
  }

  public BankAccountCreate accountHolderCountryCode(String accountHolderCountryCode) {
    this.accountHolderCountryCode = accountHolderCountryCode;
    return this;
  }

   /**
   * Account Holders Country Code
   * @return accountHolderCountryCode
  **/
  @ApiModelProperty(value = "Account Holders Country Code")
  public String getAccountHolderCountryCode() {
    return accountHolderCountryCode;
  }

  public void setAccountHolderCountryCode(String accountHolderCountryCode) {
    this.accountHolderCountryCode = accountHolderCountryCode;
  }

  public BankAccountCreate vatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
    return this;
  }

   /**
   * Account Holders Vat Number
   * @return vatNumber
  **/
  @ApiModelProperty(value = "Account Holders Vat Number")
  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public BankAccountCreate currencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency of Account
   * @return currencyCode
  **/
  @ApiModelProperty(value = "Currency of Account")
  public CurrencyCodeEnum getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCodeEnum currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BankAccountCreate storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public BankAccountCreate addStoreIdsItem(Integer storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<Integer>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * List of stores to attach to Account
   * @return storeIds
  **/
  @ApiModelProperty(value = "List of stores to attach to Account")
  public List<Integer> getStoreIds() {
    return storeIds;
  }

  public void setStoreIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
  }

  public BankAccountCreate bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Name of Bank
   * @return bankName
  **/
  @ApiModelProperty(value = "Name of Bank")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public BankAccountCreate accountName(String accountName) {
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

  public BankAccountCreate iban(String iban) {
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

  public BankAccountCreate swift(String swift) {
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

  public BankAccountCreate nationalClearingCode(String nationalClearingCode) {
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

  public BankAccountCreate populatedAccountFields(List<AccountFieldKeyValuePair> populatedAccountFields) {
    this.populatedAccountFields = populatedAccountFields;
    return this;
  }

  public BankAccountCreate addPopulatedAccountFieldsItem(AccountFieldKeyValuePair populatedAccountFieldsItem) {
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

  public BankAccountCreate rejectionReason(String rejectionReason) {
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

  public BankAccountCreate businessType(BusinessTypeEnum businessType) {
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
    BankAccountCreate bankAccountCreate = (BankAccountCreate) o;
    return Objects.equals(this.bankAddress, bankAccountCreate.bankAddress) &&
        Objects.equals(this.bankCountryCode, bankAccountCreate.bankCountryCode) &&
        Objects.equals(this.accountHolderAddress, bankAccountCreate.accountHolderAddress) &&
        Objects.equals(this.accountHolderCountryCode, bankAccountCreate.accountHolderCountryCode) &&
        Objects.equals(this.vatNumber, bankAccountCreate.vatNumber) &&
        Objects.equals(this.currencyCode, bankAccountCreate.currencyCode) &&
        Objects.equals(this.storeIds, bankAccountCreate.storeIds) &&
        Objects.equals(this.bankName, bankAccountCreate.bankName) &&
        Objects.equals(this.accountName, bankAccountCreate.accountName) &&
        Objects.equals(this.iban, bankAccountCreate.iban) &&
        Objects.equals(this.swift, bankAccountCreate.swift) &&
        Objects.equals(this.nationalClearingCode, bankAccountCreate.nationalClearingCode) &&
        Objects.equals(this.populatedAccountFields, bankAccountCreate.populatedAccountFields) &&
        Objects.equals(this.rejectionReason, bankAccountCreate.rejectionReason) &&
        Objects.equals(this.businessType, bankAccountCreate.businessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAddress, bankCountryCode, accountHolderAddress, accountHolderCountryCode, vatNumber, currencyCode, storeIds, bankName, accountName, iban, swift, nationalClearingCode, populatedAccountFields, rejectionReason, businessType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountCreate {\n");
    
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    accountHolderAddress: ").append(toIndentedString(accountHolderAddress)).append("\n");
    sb.append("    accountHolderCountryCode: ").append(toIndentedString(accountHolderCountryCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
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

