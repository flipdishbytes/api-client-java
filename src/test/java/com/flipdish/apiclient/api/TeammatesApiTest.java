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

import com.flipdish.apiclient.model.CreateTeammate;
import com.flipdish.apiclient.model.RestApiArrayResultTeammate;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultAcceptInvitationResult;
import com.flipdish.apiclient.model.RestApiResultRedeemInvitationResult;
import com.flipdish.apiclient.model.RestApiResultTeammate;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.TeammateBase;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeammatesApi
 */
@Ignore
public class TeammatesApiTest {

    private final TeammatesApi api = new TeammatesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTeammateTest() throws Exception {
        String appId = null;
        CreateTeammate teammate = null;
        RestApiResultTeammate response = api.createTeammate(appId, teammate);

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
    public void deleteTeammateTest() throws Exception {
        String appId = null;
        String id = null;
        api.deleteTeammate(appId, id);

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
    public void getTeammateByAppIdAndTeammateIdTest() throws Exception {
        String appId = null;
        String id = null;
        RestApiResultTeammate response = api.getTeammateByAppIdAndTeammateId(appId, id);

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
    public void getTeammatesByAppIdTest() throws Exception {
        String appId = null;
        RestApiArrayResultTeammate response = api.getTeammatesByAppId(appId);

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
    public void grantaccessTest() throws Exception {
        String appId = null;
        CreateTeammate teammate = null;
        Object response = api.grantaccess(appId, teammate);

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
    public void redeemInvitationTest() throws Exception {
        String otc = null;
        String appId = null;
        RestApiResultRedeemInvitationResult response = api.redeemInvitation(otc, appId);

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
    public void teammatesAcceptInvitationTest() throws Exception {
        String otc = null;
        String appId = null;
        RestApiResultAcceptInvitationResult response = api.teammatesAcceptInvitation(otc, appId);

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
    public void updateTeammateTest() throws Exception {
        String appId = null;
        String id = null;
        TeammateBase teammate = null;
        RestApiResultTeammate response = api.updateTeammate(appId, id, teammate);

        // TODO: test validations
    }
    
}
