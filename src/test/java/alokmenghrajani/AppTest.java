package alokmenghrajani;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

  @Rule public MockitoRule mockito = MockitoJUnit.rule();

  @Test
  public void myTest() {
    int a = 42;
    assertThat(a);
  }
}
