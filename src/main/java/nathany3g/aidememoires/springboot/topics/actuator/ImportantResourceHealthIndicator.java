/*
 * SPDX-FileCopyrightText: 2024 Nathan Young
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package nathany3g.aidememoires.springboot.topics.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Example of a custom health indicator.
 */
@Component
public class ImportantResourceHealthIndicator implements HealthIndicator {
    private final boolean available = false;

    @Override
    public Health health() {
        if (!available) {
            return Health.down().withDetail("detail", "An important resource is not currently available").build();
        }

        return Health.up().build();
    }   
}
