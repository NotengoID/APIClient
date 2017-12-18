package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.bean.Cotizacion;
import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.PlanCotizado;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AcuerdoApi
 */
@Ignore
public class AcuerdoApiTest {

    private final AcuerdoApi api = new AcuerdoApi();

    
    /**
     * Acuerdo
     *
     * Creación de un acuerdo (cotización, pólizas) 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acuerdoPostTest() throws ApiException {
        String authorization = null;
        Cotizacion body = null;
        List<PlanCotizado> response = api.acuerdoPost(authorization, body);

        // TODO: test validations
    }
    
    /**
     * Acuerdo
     *
     * Actualización de un acuerdo 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acuerdoPutTest() throws ApiException {
        String ideacuerdo = null;
        Cotizacion body = null;
        api.acuerdoPut(ideacuerdo, body);

        // TODO: test validations
    }
    
}
