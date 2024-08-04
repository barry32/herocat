package com.hero.webapp;

import com.hero.herocat.HeroCat;
//规范： 你写的Servlet必须在指定目录下： com\hero\webapp

//e.g: localhost:8080/xx/dd/UserServlet?name=111
public class HerocatAppApplication {

    public static void main(String[] args) throws Exception {
        HeroCat.run(args);
    }

}
