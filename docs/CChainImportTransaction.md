# CChainImportTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txHash** | **String** | Unique ID for this transaction. | 
**blockHeight** | [**BigDecimal**](BigDecimal.md) | Height of the block this transaction belongs to. | 
**blockHash** | **String** | Hash of the block this transaction belongs to. | 
**timestamp** | [**BigDecimal**](BigDecimal.md) | Latest timestamp in seconds this transaction was accepted. | 
**memo** | **String** | Hex encoded memo bytes for this transaction. | 
**amountUnlocked** | [**List&lt;Asset&gt;**](Asset.md) | Assets unlocked by inputs of this transaction. | 
**amountCreated** | [**List&lt;Asset&gt;**](Asset.md) | Assets created by outputs of this transaction. | 
**sourceChain** | **String** | Source chain for an atomic transaction. | 
**destinationChain** | **String** | Destination chain for an atomic transaction. | 
**txType** | [**TxTypeEnum**](#TxTypeEnum) | Type of transaction. | 
**evmOutputs** | [**List&lt;EVMOutput&gt;**](EVMOutput.md) |  | 
**consumedUtxos** | [**List&lt;Utxo&gt;**](Utxo.md) |  | 

<a name="TxTypeEnum"></a>
## Enum: TxTypeEnum
Name | Value
---- | -----
IMPORTTX | &quot;ImportTx&quot;
