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
import com.flipdish.apiclient.model.AppStoreAppConfigurationSummary;
import com.flipdish.apiclient.model.AppStoreAppSubscriptionSummary;
import com.flipdish.apiclient.model.SubscriptionProductPriceInfo;
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
 * App store configurations for a given AppId
 */
@ApiModel(description = "App store configurations for a given AppId")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-10T14:21:53.091Z")
public class AppStoreAppConfigurationsWithSubscriptions {
  @SerializedName("Subscription")
  private AppStoreAppSubscriptionSummary subscription = null;

  @SerializedName("Configurations")
  private List<AppStoreAppConfigurationSummary> configurations = null;

  @SerializedName("Prices")
  private List<SubscriptionProductPriceInfo> prices = null;

  public AppStoreAppConfigurationsWithSubscriptions subscription(AppStoreAppSubscriptionSummary subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Subscription information for the AppId for the AppStoreApp
   * @return subscription
  **/
  @ApiModelProperty(value = "Subscription information for the AppId for the AppStoreApp")
  public AppStoreAppSubscriptionSummary getSubscription() {
    return subscription;
  }

  public void setSubscription(AppStoreAppSubscriptionSummary subscription) {
    this.subscription = subscription;
  }

  public AppStoreAppConfigurationsWithSubscriptions configurations(List<AppStoreAppConfigurationSummary> configurations) {
    this.configurations = configurations;
    return this;
  }

  public AppStoreAppConfigurationsWithSubscriptions addConfigurationsItem(AppStoreAppConfigurationSummary configurationsItem) {
    if (this.configurations == null) {
      this.configurations = new ArrayList<AppStoreAppConfigurationSummary>();
    }
    this.configurations.add(configurationsItem);
    return this;
  }

   /**
   * Configurations for the AppId for the AppStoreApp
   * @return configurations
  **/
  @ApiModelProperty(value = "Configurations for the AppId for the AppStoreApp")
  public List<AppStoreAppConfigurationSummary> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(List<AppStoreAppConfigurationSummary> configurations) {
    this.configurations = configurations;
  }

  public AppStoreAppConfigurationsWithSubscriptions prices(List<SubscriptionProductPriceInfo> prices) {
    this.prices = prices;
    return this;
  }

  public AppStoreAppConfigurationsWithSubscriptions addPricesItem(SubscriptionProductPriceInfo pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<SubscriptionProductPriceInfo>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Prices
   * @return prices
  **/
  @ApiModelProperty(value = "Prices")
  public List<SubscriptionProductPriceInfo> getPrices() {
    return prices;
  }

  public void setPrices(List<SubscriptionProductPriceInfo> prices) {
    this.prices = prices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStoreAppConfigurationsWithSubscriptions appStoreAppConfigurationsWithSubscriptions = (AppStoreAppConfigurationsWithSubscriptions) o;
    return Objects.equals(this.subscription, appStoreAppConfigurationsWithSubscriptions.subscription) &&
        Objects.equals(this.configurations, appStoreAppConfigurationsWithSubscriptions.configurations) &&
        Objects.equals(this.prices, appStoreAppConfigurationsWithSubscriptions.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, configurations, prices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreAppConfigurationsWithSubscriptions {\n");
    
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

