# PChainTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**txHash** | **String** | A P-Chain transaction hash. | 
**txType** | **String** |  | 
**blockTimestamp** | [**BigDecimal**](BigDecimal.md) | The block finality timestamp. | 
**blockNumber** | **String** |  | 
**blockHash** | **String** |  | 
**consumedUtxos** | [**List&lt;PChainConsumedUtxo&gt;**](PChainConsumedUtxo.md) | A list of objects containing consumed UTXO info pertaining to a given transaction. |  [optional]
**emittedUtxos** | [**List&lt;PChainEmittedUtxo&gt;**](PChainEmittedUtxo.md) | A list of objects containing emitted UTXO info pertaining to a given transaction. |  [optional]
**sourceChain** | **String** | Source chain for an atomic transaction. |  [optional]
**destinationChain** | **String** | Destination chain for an atomic transaction. |  [optional]
**value** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. |  [optional]
**amountBurned** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. |  [optional]
**amountStaked** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Present for AddValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx |  [optional]
**startTimestamp** | [**BigDecimal**](BigDecimal.md) | Present for AddValidatorTx, AddSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx |  [optional]
**endTimestamp** | [**BigDecimal**](BigDecimal.md) | Present for AddValidatorTx, AddSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx |  [optional]
**delegationFeePercent** | **String** | Present for AddValidatorTx, AddPermissionlessValidatorTx |  [optional]
**nodeId** | **String** | Present for AddValidatorTx, AddSubnetValidatorTx, RemoveSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx |  [optional]
**subnetId** | **String** | Present for AddValidatorTx, AddSubnetValidatorTx, RemoveSubnetValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx, CreateChainTx, CreateSubnetTx |  [optional]
**estimatedReward** | **String** | Present for AddValidatorTx, AddPermissionlessValidatorTx, AddDelegatorTx |  [optional]
**rewardTx** | **String** |  |  [optional]
**memo** | **String** |  |  [optional]
**stakingTxHash** | **String** | Present for RewardValidatorTx |  [optional]
