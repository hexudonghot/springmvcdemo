package cn.com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/z")
public class AliController
{

    @Autowired
    Environment environment;
    private static Logger log = LoggerFactory.getLogger(AliController.class);

    /**
     *
     * @return
     */
    @RequestMapping(value = "z")
    public String pay() throws InterruptedException
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        log.info(df.format(new Date()));
        for (final String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile - " + profileName);
        }

        //new Pict().pic();;
        return "z";

    }
}
