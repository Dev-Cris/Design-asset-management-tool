package gubodev.digital_asset_manager.domain;

import gubodev.digital_asset_manager.enums.ProductCategory;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DigitalAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String contentType;

    private String fileUrl;

    private long fileSize;

    @OneToMany(mappedBy = "digitalAsset")
    private List<Tag> tags;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ProductCategory> productCategories;

}
