module stocks.commons {
    requires spring.web;
    exports com.saji.stocks.pojo.selenium to stocks.selenium.connector,stocks.listener.services;
}