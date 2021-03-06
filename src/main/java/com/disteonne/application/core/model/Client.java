package com.disteonne.application.core.model;

import com.disteonne.application.core.ApiConstants;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;
@Builder(toBuilder = true)
public record Client(String name, Integer age, List<String> emails, LocalDate lastLoginDate, LocalDate lastAnalysisDate,
                     ApiConstants.Roles role) {
}
