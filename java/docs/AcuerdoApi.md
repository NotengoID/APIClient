# AcuerdoApi

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acuerdoPost**](AcuerdoApi.md#acuerdoPost) | **POST** /acuerdo | Vehículos
[**acuerdoPut**](AcuerdoApi.md#acuerdoPut) | **PUT** /acuerdo | Vehículos


<a name="acuerdoPost"></a>
# **acuerdoPost**
> List&lt;PlanCotizado&gt; acuerdoPost(authorization, body)

Vehículos

Creación de un acuerdo 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AcuerdoApi;


AcuerdoApi apiInstance = new AcuerdoApi();
String authorization = "authorization_example"; // String | Token para acceder a los servicios de Rimac.
Cotizacion body = new Cotizacion(); // Cotizacion | datos de la cotización.
try {
    List<PlanCotizado> result = apiInstance.acuerdoPost(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AcuerdoApi#acuerdoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Token para acceder a los servicios de Rimac. |
 **body** | [**Cotizacion**](Cotizacion.md)| datos de la cotización. |

### Return type

[**List&lt;PlanCotizado&gt;**](PlanCotizado.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="acuerdoPut"></a>
# **acuerdoPut**
> acuerdoPut(ideacuerdo, body)

Vehículos

Actualización de un acuerdo 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AcuerdoApi;


AcuerdoApi apiInstance = new AcuerdoApi();
String ideacuerdo = "ideacuerdo_example"; // String | Token para acceder a los servicios de Rimac.
Cotizacion body = new Cotizacion(); // Cotizacion | datos de la cotización.
try {
    apiInstance.acuerdoPut(ideacuerdo, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AcuerdoApi#acuerdoPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ideacuerdo** | **String**| Token para acceder a los servicios de Rimac. |
 **body** | [**Cotizacion**](Cotizacion.md)| datos de la cotización. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

