-- Database initialization script for PostgreSQL MCP Server
-- Automatically executed on container startup if mounted to /docker-entrypoint-initdb.d/init.sql

CREATE TABLE IF NOT EXISTS file_records (
    id BIGSERIAL PRIMARY KEY,
    file_path VARCHAR(255) NOT NULL,
    file_name VARCHAR(255),
    file_size BIGINT,
    status VARCHAR(255),
    content_summary TEXT,
    metadata_json TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Indexes for optimized querying
CREATE INDEX IF NOT EXISTS idx_file_records_status ON file_records (status);
CREATE INDEX IF NOT EXISTS idx_file_records_file_name ON file_records (file_name);
