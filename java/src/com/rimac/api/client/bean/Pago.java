package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pago
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T16:29:27.092Z")
public class Pago {
  @JsonProperty("idefactura")
  private String idefactura = null;

  @JsonProperty("monto")
  private String monto = null;

  @JsonProperty("codmoneda")
  private String codmoneda = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("email")
  private String email = null;

  public Pago idefactura(String idefactura) {
    this.idefactura = idefactura;
    return this;
  }

   /**
   * Get idefactura
   * @return idefactura
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdefactura() {
    return idefactura;
  }

  public void setIdefactura(String idefactura) {
    this.idefactura = idefactura;
  }

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

  public Pago fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Get fecha
   * @return fecha
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public Pago email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
    return Objects.equals(this.idefactura, pago.idefactura) &&
        Objects.equals(this.monto, pago.monto) &&
        Objects.equals(this.codmoneda, pago.codmoneda) &&
        Objects.equals(this.token, pago.token) &&
        Objects.equals(this.fecha, pago.fecha) &&
        Objects.equals(this.email, pago.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idefactura, monto, codmoneda, token, fecha, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pago {\n");
    
    sb.append("    idefactura: ").append(toIndentedString(idefactura)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    codmoneda: ").append(toIndentedString(codmoneda)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

