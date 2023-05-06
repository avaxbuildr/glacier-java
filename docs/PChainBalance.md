# PChainBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**unlockedUnstaked** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is consumable by any transaction. |  [optional]
**unlockedStaked** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of staked Avax that is consumable by any transaction when the staking period ends. |  [optional]
**lockedPlatform** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is locked at the platform level and not consumable by any transaction at the current time. |  [optional]
**lockedStakeable** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is locked at the platform level and only consumeable for staking transactions. |  [optional]
**lockedStaked** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of staked Avax that will be locked when the staking period ends. |  [optional]
**lockedUnstaked** | [**List&lt;PChainAsset&gt;**](PChainAsset.md) | A list of objects containing P-chain Asset ID and the amount of that Asset ID. Denotes the amount of unstaked Avax that is locked. Sum of lockedPlatform and lockedStakeable. TO BE DEPRECATED. |  [optional]
