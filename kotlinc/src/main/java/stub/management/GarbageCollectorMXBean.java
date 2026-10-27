package stub.management;

public interface GarbageCollectorMXBean {
  String getName();

  long getCollectionTime();

  long getCollectionCount();
}
