package com.bittercode.constant;

import java.util.Arrays;
import java.util.Optional;

public enum ErrorCodes {

    PAGE_NOT_FOUND(404, "The Page You are Searching For is Not available"),
    ACCESS_DENIED(403, "Please Login First to continue"),
    BAD_REQUEST(400, "Bad Request, Please Try Again"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error, Try Again!!"),
    DATABASE_CONNECTION_FAILURE(406,
            "Unable to Connect to DB, Please Check your db credentials in application.properties"),
    METHOD_NOT_ALLOWED(405, "Requested HTTP method is not supported by this URL"),

    ;

    private final String message;
    private final int code;

    ErrorCodes(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }

    // Reverse lookup methods
    public static Optional<ErrorCodes> getMessageByStatusCode(int statusCode) {
        return Arrays.stream(ErrorCodes.values())
                .filter(error -> error.getCode() == statusCode)
                .findFirst();
    }
}
