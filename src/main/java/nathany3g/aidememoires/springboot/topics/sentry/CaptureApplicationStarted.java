package nathany3g.aidememoires.springboot.topics.sentry;

import static io.sentry.SentryLevel.INFO;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import io.sentry.Sentry;

@Component
public class CaptureApplicationStarted implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        Sentry.captureMessage("The application has started", INFO);
    }
}
