package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.rimac.api.client.bean.VehiculoVEHICULOSUNARP;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Vehiculo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-10T15:08:30.373Z")
public class Vehiculo {
  @JsonProperty("res")
  private String res = null;

  @JsonProperty("VEHICULO_SUNARP")
  private VehiculoVEHICULOSUNARP VEHICULO_SUNARP = null;

  public Vehiculo res(String res) {
    this.res = res;
    return this;
  }

   /**
   * Resultado de la búsqueda.
   * @return res
  **/
  @ApiModelProperty(example = "null", value = "Resultado de la búsqueda.")
  public String getRes() {
    return res;
  }

  public void setRes(String res) {
    this.res = res;
  }

  public Vehiculo VEHICULO_SUNARP(VehiculoVEHICULOSUNARP VEHICULO_SUNARP) {
    this.VEHICULO_SUNARP = VEHICULO_SUNARP;
    return this;
  }

   /**
   * Get VEHICULO_SUNARP
   * @return VEHICULO_SUNARP
  **/
  @ApiModelProperty(example = "null", value = "")
  public VehiculoVEHICULOSUNARP getVEHICULOSUNARP() {
    return VEHICULO_SUNARP;
  }

  public void setVEHICULOSUNARP(VehiculoVEHICULOSUNARP VEHICULO_SUNARP) {
    this.VEHICULO_SUNARP = VEHICULO_SUNARP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehiculo vehiculo = (Vehiculo) o;
    return Objects.equals(this.res, vehiculo.res) &&
        Objects.equals(this.VEHICULO_SUNARP, vehiculo.VEHICULO_SUNARP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(res, VEHICULO_SUNARP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehiculo {\n");
    
    sb.append("    res: ").append(toIndentedString(res)).append("\n");
    sb.append("    VEHICULO_SUNARP: ").append(toIndentedString(VEHICULO_SUNARP)).append("\n");
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

