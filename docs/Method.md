# Method

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**callType** | [**TransactionMethodType**](TransactionMethodType.md) |  | 
**methodHash** | **String** | The contract method hash identifier. The method hash is only set if the &#x60;callType&#x60; is &#x60;CONTRACT_CALL&#x60;. | 
**methodName** | **String** | The contract method name including parameter types. If the &#x60;callType&#x60; is &#x60;NATIVE_TRANSFER&#x60; this is set to &#x27;Native Transfer&#x27;. If the &#x60;callType&#x60; is &#x60;CONTRACT_CREATION&#x60; this is set to &#x27;Contract Created&#x27;. |  [optional]
