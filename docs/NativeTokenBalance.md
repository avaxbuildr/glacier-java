# NativeTokenBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The contract name. | 
**symbol** | **String** | The contract symbol. | 
**decimals** | [**BigDecimal**](BigDecimal.md) | The number of decimals the token uses. For example &#x60;6&#x60;,        means to divide the token amount by &#x60;1000000&#x60; to get its user        representation. | 
**logoUri** | **String** | The logo uri for the address. |  [optional]
**chainId** | **String** | The evm chain id. | 
**price** | **AllOfNativeTokenBalancePrice** | The token price, if available. |  [optional]
**balance** | **String** | The address balance for the token, in units specified by the        &#x60;decimals&#x60; value for the contract. | 
**balanceValue** | **AllOfNativeTokenBalanceBalanceValue** | The monetary value of the balance, if a price is available for the token. |  [optional]
