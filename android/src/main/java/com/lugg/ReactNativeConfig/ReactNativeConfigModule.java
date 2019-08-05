package com.lugg.ReactNativeConfig;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

public class ReactNativeConfigModule extends ReactContextBaseJavaModule {
  Map<String, Object> constants;

  public ReactNativeConfigModule(ReactApplicationContext reactContext, Map<String, Object> constants) {
    super(reactContext);
    this.constants = constants;
  }

  @Override
  public String getName() {
    return "ReactNativeConfig";
  }

  @Override
  public Map<String, Object> getConstants() {
    return this.constants;
  }

  @ReactMethod
  public Map<String, Object> getValues() {
    return this.constants;
  }

}
