package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DatoParticular;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectoAsegurado
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T23:03:41.247Z")
public class ObjectoAsegurado {
  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("ideoa")
  private String ideoa = null;

  @JsonProperty("detalle")
  private List<DatoParticular> detalle = new ArrayList<DatoParticular>();

  public ObjectoAsegurado numero(String numero) {
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

  public ObjectoAsegurado tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public ObjectoAsegurado ideoa(String ideoa) {
    this.ideoa = ideoa;
    return this;
  }

   /**
   * Get ideoa
   * @return ideoa
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdeoa() {
    return ideoa;
  }

  public void setIdeoa(String ideoa) {
    this.ideoa = ideoa;
  }

  public ObjectoAsegurado detalle(List<DatoParticular> detalle) {
    this.detalle = detalle;
    return this;
  }

  public ObjectoAsegurado addDetalleItem(DatoParticular detalleItem) {
    this.detalle.add(detalleItem);
    return this;
  }

   /**
   * Get detalle
   * @return detalle
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DatoParticular> getDetalle() {
    return detalle;
  }

  public void setDetalle(List<DatoParticular> detalle) {
    this.detalle = detalle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectoAsegurado objectoAsegurado = (ObjectoAsegurado) o;
    return Objects.equals(this.numero, objectoAsegurado.numero) &&
        Objects.equals(this.tipo, objectoAsegurado.tipo) &&
        Objects.equals(this.ideoa, objectoAsegurado.ideoa) &&
        Objects.equals(this.detalle, objectoAsegurado.detalle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, tipo, ideoa, detalle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectoAsegurado {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    ideoa: ").append(toIndentedString(ideoa)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
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

