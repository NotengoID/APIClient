package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.ApiClient;
import com.rimac.api.client.Configuration;
import com.rimac.api.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rimac.api.client.bean.Pago;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T16:29:27.092Z")
public class PagoApi {
  private ApiClient apiClient;

  public PagoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PagoApi(ApiClient apiClient) {
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
   * Creación de un pago 
   * @param authorization Token de acceso. (required)
   * @param body datos del pago. (required)
   * @throws ApiException if fails to make API call
   */
  public void pagoPost(String authorization, Pago body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling pagoPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pagoPost");
    }
    
    // create path and map variables
    String localVarPath = "/pago".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
