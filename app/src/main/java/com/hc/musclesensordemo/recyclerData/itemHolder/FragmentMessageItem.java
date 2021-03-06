package com.hc.musclesensordemo.recyclerData.itemHolder;

import com.hc.bluetoothlibrary.DeviceModule;
import com.hc.musclesensordemo.activity.tool.Analysis;

public class FragmentMessageItem {

    private String data;

    private byte[] byteData;

    private boolean isMyData;

    private String time;

    private boolean isShowMe;

    private DeviceModule module;

    private boolean isHex;

    public FragmentMessageItem(String data,String time,boolean isMyData,DeviceModule module,boolean isShowMe){
        this.data = data;
        this.isMyData = isMyData;
        this.module = module;
        this.isShowMe = isShowMe;
        this.time = time;
    }

    public FragmentMessageItem(boolean isHex,byte[] data,String time,boolean isMyData,DeviceModule module,boolean isShowMe){
        this.byteData = data;
        this.isMyData = isMyData;
        this.module = module;
        this.isShowMe = isShowMe;
        this.time = time;
        this.isHex = isHex;
    }

    public DeviceModule getModule() {
        return module;
    }

    public String getData() {
        if (data!= null)
            return data;
        else
            return Analysis.getByteToString(byteData,isHex);
    }

    public byte[] getByteData() {
        return byteData;
    }

    public String getTime() {
        return time;
    }


    public String getSign(){

        if (time != null) {
            return isMyData ? " <- " : " -> ";
        } else {
            if (isShowMe) {
                return isMyData ? " <- " : " -> ";
            } else {
                return "";
            }
        }

    }
}
