package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.Vehiculo;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehculoApi
 */
public class VehculoApiTest {

    private final VehculoApi api = new VehculoApi();

    
    /**
     * Vehículos
     *
     * Los Vehículos endpoints retornan informacion sobre un vehículo dada una placa. La respuesta incluye la marca, modelo, año de fabricación y otra información relevante al vehículo. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vehiculoGetTest() throws ApiException {
        String authorization = null;
        String placa = null;
        // Vehiculo response = api.vehiculoGet(authorization, placa);

        // TODO: test validations
    }
    
}
