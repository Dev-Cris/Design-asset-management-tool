package gubodev.digital_asset_manager.domain;

import gubodev.digital_asset_manager.enums.ProductCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Digital_Assets")
public class DigitalAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String contentType;

    private String fileUrl;

    private long fileSize;

    @OneToMany(mappedBy = "tag")
    private List<Tag> tags;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ProductCategory> productCategories;

}
