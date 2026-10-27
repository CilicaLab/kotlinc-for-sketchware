package stub.management;

public interface ThreadMXBean {
  ThreadInfo[] dumpAllThreads(boolean lockedMonitors, boolean lockedSynchronizers);

  long[] getAllThreadIds();

  ThreadInfo[] getThreadInfo(long[] ids, int maxDepth);

  long getCurrentThreadCpuTime();

  long getCurrentThreadUserTime();

  void setThreadCpuTimeEnabled(boolean enable);
}
