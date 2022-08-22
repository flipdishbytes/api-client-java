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


package com.flipdish.apiclient.api;

import com.flipdish.apiclient.ApiException;
import com.flipdish.apiclient.model.GoogleAddress;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAddressFormResponse;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Provides a dyamic form definition based for the country of the given appId, with labels localized using the provided language.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void formByAppTest() throws ApiException {
        String appId = null;
        String language = null;
        RestApiResultAddressFormResponse response = api.formByApp(appId, language);

        // TODO: test validations
    }
    
    /**
     * Provides a dyamic form definition for the given country code, with labels localized using the provided language.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void formByCountryTest() throws ApiException {
        String countryCode = null;
        String language = null;
        RestApiResultAddressFormResponse response = api.formByCountry(countryCode, language);

        // TODO: test validations
    }
    
    /**
     * Maps a Google Address Object to the values of the dynamic form associated with the address country and returns the dynamic form.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void formatGoogleAddressTest() throws ApiException {
        GoogleAddress googleAddress = null;
        String language = null;
        RestApiResultAddressFormResponse response = api.formatGoogleAddress(googleAddress, language);

        // TODO: test validations
    }
    
}
