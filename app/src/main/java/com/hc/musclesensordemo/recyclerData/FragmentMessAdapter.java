package com.hc.musclesensordemo.recyclerData;

import android.content.Context;
import android.graphics.Color;

import com.hc.basiclibrary.recyclerAdapterBasic.ItemClickListener;
import com.hc.basiclibrary.recyclerAdapterBasic.RecyclerCommonAdapter;
import com.hc.basiclibrary.recyclerAdapterBasic.ViewHolder;
import com.hc.musclesensordemo.R;
import com.hc.musclesensordemo.recyclerData.itemHolder.FragmentMessageItem;

import java.util.List;

public class FragmentMessAdapter extends RecyclerCommonAdapter<FragmentMessageItem> {

    public FragmentMessAdapter(Context context, List<FragmentMessageItem> fragmentMessageItems, int layoutId) {
        super(context, fragmentMessageItems, layoutId);
    }

    @Override
    protected void convert(ViewHolder holder, FragmentMessageItem item, int position, ItemClickListener itemClickListener) {
        holder.setText(R.id.item_message_fragment_data,item.getData())
                .setTextAndColor(R.id.item_message_fragment_sign,item.getSign(),item.getSign().equals(" <- ")? Color.parseColor("#79D0A5"):Color.parseColor("#FF7C10"))
                .setText(R.id.item_message_fragment_time,item.getTime());
    }
}
