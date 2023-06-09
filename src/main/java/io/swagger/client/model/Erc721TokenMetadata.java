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
import io.swagger.client.model.NftTokenMetadataStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Erc721TokenMetadata
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class Erc721TokenMetadata {
  @SerializedName("indexStatus")
  private NftTokenMetadataStatus indexStatus = null;

  @SerializedName("metadataLastUpdatedTimestamp")
  private BigDecimal metadataLastUpdatedTimestamp = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("imageUri")
  private String imageUri = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("animationUri")
  private String animationUri = null;

  @SerializedName("externalUrl")
  private String externalUrl = null;

  @SerializedName("background")
  private String background = null;

  @SerializedName("attributes")
  private String attributes = null;

  public Erc721TokenMetadata indexStatus(NftTokenMetadataStatus indexStatus) {
    this.indexStatus = indexStatus;
    return this;
  }

   /**
   * Get indexStatus
   * @return indexStatus
  **/
  @Schema(required = true, description = "")
  public NftTokenMetadataStatus getIndexStatus() {
    return indexStatus;
  }

  public void setIndexStatus(NftTokenMetadataStatus indexStatus) {
    this.indexStatus = indexStatus;
  }

  public Erc721TokenMetadata metadataLastUpdatedTimestamp(BigDecimal metadataLastUpdatedTimestamp) {
    this.metadataLastUpdatedTimestamp = metadataLastUpdatedTimestamp;
    return this;
  }

   /**
   * Get metadataLastUpdatedTimestamp
   * @return metadataLastUpdatedTimestamp
  **/
  @Schema(description = "")
  public BigDecimal getMetadataLastUpdatedTimestamp() {
    return metadataLastUpdatedTimestamp;
  }

  public void setMetadataLastUpdatedTimestamp(BigDecimal metadataLastUpdatedTimestamp) {
    this.metadataLastUpdatedTimestamp = metadataLastUpdatedTimestamp;
  }

  public Erc721TokenMetadata name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Erc721TokenMetadata symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @Schema(description = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Erc721TokenMetadata imageUri(String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

   /**
   * Get imageUri
   * @return imageUri
  **/
  @Schema(description = "")
  public String getImageUri() {
    return imageUri;
  }

  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }

  public Erc721TokenMetadata description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Erc721TokenMetadata animationUri(String animationUri) {
    this.animationUri = animationUri;
    return this;
  }

   /**
   * Get animationUri
   * @return animationUri
  **/
  @Schema(description = "")
  public String getAnimationUri() {
    return animationUri;
  }

  public void setAnimationUri(String animationUri) {
    this.animationUri = animationUri;
  }

  public Erc721TokenMetadata externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Get externalUrl
   * @return externalUrl
  **/
  @Schema(description = "")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public Erc721TokenMetadata background(String background) {
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  @Schema(description = "")
  public String getBackground() {
    return background;
  }

  public void setBackground(String background) {
    this.background = background;
  }

  public Erc721TokenMetadata attributes(String attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public String getAttributes() {
    return attributes;
  }

  public void setAttributes(String attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Erc721TokenMetadata erc721TokenMetadata = (Erc721TokenMetadata) o;
    return Objects.equals(this.indexStatus, erc721TokenMetadata.indexStatus) &&
        Objects.equals(this.metadataLastUpdatedTimestamp, erc721TokenMetadata.metadataLastUpdatedTimestamp) &&
        Objects.equals(this.name, erc721TokenMetadata.name) &&
        Objects.equals(this.symbol, erc721TokenMetadata.symbol) &&
        Objects.equals(this.imageUri, erc721TokenMetadata.imageUri) &&
        Objects.equals(this.description, erc721TokenMetadata.description) &&
        Objects.equals(this.animationUri, erc721TokenMetadata.animationUri) &&
        Objects.equals(this.externalUrl, erc721TokenMetadata.externalUrl) &&
        Objects.equals(this.background, erc721TokenMetadata.background) &&
        Objects.equals(this.attributes, erc721TokenMetadata.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexStatus, metadataLastUpdatedTimestamp, name, symbol, imageUri, description, animationUri, externalUrl, background, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Erc721TokenMetadata {\n");
    
    sb.append("    indexStatus: ").append(toIndentedString(indexStatus)).append("\n");
    sb.append("    metadataLastUpdatedTimestamp: ").append(toIndentedString(metadataLastUpdatedTimestamp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    animationUri: ").append(toIndentedString(animationUri)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
