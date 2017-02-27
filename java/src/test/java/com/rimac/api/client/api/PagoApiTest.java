package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.bean.Pago;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagoApi
 */
public class PagoApiTest {

    private final PagoApi api = new PagoApi();

    
    /**
     * 
     *
     * Creación de un pago 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pagoPostTest() throws ApiException {
        String authorization = null;
        Pago body = null;
        // api.pagoPost(authorization, body);

        // TODO: test validations
    }
    
}
