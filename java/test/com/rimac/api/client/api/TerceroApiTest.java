package com.rimac.api.client.api;

import com.rimac.api.client.ApiException;
import com.rimac.api.client.bean.Error;
import com.rimac.api.client.bean.MedioPago;
import com.rimac.api.client.bean.Tercero;
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
        String nrodoc = "44468881";
        String tipodoc = "2";
        Tercero response = api.terceroGet(nrodoc, tipodoc);
        System.out.println(response.getIdetercero());
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
