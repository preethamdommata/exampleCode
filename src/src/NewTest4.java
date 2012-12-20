package src;

import org.testng.annotations.Factory;

public class NewTest4 {
  @Factory
  public Object[] createInstances() {
  Object[] result = new Object[3];
  for (int i=0;i<3;i++){
	  result[i]=new NewTest(i*2);
  }
  return result;
  }
}
