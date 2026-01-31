package co.rounddigital.app.confi;

import co.rounddigital.app.model.AutoInsurance;
import co.rounddigital.app.model.BudledInurance;
import co.rounddigital.app.model.HomeInsurance;
import co.rounddigital.app.service.QuoteService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@PropertySource("classpath:insurance.properties")
public class AppConfig {

    @Value("${name}")
    private String name;

    @Bean
    public AutoInsurance autoInsurance() {
        return new AutoInsurance();
    }

    @Bean
    @Scope("prototype")
    public HomeInsurance homeInsurance() {
        return new HomeInsurance();
    }

    @Bean
    public BudledInurance budledInurance() {
        return new BudledInurance();
    }

    @Bean(name = "baseQuoteService",initMethod = "initQuote", destroyMethod = "destroyQuote")
    @Scope("prototype")
    public QuoteService quoteService() {
        QuoteService service =  new QuoteService();
        service.setName(name);
        service.setInsurance(budledInurance());
        return service;
    }



}
