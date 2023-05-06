# Utxo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**utxoId** | **String** | UTXO ID for this output. | 
**asset** | [**Asset**](Asset.md) |  | 
**utxoType** | **String** | Type of output. | 
**createdOnChainId** | **String** | Blockchain ID on which this output is created on. | 
**consumedOnChainId** | **String** | Blockchain ID on which this output is consumed on. | 
**creationTxHash** | **String** | Transaction ID that created this output. | 
**consumingTxHash** | **String** | Transaction ID that consumed this output. |  [optional]
**consumingTxTimestamp** | [**BigDecimal**](BigDecimal.md) | Timestamp in seconds this output is consumed. |  [optional]
**outputIndex** | **String** | Postion of this output in a list of lexiographically sorted outputs of a transaction. | 
**timestamp** | [**BigDecimal**](BigDecimal.md) | Timestamp in seconds this outptut is created on. | 
**locktime** | [**BigDecimal**](BigDecimal.md) | Locktime in seconds after which this output can be consumed. | 
**threshold** | [**BigDecimal**](BigDecimal.md) | Minimum number of signatures required to consume this output. | 
**addresses** | **List&lt;String&gt;** | Addresses that are eligible to sign the consumption of this output. | 
**credentials** | [**List&lt;UtxoCredential&gt;**](UtxoCredential.md) | Credentials that signed the transaction to consume this utxo | 
