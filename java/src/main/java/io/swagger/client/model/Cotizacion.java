package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ObjectoAsegurado;
import java.util.ArrayList;
import java.util.List;

/**
 * Cotizacion
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T17:18:24.162Z")
public class Cotizacion {
  @JsonProperty("acuerdo")
  private String acuerdo = null;

  @JsonProperty("fecinivig")
  private String fecinivig = null;

  @JsonProperty("ur")
  private List<ObjectoAsegurado> ur = new ArrayList<ObjectoAsegurado>();

  public Cotizacion acuerdo(String acuerdo) {
    this.acuerdo = acuerdo;
    return this;
  }

   /**
   * Get acuerdo
   * @return acuerdo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAcuerdo() {
    return acuerdo;
  }

  public void setAcuerdo(String acuerdo) {
    this.acuerdo = acuerdo;
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

  public Cotizacion ur(List<ObjectoAsegurado> ur) {
    this.ur = ur;
    return this;
  }

  public Cotizacion addUrItem(ObjectoAsegurado urItem) {
    this.ur.add(urItem);
    return this;
  }

   /**
   * Get ur
   * @return ur
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ObjectoAsegurado> getUr() {
    return ur;
  }

  public void setUr(List<ObjectoAsegurado> ur) {
    this.ur = ur;
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
    return Objects.equals(this.acuerdo, cotizacion.acuerdo) &&
        Objects.equals(this.fecinivig, cotizacion.fecinivig) &&
        Objects.equals(this.ur, cotizacion.ur);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acuerdo, fecinivig, ur);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cotizacion {\n");
    
    sb.append("    acuerdo: ").append(toIndentedString(acuerdo)).append("\n");
    sb.append("    fecinivig: ").append(toIndentedString(fecinivig)).append("\n");
    sb.append("    ur: ").append(toIndentedString(ur)).append("\n");
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

