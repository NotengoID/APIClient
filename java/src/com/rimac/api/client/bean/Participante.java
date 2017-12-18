package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.rimac.api.client.bean.FormaCobro;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Participante
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-18T16:39:42.128Z")
public class Participante {
  @JsonProperty("iderol")
  private String iderol = null;

  @JsonProperty("idetercero")
  private String idetercero = null;

  @JsonProperty("prc")
  private String prc = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("idptiprelter")
  private String idptiprelter = null;

  @JsonProperty("tlfcontacto")
  private String tlfcontacto = null;

  @JsonProperty("emailcontacto")
  private String emailcontacto = null;

  @JsonProperty("formacobro")
  private FormaCobro formacobro = null;

  public Participante iderol(String iderol) {
    this.iderol = iderol;
    return this;
  }

   /**
   * Get iderol
   * @return iderol
  **/
  @ApiModelProperty(value = "")
  public String getIderol() {
    return iderol;
  }

  public void setIderol(String iderol) {
    this.iderol = iderol;
  }

  public Participante idetercero(String idetercero) {
    this.idetercero = idetercero;
    return this;
  }

   /**
   * Get idetercero
   * @return idetercero
  **/
  @ApiModelProperty(value = "")
  public String getIdetercero() {
    return idetercero;
  }

  public void setIdetercero(String idetercero) {
    this.idetercero = idetercero;
  }

  public Participante prc(String prc) {
    this.prc = prc;
    return this;
  }

   /**
   * Get prc
   * @return prc
  **/
  @ApiModelProperty(value = "")
  public String getPrc() {
    return prc;
  }

  public void setPrc(String prc) {
    this.prc = prc;
  }

  public Participante tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Get tipo
   * @return tipo
  **/
  @ApiModelProperty(value = "")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Participante idptiprelter(String idptiprelter) {
    this.idptiprelter = idptiprelter;
    return this;
  }

   /**
   * Get idptiprelter
   * @return idptiprelter
  **/
  @ApiModelProperty(value = "")
  public String getIdptiprelter() {
    return idptiprelter;
  }

  public void setIdptiprelter(String idptiprelter) {
    this.idptiprelter = idptiprelter;
  }

  public Participante tlfcontacto(String tlfcontacto) {
    this.tlfcontacto = tlfcontacto;
    return this;
  }

   /**
   * Get tlfcontacto
   * @return tlfcontacto
  **/
  @ApiModelProperty(value = "")
  public String getTlfcontacto() {
    return tlfcontacto;
  }

  public void setTlfcontacto(String tlfcontacto) {
    this.tlfcontacto = tlfcontacto;
  }

  public Participante emailcontacto(String emailcontacto) {
    this.emailcontacto = emailcontacto;
    return this;
  }

   /**
   * Get emailcontacto
   * @return emailcontacto
  **/
  @ApiModelProperty(value = "")
  public String getEmailcontacto() {
    return emailcontacto;
  }

  public void setEmailcontacto(String emailcontacto) {
    this.emailcontacto = emailcontacto;
  }

  public Participante formacobro(FormaCobro formacobro) {
    this.formacobro = formacobro;
    return this;
  }

   /**
   * Get formacobro
   * @return formacobro
  **/
  @ApiModelProperty(value = "")
  public FormaCobro getFormacobro() {
    return formacobro;
  }

  public void setFormacobro(FormaCobro formacobro) {
    this.formacobro = formacobro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participante participante = (Participante) o;
    return Objects.equals(this.iderol, participante.iderol) &&
        Objects.equals(this.idetercero, participante.idetercero) &&
        Objects.equals(this.prc, participante.prc) &&
        Objects.equals(this.tipo, participante.tipo) &&
        Objects.equals(this.idptiprelter, participante.idptiprelter) &&
        Objects.equals(this.tlfcontacto, participante.tlfcontacto) &&
        Objects.equals(this.emailcontacto, participante.emailcontacto) &&
        Objects.equals(this.formacobro, participante.formacobro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iderol, idetercero, prc, tipo, idptiprelter, tlfcontacto, emailcontacto, formacobro);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participante {\n");
    
    sb.append("    iderol: ").append(toIndentedString(iderol)).append("\n");
    sb.append("    idetercero: ").append(toIndentedString(idetercero)).append("\n");
    sb.append("    prc: ").append(toIndentedString(prc)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    idptiprelter: ").append(toIndentedString(idptiprelter)).append("\n");
    sb.append("    tlfcontacto: ").append(toIndentedString(tlfcontacto)).append("\n");
    sb.append("    emailcontacto: ").append(toIndentedString(emailcontacto)).append("\n");
    sb.append("    formacobro: ").append(toIndentedString(formacobro)).append("\n");
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

