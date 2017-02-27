package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pago
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-27T19:40:55.876Z")
public class Pago {
  @JsonProperty("monto")
  private String monto = null;

  @JsonProperty("codmoneda")
  private String codmoneda = null;

  @JsonProperty("token")
  private String token = null;

  public Pago monto(String monto) {
    this.monto = monto;
    return this;
  }

   /**
   * Get monto
   * @return monto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMonto() {
    return monto;
  }

  public void setMonto(String monto) {
    this.monto = monto;
  }

  public Pago codmoneda(String codmoneda) {
    this.codmoneda = codmoneda;
    return this;
  }

   /**
   * Get codmoneda
   * @return codmoneda
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCodmoneda() {
    return codmoneda;
  }

  public void setCodmoneda(String codmoneda) {
    this.codmoneda = codmoneda;
  }

  public Pago token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pago pago = (Pago) o;
    return Objects.equals(this.monto, pago.monto) &&
        Objects.equals(this.codmoneda, pago.codmoneda) &&
        Objects.equals(this.token, pago.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monto, codmoneda, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pago {\n");
    
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    codmoneda: ").append(toIndentedString(codmoneda)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

