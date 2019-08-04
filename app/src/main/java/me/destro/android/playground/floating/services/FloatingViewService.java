package me.destro.android.playground.floating.services;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.IBinder;
import android.view.*;
import kotlin.Unit;
import me.destro.playground.android.R;


public class FloatingViewService extends Service {
   private WindowManager mWindowManager;
   private View mFloatingView;
 
   public FloatingViewService() {
   }
 
   @Override
   public IBinder onBind(Intent intent) {
       return null;
   }
 
   @Override
   public void onCreate() {
       super.onCreate();

       ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.AppTheme);

       //Inflate the floating view layout we created
       mFloatingView = LayoutInflater.from(contextThemeWrapper).inflate(R.layout.floating_widget, null);

       int flag;
       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
           flag = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
       } else {
           flag = WindowManager.LayoutParams.TYPE_PHONE;
       }

       //Add the view to the window.
       final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
               WindowManager.LayoutParams.WRAP_CONTENT,
               WindowManager.LayoutParams.WRAP_CONTENT,
               flag,
               WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
               PixelFormat.TRANSLUCENT);
 
       //Specify the view position
       params.gravity = Gravity.TOP | Gravity.LEFT;        //Initially view will be added to top-left corner
       params.x = 0;
       params.y = 100;
 
       //Add the view to the window
       mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
       mWindowManager.addView(mFloatingView, params);

       //….
       //….
   }
 
 
   @Override
   public void onDestroy() {
       super.onDestroy();
       if (mFloatingView != null) mWindowManager.removeView(mFloatingView);
   }
}