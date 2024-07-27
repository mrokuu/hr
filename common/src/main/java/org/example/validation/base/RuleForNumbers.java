package org.example.validation.base;

import org.example.validation.results.ValidationErrorRuleResult;
import org.example.validation.results.ValidationRuleResult;
import org.example.validation.results.ValidationSuccessRuleResult;

public interface RuleForNumbers {

    default ValidationRuleResult graderThan(Number value, Number target, String message) {
        if (value.doubleValue() > target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult graderThanOrEquals(Number value, Number target, String message) {
        if (value.doubleValue() >= target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult lessThan(Number value, Number target, String message) {
        if (value.doubleValue() < target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }

    default ValidationRuleResult lessThanOrEquals(Number value, Number target, String message) {
        if (value.doubleValue() <= target.doubleValue()) {
            return new ValidationSuccessRuleResult("");
        }
        return new ValidationErrorRuleResult(message);
    }
}
