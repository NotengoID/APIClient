package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VehiculoVEHICULOSUNARP
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-18T16:39:42.128Z")
public class VehiculoVEHICULOSUNARP {
  @JsonProperty("gpsRequerido")
  private Boolean gpsRequerido = null;

  @JsonProperty("anioFabricacion")
  private String anioFabricacion = null;

  @JsonProperty("clase")
  private String clase = null;

  @JsonProperty("codClaseRimac")
  private String codClaseRimac = null;

  @JsonProperty("codGrupoRimac")
  private String codGrupoRimac = null;

  @JsonProperty("codMarcaRimac")
  private String codMarcaRimac = null;

  @JsonProperty("codModeloRimac")
  private String codModeloRimac = null;

  @JsonProperty("descClaseRimac")
  private String descClaseRimac = null;

  @JsonProperty("descGrupoRimac")
  private String descGrupoRimac = null;

  @JsonProperty("descMarcaRimac")
  private String descMarcaRimac = null;

  @JsonProperty("descModeloRimac")
  private String descModeloRimac = null;

  @JsonProperty("ind4X4")
  private String ind4X4 = null;

  @JsonProperty("indClasico")
  private String indClasico = null;

  @JsonProperty("indPractimovil")
  private String indPractimovil = null;

  @JsonProperty("indPremier")
  private String indPremier = null;

  @JsonProperty("marca")
  private String marca = null;

  @JsonProperty("modelo")
  private String modelo = null;

  @JsonProperty("nroMotor")
  private String nroMotor = null;

  @JsonProperty("nroSerie")
  private String nroSerie = null;

  @JsonProperty("otraObservacion")
  private String otraObservacion = null;

  @JsonProperty("placaVigente")
  private String placaVigente = null;

  @JsonProperty("valorComercial")
  private Integer valorComercial = null;

  @JsonProperty("valorNuevo")
  private Integer valorNuevo = null;

  @JsonProperty("tipoAltoRiesgo")
  private String tipoAltoRiesgo = null;

  @JsonProperty("codTipoRimac")
  private String codTipoRimac = null;

  @JsonProperty("descTipoRimac")
  private String descTipoRimac = null;

  @JsonProperty("indChinoHindu")
  private String indChinoHindu = null;

  public VehiculoVEHICULOSUNARP gpsRequerido(Boolean gpsRequerido) {
    this.gpsRequerido = gpsRequerido;
    return this;
  }

   /**
   * Get gpsRequerido
   * @return gpsRequerido
  **/
  @ApiModelProperty(value = "")
  public Boolean isGpsRequerido() {
    return gpsRequerido;
  }

  public void setGpsRequerido(Boolean gpsRequerido) {
    this.gpsRequerido = gpsRequerido;
  }

  public VehiculoVEHICULOSUNARP anioFabricacion(String anioFabricacion) {
    this.anioFabricacion = anioFabricacion;
    return this;
  }

   /**
   * Get anioFabricacion
   * @return anioFabricacion
  **/
  @ApiModelProperty(value = "")
  public String getAnioFabricacion() {
    return anioFabricacion;
  }

  public void setAnioFabricacion(String anioFabricacion) {
    this.anioFabricacion = anioFabricacion;
  }

  public VehiculoVEHICULOSUNARP clase(String clase) {
    this.clase = clase;
    return this;
  }

   /**
   * Get clase
   * @return clase
  **/
  @ApiModelProperty(value = "")
  public String getClase() {
    return clase;
  }

  public void setClase(String clase) {
    this.clase = clase;
  }

  public VehiculoVEHICULOSUNARP codClaseRimac(String codClaseRimac) {
    this.codClaseRimac = codClaseRimac;
    return this;
  }

   /**
   * Get codClaseRimac
   * @return codClaseRimac
  **/
  @ApiModelProperty(value = "")
  public String getCodClaseRimac() {
    return codClaseRimac;
  }

