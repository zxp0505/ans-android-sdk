package com.analysys.database;

import android.content.Context;
import android.net.Uri;

/**
 * @Copyright © 2019 EGuan Inc. All rights reserved.
 * @Description:
 * @Version: 1.0
 * @Create: 2019/11/25 17:31
 * @Author: WP
 */
public class EventTableMetaData {

    //表名
    public static final String TABLE_FZ = DBConfig.TableAllInfo.TABLE_NAME;
    public static final String TABLE_SP = "sp";
    public static final String TABLE_RAM = "RAM";


    public static final int TABLE_FZ_DIR = 0;
    public static final int TABLE_SP_DIR = 1;
    public static final int TABLE_RAM_DIR = 2;

    //该ContentProvider所返回的数据类型的定义
    public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.analysys.e_fz";
    public static final String CONTENT_TYPE_ITEM = "vnd.android.cursor.item/vnd.analysys.sp";
    public static final String CONTENT_TYPE_RAM = "vnd.android.cursor.item/vnd.analysys.ram";

    public static Uri getTableFZ(Context context){
        Uri uri = Uri.parse("content://" + context.getPackageName() + ".AnsContentProvider" + "/" + EventTableMetaData.TABLE_FZ);
        return uri;
    }

    public static Uri getTABLE_SP(Context context) {
        Uri uri = Uri.parse("content://" + context.getPackageName() + ".AnsContentProvider" + "/" + EventTableMetaData.TABLE_SP);
        return uri;
    }
    public static Uri getTABLE_RAM(Context context) {
        Uri uri = Uri.parse("content://" + context.getPackageName() + ".AnsContentProvider" + "/" + EventTableMetaData.TABLE_RAM);
        return uri;
    }
}
