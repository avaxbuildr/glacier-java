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
import java.math.BigDecimal;
/**
 * TransactionVertexDetail
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class TransactionVertexDetail {
  @SerializedName("hash")
  private String hash = null;

  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  public TransactionVertexDetail hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Vertex ID of the vertex this transaction belongs to.
   * @return hash
  **/
  @Schema(example = "82qPRREHmh8Cfta4PGD6GymY9ZLyvgYugqW6hj9FykpMVRz1S", required = true, description = "Vertex ID of the vertex this transaction belongs to.")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public TransactionVertexDetail height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Vertex height of the vertex this transaction belongs to.
   * @return height
  **/
  @Schema(example = "1961", required = true, description = "Vertex height of the vertex this transaction belongs to.")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public TransactionVertexDetail timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp in seconds this vertex was accepted.
   * @return timestamp
  **/
  @Schema(example = "1600762738", required = true, description = "Timestamp in seconds this vertex was accepted.")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionVertexDetail transactionVertexDetail = (TransactionVertexDetail) o;
    return Objects.equals(this.hash, transactionVertexDetail.hash) &&
        Objects.equals(this.height, transactionVertexDetail.height) &&
        Objects.equals(this.timestamp, transactionVertexDetail.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, height, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionVertexDetail {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
