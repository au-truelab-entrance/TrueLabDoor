package com.example.truelabdoor;

import com.hoho.android.usbserial.driver.ProbeTable;
import com.hoho.android.usbserial.driver.ProlificSerialDriver;
import com.hoho.android.usbserial.driver.UsbSerialProber;

/**
 * add devices here, that are not known to DefaultProber
 *
 * if the App should auto start for these devices, also
 * add IDs to app/src/main/res/xml/usb_device_filter.xml
 */
class CustomProber {

    static UsbSerialProber getCustomProber() {
        ProbeTable customTable = new ProbeTable();
        customTable.addProduct(0x0557,0x2008, ProlificSerialDriver.class);
//        customTable.addProduct(0x1234, 0xabcd, FtdiSerialDriver.class); // e.g. device with custom VID+PID
        return new UsbSerialProber(customTable);
    }

}
