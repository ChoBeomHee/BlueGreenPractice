    package server.testsever;

    import org.springframework.core.env.Environment;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.Arrays;
    import java.util.List;

    @RestController
    public class ProfileController {
        private final Environment environment;


        public ProfileController(Environment environment) {
            this.environment = environment;
        }

        @GetMapping("/profile")
        public String profile() {
            return Arrays.stream(environment.getActiveProfiles())
                    .findFirst()
                    .orElse("");
        }
    }
