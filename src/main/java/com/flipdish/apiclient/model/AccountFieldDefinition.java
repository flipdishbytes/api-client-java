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
 * Represents the format of a bank account field
 */
@ApiModel(description = "Represents the format of a bank account field")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-26T16:13:45.231+01:00")
public class AccountFieldDefinition {
  /**
   * Depending on the Key, the field&#39;s value will be stored in a different field in PayeeBankAccountData
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    IBAN("Iban"),
    
    ACCOUNTNUMBER("AccountNumber"),
    
    ROUTINGNUMBER("RoutingNumber"),
    
    BSB("BSB"),
    
    BRANCHCODE("BranchCode"),
    
    BANKCODE("BankCode"),
    
    INSTITUTIONNUMBER("InstitutionNumber"),
    
    TRANSITNUMBER("TransitNumber"),
    
    CLEARINGCODE("ClearingCode"),
    
    IFSCCODE("IfscCode"),
    
    CLABE("Clabe"),
    
    SORTCODE("SortCode"),
    
    SWIFT("Swift");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEnum fromValue(String text) {
      for (KeyEnum b : KeyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Key")
  private KeyEnum key = null;

  @SerializedName("DisplayName")
  private String displayName = null;

  /**
   * There are some fields that are of type known to the frontend (IBAN, Swift) -- for those frontend should use its own validation library, e.g. ibantools
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NONE("None"),
    
    IBAN("Iban");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  @SerializedName("MinLength")
  private Integer minLength = null;

  @SerializedName("MaxLength")
  private Integer maxLength = null;

  @SerializedName("DigitsOnly")
  private Boolean digitsOnly = null;

  @SerializedName("Regex")
  private String regex = null;

  public AccountFieldDefinition key(KeyEnum key) {
    this.key = key;
    return this;
  }

   /**
   * Depending on the Key, the field&#39;s value will be stored in a different field in PayeeBankAccountData
   * @return key
  **/
  @ApiModelProperty(value = "Depending on the Key, the field's value will be stored in a different field in PayeeBankAccountData")
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(KeyEnum key) {
    this.key = key;
  }

  public AccountFieldDefinition displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the field
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the field")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountFieldDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * There are some fields that are of type known to the frontend (IBAN, Swift) -- for those frontend should use its own validation library, e.g. ibantools
   * @return type
  **/
  @ApiModelProperty(value = "There are some fields that are of type known to the frontend (IBAN, Swift) -- for those frontend should use its own validation library, e.g. ibantools")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AccountFieldDefinition minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Minimum length of the field
   * @return minLength
  **/
  @ApiModelProperty(value = "Minimum length of the field")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public AccountFieldDefinition maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Maximum length of the field
   * @return maxLength
  **/
  @ApiModelProperty(value = "Maximum length of the field")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public AccountFieldDefinition digitsOnly(Boolean digitsOnly) {
    this.digitsOnly = digitsOnly;
    return this;
  }

   /**
   * Is the field digits (numeric) only
   * @return digitsOnly
  **/
  @ApiModelProperty(value = "Is the field digits (numeric) only")
  public Boolean isDigitsOnly() {
    return digitsOnly;
  }

  public void setDigitsOnly(Boolean digitsOnly) {
    this.digitsOnly = digitsOnly;
  }

  public AccountFieldDefinition regex(String regex) {
    this.regex = regex;
    return this;
  }

   /**
   * Regex for validating the field (if specified)
   * @return regex
  **/
  @ApiModelProperty(value = "Regex for validating the field (if specified)")
  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFieldDefinition accountFieldDefinition = (AccountFieldDefinition) o;
    return Objects.equals(this.key, accountFieldDefinition.key) &&
        Objects.equals(this.displayName, accountFieldDefinition.displayName) &&
        Objects.equals(this.type, accountFieldDefinition.type) &&
        Objects.equals(this.minLength, accountFieldDefinition.minLength) &&
        Objects.equals(this.maxLength, accountFieldDefinition.maxLength) &&
        Objects.equals(this.digitsOnly, accountFieldDefinition.digitsOnly) &&
        Objects.equals(this.regex, accountFieldDefinition.regex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, displayName, type, minLength, maxLength, digitsOnly, regex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFieldDefinition {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    digitsOnly: ").append(toIndentedString(digitsOnly)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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

