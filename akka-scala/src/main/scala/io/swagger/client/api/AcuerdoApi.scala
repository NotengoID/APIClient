/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Cotizacion
import io.swagger.client.model.Error
import io.swagger.client.model.PlanCotizado
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object AcuerdoApi {

  /**
   * Creación de un acuerdo 
   * 
   * Expected answers:
   *   code 200 : Seq[PlanCotizado] (Acuerdo creado)
   *   code 0 : Error (Unexpected error)
   * 
   * @param authorization Token para acceder a los servicios de Rimac.
   * @param body datos de la cotización.
   */
  def acuerdoPost(authorization: String, body: Cotizacion): ApiRequest[Seq[PlanCotizado]] =
    ApiRequest[Seq[PlanCotizado]](ApiMethods.POST, "https://rasveuswap01.azurewebsites.net/RimacChatbot/rest", "/acuerdo", "application/json")
      .withBody(body)
      .withHeaderParam("Authorization", authorization)
      .withSuccessResponse[Seq[PlanCotizado]](200)
      .withDefaultErrorResponse[Error]
        /**
   * Actualización de un acuerdo 
   * 
   * Expected answers:
   *   code 200 :  (Acuerdo actualizado)
   *   code 404 :  (Acuerdo no encontraro o inválido)
   * 
   * @param ideacuerdo Token para acceder a los servicios de Rimac.
   * @param body datos de la cotización.
   */
  def acuerdoPut(ideacuerdo: String, body: Cotizacion): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://rasveuswap01.azurewebsites.net/RimacChatbot/rest", "/acuerdo", "application/json")
      .withBody(body)
      .withHeaderParam("ideacuerdo", ideacuerdo)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Unit](404)
      

}

