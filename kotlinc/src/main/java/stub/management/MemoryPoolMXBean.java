package stub.management;

public interface MemoryPoolMXBean {
  MemoryType getType();

  boolean isCollectionUsageThresholdSupported();

  boolean isUsageThresholdSupported();

  MemoryUsage getUsage();

  void setUsageThreshold(long threshold);

  void setCollectionUsageThreshold(long threshold);
}
