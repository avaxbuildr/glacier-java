# Avalanche Glacier API Java Client

Playing with the [Avalanche Glacier API](https://glacier-api.avax.network/api#/) in Java

- API version: Beta
- Build date: 2023-05-05

The Glacier API provides web3 application developers with multi-chain        
data related to Avalanche's primary network, Avalanche subnets, and        
Ethereum. With Glacier, you can easily build products that leverage        
real-time and historical transaction and transfer history, native and        
token balances, and various types of token metadata. The API is in Beta        
and may be subject to change.

Generated using [Codegen](https://github.com/swagger-api/swagger-codegen)

## Contact

@AvaxBuildr
- https://crypto.bi

- https://twitter.com/avaxbuildr


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
        EvmApi apiInstance = new EvmApi();
        String chainId = "chainId_example"; // String | A supported evm chain id. Use the `/chains` endpoint to get        a list of supported chain ids.
        try {
            GetChainResponse result = apiInstance.getChainInfo(chainId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EvmApi#getChainInfo");
            e.printStackTrace();
        }
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.EvmApi;

import java.io.File;
import java.util.*;

public class EvmApiExample {

    public static void main(String[] args) {
        
        EvmApi apiInstance = new EvmApi();
        try {
            ListChainsResponse result = apiInstance.supportedChains();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EvmApi#supportedChains");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EvmApi* | [**getBlock**](docs/EvmApi.md#getBlock) | **GET** /v1/chains/{chainId}/blocks/{blockId} | Returns the details of an individual block for the chain.
*EvmApi* | [**getChainInfo**](docs/EvmApi.md#getChainInfo) | **GET** /v1/chains/{chainId} | Gets chain information by chain id.
*EvmApi* | [**getDeploymentTransaction**](docs/EvmApi.md#getDeploymentTransaction) | **GET** /v1/chains/{chainId}/contracts/{address}/transactions:getDeployment | If the address is a smart contract, returns the transaction at which it was deployed.
*EvmApi* | [**getLatestBlocks**](docs/EvmApi.md#getLatestBlocks) | **GET** /v1/chains/{chainId}/blocks | Returns the latest blocks indexed for the chain.
*EvmApi* | [**getNativeBalance**](docs/EvmApi.md#getNativeBalance) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:getNative | Get native token balance of a wallet address for a given chain.
*EvmApi* | [**getTransaction**](docs/EvmApi.md#getTransaction) | **GET** /v1/chains/{chainId}/transactions/{txHash} | Gets the details of a single transaction.
*EvmApi* | [**getTransactionsForBlock**](docs/EvmApi.md#getTransactionsForBlock) | **GET** /v1/chains/{chainId}/blocks/{blockId}/transactions | Gets the transactions that occured in a given block.
*EvmApi* | [**listCollectibleBalances**](docs/EvmApi.md#listCollectibleBalances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listCollectibles | List ERC-721 and ERC-1155 token balances of a wallet address         for a given chain.
*EvmApi* | [**listErc1155Balances**](docs/EvmApi.md#listErc1155Balances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listErc1155 | List ERC-1155 token balances of a wallet address for a given chain.
*EvmApi* | [**listErc1155Transactions**](docs/EvmApi.md#listErc1155Transactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listErc1155 | Lists of ERC-1155 transfers for an address.
*EvmApi* | [**listErc20Balances**](docs/EvmApi.md#listErc20Balances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listErc20 | List ERC-20 token balances of a wallet address for a given chain.
*EvmApi* | [**listErc20Transactions**](docs/EvmApi.md#listErc20Transactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listErc20 | Lists ERC-20 transfers for an address.
*EvmApi* | [**listErc721Balances**](docs/EvmApi.md#listErc721Balances) | **GET** /v1/chains/{chainId}/addresses/{address}/balances:listErc721 | List ERC-721 token balances of a wallet address for a given chain.
*EvmApi* | [**listErc721Transactions**](docs/EvmApi.md#listErc721Transactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listErc721 | Lists ERC-721 transfers for an address.
*EvmApi* | [**listInternalTransactions**](docs/EvmApi.md#listInternalTransactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listInternals | Lists internal transactions for an address.
*EvmApi* | [**listLatestTransactions**](docs/EvmApi.md#listLatestTransactions) | **GET** /v1/chains/{chainId}/transactions | Gets the latest transactions; can be filtered by status.
*EvmApi* | [**listNativeTransactions**](docs/EvmApi.md#listNativeTransactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions:listNative | Gets a list of native transactions for an address and chain.
*EvmApi* | [**listTransactions**](docs/EvmApi.md#listTransactions) | **GET** /v1/chains/{chainId}/addresses/{address}/transactions | Gets a list of transactions for an address and chain.
*EvmApi* | [**listTransfers**](docs/EvmApi.md#listTransfers) | **GET** /v1/chains/{chainId}/tokens/{address}/transfers | Gets a list of erc transfers for an ERC-20, ERC-721,         or ERC-1155 contract address.
*EvmApi* | [**supportedChains**](docs/EvmApi.md#supportedChains) | **GET** /v1/chains | Gets the list of chains supported by the api.
*HealthCheckApi* | [**healthCheck**](docs/HealthCheckApi.md#healthCheck) | **GET** /v1/health-check | Get the health of the service.
*OperationsApi* | [**getOperationResult**](docs/OperationsApi.md#getOperationResult) | **GET** /v1/operations/{operationId} | Retrieve operation result with given operation id
*OperationsApi* | [**postTransactionExportJob**](docs/OperationsApi.md#postTransactionExportJob) | **POST** /v1/operations/transactions:export | Trigger a transaction export operation with given parameters.
*PrimaryNetworkApi* | [**getAssetDetails**](docs/PrimaryNetworkApi.md#getAssetDetails) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/assets/{assetId} | Returns asset details corresponding to the asset id on X-Chain.
*PrimaryNetworkApi* | [**getAssetTransactions**](docs/PrimaryNetworkApi.md#getAssetTransactions) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/assets/{assetId}/transactions | Returns asset transactions corresponding to the asset id on X-Chain.
*PrimaryNetworkApi* | [**getBalancesByAddresses**](docs/PrimaryNetworkApi.md#getBalancesByAddresses) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/balances | Returns balance for P-Chain, X-Chain, and C-Chain (only shared memory balance for C-Chain).
*PrimaryNetworkApi* | [**getBlockById**](docs/PrimaryNetworkApi.md#getBlockById) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/blocks/{blockId} | Returns block by block_height or block_hash on P-Chain, X-Chain (Cortina), C-Chain (hexadecimal for C-Chain).
*PrimaryNetworkApi* | [**getChainAddresses**](docs/PrimaryNetworkApi.md#getChainAddresses) | **GET** /v1/networks/{network}/addresses:listChainIds | Return all address-mapped chain IDs that an address has been seen on chain before.
*PrimaryNetworkApi* | [**getTxByHash**](docs/PrimaryNetworkApi.md#getTxByHash) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/transactions/{txHash} | Returns the details of the supplied transaction hash.
*PrimaryNetworkApi* | [**getUtxosByAddresses**](docs/PrimaryNetworkApi.md#getUtxosByAddresses) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/utxos | Returns a list of UTXOs for the supplied addresses.
*PrimaryNetworkApi* | [**getVertexByHash**](docs/PrimaryNetworkApi.md#getVertexByHash) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/vertices/{vertexHash} | Returns one vertex with the provided vertex hash on X-Chain.
*PrimaryNetworkApi* | [**getVertexByHeight**](docs/PrimaryNetworkApi.md#getVertexByHeight) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/vertices:listByHeight | Returns vertices with the provided vertex height on X-Chain.
*PrimaryNetworkApi* | [**listActivePrimaryNetworkStakingTransactions**](docs/PrimaryNetworkApi.md#listActivePrimaryNetworkStakingTransactions) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/transactions:listStaking | Returns active staking transactions for supplied addresses.
*PrimaryNetworkApi* | [**listLatestPrimaryNetworkBlocks**](docs/PrimaryNetworkApi.md#listLatestPrimaryNetworkBlocks) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/blocks | Returns latest blocks, up to user defined limit on P-Chain, X-Chain or C-Chain.
*PrimaryNetworkApi* | [**listLatestPrimaryNetworkTransactions**](docs/PrimaryNetworkApi.md#listLatestPrimaryNetworkTransactions) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/transactions | Returns latest transactions. If addresses are supplied, returns transactions for those addresses.
*PrimaryNetworkApi* | [**listLatestXChainVertices**](docs/PrimaryNetworkApi.md#listLatestXChainVertices) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/vertices | Returns latest vertices, up to user defined limit on X-Chain.
*PrimaryNetworkApi* | [**listPrimaryNetworkBlocksByNodeId**](docs/PrimaryNetworkApi.md#listPrimaryNetworkBlocksByNodeId) | **GET** /v1/networks/{network}/blockchains/{blockchainId}/nodes/{nodeId}/blocks | Returns latest blocks proposed by a given NodeID, up to user defined limit.

## Documentation for Models

 - [AllOfEVMInputAsset](docs/AllOfEVMInputAsset.md)
 - [AllOfEVMOutputAsset](docs/AllOfEVMOutputAsset.md)
 - [AllOfErc20TokenBalanceBalanceValue](docs/AllOfErc20TokenBalanceBalanceValue.md)
 - [AllOfErc20TokenBalancePrice](docs/AllOfErc20TokenBalancePrice.md)
 - [AllOfErc20TokenPrice](docs/AllOfErc20TokenPrice.md)
 - [AllOfGetNativeBalanceResponseNativeTokenBalance](docs/AllOfGetNativeBalanceResponseNativeTokenBalance.md)
 - [AllOfNativeTokenBalanceBalanceValue](docs/AllOfNativeTokenBalanceBalanceValue.md)
 - [AllOfNativeTokenBalancePrice](docs/AllOfNativeTokenBalancePrice.md)
 - [AllOfNetworkTokenDetailsCurrentPrice](docs/AllOfNetworkTokenDetailsCurrentPrice.md)
 - [AllOfNetworkTokenDetailsHistoricalPrice](docs/AllOfNetworkTokenDetailsHistoricalPrice.md)
 - [AllOfTransactionDetailsNativeTransaction](docs/AllOfTransactionDetailsNativeTransaction.md)
 - [AllOfXChainLinearTransactionAssetCreated](docs/AllOfXChainLinearTransactionAssetCreated.md)
 - [AllOfXChainNonLinearTransactionAssetCreated](docs/AllOfXChainNonLinearTransactionAssetCreated.md)
 - [AnyOfListCChainAtomicTransactionsResponseTransactionsItems](docs/AnyOfListCChainAtomicTransactionsResponseTransactionsItems.md)
 - [AnyOfListXChainTransactionsResponseTransactionsItems](docs/AnyOfListXChainTransactionsResponseTransactionsItems.md)
 - [Asset](docs/Asset.md)
 - [Block](docs/Block.md)
 - [BlockchainId](docs/BlockchainId.md)
 - [CChainAtomicBalances](docs/CChainAtomicBalances.md)
 - [CChainExportTransaction](docs/CChainExportTransaction.md)
 - [CChainImportTransaction](docs/CChainImportTransaction.md)
 - [CChainSharedAssetBalance](docs/CChainSharedAssetBalance.md)
 - [ChainAddressChainIdMap](docs/ChainAddressChainIdMap.md)
 - [ChainAddressChainIdMapListResponse](docs/ChainAddressChainIdMapListResponse.md)
 - [ChainInfo](docs/ChainInfo.md)
 - [ChainStatus](docs/ChainStatus.md)
 - [CreateTransactionExportRequest](docs/CreateTransactionExportRequest.md)
 - [CurrencyCode](docs/CurrencyCode.md)
 - [EVMInput](docs/EVMInput.md)
 - [EVMOutput](docs/EVMOutput.md)
 - [Erc1155Token](docs/Erc1155Token.md)
 - [Erc1155TokenBalance](docs/Erc1155TokenBalance.md)
 - [Erc1155TokenMetadata](docs/Erc1155TokenMetadata.md)
 - [Erc1155Transfer](docs/Erc1155Transfer.md)
 - [Erc1155TransferDetails](docs/Erc1155TransferDetails.md)
 - [Erc20Token](docs/Erc20Token.md)
 - [Erc20TokenBalance](docs/Erc20TokenBalance.md)
 - [Erc20Transfer](docs/Erc20Transfer.md)
 - [Erc20TransferDetails](docs/Erc20TransferDetails.md)
 - [Erc721Token](docs/Erc721Token.md)
 - [Erc721TokenBalance](docs/Erc721TokenBalance.md)
 - [Erc721TokenMetadata](docs/Erc721TokenMetadata.md)
 - [Erc721Transfer](docs/Erc721Transfer.md)
 - [Erc721TransferDetails](docs/Erc721TransferDetails.md)
 - [EvmNetworkOptions](docs/EvmNetworkOptions.md)
 - [FullNativeTransactionDetails](docs/FullNativeTransactionDetails.md)
 - [GetBlockResponse](docs/GetBlockResponse.md)
 - [GetChainResponse](docs/GetChainResponse.md)
 - [GetNativeBalanceResponse](docs/GetNativeBalanceResponse.md)
 - [GetTransactionResponse](docs/GetTransactionResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse503](docs/InlineResponse503.md)
 - [InternalTransaction](docs/InternalTransaction.md)
 - [InternalTransactionDetails](docs/InternalTransactionDetails.md)
 - [InternalTransactionOpCall](docs/InternalTransactionOpCall.md)
 - [ListBlocksResponse](docs/ListBlocksResponse.md)
 - [ListCChainAtomicBalancesResponse](docs/ListCChainAtomicBalancesResponse.md)
 - [ListCChainAtomicTransactionsResponse](docs/ListCChainAtomicTransactionsResponse.md)
 - [ListChainsResponse](docs/ListChainsResponse.md)
 - [ListCollectibleBalancesResponse](docs/ListCollectibleBalancesResponse.md)
 - [ListErc1155BalancesResponse](docs/ListErc1155BalancesResponse.md)
 - [ListErc1155TransactionsResponse](docs/ListErc1155TransactionsResponse.md)
 - [ListErc20BalancesResponse](docs/ListErc20BalancesResponse.md)
 - [ListErc20TransactionsResponse](docs/ListErc20TransactionsResponse.md)
 - [ListErc721BalancesResponse](docs/ListErc721BalancesResponse.md)
 - [ListErc721TransactionsResponse](docs/ListErc721TransactionsResponse.md)
 - [ListInternalTransactionsResponse](docs/ListInternalTransactionsResponse.md)
 - [ListNativeTransactionsResponse](docs/ListNativeTransactionsResponse.md)
 - [ListPChainBalancesResponse](docs/ListPChainBalancesResponse.md)
 - [ListPChainTransactionsResponse](docs/ListPChainTransactionsResponse.md)
 - [ListPChainUtxosResponse](docs/ListPChainUtxosResponse.md)
 - [ListTransactionDetailsResponse](docs/ListTransactionDetailsResponse.md)
 - [ListTransfersResponse](docs/ListTransfersResponse.md)
 - [ListUtxosResponse](docs/ListUtxosResponse.md)
 - [ListXChainBalancesResponse](docs/ListXChainBalancesResponse.md)
 - [ListXChainTransactionsResponse](docs/ListXChainTransactionsResponse.md)
 - [ListXChainVerticesResponse](docs/ListXChainVerticesResponse.md)
 - [Method](docs/Method.md)
 - [Money](docs/Money.md)
 - [NativeTokenBalance](docs/NativeTokenBalance.md)
 - [NativeTransaction](docs/NativeTransaction.md)
 - [Network](docs/Network.md)
 - [NetworkToken](docs/NetworkToken.md)
 - [NetworkTokenDetails](docs/NetworkTokenDetails.md)
 - [NftTokenMetadataStatus](docs/NftTokenMetadataStatus.md)
 - [OneOfListCollectibleBalancesResponseCollectibleBalancesItems](docs/OneOfListCollectibleBalancesResponseCollectibleBalancesItems.md)
 - [OneOfOperationStatusResponseMetadata](docs/OneOfOperationStatusResponseMetadata.md)
 - [OperationStatus](docs/OperationStatus.md)
 - [OperationStatusCode](docs/OperationStatusCode.md)
 - [OperationStatusResponse](docs/OperationStatusResponse.md)
 - [OperationTransactionExportMetadata](docs/OperationTransactionExportMetadata.md)
 - [OperationType](docs/OperationType.md)
 - [PChainAsset](docs/PChainAsset.md)
 - [PChainBalance](docs/PChainBalance.md)
 - [PChainConsumedUtxo](docs/PChainConsumedUtxo.md)
 - [PChainEmittedUtxo](docs/PChainEmittedUtxo.md)
 - [PChainId](docs/PChainId.md)
 - [PChainTransaction](docs/PChainTransaction.md)
 - [PChainUtxo](docs/PChainUtxo.md)
 - [PrimaryNetworkOptions](docs/PrimaryNetworkOptions.md)
 - [ProposerDetails](docs/ProposerDetails.md)
 - [RichAddress](docs/RichAddress.md)
 - [SortOrder](docs/SortOrder.md)
 - [TransactionDetails](docs/TransactionDetails.md)
 - [TransactionMethodType](docs/TransactionMethodType.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionVertexDetail](docs/TransactionVertexDetail.md)
 - [UtilityAddresses](docs/UtilityAddresses.md)
 - [Utxo](docs/Utxo.md)
 - [UtxoCredential](docs/UtxoCredential.md)
 - [VmName](docs/VmName.md)
 - [XChainAssetBalance](docs/XChainAssetBalance.md)
 - [XChainAssetDetails](docs/XChainAssetDetails.md)
 - [XChainBalances](docs/XChainBalances.md)
 - [XChainId](docs/XChainId.md)
 - [XChainLinearTransaction](docs/XChainLinearTransaction.md)
 - [XChainNonLinearTransaction](docs/XChainNonLinearTransaction.md)
 - [XChainSharedAssetBalance](docs/XChainSharedAssetBalance.md)
 - [XChainVertex](docs/XChainVertex.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


