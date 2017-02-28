package com.rimac.api.client.bean;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormaCobro
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T15:10:13.520Z")
public class FormaCobro {
  @JsonProperty("ideformacobro")
  private String ideformacobro = null;

  public FormaCobro ideformacobro(String ideformacobro) {
    this.ideformacobro = ideformacobro;
    return this;
  }

   /**
   * Get ideformacobro
   * @return ideformacobro
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdeformacobro() {
    return ideformacobro;
  }

  public void setIdeformacobro(String ideformacobro) {
    this.ideformacobro = ideformacobro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormaCobro formaCobro = (FormaCobro) o;
    return Objects.equals(this.ideformacobro, formaCobro.ideformacobro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ideformacobro);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormaCobro {\n");
    
    sb.append("    ideformacobro: ").append(toIndentedString(ideformacobro)).append("\n");
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

