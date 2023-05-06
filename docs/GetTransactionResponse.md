# GetTransactionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**erc20Transfers** | [**List&lt;Erc20TransferDetails&gt;**](Erc20TransferDetails.md) | The list of ERC-20 transfers. |  [optional]
**erc721Transfers** | [**List&lt;Erc721TransferDetails&gt;**](Erc721TransferDetails.md) | The list of ERC-721 transfers. |  [optional]
**erc1155Transfers** | [**List&lt;Erc1155TransferDetails&gt;**](Erc1155TransferDetails.md) | The list of ERC-1155 transfers. |  [optional]
**internalTransactions** | [**List&lt;InternalTransactionDetails&gt;**](InternalTransactionDetails.md) | The list of internal transactions. Note that this list only        includes CALL and        CALLCODE internal transactions that had a        non-zero value and        CREATE/CREATE2        calls. Use a client provider to recieve a full debug trace of the       transaction. |  [optional]
**networkTokenDetails** | [**NetworkTokenDetails**](NetworkTokenDetails.md) |  | 
**nativeTransaction** | [**FullNativeTransactionDetails**](FullNativeTransactionDetails.md) |  | 
