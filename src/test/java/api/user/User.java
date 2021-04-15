
package api.user;

import java.util.List;

import api.model.ExternalUrls;
import api.model.Followers;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private String displayName;
    private ExternalUrls externalUrls;
    private Followers followers;
    private String href;
    private String id;
    private List<Object> images;
    private String type;
    private String uri;

}
