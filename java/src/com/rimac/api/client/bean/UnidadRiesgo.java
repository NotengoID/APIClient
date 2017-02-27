package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rimac.api.client.bean.ObjectoAsegurado;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UnidadRiesgo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-27T23:32:36.409Z")
public class UnidadRiesgo {
  @JsonProperty("numero")
  private String numero = null;

  @JsonProperty("ideplan")
  private String ideplan = null;

  @JsonProperty("oa")
  private List<ObjectoAsegurado> oa = new ArrayList<ObjectoAsegurado>();

  public UnidadRiesgo numero(String numero) {
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

  public UnidadRiesgo ideplan(String ideplan) {
    this.ideplan = ideplan;
    return this;
  }

   /**
   * Get ideplan
   * @return ideplan
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdeplan() {
    return ideplan;
  }

  public void setIdeplan(String ideplan) {
    this.ideplan = ideplan;
  }

  public UnidadRiesgo oa(List<ObjectoAsegurado> oa) {
    this.oa = oa;
    return this;
  }

  public UnidadRiesgo addOaItem(ObjectoAsegurado oaItem) {
    this.oa.add(oaItem);
    return this;
  }

   /**
   * Get oa
   * @return oa
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ObjectoAsegurado> getOa() {
    return oa;
  }

  public void setOa(List<ObjectoAsegurado> oa) {
    this.oa = oa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnidadRiesgo unidadRiesgo = (UnidadRiesgo) o;
    return Objects.equals(this.numero, unidadRiesgo.numero) &&
        Objects.equals(this.ideplan, unidadRiesgo.ideplan) &&
        Objects.equals(this.oa, unidadRiesgo.oa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numero, ideplan, oa);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnidadRiesgo {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    ideplan: ").append(toIndentedString(ideplan)).append("\n");
    sb.append("    oa: ").append(toIndentedString(oa)).append("\n");
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

