package cn.com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/z")
public class AliController
{
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

        //new Pict().pic();;
        return "z";

    }
}
