package com.example.mad_practical_10_21012011093

import android.security.identity.AccessControlProfileId
import java.io.Serializable
import java.net.Inet4Address

class Person(var id: String,
             var name: String,
             var emailid: String,
             var phoneNo: String,
             var address: String,
             var latitude: Double,
             var longitude: Double):Serializable {
}