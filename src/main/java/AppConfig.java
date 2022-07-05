import org.example.model.Speaker;
import org.example.repo.HibernateSpeakerRepoImpl;
import org.example.repo.SpeakerRepo;
import org.example.services.SpeakerService;
import org.example.services.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"org.example"})
public class AppConfig {

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepo());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //service.setRepo(getSpeakerRepo());
        return service;
    }


    @Bean(name = "speakerRepo")
    public SpeakerRepo getSpeakerRepo() {
        return new HibernateSpeakerRepoImpl();
    }
    */
     
}
