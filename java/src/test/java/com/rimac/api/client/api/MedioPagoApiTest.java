package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.MedioPago;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MedioPagoApi
 */
public class MedioPagoApiTest {

    private final MedioPagoApi api = new MedioPagoApi();

    
    /**
     * 
     *
     * Busca los medios de pago de un tercero. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terceroIdeterceroMediopagoGetTest() throws ApiException {
        String idetercero = null;
        // MedioPago response = api.terceroIdeterceroMediopagoGet(idetercero);

        // TODO: test validations
    }
    
}
