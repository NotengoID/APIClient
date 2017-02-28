# PagoApi

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pagoPost**](PagoApi.md#pagoPost) | **POST** /pago | 


<a name="pagoPost"></a>
# **pagoPost**
> pagoPost(body)



Creación de un pago 

### Example
```java
// Import classes:
//import com.rimac.api.client.ApiException;
//import com.rimac.api.client.api.PagoApi;


PagoApi apiInstance = new PagoApi();
Pago body = new Pago(); // Pago | datos del pago.
try {
    apiInstance.pagoPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PagoApi#pagoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Pago**](Pago.md)| datos del pago. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

