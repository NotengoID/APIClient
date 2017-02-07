package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PlanCotizado
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-07T17:09:54.301Z")
public class PlanCotizado {
  @JsonProperty("primaneta")
  private String primaneta = null;

  @JsonProperty("dscplan")
  private String dscplan = null;

  @JsonProperty("ideplan")
  private String ideplan = null;

  @JsonProperty("primabruta")
  private String primabruta = null;

  @JsonProperty("simbolomoneda")
  private String simbolomoneda = null;

  @JsonProperty("prima")
  private String prima = null;

  public PlanCotizado primaneta(String primaneta) {
    this.primaneta = primaneta;
    return this;
  }

   /**
   * Get primaneta
   * @return primaneta
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrimaneta() {
    return primaneta;
  }

  public void setPrimaneta(String primaneta) {
    this.primaneta = primaneta;
  }

  public PlanCotizado dscplan(String dscplan) {
    this.dscplan = dscplan;
    return this;
  }

   /**
   * Get dscplan
   * @return dscplan
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDscplan() {
    return dscplan;
  }

  public void setDscplan(String dscplan) {
    this.dscplan = dscplan;
  }

  public PlanCotizado ideplan(String ideplan) {
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

  public PlanCotizado primabruta(String primabruta) {
    this.primabruta = primabruta;
    return this;
  }

   /**
   * Get primabruta
   * @return primabruta
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrimabruta() {
    return primabruta;
  }

  public void setPrimabruta(String primabruta) {
    this.primabruta = primabruta;
  }

  public PlanCotizado simbolomoneda(String simbolomoneda) {
    this.simbolomoneda = simbolomoneda;
    return this;
  }

   /**
   * Get simbolomoneda
   * @return simbolomoneda
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSimbolomoneda() {
    return simbolomoneda;
  }

  public void setSimbolomoneda(String simbolomoneda) {
    this.simbolomoneda = simbolomoneda;
  }

  public PlanCotizado prima(String prima) {
    this.prima = prima;
    return this;
  }

   /**
   * Get prima
   * @return prima
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrima() {
    return prima;
  }

  public void setPrima(String prima) {
    this.prima = prima;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanCotizado planCotizado = (PlanCotizado) o;
    return Objects.equals(this.primaneta, planCotizado.primaneta) &&
        Objects.equals(this.dscplan, planCotizado.dscplan) &&
        Objects.equals(this.ideplan, planCotizado.ideplan) &&
        Objects.equals(this.primabruta, planCotizado.primabruta) &&
        Objects.equals(this.simbolomoneda, planCotizado.simbolomoneda) &&
        Objects.equals(this.prima, planCotizado.prima);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaneta, dscplan, ideplan, primabruta, simbolomoneda, prima);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanCotizado {\n");
    
    sb.append("    primaneta: ").append(toIndentedString(primaneta)).append("\n");
    sb.append("    dscplan: ").append(toIndentedString(dscplan)).append("\n");
    sb.append("    ideplan: ").append(toIndentedString(ideplan)).append("\n");
    sb.append("    primabruta: ").append(toIndentedString(primabruta)).append("\n");
    sb.append("    simbolomoneda: ").append(toIndentedString(simbolomoneda)).append("\n");
    sb.append("    prima: ").append(toIndentedString(prima)).append("\n");
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

