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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * InlineResponse503
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class InlineResponse503 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("info")
  private Map<String, Map> info = null;

  @SerializedName("error")
  private Map<String, Map> error = null;

  @SerializedName("details")
  private Map<String, Map> details = null;

  public InlineResponse503 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(example = "error", description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse503 info(Map<String, Map> info) {
    this.info = info;
    return this;
  }

  public InlineResponse503 putInfoItem(String key, Map infoItem) {
    if (this.info == null) {
      this.info = new HashMap<String, Map>();
    }
    this.info.put(key, infoItem);
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @Schema(example = "{\"database\":{\"status\":\"up\"}}", description = "")
  public Map<String, Map> getInfo() {
    return info;
  }

  public void setInfo(Map<String, Map> info) {
    this.info = info;
  }

  public InlineResponse503 error(Map<String, Map> error) {
    this.error = error;
    return this;
  }

  public InlineResponse503 putErrorItem(String key, Map errorItem) {
    if (this.error == null) {
      this.error = new HashMap<String, Map>();
    }
    this.error.put(key, errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(example = "{\"redis\":{\"status\":\"down\",\"message\":\"Could not connect\"}}", description = "")
  public Map<String, Map> getError() {
    return error;
  }

  public void setError(Map<String, Map> error) {
    this.error = error;
  }

  public InlineResponse503 details(Map<String, Map> details) {
    this.details = details;
    return this;
  }

  public InlineResponse503 putDetailsItem(String key, Map detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<String, Map>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @Schema(example = "{\"database\":{\"status\":\"up\"},\"redis\":{\"status\":\"down\",\"message\":\"Could not connect\"}}", description = "")
  public Map<String, Map> getDetails() {
    return details;
  }

  public void setDetails(Map<String, Map> details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse503 inlineResponse503 = (InlineResponse503) o;
    return Objects.equals(this.status, inlineResponse503.status) &&
        Objects.equals(this.info, inlineResponse503.info) &&
        Objects.equals(this.error, inlineResponse503.error) &&
        Objects.equals(this.details, inlineResponse503.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, info, error, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse503 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
