package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VehiculoVEHICULOSUNARP
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-27T19:32:15.132Z")
public class VehiculoVEHICULOSUNARP {
  @JsonProperty("tipoAltoRiesgo")
  private String tipoAltoRiesgo = null;

  @JsonProperty("descTipoRimac")
  private String descTipoRimac = null;

  @JsonProperty("codGrupoRimac")
  private String codGrupoRimac = null;

  @JsonProperty("valorComercial")
  private Integer valorComercial = null;

  @JsonProperty("clase")
  private String clase = null;

  @JsonProperty("marca")
  private String marca = null;

  @JsonProperty("indPractimovil")
  private String indPractimovil = null;

  @JsonProperty("descModeloRimac")
  private String descModeloRimac = null;

  @JsonProperty("placaVigente")
  private String placaVigente = null;

  @JsonProperty("otraObservacion")
  private String otraObservacion = null;

  @JsonProperty("anioFabricacion")
  private String anioFabricacion = null;

  @JsonProperty("codMarcaRimac")
  private String codMarcaRimac = null;

  @JsonProperty("nroSerie")
  private String nroSerie = null;

  @JsonProperty("descClaseRimac")
  private String descClaseRimac = null;

  @JsonProperty("nroMotor")
  private String nroMotor = null;

  @JsonProperty("codClaseRimac")
  private String codClaseRimac = null;

  @JsonProperty("descGrupoRimac")
  private String descGrupoRimac = null;

  @JsonProperty("descMarcaRimac")
  private String descMarcaRimac = null;

  @JsonProperty("indClasico")
  private String indClasico = null;

  @JsonProperty("modelo")
  private String modelo = null;

  @JsonProperty("indChinoHindu")
  private String indChinoHindu = null;

  @JsonProperty("gpsRequerido")
  private Boolean gpsRequerido = null;

  @JsonProperty("valorNuevo")
  private Integer valorNuevo = null;

  @JsonProperty("codModeloRimac")
  private String codModeloRimac = null;

  @JsonProperty("indPremier")
  private String indPremier = null;

  @JsonProperty("ind4X4")
  private String ind4X4 = null;

  @JsonProperty("codTipoRimac")
  private String codTipoRimac = null;

  public VehiculoVEHICULOSUNARP tipoAltoRiesgo(String tipoAltoRiesgo) {
    this.tipoAltoRiesgo = tipoAltoRiesgo;
    return this;
  }

