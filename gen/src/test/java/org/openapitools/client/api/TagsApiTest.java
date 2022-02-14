/*
 * Home Project Blog Service
 * Blog for the Home Project engineers 
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Tag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagsApi
 */
@Ignore
public class TagsApiTest {

    private final TagsApi api = new TagsApi();

    
    /**
     * Get Tag by ID
     *
     * Retrieves an existing Tag associated with the specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagTest() throws ApiException {
        Long id = null;
        Tag response = api.getTag(id);

        // TODO: test validations
    }
    
    /**
     * Get tags
     *
     * Uses query keys to retrieve a subset of existing tags.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsTest() throws ApiException {
        Long id = null;
        String name = null;
        String sort = null;
        Integer pageNum = null;
        Integer pageSize = null;
        List<Tag> response = api.getTags(id, name, sort, pageNum, pageSize);

        // TODO: test validations
    }
    
    /**
     * Remove Tag
     *
     * Deletes a Tag associated with a specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTagTest() throws ApiException {
        Long id = null;
        api.removeTag(id);

        // TODO: test validations
    }
    
}