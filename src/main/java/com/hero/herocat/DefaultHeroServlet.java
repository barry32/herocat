package com.hero.herocat;

import com.hero.servlet.HeroRequest;
import com.hero.servlet.HeroResponse;
import com.hero.servlet.HeroServlet;

/**
 * HeroCat中对Servlet规范的默认实现
 */
public class DefaultHeroServlet extends HeroServlet {


    @Override
    public void doGet(HeroRequest request, HeroResponse response) throws
            Exception {
        String uri = request.getUri();
        String name = uri.substring(0, uri.indexOf("?"));
        response.write("404 - no this servlet : " + name);
    }

    @Override
    public void doPost(HeroRequest request, HeroResponse response) throws
            Exception {
        doGet(request, response);
    }

}
