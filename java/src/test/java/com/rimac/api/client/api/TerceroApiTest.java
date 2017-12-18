package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.MedioPago;
import com.rimac.api.client.bean.Tercero;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TerceroApi
 */
@Ignore
public class TerceroApiTest {

    private final TerceroApi api = new TerceroApi();

    
    /**
     * Búsqueda de terceros
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
        Tercero response = api.terceroGet(nrodoc, tipodoc);

        // TODO: test validations
    }
    
    /**
     * Búsqueda de medios de pago de un tercero
     *
     * Busca los medios de pago de un tercero. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terceroIdeterceroMediopagoGetTest() throws ApiException {
        String idetercero = null;
        MedioPago response = api.terceroIdeterceroMediopagoGet(idetercero);

        // TODO: test validations
    }
    
}
