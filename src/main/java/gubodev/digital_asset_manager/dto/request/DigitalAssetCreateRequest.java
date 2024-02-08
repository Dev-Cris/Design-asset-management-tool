package gubodev.digital_asset_manager.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
public class DigitalAssetCreateRequest {

    private MultipartFile file;
    private String tagName;

}
