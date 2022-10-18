package Application.dao;

import Application.entity.TeaInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaInfoDao extends JpaRepository<TeaInfo,Long> {

}
