package org.example.validation;

import org.example.mediator.Request;
import org.example.validation.base.BaseRule;
import org.example.validation.results.ValidationRuleResult;

import java.util.ArrayList;
import java.util.List;

public interface Validator<T extends Request> extends BaseRule {
    void validate(T entity);
    default void invoke(final ValidationRuleResult... validationRules)  {
        List<String> errorMessages = new ArrayList<>();
        boolean exception = false;
        for (ValidationRuleResult item : validationRules) {
            if (!item.isSuccess()) {
                exception = true;
                errorMessages.add(item.getMessage());
            }
        }
        if (exception)
            throw new RuntimeException(errorMessages.get(0));
    }
}
