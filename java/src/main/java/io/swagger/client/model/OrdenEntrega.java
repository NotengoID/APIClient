package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * OrdenEntrega
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T23:03:41.247Z")
public class OrdenEntrega {
  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("hora")
  private String hora = null;

  @JsonProperty("dschora")
  private String dschora = null;

  @JsonProperty("dircontacto")
  private String dircontacto = null;

  @JsonProperty("dircontactocorreo")
  private String dircontactocorreo = null;

  @JsonProperty("dscdistrito")
  private String dscdistrito = null;

  public OrdenEntrega fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }

   /**
   * Get fecha
   * @return fecha
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public OrdenEntrega hora(String hora) {
    this.hora = hora;
    return this;
  }

   /**
   * Get hora
   * @return hora
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public OrdenEntrega dschora(String dschora) {
    this.dschora = dschora;
    return this;
  }

   /**
   * Get dschora
   * @return dschora
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDschora() {
    return dschora;
  }

  public void setDschora(String dschora) {
    this.dschora = dschora;
  }

  public OrdenEntrega dircontacto(String dircontacto) {
    this.dircontacto = dircontacto;
    return this;
  }

   /**
   * Get dircontacto
   * @return dircontacto
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDircontacto() {
    return dircontacto;
  }

  public void setDircontacto(String dircontacto) {
    this.dircontacto = dircontacto;
  }

  public OrdenEntrega dircontactocorreo(String dircontactocorreo) {
    this.dircontactocorreo = dircontactocorreo;
    return this;
  }

   /**
   * Get dircontactocorreo
   * @return dircontactocorreo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDircontactocorreo() {
    return dircontactocorreo;
  }

  public void setDircontactocorreo(String dircontactocorreo) {
    this.dircontactocorreo = dircontactocorreo;
  }

  public OrdenEntrega dscdistrito(String dscdistrito) {
    this.dscdistrito = dscdistrito;
    return this;
  }

   /**
   * Get dscdistrito
   * @return dscdistrito
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDscdistrito() {
    return dscdistrito;
  }

  public void setDscdistrito(String dscdistrito) {
    this.dscdistrito = dscdistrito;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdenEntrega ordenEntrega = (OrdenEntrega) o;
    return Objects.equals(this.fecha, ordenEntrega.fecha) &&
        Objects.equals(this.hora, ordenEntrega.hora) &&
        Objects.equals(this.dschora, ordenEntrega.dschora) &&
        Objects.equals(this.dircontacto, ordenEntrega.dircontacto) &&
        Objects.equals(this.dircontactocorreo, ordenEntrega.dircontactocorreo) &&
        Objects.equals(this.dscdistrito, ordenEntrega.dscdistrito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, hora, dschora, dircontacto, dircontactocorreo, dscdistrito);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdenEntrega {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    dschora: ").append(toIndentedString(dschora)).append("\n");
    sb.append("    dircontacto: ").append(toIndentedString(dircontacto)).append("\n");
    sb.append("    dircontactocorreo: ").append(toIndentedString(dircontactocorreo)).append("\n");
    sb.append("    dscdistrito: ").append(toIndentedString(dscdistrito)).append("\n");
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

