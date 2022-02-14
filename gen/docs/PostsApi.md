# PostsApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPost**](PostsApi.md#createPost) | **POST** /posts | Create Post
[**getPost**](PostsApi.md#getPost) | **GET** /posts/{id} | Get Post by ID
[**getPosts**](PostsApi.md#getPosts) | **GET** /posts | Get posts
[**removePost**](PostsApi.md#removePost) | **DELETE** /posts/{id} | Remove Post
[**updatePost**](PostsApi.md#updatePost) | **PUT** /posts/{id} | Update Post


<a name="createPost"></a>
# **createPost**
> Post createPost(post)

Create Post

Create a new Post.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PostsApi apiInstance = new PostsApi(defaultClient);
    Post post = new Post(); // Post | 
    try {
      Post result = apiInstance.createPost(post);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#createPost");
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
 **post** | [**Post**](Post.md)|  |

### Return type

[**Post**](Post.md)

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

<a name="getPost"></a>
# **getPost**
> Post getPost(id)

Get Post by ID

Retrieves an existing Post associated with the specified ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PostsApi apiInstance = new PostsApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      Post result = apiInstance.getPost(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#getPost");
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

[**Post**](Post.md)

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

<a name="getPosts"></a>
# **getPosts**
> List&lt;Post&gt; getPosts(id, tagId, tagName, authorName, sort, pageNum, pageSize)

Get posts

Uses query keys to retrieve a subset of existing posts.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PostsApi apiInstance = new PostsApi(defaultClient);
    Long id = 56L; // Long | 
    Long tagId = 56L; // Long | 
    String tagName = "tagName_example"; // String | 
    String authorName = "authorName_example"; // String | 
    String sort = "-id"; // String | In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
    Integer pageNum = 0; // Integer | 
    Integer pageSize = 10; // Integer | 
    try {
      List<Post> result = apiInstance.getPosts(id, tagId, tagName, authorName, sort, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#getPosts");
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
 **tagId** | **Long**|  | [optional]
 **tagName** | **String**|  | [optional]
 **authorName** | **String**|  | [optional]
 **sort** | **String**| In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  | [optional] [default to -id] [enum: id, -id, title, -title]
 **pageNum** | **Integer**|  | [optional] [default to 0]
 **pageSize** | **Integer**|  | [optional] [default to 10]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Total-Count -  <br>  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="removePost"></a>
# **removePost**
> removePost(id)

Remove Post

Deletes a Post associated with a specified ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PostsApi apiInstance = new PostsApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.removePost(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#removePost");
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
**403** | Forbidden. |  -  |
**404** | The specified resource was not found. |  -  |
**0** | The unknown error appeard. Check your payload or contact support. |  -  |

<a name="updatePost"></a>
# **updatePost**
> Post updatePost(id, post)

Update Post

Updates information on a Post that exists in the system by the specified ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    PostsApi apiInstance = new PostsApi(defaultClient);
    Long id = 56L; // Long | 
    Post post = new Post(); // Post | 
    try {
      Post result = apiInstance.updatePost(id, post);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#updatePost");
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
 **post** | [**Post**](Post.md)|  |

### Return type

[**Post**](Post.md)

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

