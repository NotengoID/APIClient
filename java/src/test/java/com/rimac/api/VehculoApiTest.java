package com.rimac.api;

import com.rimac.ApiException;
import bean.Error;
import bean.Vehiculo;
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
     * Veh&amp;iacute;culo
     *
     * Busca un vehículo a través de una placa. 
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
