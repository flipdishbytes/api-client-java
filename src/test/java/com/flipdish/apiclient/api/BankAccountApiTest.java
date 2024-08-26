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

import com.flipdish.apiclient.model.BankAccountCreate;
import com.flipdish.apiclient.model.RestApiArrayResultBankAccountSummary;
import com.flipdish.apiclient.model.RestApiArrayResultCountryWithAccountFieldsDefinitions;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAccountFieldsDefinitions;
import com.flipdish.apiclient.model.RestApiResultBankAccountDetail;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BankAccountApi
 */
@Ignore
public class BankAccountApiTest {

    private final BankAccountApi api = new BankAccountApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void attachBankAccountToStoreTest() throws Exception {
        String appId = null;
        Integer bankAccountId = null;
        Integer storeId = null;
        api.attachBankAccountToStore(appId, bankAccountId, storeId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createBankAccountTest() throws Exception {
        String appId = null;
        BankAccountCreate account = null;
        RestApiResultBankAccountDetail response = api.createBankAccount(appId, account);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteBankAccountTest() throws Exception {
        String appId = null;
        Integer bankAccountId = null;
        api.deleteBankAccount(appId, bankAccountId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBankAccountByIdTest() throws Exception {
        Integer bankAccountId = null;
        String appId = null;
        RestApiResultBankAccountDetail response = api.getBankAccountById(bankAccountId, appId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBankAccountsTest() throws Exception {
        String appId = null;
        RestApiArrayResultBankAccountSummary response = api.getBankAccounts(appId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCountriesWithFieldDefinitionsTest() throws Exception {
        String appId = null;
        RestApiArrayResultCountryWithAccountFieldsDefinitions response = api.getCountriesWithFieldDefinitions(appId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFieldDefinitionsTest() throws Exception {
        String appId = null;
        RestApiResultAccountFieldsDefinitions response = api.getFieldDefinitions(appId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateBankAccountTest() throws Exception {
        String appId = null;
        Integer bankAccountId = null;
        BankAccountCreate account = null;
        api.updateBankAccount(appId, bankAccountId, account);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateBankAccountStateTest() throws Exception {
        String appId = null;
        Integer bankAccountId = null;
        String state = null;
        String reason = null;
        api.updateBankAccountState(appId, bankAccountId, state, reason);

        // TODO: test validations
    }
    
}
