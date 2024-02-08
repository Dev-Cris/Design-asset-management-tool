package gubodev.digital_asset_manager.controller;

import gubodev.digital_asset_manager.dto.request.DigitalAssetCreateRequest;
import gubodev.digital_asset_manager.dto.response.DigitalAssetCreateResponse;
import gubodev.digital_asset_manager.service.DigitalAssetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/digitalAsset")
@Slf4j
public class DigitalAssetController {

    private final DigitalAssetService digitalAssetService;

    @Autowired
    private DigitalAssetController(DigitalAssetService digitalAssetService) {
        this.digitalAssetService = digitalAssetService;
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<DigitalAssetCreateResponse> uploadFile(@RequestBody DigitalAssetCreateRequest request) {
        log.info("HTTP POST type request to api/digitalAsset/upload");
        DigitalAssetCreateResponse result = digitalAssetService.uploadFile(request);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
