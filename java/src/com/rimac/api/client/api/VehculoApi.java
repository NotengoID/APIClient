package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.ApiClient;
import com.rimac.api.client.Configuration;
import com.rimac.api.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-10T16:19:28.220Z")
public class VehculoApi {
  private ApiClient apiClient;

  public VehculoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VehculoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Veh&amp;iacute;culo
   * Busca un vehículo a través de una placa. 
   * @param authorization Token de acceso. (required)
   * @param placa Placa del vehículo. (required)
   * @return Vehiculo
   * @throws ApiException if fails to make API call
   */
  public Vehiculo vehiculoGet(String authorization, String placa) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling vehiculoGet");
    }
    
    // verify the required parameter 'placa' is set
    if (placa == null) {
      throw new ApiException(400, "Missing the required parameter 'placa' when calling vehiculoGet");
    }
    
    // create path and map variables
    String localVarPath = "/vehiculo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "placa", placa));

    if (authorization != null)
      localVarHeaderParams.put("Authorization", apiClient.parameterToString(authorization));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Vehiculo> localVarReturnType = new GenericType<Vehiculo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
