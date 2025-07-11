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
 * Represents one populated account field (its key and value)
 */
@ApiModel(description = "Represents one populated account field (its key and value)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-07-11T10:23:39.380Z")
public class AccountFieldKeyValuePair {
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

  @SerializedName("Value")
  private String value = null;

  public AccountFieldKeyValuePair key(KeyEnum key) {
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

  public AccountFieldKeyValuePair value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the field
   * @return value
  **/
  @ApiModelProperty(value = "The value of the field")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFieldKeyValuePair accountFieldKeyValuePair = (AccountFieldKeyValuePair) o;
    return Objects.equals(this.key, accountFieldKeyValuePair.key) &&
        Objects.equals(this.value, accountFieldKeyValuePair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFieldKeyValuePair {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

