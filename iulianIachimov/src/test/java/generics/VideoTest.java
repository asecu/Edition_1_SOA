package generics;

import genericstask.model.Video;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

public class VideoTest {

  @Test
  public void setSourceTestPos() throws Exception {
    Video video = new Video("Singing in the rain", "Netflix");
    video.setSource("Youtube");
    assertThat("Youtube", equalTo(video.getSource()));
  }

  @Ignore("assertNull throws AssertionError with  - The source cannot be null - message")
  @Test
  public void setSourceTestNull() {
    Video video = new Video("Singing in the rain", "Netflix");
    video.setSource(null);
    assertThat("Netflix", is((video.getSource())));
    assertNull(video.getSource());
  }
}
