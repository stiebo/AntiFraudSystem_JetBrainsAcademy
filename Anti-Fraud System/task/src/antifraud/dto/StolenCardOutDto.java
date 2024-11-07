package antifraud.dto;

import antifraud.validations.CardNumberConstraint;
import jakarta.validation.constraints.NotBlank;

public record StolenCardOutDto(
        Long id,
        String number
) {
}