   /**
   * Get tipoAltoRiesgo
   * @return tipoAltoRiesgo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTipoAltoRiesgo() {
    return tipoAltoRiesgo;
  }

  public void setTipoAltoRiesgo(String tipoAltoRiesgo) {
    this.tipoAltoRiesgo = tipoAltoRiesgo;
  }

  public VehiculoVEHICULOSUNARP descTipoRimac(String descTipoRimac) {
    this.descTipoRimac = descTipoRimac;
    return this;
  }

   /**
   * Get descTipoRimac
   * @return descTipoRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescTipoRimac() {
    return descTipoRimac;
  }

  public void setDescTipoRimac(String descTipoRimac) {
    this.descTipoRimac = descTipoRimac;
  }

  public VehiculoVEHICULOSUNARP codGrupoRimac(String codGrupoRimac) {
    this.codGrupoRimac = codGrupoRimac;
    return this;
  }

   /**
   * Get codGrupoRimac
   * @return codGrupoRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCodGrupoRimac() {
    return codGrupoRimac;
  }

  public void setCodGrupoRimac(String codGrupoRimac) {
    this.codGrupoRimac = codGrupoRimac;
  }

  public VehiculoVEHICULOSUNARP valorComercial(Integer valorComercial) {
    this.valorComercial = valorComercial;
    return this;
  }

   /**
   * Get valorComercial
   * @return valorComercial
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getValorComercial() {
    return valorComercial;
  }

  public void setValorComercial(Integer valorComercial) {
    this.valorComercial = valorComercial;
  }

  public VehiculoVEHICULOSUNARP clase(String clase) {
    this.clase = clase;
    return this;
  }

   /**
   * Get clase
   * @return clase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getClase() {
    return clase;
  }

  public void setClase(String clase) {
    this.clase = clase;
  }

  public VehiculoVEHICULOSUNARP marca(String marca) {
    this.marca = marca;
    return this;
  }

   /**
   * Get marca
   * @return marca
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public VehiculoVEHICULOSUNARP indPractimovil(String indPractimovil) {
    this.indPractimovil = indPractimovil;
    return this;
  }

   /**
   * Get indPractimovil
   * @return indPractimovil
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndPractimovil() {
    return indPractimovil;
  }

  public void setIndPractimovil(String indPractimovil) {
    this.indPractimovil = indPractimovil;
  }

  public VehiculoVEHICULOSUNARP descModeloRimac(String descModeloRimac) {
    this.descModeloRimac = descModeloRimac;
    return this;
  }

   /**
   * Get descModeloRimac
   * @return descModeloRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescModeloRimac() {
    return descModeloRimac;
  }

  public void setDescModeloRimac(String descModeloRimac) {
    this.descModeloRimac = descModeloRimac;
  }

  public VehiculoVEHICULOSUNARP placaVigente(String placaVigente) {
    this.placaVigente = placaVigente;
    return this;
  }

   /**
   * Get placaVigente
   * @return placaVigente
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlacaVigente() {
    return placaVigente;
  }

  public void setPlacaVigente(String placaVigente) {
    this.placaVigente = placaVigente;
  }

  public VehiculoVEHICULOSUNARP otraObservacion(String otraObservacion) {
    this.otraObservacion = otraObservacion;
    return this;
  }

   /**
   * Get otraObservacion
   * @return otraObservacion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOtraObservacion() {
    return otraObservacion;
  }

  public void setOtraObservacion(String otraObservacion) {
    this.otraObservacion = otraObservacion;
  }

  public VehiculoVEHICULOSUNARP anioFabricacion(String anioFabricacion) {
    this.anioFabricacion = anioFabricacion;
    return this;
  }

   /**
   * Get anioFabricacion
   * @return anioFabricacion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAnioFabricacion() {
    return anioFabricacion;
  }

  public void setAnioFabricacion(String anioFabricacion) {
    this.anioFabricacion = anioFabricacion;
  }

  public VehiculoVEHICULOSUNARP codMarcaRimac(String codMarcaRimac) {
    this.codMarcaRimac = codMarcaRimac;
    return this;
  }

   /**
   * Get codMarcaRimac
   * @return codMarcaRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCodMarcaRimac() {
    return codMarcaRimac;
  }

  public void setCodMarcaRimac(String codMarcaRimac) {
    this.codMarcaRimac = codMarcaRimac;
  }

  public VehiculoVEHICULOSUNARP nroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
    return this;
  }

   /**
   * Get nroSerie
   * @return nroSerie
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNroSerie() {
    return nroSerie;
  }

  public void setNroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
  }

  public VehiculoVEHICULOSUNARP descClaseRimac(String descClaseRimac) {
    this.descClaseRimac = descClaseRimac;
    return this;
  }

   /**
   * Get descClaseRimac
   * @return descClaseRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescClaseRimac() {
    return descClaseRimac;
  }

  public void setDescClaseRimac(String descClaseRimac) {
    this.descClaseRimac = descClaseRimac;
  }

  public VehiculoVEHICULOSUNARP nroMotor(String nroMotor) {
    this.nroMotor = nroMotor;
    return this;
  }

   /**
   * Get nroMotor
   * @return nroMotor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNroMotor() {
    return nroMotor;
  }

  public void setNroMotor(String nroMotor) {
    this.nroMotor = nroMotor;
  }

  public VehiculoVEHICULOSUNARP codClaseRimac(String codClaseRimac) {
    this.codClaseRimac = codClaseRimac;
    return this;
  }

   /**
   * Get codClaseRimac
   * @return codClaseRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCodClaseRimac() {
    return codClaseRimac;
  }

  public void setCodClaseRimac(String codClaseRimac) {
    this.codClaseRimac = codClaseRimac;
  }

  public VehiculoVEHICULOSUNARP descGrupoRimac(String descGrupoRimac) {
    this.descGrupoRimac = descGrupoRimac;
    return this;
  }

   /**
   * Get descGrupoRimac
   * @return descGrupoRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescGrupoRimac() {
    return descGrupoRimac;
  }

  public void setDescGrupoRimac(String descGrupoRimac) {
    this.descGrupoRimac = descGrupoRimac;
  }

  public VehiculoVEHICULOSUNARP descMarcaRimac(String descMarcaRimac) {
    this.descMarcaRimac = descMarcaRimac;
    return this;
  }

   /**
   * Get descMarcaRimac
   * @return descMarcaRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescMarcaRimac() {
    return descMarcaRimac;
  }

  public void setDescMarcaRimac(String descMarcaRimac) {
    this.descMarcaRimac = descMarcaRimac;
  }

  public VehiculoVEHICULOSUNARP indClasico(String indClasico) {
    this.indClasico = indClasico;
    return this;
  }

   /**
   * Get indClasico
   * @return indClasico
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndClasico() {
    return indClasico;
  }

  public void setIndClasico(String indClasico) {
    this.indClasico = indClasico;
  }

  public VehiculoVEHICULOSUNARP modelo(String modelo) {
    this.modelo = modelo;
    return this;
  }

   /**
   * Get modelo
   * @return modelo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public VehiculoVEHICULOSUNARP indChinoHindu(String indChinoHindu) {
    this.indChinoHindu = indChinoHindu;
    return this;
  }

   /**
   * Get indChinoHindu
   * @return indChinoHindu
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndChinoHindu() {
    return indChinoHindu;
  }

  public void setIndChinoHindu(String indChinoHindu) {
    this.indChinoHindu = indChinoHindu;
  }

  public VehiculoVEHICULOSUNARP gpsRequerido(Boolean gpsRequerido) {
    this.gpsRequerido = gpsRequerido;
    return this;
  }

   /**
   * Get gpsRequerido
   * @return gpsRequerido
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGpsRequerido() {
    return gpsRequerido;
  }

  public void setGpsRequerido(Boolean gpsRequerido) {
    this.gpsRequerido = gpsRequerido;
  }

  public VehiculoVEHICULOSUNARP valorNuevo(Integer valorNuevo) {
    this.valorNuevo = valorNuevo;
    return this;
  }

   /**
   * Get valorNuevo
   * @return valorNuevo
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getValorNuevo() {
    return valorNuevo;
  }

  public void setValorNuevo(Integer valorNuevo) {
    this.valorNuevo = valorNuevo;
  }

  public VehiculoVEHICULOSUNARP codModeloRimac(String codModeloRimac) {
    this.codModeloRimac = codModeloRimac;
    return this;
  }

   /**
   * Get codModeloRimac
   * @return codModeloRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCodModeloRimac() {
    return codModeloRimac;
  }

  public void setCodModeloRimac(String codModeloRimac) {
    this.codModeloRimac = codModeloRimac;
  }

  public VehiculoVEHICULOSUNARP indPremier(String indPremier) {
    this.indPremier = indPremier;
    return this;
  }

   /**
   * Get indPremier
   * @return indPremier
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIndPremier() {
    return indPremier;
  }

  public void setIndPremier(String indPremier) {
    this.indPremier = indPremier;
  }

  public VehiculoVEHICULOSUNARP ind4X4(String ind4X4) {
    this.ind4X4 = ind4X4;
    return this;
  }

   /**
   * Get ind4X4
   * @return ind4X4
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInd4X4() {
    return ind4X4;
  }

  public void setInd4X4(String ind4X4) {
    this.ind4X4 = ind4X4;
  }

  public VehiculoVEHICULOSUNARP codTipoRimac(String codTipoRimac) {
    this.codTipoRimac = codTipoRimac;
    return this;
  }

   /**
   * Get codTipoRimac
   * @return codTipoRimac
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCodTipoRimac() {
    return codTipoRimac;
  }

  public void setCodTipoRimac(String codTipoRimac) {
    this.codTipoRimac = codTipoRimac;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehiculoVEHICULOSUNARP vehiculoVEHICULOSUNARP = (VehiculoVEHICULOSUNARP) o;
    return Objects.equals(this.tipoAltoRiesgo, vehiculoVEHICULOSUNARP.tipoAltoRiesgo) &&
        Objects.equals(this.descTipoRimac, vehiculoVEHICULOSUNARP.descTipoRimac) &&
        Objects.equals(this.codGrupoRimac, vehiculoVEHICULOSUNARP.codGrupoRimac) &&
        Objects.equals(this.valorComercial, vehiculoVEHICULOSUNARP.valorComercial) &&
        Objects.equals(this.clase, vehiculoVEHICULOSUNARP.clase) &&
        Objects.equals(this.marca, vehiculoVEHICULOSUNARP.marca) &&
        Objects.equals(this.indPractimovil, vehiculoVEHICULOSUNARP.indPractimovil) &&
        Objects.equals(this.descModeloRimac, vehiculoVEHICULOSUNARP.descModeloRimac) &&
        Objects.equals(this.placaVigente, vehiculoVEHICULOSUNARP.placaVigente) &&
        Objects.equals(this.otraObservacion, vehiculoVEHICULOSUNARP.otraObservacion) &&
        Objects.equals(this.anioFabricacion, vehiculoVEHICULOSUNARP.anioFabricacion) &&
        Objects.equals(this.codMarcaRimac, vehiculoVEHICULOSUNARP.codMarcaRimac) &&
        Objects.equals(this.nroSerie, vehiculoVEHICULOSUNARP.nroSerie) &&
        Objects.equals(this.descClaseRimac, vehiculoVEHICULOSUNARP.descClaseRimac) &&
        Objects.equals(this.nroMotor, vehiculoVEHICULOSUNARP.nroMotor) &&
        Objects.equals(this.codClaseRimac, vehiculoVEHICULOSUNARP.codClaseRimac) &&
        Objects.equals(this.descGrupoRimac, vehiculoVEHICULOSUNARP.descGrupoRimac) &&
        Objects.equals(this.descMarcaRimac, vehiculoVEHICULOSUNARP.descMarcaRimac) &&
        Objects.equals(this.indClasico, vehiculoVEHICULOSUNARP.indClasico) &&
        Objects.equals(this.modelo, vehiculoVEHICULOSUNARP.modelo) &&
        Objects.equals(this.indChinoHindu, vehiculoVEHICULOSUNARP.indChinoHindu) &&
        Objects.equals(this.gpsRequerido, vehiculoVEHICULOSUNARP.gpsRequerido) &&
        Objects.equals(this.valorNuevo, vehiculoVEHICULOSUNARP.valorNuevo) &&
        Objects.equals(this.codModeloRimac, vehiculoVEHICULOSUNARP.codModeloRimac) &&
        Objects.equals(this.indPremier, vehiculoVEHICULOSUNARP.indPremier) &&
        Objects.equals(this.ind4X4, vehiculoVEHICULOSUNARP.ind4X4) &&
        Objects.equals(this.codTipoRimac, vehiculoVEHICULOSUNARP.codTipoRimac);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoAltoRiesgo, descTipoRimac, codGrupoRimac, valorComercial, clase, marca, indPractimovil, descModeloRimac, placaVigente, otraObservacion, anioFabricacion, codMarcaRimac, nroSerie, descClaseRimac, nroMotor, codClaseRimac, descGrupoRimac, descMarcaRimac, indClasico, modelo, indChinoHindu, gpsRequerido, valorNuevo, codModeloRimac, indPremier, ind4X4, codTipoRimac);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehiculoVEHICULOSUNARP {\n");
    
    sb.append("    tipoAltoRiesgo: ").append(toIndentedString(tipoAltoRiesgo)).append("\n");
    sb.append("    descTipoRimac: ").append(toIndentedString(descTipoRimac)).append("\n");
    sb.append("    codGrupoRimac: ").append(toIndentedString(codGrupoRimac)).append("\n");
    sb.append("    valorComercial: ").append(toIndentedString(valorComercial)).append("\n");
    sb.append("    clase: ").append(toIndentedString(clase)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    indPractimovil: ").append(toIndentedString(indPractimovil)).append("\n");
    sb.append("    descModeloRimac: ").append(toIndentedString(descModeloRimac)).append("\n");
    sb.append("    placaVigente: ").append(toIndentedString(placaVigente)).append("\n");
    sb.append("    otraObservacion: ").append(toIndentedString(otraObservacion)).append("\n");
    sb.append("    anioFabricacion: ").append(toIndentedString(anioFabricacion)).append("\n");
    sb.append("    codMarcaRimac: ").append(toIndentedString(codMarcaRimac)).append("\n");
    sb.append("    nroSerie: ").append(toIndentedString(nroSerie)).append("\n");
    sb.append("    descClaseRimac: ").append(toIndentedString(descClaseRimac)).append("\n");
    sb.append("    nroMotor: ").append(toIndentedString(nroMotor)).append("\n");
    sb.append("    codClaseRimac: ").append(toIndentedString(codClaseRimac)).append("\n");
    sb.append("    descGrupoRimac: ").append(toIndentedString(descGrupoRimac)).append("\n");
    sb.append("    descMarcaRimac: ").append(toIndentedString(descMarcaRimac)).append("\n");
    sb.append("    indClasico: ").append(toIndentedString(indClasico)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    indChinoHindu: ").append(toIndentedString(indChinoHindu)).append("\n");
    sb.append("    gpsRequerido: ").append(toIndentedString(gpsRequerido)).append("\n");
    sb.append("    valorNuevo: ").append(toIndentedString(valorNuevo)).append("\n");
    sb.append("    codModeloRimac: ").append(toIndentedString(codModeloRimac)).append("\n");
    sb.append("    indPremier: ").append(toIndentedString(indPremier)).append("\n");
    sb.append("    ind4X4: ").append(toIndentedString(ind4X4)).append("\n");
    sb.append("    codTipoRimac: ").append(toIndentedString(codTipoRimac)).append("\n");
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

