package com.database.mcp.tool.repository;

import com.database.mcp.tool.entity.FileRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRecordRepository extends JpaRepository<FileRecordEntity, Long> {

    List<FileRecordEntity> findByStatusIgnoreCase(String status);

    List<FileRecordEntity> findByFileNameContainingIgnoreCase(String fileName);

    List<FileRecordEntity> findByFilePath(String filePath);
}