  public void setCodClaseRimac(String codClaseRimac) {
    this.codClaseRimac = codClaseRimac;
  }

  public VehiculoVEHICULOSUNARP codGrupoRimac(String codGrupoRimac) {
    this.codGrupoRimac = codGrupoRimac;
    return this;
  }

   /**
   * Get codGrupoRimac
   * @return codGrupoRimac
  **/
  @ApiModelProperty(value = "")
  public String getCodGrupoRimac() {
    return codGrupoRimac;
  }

  public void setCodGrupoRimac(String codGrupoRimac) {
    this.codGrupoRimac = codGrupoRimac;
  }

  public VehiculoVEHICULOSUNARP codMarcaRimac(String codMarcaRimac) {
    this.codMarcaRimac = codMarcaRimac;
    return this;
  }

   /**
   * Get codMarcaRimac
   * @return codMarcaRimac
  **/
  @ApiModelProperty(value = "")
  public String getCodMarcaRimac() {
    return codMarcaRimac;
  }

  public void setCodMarcaRimac(String codMarcaRimac) {
    this.codMarcaRimac = codMarcaRimac;
  }

  public VehiculoVEHICULOSUNARP codModeloRimac(String codModeloRimac) {
    this.codModeloRimac = codModeloRimac;
    return this;
  }

   /**
   * Get codModeloRimac
   * @return codModeloRimac
  **/
  @ApiModelProperty(value = "")
  public String getCodModeloRimac() {
    return codModeloRimac;
  }

  public void setCodModeloRimac(String codModeloRimac) {
    this.codModeloRimac = codModeloRimac;
  }

  public VehiculoVEHICULOSUNARP descClaseRimac(String descClaseRimac) {
    this.descClaseRimac = descClaseRimac;
    return this;
  }

   /**
   * Get descClaseRimac
   * @return descClaseRimac
  **/
  @ApiModelProperty(value = "")
  public String getDescClaseRimac() {
    return descClaseRimac;
  }

  public void setDescClaseRimac(String descClaseRimac) {
    this.descClaseRimac = descClaseRimac;
  }

  public VehiculoVEHICULOSUNARP descGrupoRimac(String descGrupoRimac) {
    this.descGrupoRimac = descGrupoRimac;
    return this;
  }

   /**
   * Get descGrupoRimac
   * @return descGrupoRimac
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public String getDescMarcaRimac() {
    return descMarcaRimac;
  }

  public void setDescMarcaRimac(String descMarcaRimac) {
    this.descMarcaRimac = descMarcaRimac;
  }

  public VehiculoVEHICULOSUNARP descModeloRimac(String descModeloRimac) {
    this.descModeloRimac = descModeloRimac;
    return this;
  }

   /**
   * Get descModeloRimac
   * @return descModeloRimac
  **/
  @ApiModelProperty(value = "")
  public String getDescModeloRimac() {
    return descModeloRimac;
  }

  public void setDescModeloRimac(String descModeloRimac) {
    this.descModeloRimac = descModeloRimac;
  }

  public VehiculoVEHICULOSUNARP ind4X4(String ind4X4) {
    this.ind4X4 = ind4X4;
    return this;
  }

   /**
   * Get ind4X4
   * @return ind4X4
  **/
  @ApiModelProperty(value = "")
  public String getInd4X4() {
    return ind4X4;
  }

  public void setInd4X4(String ind4X4) {
    this.ind4X4 = ind4X4;
  }

  public VehiculoVEHICULOSUNARP indClasico(String indClasico) {
    this.indClasico = indClasico;
    return this;
  }

   /**
   * Get indClasico
   * @return indClasico
  **/
  @ApiModelProperty(value = "")
  public String getIndClasico() {
    return indClasico;
  }

  public void setIndClasico(String indClasico) {
    this.indClasico = indClasico;
  }

  public VehiculoVEHICULOSUNARP indPractimovil(String indPractimovil) {
    this.indPractimovil = indPractimovil;
    return this;
  }

