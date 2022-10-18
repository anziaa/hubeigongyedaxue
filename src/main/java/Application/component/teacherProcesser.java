package Application.component;

import Application.entity.TeaInfo;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;
import us.codecraft.webmagic.selector.Selectable;
import us.codecraft.webmagic.selector.Selector;

import java.util.List;

@Component
public class teacherProcesser implements PageProcessor {

    @Override
    public void process(Page page) {
        Html html =page.getHtml();
        List<String> links =html.css("div.article_content").links().all();
        page.addTargetRequests(links);
        page.getResultItems().setSkip(true);
        if(links.size()==0){
        parseTeaInfo(page);}



    }

    private void parseTeaInfo(Page page) {
        Html html = page.getHtml();
        String name = html.css("div.article_tit","text").get();
        System.out.println(name);

        List<Selectable> Info = html.css("div.v_news_content p","text").nodes();
        System.out.println(Info);

    }


    @Override
    public Site getSite() {
        return Site.me();
    }
}
