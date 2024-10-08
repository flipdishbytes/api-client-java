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

import com.flipdish.apiclient.model.AccountDetailBase;
import com.flipdish.apiclient.model.ChangePasswordModel;
import com.flipdish.apiclient.model.CreateAccountModel;
import com.flipdish.apiclient.model.CreateBasicAccountModel;
import com.flipdish.apiclient.model.LoginModel;
import com.flipdish.apiclient.model.LoginWithPinModel;
import com.flipdish.apiclient.model.PasswordResetModel;
import com.flipdish.apiclient.model.RequestLoginPinModel;
import com.flipdish.apiclient.model.RequestLoginPinResponse;
import com.flipdish.apiclient.model.RequestPasswordResetModel;
import com.flipdish.apiclient.model.RequestPasswordResetPinResponse;
import com.flipdish.apiclient.model.RestApiArrayResultLocalisedTimeZone;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAccountDetail;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.SetPasswordWithPinModel;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void answerSignUpQuestionTest() throws Exception {
        String signupStepAction = null;
        Integer answerId = null;
        api.answerSignUpQuestion(signupStepAction, answerId);

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
    public void changePasswordTest() throws Exception {
        ChangePasswordModel changePasswordModel = null;
        api.changePassword(changePasswordModel);

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
    public void changePasswordWithPinTest() throws Exception {
        SetPasswordWithPinModel changePasswordModel = null;
        api.changePasswordWithPin(changePasswordModel);

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
    public void createAccountTest() throws Exception {
        CreateAccountModel createAccountModel = null;
        api.createAccount(createAccountModel);

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
    public void createBasicAccountTest() throws Exception {
        CreateBasicAccountModel basicAccountModel = null;
        String response = api.createBasicAccount(basicAccountModel);

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
    public void getAccountDetailsTest() throws Exception {
        RestApiResultAccountDetail response = api.getAccountDetails();

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
    public void getLocalisedTimeZonesTest() throws Exception {
        RestApiArrayResultLocalisedTimeZone response = api.getLocalisedTimeZones();

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
    public void loginTest() throws Exception {
        LoginModel loginModel = null;
        api.login(loginModel);

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
    public void loginSsoTest() throws Exception {
        api.loginSso();

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
    public void loginWithPinTest() throws Exception {
        LoginWithPinModel loginModel = null;
        api.loginWithPin(loginModel);

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
    public void logoutTest() throws Exception {
        api.logout();

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
    public void passwordResetWithTokenTest() throws Exception {
        PasswordResetModel passwordResetModel = null;
        api.passwordResetWithToken(passwordResetModel);

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
    public void recaptchaValidateTest() throws Exception {
        String token = null;
        api.recaptchaValidate(token);

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
    public void requestLoginPinTest() throws Exception {
        RequestLoginPinModel requestLoginPinRequest = null;
        RequestLoginPinResponse response = api.requestLoginPin(requestLoginPinRequest);

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
    public void requestPasswordResetTest() throws Exception {
        RequestPasswordResetModel requestPasswordResetModel = null;
        api.requestPasswordReset(requestPasswordResetModel);

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
    public void sendPinForPasswordResetTest() throws Exception {
        RequestPasswordResetModel requestPasswordResetRequest = null;
        RequestPasswordResetPinResponse response = api.sendPinForPasswordReset(requestPasswordResetRequest);

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
    public void skipSignupStepTest() throws Exception {
        String signupStepAction = null;
        api.skipSignupStep(signupStepAction);

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
    public void updateAccountTest() throws Exception {
        AccountDetailBase updateAccountModel = null;
        api.updateAccount(updateAccountModel);

        // TODO: test validations
    }
    
}
