package com.rimac.api;

import com.rimac.ApiException;
import com.rimac.ApiClient;
import com.rimac.Configuration;
import com.rimac.Pair;

import javax.ws.rs.core.GenericType;

import bean.Error;
import bean.MedioPago;
import bean.Tercero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-10T15:02:34.206Z")
public class TerceroApi {
  private ApiClient apiClient;

  public TerceroApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TerceroApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Tercero
   * Busca un tercero a través de un tipo y número de documento de identidad. 
   * @param nrodoc Número de documento de identidad. (required)
   * @param tipodoc Tipo de documento de identidad. (optional, default to 2)
   * @return Tercero
   * @throws ApiException if fails to make API call
   */
  public Tercero terceroGet(String nrodoc, String tipodoc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'nrodoc' is set
    if (nrodoc == null) {
      throw new ApiException(400, "Missing the required parameter 'nrodoc' when calling terceroGet");
    }
    
    // create path and map variables
    String localVarPath = "/tercero".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tipodoc", tipodoc));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nrodoc", nrodoc));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Tercero> localVarReturnType = new GenericType<Tercero>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Busca los medios de pago de un tercero. 
   * @param idetercero Identificador del tercero. (required)
   * @return MedioPago
   * @throws ApiException if fails to make API call
   */
  public MedioPago terceroIdeterceroMediopagoGet(String idetercero) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'idetercero' is set
    if (idetercero == null) {
      throw new ApiException(400, "Missing the required parameter 'idetercero' when calling terceroIdeterceroMediopagoGet");
    }
    
    // create path and map variables
    String localVarPath = "/tercero/{idetercero}/mediopago".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "idetercero" + "\\}", apiClient.escapeString(idetercero.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MedioPago> localVarReturnType = new GenericType<MedioPago>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
