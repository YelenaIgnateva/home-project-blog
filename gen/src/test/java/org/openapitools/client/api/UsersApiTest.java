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
import org.openapitools.client.model.Role;
import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create User
     *
     * Create a new User.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User user = null;
        User response = api.createUser(user);

        // TODO: test validations
    }
    
    /**
     * Get User by ID
     *
     * Retrieves an existing User associated with the specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        Long id = null;
        User response = api.getUser(id);

        // TODO: test validations
    }
    
    /**
     * Get User Role by ID
     *
     * Retrieves an existing User Role associated with the specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRoleTest() throws ApiException {
        Long id = null;
        Role response = api.getUserRole(id);

        // TODO: test validations
    }
    
    /**
     * Get users
     *
     * Uses query keys to retrieve a subset of existing users.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        Long id = null;
        String name = null;
        String sort = null;
        Integer pageNum = null;
        Integer pageSize = null;
        List<User> response = api.getUsers(id, name, sort, pageNum, pageSize);

        // TODO: test validations
    }
    
    /**
     * Remove User
     *
     * Deletes a User associated with a specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeUserTest() throws ApiException {
        Long id = null;
        api.removeUser(id);

        // TODO: test validations
    }
    
    /**
     * Update User
     *
     * Updates information on a User that exists in the system by the specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        Long id = null;
        User user = null;
        User response = api.updateUser(id, user);

        // TODO: test validations
    }
    
    /**
     * Update User Role
     *
     * Updates Role on a User that exists in the system by the specified ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserRoleTest() throws ApiException {
        Long id = null;
        Role role = null;
        Role response = api.updateUserRole(id, role);

        // TODO: test validations
    }
    
}