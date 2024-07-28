package org.example.dto;

import lombok.Builder;
import org.example.vo.Name;

import java.util.UUID;

@Builder
public record UserDto(
        UUID id,
        Name name
) {
}
