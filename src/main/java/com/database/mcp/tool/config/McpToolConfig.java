package com.database.mcp.tool.config;

import com.database.mcp.tool.service.DatabaseToolService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpToolConfig {

    @Bean
    public ToolCallbackProvider fileAndDatabaseTools(

            DatabaseToolService databaseToolService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects( databaseToolService)
                .build();
    }
}
