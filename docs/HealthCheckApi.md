# HealthCheckApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCheck**](HealthCheckApi.md#healthCheck) | **GET** /v1/health-check | Get the health of the service.

<a name="healthCheck"></a>
# **healthCheck**
> InlineResponse200 healthCheck()

Get the health of the service.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCheckApi;


HealthCheckApi apiInstance = new HealthCheckApi();
try {
    InlineResponse200 result = apiInstance.healthCheck();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCheckApi#healthCheck");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

