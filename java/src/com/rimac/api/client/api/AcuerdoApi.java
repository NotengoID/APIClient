package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.ApiClient;
import com.rimac.api.client.Configuration;
import com.rimac.api.client.Pair;

import javax.ws.rs.core.GenericType;

import com.rimac.api.client.bean.Cotizacion;
import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.PlanCotizado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-28T16:29:27.092Z")
public class AcuerdoApi {
  private ApiClient apiClient;

  public AcuerdoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AcuerdoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Acuerdo
   * Creación de un acuerdo (cotización, pólizas) 
   * @param authorization Token de acceso. (required)
   * @param body datos de la cotización. (required)
   * @return List<PlanCotizado>
   * @throws ApiException if fails to make API call
   */
  public List<PlanCotizado> acuerdoPost(String authorization, Cotizacion body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'authorization' is set
    if (authorization == null) {
      throw new ApiException(400, "Missing the required parameter 'authorization' when calling acuerdoPost");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling acuerdoPost");
    }
    
    // create path and map variables
    String localVarPath = "/acuerdo".replaceAll("\\{format\\}","json");

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
      "application/json", "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PlanCotizado>> localVarReturnType = new GenericType<List<PlanCotizado>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Acuerdo
   * Actualización de un acuerdo 
   * @param ideacuerdo Token de acceso. (required)
   * @param body datos de la cotización. (required)
   * @throws ApiException if fails to make API call
   */
  public void acuerdoPut(String ideacuerdo, Cotizacion body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ideacuerdo' is set
    if (ideacuerdo == null) {
      throw new ApiException(400, "Missing the required parameter 'ideacuerdo' when calling acuerdoPut");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling acuerdoPut");
    }
    
    // create path and map variables
    String localVarPath = "/acuerdo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (ideacuerdo != null)
      localVarHeaderParams.put("ideacuerdo", apiClient.parameterToString(ideacuerdo));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
