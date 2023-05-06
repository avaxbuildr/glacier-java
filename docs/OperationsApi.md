# OperationsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOperationResult**](OperationsApi.md#getOperationResult) | **GET** /v1/operations/{operationId} | Retrieve operation result with given operation id
[**postTransactionExportJob**](OperationsApi.md#postTransactionExportJob) | **POST** /v1/operations/transactions:export | Trigger a transaction export operation with given parameters.

<a name="getOperationResult"></a>
# **getOperationResult**
> OperationStatusResponse getOperationResult(operationId)

Retrieve operation result with given operation id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OperationsApi;


OperationsApi apiInstance = new OperationsApi();
String operationId = "operationId_example"; // String | UUID of given operation
try {
    OperationStatusResponse result = apiInstance.getOperationResult(operationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#getOperationResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operationId** | **String**| UUID of given operation |

### Return type

[**OperationStatusResponse**](OperationStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTransactionExportJob"></a>
# **postTransactionExportJob**
> OperationStatusResponse postTransactionExportJob(body)

Trigger a transaction export operation with given parameters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OperationsApi;


OperationsApi apiInstance = new OperationsApi();
CreateTransactionExportRequest body = new CreateTransactionExportRequest(); // CreateTransactionExportRequest | 
try {
    OperationStatusResponse result = apiInstance.postTransactionExportJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OperationsApi#postTransactionExportJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateTransactionExportRequest**](CreateTransactionExportRequest.md)|  |

### Return type

[**OperationStatusResponse**](OperationStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

