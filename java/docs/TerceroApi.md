# TerceroApi

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terceroGet**](TerceroApi.md#terceroGet) | **GET** /tercero | Tercero
[**terceroIdeterceroMediocobroGet**](TerceroApi.md#terceroIdeterceroMediocobroGet) | **GET** /tercero/{idetercero}/mediocobro | Tercero


<a name="terceroGet"></a>
# **terceroGet**
> Tercero terceroGet(nrodoc, tipodoc)

Tercero

Busca un tercero a través de un tipo y número de documento de identidad. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TerceroApi;


TerceroApi apiInstance = new TerceroApi();
String nrodoc = "nrodoc_example"; // String | Número de documento de identidad.
String tipodoc = "2"; // String | Tipo de documento de identidad.
try {
    Tercero result = apiInstance.terceroGet(nrodoc, tipodoc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TerceroApi#terceroGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nrodoc** | **String**| Número de documento de identidad. |
 **tipodoc** | **String**| Tipo de documento de identidad. | [optional] [default to 2]

### Return type

[**Tercero**](Tercero.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terceroIdeterceroMediocobroGet"></a>
# **terceroIdeterceroMediocobroGet**
> Tercero terceroIdeterceroMediocobroGet(idetercero)

Tercero

Busca un tercero a través de un tipo y número de documento de identidad. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TerceroApi;


TerceroApi apiInstance = new TerceroApi();
String idetercero = "idetercero_example"; // String | Tipo de documento de identidad.
try {
    Tercero result = apiInstance.terceroIdeterceroMediocobroGet(idetercero);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TerceroApi#terceroIdeterceroMediocobroGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idetercero** | **String**| Tipo de documento de identidad. |

### Return type

[**Tercero**](Tercero.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

