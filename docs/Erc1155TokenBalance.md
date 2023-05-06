# Erc1155TokenBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | A wallet or contract address in mixed-case checksum encoding. | 
**ercType** | [**ErcTypeEnum**](#ErcTypeEnum) |  | 
**tokenId** | **String** |  | 
**tokenUri** | **String** |  | 
**metadata** | [**Erc1155TokenMetadata**](Erc1155TokenMetadata.md) |  | 
**chainId** | **String** | The evm chain id. | 
**balance** | **String** | The address balance for the token, in units specified by the        &#x60;decimals&#x60; value for the contract. | 

<a name="ErcTypeEnum"></a>
## Enum: ErcTypeEnum
Name | Value
---- | -----
ERC_1155 | &quot;ERC-1155&quot;
