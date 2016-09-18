package com.example.uworks.focusjump;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by UWorks on 2016/9/18.
 */
public class MyListView extends ListView {
    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expand = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expand);
    }
}
