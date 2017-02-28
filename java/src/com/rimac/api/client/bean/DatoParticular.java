package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DatoParticular
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T15:10:13.520Z")
public class DatoParticular {
  @JsonProperty("idevalor")
  private String idevalor = null;

  @JsonProperty("valor")
  private String valor = null;

  public DatoParticular idevalor(String idevalor) {
    this.idevalor = idevalor;
    return this;
  }

   /**
   * Get idevalor
   * @return idevalor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdevalor() {
    return idevalor;
  }

  public void setIdevalor(String idevalor) {
    this.idevalor = idevalor;
  }

  public DatoParticular valor(String valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatoParticular datoParticular = (DatoParticular) o;
    return Objects.equals(this.idevalor, datoParticular.idevalor) &&
        Objects.equals(this.valor, datoParticular.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idevalor, valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatoParticular {\n");
    
    sb.append("    idevalor: ").append(toIndentedString(idevalor)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

