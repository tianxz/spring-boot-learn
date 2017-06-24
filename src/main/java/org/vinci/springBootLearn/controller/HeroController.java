package org.vinci.springBootLearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.vinci.springBootLearn.domain.HeroDomain;
import org.vinci.springBootLearn.utils.SnowflakeUtil;

/**
 * Created by Jao on 2017/6/24.
 */
@Controller
@RequestMapping("/hero")
public class HeroController {

    @RequestMapping(value = "/me.json", method = RequestMethod.GET)
    @ResponseBody
    public HeroDomain getHeroSuffixJson() {
        HeroDomain hero = new HeroDomain();
        hero.setId(SnowflakeUtil.next());
        hero.setLobNumber(79101);
        hero.setEmailAddress("oc.mt@hotmail.com");
        hero.setTelNumber("02988328736");
        hero.setPhoneNumber("13088871919");

        return hero;
    }
}
