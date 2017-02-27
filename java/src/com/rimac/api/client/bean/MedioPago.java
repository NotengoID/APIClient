package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MedioPago
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-27T23:32:36.409Z")
public class MedioPago {
  @JsonProperty("idetercero")
  private String idetercero = null;

  @JsonProperty("idetarjeta")
  private String idetarjeta = null;

  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("operador")
  private String operador = null;

  public MedioPago idetercero(String idetercero) {
    this.idetercero = idetercero;
    return this;
  }

   /**
   * Get idetercero
   * @return idetercero
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdetercero() {
    return idetercero;
  }

  public void setIdetercero(String idetercero) {
    this.idetercero = idetercero;
  }

  public MedioPago idetarjeta(String idetarjeta) {
    this.idetarjeta = idetarjeta;
    return this;
  }

   /**
   * Get idetarjeta
   * @return idetarjeta
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdetarjeta() {
    return idetarjeta;
  }

  public void setIdetarjeta(String idetarjeta) {
    this.idetarjeta = idetarjeta;
  }

  public MedioPago numero(String numero) {
    this.numero = numero;
    return this;
  }

   /**
   * Get numero
   * @return numero
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public MedioPago operador(String operador) {
    this.operador = operador;
    return this;
  }

   /**
   * Get operador
   * @return operador
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOperador() {
    return operador;
  }

  public void setOperador(String operador) {
    this.operador = operador;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MedioPago medioPago = (MedioPago) o;
    return Objects.equals(this.idetercero, medioPago.idetercero) &&
        Objects.equals(this.idetarjeta, medioPago.idetarjeta) &&
        Objects.equals(this.numero, medioPago.numero) &&
        Objects.equals(this.operador, medioPago.operador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idetercero, idetarjeta, numero, operador);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MedioPago {\n");
    
    sb.append("    idetercero: ").append(toIndentedString(idetercero)).append("\n");
    sb.append("    idetarjeta: ").append(toIndentedString(idetarjeta)).append("\n");
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    operador: ").append(toIndentedString(operador)).append("\n");
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

