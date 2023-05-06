# OperationTransactionExportMetadata

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**OperationStatusCode**](OperationStatusCode.md) |  | 
**downloadUrl** | **String** | File download URL. Provided only for COMPLETED operations. |  [optional]
**nextDate** | [**OffsetDateTime**](OffsetDateTime.md) | The next date to use as the startDate in follow up requests        if a request results in a transaction history exceeding the max size and        has been reported as COMPLETED_WITH_WARNING with the warning        WarnTruncatedExport. |  [optional]
