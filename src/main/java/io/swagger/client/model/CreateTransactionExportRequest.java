/*
 * Glacier API
 * The Glacier API provides web3 application developers with multi-chain        data related to Avalanche's primary network, Avalanche subnets, and        Ethereum. With Glacier, you can easily build products that leverage        real-time and historical transaction and transfer history, native and        token balances, and various types of token metadata. The API is in Beta        and may be subject to change.        </br></br>        If you have feedback or feature requests for the API, please submit them        <a href=\"https://portal.productboard.com/dndv9ahlkdfye4opdm8ksafi/tabs/4-glacier-api\">here</a>. Bug reports can be submitted        <a href=\"https://docs.google.com/forms/d/e/1FAIpQLSeJQrcp7QoNiqozMDKrVJGX5wpU827d3cVTgF8qa7t_J1Pb-g/viewform\">here</a>, and any potential security        issues can be reported <a href=\"https://hackenproof.com/avalanche\">here</a>.
 *
 * OpenAPI spec version: Beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.EvmNetworkOptions;
import io.swagger.client.model.PrimaryNetworkOptions;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CreateTransactionExportRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class CreateTransactionExportRequest {
  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("primaryNetwork")
  private PrimaryNetworkOptions primaryNetwork = null;

  @SerializedName("evmNetwork")
  private EvmNetworkOptions evmNetwork = null;

  public CreateTransactionExportRequest startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public CreateTransactionExportRequest endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public CreateTransactionExportRequest primaryNetwork(PrimaryNetworkOptions primaryNetwork) {
    this.primaryNetwork = primaryNetwork;
    return this;
  }

   /**
   * Get primaryNetwork
   * @return primaryNetwork
  **/
  @Schema(description = "")
  public PrimaryNetworkOptions getPrimaryNetwork() {
    return primaryNetwork;
  }

  public void setPrimaryNetwork(PrimaryNetworkOptions primaryNetwork) {
    this.primaryNetwork = primaryNetwork;
  }

  public CreateTransactionExportRequest evmNetwork(EvmNetworkOptions evmNetwork) {
    this.evmNetwork = evmNetwork;
    return this;
  }

   /**
   * Get evmNetwork
   * @return evmNetwork
  **/
  @Schema(description = "")
  public EvmNetworkOptions getEvmNetwork() {
    return evmNetwork;
  }

  public void setEvmNetwork(EvmNetworkOptions evmNetwork) {
    this.evmNetwork = evmNetwork;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransactionExportRequest createTransactionExportRequest = (CreateTransactionExportRequest) o;
    return Objects.equals(this.startDate, createTransactionExportRequest.startDate) &&
        Objects.equals(this.endDate, createTransactionExportRequest.endDate) &&
        Objects.equals(this.primaryNetwork, createTransactionExportRequest.primaryNetwork) &&
        Objects.equals(this.evmNetwork, createTransactionExportRequest.evmNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, primaryNetwork, evmNetwork);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionExportRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    primaryNetwork: ").append(toIndentedString(primaryNetwork)).append("\n");
    sb.append("    evmNetwork: ").append(toIndentedString(evmNetwork)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
