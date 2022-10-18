package Application.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import us.codecraft.webmagic.scheduler.BloomFilterDuplicateRemover;
import us.codecraft.webmagic.scheduler.QueueScheduler;
import us.codecraft.webmagic.scheduler.Scheduler;

@Configuration
public class ComponentCreater {
    @Bean
    public Scheduler createScheduler(){
        QueueScheduler queueScheduler = new QueueScheduler();
        queueScheduler.setDuplicateRemover(new BloomFilterDuplicateRemover(10000000));
        return queueScheduler;
    }
}
