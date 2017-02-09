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
     * Veh&amp;iacute;culo
     *
     * Busca un vehículo a través de una placa. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vehiculoGetTest() throws ApiException {
        String authorization = "hgh";
        String placa = "LGM360";
        Vehiculo response = api.vehiculoGet(authorization, placa);
        System.out.println("response: " + response);
        System.out.println("objeto :" + response.getVEHICULOSUNARP().getClase());
        // TODO: test validations
    }
    
}
