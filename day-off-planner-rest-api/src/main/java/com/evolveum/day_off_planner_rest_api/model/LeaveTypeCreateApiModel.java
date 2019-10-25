package com.evolveum.day_off_planner_rest_api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LeaveTypeCreateApiModel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-10-25T08:08:46.968Z[GMT]")
public class LeaveTypeCreateApiModel   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("approvalNeeded")
  private Boolean approvalNeeded = false;

  @JsonProperty("limited")
  private Boolean limited = false;

  @JsonProperty("defaultLimitHours")
  private Integer defaultLimitHours = null;

  public LeaveTypeCreateApiModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeaveTypeCreateApiModel approvalNeeded(Boolean approvalNeeded) {
    this.approvalNeeded = approvalNeeded;
    return this;
  }

  /**
   * Get approvalNeeded
   * @return approvalNeeded
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Boolean isApprovalNeeded() {
    return approvalNeeded;
  }

  public void setApprovalNeeded(Boolean approvalNeeded) {
    this.approvalNeeded = approvalNeeded;
  }

  public LeaveTypeCreateApiModel limited(Boolean limited) {
    this.limited = limited;
    return this;
  }

  /**
   * Get limited
   * @return limited
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public Boolean isLimited() {
    return limited;
  }

  public void setLimited(Boolean limited) {
    this.limited = limited;
  }

  public LeaveTypeCreateApiModel defaultLimitHours(Integer defaultLimitHours) {
    this.defaultLimitHours = defaultLimitHours;
    return this;
  }

  /**
   * Get defaultLimitHours
   * @return defaultLimitHours
  **/
  @ApiModelProperty(value = "")

  public Integer getDefaultLimitHours() {
    return defaultLimitHours;
  }

  public void setDefaultLimitHours(Integer defaultLimitHours) {
    this.defaultLimitHours = defaultLimitHours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveTypeCreateApiModel leaveTypeCreateApiModel = (LeaveTypeCreateApiModel) o;
    return Objects.equals(this.name, leaveTypeCreateApiModel.name) &&
        Objects.equals(this.approvalNeeded, leaveTypeCreateApiModel.approvalNeeded) &&
        Objects.equals(this.limited, leaveTypeCreateApiModel.limited) &&
        Objects.equals(this.defaultLimitHours, leaveTypeCreateApiModel.defaultLimitHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, approvalNeeded, limited, defaultLimitHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveTypeCreateApiModel {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    approvalNeeded: ").append(toIndentedString(approvalNeeded)).append("\n");
    sb.append("    limited: ").append(toIndentedString(limited)).append("\n");
    sb.append("    defaultLimitHours: ").append(toIndentedString(defaultLimitHours)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
