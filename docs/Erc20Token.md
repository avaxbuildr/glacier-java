# Erc20Token

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | A wallet or contract address in mixed-case checksum encoding. | 
**name** | **String** | The contract name. | 
**symbol** | **String** | The contract symbol. | 
**decimals** | [**BigDecimal**](BigDecimal.md) | The number of decimals the token uses. For example &#x60;6&#x60;,        means to divide the token amount by &#x60;1000000&#x60; to get its user        representation. | 
**logoUri** | **String** | The logo uri for the address. |  [optional]
**ercType** | [**ErcTypeEnum**](#ErcTypeEnum) |  | 
**price** | **AllOfErc20TokenPrice** | The token price, if available. |  [optional]

<a name="ErcTypeEnum"></a>
## Enum: ErcTypeEnum
Name | Value
---- | -----
ERC_20 | &quot;ERC-20&quot;
