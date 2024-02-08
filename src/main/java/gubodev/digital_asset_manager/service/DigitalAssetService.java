package gubodev.digital_asset_manager.service;

import gubodev.digital_asset_manager.dto.request.DigitalAssetCreateRequest;
import gubodev.digital_asset_manager.dto.response.DigitalAssetCreateResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class DigitalAssetService {

    private final ModelMapper modelMapper;

    public DigitalAssetCreateResponse uploadFile(DigitalAssetCreateRequest request) {
        MultipartFile file = request.getFile();
        DigitalAssetCreateResponse result = modelMapper.map(request, DigitalAssetCreateResponse.class);
        result.setFileName(file.getName());
        System.out.println("Lol");
        return result;
    }


}
