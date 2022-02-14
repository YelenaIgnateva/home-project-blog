# CurrentUserCommentsApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommentByCurrentUser**](CurrentUserCommentsApi.md#getCommentByCurrentUser) | **GET** /users/current/comments/{id} | Get Comment by ID and Current User
[**getCommentsByCurrentUser**](CurrentUserCommentsApi.md#getCommentsByCurrentUser) | **GET** /users/current/comments | Get comments by Current User
[**removeCommentByCurrentUser**](CurrentUserCommentsApi.md#removeCommentByCurrentUser) | **DELETE** /users/current/comments/{id} | Remove Comment by Current User
[**updateCommentByCurrentUser**](CurrentUserCommentsApi.md#updateCommentByCurrentUser) | **PUT** /users/current/comments/{id} | Update Comment by Current User


<a name="getCommentByCurrentUser"></a>
# **getCommentByCurrentUser**
> Comment getCommentByCurrentUser(id)

Get Comment by ID and Current User

Retrieves an existing Comment associated with the specified ID and Current User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserCommentsApi apiInstance = new CurrentUserCommentsApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Comment result = apiInstance.getCommentByCurrentUser(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserCommentsApi#getCommentByCurrentUser");
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
 **id** | **Long**|  |

### Return type

[**Comment**](Comment.md)

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

<a name="getCommentsByCurrentUser"></a>
# **getCommentsByCurrentUser**
> List&lt;Comment&gt; getCommentsByCurrentUser(id, sort, pageNum, pageSize)

Get comments by Current User

Uses query keys to retrieve a subset of existing comments assosiated with Current User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserCommentsApi apiInstance = new CurrentUserCommentsApi(defaultClient);
    Long id = 56L; // Long | 
    String sort = "-id"; // String | In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
    Integer pageNum = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    try {
      List<Comment> result = apiInstance.getCommentsByCurrentUser(id, sort, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserCommentsApi#getCommentsByCurrentUser");
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
 **id** | **Long**|  | [optional]
 **sort** | **String**| In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  | [optional] [default to -id] [enum: id, -id]
 **pageNum** | **Integer**|  | [optional] [default to 0]
 **pageSize** | **Integer**|  | [optional] [default to 10]

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Total-Count -  <br>  |
**401** | Unauthorized. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="removeCommentByCurrentUser"></a>
# **removeCommentByCurrentUser**
> removeCommentByCurrentUser(id)

Remove Comment by Current User

Deletes a Comment associated with a specified ID and Current User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserCommentsApi apiInstance = new CurrentUserCommentsApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.removeCommentByCurrentUser(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserCommentsApi#removeCommentByCurrentUser");
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
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | The request was succesfully processed. |  -  |
**400** | The payload contains an error. |  -  |
**401** | Unauthorized. |  -  |
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="updateCommentByCurrentUser"></a>
# **updateCommentByCurrentUser**
> Comment updateCommentByCurrentUser(id, comment)

Update Comment by Current User

Updates information on a Comment that exists in the system by the specified ID and Current User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentUserCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CurrentUserCommentsApi apiInstance = new CurrentUserCommentsApi(defaultClient);
    Long id = 56L; // Long | 
    Comment comment = new Comment(); // Comment | 
    try {
      Comment result = apiInstance.updateCommentByCurrentUser(id, comment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentUserCommentsApi#updateCommentByCurrentUser");
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
 **id** | **Long**|  |
 **comment** | [**Comment**](Comment.md)|  |

### Return type

[**Comment**](Comment.md)

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

