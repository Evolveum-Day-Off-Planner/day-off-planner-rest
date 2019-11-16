package com.evolveum.day_off_planner_rest.exception

import org.springframework.http.HttpStatus

class LimitExceededException(message: String) : EvolveumException(message) {
    override fun getHttpStatusCode() = HttpStatus.PRECONDITION_FAILED

    override fun getError() = "LIMIT_EXCEEDED"
}