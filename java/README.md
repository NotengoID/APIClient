# swagger-java-client

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
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AcuerdoApi;

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
*TerceroApi* | [**terceroGet**](docs/TerceroApi.md#terceroGet) | **GET** /tercero | Tercero
*TerceroApi* | [**terceroIdeterceroMediocobroGet**](docs/TerceroApi.md#terceroIdeterceroMediocobroGet) | **GET** /tercero/{idetercero}/mediocobro | Tercero
*VehculoApi* | [**vehiculoGet**](docs/VehculoApi.md#vehiculoGet) | **GET** /vehiculo | Vehículo


## Documentation for Models

 - [Cotizacion](docs/Cotizacion.md)
 - [DatoParticular](docs/DatoParticular.md)
 - [Error](docs/Error.md)
 - [ObjectoAsegurado](docs/ObjectoAsegurado.md)
 - [PlanCotizado](docs/PlanCotizado.md)
 - [Tercero](docs/Tercero.md)
 - [Vehiculo](docs/Vehiculo.md)
 - [VehiculoVEHICULOSUNARP](docs/VehiculoVEHICULOSUNARP.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



