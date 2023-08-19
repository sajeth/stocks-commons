module stocks.commons {
//    requires spring.core;
//    requires spring.beans;
    requires com.fasterxml.jackson.databind;
  //  requires lombok;
    requires spring.web;
    exports com.saji.stocks.pojo.selenium to stocks.selenium.connector, stocks.listener.services;
    exports com.saji.stocks.rest to stocks.listener.services, com.fasterxml.jackson.databind;
    opens com.saji.stocks.rest to com.fasterxml.jackson.databind;
    exports com.saji.stocks.rest.builder to stocks.listener.services;
}