package theJava8.one;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1, "spring boot", true));
        springClass.add(new OnlineClass(2, "rest api development", false));

        Optional<OnlineClass> optional = springClass.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        /*
        if (optional.isPresent()) {
            OnlineClass onlineClass = optional.get();
            boolean present = optional.isPresent();
            System.out.println(present);
            System.out.println(onlineClass.getTitle());
        } else {
            optional.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Not found"));
        }
        */

        // optional.ifPresent(oc -> System.out.println(oc.getTitle()));
        // OnlineClass onlineClass = optional.orElse(createNewClass());    // instance 가 넘어온다.
        OnlineClass onlineClass = optional.orElseGet(App::createNewClass);
        System.out.println(onlineClass.getTitle());

    }

    private static OnlineClass createNewClass() {
        System.out.println("creating new online class");
        return new OnlineClass(10, "new create class", false);
    }
}
