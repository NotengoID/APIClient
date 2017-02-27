package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rimac.api.client.bean.Financimiento;
import com.rimac.api.client.bean.OrdenEntrega;
import com.rimac.api.client.bean.Participante;
import com.rimac.api.client.bean.UnidadRiesgo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Cotizacion
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-27T19:32:15.132Z")
public class Cotizacion {
  @JsonProperty("ideacuerdo")
  private String ideacuerdo = null;

  @JsonProperty("fecinivig")
  private String fecinivig = null;

  @JsonProperty("ideproducto")
  private String ideproducto = null;

  @JsonProperty("financimiento")
  private Financimiento financimiento = null;

  @JsonProperty("ur")
  private List<UnidadRiesgo> ur = new ArrayList<UnidadRiesgo>();

  @JsonProperty("participantes")
  private Participante participantes = null;

  @JsonProperty("ordenentrada")
  private OrdenEntrega ordenentrada = null;

  public Cotizacion ideacuerdo(String ideacuerdo) {
    this.ideacuerdo = ideacuerdo;
    return this;
  }

   /**
   * Get ideacuerdo
   * @return ideacuerdo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdeacuerdo() {
    return ideacuerdo;
  }

  public void setIdeacuerdo(String ideacuerdo) {
    this.ideacuerdo = ideacuerdo;
  }

  public Cotizacion fecinivig(String fecinivig) {
    this.fecinivig = fecinivig;
    return this;
  }

   /**
   * Get fecinivig
   * @return fecinivig
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFecinivig() {
    return fecinivig;
  }

  public void setFecinivig(String fecinivig) {
    this.fecinivig = fecinivig;
  }

  public Cotizacion ideproducto(String ideproducto) {
    this.ideproducto = ideproducto;
    return this;
  }

   /**
   * Get ideproducto
   * @return ideproducto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdeproducto() {
    return ideproducto;
  }

  public void setIdeproducto(String ideproducto) {
    this.ideproducto = ideproducto;
  }

  public Cotizacion financimiento(Financimiento financimiento) {
    this.financimiento = financimiento;
    return this;
  }

   /**
   * Get financimiento
   * @return financimiento
  **/
  @ApiModelProperty(example = "null", value = "")
  public Financimiento getFinancimiento() {
    return financimiento;
  }

  public void setFinancimiento(Financimiento financimiento) {
    this.financimiento = financimiento;
  }

  public Cotizacion ur(List<UnidadRiesgo> ur) {
    this.ur = ur;
    return this;
  }

  public Cotizacion addUrItem(UnidadRiesgo urItem) {
    this.ur.add(urItem);
    return this;
  }

   /**
   * Get ur
   * @return ur
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<UnidadRiesgo> getUr() {
    return ur;
  }

  public void setUr(List<UnidadRiesgo> ur) {
    this.ur = ur;
  }

  public Cotizacion participantes(Participante participantes) {
    this.participantes = participantes;
    return this;
  }

   /**
   * Get participantes
   * @return participantes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Participante getParticipantes() {
    return participantes;
  }

  public void setParticipantes(Participante participantes) {
    this.participantes = participantes;
  }

  public Cotizacion ordenentrada(OrdenEntrega ordenentrada) {
    this.ordenentrada = ordenentrada;
    return this;
  }

   /**
   * Get ordenentrada
   * @return ordenentrada
  **/
  @ApiModelProperty(example = "null", value = "")
  public OrdenEntrega getOrdenentrada() {
    return ordenentrada;
  }

  public void setOrdenentrada(OrdenEntrega ordenentrada) {
    this.ordenentrada = ordenentrada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cotizacion cotizacion = (Cotizacion) o;
    return Objects.equals(this.ideacuerdo, cotizacion.ideacuerdo) &&
        Objects.equals(this.fecinivig, cotizacion.fecinivig) &&
        Objects.equals(this.ideproducto, cotizacion.ideproducto) &&
        Objects.equals(this.financimiento, cotizacion.financimiento) &&
        Objects.equals(this.ur, cotizacion.ur) &&
        Objects.equals(this.participantes, cotizacion.participantes) &&
        Objects.equals(this.ordenentrada, cotizacion.ordenentrada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ideacuerdo, fecinivig, ideproducto, financimiento, ur, participantes, ordenentrada);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cotizacion {\n");
    
    sb.append("    ideacuerdo: ").append(toIndentedString(ideacuerdo)).append("\n");
    sb.append("    fecinivig: ").append(toIndentedString(fecinivig)).append("\n");
    sb.append("    ideproducto: ").append(toIndentedString(ideproducto)).append("\n");
    sb.append("    financimiento: ").append(toIndentedString(financimiento)).append("\n");
    sb.append("    ur: ").append(toIndentedString(ur)).append("\n");
    sb.append("    participantes: ").append(toIndentedString(participantes)).append("\n");
    sb.append("    ordenentrada: ").append(toIndentedString(ordenentrada)).append("\n");
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

