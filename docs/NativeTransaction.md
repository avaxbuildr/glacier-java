# NativeTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockNumber** | **String** | The block number on the chain. | 
**blockTimestamp** | [**BigDecimal**](BigDecimal.md) | The block finality timestamp. | 
**blockHash** | **String** | The block hash identifier. | 
**blockIndex** | [**BigDecimal**](BigDecimal.md) | The index at which the transaction occured in the block (0-indexed). | 
**txHash** | **String** | The transaction hash identifier. | 
**txStatus** | **String** | The transaction status, which is either 0 (failed) or 1 (successful). | 
**txType** | [**BigDecimal**](BigDecimal.md) | The transaction type. | 
**gasLimit** | **String** | The gas limit set for the transaction. | 
**gasUsed** | **String** | The amount of gas used. | 
**gasPrice** | **String** | The gas price denominated by the number of decimals of the native token. | 
**nonce** | **String** | The nonce used by the sender of the transaction. | 
**from** | [**RichAddress**](RichAddress.md) |  | 
**to** | [**RichAddress**](RichAddress.md) |  | 
**method** | [**Method**](Method.md) |  |  [optional]
**value** | **String** |  | 
