package stub.management;

import java.util.Collections;
import java.util.List;

public final class ManagementFactory {
  private static final ThreadMXBean THREAD_MX_BEAN = new ThreadMXBeanImpl();
  private static final MemoryMXBean MEMORY_MX_BEAN = new MemoryMXBeanImpl();

  private ManagementFactory() {}

  public static ThreadMXBean getThreadMXBean() {
    return THREAD_MX_BEAN;
  }

  public static List<MemoryPoolMXBean> getMemoryPoolMXBeans() {
    return Collections.emptyList();
  }

  public static MemoryMXBean getMemoryMXBean() {
    return MEMORY_MX_BEAN;
  }

  public static List<GarbageCollectorMXBean> getGarbageCollectorMXBeans() {
    return Collections.emptyList();
  }

  public static CompilationMXBean getCompilationMXBean() {
    return null;
  }

  private static class ThreadMXBeanImpl implements ThreadMXBean {
    @Override
    public ThreadInfo[] dumpAllThreads(boolean lockedMonitors, boolean lockedSynchronizers) {
      return new ThreadInfo[0];
    }

    @Override
    public long[] getAllThreadIds() {
      return new long[0];
    }

    @Override
    public ThreadInfo[] getThreadInfo(long[] ids, int maxDepth) {
      return new ThreadInfo[0];
    }

    @Override
    public long getCurrentThreadCpuTime() {
      return 0L;
    }

    @Override
    public long getCurrentThreadUserTime() {
      return 0L;
    }

    @Override
    public void setThreadCpuTimeEnabled(boolean enable) {}
  }

  private static class MemoryMXBeanImpl implements MemoryMXBean {}
}
