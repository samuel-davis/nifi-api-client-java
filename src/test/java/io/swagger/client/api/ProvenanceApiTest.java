/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.LineageEntity;
import io.swagger.client.model.ProvenanceEntity;
import io.swagger.client.model.ProvenanceOptionsEntity;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvenanceApi
 */
public class ProvenanceApiTest {

    private final ProvenanceApi api = new ProvenanceApi();

    
    /**
     * Deletes a lineage query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLineageTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        // LineageEntity response = api.deleteLineage(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Deletes a provenance query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProvenanceTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        // ProvenanceEntity response = api.deleteProvenance(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets a lineage query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLineageTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        // LineageEntity response = api.getLineage(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets a provenance query
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProvenanceTest() throws ApiException {
        String id = null;
        String clusterNodeId = null;
        // ProvenanceEntity response = api.getProvenance(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets the searchable attributes for provenance events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchOptionsTest() throws ApiException {
        // ProvenanceOptionsEntity response = api.getSearchOptions();

        // TODO: test validations
    }
    
    /**
     * Submits a lineage query
     *
     * Lineage queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the lineage request should be deleted by the client who originally submitted it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitLineageRequestTest() throws ApiException {
        LineageEntity body = null;
        // LineageEntity response = api.submitLineageRequest(body);

        // TODO: test validations
    }
    
    /**
     * Submits a provenance query
     *
     * Provenance queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the provenance request should be deleted by the client who originally submitted it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitProvenanceRequestTest() throws ApiException {
        ProvenanceEntity body = null;
        // ProvenanceEntity response = api.submitProvenanceRequest(body);

        // TODO: test validations
    }
    
}