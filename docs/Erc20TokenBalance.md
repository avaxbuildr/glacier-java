# Erc20TokenBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | A wallet or contract address in mixed-case checksum encoding. | 
**name** | **String** | The contract name. | 
**symbol** | **String** | The contract symbol. | 
**decimals** | [**BigDecimal**](BigDecimal.md) | The number of decimals the token uses. For example &#x60;6&#x60;,        means to divide the token amount by &#x60;1000000&#x60; to get its user        representation. | 
**logoUri** | **String** | The logo uri for the address. |  [optional]
**ercType** | [**ErcTypeEnum**](#ErcTypeEnum) |  | 
**price** | **AllOfErc20TokenBalancePrice** | The token price, if available. |  [optional]
**chainId** | **String** | The evm chain id. | 
**balance** | **String** | The address balance for the token, in units specified by the        &#x60;decimals&#x60; value for the contract. | 
**balanceValue** | **AllOfErc20TokenBalanceBalanceValue** | The monetary value of the balance, if a price is available for the token. |  [optional]

<a name="ErcTypeEnum"></a>
## Enum: ErcTypeEnum
Name | Value
---- | -----
ERC_20 | &quot;ERC-20&quot;
