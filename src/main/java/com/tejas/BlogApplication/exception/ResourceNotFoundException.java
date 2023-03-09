package com.tejas.BlogApplication.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String user, String id, String userId) {
        String resourceName;
        String fieldName;
        long fieldValue;
    }
}
