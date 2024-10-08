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

import java.io.File;
import com.flipdish.apiclient.model.IndexPageBase;
import com.flipdish.apiclient.model.RestApiErrorResult;
import com.flipdish.apiclient.model.RestApiForbiddenResult;
import com.flipdish.apiclient.model.RestApiResultIndexPage;
import com.flipdish.apiclient.model.RestApiResultIndexPageBase;
import com.flipdish.apiclient.model.RestApiResultWebsiteImage;
import com.flipdish.apiclient.model.RestApiResultWebsiteTestimonial;
import com.flipdish.apiclient.model.RestApiUnauthorizedResult;
import com.flipdish.apiclient.model.WebsiteTestimonialBase;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WebsiteApi
 */
@Ignore
public class WebsiteApiTest {

    private final WebsiteApi api = new WebsiteApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addTestimonialTest() throws Exception {
        String appId = null;
        WebsiteTestimonialBase testimonial = null;
        RestApiResultWebsiteTestimonial response = api.addTestimonial(appId, testimonial);

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
    public void deleteTestimonialTest() throws Exception {
        String appId = null;
        Integer testimonialId = null;
        api.deleteTestimonial(appId, testimonialId);

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
    public void deleteWebsiteImageTest() throws Exception {
        String appId = null;
        Integer imageId = null;
        api.deleteWebsiteImage(appId, imageId);

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
    public void editTestimonialTest() throws Exception {
        String appId = null;
        Integer testimonialId = null;
        WebsiteTestimonialBase testimonial = null;
        RestApiResultWebsiteTestimonial response = api.editTestimonial(appId, testimonialId, testimonial);

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
    public void getIndexConfigurationTest() throws Exception {
        String appId = null;
        RestApiResultIndexPage response = api.getIndexConfiguration(appId);

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
    public void setIndexConfigurationTest() throws Exception {
        String appId = null;
        IndexPageBase indexPage = null;
        RestApiResultIndexPageBase response = api.setIndexConfiguration(appId, indexPage);

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
    public void uploadWebsiteImageTest() throws Exception {
        String appId = null;
        String imageLocation = null;
        File image = null;
        RestApiResultWebsiteImage response = api.uploadWebsiteImage(appId, imageLocation, image);

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
    public void websiteCheckNowTest() throws Exception {
        String appId = null;
        api.websiteCheckNow(appId);

        // TODO: test validations
    }
    
}
