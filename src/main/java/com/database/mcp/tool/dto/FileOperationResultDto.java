package com.database.mcp.tool.dto;

public record FileOperationResultDto(
        boolean success,
        String operation,
        String filePath,
        String message,
        Object details
) {}
