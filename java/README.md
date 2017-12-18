# rimac-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.rimac.api</groupId>
    <artifactId>rimac-client</artifactId>
    <version>1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.rimac.api:rimac-client:1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rimac-client-1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.rimac.api.client.*;
import com.rimac.api.client.auth.*;
import com.rimac.api.client.bean.*;
import com.rimac.api.client.api.AcuerdoApi;

import java.io.File;
import java.util.*;

public class AcuerdoApiExample {

    public static void main(String[] args) {
        
        AcuerdoApi apiInstance = new AcuerdoApi();
        String authorization = "Beared TestNoToken"; // String | Token de acceso.
        Cotizacion body = new Cotizacion(); // Cotizacion | datos de la cotización.
        try {
            List<PlanCotizado> result = apiInstance.acuerdoPost(authorization, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AcuerdoApi#acuerdoPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://rasveuswap01.azurewebsites.net/RimacChatbot/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AcuerdoApi* | [**acuerdoPost**](docs/AcuerdoApi.md#acuerdoPost) | **POST** /acuerdo | Acuerdo
*AcuerdoApi* | [**acuerdoPut**](docs/AcuerdoApi.md#acuerdoPut) | **PUT** /acuerdo | Acuerdo
*MedioPagoApi* | [**terceroIdeterceroMediopagoGet**](docs/MedioPagoApi.md#terceroIdeterceroMediopagoGet) | **GET** /tercero/{idetercero}/mediopago | Búsqueda de medios de pago de un tercero
*PagoApi* | [**pagoPost**](docs/PagoApi.md#pagoPost) | **POST** /pago | 
*TerceroApi* | [**terceroGet**](docs/TerceroApi.md#terceroGet) | **GET** /tercero | Búsqueda de terceros
*TerceroApi* | [**terceroIdeterceroMediopagoGet**](docs/TerceroApi.md#terceroIdeterceroMediopagoGet) | **GET** /tercero/{idetercero}/mediopago | Búsqueda de medios de pago de un tercero
*VehculoApi* | [**vehiculoGet**](docs/VehculoApi.md#vehiculoGet) | **GET** /vehiculo | Veh&amp;iacute;culo


## Documentation for Models

 - [Cotizacion](docs/Cotizacion.md)
 - [DatoParticular](docs/DatoParticular.md)
 - [Error](docs/Error.md)
 - [Financimiento](docs/Financimiento.md)
 - [FormaCobro](docs/FormaCobro.md)
 - [MedioPago](docs/MedioPago.md)
 - [ObjectoAsegurado](docs/ObjectoAsegurado.md)
 - [OrdenEntrega](docs/OrdenEntrega.md)
 - [Pago](docs/Pago.md)
 - [Participante](docs/Participante.md)
 - [PlanCotizado](docs/PlanCotizado.md)
 - [Tercero](docs/Tercero.md)
 - [UnidadRiesgo](docs/UnidadRiesgo.md)
 - [Vehiculo](docs/Vehiculo.md)
 - [VehiculoVEHICULOSUNARP](docs/VehiculoVEHICULOSUNARP.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



