# VehculoApi

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vehiculoGet**](VehculoApi.md#vehiculoGet) | **GET** /vehiculo | Veh&amp;iacute;culo


<a name="vehiculoGet"></a>
# **vehiculoGet**
> Vehiculo vehiculoGet(authorization, placa)

Veh&amp;iacute;culo

Busca un vehículo a través de una placa. 

### Example
```java
// Import classes:
//import com.rimac.api.ApiException;
//import com.rimac.api.client.VehculoApi;


VehculoApi apiInstance = new VehculoApi();
String authorization = "Beared TestNoToken"; // String | Token de acceso.
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
 **authorization** | **String**| Token de acceso. | [default to Beared TestNoToken]
 **placa** | **String**| Placa del vehículo. |

### Return type

[**Vehiculo**](Vehiculo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

