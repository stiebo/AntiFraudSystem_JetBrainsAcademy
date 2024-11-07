package antifraud.dto;

import antifraud.validations.CardNumberConstraint;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.LuhnCheck;

public record StolenCardInDto(
        @NotBlank
        //@LuhnCheck  (For demo purposes, use a custom constraint.)
        @CardNumberConstraint
        String number
) {
}
