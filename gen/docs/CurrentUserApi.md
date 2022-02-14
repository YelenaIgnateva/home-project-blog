# CurrentUserApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentUser**](CurrentUserApi.md#getCurrentUser) | **GET** /users/current | Return current User
[**updateCurrentUser**](CurrentUserApi.md#updateCurrentUser) | **PUT** /users/current | Update Current User
[**updateCurrentUserPassword**](CurrentUserApi.md#updateCurrentUserPassword) | **PUT** /users/current/password | Update password on a Current User


<a name="getCurrentUser"></a>
# **getCurrentUser**
> User getCurrentUser()

Return current User

Retrieves the current logged User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserApi apiInstance = new CurrentUserApi(defaultClient);
    try {
      User result = apiInstance.getCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserApi#getCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The payload contains an error. |  -  |
**401** | Unauthorized. |  -  |
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="updateCurrentUser"></a>
# **updateCurrentUser**
> User updateCurrentUser(user)

Update Current User

Updates information on a Current User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserApi apiInstance = new CurrentUserApi(defaultClient);
    User user = new User(); // User | 
    try {
      User result = apiInstance.updateCurrentUser(user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserApi#updateCurrentUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  |

### Return type

[**User**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | The payload contains an error. |  -  |
**401** | Unauthorized. |  -  |
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="updateCurrentUserPassword"></a>
# **updateCurrentUserPassword**
> updateCurrentUserPassword(changePassword)

Update password on a Current User

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserApi apiInstance = new CurrentUserApi(defaultClient);
    ChangePassword changePassword = new ChangePassword(); // ChangePassword | 
    try {
      apiInstance.updateCurrentUserPassword(changePassword);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserApi#updateCurrentUserPassword");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changePassword** | [**ChangePassword**](ChangePassword.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The request was succesfully processed. |  -  |
**400** | The payload contains an error. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

