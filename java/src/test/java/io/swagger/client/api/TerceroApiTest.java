package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Error;
import io.swagger.client.model.Tercero;
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
     * Tercero
     *
     * Busca un tercero a través de un tipo y número de documento de identidad. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void terceroIdeterceroMediocobroGetTest() throws ApiException {
        String idetercero = null;
        // Tercero response = api.terceroIdeterceroMediocobroGet(idetercero);

        // TODO: test validations
    }
    
}
