# PChainEmittedUtxo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addresses** | **List&lt;String&gt;** |  | 
**amount** | **String** |  | 
**assetId** | **String** |  | 
**utxoId** | **String** |  | 
**createdOnChainId** | **String** |  | 
**consumedOnChainId** | **String** |  | 
**staked** | **Boolean** |  | 
**toTx** | **String** | This field is only present if the UTXO has been consumed by another transaction. |  [optional]
**rewardType** | **String** | This field is only present if the UTXO is a transaction reward and denotes whether the reward is for the validator or delegator. |  [optional]
