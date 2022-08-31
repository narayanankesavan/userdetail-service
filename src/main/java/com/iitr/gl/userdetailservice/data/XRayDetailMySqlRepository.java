package com.iitr.gl.userdetailservice.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface XRayDetailMySqlRepository extends JpaRepository<XRayDetailEntity, Long> {
    XRayDetailEntity findByXrayIdAndUserId(String xrayId, String userId);

    void deleteByXrayId(String xrayId);

    List<XRayDetailEntity> findByUserId(String userId);

    void deleteByUserId(String userId);
}
