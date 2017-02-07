# VehculoApi

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vehiculoGet**](VehculoApi.md#vehiculoGet) | **GET** /vehiculo | Vehículos


<a name="vehiculoGet"></a>
# **vehiculoGet**
> Vehiculo vehiculoGet(authorization, placa)

Vehículos

Los Vehículos endpoints retornan informacion sobre un vehículo dada una placa. La respuesta incluye la marca, modelo, año de fabricación y otra información relevante al vehículo. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VehculoApi;


VehculoApi apiInstance = new VehculoApi();
String authorization = "authorization_example"; // String | Token para acceder a los servicios de Rimac.
String placa = "placa_example"; // String | Placa del vehículo.
try {
    Vehiculo result = apiInstance.vehiculoGet(authorization, placa);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VehculoApi#vehiculoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Token para acceder a los servicios de Rimac. |
 **placa** | **String**| Placa del vehículo. |

### Return type

[**Vehiculo**](Vehiculo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

