package org.example.validation.base;

import org.example.validation.results.ValidationErrorRuleResult;
import org.example.validation.results.ValidationRuleResult;
import org.example.validation.results.ValidationSuccessRuleResult;

public interface BaseRule extends RuleForStrings, RuleForNumbers {

    default ValidationRuleResult notNull(Object object, String message) {
        if (object != null) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }


    default ValidationRuleResult notEmpty(String value, String message) {
        if (value.isEmpty())
            return new ValidationErrorRuleResult(message);
        return new ValidationSuccessRuleResult("");
    }
}
