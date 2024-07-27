package org.example.validation.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationErrorRuleResult extends ValidationRuleResult {
    public ValidationErrorRuleResult(String message) {
        super(false, message);
    }
}
