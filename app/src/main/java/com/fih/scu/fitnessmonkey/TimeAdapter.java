package com.fih.scu.fitnessmonkey;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by vidur on 12/9/2017.
 */

public class TimeAdapter extends BaseAdapter {

    private Context mContext;
    private String[] timeDurations = new String[]{
            "Years", "Months", "Days", "Hours"
    };

    public TimeAdapter(Context c) {
        this.mContext = c;
    }

    @Override
    public int getCount() {
        return timeDurations.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        textView = new TextView(mContext);
        textView.setText(timeDurations[position]);
        textView.setTextSize(40);
        return textView;
    }

}
