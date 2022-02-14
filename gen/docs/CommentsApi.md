# CommentsApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](CommentsApi.md#createComment) | **POST** /posts/{post_id}/comments | Create Comment
[**getComment**](CommentsApi.md#getComment) | **GET** /posts/{post_id}/comments/{id} | Get Comment by ID.
[**getComments**](CommentsApi.md#getComments) | **GET** /posts/{post_id}/comments | Get comments
[**removeComment**](CommentsApi.md#removeComment) | **DELETE** /posts/{post_id}/comments/{id} | Remove Comment
[**updateComment**](CommentsApi.md#updateComment) | **PUT** /posts/{post_id}/comments/{id} | Update Comment


<a name="createComment"></a>
# **createComment**
> Comment createComment(postId, comment)

Create Comment

Create a new Comment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Long postId = 56L; // Long | 
    Comment comment = new Comment(); // Comment | 
    try {
      Comment result = apiInstance.createComment(postId, comment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createComment");
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
 **postId** | **Long**|  |
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
**201** | OK |  -  |
**400** | The payload contains an error. |  -  |
**401** | Unauthorized. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="getComment"></a>
# **getComment**
> Comment getComment(postId, id)

Get Comment by ID.

Retrieves an existing Comment associated with the specified ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Long postId = 56L; // Long | 
    Long id = 56L; // Long | 
    try {
      Comment result = apiInstance.getComment(postId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getComment");
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
 **postId** | **Long**|  |
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
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="getComments"></a>
# **getComments**
> List&lt;Comment&gt; getComments(postId, id, authorName, sort, pageNum, pageSize)

Get comments

Uses query keys to retrieve a subset of existing comments.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Long postId = 56L; // Long | 
    Long id = 56L; // Long | 
    String authorName = "authorName_example"; // String | 
    String sort = "-id"; // String | In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
    Integer pageNum = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    try {
      List<Comment> result = apiInstance.getComments(postId, id, authorName, sort, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getComments");
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
 **postId** | **Long**|  |
 **id** | **Long**|  | [optional]
 **authorName** | **String**|  | [optional]
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
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="removeComment"></a>
# **removeComment**
> removeComment(postId, id)

Remove Comment

Deletes a Comment associated with a specified ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Long postId = 56L; // Long | 
    Long id = 56L; // Long | 
    try {
      apiInstance.removeComment(postId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#removeComment");
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
 **postId** | **Long**|  |
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
**403** | Forbidden. |  -  |
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="updateComment"></a>
# **updateComment**
> Comment updateComment(postId, id, comment)

Update Comment

Updates information on a Comment that exists in the system by the specified ID and post ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CommentsApi apiInstance = new CommentsApi(defaultClient);
    Long postId = 56L; // Long | 
    Long id = 56L; // Long | 
    Comment comment = new Comment(); // Comment | 
    try {
      Comment result = apiInstance.updateComment(postId, id, comment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#updateComment");
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
 **postId** | **Long**|  |
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
**403** | Forbidden. |  -  |
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

