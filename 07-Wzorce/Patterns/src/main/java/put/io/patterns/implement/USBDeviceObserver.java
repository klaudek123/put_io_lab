package put.io.patterns.implement;

public class USBDeviceObserver implements SystemStateObserver {
    private int lastUSBDevicesCount;

    @Override
    public void update(SystemMonitor monitor) {
        int currentUSBDevicesCount = monitor.getLastSystemState().getUsbDevices();

        if (lastUSBDevicesCount != 0 && currentUSBDevicesCount != lastUSBDevicesCount) {
            System.out.println("USB devices count changed!");
        }

        lastUSBDevicesCount = currentUSBDevicesCount;
    }
}
