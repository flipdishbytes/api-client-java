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
 * Information to create a reference to a {Flipdish.Menus.PublicModels.V1.Catalog.Product}
 */
@ApiModel(description = "Information to create a reference to a {Flipdish.Menus.PublicModels.V1.Catalog.Product}")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-02T09:41:57.654Z")
public class CreateProductReference {
  @SerializedName("CatalogItemId")
  private String catalogItemId = null;

  /**
   * Type of the SupProduct
   */
  @JsonAdapter(ProductTypeEnum.Adapter.class)
  public enum ProductTypeEnum {
    PRODUCT("Product"),
    
    MODIFIER("Modifier");

    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String text) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProductTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProductTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ProductType")
  private ProductTypeEnum productType = null;

  @SerializedName("PreselectedQuantity")
  private Integer preselectedQuantity = null;

  public CreateProductReference catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

   /**
   * Identifier of the CatalogItemId to use as SubProduct
   * @return catalogItemId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the CatalogItemId to use as SubProduct")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public CreateProductReference productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Type of the SupProduct
   * @return productType
  **/
  @ApiModelProperty(required = true, value = "Type of the SupProduct")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public CreateProductReference preselectedQuantity(Integer preselectedQuantity) {
    this.preselectedQuantity = preselectedQuantity;
    return this;
  }

   /**
   * Quantity of the modifier that will be set when the parent product is placed in the basket
   * @return preselectedQuantity
  **/
  @ApiModelProperty(value = "Quantity of the modifier that will be set when the parent product is placed in the basket")
  public Integer getPreselectedQuantity() {
    return preselectedQuantity;
  }

  public void setPreselectedQuantity(Integer preselectedQuantity) {
    this.preselectedQuantity = preselectedQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateProductReference createProductReference = (CreateProductReference) o;
    return Objects.equals(this.catalogItemId, createProductReference.catalogItemId) &&
        Objects.equals(this.productType, createProductReference.productType) &&
        Objects.equals(this.preselectedQuantity, createProductReference.preselectedQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogItemId, productType, preselectedQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateProductReference {\n");
    
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    preselectedQuantity: ").append(toIndentedString(preselectedQuantity)).append("\n");
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