   /**
   * Get indPractimovil
   * @return indPractimovil
  **/
  @ApiModelProperty(value = "")
  public String getIndPractimovil() {
    return indPractimovil;
  }

  public void setIndPractimovil(String indPractimovil) {
    this.indPractimovil = indPractimovil;
  }

  public VehiculoVEHICULOSUNARP indPremier(String indPremier) {
    this.indPremier = indPremier;
    return this;
  }

   /**
   * Get indPremier
   * @return indPremier
  **/
  @ApiModelProperty(value = "")
  public String getIndPremier() {
    return indPremier;
  }

  public void setIndPremier(String indPremier) {
    this.indPremier = indPremier;
  }

  public VehiculoVEHICULOSUNARP marca(String marca) {
    this.marca = marca;
    return this;
  }

   /**
   * Get marca
   * @return marca
  **/
  @ApiModelProperty(value = "")
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public VehiculoVEHICULOSUNARP modelo(String modelo) {
    this.modelo = modelo;
    return this;
  }

   /**
   * Get modelo
   * @return modelo
  **/
  @ApiModelProperty(value = "")
  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public VehiculoVEHICULOSUNARP nroMotor(String nroMotor) {
    this.nroMotor = nroMotor;
    return this;
  }

   /**
   * Get nroMotor
   * @return nroMotor
  **/
  @ApiModelProperty(value = "")
  public String getNroMotor() {
    return nroMotor;
  }

  public void setNroMotor(String nroMotor) {
    this.nroMotor = nroMotor;
  }

