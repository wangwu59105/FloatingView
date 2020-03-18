package com.release.floatingview;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import android.view.MotionEvent;
import android.widget.ImageView;


public class FloatView extends FloatRootView {

    private ImageView ivCover;

    public FloatView(@NonNull Context context) {
        super(context, null);
        inflate(context, R.layout.view_floating, this);
        ivCover = findViewById(R.id.iv_cover);
    }

    public void setImageDrawable(@DrawableRes int resId) {
        ivCover.setImageDrawable(ContextCompat.getDrawable(getContext(), resId));
    }


    public void check(boolean check){
        ivCover.setEnabled(check);
    }

    public boolean isCheck(){
       return ivCover.isEnabled();
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        if (event != null) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    break;
                case MotionEvent.ACTION_UP:
                    break;
            }
        }
        return true;
    }

}
