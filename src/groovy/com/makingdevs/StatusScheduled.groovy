package com.makingdevs

enum StatusScheduled {

  REGISTERED("Registered"),
  PROCESSED("Processed"),
  CANCELLED("Cancelled")

  final String value

  StatusScheduled(String value){ this.value = value }

  String toString(){ value }
  String getKey(){ name() }


}
