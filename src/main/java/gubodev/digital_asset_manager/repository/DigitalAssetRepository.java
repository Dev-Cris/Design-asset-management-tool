package gubodev.digital_asset_manager.repository;

import gubodev.digital_asset_manager.domain.DigitalAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitalAssetRepository extends JpaRepository<DigitalAsset, Long> {
}
