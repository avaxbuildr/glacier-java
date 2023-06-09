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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PChainEmittedUtxo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class PChainEmittedUtxo {
  @SerializedName("addresses")
  private List<String> addresses = new ArrayList<String>();

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("utxoId")
  private String utxoId = null;

  @SerializedName("createdOnChainId")
  private String createdOnChainId = null;

  @SerializedName("consumedOnChainId")
  private String consumedOnChainId = null;

  @SerializedName("staked")
  private Boolean staked = null;

  @SerializedName("toTx")
  private String toTx = null;

  @SerializedName("rewardType")
  private String rewardType = null;

  public PChainEmittedUtxo addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public PChainEmittedUtxo addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @Schema(required = true, description = "")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public PChainEmittedUtxo amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(required = true, description = "")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PChainEmittedUtxo assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @Schema(required = true, description = "")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public PChainEmittedUtxo utxoId(String utxoId) {
    this.utxoId = utxoId;
    return this;
  }

   /**
   * Get utxoId
   * @return utxoId
  **/
  @Schema(required = true, description = "")
  public String getUtxoId() {
    return utxoId;
  }

  public void setUtxoId(String utxoId) {
    this.utxoId = utxoId;
  }

  public PChainEmittedUtxo createdOnChainId(String createdOnChainId) {
    this.createdOnChainId = createdOnChainId;
    return this;
  }

   /**
   * Get createdOnChainId
   * @return createdOnChainId
  **/
  @Schema(required = true, description = "")
  public String getCreatedOnChainId() {
    return createdOnChainId;
  }

  public void setCreatedOnChainId(String createdOnChainId) {
    this.createdOnChainId = createdOnChainId;
  }

  public PChainEmittedUtxo consumedOnChainId(String consumedOnChainId) {
    this.consumedOnChainId = consumedOnChainId;
    return this;
  }

   /**
   * Get consumedOnChainId
   * @return consumedOnChainId
  **/
  @Schema(required = true, description = "")
  public String getConsumedOnChainId() {
    return consumedOnChainId;
  }

  public void setConsumedOnChainId(String consumedOnChainId) {
    this.consumedOnChainId = consumedOnChainId;
  }

  public PChainEmittedUtxo staked(Boolean staked) {
    this.staked = staked;
    return this;
  }

   /**
   * Get staked
   * @return staked
  **/
  @Schema(required = true, description = "")
  public Boolean isStaked() {
    return staked;
  }

  public void setStaked(Boolean staked) {
    this.staked = staked;
  }

  public PChainEmittedUtxo toTx(String toTx) {
    this.toTx = toTx;
    return this;
  }

   /**
   * This field is only present if the UTXO has been consumed by another transaction.
   * @return toTx
  **/
  @Schema(description = "This field is only present if the UTXO has been consumed by another transaction.")
  public String getToTx() {
    return toTx;
  }

  public void setToTx(String toTx) {
    this.toTx = toTx;
  }

  public PChainEmittedUtxo rewardType(String rewardType) {
    this.rewardType = rewardType;
    return this;
  }

   /**
   * This field is only present if the UTXO is a transaction reward and denotes whether the reward is for the validator or delegator.
   * @return rewardType
  **/
  @Schema(description = "This field is only present if the UTXO is a transaction reward and denotes whether the reward is for the validator or delegator.")
  public String getRewardType() {
    return rewardType;
  }

  public void setRewardType(String rewardType) {
    this.rewardType = rewardType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PChainEmittedUtxo pchainEmittedUtxo = (PChainEmittedUtxo) o;
    return Objects.equals(this.addresses, pchainEmittedUtxo.addresses) &&
        Objects.equals(this.amount, pchainEmittedUtxo.amount) &&
        Objects.equals(this.assetId, pchainEmittedUtxo.assetId) &&
        Objects.equals(this.utxoId, pchainEmittedUtxo.utxoId) &&
        Objects.equals(this.createdOnChainId, pchainEmittedUtxo.createdOnChainId) &&
        Objects.equals(this.consumedOnChainId, pchainEmittedUtxo.consumedOnChainId) &&
        Objects.equals(this.staked, pchainEmittedUtxo.staked) &&
        Objects.equals(this.toTx, pchainEmittedUtxo.toTx) &&
        Objects.equals(this.rewardType, pchainEmittedUtxo.rewardType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, amount, assetId, utxoId, createdOnChainId, consumedOnChainId, staked, toTx, rewardType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PChainEmittedUtxo {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    utxoId: ").append(toIndentedString(utxoId)).append("\n");
    sb.append("    createdOnChainId: ").append(toIndentedString(createdOnChainId)).append("\n");
    sb.append("    consumedOnChainId: ").append(toIndentedString(consumedOnChainId)).append("\n");
    sb.append("    staked: ").append(toIndentedString(staked)).append("\n");
    sb.append("    toTx: ").append(toIndentedString(toTx)).append("\n");
    sb.append("    rewardType: ").append(toIndentedString(rewardType)).append("\n");
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
