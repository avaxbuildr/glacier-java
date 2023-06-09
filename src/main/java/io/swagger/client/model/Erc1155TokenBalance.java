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
import io.swagger.client.model.Erc1155TokenMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Erc1155TokenBalance
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class Erc1155TokenBalance implements OneOfListCollectibleBalancesResponseCollectibleBalancesItems {
  @SerializedName("address")
  private String address = null;

  /**
   * Gets or Sets ercType
   */
  @JsonAdapter(ErcTypeEnum.Adapter.class)
  public enum ErcTypeEnum {
    ERC_1155("ERC-1155");

    private String value;

    ErcTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ErcTypeEnum fromValue(String input) {
      for (ErcTypeEnum b : ErcTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ErcTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErcTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ErcTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ErcTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ercType")
  private ErcTypeEnum ercType = null;

  @SerializedName("tokenId")
  private String tokenId = null;

  @SerializedName("tokenUri")
  private String tokenUri = null;

  @SerializedName("metadata")
  private Erc1155TokenMetadata metadata = null;

  @SerializedName("chainId")
  private String chainId = null;

  @SerializedName("balance")
  private String balance = null;

  public Erc1155TokenBalance address(String address) {
    this.address = address;
    return this;
  }

   /**
   * A wallet or contract address in mixed-case checksum encoding.
   * @return address
  **/
  @Schema(example = "0x71C7656EC7ab88b098defB751B7401B5f6d8976F", required = true, description = "A wallet or contract address in mixed-case checksum encoding.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Erc1155TokenBalance ercType(ErcTypeEnum ercType) {
    this.ercType = ercType;
    return this;
  }

   /**
   * Get ercType
   * @return ercType
  **/
  @Schema(required = true, description = "")
  public ErcTypeEnum getErcType() {
    return ercType;
  }

  public void setErcType(ErcTypeEnum ercType) {
    this.ercType = ercType;
  }

  public Erc1155TokenBalance tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @Schema(required = true, description = "")
  public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public Erc1155TokenBalance tokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
    return this;
  }

   /**
   * Get tokenUri
   * @return tokenUri
  **/
  @Schema(required = true, description = "")
  public String getTokenUri() {
    return tokenUri;
  }

  public void setTokenUri(String tokenUri) {
    this.tokenUri = tokenUri;
  }

  public Erc1155TokenBalance metadata(Erc1155TokenMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(required = true, description = "")
  public Erc1155TokenMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Erc1155TokenMetadata metadata) {
    this.metadata = metadata;
  }

  public Erc1155TokenBalance chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The evm chain id.
   * @return chainId
  **/
  @Schema(example = "43114", required = true, description = "The evm chain id.")
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }

  public Erc1155TokenBalance balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The address balance for the token, in units specified by the        &#x60;decimals&#x60; value for the contract.
   * @return balance
  **/
  @Schema(example = "2000000000000000000", required = true, description = "The address balance for the token, in units specified by the        `decimals` value for the contract.")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc1155TokenBalance erc1155TokenBalance = (Erc1155TokenBalance) o;
    return Objects.equals(this.address, erc1155TokenBalance.address) &&
        Objects.equals(this.ercType, erc1155TokenBalance.ercType) &&
        Objects.equals(this.tokenId, erc1155TokenBalance.tokenId) &&
        Objects.equals(this.tokenUri, erc1155TokenBalance.tokenUri) &&
        Objects.equals(this.metadata, erc1155TokenBalance.metadata) &&
        Objects.equals(this.chainId, erc1155TokenBalance.chainId) &&
        Objects.equals(this.balance, erc1155TokenBalance.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, ercType, tokenId, tokenUri, metadata, chainId, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc1155TokenBalance {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ercType: ").append(toIndentedString(ercType)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokenUri: ").append(toIndentedString(tokenUri)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
