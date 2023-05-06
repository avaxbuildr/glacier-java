# EvmApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlock**](EvmApi.md#getBlock) | **GET** /v1/chains/{chainId}/blocks/{blockId} | Returns the details of an individual block for the chain.
[**getChainInfo**](EvmApi.md#getChainInfo) | **GET** /v1/chains/{chainId} | Gets chain information by chain id.
[**getDeploymentTransaction**](EvmApi.md#getDeploymentTransaction) | **GET** /v1/chains/{chainId}/contracts/{address}/transactions:getDeployment | If the address is a smart contract, returns the transaction at which it was deployed.
[**getLatestBlocks**](EvmApi.md#getLatestBlocks) | **GET** /v1/chains/{chainId}/blocks | Returns the latest blocks indexed for the chain.
[**getNativeBalance**](EvmApi.md#getNativeBalance) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:getNative | Get native token balance of a wallet address for a given chain.
[**getTransaction**](EvmApi.md#getTransaction) | **GET** /v1/chains/{chainId}/transactions/{txHash} | Gets the details of a single transaction.
[**getTransactionsForBlock**](EvmApi.md#getTransactionsForBlock) | **GET** /v1/chains/{chainId}/blocks/{blockId}/transactions | Gets the transactions that occured in a given block.
[**listCollectibleBalances**](EvmApi.md#listCollectibleBalances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listCollectibles | List ERC-721 and ERC-1155 token balances of a wallet address         for a given chain.
[**listErc1155Balances**](EvmApi.md#listErc1155Balances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listErc1155 | List ERC-1155 token balances of a wallet address for a given chain.
[**listErc1155Transactions**](EvmApi.md#listErc1155Transactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listErc1155 | Lists of ERC-1155 transfers for an address.
[**listErc20Balances**](EvmApi.md#listErc20Balances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listErc20 | List ERC-20 token balances of a wallet address for a given chain.
[**listErc20Transactions**](EvmApi.md#listErc20Transactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listErc20 | Lists ERC-20 transfers for an address.
[**listErc721Balances**](EvmApi.md#listErc721Balances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listErc721 | List ERC-721 token balances of a wallet address for a given chain.
[**listErc721Transactions**](EvmApi.md#listErc721Transactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listErc721 | Lists ERC-721 transfers for an address.
[**listInternalTransactions**](EvmApi.md#listInternalTransactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listInternals | Lists internal transactions for an address.
[**listLatestTransactions**](EvmApi.md#listLatestTransactions) | **GET** /v1/chains/{chainId}/transactions | Gets the latest transactions; can be filtered by status.
[**listNativeTransactions**](EvmApi.md#listNativeTransactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listNative | Gets a list of native transactions for an address and chain.
[**listTransactions**](EvmApi.md#listTransactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions | Gets a list of transactions for an address and chain.
[**listTransfers**](EvmApi.md#listTransfers) | **GET** /v1/chains/{chainId}/tokens/{address}/transfers | Gets a list of erc transfers for an ERC-20, ERC-721,         or ERC-1155 contract address.
[**supportedChains**](EvmApi.md#supportedChains) | **GET** /v1/chains | Gets the list of chains supported by the api.

<a name="getBlock"></a>
# **getBlock**
> GetBlockResponse getBlock(chainId, blockId)

Returns the details of an individual block for the chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String blockId = "blockId_example"; // String | A block identifier which is either a block number or the block hash.
try {
    GetBlockResponse result = apiInstance.getBlock(chainId, blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **blockId** | **String**| A block identifier which is either a block number or the block hash. |

### Return type

[**GetBlockResponse**](GetBlockResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChainInfo"></a>
# **getChainInfo**
> GetChainResponse getChainInfo(chainId)

Gets chain information by chain id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
try {
    GetChainResponse result = apiInstance.getChainInfo(chainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getChainInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |

### Return type

[**GetChainResponse**](GetChainResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDeploymentTransaction"></a>
# **getDeploymentTransaction**
> GetTransactionResponse getDeploymentTransaction(chainId, address, currency)

If the address is a smart contract, returns the transaction at which it was deployed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | Contract address on the relevant chain.
CurrencyCode currency = new CurrencyCode(); // CurrencyCode | The currency that return values should use. Defaults to USD.
try {
    GetTransactionResponse result = apiInstance.getDeploymentTransaction(chainId, address, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getDeploymentTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| Contract address on the relevant chain. |
 **currency** | [**CurrencyCode**](.md)| The currency that return values should use. Defaults to USD. | [optional]

### Return type

[**GetTransactionResponse**](GetTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLatestBlocks"></a>
# **getLatestBlocks**
> ListBlocksResponse getLatestBlocks(chainId, pageSize, pageToken)

Returns the latest blocks indexed for the chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListBlocksResponse result = apiInstance.getLatestBlocks(chainId, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getLatestBlocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListBlocksResponse**](ListBlocksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNativeBalance"></a>
# **getNativeBalance**
> GetNativeBalanceResponse getNativeBalance(chainId, address, currency)

Get native token balance of a wallet address for a given chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
CurrencyCode currency = new CurrencyCode(); // CurrencyCode | The currency that return values should use. Defaults to USD.
try {
    GetNativeBalanceResponse result = apiInstance.getNativeBalance(chainId, address, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getNativeBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **currency** | [**CurrencyCode**](.md)| The currency that return values should use. Defaults to USD. | [optional]

### Return type

[**GetNativeBalanceResponse**](GetNativeBalanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransaction"></a>
# **getTransaction**
> GetTransactionResponse getTransaction(chainId, txHash)

Gets the details of a single transaction.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String txHash = "txHash_example"; // String | A transaction hash.
try {
    GetTransactionResponse result = apiInstance.getTransaction(chainId, txHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **txHash** | **String**| A transaction hash. |

### Return type

[**GetTransactionResponse**](GetTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionsForBlock"></a>
# **getTransactionsForBlock**
> ListNativeTransactionsResponse getTransactionsForBlock(chainId, blockId)

Gets the transactions that occured in a given block.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String blockId = "blockId_example"; // String | A block identifier which is either a block number or the block hash.
try {
    ListNativeTransactionsResponse result = apiInstance.getTransactionsForBlock(chainId, blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#getTransactionsForBlock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **blockId** | **String**| A block identifier which is either a block number or the block hash. |

### Return type

[**ListNativeTransactionsResponse**](ListNativeTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCollectibleBalances"></a>
# **listCollectibleBalances**
> ListCollectibleBalancesResponse listCollectibleBalances(chainId, address, pageSize, pageToken)

List ERC-721 and ERC-1155 token balances of a wallet address         for a given chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListCollectibleBalancesResponse result = apiInstance.listCollectibleBalances(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listCollectibleBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListCollectibleBalancesResponse**](ListCollectibleBalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErc1155Balances"></a>
# **listErc1155Balances**
> ListErc1155BalancesResponse listErc1155Balances(chainId, address, pageSize, pageToken)

List ERC-1155 token balances of a wallet address for a given chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListErc1155BalancesResponse result = apiInstance.listErc1155Balances(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listErc1155Balances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListErc1155BalancesResponse**](ListErc1155BalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErc1155Transactions"></a>
# **listErc1155Transactions**
> ListErc1155TransactionsResponse listErc1155Transactions(chainId, address, pageSize, pageToken)

Lists of ERC-1155 transfers for an address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListErc1155TransactionsResponse result = apiInstance.listErc1155Transactions(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listErc1155Transactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListErc1155TransactionsResponse**](ListErc1155TransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErc20Balances"></a>
# **listErc20Balances**
> ListErc20BalancesResponse listErc20Balances(chainId, address, pageSize, pageToken, currency)

List ERC-20 token balances of a wallet address for a given chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
CurrencyCode currency = new CurrencyCode(); // CurrencyCode | The currency that return values should use. Defaults to USD.
try {
    ListErc20BalancesResponse result = apiInstance.listErc20Balances(chainId, address, pageSize, pageToken, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listErc20Balances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]
 **currency** | [**CurrencyCode**](.md)| The currency that return values should use. Defaults to USD. | [optional]

### Return type

[**ListErc20BalancesResponse**](ListErc20BalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErc20Transactions"></a>
# **listErc20Transactions**
> ListErc20TransactionsResponse listErc20Transactions(chainId, address, pageSize, pageToken)

Lists ERC-20 transfers for an address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListErc20TransactionsResponse result = apiInstance.listErc20Transactions(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listErc20Transactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListErc20TransactionsResponse**](ListErc20TransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErc721Balances"></a>
# **listErc721Balances**
> ListErc721BalancesResponse listErc721Balances(chainId, address, pageSize, pageToken)

List ERC-721 token balances of a wallet address for a given chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListErc721BalancesResponse result = apiInstance.listErc721Balances(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listErc721Balances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListErc721BalancesResponse**](ListErc721BalancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listErc721Transactions"></a>
# **listErc721Transactions**
> ListErc721TransactionsResponse listErc721Transactions(chainId, address, pageSize, pageToken)

Lists ERC-721 transfers for an address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListErc721TransactionsResponse result = apiInstance.listErc721Transactions(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listErc721Transactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListErc721TransactionsResponse**](ListErc721TransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listInternalTransactions"></a>
# **listInternalTransactions**
> ListInternalTransactionsResponse listInternalTransactions(chainId, address, pageSize, pageToken)

Lists internal transactions for an address.

Returns a list of internal transactions for an address and         chain. Note that the internal transactions list only contains CALL or         CALLCODE transactions with a non-zero value and CREATE/CREATE2         transactions. To get a complete list of internal transactions use the          &#x60;debug_&#x60; prefixed RPC methods on an archive node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListInternalTransactionsResponse result = apiInstance.listInternalTransactions(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listInternalTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListInternalTransactionsResponse**](ListInternalTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLatestTransactions"></a>
# **listLatestTransactions**
> ListNativeTransactionsResponse listLatestTransactions(chainId, pageSize, pageToken, status)

Gets the latest transactions; can be filtered by status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
TransactionStatus status = new TransactionStatus(); // TransactionStatus | A status filter for listed transactions.
try {
    ListNativeTransactionsResponse result = apiInstance.listLatestTransactions(chainId, pageSize, pageToken, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listLatestTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]
 **status** | [**TransactionStatus**](.md)| A status filter for listed transactions. | [optional]

### Return type

[**ListNativeTransactionsResponse**](ListNativeTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listNativeTransactions"></a>
# **listNativeTransactions**
> ListNativeTransactionsResponse listNativeTransactions(chainId, address, pageSize, pageToken)

Gets a list of native transactions for an address and chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListNativeTransactionsResponse result = apiInstance.listNativeTransactions(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listNativeTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListNativeTransactionsResponse**](ListNativeTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransactions"></a>
# **listTransactions**
> ListTransactionDetailsResponse listTransactions(chainId, address, pageSize, pageToken)

Gets a list of transactions for an address and chain.

Returns a list of transactions where the given wallet         address had an on-chain interaction for a given chain. The ERC-20          transfers, ERC-721 transfers, ERC-1155, and internal transactions         returned are only those where the input address had an interaction.         Specifically, those list only inlcude entries where the input address         was the sender (&#x60;from&#x60; field) or the receiver (&#x60;to&#x60; field) for the         sub-transaction. Therefore the transactions returned from this list may         not be complete representations of the on-chain data. For a complete         view of a transaction use the &#x60;/chains/:chainId/transactions/:txHash&#x60;         endpoint.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListTransactionDetailsResponse result = apiInstance.listTransactions(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListTransactionDetailsResponse**](ListTransactionDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTransfers"></a>
# **listTransfers**
> ListTransfersResponse listTransfers(chainId, address, pageSize, pageToken)

Gets a list of erc transfers for an ERC-20, ERC-721,         or ERC-1155 contract address.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
String address = "address_example"; // String | A wallet address.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListTransfersResponse result = apiInstance.listTransfers(chainId, address, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#listTransfers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chainId** | **String**| A supported evm chain id. Use the &#x60;/chains&#x60; endpoint to get        a list of supported chain ids. |
 **address** | **String**| A wallet address. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListTransfersResponse**](ListTransfersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="supportedChains"></a>
# **supportedChains**
> ListChainsResponse supportedChains()

Gets the list of chains supported by the api.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.EvmApi;


EvmApi apiInstance = new EvmApi();
try {
    ListChainsResponse result = apiInstance.supportedChains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EvmApi#supportedChains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListChainsResponse**](ListChainsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

