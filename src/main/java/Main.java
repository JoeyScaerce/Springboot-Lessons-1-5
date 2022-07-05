import org.example.model.Speaker;
import org.example.services.SpeakerService;
import org.example.services.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // none Spring
        //SpeakerService service = new SpeakerServiceImpl();
        //Spring Version
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findall().get(0).getFirstname());
        System.out.println(service);

        SpeakerService service1 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service1);
    }

}
