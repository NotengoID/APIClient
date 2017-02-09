package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.Error;
import io.swagger.client.model.Tercero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-09T21:37:20.735Z")
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
   * Tercero
   * Busca un tercero a través de un tipo y número de documento de identidad. 
   * @param idetercero Tipo de documento de identidad. (required)
   * @return Tercero
   * @throws ApiException if fails to make API call
   */
  public Tercero terceroIdeterceroMediocobroGet(String idetercero) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'idetercero' is set
    if (idetercero == null) {
      throw new ApiException(400, "Missing the required parameter 'idetercero' when calling terceroIdeterceroMediocobroGet");
    }
    
    // create path and map variables
    String localVarPath = "/tercero/{idetercero}/mediocobro".replaceAll("\\{format\\}","json")
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

    GenericType<Tercero> localVarReturnType = new GenericType<Tercero>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
