package Application.component;


import Application.dao.TeaInfoDao;
import Application.entity.TeaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import javax.transaction.Transactional;

@Component
public class TeaPipeline implements Pipeline {

    @Autowired
    private TeaInfoDao teaInfoDao;


    @Override
    @Transactional
    public void process(ResultItems resultItems, Task task) {
        TeaInfo teaInfo = resultItems.get("teaInfo");
        teaInfoDao.save(teaInfo);
    }
}
