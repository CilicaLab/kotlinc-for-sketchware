package stub.management;

public class ThreadInfo {
  public String getThreadName() {
    return "";
  }

  public StackTraceElement[] getStackTrace() {
    return new StackTraceElement[0];
  }

  public Thread.State getThreadState() {
    return Thread.State.RUNNABLE;
  }

  public String getLockName() {
    return null;
  }

  public String getLockOwnerName() {
    return null;
  }

  public long getLockOwnerId() {
    return -1L;
  }

  public boolean isSuspended() {
    return false;
  }

  public boolean isInNative() {
    return false;
  }
}
