package org.techtown.recyclerview2;

import android.view.View;

public interface OnPersonItemClickListener {
    public void onItemCLick(PersonAdapter.ViewHolder holder, View view, int position);
}
