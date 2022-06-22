package com.fastcampus.jpa.bookmanager.domain.listener;

import java.time.LocalDateTime;

/**
 * @author Lee Taesung
 * @since 6/22/22
 */
public interface Auditable {
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();

    void setCreatedAt(LocalDateTime createdAt);
    void setUpdatedAt(LocalDateTime updatedAt);
}
