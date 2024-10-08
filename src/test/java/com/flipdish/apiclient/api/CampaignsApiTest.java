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

import com.flipdish.apiclient.model.LoyaltyCampaignBase;
import com.flipdish.apiclient.model.RestApiArrayResultLoyaltyCampaign;
import com.flipdish.apiclient.model.RestApiArrayResultRetentionCampaign;
import com.flipdish.apiclient.model.RestApiArrayResultStoreListItem;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultLoyaltyCampaign;
import com.flipdish.apiclient.model.RestApiResultRetentionCampaign;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.RetentionCampaignBase;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignsApi
 */
@Ignore
public class CampaignsApiTest {

    private final CampaignsApi api = new CampaignsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createLoyaltyCampaignTest() throws Exception {
        String appId = null;
        LoyaltyCampaignBase campaign = null;
        RestApiResultLoyaltyCampaign response = api.createLoyaltyCampaign(appId, campaign);

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
    public void createRetentionCampaignTest() throws Exception {
        String appId = null;
        RetentionCampaignBase campaign = null;
        RestApiResultRetentionCampaign response = api.createRetentionCampaign(appId, campaign);

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
    public void getLoyaltyCampaignsForAppTest() throws Exception {
        String appId = null;
        RestApiArrayResultLoyaltyCampaign response = api.getLoyaltyCampaignsForApp(appId);

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
    public void getLoyaltyCampaignsForStoreTest() throws Exception {
        String appId = null;
        Integer storeId = null;
        RestApiArrayResultLoyaltyCampaign response = api.getLoyaltyCampaignsForStore(appId, storeId);

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
    public void getRetentionCampaignsForAppTest() throws Exception {
        String appId = null;
        RestApiArrayResultRetentionCampaign response = api.getRetentionCampaignsForApp(appId);

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
    public void getRetentionCampaignsForStoreTest() throws Exception {
        String appId = null;
        Integer storeId = null;
        RestApiArrayResultRetentionCampaign response = api.getRetentionCampaignsForStore(appId, storeId);

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
    public void getStoreListTest() throws Exception {
        String appId = null;
        Boolean onlyPublished = null;
        RestApiArrayResultStoreListItem response = api.getStoreList(appId, onlyPublished);

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
    public void removeCampaignTest() throws Exception {
        String appId = null;
        Integer campaignId = null;
        api.removeCampaign(appId, campaignId);

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
    public void updateLoyaltyCampaignTest() throws Exception {
        String appId = null;
        Integer campaignId = null;
        LoyaltyCampaignBase campaign = null;
        RestApiResultLoyaltyCampaign response = api.updateLoyaltyCampaign(appId, campaignId, campaign);

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
    public void updateRetentionCampaignTest() throws Exception {
        String appId = null;
        Integer campaignId = null;
        RetentionCampaignBase campaign = null;
        RestApiResultRetentionCampaign response = api.updateRetentionCampaign(appId, campaignId, campaign);

        // TODO: test validations
    }
    
}
