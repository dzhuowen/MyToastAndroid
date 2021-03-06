package com.customReactPackage;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import android.app.Activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomReactPackage implements ReactPackage {

  private Activity mActivity = null;

  public CustomReactPackage(Activity activity) {
      mActivity = activity;
  }

  @Override
  public List<NativeModule> createNativeModules(
    ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();

      modules.add(new MyToastModule(reactContext));

      return modules;

  }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}