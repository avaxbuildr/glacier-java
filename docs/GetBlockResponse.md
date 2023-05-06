# GetBlockResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockNumber** | **String** | The block number on the chain. | 
**blockTimestamp** | [**BigDecimal**](BigDecimal.md) | The block finality timestamp. | 
**blockHash** | **String** | The block hash identifier. | 
**txCount** | [**BigDecimal**](BigDecimal.md) | The number of evm transactions in the block. | 
**atomicTxCount** | [**BigDecimal**](BigDecimal.md) | The number of atomic transactions in the block. | 
**baseFee** | **String** | The base gas fee for a transaction to be included in the block. | 
**gasUsed** | **String** | The gas used for transactions in the block. | 
**gasLimit** | **String** | The total gas limit set for transactions in the block. | 
**gasCost** | **String** |  | 
**parentHash** | **String** | The hash of the parent block. | 
**feesSpent** | **String** | The amount of fees spent/burned for transactions in the block. | 
**cumulativeTransactions** | **String** | The cumulative number of transactions for the chain including this block. | 
