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
 * Represents a request to update bank account information details
 */
@ApiModel(description = "Represents a request to update bank account information details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class BankAccountDetailsUpdateRequest {
  @SerializedName("BankAddress")
  private String bankAddress = null;

  @SerializedName("AccountHolderAddress")
  private String accountHolderAddress = null;

  @SerializedName("VatNumber")
  private String vatNumber = null;

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

  public BankAccountDetailsUpdateRequest bankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
    return this;
  }

   /**
   * Address of the bank account
   * @return bankAddress
  **/
  @ApiModelProperty(value = "Address of the bank account")
  public String getBankAddress() {
    return bankAddress;
  }

  public void setBankAddress(String bankAddress) {
    this.bankAddress = bankAddress;
  }

  public BankAccountDetailsUpdateRequest accountHolderAddress(String accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
    return this;
  }

   /**
   * Address of the payee
   * @return accountHolderAddress
  **/
  @ApiModelProperty(value = "Address of the payee")
  public String getAccountHolderAddress() {
    return accountHolderAddress;
  }

  public void setAccountHolderAddress(String accountHolderAddress) {
    this.accountHolderAddress = accountHolderAddress;
  }

  public BankAccountDetailsUpdateRequest vatNumber(String vatNumber) {
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

  public BankAccountDetailsUpdateRequest storeIds(List<Integer> storeIds) {
    this.storeIds = storeIds;
    return this;
  }

  public BankAccountDetailsUpdateRequest addStoreIdsItem(Integer storeIdsItem) {
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

  public BankAccountDetailsUpdateRequest bankName(String bankName) {
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

  public BankAccountDetailsUpdateRequest accountName(String accountName) {
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

  public BankAccountDetailsUpdateRequest iban(String iban) {
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

  public BankAccountDetailsUpdateRequest swift(String swift) {
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

  public BankAccountDetailsUpdateRequest nationalClearingCode(String nationalClearingCode) {
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

  public BankAccountDetailsUpdateRequest populatedAccountFields(List<AccountFieldKeyValuePair> populatedAccountFields) {
    this.populatedAccountFields = populatedAccountFields;
    return this;
  }

  public BankAccountDetailsUpdateRequest addPopulatedAccountFieldsItem(AccountFieldKeyValuePair populatedAccountFieldsItem) {
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

  public BankAccountDetailsUpdateRequest rejectionReason(String rejectionReason) {
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

  public BankAccountDetailsUpdateRequest businessType(BusinessTypeEnum businessType) {
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
    BankAccountDetailsUpdateRequest bankAccountDetailsUpdateRequest = (BankAccountDetailsUpdateRequest) o;
    return Objects.equals(this.bankAddress, bankAccountDetailsUpdateRequest.bankAddress) &&
        Objects.equals(this.accountHolderAddress, bankAccountDetailsUpdateRequest.accountHolderAddress) &&
        Objects.equals(this.vatNumber, bankAccountDetailsUpdateRequest.vatNumber) &&
        Objects.equals(this.storeIds, bankAccountDetailsUpdateRequest.storeIds) &&
        Objects.equals(this.bankName, bankAccountDetailsUpdateRequest.bankName) &&
        Objects.equals(this.accountName, bankAccountDetailsUpdateRequest.accountName) &&
        Objects.equals(this.iban, bankAccountDetailsUpdateRequest.iban) &&
        Objects.equals(this.swift, bankAccountDetailsUpdateRequest.swift) &&
        Objects.equals(this.nationalClearingCode, bankAccountDetailsUpdateRequest.nationalClearingCode) &&
        Objects.equals(this.populatedAccountFields, bankAccountDetailsUpdateRequest.populatedAccountFields) &&
        Objects.equals(this.rejectionReason, bankAccountDetailsUpdateRequest.rejectionReason) &&
        Objects.equals(this.businessType, bankAccountDetailsUpdateRequest.businessType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAddress, accountHolderAddress, vatNumber, storeIds, bankName, accountName, iban, swift, nationalClearingCode, populatedAccountFields, rejectionReason, businessType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountDetailsUpdateRequest {\n");
    
    sb.append("    bankAddress: ").append(toIndentedString(bankAddress)).append("\n");
    sb.append("    accountHolderAddress: ").append(toIndentedString(accountHolderAddress)).append("\n");
    sb.append("    vatNumber: ").append(toIndentedString(vatNumber)).append("\n");
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

