package com.rimac.api;

import com.rimac.ApiException;
import bean.Error;
import bean.MedioPago;
import bean.Tercero;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TerceroApi
 */
public class TerceroApiTest {

    private final TerceroApi api = new TerceroApi();

    
    /**
     * Tercero
     *
     * Busca un tercero a través de un tipo y número de documento de identidad. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terceroGetTest() throws ApiException {
        String nrodoc = null;
        String tipodoc = null;
        // Tercero response = api.terceroGet(nrodoc, tipodoc);

        // TODO: test validations
    }
    
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
