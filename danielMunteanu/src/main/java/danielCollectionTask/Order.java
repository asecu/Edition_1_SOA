package danielCollectionTask;

import java.time.LocalDateTime;
import java.util.List;

public interface Order {
    double sum();

    double sum(List<Item> items);

    int count();

    LocalDateTime date();
}