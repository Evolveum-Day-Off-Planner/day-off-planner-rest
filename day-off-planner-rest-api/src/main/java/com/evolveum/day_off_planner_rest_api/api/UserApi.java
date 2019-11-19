/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.evolveum.day_off_planner_rest_api.api;

import com.evolveum.day_off_planner_rest_api.model.CarryoverApiModel;
import com.evolveum.day_off_planner_rest_api.model.LimitApiModel;
import com.evolveum.day_off_planner_rest_api.model.PasswordChangeApiModel;
import com.evolveum.day_off_planner_rest_api.model.PasswordResetApiModel;
import com.evolveum.day_off_planner_rest_api.model.RequestedHoursApiModel;
import java.util.UUID;
import com.evolveum.day_off_planner_rest_api.model.UserApiModel;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-11-19T16:35:41.943Z[GMT]")
@Api(value = "user", description = "the user API")
public interface UserApi {

    Logger log = LoggerFactory.getLogger(UserApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Change user password", nickname = "changePassword", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 403, message = "Invalid password") })
    @RequestMapping(value = "/user/changePassword",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> changePassword(@ApiParam(value = "User old and new password" ,required=true )  @Valid @RequestBody PasswordChangeApiModel body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get all users", nickname = "getAllUsers", notes = "", response = UserApiModel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserApiModel.class, responseContainer = "List") })
    @RequestMapping(value = "/user/getAll",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<UserApiModel>> getAllUsers() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"phone\" : \"phone\",\n  \"admin\" : false,\n  \"approvers\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\n  \"jobDescription\" : \"jobDescription\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"email\" : \"\",\n  \"supervisor\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}, {\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"phone\" : \"phone\",\n  \"admin\" : false,\n  \"approvers\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\n  \"jobDescription\" : \"jobDescription\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"email\" : \"\",\n  \"supervisor\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user carryover for specified leave type and year", nickname = "getCarryover", notes = "", response = CarryoverApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CarryoverApiModel.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/user/{userId}/carryover/{leaveTypeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CarryoverApiModel> getCarryover(@ApiParam(value = "User ID",required=true) @PathVariable("userId") UUID userId,@ApiParam(value = "ID of the leave type",required=true) @PathVariable("leaveTypeId") UUID leaveTypeId,@ApiParam(value = "Year (current year if not specified)") @Valid @RequestParam(value = "year", required = false) Integer year) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"leaveType\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"year\" : 0,\n  \"carryover\" : 6,\n  \"user\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", CarryoverApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user individual limit", nickname = "getLimit", notes = "", response = LimitApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = LimitApiModel.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/user/{userId}/limit/{leaveTypeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<LimitApiModel> getLimit(@ApiParam(value = "User ID",required=true) @PathVariable("userId") UUID userId,@ApiParam(value = "ID of the leave type",required=true) @PathVariable("leaveTypeId") UUID leaveTypeId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"leaveType\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"limit\" : 0,\n  \"user\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", LimitApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get currently logged user", nickname = "getLoggedUser", notes = "", response = UserApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserApiModel.class) })
    @RequestMapping(value = "/user/me",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<UserApiModel> getLoggedUser() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"phone\" : \"phone\",\n  \"admin\" : false,\n  \"approvers\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\n  \"jobDescription\" : \"jobDescription\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"email\" : \"\",\n  \"supervisor\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", UserApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user requested hours for specified leave type and year", nickname = "getRequestedHours", notes = "", response = RequestedHoursApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RequestedHoursApiModel.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/user/{userId}/requestedHours/{leaveTypeId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<RequestedHoursApiModel> getRequestedHours(@ApiParam(value = "User ID",required=true) @PathVariable("userId") UUID userId,@ApiParam(value = "ID of the leave type",required=true) @PathVariable("leaveTypeId") UUID leaveTypeId,@ApiParam(value = "Year (current year if not specified)") @Valid @RequestParam(value = "year", required = false) Integer year) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"leaveType\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"year\" : 0,\n  \"requestedHours\" : 6,\n  \"user\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", RequestedHoursApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get user by ID", nickname = "getUserById", notes = "", response = UserApiModel.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserApiModel.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/user/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<UserApiModel> getUserById(@ApiParam(value = "User ID",required=true) @PathVariable("id") UUID id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"firstName\" : \"firstName\",\n  \"lastName\" : \"lastName\",\n  \"phone\" : \"phone\",\n  \"admin\" : false,\n  \"approvers\" : [ \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" ],\n  \"jobDescription\" : \"jobDescription\",\n  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"email\" : \"\",\n  \"supervisor\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"\n}", UserApiModel.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Get if user with given ID is approver/supervisor of some other user", nickname = "isApprover", notes = "", response = Boolean.class, authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/user/{id}/isApprover",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Boolean> isApprover(@ApiParam(value = "User ID",required=true) @PathVariable("id") UUID id) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("true", Boolean.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Reset user password", nickname = "resetPassword", notes = "", authorizations = {
        @Authorization(value = "bearerAuth")    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "Accepted"),
        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(value = "/user/resetPassword",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> resetPassword(@ApiParam(value = "User email" ,required=true )  @Valid @RequestBody PasswordResetApiModel body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default UserApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
