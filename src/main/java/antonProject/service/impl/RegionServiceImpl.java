package antonProject.service.impl;

import antonProject.model.Region;
import antonProject.repository.RegionRepository;
import antonProject.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {
    private final RegionRepository regionRepository;

    @Override
    public Optional<Region> findByCode(Integer code) {
        return regionRepository.findById(code);
    }

    @Override
    public Region save(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public void deleteByCode(Integer code) {
        regionRepository.deleteById(code);
    }
}
