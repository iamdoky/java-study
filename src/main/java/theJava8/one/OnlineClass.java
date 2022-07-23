package theJava8.one;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class OnlineClass {
    private Integer id;
    private String title;
    private boolean close;
    public Progress progress;

    public OnlineClass(Integer id, String title, boolean close) {
        this.id = id;
        this.title = title;
        this.close = close;
    }
}
