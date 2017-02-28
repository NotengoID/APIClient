package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Financimiento
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T17:04:39.289Z")
public class Financimiento {
  @JsonProperty("ideplanfin")
  private String ideplanfin = null;

  @JsonProperty("idpvigencia")
  private String idpvigencia = null;

  @JsonProperty("nrocuotas")
  private String nrocuotas = null;

  public Financimiento ideplanfin(String ideplanfin) {
    this.ideplanfin = ideplanfin;
    return this;
  }

   /**
   * Get ideplanfin
   * @return ideplanfin
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdeplanfin() {
    return ideplanfin;
  }

  public void setIdeplanfin(String ideplanfin) {
    this.ideplanfin = ideplanfin;
  }

  public Financimiento idpvigencia(String idpvigencia) {
    this.idpvigencia = idpvigencia;
    return this;
  }

   /**
   * Get idpvigencia
   * @return idpvigencia
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdpvigencia() {
    return idpvigencia;
  }

  public void setIdpvigencia(String idpvigencia) {
    this.idpvigencia = idpvigencia;
  }

  public Financimiento nrocuotas(String nrocuotas) {
    this.nrocuotas = nrocuotas;
    return this;
  }

   /**
   * Get nrocuotas
   * @return nrocuotas
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNrocuotas() {
    return nrocuotas;
  }

  public void setNrocuotas(String nrocuotas) {
    this.nrocuotas = nrocuotas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Financimiento financimiento = (Financimiento) o;
    return Objects.equals(this.ideplanfin, financimiento.ideplanfin) &&
        Objects.equals(this.idpvigencia, financimiento.idpvigencia) &&
        Objects.equals(this.nrocuotas, financimiento.nrocuotas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ideplanfin, idpvigencia, nrocuotas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Financimiento {\n");
    
    sb.append("    ideplanfin: ").append(toIndentedString(ideplanfin)).append("\n");
    sb.append("    idpvigencia: ").append(toIndentedString(idpvigencia)).append("\n");
    sb.append("    nrocuotas: ").append(toIndentedString(nrocuotas)).append("\n");
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

