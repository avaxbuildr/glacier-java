# XChainLinearTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txHash** | **String** | Unique ID for this transaction. | 
**chainFormat** | [**ChainFormatEnum**](#ChainFormatEnum) | Represents container format this transaction is included in. | 
**timestamp** | [**BigDecimal**](BigDecimal.md) | Latest timestamp in seconds this transaction was accepted out of the same transaction accepted in other vertices. | 
**txType** | **String** | Type of transaction. | 
**memo** | **String** | Hex encoded memo bytes for this transaction. | 
**consumedUtxos** | [**List&lt;Utxo&gt;**](Utxo.md) |  | 
**emittedUtxos** | [**List&lt;Utxo&gt;**](Utxo.md) |  | 
**amountUnlocked** | [**List&lt;Asset&gt;**](Asset.md) | Assets unlocked by inputs of this transaction. | 
**amountCreated** | [**List&lt;Asset&gt;**](Asset.md) | Assets created by outputs of this transaction. | 
**sourceChain** | **String** | Source chain for an atomic transaction. |  [optional]
**destinationChain** | **String** | Destination chain for an atomic transaction. |  [optional]
**assetCreated** | **AllOfXChainLinearTransactionAssetCreated** | Asset details of the asset created in CreateAssetTx |  [optional]
**blockHeight** | [**BigDecimal**](BigDecimal.md) | Height of the block this transaction belongs to. | 
**blockHash** | **String** | Hash of the block this transaction belongs to. | 

<a name="ChainFormatEnum"></a>
## Enum: ChainFormatEnum
Name | Value
---- | -----
LINEAR | &quot;linear&quot;
NON_LINEAR | &quot;non-linear&quot;
