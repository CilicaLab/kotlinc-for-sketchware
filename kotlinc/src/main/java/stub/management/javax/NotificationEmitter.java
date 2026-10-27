package stub.management.javax;

public interface NotificationEmitter {
  void addNotificationListener(
      NotificationListener listener, NotificationFilter filter, Object handback);
}
