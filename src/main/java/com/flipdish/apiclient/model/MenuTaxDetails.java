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
import com.flipdish.apiclient.model.MenuTaxRate;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tax information for Menu
 */
@ApiModel(description = "Tax information for Menu")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-08-20T12:44:44.824Z")
public class MenuTaxDetails {
  @SerializedName("TaxRates")
  private List<MenuTaxRate> taxRates = null;

  @SerializedName("DisplayTax")
  private Boolean displayTax = null;

  /**
   * TaxType
   */
  @JsonAdapter(TaxTypeEnum.Adapter.class)
  public enum TaxTypeEnum {
    INCLUDEDINBASEPRICE("IncludedInBasePrice"),
    
    EXCLUDEDFROMBASEPRICE("ExcludedFromBasePrice");

    private String value;

    TaxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxTypeEnum fromValue(String text) {
      for (TaxTypeEnum b : TaxTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TaxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TaxTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TaxType")
  private TaxTypeEnum taxType = null;

  @SerializedName("ItemTaxes")
  private Map<String, Integer> itemTaxes = null;

  @SerializedName("SetItemTaxes")
  private Map<String, Integer> setItemTaxes = null;

  public MenuTaxDetails taxRates(List<MenuTaxRate> taxRates) {
    this.taxRates = taxRates;
    return this;
  }

  public MenuTaxDetails addTaxRatesItem(MenuTaxRate taxRatesItem) {
    if (this.taxRates == null) {
      this.taxRates = new ArrayList<MenuTaxRate>();
    }
    this.taxRates.add(taxRatesItem);
    return this;
  }

   /**
   * Tax Rates
   * @return taxRates
  **/
  @ApiModelProperty(value = "Tax Rates")
  public List<MenuTaxRate> getTaxRates() {
    return taxRates;
  }

  public void setTaxRates(List<MenuTaxRate> taxRates) {
    this.taxRates = taxRates;
  }

  public MenuTaxDetails displayTax(Boolean displayTax) {
    this.displayTax = displayTax;
    return this;
  }

   /**
   * Display tax for Menu
   * @return displayTax
  **/
  @ApiModelProperty(value = "Display tax for Menu")
  public Boolean isDisplayTax() {
    return displayTax;
  }

  public void setDisplayTax(Boolean displayTax) {
    this.displayTax = displayTax;
  }

  public MenuTaxDetails taxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * TaxType
   * @return taxType
  **/
  @ApiModelProperty(value = "TaxType")
  public TaxTypeEnum getTaxType() {
    return taxType;
  }

  public void setTaxType(TaxTypeEnum taxType) {
    this.taxType = taxType;
  }

  public MenuTaxDetails itemTaxes(Map<String, Integer> itemTaxes) {
    this.itemTaxes = itemTaxes;
    return this;
  }

  public MenuTaxDetails putItemTaxesItem(String key, Integer itemTaxesItem) {
    if (this.itemTaxes == null) {
      this.itemTaxes = new HashMap<String, Integer>();
    }
    this.itemTaxes.put(key, itemTaxesItem);
    return this;
  }

   /**
   * ItemIds and TaxIds
   * @return itemTaxes
  **/
  @ApiModelProperty(value = "ItemIds and TaxIds")
  public Map<String, Integer> getItemTaxes() {
    return itemTaxes;
  }

  public void setItemTaxes(Map<String, Integer> itemTaxes) {
    this.itemTaxes = itemTaxes;
  }

  public MenuTaxDetails setItemTaxes(Map<String, Integer> setItemTaxes) {
    this.setItemTaxes = setItemTaxes;
    return this;
  }

  public MenuTaxDetails putSetItemTaxesItem(String key, Integer setItemTaxesItem) {
    if (this.setItemTaxes == null) {
      this.setItemTaxes = new HashMap<String, Integer>();
    }
    this.setItemTaxes.put(key, setItemTaxesItem);
    return this;
  }

   /**
   * SetItemIds and TaxIds
   * @return setItemTaxes
  **/
  @ApiModelProperty(value = "SetItemIds and TaxIds")
  public Map<String, Integer> getSetItemTaxes() {
    return setItemTaxes;
  }

  public void setSetItemTaxes(Map<String, Integer> setItemTaxes) {
    this.setItemTaxes = setItemTaxes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuTaxDetails menuTaxDetails = (MenuTaxDetails) o;
    return Objects.equals(this.taxRates, menuTaxDetails.taxRates) &&
        Objects.equals(this.displayTax, menuTaxDetails.displayTax) &&
        Objects.equals(this.taxType, menuTaxDetails.taxType) &&
        Objects.equals(this.itemTaxes, menuTaxDetails.itemTaxes) &&
        Objects.equals(this.setItemTaxes, menuTaxDetails.setItemTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRates, displayTax, taxType, itemTaxes, setItemTaxes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuTaxDetails {\n");
    
    sb.append("    taxRates: ").append(toIndentedString(taxRates)).append("\n");
    sb.append("    displayTax: ").append(toIndentedString(displayTax)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    itemTaxes: ").append(toIndentedString(itemTaxes)).append("\n");
    sb.append("    setItemTaxes: ").append(toIndentedString(setItemTaxes)).append("\n");
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

