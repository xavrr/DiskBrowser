package com.bytezone.diskbrowser.applefile;

public class SegmentDictionary
{
  private final boolean isValid;

  public SegmentDictionary (String name, byte[] buffer)
  {
    isValid = !name.equals ("SYSTEM.INTERP");       // temporary
  }

  public boolean isValid ()
  {
    return isValid;
  }
}