  public VehiculoVEHICULOSUNARP nroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
    return this;
  }

   /**
   * Get nroSerie
   * @return nroSerie
  **/
  @ApiModelProperty(value = "")
  public String getNroSerie() {
    return nroSerie;
  }

  public void setNroSerie(String nroSerie) {
    this.nroSerie = nroSerie;
  }

  public VehiculoVEHICULOSUNARP otraObservacion(String otraObservacion) {
    this.otraObservacion = otraObservacion;
    return this;
  }

   /**
   * Get otraObservacion
   * @return otraObservacion
  **/
  @ApiModelProperty(value = "")
  public String getOtraObservacion() {
    return otraObservacion;
  }

  public void setOtraObservacion(String otraObservacion) {
    this.otraObservacion = otraObservacion;
  }

  public VehiculoVEHICULOSUNARP placaVigente(String placaVigente) {
    this.placaVigente = placaVigente;
    return this;
  }

   /**
   * Get placaVigente
   * @return placaVigente
  **/
  @ApiModelProperty(value = "")
  public String getPlacaVigente() {
    return placaVigente;
  }

  public void setPlacaVigente(String placaVigente) {
    this.placaVigente = placaVigente;
  }

  public VehiculoVEHICULOSUNARP valorComercial(Integer valorComercial) {
    this.valorComercial = valorComercial;
    return this;
  }

   /**
   * Get valorComercial
   * @return valorComercial
  **/
  @ApiModelProperty(value = "")
  public Integer getValorComercial() {
    return valorComercial;
  }

  public void setValorComercial(Integer valorComercial) {
    this.valorComercial = valorComercial;
  }

  public VehiculoVEHICULOSUNARP valorNuevo(Integer valorNuevo) {
    this.valorNuevo = valorNuevo;
    return this;
  }

   /**
   * Get valorNuevo
   * @return valorNuevo
  **/
  @ApiModelProperty(value = "")
  public Integer getValorNuevo() {
    return valorNuevo;
  }

  public void setValorNuevo(Integer valorNuevo) {
    this.valorNuevo = valorNuevo;
  }

  public VehiculoVEHICULOSUNARP tipoAltoRiesgo(String tipoAltoRiesgo) {
    this.tipoAltoRiesgo = tipoAltoRiesgo;
    return this;
  }

   /**
   * Get tipoAltoRiesgo
   * @return tipoAltoRiesgo
  **/
  @ApiModelProperty(value = "")
  public String getTipoAltoRiesgo() {
    return tipoAltoRiesgo;
  }

  public void setTipoAltoRiesgo(String tipoAltoRiesgo) {
    this.tipoAltoRiesgo = tipoAltoRiesgo;
  }

  public VehiculoVEHICULOSUNARP codTipoRimac(String codTipoRimac) {
    this.codTipoRimac = codTipoRimac;
    return this;
  }

   /**
   * Get codTipoRimac
   * @return codTipoRimac
  **/
  @ApiModelProperty(value = "")
  public String getCodTipoRimac() {
    return codTipoRimac;
  }

  public void setCodTipoRimac(String codTipoRimac) {
    this.codTipoRimac = codTipoRimac;
  }

  public VehiculoVEHICULOSUNARP descTipoRimac(String descTipoRimac) {
    this.descTipoRimac = descTipoRimac;
    return this;
  }

   /**
   * Get descTipoRimac
   * @return descTipoRimac
  **/
  @ApiModelProperty(value = "")
  public String getDescTipoRimac() {
    return descTipoRimac;
  }

  public void setDescTipoRimac(String descTipoRimac) {
    this.descTipoRimac = descTipoRimac;
  }

  public VehiculoVEHICULOSUNARP indChinoHindu(String indChinoHindu) {
    this.indChinoHindu = indChinoHindu;
    return this;
  }

   /**
   * Get indChinoHindu
   * @return indChinoHindu
  **/
  @ApiModelProperty(value = "")
  public String getIndChinoHindu() {
    return indChinoHindu;
  }

  public void setIndChinoHindu(String indChinoHindu) {
    this.indChinoHindu = indChinoHindu;
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
    return Objects.equals(this.gpsRequerido, vehiculoVEHICULOSUNARP.gpsRequerido) &&
        Objects.equals(this.anioFabricacion, vehiculoVEHICULOSUNARP.anioFabricacion) &&
        Objects.equals(this.clase, vehiculoVEHICULOSUNARP.clase) &&
        Objects.equals(this.codClaseRimac, vehiculoVEHICULOSUNARP.codClaseRimac) &&
        Objects.equals(this.codGrupoRimac, vehiculoVEHICULOSUNARP.codGrupoRimac) &&
        Objects.equals(this.codMarcaRimac, vehiculoVEHICULOSUNARP.codMarcaRimac) &&
        Objects.equals(this.codModeloRimac, vehiculoVEHICULOSUNARP.codModeloRimac) &&
        Objects.equals(this.descClaseRimac, vehiculoVEHICULOSUNARP.descClaseRimac) &&
        Objects.equals(this.descGrupoRimac, vehiculoVEHICULOSUNARP.descGrupoRimac) &&
        Objects.equals(this.descMarcaRimac, vehiculoVEHICULOSUNARP.descMarcaRimac) &&
        Objects.equals(this.descModeloRimac, vehiculoVEHICULOSUNARP.descModeloRimac) &&
        Objects.equals(this.ind4X4, vehiculoVEHICULOSUNARP.ind4X4) &&
        Objects.equals(this.indClasico, vehiculoVEHICULOSUNARP.indClasico) &&
        Objects.equals(this.indPractimovil, vehiculoVEHICULOSUNARP.indPractimovil) &&
        Objects.equals(this.indPremier, vehiculoVEHICULOSUNARP.indPremier) &&
        Objects.equals(this.marca, vehiculoVEHICULOSUNARP.marca) &&
        Objects.equals(this.modelo, vehiculoVEHICULOSUNARP.modelo) &&
        Objects.equals(this.nroMotor, vehiculoVEHICULOSUNARP.nroMotor) &&
        Objects.equals(this.nroSerie, vehiculoVEHICULOSUNARP.nroSerie) &&
        Objects.equals(this.otraObservacion, vehiculoVEHICULOSUNARP.otraObservacion) &&
        Objects.equals(this.placaVigente, vehiculoVEHICULOSUNARP.placaVigente) &&
        Objects.equals(this.valorComercial, vehiculoVEHICULOSUNARP.valorComercial) &&
        Objects.equals(this.valorNuevo, vehiculoVEHICULOSUNARP.valorNuevo) &&
        Objects.equals(this.tipoAltoRiesgo, vehiculoVEHICULOSUNARP.tipoAltoRiesgo) &&
        Objects.equals(this.codTipoRimac, vehiculoVEHICULOSUNARP.codTipoRimac) &&
        Objects.equals(this.descTipoRimac, vehiculoVEHICULOSUNARP.descTipoRimac) &&
        Objects.equals(this.indChinoHindu, vehiculoVEHICULOSUNARP.indChinoHindu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gpsRequerido, anioFabricacion, clase, codClaseRimac, codGrupoRimac, codMarcaRimac, codModeloRimac, descClaseRimac, descGrupoRimac, descMarcaRimac, descModeloRimac, ind4X4, indClasico, indPractimovil, indPremier, marca, modelo, nroMotor, nroSerie, otraObservacion, placaVigente, valorComercial, valorNuevo, tipoAltoRiesgo, codTipoRimac, descTipoRimac, indChinoHindu);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehiculoVEHICULOSUNARP {\n");
    
    sb.append("    gpsRequerido: ").append(toIndentedString(gpsRequerido)).append("\n");
    sb.append("    anioFabricacion: ").append(toIndentedString(anioFabricacion)).append("\n");
    sb.append("    clase: ").append(toIndentedString(clase)).append("\n");
    sb.append("    codClaseRimac: ").append(toIndentedString(codClaseRimac)).append("\n");
    sb.append("    codGrupoRimac: ").append(toIndentedString(codGrupoRimac)).append("\n");
    sb.append("    codMarcaRimac: ").append(toIndentedString(codMarcaRimac)).append("\n");
    sb.append("    codModeloRimac: ").append(toIndentedString(codModeloRimac)).append("\n");
    sb.append("    descClaseRimac: ").append(toIndentedString(descClaseRimac)).append("\n");
    sb.append("    descGrupoRimac: ").append(toIndentedString(descGrupoRimac)).append("\n");
    sb.append("    descMarcaRimac: ").append(toIndentedString(descMarcaRimac)).append("\n");
    sb.append("    descModeloRimac: ").append(toIndentedString(descModeloRimac)).append("\n");
    sb.append("    ind4X4: ").append(toIndentedString(ind4X4)).append("\n");
    sb.append("    indClasico: ").append(toIndentedString(indClasico)).append("\n");
    sb.append("    indPractimovil: ").append(toIndentedString(indPractimovil)).append("\n");
    sb.append("    indPremier: ").append(toIndentedString(indPremier)).append("\n");
    sb.append("    marca: ").append(toIndentedString(marca)).append("\n");
    sb.append("    modelo: ").append(toIndentedString(modelo)).append("\n");
    sb.append("    nroMotor: ").append(toIndentedString(nroMotor)).append("\n");
    sb.append("    nroSerie: ").append(toIndentedString(nroSerie)).append("\n");
    sb.append("    otraObservacion: ").append(toIndentedString(otraObservacion)).append("\n");
    sb.append("    placaVigente: ").append(toIndentedString(placaVigente)).append("\n");
    sb.append("    valorComercial: ").append(toIndentedString(valorComercial)).append("\n");
    sb.append("    valorNuevo: ").append(toIndentedString(valorNuevo)).append("\n");
    sb.append("    tipoAltoRiesgo: ").append(toIndentedString(tipoAltoRiesgo)).append("\n");
    sb.append("    codTipoRimac: ").append(toIndentedString(codTipoRimac)).append("\n");
    sb.append("    descTipoRimac: ").append(toIndentedString(descTipoRimac)).append("\n");
    sb.append("    indChinoHindu: ").append(toIndentedString(indChinoHindu)).append("\n");
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

