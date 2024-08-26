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
 * BANK ACCOUNT
 */
@ApiModel(description = "BANK ACCOUNT")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-26T14:28:41.057Z")
public class BankAccount {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("AccountName")
  private String accountName = null;

  @SerializedName("Iban")
  private String iban = null;

  @SerializedName("Swift")
  private String swift = null;

  @SerializedName("PopulatedAccountFields")
  private List<AccountFieldKeyValuePair> populatedAccountFields = null;

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

  @SerializedName("StoreNames")
  private List<String> storeNames = null;

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

  public BankAccount id(Integer id) {
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

  public BankAccount accountName(String accountName) {
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

  public BankAccount iban(String iban) {
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

  public BankAccount swift(String swift) {
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

  public BankAccount populatedAccountFields(List<AccountFieldKeyValuePair> populatedAccountFields) {
    this.populatedAccountFields = populatedAccountFields;
    return this;
  }

  public BankAccount addPopulatedAccountFieldsItem(AccountFieldKeyValuePair populatedAccountFieldsItem) {
    if (this.populatedAccountFields == null) {
      this.populatedAccountFields = new ArrayList<AccountFieldKeyValuePair>();
    }
    this.populatedAccountFields.add(populatedAccountFieldsItem);
    return this;
  }

   /**
   * A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields should be ignored.
   * @return populatedAccountFields
  **/
  @ApiModelProperty(value = "A list of one or more populated account fields (field key-value pairs).  If this list contains at least one item, the Iban, Swift and NationalClearingCode fields should be ignored.")
  public List<AccountFieldKeyValuePair> getPopulatedAccountFields() {
    return populatedAccountFields;
  }

  public void setPopulatedAccountFields(List<AccountFieldKeyValuePair> populatedAccountFields) {
    this.populatedAccountFields = populatedAccountFields;
  }

  public BankAccount accountState(AccountStateEnum accountState) {
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

  public BankAccount storeNames(List<String> storeNames) {
    this.storeNames = storeNames;
    return this;
  }

  public BankAccount addStoreNamesItem(String storeNamesItem) {
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

  public BankAccount bankAddress(String bankAddress) {
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

  public BankAccount bankCountryCode(String bankCountryCode) {
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

  public BankAccount accountHolderAddress(String accountHolderAddress) {
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

  public BankAccount accountHolderCountryCode(String accountHolderCountryCode) {
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

  public BankAccount vatNumber(String vatNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.id, bankAccount.id) &&
        Objects.equals(this.accountName, bankAccount.accountName) &&
        Objects.equals(this.iban, bankAccount.iban) &&
        Objects.equals(this.swift, bankAccount.swift) &&
        Objects.equals(this.populatedAccountFields, bankAccount.populatedAccountFields) &&
        Objects.equals(this.accountState, bankAccount.accountState) &&
        Objects.equals(this.storeNames, bankAccount.storeNames) &&
        Objects.equals(this.bankAddress, bankAccount.bankAddress) &&
        Objects.equals(this.bankCountryCode, bankAccount.bankCountryCode) &&
        Objects.equals(this.accountHolderAddress, bankAccount.accountHolderAddress) &&
        Objects.equals(this.accountHolderCountryCode, bankAccount.accountHolderCountryCode) &&
        Objects.equals(this.vatNumber, bankAccount.vatNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountName, iban, swift, populatedAccountFields, accountState, storeNames, bankAddress, bankCountryCode, accountHolderAddress, accountHolderCountryCode, vatNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    swift: ").append(toIndentedString(swift)).append("\n");
    sb.append("    populatedAccountFields: ").append(toIndentedString(populatedAccountFields)).append("\n");
    sb.append("    accountState: ").append(toIndentedString(accountState)).append("\n");
    sb.append("    storeNames: ").append(toIndentedString(storeNames)).append("\n");
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    bankCountryCode: ").append(toIndentedString(bankCountryCode)).append("\n");
    sb.append("    accountHolderAddress: ").append(toIndentedString(accountHolderAddress)).append("\n");
    sb.append("    accountHolderCountryCode: ").append(toIndentedString(accountHolderCountryCode)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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

