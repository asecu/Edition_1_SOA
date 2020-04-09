package datacollectiontask.interfaces;

import java.time.LocalDateTime;

public interface Order {
    public double sum();

    public int count();

    public LocalDateTime date();
}
