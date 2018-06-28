package example.micronaut;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.context.annotation.Requires;
import lombok.Data;

@ConfigurationProperties(BintrayConfiguration.PREFIX)
@Requires(property = BintrayConfiguration.PREFIX)
@Data
public class BintrayConfiguration {

    public static final String PREFIX = "bintray";
    public static final String BINTRAY_API_URL = "https://bintray.com";

    private String apiversion;

    private String organization;

    private String repository;

    private String username;

    private String token;

}
