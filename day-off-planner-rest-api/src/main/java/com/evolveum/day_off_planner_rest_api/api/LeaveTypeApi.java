/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.evolveum.day_off_planner_rest_api.api;

import com.evolveum.day_off_planner_rest_api.model.LeaveTypeApiModel;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-25T08:08:46.968Z[GMT]")
@Api(value = "leaveType", description = "the leaveType API")
public interface LeaveTypeApi {

    Logger log = LoggerFactory.getLogger(LeaveTypeApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Get all leave types", nickname = "getAllLeaveTypes", notes = "", response = LeaveTypeApiModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "leaveType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LeaveTypeApiModel.class, responseContainer = "List") })
    @RequestMapping(value = "/leaveType/getAll",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<LeaveTypeApiModel>> getAllLeaveTypes() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\n  \"approvalNeeded\" : false,\n  \"limited\" : false,\n  \"name\" : \"name\",\n  \"defaultLimitHours\" : 0,\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}, {\n  \"approvalNeeded\" : false,\n  \"limited\" : false,\n  \"name\" : \"name\",\n  \"defaultLimitHours\" : 0,\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default LeaveTypeApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get leave type by ID", nickname = "getLeaveTypeById", notes = "", response = LeaveTypeApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "leaveType", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LeaveTypeApiModel.class) })
    @RequestMapping(value = "/leaveType/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<LeaveTypeApiModel> getLeaveTypeById(@ApiParam(value = "Leave type ID",required=true) @PathVariable("id") UUID id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"approvalNeeded\" : false,\n  \"limited\" : false,\n  \"name\" : \"name\",\n  \"defaultLimitHours\" : 0,\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", LeaveTypeApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default LeaveTypeApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
