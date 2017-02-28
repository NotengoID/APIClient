package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.ApiClient;
import com.rimac.api.client.Configuration;
import com.rimac.api.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.MedioPago;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T17:01:59.859Z")
public class MedioPagoApi {
  private ApiClient apiClient;

  public MedioPagoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MedioPagoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
