package com.database.mcp.tool.dto;

import java.time.LocalDateTime;

public record FileInfoDto(
        String name,
        String absolutePath,
        long sizeBytes,
        boolean isDirectory,
        boolean canRead,
        boolean canWrite,
        LocalDateTime lastModified,
        Integer lineCount
) {}
