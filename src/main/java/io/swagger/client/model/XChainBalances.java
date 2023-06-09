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
import io.swagger.client.model.XChainAssetBalance;
import io.swagger.client.model.XChainSharedAssetBalance;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * XChainBalances
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-05-05T19:37:42.090584799-03:00[America/Sao_Paulo]")
public class XChainBalances {
  @SerializedName("locked")
  private List<XChainAssetBalance> locked = new ArrayList<XChainAssetBalance>();

  @SerializedName("unlocked")
  private List<XChainAssetBalance> unlocked = new ArrayList<XChainAssetBalance>();

  @SerializedName("atomicMemoryUnlocked")
  private List<XChainSharedAssetBalance> atomicMemoryUnlocked = new ArrayList<XChainSharedAssetBalance>();

  @SerializedName("atomicMemoryLocked")
  private List<XChainSharedAssetBalance> atomicMemoryLocked = new ArrayList<XChainSharedAssetBalance>();

  public XChainBalances locked(List<XChainAssetBalance> locked) {
    this.locked = locked;
    return this;
  }

  public XChainBalances addLockedItem(XChainAssetBalance lockedItem) {
    this.locked.add(lockedItem);
    return this;
  }

   /**
   * A list of objects containing X-chain Asset balance infromation.
   * @return locked
  **/
  @Schema(required = true, description = "A list of objects containing X-chain Asset balance infromation.")
  public List<XChainAssetBalance> getLocked() {
    return locked;
  }

  public void setLocked(List<XChainAssetBalance> locked) {
    this.locked = locked;
  }

  public XChainBalances unlocked(List<XChainAssetBalance> unlocked) {
    this.unlocked = unlocked;
    return this;
  }

  public XChainBalances addUnlockedItem(XChainAssetBalance unlockedItem) {
    this.unlocked.add(unlockedItem);
    return this;
  }

   /**
   * A list of objects containing X-chain Asset balance infromation.
   * @return unlocked
  **/
  @Schema(required = true, description = "A list of objects containing X-chain Asset balance infromation.")
  public List<XChainAssetBalance> getUnlocked() {
    return unlocked;
  }

  public void setUnlocked(List<XChainAssetBalance> unlocked) {
    this.unlocked = unlocked;
  }

  public XChainBalances atomicMemoryUnlocked(List<XChainSharedAssetBalance> atomicMemoryUnlocked) {
    this.atomicMemoryUnlocked = atomicMemoryUnlocked;
    return this;
  }

  public XChainBalances addAtomicMemoryUnlockedItem(XChainSharedAssetBalance atomicMemoryUnlockedItem) {
    this.atomicMemoryUnlocked.add(atomicMemoryUnlockedItem);
    return this;
  }

   /**
   * Get atomicMemoryUnlocked
   * @return atomicMemoryUnlocked
  **/
  @Schema(required = true, description = "")
  public List<XChainSharedAssetBalance> getAtomicMemoryUnlocked() {
    return atomicMemoryUnlocked;
  }

  public void setAtomicMemoryUnlocked(List<XChainSharedAssetBalance> atomicMemoryUnlocked) {
    this.atomicMemoryUnlocked = atomicMemoryUnlocked;
  }

  public XChainBalances atomicMemoryLocked(List<XChainSharedAssetBalance> atomicMemoryLocked) {
    this.atomicMemoryLocked = atomicMemoryLocked;
    return this;
  }

  public XChainBalances addAtomicMemoryLockedItem(XChainSharedAssetBalance atomicMemoryLockedItem) {
    this.atomicMemoryLocked.add(atomicMemoryLockedItem);
    return this;
  }

   /**
   * Get atomicMemoryLocked
   * @return atomicMemoryLocked
  **/
  @Schema(required = true, description = "")
  public List<XChainSharedAssetBalance> getAtomicMemoryLocked() {
    return atomicMemoryLocked;
  }

  public void setAtomicMemoryLocked(List<XChainSharedAssetBalance> atomicMemoryLocked) {
    this.atomicMemoryLocked = atomicMemoryLocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XChainBalances xchainBalances = (XChainBalances) o;
    return Objects.equals(this.locked, xchainBalances.locked) &&
        Objects.equals(this.unlocked, xchainBalances.unlocked) &&
        Objects.equals(this.atomicMemoryUnlocked, xchainBalances.atomicMemoryUnlocked) &&
        Objects.equals(this.atomicMemoryLocked, xchainBalances.atomicMemoryLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locked, unlocked, atomicMemoryUnlocked, atomicMemoryLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XChainBalances {\n");
    
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    unlocked: ").append(toIndentedString(unlocked)).append("\n");
    sb.append("    atomicMemoryUnlocked: ").append(toIndentedString(atomicMemoryUnlocked)).append("\n");
    sb.append("    atomicMemoryLocked: ").append(toIndentedString(atomicMemoryLocked)).append("\n");
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
