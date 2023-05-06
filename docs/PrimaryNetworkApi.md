# PrimaryNetworkApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAssetDetails**](PrimaryNetworkApi.md#getAssetDetails) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/assets/{assetId} | Returns asset details corresponding to the asset id on X-Chain.
[**getAssetTransactions**](PrimaryNetworkApi.md#getAssetTransactions) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/assets/{assetId}/transactions | Returns asset transactions corresponding to the asset id on X-Chain.
[**getBalancesByAddresses**](PrimaryNetworkApi.md#getBalancesByAddresses) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/balances | Returns balance for P-Chain, X-Chain, and C-Chain (only shared memory balance for C-Chain).
[**getBlockById**](PrimaryNetworkApi.md#getBlockById) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/blocks/{blockId} | Returns block by block_height or block_hash on P-Chain, X-Chain (Cortina), C-Chain (hexadecimal for C-Chain).
[**getChainAddresses**](PrimaryNetworkApi.md#getChainAddresses) | **GET** /v1/networks/{network}/addresses:listChainIds | Return all address-mapped chain IDs that an address has been seen on chain before.
[**getTxByHash**](PrimaryNetworkApi.md#getTxByHash) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/transactions/{txHash} | Returns the details of the supplied transaction hash.
[**getUtxosByAddresses**](PrimaryNetworkApi.md#getUtxosByAddresses) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/utxos | Returns a list of UTXOs for the supplied addresses.
[**getVertexByHash**](PrimaryNetworkApi.md#getVertexByHash) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/vertices/{vertexHash} | Returns one vertex with the provided vertex hash on X-Chain.
[**getVertexByHeight**](PrimaryNetworkApi.md#getVertexByHeight) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/vertices:listByHeight | Returns vertices with the provided vertex height on X-Chain.
[**listActivePrimaryNetworkStakingTransactions**](PrimaryNetworkApi.md#listActivePrimaryNetworkStakingTransactions) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/transactions:listStaking | Returns active staking transactions for supplied addresses.
[**listLatestPrimaryNetworkBlocks**](PrimaryNetworkApi.md#listLatestPrimaryNetworkBlocks) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/blocks | Returns latest blocks, up to user defined limit on P-Chain, X-Chain or C-Chain.
[**listLatestPrimaryNetworkTransactions**](PrimaryNetworkApi.md#listLatestPrimaryNetworkTransactions) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/transactions | Returns latest transactions. If addresses are supplied, returns transactions for those addresses.
[**listLatestXChainVertices**](PrimaryNetworkApi.md#listLatestXChainVertices) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/vertices | Returns latest vertices, up to user defined limit on X-Chain.
[**listPrimaryNetworkBlocksByNodeId**](PrimaryNetworkApi.md#listPrimaryNetworkBlocksByNodeId) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/nodes/{nodeId}/blocks | Returns latest blocks proposed by a given NodeID, up to user defined limit.

<a name="getAssetDetails"></a>
# **getAssetDetails**
> XChainAssetDetails getAssetDetails(assetId)

Returns asset details corresponding to the asset id on X-Chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
String assetId = "assetId_example"; // String | Asset ID for any asset on X-Chain
try {
    XChainAssetDetails result = apiInstance.getAssetDetails(assetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getAssetDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **String**| Asset ID for any asset on X-Chain |

### Return type

[**XChainAssetDetails**](XChainAssetDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetTransactions"></a>
# **getAssetTransactions**
> ListXChainTransactionsResponse getAssetTransactions(blockchainId, network, assetId, pageSize, pageToken)

Returns asset transactions corresponding to the asset id on X-Chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
XChainId blockchainId = new XChainId(); // XChainId | A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String assetId = "assetId_example"; // String | Asset ID for any asset on X-Chain
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListXChainTransactionsResponse result = apiInstance.getAssetTransactions(blockchainId, network, assetId, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getAssetTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**XChainId**](.md)| A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **assetId** | **String**| Asset ID for any asset on X-Chain |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListXChainTransactionsResponse**](ListXChainTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBalancesByAddresses"></a>
# **getBalancesByAddresses**
> InlineResponse2004 getBalancesByAddresses(blockchainId, network, addresses)

Returns balance for P-Chain, X-Chain, and C-Chain (only shared memory balance for C-Chain).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String addresses = "addresses_example"; // String | A comma separated list of X-Chain or P-Chain wallet addresses, starting with \"avax\"/\"fuji\", \"P-avax\"/\"P-fuji\" or \"X-avax\"/\"X-fuji\".
try {
    InlineResponse2004 result = apiInstance.getBalancesByAddresses(blockchainId, network, addresses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getBalancesByAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **addresses** | **String**| A comma separated list of X-Chain or P-Chain wallet addresses, starting with \&quot;avax\&quot;/\&quot;fuji\&quot;, \&quot;P-avax\&quot;/\&quot;P-fuji\&quot; or \&quot;X-avax\&quot;/\&quot;X-fuji\&quot;. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBlockById"></a>
# **getBlockById**
> Block getBlockById(blockchainId, network, blockId)

Returns block by block_height or block_hash on P-Chain, X-Chain (Cortina), C-Chain (hexadecimal for C-Chain).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String blockId = "blockId_example"; // String | A block identifier which is either a block number or the block hash.
try {
    Block result = apiInstance.getBlockById(blockchainId, network, blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getBlockById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **blockId** | **String**| A block identifier which is either a block number or the block hash. |

### Return type

[**Block**](Block.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getChainAddresses"></a>
# **getChainAddresses**
> ChainAddressChainIdMapListResponse getChainAddresses(addresses, network)

Return all address-mapped chain IDs that an address has been seen on chain before.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
String addresses = "addresses_example"; // String | A comma separated list of X-Chain or P-Chain wallet addresses, starting with \"avax\"/\"fuji\", \"P-avax\"/\"P-fuji\" or \"X-avax\"/\"X-fuji\".
Network network = new Network(); // Network | Either mainnet or a testnet.
try {
    ChainAddressChainIdMapListResponse result = apiInstance.getChainAddresses(addresses, network);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getChainAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addresses** | **String**| A comma separated list of X-Chain or P-Chain wallet addresses, starting with \&quot;avax\&quot;/\&quot;fuji\&quot;, \&quot;P-avax\&quot;/\&quot;P-fuji\&quot; or \&quot;X-avax\&quot;/\&quot;X-fuji\&quot;. |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |

### Return type

[**ChainAddressChainIdMapListResponse**](ChainAddressChainIdMapListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTxByHash"></a>
# **getTxByHash**
> InlineResponse2001 getTxByHash(blockchainId, network, txHash)

Returns the details of the supplied transaction hash.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String txHash = "txHash_example"; // String | A primary network (P or X chain) transaction hash.
try {
    InlineResponse2001 result = apiInstance.getTxByHash(blockchainId, network, txHash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getTxByHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **txHash** | **String**| A primary network (P or X chain) transaction hash. |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUtxosByAddresses"></a>
# **getUtxosByAddresses**
> InlineResponse2003 getUtxosByAddresses(blockchainId, network, addresses, pageSize, pageToken, assetId, sortOrder)

Returns a list of UTXOs for the supplied addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String addresses = "addresses_example"; // String | A comma separated list of X-Chain or P-Chain wallet addresses, starting with \"avax\"/\"fuji\", \"P-avax\"/\"P-fuji\" or \"X-avax\"/\"X-fuji\".
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
String assetId = "assetId_example"; // String | Asset ID for any asset (only applicable X-Chain)
SortOrder sortOrder = new SortOrder(); // SortOrder | The order by which to sort results. Use \"asc\" for ascending       order, \"desc\" for descending order. Sorted by timestamp or the `sortBy`       query parameter, if provided.
try {
    InlineResponse2003 result = apiInstance.getUtxosByAddresses(blockchainId, network, addresses, pageSize, pageToken, assetId, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getUtxosByAddresses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **addresses** | **String**| A comma separated list of X-Chain or P-Chain wallet addresses, starting with \&quot;avax\&quot;/\&quot;fuji\&quot;, \&quot;P-avax\&quot;/\&quot;P-fuji\&quot; or \&quot;X-avax\&quot;/\&quot;X-fuji\&quot;. | [optional]
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]
 **assetId** | **String**| Asset ID for any asset (only applicable X-Chain) | [optional]
 **sortOrder** | [**SortOrder**](.md)| The order by which to sort results. Use \&quot;asc\&quot; for ascending       order, \&quot;desc\&quot; for descending order. Sorted by timestamp or the &#x60;sortBy&#x60;       query parameter, if provided. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVertexByHash"></a>
# **getVertexByHash**
> XChainVertex getVertexByHash(vertexHash, blockchainId, network)

Returns one vertex with the provided vertex hash on X-Chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
String vertexHash = "vertexHash_example"; // String | A vertex hash string.
XChainId blockchainId = new XChainId(); // XChainId | A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
try {
    XChainVertex result = apiInstance.getVertexByHash(vertexHash, blockchainId, network);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getVertexByHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vertexHash** | **String**| A vertex hash string. |
 **blockchainId** | [**XChainId**](.md)| A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |

### Return type

[**XChainVertex**](XChainVertex.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVertexByHeight"></a>
# **getVertexByHeight**
> ListXChainVerticesResponse getVertexByHeight(vertexHeight, blockchainId, network, pageSize, pageToken, sortOrder)

Returns vertices with the provided vertex height on X-Chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
Integer vertexHeight = 56; // Integer | The height of a vertex.
XChainId blockchainId = new XChainId(); // XChainId | A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
SortOrder sortOrder = new SortOrder(); // SortOrder | The order by which to sort results. Use \"asc\" for ascending       order, \"desc\" for descending order. Sorted by timestamp or the `sortBy`       query parameter, if provided.
try {
    ListXChainVerticesResponse result = apiInstance.getVertexByHeight(vertexHeight, blockchainId, network, pageSize, pageToken, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#getVertexByHeight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vertexHeight** | **Integer**| The height of a vertex. | [enum: 0]
 **blockchainId** | [**XChainId**](.md)| A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]
 **sortOrder** | [**SortOrder**](.md)| The order by which to sort results. Use \&quot;asc\&quot; for ascending       order, \&quot;desc\&quot; for descending order. Sorted by timestamp or the &#x60;sortBy&#x60;       query parameter, if provided. | [optional]

### Return type

[**ListXChainVerticesResponse**](ListXChainVerticesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActivePrimaryNetworkStakingTransactions"></a>
# **listActivePrimaryNetworkStakingTransactions**
> ListPChainTransactionsResponse listActivePrimaryNetworkStakingTransactions(blockchainId, network, addresses, pageSize, pageToken, sortOrder)

Returns active staking transactions for supplied addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
PChainId blockchainId = new PChainId(); // PChainId | A supported chain name for P-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String addresses = "addresses_example"; // String | A comma separated list of X-Chain or P-Chain wallet addresses, starting with \"avax\"/\"fuji\", \"P-avax\"/\"P-fuji\" or \"X-avax\"/\"X-fuji\".
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
SortOrder sortOrder = new SortOrder(); // SortOrder | The order by which to sort results. Use \"asc\" for ascending       order, \"desc\" for descending order. Sorted by timestamp or the `sortBy`       query parameter, if provided.
try {
    ListPChainTransactionsResponse result = apiInstance.listActivePrimaryNetworkStakingTransactions(blockchainId, network, addresses, pageSize, pageToken, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#listActivePrimaryNetworkStakingTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**PChainId**](.md)| A supported chain name for P-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **addresses** | **String**| A comma separated list of X-Chain or P-Chain wallet addresses, starting with \&quot;avax\&quot;/\&quot;fuji\&quot;, \&quot;P-avax\&quot;/\&quot;P-fuji\&quot; or \&quot;X-avax\&quot;/\&quot;X-fuji\&quot;. | [optional]
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]
 **sortOrder** | [**SortOrder**](.md)| The order by which to sort results. Use \&quot;asc\&quot; for ascending       order, \&quot;desc\&quot; for descending order. Sorted by timestamp or the &#x60;sortBy&#x60;       query parameter, if provided. | [optional]

### Return type

[**ListPChainTransactionsResponse**](ListPChainTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLatestPrimaryNetworkBlocks"></a>
# **listLatestPrimaryNetworkBlocks**
> ListBlocksResponse listLatestPrimaryNetworkBlocks(blockchainId, network, pageSize, pageToken)

Returns latest blocks, up to user defined limit on P-Chain, X-Chain or C-Chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListBlocksResponse result = apiInstance.listLatestPrimaryNetworkBlocks(blockchainId, network, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#listLatestPrimaryNetworkBlocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListBlocksResponse**](ListBlocksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLatestPrimaryNetworkTransactions"></a>
# **listLatestPrimaryNetworkTransactions**
> InlineResponse2002 listLatestPrimaryNetworkTransactions(blockchainId, network, addresses, pageSize, pageToken, sortOrder)

Returns latest transactions. If addresses are supplied, returns transactions for those addresses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String addresses = "addresses_example"; // String | A comma separated list of X-Chain or P-Chain wallet addresses, starting with \"avax\"/\"fuji\", \"P-avax\"/\"P-fuji\" or \"X-avax\"/\"X-fuji\".
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
SortOrder sortOrder = new SortOrder(); // SortOrder | The order by which to sort results. Use \"asc\" for ascending       order, \"desc\" for descending order. Sorted by timestamp or the `sortBy`       query parameter, if provided.
try {
    InlineResponse2002 result = apiInstance.listLatestPrimaryNetworkTransactions(blockchainId, network, addresses, pageSize, pageToken, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#listLatestPrimaryNetworkTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **addresses** | **String**| A comma separated list of X-Chain or P-Chain wallet addresses, starting with \&quot;avax\&quot;/\&quot;fuji\&quot;, \&quot;P-avax\&quot;/\&quot;P-fuji\&quot; or \&quot;X-avax\&quot;/\&quot;X-fuji\&quot;. | [optional]
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]
 **sortOrder** | [**SortOrder**](.md)| The order by which to sort results. Use \&quot;asc\&quot; for ascending       order, \&quot;desc\&quot; for descending order. Sorted by timestamp or the &#x60;sortBy&#x60;       query parameter, if provided. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLatestXChainVertices"></a>
# **listLatestXChainVertices**
> ListXChainVerticesResponse listLatestXChainVertices(blockchainId, network, pageSize, pageToken)

Returns latest vertices, up to user defined limit on X-Chain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
XChainId blockchainId = new XChainId(); // XChainId | A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListXChainVerticesResponse result = apiInstance.listLatestXChainVertices(blockchainId, network, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#listLatestXChainVertices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**XChainId**](.md)| A supported chain name for X-Chain. BlockchainId values will be deprecated in a future release. Please use chain names like x-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListXChainVerticesResponse**](ListXChainVerticesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPrimaryNetworkBlocksByNodeId"></a>
# **listPrimaryNetworkBlocksByNodeId**
> ListBlocksResponse listPrimaryNetworkBlocksByNodeId(blockchainId, network, nodeId, pageSize, pageToken)

Returns latest blocks proposed by a given NodeID, up to user defined limit.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PrimaryNetworkApi;


PrimaryNetworkApi apiInstance = new PrimaryNetworkApi();
BlockchainId blockchainId = new BlockchainId(); // BlockchainId | A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead!
Network network = new Network(); // Network | Either mainnet or a testnet.
String nodeId = "nodeId_example"; // String | A primary network (P or X chain) nodeId.
Integer pageSize = 10; // Integer | The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100.
String pageToken = "pageToken_example"; // String | A page token, received from a previous list call. Provide this to retrieve the subsequent page.
try {
    ListBlocksResponse result = apiInstance.listPrimaryNetworkBlocksByNodeId(blockchainId, network, nodeId, pageSize, pageToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrimaryNetworkApi#listPrimaryNetworkBlocksByNodeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockchainId** | [**BlockchainId**](.md)| A supported chain name. BlockchainId values will be deprecated in a future release. Please use chain names like p-chain, x-chain or c-chain instead! |
 **network** | [**Network**](.md)| Either mainnet or a testnet. |
 **nodeId** | **String**| A primary network (P or X chain) nodeId. |
 **pageSize** | **Integer**| The maximum number of items to return. The minimum page size       is 1. The maximum pageSize is 100. | [optional] [default to 10] [enum: 1, 100]
 **pageToken** | **String**| A page token, received from a previous list call. Provide this to retrieve the subsequent page. | [optional]

### Return type

[**ListBlocksResponse**](ListBlocksResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

