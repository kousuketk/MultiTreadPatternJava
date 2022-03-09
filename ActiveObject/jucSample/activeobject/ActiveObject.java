package activeobject;

import java.util.concurrent.Future;

public interface ActiveObject {
  public abstract Future<String> makeString(int count, char fillcahr);
  public abstract void displayString(String string);
  public abstract void shutdown();
}