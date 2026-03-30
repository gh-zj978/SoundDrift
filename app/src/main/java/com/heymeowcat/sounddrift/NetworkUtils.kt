package com.heymeowcat.sounddrift

import java.net.InetAddress
import java.net.NetworkInterface
import java.util.Collections

object NetworkUtils {
    fun getIPAddress(useIPv4: Boolean): String {
        return if (useIPv4) "127.0.0.1" else "::1"
    }
}
