package gubodev.digital_asset_manager.service;

import lombok.NoArgsConstructor;
import org.apache.http.entity.FileEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@NoArgsConstructor
public class FileUploadService {

    private FileEntity fileEntity;

}
