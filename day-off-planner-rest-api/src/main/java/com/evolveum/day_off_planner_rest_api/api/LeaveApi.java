/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.evolveum.day_off_planner_rest_api.api;

import com.evolveum.day_off_planner_rest_api.model.LeaveRequestApiModel;
import com.evolveum.day_off_planner_rest_api.model.LeaveRequestCreateApiModel;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-22T13:24:41.453Z[GMT]")
@Api(value = "leave", description = "the leave API")
public interface LeaveApi {

    Logger log = LoggerFactory.getLogger(LeaveApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Create new leave request", nickname = "createLeaveRequest", notes = "", response = LeaveRequestApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "leave", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = LeaveRequestApiModel.class) })
    @RequestMapping(value = "/leave",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<LeaveRequestApiModel> createLeaveRequest(@ApiParam(value = "Object of leave request to be created" ,required=true )  @Valid @RequestBody LeaveRequestCreateApiModel body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"fromDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"leaveType\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"toDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"user\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"status\" : \"APPROVED\"\n}", LeaveRequestApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default LeaveApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get leave request by ID", nickname = "getLeaveRequestById", notes = "", response = LeaveRequestApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "leave", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LeaveRequestApiModel.class) })
    @RequestMapping(value = "/leave/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<LeaveRequestApiModel> getLeaveRequestById(@ApiParam(value = "Leave request ID",required=true) @PathVariable("id") UUID id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"fromDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"leaveType\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"toDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"user\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"status\" : \"APPROVED\"\n}", LeaveRequestApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default LeaveApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
