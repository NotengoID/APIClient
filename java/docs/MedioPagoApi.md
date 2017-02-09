# MedioPagoApi

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terceroIdeterceroMediopagoGet**](MedioPagoApi.md#terceroIdeterceroMediopagoGet) | **GET** /tercero/{idetercero}/mediopago | 


<a name="terceroIdeterceroMediopagoGet"></a>
# **terceroIdeterceroMediopagoGet**
> MedioPago terceroIdeterceroMediopagoGet(idetercero)



Busca los medios de pago de un tercero. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MedioPagoApi;


MedioPagoApi apiInstance = new MedioPagoApi();
String idetercero = "idetercero_example"; // String | Identificador del tercero.
try {
    MedioPago result = apiInstance.terceroIdeterceroMediopagoGet(idetercero);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MedioPagoApi#terceroIdeterceroMediopagoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idetercero** | **String**| Identificador del tercero. |

### Return type

[**MedioPago**](MedioPago.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

