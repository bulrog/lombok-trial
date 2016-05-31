import lombok.Data;
import lombok.NonNull;

@Data(staticConstructor = "of")
public class LombokPojoVO {
    @NonNull private final String trial;
    private int count;
}
