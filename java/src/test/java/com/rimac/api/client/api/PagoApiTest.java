package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.bean.Pago;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagoApi
 */
@Ignore
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
        Pago body = null;
        api.pagoPost(body);

        // TODO: test validations
    }
    
}
