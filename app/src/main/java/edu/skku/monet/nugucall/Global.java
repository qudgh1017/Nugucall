package edu.skku.monet.nugucall;

import android.os.Environment;

import java.io.File;

class Global {
    static final String SERVER_ADDRESS = "http://115.145.170.56:8085/";
    static final String SERVER_IP = "115.145.170.56";
    static final int SERVER_UPLOAD_PORT = 8081;
    static final int SERVER_DOWNLOAD_PORT = 8082;
    static final String TAG = "edu.skku.monet.nugucall";

    static final String SHARED_PREFERENCES = "nugucall";
    static final String SHARED_PREFERENCES_WIDTH = "width";
    static final String SHARED_PREFERENCES_HEIGHT = "height";

    static final int NOTIFICATION_ID = 1;
    static final String NOTIFICATION_CHANNEL_ID = "NUGUCALL";
    static final String NOTIFICATION_CHANNEL_NAME = "NUGUCALL";

    static final int REQ_CODE_PERMISSION_PHONE = 1001;
    static final int REQ_CODE_PERMISSION_STORAGE = 1002;
    static final int REQ_CODE_PERMISSION_OVERLAY = 1003;
    static final int REQ_CODE_FILE_SELECT = 2001;
    static final int REQ_CODE_NOTIFICATION_INTENT = 3001;

    static final String DEFAULT_PATH = Environment.getExternalStorageDirectory().getPath() + File.separator + "NuguCall";
}