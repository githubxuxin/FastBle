package com.clj.fastble.callback;


import android.os.Handler;

/**
 * 所有的操作的callback都继承自这个BleBaseCallback抽象类
 * 一个key，标识着这个callback归属于哪一个Characteristic的操作；
 * 另一个handler，用于传递底层发来的操作结果，最终将结果交由callback去抛给调用者，完成一次接口回调。
 */
public abstract class BleBaseCallback {

    private String key;
    private Handler handler;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
